package ast.expression;

import ast.node.AbstractASTNode;

public class Character extends AbstractASTNode implements Expression {

    private char value;

    public Character(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }
}
