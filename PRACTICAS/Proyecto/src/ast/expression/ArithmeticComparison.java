package ast.expression;

import ast.node.AbstractASTNode;

public class ArithmeticComparison extends AbstractASTNode implements Expression {

    private String operator;
    private Expression leftExpression;
    private Expression rightExpression;

    public ArithmeticComparison(int line, int column, String operator ,
                                Expression leftExpression, Expression rightExpression) {
        super(line, column);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator  = operator;
    }
}
