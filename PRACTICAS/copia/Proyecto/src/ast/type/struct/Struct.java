package ast.type.struct;

import ast.node.AbstractASTNode;
import ast.type.Type;

import java.util.List;

public class Struct extends AbstractASTNode implements Type {

    private List<StructField> fields;

    public Struct(int line, int column, List<StructField> fields){
        super(line,column);
        this.fields = fields;

    }

}
