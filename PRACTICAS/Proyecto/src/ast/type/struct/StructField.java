package ast.type.struct;

import ast.node.ASTNode;
import ast.node.AbstractASTNode;
import ast.type.Type;
import visitor.Visitor;

import java.util.Objects;

public class StructField  extends AbstractASTNode implements ASTNode {

    public Type getOf() {
        return of;
    }

    private Type of;
    private String name;

    public StructField(int line, int column, Type of, String name){
        super(line,column);
        this.of = of;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StructField that = (StructField) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
