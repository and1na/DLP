package codegenerator;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.expression.Expression;
import ast.expression.FunctionInvocation;
import ast.statement.*;
import ast.statement.sw.Case;
import ast.statement.sw.Switch;
import ast.type.Function;
import ast.type.IntType;
import ast.type.VoidType;

//This visitor is in charge of generating the code for the execution of programs (definitions and statements)

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


    //VISIT FOR PROGRAM
    @Override
    public Void visit(Program node, FunctionDefinition param) {

//        execute[[Program: program --> varDefinition* funcDefinition*]]() =
//            for (VarDefinition definition : varDefinition*) {
//                    execute[[definition]]()
//            }
//            <call main>
//            <halt>
//            for (FuncDefinition definition : funcDefinition*) {
//                    execute[[definition]]()
//            }

        node.getVarDefinitions().forEach(vDef -> vDef.accept(this,param));
        cg.call("main");
        cg.halt();
        node.getFunctionDefinitions().forEach(fDef -> fDef.accept(this,param));
        return null;
    }

    //VISIT FOR FUNCTION DEFINITION
    @Override
    public Void visit(FunctionDefinition node, FunctionDefinition param) {

//        execute[[FunctionDefinition: definition --> ID type varDefinition* statement*]]() =
//            ID:
//            ' * Params:
//            execute[[type]]()
//            ' * Locals:
//            varDefinition*.forEach(varDef --> execute[[varDef]]())

//            bytesLocals = variabledefinition*.isEmpty() ? 0 : -1 * variabledefinition*.get(variabledefinition*.size() - 1).offset
//            <enter> bytesLocals
//            bytesParams = varDefinitions.stream().mapToInt(varDef --> varDef.getType().numberOfBytes()).sum();
//            bytesReturns = type.returnType.numberOfBytes();

//            definition.bytesLocalVars = bytesLocals
//            type.bytesReturn = bytesReturns
//            type.bytesParams = bytesParams
//
//
//            statement*.forEach(st --> execute[[st]](functionDefinition))
//            if (definition.bytesReturn == 0)
//                <ret> type.bytesReturn, definition.getBytesLocals(), type.getBytesParams()
//

        //Line Comment
        cg.lineComment(node.getLine());
        //Label
        cg.label(node.getName());
        //Params comment
        cg.comment("Params");
        node.getType().accept(this, param);
        //Locals comment
        cg.comment("Locals");
        node.getBodyVarDefinitions().forEach(vDef -> vDef.accept(this,node));

        //BytesLocals is the same as the offset of the last variable * -1
        int bytesLocals = node.getBodyVarDefinitions().isEmpty() ? 0 : -node.getBodyVarDefinitions()
                .get(node.getBodyVarDefinitions().size()-1)
                .getOffset();


        /*  Allocate space for locals
            The parameters are already stacked in the stack due to the function call.

            Local variables are "assigned" with the instruction; the total number of bytes must be
            passed as a parameter

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


        //Set bytes for later use in the return statement
        node.setBytesLocalVars(bytesLocals);
        ((Function) node.getType()).setBytesReturn(bytesReturn);
        ((Function) node.getType()).setBytesParams(bytesParams);


        //Statements execution
        //From this moment on, the funcDef is passed down  through the tree, we'll need it in the return statement
        node.getStatements().forEach(statement -> statement.accept(this,node));

        //Add ret instruction if no return statement is found (void returnType = 0)
        if (bytesReturn == 0) cg.ret(0, bytesLocals, bytesParams);

        return null;
    }

    //VISIT FOR FUNCTIONTYPE
    public Void visit(Function node, FunctionDefinition param) {
//        execute[[FunctionType: type --> varDef* type]]() =
//            varDef*.forEach(varDef --> execute[[varDef]]())

        //Comments of the parameters
        node.getParameters().forEach(varDef -> varDef.accept(this, param));
        return null;
    }

    //VISIT FOR VARDEFINITION
    public Void visit(VarDefinition node, FunctionDefinition param) {
//        execute[[VariableDefinition: definition --> ID type]]() =
//            ' * type.toString() ID (offset definition.offset)

        //Comment
        cg.comment( node.getType().toString() + " " + node.getName()
                + " (offset " + node.getOffset() + ")");
        return null;
    }

    //VISIT FOR STATEMENTS
        //VISIT FOR ASSIGNMENT
    public Void visit(Assignment node, FunctionDefinition param) {

//        execute[[Assignment: statement --> exp1 exp2]]() =
//            address[[exp1]]()
//            value[[exp2]]()
//            cg.convert(expression2.type, expression1.type)
//            <store> expression1.type.suffix()

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

    @Override
    public Void visit(Increment increment, FunctionDefinition param) {
//        execute[[Increment: statement --> exp1 ]]() =
//            address[[exp1]]()
//            value[[exp1]]()
//            <push> 1
//            <store> expression1.type.suffix()
        cg.comment("Increment");
        increment.getExpressionToIncrement().accept(addressVisitor,param);
        increment.getExpressionToIncrement().accept(valueVisitor,param);
        cg.push(new IntType(0,0),1);
        cg.arithmetic(increment.getExpressionToIncrement().getType(),"+");
        cg.store(increment.getExpressionToIncrement().getType());
        return null;
    }

    @Override
    public Void visit(Switch aSwitch, FunctionDefinition param) {

//        execute[[Switch: statement --> exp1 case* caseDefault ]]() =
//            case*.forEach(c -> {

//              int caseLabel = cg.getLabel();
//              <label> caseLabel <:>
//              value[[exp1]]()
//              value[[c.expressionToCompare]]()
//              <eq> exp1.type.suffix()
//              <jz> caseLabel + 1
//              c.statements.forEach(stmnt -> execute[[stmnt]])
//              <jmp> end
//            })

//            int end = cg.getLabel();
//            <label> end <:>
//
        String end = cg.getLabel();
        cg.lineComment(aSwitch.getLine());
        cg.comment("Switch");
        aSwitch.getCases().forEach(c -> {
            cg.lineComment(c.getLine());
            cg.comment("Case");
            String caseLabel = cg.getLabel();
            cg.printLabel(caseLabel);
            aSwitch.getExpressionToCompare().accept(valueVisitor,param);
            c.getExpressionToCompare().accept(valueVisitor,param);
            cg.comparison(aSwitch.getExpressionToCompare().getType(),"==");
            cg.jz(caseLabel + 1);
            c.getStatements().forEach(stmnt -> stmnt.accept(this,param));
            cg.jmp(end);
        });

        String defaultCase = cg.getLabel();
        cg.printLabel(defaultCase);
        aSwitch.getDefaultCase().getStatements().forEach(stmnt -> stmnt.accept(this,param));
        cg.jmp(end);
        cg.printLabel(end);

        return null;
    }

    //VISIT FOR PRINT
    public Void visit(Print node, FunctionDefinition param) {
//        execute[[Print: statement --> exp]]() =
//            value[[exp]]()
//            <out> exp.type.suffix()

        //Comments
        cg.lineComment(node.getLine());
        cg.comment("Print");
        node.getExpressionToPrint().accept(valueVisitor,param);
        cg.out(node.getExpressionToPrint().getType());
        return null;
    }
        //VISIT FOR INPUT
    public Void visit(Input node, FunctionDefinition param) {

//        execute[[Input: statement --> exp]]() =
//            address[[exp]]()
//            <in> exp.type.suffix()
//            <store> exp.type.suffix()


        //Comments
        cg.lineComment(node.getLine());
        cg.comment("Read");
        node.getInputExpression().accept(addressVisitor, param);
        cg.in(node.getInputExpression().getType());
        cg.store(node.getInputExpression().getType());
        return null;
    }

    //VISIT FOR IF_ELSE
    public Void visit(If_Else node, FunctionDefinition param) {

        /*

              execute[[IfElse: statement1 --> expression statement2* statement3*]]() =
                    int elseBody = cg.getLabel();
                    int end = cg.getLabel();
                    value[[expression]]()
                    <jz> elseBody
                    statement2*.forEach(stmnt --> execute[[stmnt]])
                    <jmp> end
                    <label> elseBody <:>
                    statement3*.forEach(stmnt --> execute[[stmnt]])
                    <label> end <:>

         */
        cg.lineComment(node.getLine());
        cg.comment("If-Else");
        String elseBody = cg.getLabel();
        String end = cg.getLabel();

        node.getConditionalExp().accept(valueVisitor,param);
        cg.jz(elseBody);
        node.getIfBody().forEach(stmnt -> stmnt.accept(this,param));
        cg.jmp(end);

        cg.printLabel(elseBody);
        node.getElseBody().forEach(stmnt -> stmnt.accept(this,param));
        cg.printLabel(end);
        return null;
    }

    //VISIT FOR WHILE
    public Void visit(While node, FunctionDefinition param) {

//        execute[[While: statement1 --> exp statement2*]]() =
//            String condition = cg.getLabel();
//            String end = cg.getLabel();
//            <label> condition
//            value[[exp]]()
//            <jz> end
//            statement2*.forEach(st --> execute[[st]])
//            <jmp label> condition
//            <label> end


        cg.lineComment(node.getLine());
        cg.comment("While");
        String condition = cg.getLabel();
        String end = cg.getLabel();
        cg.printLabel(condition);
        node.getConditionalExp().accept(valueVisitor,param);
        cg.jz(end);
        cg.comment("while body");
        node.getWhileBody().forEach(stmnt -> stmnt.accept(this,param));
        cg.jmp(condition);
        cg.printLabel(end);
        return null;
    }



    @Override
    public Void visit(FunctionInvocation ast, FunctionDefinition param) {
//        execute[[FunctionInvocation: statement --> exp1 exp2*]]() =
//        value[[(Expression) statement]]()
//        if (!((Expression) statement).type instanceof VoidType) {
//            <pop> ((Expression) statement).type.suffix()
//        }


        cg.lineComment(ast.getLine());
        ast.accept(valueVisitor, null);
        if (!(ast.getType() instanceof VoidType)) {
            //If something is returned (added to the stack
            // by the valueVisitor), pop it
            cg.pop(ast.getType());
        }
        return null;
    }


    @Override
    public Void visit(Return ast, FunctionDefinition param) {

//        execute[[Return: statement --> exp]](Definition funcDef) =
//            value[[exp]]()
//            <ret> ((Function) funcDef.type).getBytesReturn(), funcDef.getBytesLocals(),
//            ((FunctionType) funcDef.type).getBytesReturn()

        cg.lineComment(ast.getLine());
        cg.comment("Ret");
        ast.getReturnedExpression().accept(valueVisitor, null);
        cg.ret(((Function) param.getType()).getBytesReturn(),
                param.getBytesLocalVars(),
                ((Function) param.getType()).getBytesParams());

        return null;
    }
}
