package ast.expression;

import visitor.Visitor;

public class IntLiteral extends AbstractExpression{



    private int value;

    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    public int getValue() {
        return value;
    }
}