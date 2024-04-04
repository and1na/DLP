package ast.type;

import ast.node.ASTNode;
import ast.node.AbstractASTNode;
import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type{
    public AbstractType(int line, int column) {
        super(line, column);
    }

    public Type parenthesis(List<Type> otherList, ASTNode ast) {
        for (Type other : otherList) {
            if (other instanceof ErrorType) return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "Wrong parameters in function call");
    }

    public Type canBeCasted(Type other, ASTNode ast) {
        if (other instanceof ErrorType) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(),
                "Cannot cast " + this + " to " + other);
    }

    //TODO: Check if this is correct (PARAM TYPE)
    public Type asBuiltInType(Type other, ASTNode ast) {
        if (other instanceof ErrorType) return other;

        return new ErrorType(ast.getLine(), ast.getColumn(), "Type " + other + " is not a built-in type");
    }

    public Type mustPromoteTo(Type other, ASTNode ast) {
        if (other instanceof ErrorType) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(),
                "Cannot promote " + this + " to " + other);
    }

    public Type asLogical(Type other, ASTNode ast) {
        if (other instanceof ErrorType) {
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "A logical type was expected, but received " + this);
    }

    public Type logical(ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(), "A logical is expected but a " + this +
                " was found.");
    }

    public Type logical(Type other, ASTNode ast) {
        if (other instanceof ErrorType) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(), "Logical operation not allowed between types "
                + other + " and " + this);
    }

    public Type squareBrackets(Type other, ASTNode ast) {
        if (other instanceof ErrorType) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(), "Type " + this + " does not support indexing with" +
                "type " + other);
    }


    public Type dot(String id, ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(), "Type " + this + " does not support field access");
    }

    public Type arithmetic(ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(), "A number is expected but a " + this +
                " was found.");
    }

    public Type arithmetic(Type other, ASTNode ast) {
        if (other instanceof ErrorType) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(), "Arithmetic operation not allowed between types "
                + other + " and " + this);
    }

    public Type comparison(Type other, ASTNode ast) {
        if (other instanceof ErrorType) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(), "Comparison operation not allowed between types "
                + other + " and " + this);
    }




    @Override
    public boolean isLogical() {
        return false;
    }
    @Override
    public boolean isBuiltInType() {
        return false;
    }
}
