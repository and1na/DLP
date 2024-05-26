package ast.statement.sw;

import ast.expression.Expression;
import ast.statement.AbstractStatement;
import visitor.Visitor;

import java.util.List;

public class Switch extends AbstractStatement {

    private Expression expressionToCompare;
    private List<Case> cases;
    private Case defaultCase;


    public Switch(int line, int column, Expression condition, List<Case> cases, Case defaultCase) {
        super(line, column);
        this.expressionToCompare = condition;
        this.cases = cases;
        this.defaultCase = defaultCase;

    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }


    public Case getDefaultCase() {
        return defaultCase;
    }

    public void setDefaultCase(Case defaultCase) {
        this.defaultCase = defaultCase;
    }

    public Expression getExpressionToCompare() {
        return expressionToCompare;
    }

    public void setExpressionToCompare(Expression condition) {
        this.expressionToCompare = condition;
    }

    public List<Case> getCases() {
        return cases;
    }

    public void setCases(List<Case> cases) {
        this.cases = cases;
    }
}
