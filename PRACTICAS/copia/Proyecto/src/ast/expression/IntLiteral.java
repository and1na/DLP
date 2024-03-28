package ast.expression;

import ast.node.AbstractASTNode;

public class IntLiteral extends AbstractASTNode implements Expression{

    private int value;

    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }
}