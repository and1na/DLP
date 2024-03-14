package ast.statement;

import ast.expression.Expression;
import ast.node.AbstractASTNode;
import visitor.Visitor;

public class Return extends AbstractASTNode implements Statement {

    public Expression getReturnedExpression() {
        return returnedExpression;
    }

    private Expression returnedExpression;

    public Return(int line, int column, Expression returnedExpression) {
        super(line, column);
        this.returnedExpression = returnedExpression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
