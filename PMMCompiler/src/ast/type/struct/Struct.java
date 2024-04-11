package ast.type.struct;

import ast.node.ASTNode;
import ast.type.AbstractType;
import ast.type.ErrorType;
import ast.type.Type;
import visitor.Visitor;

import java.util.List;

public class Struct extends AbstractType {

    private List<StructField> fields;

    public Struct(int line, int column, List<StructField> fields){
        super(line,column);
        this.fields = fields;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    public List<StructField> getFields() {
        return fields;
    }

    @Override
    public Type dot(String id, ASTNode ast) {
        for (StructField field : fields) {
            if (field.getName().equals(id)) return field.getOf();
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "Field " + id + " not found in struct");
    }

    @Override
    public int numberOfBytes() {
        int bytes = 0;
        for (StructField field : fields) {
            bytes += field.getOf().numberOfBytes();
        }
        return bytes;
    }

    public String toString() {
        return "Struct";
    }
}
