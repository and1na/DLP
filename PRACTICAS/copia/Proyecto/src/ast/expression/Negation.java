package ast.expression;

import ast.node.AbstractASTNode;

public class Negation extends AbstractASTNode implements Expression{
    private Expression expression;

    public Negation(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;

    }
}
