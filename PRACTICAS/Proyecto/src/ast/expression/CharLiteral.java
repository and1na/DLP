package ast.expression;

import ast.node.AbstractASTNode;

public class CharLiteral extends AbstractASTNode implements Expression {

    private char value;

    public CharLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }
}
