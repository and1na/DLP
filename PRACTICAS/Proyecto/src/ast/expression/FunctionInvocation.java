package ast.expression;

import ast.node.AbstractASTNode;
import ast.statement.Statement;

import java.util.List;

public class FunctionInvocation extends AbstractASTNode implements Expression, Statement {

    private List<Expression> parameters;
    private Variable functionVariable;

    public FunctionInvocation(int line, int column, List<Expression> parameters,
                              Variable functionVariable) {
        super(line, column);
        this.parameters = parameters;
        this.functionVariable = functionVariable;
    }
}
