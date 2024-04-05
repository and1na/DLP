package ast.node;

import visitor.Visitor;

public interface ASTNode {

    public int getLine();

    public void setLine(int line);

    public int getColumn();

    public void setColumn(int column);

    public <TP,TR> TR accept (Visitor<TP,TR> v, TP param);

}

