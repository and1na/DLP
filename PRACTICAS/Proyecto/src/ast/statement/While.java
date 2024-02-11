package ast.statement;

import ast.expression.Expression;
import ast.node.AbstractASTNode;

import java.util.List;

public class While extends AbstractASTNode implements Statement{

    private List<Statement> whileBody;
    private Expression conditionalExp;


    public While(int line, int column, List<Statement> whileBody, Expression conditionalExp) {
        super(line, column);
        this.whileBody = whileBody;
        this.conditionalExp = conditionalExp;
    }
}
