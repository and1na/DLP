package ast.statement;

import ast.expression.Expression;
import ast.node.AbstractASTNode;
import visitor.Visitor;

import java.util.List;

public class If_Else extends AbstractStatement{

    private List<Statement> ifBody;
    private List<Statement> elseBody;
    private Expression conditionalExp;


    public If_Else(int line, int column, List<Statement> ifBody, List<Statement> elseBody, Expression conditionalExp) {
        super(line, column);
        this.ifBody = ifBody;
        this.elseBody = elseBody;
        this.conditionalExp = conditionalExp;
        this.hasReturn = false;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    public List<Statement> getIfBody() {
        return ifBody;
    }

    public List<Statement> getElseBody() {
        return elseBody;
    }

    public Expression getConditionalExp() {
        return conditionalExp;
    }
}
