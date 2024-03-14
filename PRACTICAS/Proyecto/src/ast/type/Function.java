package ast.type;

import ast.definition.VarDefinition;
import ast.node.AbstractASTNode;
import ast.type.struct.StructField;
import visitor.Visitor;

import java.util.List;

public class Function extends AbstractASTNode implements Type {

    public Type getReturnType() {
        return returnType;
    }

    public List<VarDefinition> getParameters() {
        return parameters;
    }

    private Type returnType;
    private List<VarDefinition> parameters;

    public Function(int line, int column, Type returnType, List<VarDefinition> parameters){
        super(line,column);
        this.returnType = returnType;
        this.parameters = parameters;
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
