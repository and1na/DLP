package ast.expression;

import ast.node.AbstractASTNode;

public class Char extends AbstractASTNode implements Expression {

    private char value;

    public Char(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }
}
