package ast;

import ast.definition.Definition;
import ast.node.ASTNode;
import ast.node.AbstractASTNode;

import java.util.List;

public class Program extends AbstractASTNode implements ASTNode {

    List<Definition> definitions;

    public Program(int line, int column, List<Definition> definitions){
        super(line, column);
        this.definitions = definitions;
    }
}
