// Generated from C:/Users/rheij/Documents/GitHub/CMPILERMPGUI/src/sample\Grammar.g4 by ANTLR 4.7.2
package sample;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(GrammarParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(GrammarParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(GrammarParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(GrammarParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(GrammarParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(GrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(GrammarParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(GrammarParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(GrammarParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(GrammarParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(GrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(GrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(GrammarParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(GrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(GrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(GrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(GrammarParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(GrammarParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(GrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(GrammarParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(GrammarParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(GrammarParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(GrammarParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(GrammarParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(GrammarParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(GrammarParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(GrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(GrammarParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(GrammarParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(GrammarParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(GrammarParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(GrammarParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(GrammarParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(GrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(GrammarParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#wrongBlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrongBlockStatement(GrammarParser.WrongBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(GrammarParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#wrongLocalVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrongLocalVariableDeclaration(GrammarParser.WrongLocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(GrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#scanMissingIdentifierError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanMissingIdentifierError(GrammarParser.ScanMissingIdentifierErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(GrammarParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#printMissingQuotesError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintMissingQuotesError(GrammarParser.PrintMissingQuotesErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#wrongPrintStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrongPrintStatement(GrammarParser.WrongPrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#returnPrimitiveTypeError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnPrimitiveTypeError(GrammarParser.ReturnPrimitiveTypeErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#returnMissingError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnMissingError(GrammarParser.ReturnMissingErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForError(GrammarParser.ForErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(GrammarParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(GrammarParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(GrammarParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(GrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(GrammarParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(GrammarParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(GrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(GrammarParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(GrammarParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(GrammarParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(GrammarParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(GrammarParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#excessLParenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcessLParenExpression(GrammarParser.ExcessLParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#excessRParenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcessRParenExpression(GrammarParser.ExcessRParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(GrammarParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(GrammarParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primaryError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryError(GrammarParser.PrimaryErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expressionError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionError(GrammarParser.ExpressionErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expressionAdditionError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAdditionError(GrammarParser.ExpressionAdditionErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expressionSubtractionError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSubtractionError(GrammarParser.ExpressionSubtractionErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(GrammarParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(GrammarParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(GrammarParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(GrammarParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(GrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(GrammarParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(GrammarParser.ArgumentsContext ctx);
}