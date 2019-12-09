package antlr4;// Generated from C:/Users/rheij/Documents/GitHub/CMPILERMP/Java Implementation/grammar\Kaon.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KaonParser}.
 */
public interface KaonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KaonParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(KaonParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(KaonParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(KaonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(KaonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KaonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KaonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(KaonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(KaonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#constantAssignment}.
	 * @param ctx the parse tree
	 */
	void enterConstantAssignment(KaonParser.ConstantAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#constantAssignment}.
	 * @param ctx the parse tree
	 */
	void exitConstantAssignment(KaonParser.ConstantAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(KaonParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(KaonParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(KaonParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(KaonParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(KaonParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(KaonParser.ElseIfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(KaonParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(KaonParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(KaonParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(KaonParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#missingLBraceFuncDecl}.
	 * @param ctx the parse tree
	 */
	void enterMissingLBraceFuncDecl(KaonParser.MissingLBraceFuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#missingLBraceFuncDecl}.
	 * @param ctx the parse tree
	 */
	void exitMissingLBraceFuncDecl(KaonParser.MissingLBraceFuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#missingRBraceFuncDecl}.
	 * @param ctx the parse tree
	 */
	void enterMissingRBraceFuncDecl(KaonParser.MissingRBraceFuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#missingRBraceFuncDecl}.
	 * @param ctx the parse tree
	 */
	void exitMissingRBraceFuncDecl(KaonParser.MissingRBraceFuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(KaonParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(KaonParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#missingLBraceForLoop}.
	 * @param ctx the parse tree
	 */
	void enterMissingLBraceForLoop(KaonParser.MissingLBraceForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#missingLBraceForLoop}.
	 * @param ctx the parse tree
	 */
	void exitMissingLBraceForLoop(KaonParser.MissingLBraceForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#missingRBraceForLoop}.
	 * @param ctx the parse tree
	 */
	void enterMissingRBraceForLoop(KaonParser.MissingRBraceForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#missingRBraceForLoop}.
	 * @param ctx the parse tree
	 */
	void exitMissingRBraceForLoop(KaonParser.MissingRBraceForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(KaonParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(KaonParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#missingLBraceWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterMissingLBraceWhileLoop(KaonParser.MissingLBraceWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#missingLBraceWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitMissingLBraceWhileLoop(KaonParser.MissingLBraceWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#missingRBraceWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterMissingRBraceWhileLoop(KaonParser.MissingRBraceWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#missingRBraceWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitMissingRBraceWhileLoop(KaonParser.MissingRBraceWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(KaonParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(KaonParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#missingLBraceDoWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterMissingLBraceDoWhileLoop(KaonParser.MissingLBraceDoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#missingLBraceDoWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitMissingLBraceDoWhileLoop(KaonParser.MissingLBraceDoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#missingRBraceDoWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterMissingRBraceDoWhileLoop(KaonParser.MissingRBraceDoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#missingRBraceDoWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitMissingRBraceDoWhileLoop(KaonParser.MissingRBraceDoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierFunctionCall(KaonParser.IdentifierFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierFunctionCall(KaonParser.IdentifierFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnFunctionCall(KaonParser.PrintlnFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnFunctionCall(KaonParser.PrintlnFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunctionCall(KaonParser.PrintFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunctionCall(KaonParser.PrintFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code missingLParenPrintStatement}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterMissingLParenPrintStatement(KaonParser.MissingLParenPrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code missingLParenPrintStatement}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitMissingLParenPrintStatement(KaonParser.MissingLParenPrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code missingRParenStatement}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterMissingRParenStatement(KaonParser.MissingRParenStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code missingRParenStatement}
	 * labeled alternative in {@link KaonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitMissingRParenStatement(KaonParser.MissingRParenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(KaonParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(KaonParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(KaonParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(KaonParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(KaonParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(KaonParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(KaonParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(KaonParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(KaonParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(KaonParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code missingLParenExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMissingLParenExpression(KaonParser.MissingLParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code missingLParenExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMissingLParenExpression(KaonParser.MissingLParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(KaonParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(KaonParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(KaonParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(KaonParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(KaonParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(KaonParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(KaonParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(KaonParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpression(KaonParser.EqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpression(KaonParser.EqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(KaonParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(KaonParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(KaonParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(KaonParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(KaonParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(KaonParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionExpression(KaonParser.ExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionExpression(KaonParser.ExpressionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompExpression(KaonParser.CompExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompExpression(KaonParser.CompExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpression(KaonParser.NullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpression(KaonParser.NullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code missingRParenExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMissingRParenExpression(KaonParser.MissingRParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code missingRParenExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMissingRParenExpression(KaonParser.MissingRParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code excessOperationExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExcessOperationExpression(KaonParser.ExcessOperationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code excessOperationExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExcessOperationExpression(KaonParser.ExcessOperationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterADDExpression(KaonParser.ADDExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitADDExpression(KaonParser.ADDExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(KaonParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(KaonParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(KaonParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(KaonParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(KaonParser.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(KaonParser.ListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(KaonParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(KaonParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInputExpression(KaonParser.InputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInputExpression(KaonParser.InputExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#indexes}.
	 * @param ctx the parse tree
	 */
	void enterIndexes(KaonParser.IndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#indexes}.
	 * @param ctx the parse tree
	 */
	void exitIndexes(KaonParser.IndexesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(KaonParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(KaonParser.ListContext ctx);
}