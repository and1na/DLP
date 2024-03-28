package ast.statement;


import ast.expression.Expression;
import ast.node.AbstractASTNode;

public class Input extends AbstractASTNode implements Statement {

    private Expression inputExpression;

    public Input(int line, int column, Expression expression) {
        super(line, column);
        this.inputExpression = inputExpression;
    }
}
