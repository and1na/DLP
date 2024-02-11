package ast.expression;

import ast.node.AbstractASTNode;
import ast.type.Type;

public class Cast  extends AbstractASTNode implements Expression {

    private Type toType;

    public Cast(int line, int column, Type toType) {
        super(line, column);
        this.toType = toType;
    }
}
