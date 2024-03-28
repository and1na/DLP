package ast.expression;

import ast.node.AbstractASTNode;

public class ArrayAccess  extends AbstractASTNode implements Expression{

    private Expression expressionToAccess;
    private Expression index;

    public ArrayAccess(int line, int column, Expression expressionToAccess, Expression index) {
        super(line, column);
        this.expressionToAccess = expressionToAccess;
        this.index = index;
    }
}
