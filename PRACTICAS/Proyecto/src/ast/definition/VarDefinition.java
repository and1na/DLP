package ast.definition;

import ast.node.AbstractASTNode;
import ast.type.Type;
import visitor.Visitor;

import java.util.Objects;

public class VarDefinition extends AbstractASTNode implements Definition{

    private String name;
    private Type type;

    public VarDefinition(int line,int column, String name, Type type){
        super(line,column);
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        VarDefinition that = (VarDefinition) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}