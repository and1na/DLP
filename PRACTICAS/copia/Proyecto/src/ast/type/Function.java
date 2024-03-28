package ast.type;

import ast.definition.VarDefinition;
import ast.node.AbstractASTNode;
import ast.type.struct.StructField;

import java.util.List;

public class Function extends AbstractASTNode implements Type {

    private Type returnType;
    private List<VarDefinition> parameters;

    public Function(int line, int column, Type returnType, List<VarDefinition> parameters){
        super(line,column);
        this.returnType = returnType;
        this.parameters = parameters;
    }
}
