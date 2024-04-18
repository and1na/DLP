package ast.expression;

import ast.node.AbstractASTNode;
import visitor.Visitor;

public class ArithmeticComparison extends AbstractExpression  {



    private String operator;
    private Expression leftExpression;
    private Expression rightExpression;

    public ArithmeticComparison(int line, int column,
                                Expression leftExpression, Expression rightExpression, String operator) {
        super(line, column);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator  = operator;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
    public String getOperator() {
        return operator;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }
}
