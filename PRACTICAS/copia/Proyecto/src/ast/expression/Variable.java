package ast.expression;

import ast.node.AbstractASTNode;

import java.util.Objects;

public class Variable extends AbstractASTNode implements Expression{

    private String name;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
