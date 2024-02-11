package ast.type;

import ast.node.ASTNode;
import ast.node.AbstractASTNode;

public class Int extends AbstractASTNode implements Type {

    public Int(int line, int column){
        super(line,column);
    }


}
