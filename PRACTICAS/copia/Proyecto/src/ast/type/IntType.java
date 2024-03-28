package ast.type;

import ast.node.AbstractASTNode;

public class IntType extends AbstractASTNode implements Type {

    public IntType(int line, int column){
        super(line,column);
    }


}
