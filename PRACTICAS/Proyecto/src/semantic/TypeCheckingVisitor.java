package semantic;


import ast.expression.*;
import ast.statement.Assignment;
import ast.statement.Input;
import ast.type.ErrorType;
import visitor.AbstractVisitor;


//In this visitor, we give value to expressions attribute lvalue at the same time we keep traversing the AST
//Here we have to implement just the expressions visitors (just expressions have LValues)
public class TypeCheckingVisitor extends AbstractVisitor<Void,Void> {

    @Override
    public Void visit(ArithmeticComparison node, Void param) {
        node.getLeftExpression().accept(this, param);
        node.getRightExpression().accept(this, param);
        node.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Arithmetic node, Void param) {
        node.getLeftExpression().accept(this, param);
        node.getRightExpression().accept(this, param);
        node.setLvalue(false);
        return null;
        //I could return param but it's nonsense, better if I return null when I don't need anything
        //In case I'd need sth I could return it here and would be received in the node's accept method.
    }

    @Override
    public Void visit(Logical node, Void param) {
        node.getLeftExpression().accept(this, param);
        node.getRightExpression().accept(this, param);
        node.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Negation node, Void param) {
        node.getExpression().accept(this, param);
        node.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(ArrayAccess node, Void param) {
        node.getExpressionToAccess().accept(this, param);
        node.getIndex().accept(this, param);
        node.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(Cast node, Void param) {
        node.getToType().accept(this,param);
        node.getExpressionToCast().accept(this,param);
        node.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(CharLiteral node, Void param) {
        node.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(FloatLiteral node, Void param) {
        node.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(IntLiteral node, Void param) {
        node.setLvalue(false);
        return null;
    }


    @Override
    public Void visit(FunctionInvocation node, Void param) {
        node.getFunctionVariable().accept(this,param);
        node.getParameters().forEach(expression -> expression.accept(this,param));
        node.setLvalue(false);
        return null;
    }


    @Override
    public Void visit(StructAccess node, Void param) {
        node.getExpressionToAccess().accept(this,param);
        node.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(UnaryMinus node, Void param) {
        node.getExpression().accept(this,param);
        node.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Variable node, Void param) {
        node.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(Assignment node, Void param) {
        //It´s mandatory to visit first both parts of the assignment, otherwise, we won´t know if
        //they are Lvalues or not
        node.getVar().accept(this,param);
        node.getValue().accept(this,param);
        if(!node.getVar().getLvalue()){
            new ErrorType(node.getLine(),node.getColumn(),
                    "Lvalue expected at the left of assignment");
        }
        return null;
    }

    @Override
    public Void visit(Input node, Void param) {
        node.getInputExpression().accept(this,param);
        if(!node.getInputExpression().getLvalue()){
            new ErrorType(node.getLine(),node.getColumn(),
                    "Lvalue expected at input statement");
        }
        return null;
    }
}