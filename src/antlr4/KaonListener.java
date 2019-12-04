package antlr4;
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
	 * Enter a parse tree produced by {@link KaonParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(KaonParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(KaonParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(KaonParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(KaonParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(KaonParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(KaonParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(KaonParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(KaonParser.TypeBoundContext ctx);
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
	 * Enter a parse tree produced by {@link KaonParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(KaonParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(KaonParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(KaonParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(KaonParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(KaonParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(KaonParser.GenericInterfaceMethodDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link KaonParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(KaonParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(KaonParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(KaonParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(KaonParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(KaonParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(KaonParser.QualifiedNameListContext ctx);
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
	 * Enter a parse tree produced by {@link KaonParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(KaonParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(KaonParser.QualifiedNameContext ctx);
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
	 * Enter a parse tree produced by {@link KaonParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(KaonParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(KaonParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(KaonParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(KaonParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(KaonParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(KaonParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(KaonParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(KaonParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(KaonParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(KaonParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(KaonParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(KaonParser.DefaultValueContext ctx);
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
	 * Enter a parse tree produced by {@link KaonParser#wrongBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterWrongBlockStatement(KaonParser.WrongBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#wrongBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitWrongBlockStatement(KaonParser.WrongBlockStatementContext ctx);
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
	 * Enter a parse tree produced by {@link KaonParser#wrongLocalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterWrongLocalVariableDeclaration(KaonParser.WrongLocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#wrongLocalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitWrongLocalVariableDeclaration(KaonParser.WrongLocalVariableDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link KaonParser#scanMissingIdentifierError}.
	 * @param ctx the parse tree
	 */
	void enterScanMissingIdentifierError(KaonParser.ScanMissingIdentifierErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#scanMissingIdentifierError}.
	 * @param ctx the parse tree
	 */
	void exitScanMissingIdentifierError(KaonParser.ScanMissingIdentifierErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(KaonParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(KaonParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#printMissingQuotesError}.
	 * @param ctx the parse tree
	 */
	void enterPrintMissingQuotesError(KaonParser.PrintMissingQuotesErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#printMissingQuotesError}.
	 * @param ctx the parse tree
	 */
	void exitPrintMissingQuotesError(KaonParser.PrintMissingQuotesErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#wrongPrintStatement}.
	 * @param ctx the parse tree
	 */
	void enterWrongPrintStatement(KaonParser.WrongPrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#wrongPrintStatement}.
	 * @param ctx the parse tree
	 */
	void exitWrongPrintStatement(KaonParser.WrongPrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#returnPrimitiveTypeError}.
	 * @param ctx the parse tree
	 */
	void enterReturnPrimitiveTypeError(KaonParser.ReturnPrimitiveTypeErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#returnPrimitiveTypeError}.
	 * @param ctx the parse tree
	 */
	void exitReturnPrimitiveTypeError(KaonParser.ReturnPrimitiveTypeErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#returnMissingError}.
	 * @param ctx the parse tree
	 */
	void enterReturnMissingError(KaonParser.ReturnMissingErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#returnMissingError}.
	 * @param ctx the parse tree
	 */
	void exitReturnMissingError(KaonParser.ReturnMissingErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#forError}.
	 * @param ctx the parse tree
	 */
	void enterForError(KaonParser.ForErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#forError}.
	 * @param ctx the parse tree
	 */
	void exitForError(KaonParser.ForErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(KaonParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(KaonParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(KaonParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(KaonParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(KaonParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(KaonParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(KaonParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(KaonParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(KaonParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(KaonParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(KaonParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(KaonParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(KaonParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(KaonParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(KaonParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(KaonParser.SwitchLabelContext ctx);
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
	 * Enter a parse tree produced by {@link KaonParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(KaonParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(KaonParser.EnhancedForControlContext ctx);
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
	 * Enter a parse tree produced by {@link KaonParser#excessLParenExpression}.
	 * @param ctx the parse tree
	 */
	void enterExcessLParenExpression(KaonParser.ExcessLParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#excessLParenExpression}.
	 * @param ctx the parse tree
	 */
	void exitExcessLParenExpression(KaonParser.ExcessLParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#excessRParenExpression}.
	 * @param ctx the parse tree
	 */
	void enterExcessRParenExpression(KaonParser.ExcessRParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#excessRParenExpression}.
	 * @param ctx the parse tree
	 */
	void exitExcessRParenExpression(KaonParser.ExcessRParenExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link KaonParser#primaryError}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryError(KaonParser.PrimaryErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#primaryError}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryError(KaonParser.PrimaryErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#expressionError}.
	 * @param ctx the parse tree
	 */
	void enterExpressionError(KaonParser.ExpressionErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#expressionError}.
	 * @param ctx the parse tree
	 */
	void exitExpressionError(KaonParser.ExpressionErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#expressionAdditionError}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAdditionError(KaonParser.ExpressionAdditionErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#expressionAdditionError}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAdditionError(KaonParser.ExpressionAdditionErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#expressionSubtractionError}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSubtractionError(KaonParser.ExpressionSubtractionErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#expressionSubtractionError}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSubtractionError(KaonParser.ExpressionSubtractionErrorContext ctx);
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
	 * Enter a parse tree produced by {@link KaonParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(KaonParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(KaonParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(KaonParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(KaonParser.TypeListContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link KaonParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(KaonParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(KaonParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KaonParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(KaonParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KaonParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(KaonParser.ArgumentsContext ctx);
}