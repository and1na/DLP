package ast.definition;

import ast.node.AbstractASTNode;
import ast.statement.Statement;
import ast.type.Type;
import visitor.Visitor;

import java.util.List;

public class FunctionDefinition extends AbstractASTNode implements Definition{

    private String name;
    private Type type;

    public List<VarDefinition> getBodyVarDefinitions() {
        return bodyVarDefinitions;
    }

    public List<Statement> getStatements() {
        return statements;
    }

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
