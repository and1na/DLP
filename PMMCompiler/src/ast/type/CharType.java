package ast.type;

import ast.node.ASTNode;
import visitor.Visitor;

public class CharType extends AbstractType {

    public CharType(int line, int column){
        super(line,column);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
    @Override
    public Type arithmetic(ASTNode ast) {
        return this;
    }
    @Override
    public Type arithmetic(Type other, ASTNode ast) {
        if(other instanceof IntType || other instanceof CharType) return new IntType(0,0);

        return super.arithmetic(other, ast);
    }
    @Override
    public Type comparison(Type other, ASTNode ast) {
        if(other.isBuiltInType()) return new IntType(0, 0);

        return super.comparison(other, ast);
    }
    @Override
    public Type mustPromoteTo(Type other, ASTNode ast) {
        if(other.isBuiltInType()) return other;

        return super.mustPromoteTo(other, ast);
    }
    @Override
    public Type canBeCasted(Type other, ASTNode ast) {
        if(other.isBuiltInType()) return other;

        return super.canBeCasted(other, ast);
    }
    @Override
    public Type asBuiltInType(Type other, ASTNode ast) {
        return this;
    }
    @Override
    public boolean isBuiltInType() {
        return true;
    }
    @Override
    public String toString() {
        return "CharType";
    }
    @Override
    public int numberOfBytes() {
        return 1;
    }
    @Override
    public String suffix() {
        return "b";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CharType;
    }
}

