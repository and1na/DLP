package ast.statement;

import ast.expression.Expression;
import ast.node.AbstractASTNode;

public class Print extends AbstractASTNode implements Statement {

    private Expression expressionToPrint;
    
    public Print(int line, int column, Expression expression) {
        super(line, column);
        this.expressionToPrint = expressionToPrint;
    }
}
