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

        node.getLeftExpression().accept(this, param);
        cg.convert(node.getType(),node.getLeftExpression().getType());
        node.getRightExpression().accept(this, param);
        cg.convert(node.getType(),node.getRightExpression().getType());
        //Perform the operation
        cg.arithmetic(node.getType(), node.getOperator());
        return null;
    }

    public Void visit(ArithmeticComparison node, FunctionDefinition param) {

        node.getLeftExpression().accept(this, param);
        cg.convert(node.getType(),node.getLeftExpression().getType());
        node.getRightExpression().accept(this, param);
        cg.convert(node.getType(),node.getRightExpression().getType());
        //Perform the operation
        cg.comparison(node.getType(), node.getOperator());
        return null;
    }

    public Void visit(Cast node, FunctionDefinition param) {
        node.getExpressionToCast().accept(this, param);
        cg.convert(node.getType(),node.getExpressionToCast().getType());
        return null;
    }

    public Void visit(CharLiteral node, FunctionDefinition param) {
        cg.push(node.getType(), node.getValue());
        return null;
    }

    public Void visit(FloatLiteral node, FunctionDefinition param) {
        cg.push(node.getType(),node.getValue());
        return null;
    }

    public Void visit(IntLiteral node, FunctionDefinition param) {
        cg.push(node.getType(),node.getValue());
        return null;
    }


    public Void visit(Logical node, FunctionDefinition param) {
        node.getLeftExpression().accept(this, param);
        node.getRightExpression().accept(this, param);
        //Perform the operation
        cg.logical(node.getOperator());
        return null;
    }

    public Void visit(Negation node, FunctionDefinition param) {
        node.getExpression().accept(this, param);
        cg.logical("!");
        return null;
    }

    public Void visit(UnaryMinus node, FunctionDefinition param) {
        IntType type = new IntType(0,0);
        node.getExpression().accept(this, param); // Push the value of the expression
        cg.convert(node.getType(), node.getExpression().getType());
        cg.push(type,-1); // Push -1
        cg.convert(type, node.getType()); // Convert -1 to the type of the expression
        cg.arithmetic(node.getType(), "*"); // Multiply the value of the expression by -1
        return null;
    }

    public Void visit(Variable node, FunctionDefinition param) {
        node.accept(addressVisitor, param);
        cg.load(node.getType());
        return null;
    }


    public Void visit(ArrayAccess node, FunctionDefinition param) {

        /*
         * value[ ArrayAccess: exp1 -> exp2 exp3]():
         *      address[[exp1]]
         *      load exp1.type.suffix()
         */

        node.accept(addressVisitor, param);
        cg.load(node.getType());
        return null;
    }

    public Void visit( StructAccess node, FunctionDefinition param) {


        /*

            value [[ FieldAccess: exp1 -> exp2 id]]:
                address[[exp1]]
                pushi exp2.type.getOffset(id)
                addi
                load id.type.suffix()


         */

        node.accept(addressVisitor, param);
        cg.load(node.getType());
        return null;
    }




}
