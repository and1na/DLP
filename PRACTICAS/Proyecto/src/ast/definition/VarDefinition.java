package ast.definition;

import ast.node.AbstractASTNode;
import ast.type.Type;

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
}