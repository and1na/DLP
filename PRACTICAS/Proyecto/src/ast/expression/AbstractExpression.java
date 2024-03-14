package ast.expression;

import ast.node.AbstractASTNode;
import visitor.Visitor;

public abstract class AbstractExpression extends AbstractASTNode implements Expression{


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

}
