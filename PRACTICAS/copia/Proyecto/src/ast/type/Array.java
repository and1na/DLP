package ast.type;

import ast.node.ASTNode;
import ast.node.AbstractASTNode;

public class Array extends AbstractASTNode implements Type {

    private int size;
    private Type of;

    public Array(int line, int column, int size, Type of){
        super(line, column);
        this.size = size;
        this.of = of;
    }
}
