package errorhandler;

import ast.type.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler{

    private static ErrorHandler instance;

    public List<ErrorType> getErrors() {
        return errors;
    }

    private List<ErrorType> errors;

    private ErrorHandler() {
        this.errors = new ArrayList<ErrorType>();
    }

    public static ErrorHandler getInstance() {
        if (instance == null) {
            instance = new ErrorHandler();
        }
        return instance;
    }

    public boolean anyError() {
        return !this.errors.isEmpty();
    }

    public void showErrors(PrintStream ps) {
        for (ErrorType et : errors) {
            ps.println("[" + et.getLine() + ", " + et.getColumn() + "]\t" + et.getMessage());
        }
    }

    public void addError(ErrorType et) {
        this.errors.add(et);
    }

}

