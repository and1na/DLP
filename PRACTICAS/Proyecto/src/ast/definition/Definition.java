package ast.definition;

import ast.node.ASTNode;
import ast.type.Type;

public interface Definition extends ASTNode {

    public String getName();
    public Type getType();
}
