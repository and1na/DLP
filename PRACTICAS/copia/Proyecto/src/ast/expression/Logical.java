package ast.expression;

import ast.node.AbstractASTNode;

public class Logical extends AbstractASTNode implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    private String operator;

    public Logical(int line, int column, Expression leftExpression, Expression rightExpression,
                      String operator) {
        super(line, column);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }
}
