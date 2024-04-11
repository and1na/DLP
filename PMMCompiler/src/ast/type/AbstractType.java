package ast.type;

import ast.node.ASTNode;
import ast.node.AbstractASTNode;
import java.util.List;


      /*
         WARNING:

         I need the param and the "return other" in several methods because if I remove them,
         I might return directly an ErrorType, causing errors like:

         [11, 3] Type Comparison operation not allowed between types
         Int and Struct is not a built-in type

         This error trace is a combination between the error message of a previous error
         and the error message of the current error.

        */

public abstract class AbstractType extends AbstractASTNode implements Type{

    public AbstractType(int line, int column) {
        super(line, column);
    }

    /**
     * Method used to check if function call parameters are valid
     * @param otherList List of types of the parameters
     * @param ast ASTNode
     * @return Type
     */
    @Override
    public Type parenthesis(List<Type> otherList, ASTNode ast) {
        for (Type other : otherList) {
            if (other instanceof ErrorType) return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "Wrong parameters in function call");
    }
    /**
     * This method is used to check if a cast to "other" is possible for the type "this"
     * @param other Type to cast to
     * @param ast ASTNode
     * @return  Type
     */
    @Override
    public Type canBeCasted(Type other, ASTNode ast) {
        if (other instanceof ErrorType) return other;

        return new ErrorType(ast.getLine(), ast.getColumn(),
                "Cannot cast " + this + " to " + other);
    }
    /**
     * This method is used to check if "this" is a built-in type
     * @param other Type
     * @param ast ASTNode
     * @return Type
     */
    @Override
    public Type asBuiltInType(Type other, ASTNode ast) {

        if (other instanceof ErrorType) return other;

        return new ErrorType(ast.getLine(), ast.getColumn(), "Type " + this + " is not a built-in type");
    }
    /**
     * This method is used to check if a type can be promoted to another type (returned type
     * from a function)
     * @param other Type to promote to
     * @param ast ASTNode
     * @return Type
     */
    @Override
    public Type mustPromoteTo(Type other, ASTNode ast) {
        if (other instanceof ErrorType) return other;

        //This would be executed if super class is called or if returned type is
        //a type which doesn't override this method (non-built-in)
        return new ErrorType(ast.getLine(), ast.getColumn(),
                "Cannot promote " + this + " to " + other);
    }
    /**
     * This method is used to check if a two operand logical operation is valid
     * @param other Type
     * @param ast ASTNode
     * @return Type
     */
    @Override
    public Type logical(Type other, ASTNode ast) {
        if (other instanceof ErrorType) return other;

        return new ErrorType(ast.getLine(), ast.getColumn(),
                "Logical operation not allowed between types "
                + other + " and " + this);
    }
    /**
     * This method is used to check if a unary logical operation is valid
     * (also valid for already checked logical expressions as they are already reduced to a single type)
     * @param ast ASTNode
     * @return Type
     */
    @Override
    public Type logical(ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(),
                "A logical is expected but a " + this + " was found.");
    }
    /**
     * This method is used to check if an array access is possible for the type
     * @param other Type
     * @param ast ASTNode
     * @return Type
     */
    @Override
    public Type squareBrackets(Type other, ASTNode ast) {
        if (other instanceof ErrorType) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(),
                "Type " + this + " does not support indexing");
    }
    /**
     * This method is used to check if a field access is possible for the type
     * @param id String
     * @param ast ASTNode
     * @return  Type
     */
    @Override
    public Type dot(String id, ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(),
                "Type " + this + " does not support field access");
    }
    /**
     * This method is used to check if a unary arithmetic operation is valid
     * @param ast ASTNode
     * @return Type
     */
    @Override
    public Type arithmetic(ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(),
                "A number is expected but a " + this + " was found.");
    }
    /**
     * This method is used to check if a two operand arithmetic operation is valid
     * @param other Type
     * @param  ast ASTNode
     * @return Type
     */
    @Override
    public Type arithmetic(Type other, ASTNode ast) {
        if (other instanceof ErrorType) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(), "Arithmetic operation not allowed between types "
                + other + " and " + this);
    }
    /**
     * This method is used to check if a two operand comparison operation is valid
     * @param other Type
     * @param ast ASTNode
     * @return Type
     */
    @Override
    public Type comparison(Type other, ASTNode ast) {
        if (other instanceof ErrorType) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(), "Comparison operation not allowed between types "
                + other + " and " + this);
    }
    /**
     * This util method is used to check if a type is logical
     * @return boolean
     */
    @Override
    public boolean isLogical() {
        return false;
    }
    /**
     * This util method is used to check if a type is built-in
     * @return boolean
     */
    @Override
    public boolean isBuiltInType() {
        return false;
    }

    /**
     * This util method is used to get the number of bytes of a type
     * @return int
     */
    public int numberOfBytes() {
        throw new IllegalStateException("This method should not be called");
    }
}
