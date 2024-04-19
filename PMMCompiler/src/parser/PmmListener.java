// Generated from /home/nof4c3/Documents/uni/DLP/PMMCompiler/src/parser/Pmm.g4 by ANTLR 4.13.1
package parser;

    import ast.expression.*;
    import ast.node.*;
    import ast.type.*;
    import ast.type.struct.*;
    import ast.definition.*;
    import ast.statement.*;
    import ast.*;
    import errorhandler.*;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PmmParser}.
 */
public interface PmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PmmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(PmmParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(PmmParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PmmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PmmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PmmParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PmmParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(PmmParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(PmmParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#functioninvocation}.
	 * @param ctx the parse tree
	 */
	void enterFunctioninvocation(PmmParser.FunctioninvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#functioninvocation}.
	 * @param ctx the parse tree
	 */
	void exitFunctioninvocation(PmmParser.FunctioninvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#funcDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefinition(PmmParser.FuncDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#funcDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefinition(PmmParser.FuncDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterParametersList(PmmParser.ParametersListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitParametersList(PmmParser.ParametersListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PmmParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PmmParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#structFields}.
	 * @param ctx the parse tree
	 */
	void enterStructFields(PmmParser.StructFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#structFields}.
	 * @param ctx the parse tree
	 */
	void exitStructFields(PmmParser.StructFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(PmmParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(PmmParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(PmmParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(PmmParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(PmmParser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(PmmParser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PmmParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PmmParser.ParameterContext ctx);
}