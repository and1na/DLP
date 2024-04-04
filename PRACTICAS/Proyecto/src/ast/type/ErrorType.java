package ast.type;

import errorhandler.ErrorHandler;
import visitor.Visitor;

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
}
