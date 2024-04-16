package ast.type;

import ast.node.ASTNode;

import java.util.List;

public interface Type extends ASTNode {
    Type arithmetic(Type other, ASTNode ast);

    Type arithmetic(ASTNode ast);

    Type comparison(Type other, ASTNode ast);

    Type logical(Type other, ASTNode ast);

    Type logical(ASTNode ast);

    Type squareBrackets(Type other, ASTNode ast);

    Type canBeCasted(Type other, ASTNode ast);

    Type parenthesis(List<Type> others, ASTNode ast);

    Type dot(String id, ASTNode ast);

    Type mustPromoteTo(Type other, ASTNode ast);

    boolean isLogical();

    Type asBuiltInType(Type other, ASTNode ast);

    boolean isBuiltInType();

    int numberOfBytes();

    String suffix();
}
