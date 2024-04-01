package visitor;

import ast.Program;
import ast.definition.Definition;
import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import ast.type.struct.Struct;
import ast.type.struct.StructField;

// This visitor simply traverses the tree. It's useful for visitors where,
// depending on the node, we may only need to continue traversing.
public abstract class AbstractVisitor<TP,TR> implements Visitor<TP,TR> {

    @Override
    public TR visit(Program node, TP param) {
        for (Definition def : node.getDefinitions()){
            def.accept(this,param);
        }
        return null;
    }

    @Override
    public TR visit(FunctionInvocation node, TP param) {
        node.getFunctionVariable().accept(this,param);
        node.getParameters().forEach(expression -> expression.accept(this,param));
        return null;
    }

    @Override
    public TR visit(ArithmeticComparison node, TP param) {
        node.getLeftExpression().accept(this,param);
        node.getRightExpression().accept(this,param);
        return null;
    }
    @Override
    public TR visit(StructField node, TP param) {
        node.getOf().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Arithmetic node, TP param) {
        node.getLeftExpression().accept(this,param);
        node.getRightExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(ArrayAccess node, TP param) {
        node.getExpressionToAccess().accept(this,param);
        node.getIndex().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Cast node, TP param) {
        node.getToType().accept(this,param);
        node.getExpressionToCast().accept(this,param);
        return null;
    }

    @Override
    public TR visit(CharLiteral node, TP param) {
        return null;
    }

    @Override
    public TR visit(FloatLiteral node, TP param) {
        return null;
    }

    @Override
    public TR visit(IntLiteral node, TP param) {
        return null;
    }

    @Override
    public TR visit(Logical node, TP param) {
        node.getLeftExpression().accept(this,param);
        node.getRightExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Negation node, TP param) {
        node.getExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(StructAccess node, TP param) {
        node.getExpressionToAccess().accept(this,param);
        return null;
    }

    @Override
    public TR visit(UnaryMinus node, TP param) {
        node.getExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Variable node, TP param) {
        //PORQUE NO IMPLEMENTAR AQUI EL RECORRIDO A DEFINITION??
        return null;
    }

    @Override
    public TR visit(FunctionDefinition node, TP param) {
        node.getType().accept(this,param);
        node.getBodyVarDefinitions().forEach( vDef -> vDef.accept(this,param));
        node.getStatements().forEach(statement -> statement.accept(this,param));
        return null;
    }

    @Override
    public TR visit(VarDefinition node, TP param) {
        node.getType().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Array node, TP param) {
        node.getOf().accept(this,param);
        return null;
    }

    @Override
    public TR visit(CharType node, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleType node, TP param) {
        return null;
    }

    @Override
    public TR visit(ErrorType node, TP param) {
        return null;
    }

    @Override
    public TR visit(Function node, TP param) {
        node.getReturnType().accept(this,param);
        node.getParameters().forEach(vDef -> vDef.accept(this, param));
        return null;
    }

    @Override
    public TR visit(IntType node, TP param) {
        return null;
    }

    @Override
    public TR visit(VoidType node, TP param) {
        return null;
    }

    @Override
    public TR visit(Struct node, TP param) {
        for(StructField sf : node.getFields()){
            sf.accept(this,param);
        }
        return null;
    }

    @Override
    public TR visit(Assignment node, TP param) {
        node.getValue().accept(this,param);
        node.getVar().accept(this,param);
        return null;
    }

    @Override
    public TR visit(If_Else node, TP param) {
        node.getConditionalExp().accept(this,param);
        node.getIfBody().forEach(statement -> statement.accept(this,param));
        node.getElseBody().forEach(statement -> statement.accept(this,param));
        return null;
    }

    @Override
    public TR visit(Input node, TP param) {
        node.getInputExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Print node, TP param) {
        node.getExpressionToPrint().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Return node, TP param) {
        node.getReturnedExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(While node, TP param) {
        node.getConditionalExp().accept(this,param);
        node.getWhileBody().forEach(statement -> statement.accept(this,param));
        return null;
    }
}
