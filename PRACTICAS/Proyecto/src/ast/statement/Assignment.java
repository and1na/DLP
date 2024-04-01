package ast.statement;

import ast.expression.Expression;
import ast.node.AbstractASTNode;
import visitor.Visitor;

public class Assignment extends AbstractASTNode implements Statement {

    private Expression var;
    private Expression value;

    public Assignment(int line, int column, Expression var, Expression value) {
        super(line, column);
        this.var = var;
        this.value = value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) { return v.visit(this,param); }

    public Expression getVar() {
        return var;
    }

    public Expression getValue() {
        return value;
    }
}
