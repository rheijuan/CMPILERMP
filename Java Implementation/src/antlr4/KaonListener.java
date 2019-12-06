package antlr4;// Generated from C:/Users/rheij/Documents/GitHub/CMPILERMP/Java Implementation/grammar\Kaon.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KaonParser}.
 */
public interface KaonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KaonParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(KaonParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(KaonParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(KaonParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(KaonParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(KaonParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(KaonParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(KaonParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(KaonParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(KaonParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(KaonParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(KaonParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(KaonParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(KaonParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(KaonParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(KaonParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(KaonParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(KaonParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(KaonParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(KaonParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(KaonParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(KaonParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(KaonParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(KaonParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(KaonParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(KaonParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(KaonParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(KaonParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(KaonParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(KaonParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(KaonParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(KaonParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(KaonParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(KaonParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(KaonParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(KaonParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(KaonParser.FloatLiteralContext ctx);
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
	 * Enter a parse tree produced by {@link KaonParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(KaonParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(KaonParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(KaonParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(KaonParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(KaonParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(KaonParser.ElseStatementContext ctx);
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
	 * Enter a parse tree produced by {@link KaonParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(KaonParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(KaonParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(KaonParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(KaonParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(KaonParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(KaonParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(KaonParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(KaonParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(KaonParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(KaonParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KaonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KaonParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(KaonParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(KaonParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(KaonParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(KaonParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(KaonParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(KaonParser.PrimitiveTypeContext ctx);
}