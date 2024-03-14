package ast.statement;


import ast.expression.Expression;
import ast.node.AbstractASTNode;
import visitor.Visitor;

public class Input extends AbstractASTNode implements Statement {

    private Expression inputExpression;

    public Input(int line, int column, Expression inputExpression) {
        super(line, column);
        this.inputExpression = inputExpression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    public Expression getInputExpression() {
        return inputExpression;
    }
}
