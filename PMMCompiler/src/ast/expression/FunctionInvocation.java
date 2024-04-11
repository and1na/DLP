package ast.expression;

import ast.statement.Statement;
import visitor.Visitor;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {

    private List<Expression> parameters;
    private Variable functionVariable;

    public FunctionInvocation(int line, int column, List<Expression> parameters,
                              Variable functionVariable) {
        super(line, column);
        this.parameters = parameters;
        this.functionVariable = functionVariable;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    public List<Expression> getParameters() {
        return parameters;
    }

    public Variable getFunctionVariable() {
        return functionVariable;
    }

    @Override
    public boolean hasReturn() {
        return false;
    }
}
