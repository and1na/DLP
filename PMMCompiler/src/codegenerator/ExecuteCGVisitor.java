package codegenerator;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.statement.Assignment;
import ast.statement.Input;
import ast.statement.Print;
import ast.type.Function;

public class ExecuteCGVisitor extends AbstractCGVisitor<FunctionDefinition,Void>{

    private final AddressCGVisitor addressVisitor;
    private final ValueCGVisitor valueVisitor;

    public ExecuteCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);
        this.addressVisitor = new AddressCGVisitor(codeGenerator);
        this.valueVisitor = new ValueCGVisitor(codeGenerator);
        addressVisitor.setValueVisitor(valueVisitor);
        valueVisitor.setAddressVisitor(addressVisitor);
    }

    /**
     * NOT IMPLEMENT
     * if
     * while
     * functioninvocation
     * return
     */

    //VISIT FOR PROGRAM
    @Override
    public Void visit(Program node, FunctionDefinition param) {
        node.getVarDefinitions().forEach(vDef -> vDef.accept(this,param));
        cg.call("main");
        cg.halt();
        node.getFunctionDefinitions().forEach(fDef -> fDef.accept(this,param));
        return null;
    }

    //VISIT FOR FUNCTIONDEFINITION
    @Override
    public Void visit(FunctionDefinition node, FunctionDefinition param) {
        //Line Comment
        cg.lineComment(node.getLine());
        //Label
        cg.label(node.getName());
        //Params comment
        cg.comment("Params");
        node.getType().accept(this, null);
        //Locals comment
        cg.comment("Locals");
        node.getBodyVarDefinitions().forEach(vDef -> vDef.accept(this,node));

        //BytesLocals is the same as the offset of the last variable * -1
        int bytesLocals = node.getBodyVarDefinitions().isEmpty() ? 0 : -node.getBodyVarDefinitions()
                .get(node.getBodyVarDefinitions().size()-1)
                .getOffset();

        //Allocate space for locals

        /*
            The parameters are already stacked in the stack due to the function call.

            Local variables are "assigned" with the instruction; the total number of bytes must be passed as a parameter

            **(what actually happens is that space is reserved for these variables, then, thanks to the offset of each
            one in its definition, we will know where in the stack to store the value given in an assignment or
            where to look for it in the value visitor)
        */
        cg.enter(bytesLocals);

        int bytesParams = ((Function) node.getType())
                .getParameters()
                .stream()
                .mapToInt(v -> v.getType().numberOfBytes()).sum();

        int bytesReturn = ((Function) node.getType()).getReturnType().numberOfBytes();

        //Statements execution
        node.getStatements().forEach(statement -> statement.accept(this,node));

        //Add ret instruction if no return statement is found (void returnType = 0)
        if (bytesReturn == 0) cg.ret(0, bytesLocals, bytesParams);

        return null;
    }

    //VISIT FOR FUNCTIONTYPE
    public Void visit(Function node, FunctionDefinition param) {
        //Comments of the parameters
        node.getParameters().forEach(varDef -> varDef.accept(this, param));
        return null;
    }

    //VISIT FOR VARDEFINITION
    public Void visit(VarDefinition node, FunctionDefinition param) {
        //Comment
        cg.comment( node.getType().toString() + " " + node.getName()
                + "(offset " + node.getOffset() + ")");
        return null;
    }

    //VISIT FOR STATEMENTS
        //VISIT FOR ASSIGNMENT
    public Void visit(Assignment node, FunctionDefinition param) {
        //Comments
        cg.lineComment(node.getLine());
        cg.comment("Assignment");
        //Address and value visitors
        node.getVar().accept(addressVisitor,param);//puts the address of the variable in the stack
        node.getValue().accept(valueVisitor,param);//puts the value of the expression in the stack
        //This conversion is necessary because we could have an int assigned to a double, for example
        cg.convert(node.getValue().getType(),node.getVar().getType());
        cg.store(node.getVar().getType());
        return null;
    }
        //VISIT FOR PRINT
    public Void visit(Print node, FunctionDefinition param) {
        //Comments
        cg.lineComment(node.getLine());
        cg.comment("Print");
        node.getExpressionToPrint().accept(valueVisitor,param);
        cg.out(node.getExpressionToPrint().getType());
        return null;
    }
        //VISIT FOR INPUT
    public Void visit(Input node, FunctionDefinition param) {
        //Comments
        cg.lineComment(node.getLine());
        cg.comment("Read");
        node.getInputExpression().accept(addressVisitor, param);
        cg.in(node.getInputExpression().getType());
        cg.store(node.getInputExpression().getType());
        return null;
    }
}
