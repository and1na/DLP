package ast.expression;

import visitor.Visitor;

public class StructAccess  extends AbstractExpression  {

    private String structField;
    private Expression expressionToAccess;

    public StructAccess(int line, int column, String structField, Expression expressionToAccess) {
        super(line, column);
        this.structField = structField;
        this.expressionToAccess = expressionToAccess;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }


    public Expression getExpressionToAccess() {
        return expressionToAccess;
    }

}
