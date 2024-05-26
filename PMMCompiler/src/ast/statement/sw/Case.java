package ast.statement.sw;

import ast.expression.Expression;
import ast.node.ASTNode;
import ast.node.AbstractASTNode;
import ast.statement.Statement;
import visitor.Visitor;

import java.util.List;

public class Case extends AbstractASTNode implements ASTNode  {

    private Expression expressionToCompare;
    private List<Statement> statements;

    public Case(int line, int column, Expression expressionToCompare, List<Statement> statements) {

        super(line, column);
        this.expressionToCompare = expressionToCompare;
        this.statements = statements;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }


    public Expression getExpressionToCompare() {
        return expressionToCompare;
    }

    public void setExpressionToCompare(Expression condition) {
        this.expressionToCompare = condition;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }
}
