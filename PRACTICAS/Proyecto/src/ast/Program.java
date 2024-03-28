package ast;

import ast.definition.Definition;
import ast.node.ASTNode;
import ast.node.AbstractASTNode;
import visitor.Visitor;

import java.util.List;

public class Program extends AbstractASTNode implements ASTNode {



    List<Definition> definitions;

    public Program(int line, int column, List<Definition> definitions){
        super(line, column);
        this.definitions = definitions;
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) { return v.visit(this,param);}
}
