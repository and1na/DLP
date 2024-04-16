package codegenerator;

import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.expression.Variable;
import ast.type.IntType;

public class AddressCGVisitor extends AbstractCGVisitor<FunctionDefinition,Void>{
    /*
     * NOT IMPLEMENT
     * fieldaccess
     * indexing
     */

    private ValueCGVisitor valueVisitor;

    public AddressCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    public void setValueVisitor(ValueCGVisitor valueVisitor) {
        this.valueVisitor = valueVisitor;
    }

    public Void visit(Variable node, FunctionDefinition param) {
        if(node.getDefinition().getScope() == 0) {
            cg.pushA(((VarDefinition) node.getDefinition()).getOffset());
        }else{
            cg.pushBP();
            cg.push(((VarDefinition) node.getDefinition()).getOffset());
            cg.arithmetic(new IntType(0,0), "+");
        }
        return null;
    }
}
