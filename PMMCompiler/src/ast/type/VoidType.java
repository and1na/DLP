package ast.type;

import visitor.Visitor;

public class VoidType extends AbstractType {

    public VoidType(int line, int column){
        super(line,column);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public String toString() {
        return "Void";
    }
}
