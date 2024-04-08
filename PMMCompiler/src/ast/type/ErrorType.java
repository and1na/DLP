package ast.type;

import ast.node.ASTNode;
import errorhandler.ErrorHandler;
import visitor.Visitor;

import java.util.List;

public class ErrorType extends AbstractType {

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public String toString(){
        return message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }


    @Override
    public Type parenthesis(List<Type> otherList, ASTNode ast) {
        return this;
    }

    @Override
    public Type canBeCasted(Type other, ASTNode ast) {
        return this;
    }

    @Override
    public Type asBuiltInType(Type other, ASTNode ast) {
        return this;
    }

    @Override
    public Type mustPromoteTo(Type other, ASTNode ast) {
        return this;
    }

    @Override
    public Type logical(Type other, ASTNode ast) {
        return this;
    }

    @Override
    public Type logical(ASTNode ast) {
        return this;
    }

    @Override
    public Type squareBrackets(Type other, ASTNode ast) {
        return this;
    }

    @Override
    public Type dot(String id, ASTNode ast) {
        return this;
    }

    @Override
    public Type arithmetic(ASTNode ast) {
        return this;
    }

    @Override
    public Type arithmetic(Type other, ASTNode ast) {
        return this;

    }

    @Override
    public Type comparison(Type other, ASTNode ast) {
        return this;

    }


}
