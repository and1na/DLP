package ast.statement;

import ast.node.AbstractASTNode;

public abstract class AbstractStatement extends AbstractASTNode implements Statement {

    protected boolean hasReturn;

    public AbstractStatement(int line, int column) {
        super(line, column);
    }

    public boolean hasReturn() {
        return hasReturn;
    }


}
