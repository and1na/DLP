package ast.expression;

import ast.node.AbstractASTNode;

public class UnaryMinus extends AbstractASTNode implements Expression {

    private Expression expression;

    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }
}
