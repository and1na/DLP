package ast.type;

import ast.node.AbstractASTNode;

public class Char extends AbstractASTNode implements Type {

    public Char(int line, int column){
        super(line,column);
    }
}
