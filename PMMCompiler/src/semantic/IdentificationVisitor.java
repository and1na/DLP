package semantic;

import ast.definition.Definition;
import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.expression.Variable;
import ast.type.ErrorType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Void,Void> {

    private SymbolTable symbolTable = new SymbolTable();

    @Override
    public Void visit(Variable node, Void param) {
        Definition varDef = symbolTable.find(node.getName());
        if(varDef != null) {
            node.setDefinition(varDef);
        }else {
            varDef = new VarDefinition(
                    0,
                    0,
                    node.getName(),
                    new ErrorType(node.getLine(),
                            node.getColumn(),
                            "Variable " + node.getName() + " hasn't been defined"));
            node.setDefinition(varDef);
        }

        return null;
    }

    @Override
    public Void visit(FunctionDefinition node, Void param) {
        if (!symbolTable.insert(node)){
            new ErrorType(node.getLine(),node.getLine(),"Function already defined: " + node.getName());
        }

        //Create new scope and add
        symbolTable.set();
        node.getType().accept(this, param);
        node.getBodyVarDefinitions().forEach( varDefinition -> {varDefinition.accept(this,param);});
        node.getStatements().forEach( statement -> {statement.accept(this, param);});
        symbolTable.reset();//When al subtrees have been traversed, reset the symbolTable
        //to previous depth level
        return null;
    }

    @Override
    public Void visit(VarDefinition node, Void param) {
        if(!symbolTable.insert(node)){
            new ErrorType(node.getLine(),node.getColumn(),"Already defined variable: " + node.getName());
        }
        //Visit type of varDef, implemented in abstractVisitor
        node.getType().accept(this,param);
        return null;
    }


}
