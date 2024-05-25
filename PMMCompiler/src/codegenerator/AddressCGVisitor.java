package codegenerator;

import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.expression.ArrayAccess;
import ast.expression.StructAccess;
import ast.expression.Variable;
import ast.type.IntType;
import ast.type.struct.Struct;
import ast.type.struct.StructField;

//This visitor is in charge of generating the code for getting the address of L-Values

public class AddressCGVisitor extends AbstractCGVisitor<FunctionDefinition,Void>{


    private ValueCGVisitor valueVisitor;

    public AddressCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    public void setValueVisitor(ValueCGVisitor valueVisitor) {
        this.valueVisitor = valueVisitor;
    }

    public Void visit(Variable node, FunctionDefinition param) {

//        address[[Variable: exp --> ID]]() =
//            if (exp.definition.scope==0) {
//                <pusha> exp.definition.offset
//            } else {
//                <push bp>
//                <pushi> expression.definition.offset
//                <addi>
//            }

        if(node.getDefinition().getScope() == 0) {
            cg.pushA(((VarDefinition) node.getDefinition()).getOffset());
        }else{
            cg.pushBP();
            cg.push(new IntType(0,0),((VarDefinition) node.getDefinition()).getOffset());
            cg.arithmetic(new IntType(0,0), "+");
        }
        return null;
    }



    @Override
    public Void visit(ArrayAccess node, FunctionDefinition param) {

        /*
         * address[ ArrayAccess: exp1 --> exp2 exp3]():
         *      address[[exp2]]
         *      value[[exp3]]
         *      pushi exp1.type.numberOfBytes()
         *      muli
         *      addi
         */
        node.getExpressionToAccess().accept(this, param);
        node.getIndex().accept(valueVisitor, param);
        cg.push(new IntType(0,0), node.getType().numberOfBytes());
        cg.arithmetic(new IntType(0,0), "*");
        cg.arithmetic(new IntType(0,0), "+");
        return null;
    }

    public Void visit(StructAccess node, FunctionDefinition param) {

//        address[[StructAccess: exp1 ---> exp2 ID]]() =
//            address[[expression2]]
//            <pushi> expression2.type.getField(expression1.getName()).getOffset()
//            <addi>


        node.getExpressionToAccess().accept(this, param); //struct address
        //accessed field
        StructField field = ((Struct) node.getExpressionToAccess().getType()).getField(node.getStructField());
        cg.push(new IntType(0,0), field.getOffset()); //structfield offset
        cg.arithmetic(new IntType(0,0), "+");
        return null;
    }
}
