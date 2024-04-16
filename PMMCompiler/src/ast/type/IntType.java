package ast.type;

import ast.node.ASTNode;
import visitor.Visitor;


public class IntType extends AbstractType {

    public IntType(int line, int column){
        super(line,column);
    }

    @Override
    public Type arithmetic(ASTNode ast) {
        return this;
    }
    @Override
    public Type arithmetic(Type other, ASTNode ast) {
        if(other instanceof IntType) return this;

        return super.arithmetic(other, ast);
    }
    @Override
    public Type comparison(Type other, ASTNode ast) {
        if(other.isBuiltInType()) return this;

        return super.comparison(other, ast);
    }
    @Override
    public Type mustPromoteTo(Type other, ASTNode ast) {
        if(other instanceof IntType || other instanceof DoubleType) return other;

        return super.mustPromoteTo(other, ast);
    }
    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
    @Override
    public Type canBeCasted(Type other, ASTNode ast) {
        if(other.isBuiltInType()) return this;

        return super.canBeCasted(other, ast);
    }
    @Override
    public Type logical(Type other, ASTNode ast) {
        if(other.isLogical()) return this;

        return super.logical(other, ast);
    }
    @Override
    public Type logical(ASTNode ast) {
        return this;
    }
    @Override
    public Type asBuiltInType(Type other, ASTNode ast) {
        return this;
    }
    @Override
    public boolean isLogical() {
        return true;
    }
    @Override
    public boolean isBuiltInType() {
        return true;
    }
    @Override
    public String toString() {
        return "Int";
    }
    @Override
    public int numberOfBytes() {
        return 2;
    }
    @Override
    public String suffix() {
        return "i";
    }

}
