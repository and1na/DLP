package semantic;

import ast.Program;
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
        return null;
    }

    @Override
    public Void visit(FunctionDefinition node, Void param) {
        if (!symbolTable.insert(node) == false) {
            new ErrorType(node.getLine(), node.getLine(), "Function already defined" + node.getName());
        }
        //Create new scope and add
        symbolTable.set();
    return null;
    }

    @Override
    public Void visit(VarDefinition node, Void param) {

        if(symbolTable.insert(node) == false){
            new ErrorType(node.getLine(),node.getColumn(),"Already defined variable: " + node.getName());
        }

        //Visit type of varDef, implemented in abstractVisitor
        node.getType().accept(this,param);

        return null;
    }


}
