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
	 * Visit a parse tree produced by {@link KaonParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(KaonParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(KaonParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(KaonParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(KaonParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(KaonParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(KaonParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(KaonParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(KaonParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(KaonParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(KaonParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(KaonParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(KaonParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(KaonParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(KaonParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(KaonParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(KaonParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(KaonParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(KaonParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(KaonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(KaonParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(KaonParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(KaonParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(KaonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(KaonParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(KaonParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(KaonParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(KaonParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(KaonParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(KaonParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(KaonParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(KaonParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(KaonParser.PrimitiveTypeContext ctx);
}