package ast.statement;

import ast.expression.Expression;
import ast.node.AbstractASTNode;

public class Assignment extends AbstractASTNode implements Statement {

    private Expression var;
    private Expression value;

    public Assignment(int line, int column, Expression var, Expression value) {
        super(line, column);
        this.var = var;
        this.value = value;
    }
}
