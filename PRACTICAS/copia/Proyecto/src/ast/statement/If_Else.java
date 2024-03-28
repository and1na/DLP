package ast.statement;

import ast.expression.Expression;
import ast.node.AbstractASTNode;

import java.util.List;

public class If_Else extends AbstractASTNode implements Statement{

    private List<Statement> ifBody;
    private List<Statement> elseBody;
    private Expression conditionalExp;


    public If_Else(int line, int column, List<Statement> ifBody, List<Statement> elseBody, Expression conditionalExp) {
        super(line, column);
        this.ifBody = ifBody;
        this.elseBody = elseBody;
        this.conditionalExp = conditionalExp;
    }
}
