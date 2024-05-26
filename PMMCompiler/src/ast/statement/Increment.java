package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

public class Increment extends AbstractStatement {

    private Expression expressionToIncrement ;

    public Increment(int line, int column, Expression expression) {
        super(line, column);
        this.expressionToIncrement = expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }

    public Expression getExpressionToIncrement() {
        return expressionToIncrement;
    }

}
