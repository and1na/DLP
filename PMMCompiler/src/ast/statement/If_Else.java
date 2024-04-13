package ast.statement;

import ast.expression.Expression;
import ast.node.AbstractASTNode;
import visitor.Visitor;

import java.util.List;

public class If_Else extends AbstractStatement{

    private List<Statement> ifBody;
    private List<Statement> elseBody;
    private Expression conditionalExp;
    private boolean hasElseBody;


    public If_Else(int line, int column, List<Statement> ifBody, List<Statement> elseBody, Expression conditionalExp,
                   boolean hasElseBody) {
        super(line, column);
        this.ifBody = ifBody;
        this.elseBody = elseBody;
        this.conditionalExp = conditionalExp;
        this.hasElseBody = hasElseBody;
        this.hasReturn = checkHasReturn();
    }

    private boolean checkHasReturn() {

        if(hasElseBody && elseBody.size() == 0) return false;

        boolean ifBodyHasReturn = false;
        boolean elseBodyHasReturn = false;

        for (Statement statement : ifBody) {
            if (statement.hasReturn()) ifBodyHasReturn = true;
        }

        for (Statement statement : elseBody) {
            if (statement.hasReturn()) elseBodyHasReturn = true;
        }

        return (elseBody.size() == 0) ?  ifBodyHasReturn : ifBodyHasReturn && elseBodyHasReturn  ;
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
