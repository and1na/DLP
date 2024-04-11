package ast.type;

import ast.node.ASTNode;
import visitor.Visitor;

public class Array extends AbstractType {

    private int size;
    private Type of;

    public Array(int line, int column, int size, Type of){
        super(line, column);
        this.size = size;
        this.of = of;
    }

    @Override
    public Type squareBrackets(Type other, ASTNode ast) {
        if(other instanceof IntType) return of;

        return super.squareBrackets(other, ast);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    public Type getOf() {
        return of;
    }

    public String toString() {
        return "Array";
    }

    public int numberOfBytes() {
        return size * of.numberOfBytes();
    }
}
