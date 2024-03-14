package ast.type;

import ast.node.ASTNode;
import ast.node.AbstractASTNode;
import visitor.Visitor;

public class Array extends AbstractASTNode implements Type {

    private int size;

    public Type getOf() {
        return of;
    }

    private Type of;

    public Array(int line, int column, int size, Type of){
        super(line, column);
        this.size = size;
        this.of = of;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
