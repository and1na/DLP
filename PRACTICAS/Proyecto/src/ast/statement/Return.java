package ast.statement;

import ast.expression.Expression;
import ast.node.AbstractASTNode;

public class Return extends AbstractASTNode implements Statement {

    private Expression returnedExpression;

    public Return(int line, int column, Expression returnedExpression) {
        super(line, column);
        this.returnedExpression = returnedExpression;
    }
}
