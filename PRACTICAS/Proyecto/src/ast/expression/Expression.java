package ast.expression;

import ast.node.ASTNode;
import ast.type.Type;

public interface Expression extends ASTNode {

    boolean getLvalue();

    Type getType();

    void setType(Type type);

    void setLvalue(boolean lvalue);
}
