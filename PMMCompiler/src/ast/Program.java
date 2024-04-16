package ast;

import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.node.ASTNode;
import ast.node.AbstractASTNode;
import visitor.Visitor;

import java.util.List;

public class Program extends AbstractASTNode implements ASTNode {

    List<VarDefinition> varDefinitions;
    List<FunctionDefinition> functionDefinitions;

    public Program(int line, int column, List<VarDefinition> varDefinitions, List<FunctionDefinition> functionDefinitions){
        super(line, column);
        this.varDefinitions = varDefinitions;
        this.functionDefinitions = functionDefinitions;
    }

    public List<VarDefinition> getVarDefinitions() {
        return varDefinitions;
    }

    public List<FunctionDefinition> getFunctionDefinitions() {
        return functionDefinitions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) { return v.visit(this,param);}
}
