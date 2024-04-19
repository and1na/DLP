package ast.expression;

import visitor.Visitor;

public class CharLiteral extends AbstractExpression {

    private int value;

    public CharLiteral(int line, int column, char value) {
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
