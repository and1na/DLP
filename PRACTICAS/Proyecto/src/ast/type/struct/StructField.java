package ast.type.struct;

import ast.node.ASTNode;
import ast.node.AbstractASTNode;
import ast.type.Type;

public class StructField  extends AbstractASTNode implements ASTNode {

    private Type of;
    private String name;

    public StructField(int line, int column, Type of, String name){
        super(line,column);
        this.of = of;
        this.name = name;
    }
}
