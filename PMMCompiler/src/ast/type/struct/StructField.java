package ast.type.struct;

import ast.node.ASTNode;
import ast.node.AbstractASTNode;
import ast.type.Type;
import visitor.Visitor;

import java.util.Objects;

public class StructField  extends AbstractASTNode implements ASTNode {

    private Type of;

    private int offset;

    private String name;

    public StructField(int line, int column, Type of, String name){
        super(line,column);
        this.of = of;
        this.name = name;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    public String getName() {
        return name;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public Type getOf() {
        return of;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StructField that = (StructField) o;
        return Objects.equals(name, that.name);
    }

}
