package antlr4;
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
	 * Visit a parse tree produced by {@link KaonParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(KaonParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(KaonParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(KaonParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(KaonParser.TypeBoundContext ctx);
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
	 * Visit a parse tree produced by {@link KaonParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(KaonParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(KaonParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(KaonParser.GenericInterfaceMethodDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link KaonParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(KaonParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(KaonParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(KaonParser.QualifiedNameListContext ctx);
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
	 * Visit a parse tree produced by {@link KaonParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(KaonParser.QualifiedNameContext ctx);
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
	 * Visit a parse tree produced by {@link KaonParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(KaonParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(KaonParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(KaonParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(KaonParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(KaonParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(KaonParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(KaonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#wrongBlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrongBlockStatement(KaonParser.WrongBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(KaonParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#wrongLocalVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrongLocalVariableDeclaration(KaonParser.WrongLocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(KaonParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(KaonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#scanMissingIdentifierError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanMissingIdentifierError(KaonParser.ScanMissingIdentifierErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(KaonParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#printMissingQuotesError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintMissingQuotesError(KaonParser.PrintMissingQuotesErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#wrongPrintStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrongPrintStatement(KaonParser.WrongPrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#returnPrimitiveTypeError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnPrimitiveTypeError(KaonParser.ReturnPrimitiveTypeErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#returnMissingError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnMissingError(KaonParser.ReturnMissingErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#forError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForError(KaonParser.ForErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(KaonParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(KaonParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(KaonParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(KaonParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(KaonParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(KaonParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(KaonParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(KaonParser.SwitchLabelContext ctx);
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
	 * Visit a parse tree produced by {@link KaonParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(KaonParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(KaonParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#excessLParenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcessLParenExpression(KaonParser.ExcessLParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#excessRParenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcessRParenExpression(KaonParser.ExcessRParenExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link KaonParser#primaryError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryError(KaonParser.PrimaryErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#expressionError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionError(KaonParser.ExpressionErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#expressionAdditionError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAdditionError(KaonParser.ExpressionAdditionErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#expressionSubtractionError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSubtractionError(KaonParser.ExpressionSubtractionErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(KaonParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(KaonParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(KaonParser.TypeListContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link KaonParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(KaonParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KaonParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(KaonParser.ArgumentsContext ctx);
}