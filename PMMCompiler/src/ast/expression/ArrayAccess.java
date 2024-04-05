package ast.expression;

import visitor.Visitor;

public class ArrayAccess extends AbstractExpression {

    private Expression expressionToAccess;
    private Expression index;

    public ArrayAccess(int line, int column, Expression expressionToAccess, Expression index) {
        super(line, column);
        this.expressionToAccess = expressionToAccess;
        this.index = index;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        //Returned value would be received at the visitor method who calls this accept
        return v.visit(this,param);
    }

    public Expression getExpressionToAccess() {
        return expressionToAccess;
    }

    public Expression getIndex() {
        return index;
    }
}
