package codegenerator;

import ast.definition.FunctionDefinition;
import ast.expression.*;
import ast.type.IntType;

//This visitor is in charge of generating the code for getting the value of R-Values (expressions)

public class ValueCGVisitor extends AbstractCGVisitor<FunctionDefinition,Void> {

    private AddressCGVisitor addressVisitor;

    public ValueCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    public void setAddressVisitor(AddressCGVisitor addressVisitor) {
        this.addressVisitor = addressVisitor;
    }

    public Void visit(Arithmetic node, FunctionDefinition param) {

        //We need to convert the operands to the same type of the result expression
        //because if we have an operation between an int and a char, the sum at low level is between two integers

//        value[[Arithmetic: exp1 --> exp2 operator exp3]]() =
//            value[[exp2]]()
//            cg.convert(expression2.type, expression1.type)
//            value[[expr3]]()
//            cg.convertTo(expression3.type, expression1.type)
//            cg.arithmetic(expression1.type, operator)

        node.getLeftExpression().accept(this, param);
        cg.convert(node.getType(),node.getLeftExpression().getType());
        node.getRightExpression().accept(this, param);
        cg.convert(node.getType(),node.getRightExpression().getType());
        //Perform the operation
        cg.arithmetic(node.getType(), node.getOperator());
        return null;
    }

    public Void visit(ArithmeticComparison node, FunctionDefinition param) {
//        value[[Comparison: exp1 --> exp2 operator exp3]]() =
//            value[[exp2]]()
//            cg.convertTo(exp.type, exp1.type)
//            value[[exp3]]()
//            cg.convertTo(exp3.type, exp1.type)
//            cg.comparison( exp1.type, operator)

        node.getLeftExpression().accept(this, param);
        cg.convert(node.getType(),node.getLeftExpression().getType());
        node.getRightExpression().accept(this, param);
        cg.convert(node.getType(),node.getRightExpression().getType());
        //Perform the operation
        cg.comparison(node.getType(), node.getOperator());
        return null;
    }

    public Void visit(Cast node, FunctionDefinition param) {

//        value[[Cast: exp1--> type exp2]]() =
//            value[[exp2]]
//            cg.convertTo(exp2.type, type);

        node.getExpressionToCast().accept(this, param);
        cg.convert(node.getExpressionToCast().getType(),node.getType());
        return null;
    }

    public Void visit(CharLiteral node, FunctionDefinition param) {

//        value[[CharLiteral: expression --> CHARACTER]]() =
//            <pushb> char

        cg.push(node.getType(), node.getValue());
        return null;
    }

    public Void visit(FloatLiteral node, FunctionDefinition param) {

//        value[[FloatLiteral: expression --> FLOAT]]() =
//            <pushf> FLOAT

        cg.push(node.getType(),node.getValue());
        return null;
    }

    public Void visit(IntLiteral node, FunctionDefinition param) {

//        value[[IntLiteral: expression --> INT]]() =
//            <pushi> INT

        cg.push(node.getType(),node.getValue());
        return null;
    }


    public Void visit(Logical node, FunctionDefinition param) {

//        value[[Logical: expression1 --> exp2 operator exp3]]() =
//            value[[exp2]]()
//            value[[exp3]]()
//            cg.logical(operator)

        node.getLeftExpression().accept(this, param);
        node.getRightExpression().accept(this, param);
        //Perform the operation
        cg.logical(node.getOperator());
        return null;
    }

    public Void visit(Negation node, FunctionDefinition param) {

//        value[[Negation: exp1 --> exp2]]() =
//            value[[exp2]]()
//            cg.logical(operator)


        node.getExpression().accept(this, param);
        cg.logical("!");
        return null;
    }

    public Void visit(UnaryMinus node, FunctionDefinition param) {

//        value[[UnaryMinus: exp1 --> exp2]]() =
//            value[[exp2]]()
//            cg.convertTo(exp2.type, exp1.type)
//            <pushi> -1
//            cg.convertTo(new IntType(0,0), expression1.type)
//            <mul> expression1.type.suffix()


        IntType type = new IntType(0,0);
        node.getExpression().accept(this, param); // Push the value of the expression
        cg.convert(node.getType(), node.getExpression().getType());
        cg.push(type,-1); // Push -1
        cg.convert(type, node.getType()); // Convert -1 to the type of the expression
        cg.arithmetic(node.getType(), "*"); // Multiply the value of the expression by -1
        return null;
    }

    public Void visit(Variable node, FunctionDefinition param) {

//        value[[Variable: exp --> ID]]() =
//            address[[ID]]()
//            <load> exp.type.suffix()

        node.accept(addressVisitor, param);
        cg.load(node.getType());
        return null;
    }


    public Void visit(ArrayAccess node, FunctionDefinition param) {

        /*
         * value[ ArrayAccess: exp1 --> exp2 exp3]():
         *      address[[exp1]]
         *      load exp1.type.suffix()
         */

        node.accept(addressVisitor, param);
        cg.load(node.getType());
        return null;
    }

    public Void visit( StructAccess node, FunctionDefinition param) {
        /*
            value [[ FieldAccess: exp1 --> exp2 id]]:
                address[[exp1]]
                pushi exp2.type.getOffset(id)
                addi
                load id.type.suffix()
         */

        node.accept(addressVisitor, param);
        cg.load(node.getType());
        return null;
    }


    @Override
    public Void visit(FunctionInvocation ast, FunctionDefinition p) {

//        value[[FunctionInvocation: exp1 --> exp2 exp3*]]() =
//            for (int i = 0; i < ast.getParameters().size(); i++) {
//                ast.getParameters().get(i).accept(this, p);
//             }
//            <call> exp2.name



        for (int i = 0; i < ast.getParameters().size(); i++) {
            //stack the value of the passed parameters
            ast.getParameters().get(i).accept(this, p);
        }
        cg.call(ast.getFunctionVariable().getName());
        return null;
    }

}
