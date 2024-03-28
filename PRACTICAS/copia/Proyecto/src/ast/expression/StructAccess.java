package ast.expression;

import ast.node.AbstractASTNode;

public class StructAccess  extends AbstractASTNode implements Expression {

    private String structField;
    private Expression expressionToAccess;

    public StructAccess(int line, int column, String structField, Expression expressionToAccess) {
        super(line, column);
        this.structField = structField;
        this.expressionToAccess = expressionToAccess;
    }
}
