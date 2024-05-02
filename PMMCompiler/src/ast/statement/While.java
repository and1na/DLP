package ast.statement;

import ast.expression.Expression;
import ast.node.AbstractASTNode;
import visitor.Visitor;

import java.util.List;

public class While extends AbstractStatement{


    private List<Statement> whileBody;
    private Expression conditionalExp;


    public While(int line, int column, List<Statement> whileBody, Expression conditionalExp) {
        super(line, column);
        this.whileBody = whileBody;
        this.conditionalExp = conditionalExp;
        this.hasReturn = false;
    }

    public List<Statement> getWhileBody() {
        return whileBody;
    }

    public Expression getConditionalExp() {
        return conditionalExp;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
