package ast.node;

public abstract class AbstractASTNode implements ASTNode{


    private int line;
    private int column;

    public AbstractASTNode(int line, int column){
        this.column = column;
        this.line = line;
    }
    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }


}
