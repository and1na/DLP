package ast.definition;

import ast.node.ASTNode;
import ast.type.Type;

public interface Definition extends ASTNode {

    String getName();
    Type getType();
    void setScope(int scope);
    int getScope();
}
