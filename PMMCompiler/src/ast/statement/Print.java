package ast.statement;

import ast.expression.Expression;
import ast.node.AbstractASTNode;
import visitor.Visitor;

public class Print extends AbstractASTNode implements Statement {

    public Expression getExpressionToPrint() {
        return expressionToPrint;
    }

    private Expression expressionToPrint;
    
    public Print(int line, int column, Expression expressionToPrint) {
        super(line, column);
        this.expressionToPrint = expressionToPrint;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
