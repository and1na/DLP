package semantic;


import ast.definition.FunctionDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import visitor.AbstractVisitor;

import java.util.ArrayList;
import java.util.List;


public class TypeCheckingVisitor extends AbstractVisitor<Function,Void> {

    @Override
    public Void visit(ArithmeticComparison node, Function param) {
        node.getLeftExpression().accept(this, param);
        node.getRightExpression().accept(this, param);
        node.setLvalue(false);
        node.setType(node.getLeftExpression().getType().comparison(node.getRightExpression().getType(),node));
        return null;
    }

    @Override
    public Void visit(Arithmetic node, Function param) {
        node.getLeftExpression().accept(this, param);
        node.getRightExpression().accept(this, param);
        node.setLvalue(false);
        node.setType(node.getLeftExpression().getType().arithmetic(node.getRightExpression().getType(),node));
        return null;
    }

    /*
        Here logical method is called for checking if both (left and right) expressions are logical (int)
        If they aren´t, an error is thrown from the abstract type class
     */
    @Override
    public Void visit(Logical node, Function param) {
        node.getLeftExpression().accept(this, param);
        node.getRightExpression().accept(this, param);
        node.setLvalue(false);
        node.setType(node.getLeftExpression().getType().logical(node.getRightExpression().getType(),node));
        return null;
    }

    /*
        Here logical method is called for checking if the expression is logical (int)
        If it isn´t, an error is thrown from the abstract type class
     */
    @Override
    public Void visit(Negation node, Function param) {
        node.getExpression().accept(this, param);
        node.setLvalue(false);
        node.setType(node.getExpression().getType().logical(node));
        return null;
    }

    @Override
    public Void visit(ArrayAccess node, Function param) {
        node.getExpressionToAccess().accept(this, param);
        node.getIndex().accept(this, param);
        node.setLvalue(true);
        node.setType(node.getExpressionToAccess().getType().squareBrackets(node.getIndex().getType(),node));
        return null;
    }

    @Override
    public Void visit(Cast node, Function param) {
        node.getToType().accept(this,param);
        node.getExpressionToCast().accept(this,param);
        node.setLvalue(false);
        node.setType(node.getExpressionToCast().getType().canBeCasted(node.getToType(),node));
        return null;
    }

    @Override
    public Void visit(CharLiteral node, Function param) {
        node.setLvalue(false);
        node.setType(new CharType(node.getLine(),node.getColumn()));
        return null;
    }

    @Override
    public Void visit(FloatLiteral node, Function param) {
        node.setLvalue(false);
        node.setType(new DoubleType(node.getLine(),node.getColumn()));
        return null;
    }

    @Override
    public Void visit(IntLiteral node, Function param) {
        node.setLvalue(false);
        node.setType(new IntType(node.getLine(),node.getColumn()));
        return null;
    }


    @Override
    public Void visit(FunctionInvocation node, Function param) {
        node.getFunctionVariable().accept(this,param);
        node.getParameters().forEach(expression -> expression.accept(this,param));
        node.setLvalue(false);

        List<Type> parametersTypes = new ArrayList<>();
        node.getParameters().forEach(expression -> parametersTypes.add(expression.getType()));


        node.setType(node.getFunctionVariable().getDefinition().getType().parenthesis(parametersTypes,
                node));

        return null;
    }


    @Override
    public Void visit(StructAccess node, Function param) {
        node.getExpressionToAccess().accept(this,param);
        node.setLvalue(true);
        node.setType(node.getExpressionToAccess().getType().dot(node.getStructField(),node));
        return null;
    }

    @Override
    public Void visit(UnaryMinus node, Function param) {
        node.getExpression().accept(this,param);
        node.setLvalue(false);
        node.setType(node.getExpression().getType().arithmetic(node));
        return null;
    }

    @Override
    public Void visit(Variable node, Function param) {
        node.setLvalue(true);
        node.setType(node.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(Assignment node, Function param) {
        //It´s mandatory to visit first both parts of the assignment, otherwise, we won´t know if
        //they are Lvalues or not
        node.getVar().accept(this, param);
        node.getValue().accept(this, param);
        if (!node.getVar().getLvalue()) {
            new ErrorType(node.getLine(), node.getColumn(),
                    "Lvalue expected at the left of assignment");
        }
        node.getValue().getType().mustPromoteTo(node.getVar().getType(), node);
        return null;
    }

    @Override
    public Void visit(Input node, Function param) {
        node.getInputExpression().accept(this,param);
        if(!node.getInputExpression().getLvalue()){
            new ErrorType(node.getLine(),node.getColumn(),
                    "Lvalue expected at input statement");
        }
        node.getInputExpression().getType().asBuiltInType(node.getInputExpression().getType(), node);
        return null;
    }

    /*
        Here, if expression type is an int (returned from logical method), it doesn´t throw an error
        Otherwise, an error is thrown from the abstract type class
     */
    public Void visit(While node, Function param){
        node.getConditionalExp().accept(this,param);
        node.getWhileBody().forEach(statement -> statement.accept(this,param));
        node.getConditionalExp().getType().logical(node);
        return null;
    }

    public Void visit(If_Else node, Function param){
        node.getConditionalExp().accept(this,param);
        node.getIfBody().forEach(statement -> statement.accept(this,param));
        node.getElseBody().forEach(statement -> statement.accept(this,param));
        node.getConditionalExp().getType().logical(node);
        return null;
    }



    public Void visit(Print node, Function param){
        node.getExpressionToPrint().accept(this,param);
        node.getExpressionToPrint().getType().asBuiltInType(node.getExpressionToPrint().getType(),node);
        return null;
    }


    public Void visit(Return node, Function param){
        node.getReturnedExpression().accept(this,param);
        node.getReturnedExpression().getType().mustPromoteTo(param.getReturnType(),node);
        return null;
    }

    /*
    * It may seem that I could skip this method implementation, but implementing this visit is mandatory since
    * I have to pass the function type to the statements to get the return type at the return statement
    * */
    public Void visit(FunctionDefinition node, Function param){
        node.getType().accept(this,param);
        node.getBodyVarDefinitions().forEach(varDefinition -> varDefinition.accept(this,param));
        node.getStatements().forEach(statement -> statement.accept(this, (Function) node.getType()));
        return null;
    }

}