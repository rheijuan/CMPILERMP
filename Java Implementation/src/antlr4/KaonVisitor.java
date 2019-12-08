package antlr4;// Generated from C:/Users/rheij/Documents/GitHub/CMPILERMP/Java Implementation/grammar\Kaon.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KaonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KaonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KaonParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(KaonParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(KaonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(KaonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(KaonParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#constantAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantAssignment(KaonParser.ConstantAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(KaonParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(KaonParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#elseIfStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStat(KaonParser.ElseIfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(KaonParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(KaonParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#missingLBraceFuncDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingLBraceFuncDecl(KaonParser.MissingLBraceFuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#missingRBraceFuncDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingRBraceFuncDecl(KaonParser.MissingRBraceFuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(KaonParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#missingLBraceForLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingLBraceForLoop(KaonParser.MissingLBraceForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#missingRBraceForLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingRBraceForLoop(KaonParser.MissingRBraceForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(KaonParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#missingLBraceWhileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingLBraceWhileLoop(KaonParser.MissingLBraceWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#missingRBraceWhileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingRBraceWhileLoop(KaonParser.MissingRBraceWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(KaonParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#missingLBraceDoWhileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingLBraceDoWhileLoop(KaonParser.MissingLBraceDoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#missingRBraceDoWhileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingRBraceDoWhileLoop(KaonParser.MissingRBraceDoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierFunctionCall(KaonParser.IdentifierFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnFunctionCall(KaonParser.PrintlnFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunctionCall(KaonParser.PrintFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingLParenFunctionCall}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingLParenFunctionCall(KaonParser.MissingLParenFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingRParenFunctionCall}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingRParenFunctionCall(KaonParser.MissingRParenFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingLParenPrintStatement}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingLParenPrintStatement(KaonParser.MissingLParenPrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingRParenStatement}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingRParenStatement(KaonParser.MissingRParenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(KaonParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(KaonParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(KaonParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(KaonParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(KaonParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingLParenExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingLParenExpression(KaonParser.MissingLParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(KaonParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(KaonParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(KaonParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(KaonParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpression(KaonParser.EqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(KaonParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(KaonParser.InExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(KaonParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionExpression(KaonParser.ExpressionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpression(KaonParser.CompExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpression(KaonParser.NullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingRParenExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingRParenExpression(KaonParser.MissingRParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code excessOperationExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcessOperationExpression(KaonParser.ExcessOperationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADDExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADDExpression(KaonParser.ADDExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(KaonParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(KaonParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression(KaonParser.ListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(KaonParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputExpression(KaonParser.InputExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#indexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexes(KaonParser.IndexesContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(KaonParser.ListContext ctx);
}