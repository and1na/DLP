package ast.type;

import ast.node.AbstractASTNode;

public class CharType extends AbstractASTNode implements Type {

    public CharType(int line, int column){
        super(line,column);
    }
}
