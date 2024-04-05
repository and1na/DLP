package ast.expression;

import ast.node.AbstractASTNode;
import ast.type.Type;
import visitor.Visitor;

public abstract class AbstractExpression extends AbstractASTNode implements Expression{

    protected Type type;
    protected boolean lvalue;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public abstract <TP, TR> TR accept(Visitor<TP, TR> v, TP param);

    @Override
    public void setLvalue(boolean lvalue){
        this.lvalue = lvalue;
    }

    @Override
    public boolean getLvalue(){
        return lvalue;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
