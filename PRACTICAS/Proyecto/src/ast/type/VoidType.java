package ast.type;

import ast.node.AbstractASTNode;

public class VoidType extends AbstractASTNode implements Type {

    public VoidType(int line, int column){
        super(line,column);
    }
}
