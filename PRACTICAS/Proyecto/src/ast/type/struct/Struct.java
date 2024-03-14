package ast.type.struct;

import ast.node.AbstractASTNode;
import ast.type.Type;
import visitor.Visitor;

import java.util.List;

public class Struct extends AbstractASTNode implements Type {

    public List<StructField> getFields() {
        return fields;
    }

    private List<StructField> fields;

    public Struct(int line, int column, List<StructField> fields){
        super(line,column);
        this.fields = fields;

    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

}
