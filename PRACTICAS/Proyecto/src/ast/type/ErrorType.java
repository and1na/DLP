package ast.type;

import ast.node.ASTNode;
import ast.node.AbstractASTNode;
import errorhandler.ErrorHandler;

public class ErrorType extends AbstractASTNode implements Type {

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
}
