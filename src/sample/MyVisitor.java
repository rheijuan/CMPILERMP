package sample;

public class MyVisitor extends GrammarBaseVisitor<Object> {

    @Override public Object visitCompilationUnit(GrammarParser.CompilationUnitContext ctx) { return visitChildren(ctx); }

    @Override public Object visitVariableModifier(GrammarParser.VariableModifierContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTypeParameters(GrammarParser.TypeParametersContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTypeParameter(GrammarParser.TypeParameterContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMethodDeclaration(GrammarParser.MethodDeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMethodBody(GrammarParser.MethodBodyContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTypeTypeOrVoid(GrammarParser.TypeTypeOrVoidContext ctx) { return visitChildren(ctx); }

    @Override public Object visitConstantDeclarator(GrammarParser.ConstantDeclaratorContext ctx) { return visitChildren(ctx); }

    @Override public Object visitVariableDeclarators(GrammarParser.VariableDeclaratorsContext ctx) { return visitChildren(ctx); }

    @Override public Object visitVariableDeclarator(GrammarParser.VariableDeclaratorContext ctx) { return visitChildren(ctx); }

    @Override public Object visitVariableDeclaratorId(GrammarParser.VariableDeclaratorIdContext ctx) { return visitChildren(ctx); }

    @Override public Object visitVariableInitializer(GrammarParser.VariableInitializerContext ctx) { return visitChildren(ctx); }

    @Override public Object visitArrayInitializer(GrammarParser.ArrayInitializerContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTypeArgument(GrammarParser.TypeArgumentContext ctx) { return visitChildren(ctx); }

    @Override public Object visitQualifiedNameList(GrammarParser.QualifiedNameListContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFormalParameters(GrammarParser.FormalParametersContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFormalParameterList(GrammarParser.FormalParameterListContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFormalParameter(GrammarParser.FormalParameterContext ctx) { return visitChildren(ctx); }

    @Override public Object visitLastFormalParameter(GrammarParser.LastFormalParameterContext ctx) { return visitChildren(ctx); }

    @Override public Object visitQualifiedName(GrammarParser.QualifiedNameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitLiteral(GrammarParser.LiteralContext ctx) { return visitChildren(ctx); }

    @Override public Object visitIntegerLiteral(GrammarParser.IntegerLiteralContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFloatLiteral(GrammarParser.FloatLiteralContext ctx) { return visitChildren(ctx); }

    @Override public Object visitAnnotation(GrammarParser.AnnotationContext ctx) { return visitChildren(ctx); }

    @Override public Object visitElementValuePairs(GrammarParser.ElementValuePairsContext ctx) { return visitChildren(ctx); }

    @Override public Object visitElementValuePair(GrammarParser.ElementValuePairContext ctx) { return visitChildren(ctx); }

    @Override public Object visitElementValue(GrammarParser.ElementValueContext ctx) { return visitChildren(ctx); }

    @Override public Object visitElementValueArrayInitializer(GrammarParser.ElementValueArrayInitializerContext ctx) { return visitChildren(ctx); }

    @Override public Object visitDefaultValue(GrammarParser.DefaultValueContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBlock(GrammarParser.BlockContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBlockStatement(GrammarParser.BlockStatementContext ctx) { return visitChildren(ctx); }

    @Override public Object visitLocalVariableDeclaration(GrammarParser.LocalVariableDeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Object visitStatement(GrammarParser.StatementContext ctx) { return visitChildren(ctx); }

    @Override public Object visitCatchClause(GrammarParser.CatchClauseContext ctx) { return visitChildren(ctx); }

    @Override public Object visitCatchType(GrammarParser.CatchTypeContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFinallyBlock(GrammarParser.FinallyBlockContext ctx) { return visitChildren(ctx); }

    @Override public Object visitResourceSpecification(GrammarParser.ResourceSpecificationContext ctx) { return visitChildren(ctx); }

    @Override public Object visitResources(GrammarParser.ResourcesContext ctx) { return visitChildren(ctx); }

    @Override public Object visitResource(GrammarParser.ResourceContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSwitchBlockStatementGroup(GrammarParser.SwitchBlockStatementGroupContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSwitchLabel(GrammarParser.SwitchLabelContext ctx) { return visitChildren(ctx); }

    @Override public Object visitForControl(GrammarParser.ForControlContext ctx) { return visitChildren(ctx); }

    @Override public Object visitForInit(GrammarParser.ForInitContext ctx) { return visitChildren(ctx); }

    @Override public Object visitEnhancedForControl(GrammarParser.EnhancedForControlContext ctx) { return visitChildren(ctx); }

    @Override public Object visitParExpression(GrammarParser.ParExpressionContext ctx) { return visitChildren(ctx); }

    @Override public Object visitExpressionList(GrammarParser.ExpressionListContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMethodCall(GrammarParser.MethodCallContext ctx) { return visitChildren(ctx); }

    @Override public Object visitExpression(GrammarParser.ExpressionContext ctx) { return visitChildren(ctx); }

    @Override public Object visitPrimary(GrammarParser.PrimaryContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTypeList(GrammarParser.TypeListContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTypeType(GrammarParser.TypeTypeContext ctx) { return visitChildren(ctx); }

    @Override public Object visitPrimitiveType(GrammarParser.PrimitiveTypeContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTypeArguments(GrammarParser.TypeArgumentsContext ctx) { return visitChildren(ctx); }

    @Override public Object visitArguments(GrammarParser.ArgumentsContext ctx) { return visitChildren(ctx); }

//    @Override public Object visitBlockError(GrammarParser.BlockErrorContext ctx) { return visitChildren(ctx); }

    @Override public Object visitScanMissingIdentifierError(GrammarParser.ScanMissingIdentifierErrorContext ctx) {
        Controller.errors.add("Missing identifier at line " + ctx.getStart().getLine());
        return visitChildren(ctx);
    }

    @Override public Object visitExpressionAdditionError(GrammarParser.ExpressionAdditionErrorContext ctx) {
        Controller.errors.add("A literal cannot be followed by '++' at line " + ctx.getStart().getLine());
        return visitChildren(ctx);
    }

    @Override public Object visitExpressionSubtractionError(GrammarParser.ExpressionSubtractionErrorContext ctx) {
        Controller.errors.add("A literal cannot be followed by '--' at line " + ctx.getStart().getLine());
        return visitChildren(ctx);
    }

    @Override public Object visitReturnMissingError(GrammarParser.ReturnMissingErrorContext ctx) {
        Controller.errors.add("Expected ';' at line " + ctx.getStart().getLine());
        return visitChildren(ctx);
    }

    @Override public Object visitReturnPrimitiveTypeError(GrammarParser.ReturnPrimitiveTypeErrorContext ctx) {
        Controller.errors.add("Cannot return an explicit data type at line " + ctx.getStart().getLine());
        return visitChildren(ctx);
    }

    @Override public Object visitExcessLParenExpression(GrammarParser.ExcessLParenExpressionContext ctx) {
        Controller.errors.add("Excess '(' found at line " + ctx.getStart().getLine());
        return visitChildren(ctx);
    }

    @Override public Object visitExcessRParenExpression(GrammarParser.ExcessRParenExpressionContext ctx) {
        Controller.errors.add("Excess ')' found at line " + ctx.getStart().getLine());
        return visitChildren(ctx);
    }

    @Override public Object visitWrongLocalVariableDeclaration(GrammarParser.WrongLocalVariableDeclarationContext ctx) {
        Controller.errors.add("Extra ';' found at line " + ctx.getStart().getLine());
        return visitChildren(ctx);
    }

    @Override public Object visitWrongPrintStatement(GrammarParser.WrongPrintStatementContext ctx) {
        Controller.errors.add("Unexpected operator at line " + ctx.getStart().getLine());
        return visitChildren(ctx);
    }

    @Override public Object visitWrongBlockStatement(GrammarParser.WrongBlockStatementContext ctx) {
        Controller.errors.add("Missing '}' at line " + ctx.getStart().getLine());
        return visitChildren(ctx);
    }

    @Override public Object visitPrintMissingQuotesError(GrammarParser.PrintMissingQuotesErrorContext ctx) {
        Controller.errors.add("Missing double quotes at line " + ctx.getStart().getLine());
        return visitChildren(ctx);
    }

    @Override public Object visitPrimaryError(GrammarParser.PrimaryErrorContext ctx) {
        Controller.errors.add("Extra opening or parenthesis at line " + ctx.getStart().getLine());
        return visitChildren(ctx);
    }

}

