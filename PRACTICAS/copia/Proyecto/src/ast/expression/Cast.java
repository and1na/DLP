package ast.expression;

import ast.node.AbstractASTNode;
import ast.type.Type;

public class Cast  extends AbstractASTNode implements Expression {

    private Type toType;
    private Expression expressionToCast;
    public Cast(int line, int column, Type toType, Expression expressionToCast) {
        super(line, column);
        this.toType = toType;
        this.expressionToCast = expressionToCast;
    }
}
