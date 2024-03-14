package ast.type;

import ast.node.AbstractASTNode;
import visitor.Visitor;

public class VoidType extends AbstractASTNode implements Type {

    public VoidType(int line, int column){
        super(line,column);
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
