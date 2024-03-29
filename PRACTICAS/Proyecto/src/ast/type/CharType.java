package ast.type;

import ast.node.AbstractASTNode;
import visitor.Visitor;

public class CharType extends AbstractASTNode implements Type {

    public CharType(int line, int column){
        super(line,column);
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
