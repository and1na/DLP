package ast.type;

import ast.node.AbstractASTNode;

public class Void extends AbstractASTNode implements Type {

    public Void(int line, int column){
        super(line,column);
    }
}
