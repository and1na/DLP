package ast.expression;

import ast.node.AbstractASTNode;

public class FloatLiteral extends AbstractASTNode implements Expression{

    private double value;

    public FloatLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }
}
