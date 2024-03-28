package ast.definition;

import ast.node.AbstractASTNode;
import ast.statement.Statement;
import ast.type.Type;

import java.util.List;

public class FunctionDefinition extends AbstractASTNode implements Definition{

    private String name;
    private Type type;
    private List<VarDefinition> bodyVarDefinitions;
    List<Statement> statements;


    public FunctionDefinition(int line,int column, String name, Type type, List<VarDefinition> varDefs,List<Statement> statements){
        super(line,column);
        this.name = name;
        this.type = type;
        this.bodyVarDefinitions = varDefs;
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
