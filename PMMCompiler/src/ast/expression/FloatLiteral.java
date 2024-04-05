package ast.expression;

import visitor.Visitor;

public class FloatLiteral extends AbstractExpression {

    private double value;

    public FloatLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
