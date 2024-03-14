package ast.expression;

import visitor.Visitor;


public class Arithmetic extends AbstractExpression  {

    private Expression leftExpression;
    private Expression rightExpression;
    private String operator;

    public Arithmetic(int line, int column, Expression leftExpression, Expression rightExpression,
                      String operator) {
        super(line, column);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }
}

