package codegenerator;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.statement.sw.Case;
import ast.statement.sw.Switch;
import ast.type.*;
import ast.type.struct.Struct;
import ast.type.struct.StructField;
import visitor.Visitor;

public abstract class AbstractCGVisitor<TP,TR> implements Visitor<TP,TR> {

    protected CodeGenerator cg;
    public AbstractCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }

    @Override
    public TR visit(Program node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(FunctionInvocation node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(ArithmeticComparison node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(Arithmetic node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(ArrayAccess node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(Cast node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(CharLiteral node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(FloatLiteral node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(IntLiteral node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(Logical node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(Negation node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(StructAccess node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(UnaryMinus node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(Variable node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(FunctionDefinition node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(VarDefinition node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(Array node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(CharType node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(DoubleType node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(ErrorType node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(Function node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(IntType node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(Struct node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(VoidType node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(StructField node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(If_Else node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(Input node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(Print node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(Return node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(While node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(Assignment node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    @Override
    public TR visit(Increment node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    public TR visit(Switch node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }

    public TR visit(Case node, TP param) {
        throw new IllegalStateException("This node should not be visited in this visitor");
    }


}
