package ast.expression;

import ast.node.AbstractASTNode;

public class Dot  extends AbstractASTNode implements Expression{

    private String varName;
    private Expression expressionToAccess;

    public Dot(int line, int column, String varName, Expression expressionToAccess) {
        super(line, column);
        this.varName = varName;
        this.expressionToAccess = expressionToAccess;
    }
}
