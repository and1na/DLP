package ast.expression;

import ast.node.AbstractASTNode;


public class Arithmetic extends AbstractASTNode implements Expression {

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
}

