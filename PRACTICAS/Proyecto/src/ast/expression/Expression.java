package ast.expression;

import ast.node.ASTNode;

public interface Expression extends ASTNode {

    boolean getLvalue();

    void setLvalue(boolean lvalue);
}
