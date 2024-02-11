package ast.definition;

import ast.node.AbstractASTNode;
import ast.statement.Statement;
import ast.type.Type;

import java.util.List;

public class FunctionDefinition extends AbstractASTNode implements Definition{

    private String name;
    private Type type;
    List<Statement> statements;

    public FunctionDefinition(int line,int column, String name, Type type, List<Statement> statements){
        super(line,column);
        this.name = name;
        this.type = type;
        this.statements = statements;
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
