// Generated from C:/Users/rheij/Documents/GitHub/CMPILERMPGUI/src/sample\Grammar.g4 by ANTLR 4.7.2
package sample;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(GrammarParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(GrammarParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(GrammarParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(GrammarParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(GrammarParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(GrammarParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(GrammarParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(GrammarParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(GrammarParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(GrammarParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(GrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(GrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(GrammarParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(GrammarParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(GrammarParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(GrammarParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(GrammarParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(GrammarParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(GrammarParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(GrammarParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(GrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(GrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(GrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(GrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(GrammarParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(GrammarParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(GrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(GrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(GrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(GrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(GrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(GrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(GrammarParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(GrammarParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(GrammarParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(GrammarParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(GrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(GrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(GrammarParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(GrammarParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(GrammarParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(GrammarParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(GrammarParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(GrammarParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(GrammarParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(GrammarParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(GrammarParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(GrammarParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(GrammarParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(GrammarParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(GrammarParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(GrammarParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(GrammarParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(GrammarParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(GrammarParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(GrammarParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(GrammarParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(GrammarParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(GrammarParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(GrammarParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(GrammarParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(GrammarParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(GrammarParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(GrammarParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(GrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(GrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(GrammarParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(GrammarParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#wrongBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterWrongBlockStatement(GrammarParser.WrongBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#wrongBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitWrongBlockStatement(GrammarParser.WrongBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(GrammarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(GrammarParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#wrongLocalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterWrongLocalVariableDeclaration(GrammarParser.WrongLocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#wrongLocalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitWrongLocalVariableDeclaration(GrammarParser.WrongLocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(GrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(GrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#scanMissingIdentifierError}.
	 * @param ctx the parse tree
	 */
	void enterScanMissingIdentifierError(GrammarParser.ScanMissingIdentifierErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#scanMissingIdentifierError}.
	 * @param ctx the parse tree
	 */
	void exitScanMissingIdentifierError(GrammarParser.ScanMissingIdentifierErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(GrammarParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(GrammarParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#printMissingQuotesError}.
	 * @param ctx the parse tree
	 */
	void enterPrintMissingQuotesError(GrammarParser.PrintMissingQuotesErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#printMissingQuotesError}.
	 * @param ctx the parse tree
	 */
	void exitPrintMissingQuotesError(GrammarParser.PrintMissingQuotesErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#wrongPrintStatement}.
	 * @param ctx the parse tree
	 */
	void enterWrongPrintStatement(GrammarParser.WrongPrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#wrongPrintStatement}.
	 * @param ctx the parse tree
	 */
	void exitWrongPrintStatement(GrammarParser.WrongPrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#returnPrimitiveTypeError}.
	 * @param ctx the parse tree
	 */
	void enterReturnPrimitiveTypeError(GrammarParser.ReturnPrimitiveTypeErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnPrimitiveTypeError}.
	 * @param ctx the parse tree
	 */
	void exitReturnPrimitiveTypeError(GrammarParser.ReturnPrimitiveTypeErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#returnMissingError}.
	 * @param ctx the parse tree
	 */
	void enterReturnMissingError(GrammarParser.ReturnMissingErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnMissingError}.
	 * @param ctx the parse tree
	 */
	void exitReturnMissingError(GrammarParser.ReturnMissingErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forError}.
	 * @param ctx the parse tree
	 */
	void enterForError(GrammarParser.ForErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forError}.
	 * @param ctx the parse tree
	 */
	void exitForError(GrammarParser.ForErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(GrammarParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(GrammarParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(GrammarParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(GrammarParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(GrammarParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(GrammarParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(GrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(GrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(GrammarParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(GrammarParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(GrammarParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(GrammarParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(GrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(GrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(GrammarParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(GrammarParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(GrammarParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(GrammarParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(GrammarParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(GrammarParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(GrammarParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(GrammarParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(GrammarParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(GrammarParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#excessLParenExpression}.
	 * @param ctx the parse tree
	 */
	void enterExcessLParenExpression(GrammarParser.ExcessLParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#excessLParenExpression}.
	 * @param ctx the parse tree
	 */
	void exitExcessLParenExpression(GrammarParser.ExcessLParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#excessRParenExpression}.
	 * @param ctx the parse tree
	 */
	void enterExcessRParenExpression(GrammarParser.ExcessRParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#excessRParenExpression}.
	 * @param ctx the parse tree
	 */
	void exitExcessRParenExpression(GrammarParser.ExcessRParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(GrammarParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(GrammarParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(GrammarParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(GrammarParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primaryError}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryError(GrammarParser.PrimaryErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primaryError}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryError(GrammarParser.PrimaryErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressionError}.
	 * @param ctx the parse tree
	 */
	void enterExpressionError(GrammarParser.ExpressionErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressionError}.
	 * @param ctx the parse tree
	 */
	void exitExpressionError(GrammarParser.ExpressionErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressionAdditionError}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAdditionError(GrammarParser.ExpressionAdditionErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressionAdditionError}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAdditionError(GrammarParser.ExpressionAdditionErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressionSubtractionError}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSubtractionError(GrammarParser.ExpressionSubtractionErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressionSubtractionError}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSubtractionError(GrammarParser.ExpressionSubtractionErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(GrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(GrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(GrammarParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(GrammarParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(GrammarParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(GrammarParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(GrammarParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(GrammarParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(GrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(GrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(GrammarParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(GrammarParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GrammarParser.ArgumentsContext ctx);
}