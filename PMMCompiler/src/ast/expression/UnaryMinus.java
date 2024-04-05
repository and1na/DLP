package ast.expression;

import visitor.Visitor;

public class UnaryMinus extends AbstractExpression  {

    private Expression expression;

    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }


    public Expression getExpression() {
        return expression;
    }

}
