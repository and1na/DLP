package ast;

import ast.definition.Definition;
import ast.node.ASTNode;

import java.util.List;

public class Program implements ASTNode /* IMPLEMENTA ABSTRACTASTNODE????*/ {

    List<Definition> definitions;

    public Program(List<Definition> definitions){
        this.definitions = definitions;
    }
}
