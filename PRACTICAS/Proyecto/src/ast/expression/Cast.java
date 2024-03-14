package ast.expression;

import ast.type.Type;
import visitor.Visitor;

public class Cast  extends AbstractExpression{

    private Type toType;
    private Expression expressionToCast;

    public Cast(int line, int column, Type toType, Expression expressionToCast) {
        super(line, column);
        this.toType = toType;
        this.expressionToCast = expressionToCast;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }


    public Type getToType() {
        return toType;
    }

    public Expression getExpressionToCast() {
        return expressionToCast;
    }

}
