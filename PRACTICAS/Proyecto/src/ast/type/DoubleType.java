package ast.type;

import ast.node.ASTNode;
import visitor.Visitor;

public class DoubleType extends AbstractType {

    public DoubleType(int line, int column){
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
        if(other instanceof DoubleType) return this;

        return super.arithmetic(other, ast);
    }

    @Override
    public Type mustPromoteTo(Type other, ASTNode ast) {
        if(other instanceof DoubleType) return this;

        return super.mustPromoteTo(other, ast);
    }

    @Override
    public Type comparison(Type other, ASTNode ast) {
        if(other.isBuiltInType()) return new IntType(0, 0);

        return super.comparison(other, ast);
    }

    @Override
    public Type canBeCasted(Type other, ASTNode ast) {
        if(other.isBuiltInType()) return this;

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
}
