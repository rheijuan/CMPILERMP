//package main;
//
//import antlr4.KaonBaseVisitor;
//import antlr4.KaonParser;
//import com.udojava.evalex.Expression;
//import org.antlr.v4.runtime.tree.ParseTree;
//import symbol_table.Symbol;
//import symbol_table.VariableSymbol;
//
//import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Scanner;
//
//public class TheVisitor extends KaonBaseVisitor {
//    private HashMap<String, Symbol> symbolTable = new HashMap<>();
//    private HashMap<String, String> valueMap = new HashMap<>();
//
//    @Override
//    public Object visitCompilationUnit(KaonParser.CompilationUnitContext ctx) {
//        return super.visitCompilationUnit(ctx);
//    }
//
//    @Override
//    public Object visitVariableModifier(KaonParser.VariableModifierContext ctx) {
//        return super.visitVariableModifier(ctx);
//    }
//
//    @Override
//    public Object visitTypeParameters(KaonParser.TypeParametersContext ctx) {
//        return super.visitTypeParameters(ctx);
//    }
//
//    @Override
//    public Object visitTypeParameter(KaonParser.TypeParameterContext ctx) {
//        return super.visitTypeParameter(ctx);
//    }
//
//    @Override
//    public Object visitTypeBound(KaonParser.TypeBoundContext ctx) {
//        return super.visitTypeBound(ctx);
//    }
//
//    @Override
//    public Object visitMethodDeclaration(KaonParser.MethodDeclarationContext ctx) {
//        return super.visitMethodDeclaration(ctx);
//    }
//
//    @Override
//    public Object visitMethodBody(KaonParser.MethodBodyContext ctx) {
//        return super.visitMethodBody(ctx);
//    }
//
//    @Override
//    public Object visitTypeTypeOrVoid(KaonParser.TypeTypeOrVoidContext ctx) {
//        return super.visitTypeTypeOrVoid(ctx);
//    }
//
//    @Override
//    public Object visitConstDeclaration(KaonParser.ConstDeclarationContext ctx) {
//        return super.visitConstDeclaration(ctx);
//    }
//
//    @Override
//    public Object visitConstantDeclarator(KaonParser.ConstantDeclaratorContext ctx) {
//        return super.visitConstantDeclarator(ctx);
//    }
//
//    @Override
//    public Object visitInterfaceMethodDeclaration(KaonParser.InterfaceMethodDeclarationContext ctx) {
//        return super.visitInterfaceMethodDeclaration(ctx);
//    }
//
//    @Override
//    public Object visitInterfaceMethodModifier(KaonParser.InterfaceMethodModifierContext ctx) {
//        return super.visitInterfaceMethodModifier(ctx);
//    }
//
//    @Override
//    public Object visitGenericInterfaceMethodDeclaration(KaonParser.GenericInterfaceMethodDeclarationContext ctx) {
//        return super.visitGenericInterfaceMethodDeclaration(ctx);
//    }
//
//    @Override
//    public Object visitVariableDeclarators(KaonParser.VariableDeclaratorsContext ctx) {
//        return super.visitVariableDeclarators(ctx);
//    }
//
//    @Override
//    public Object visitVariableDeclarator(KaonParser.VariableDeclaratorContext ctx) {
//        String context = ctx.getText();
//        if(context.contains("=")) {
//            String identifiers = this.visit(ctx.variableDeclaratorId()).toString();
//            String value = this.visit(ctx.variableInitializer()).toString();
//
//            identifiers = identifiers.replaceAll("[^a-zA-Z0-9]", "");
//            valueMap.put(identifiers, value);
//        }
//        return this.visit(ctx.variableDeclaratorId());
//    }
//
//    @Override
//    public Object visitVariableDeclaratorId(KaonParser.VariableDeclaratorIdContext ctx) {
//        ArrayList<String> variables = new ArrayList<>();
//        variables.add(ctx.getText());
//        return variables;
//    }
//
//    @Override
//    public Object visitVariableInitializer(KaonParser.VariableInitializerContext ctx) {
//        return this.visit(ctx.expression());
//    }
//
//    @Override
//    public Object visitArrayInitializer(KaonParser.ArrayInitializerContext ctx) {
//        return super.visitArrayInitializer(ctx);
//    }
//
//    @Override
//    public Object visitClassOrInterfaceType(KaonParser.ClassOrInterfaceTypeContext ctx) {
//        return super.visitClassOrInterfaceType(ctx);
//    }
//
//    @Override
//    public Object visitTypeArgument(KaonParser.TypeArgumentContext ctx) {
//        return super.visitTypeArgument(ctx);
//    }
//
//    @Override
//    public Object visitQualifiedNameList(KaonParser.QualifiedNameListContext ctx) {
//        return super.visitQualifiedNameList(ctx);
//    }
//
//    @Override
//    public Object visitFormalParameters(KaonParser.FormalParametersContext ctx) {
//        return super.visitFormalParameters(ctx);
//    }
//
//    @Override
//    public Object visitFormalParameterList(KaonParser.FormalParameterListContext ctx) {
//        return super.visitFormalParameterList(ctx);
//    }
//
//    @Override
//    public Object visitFormalParameter(KaonParser.FormalParameterContext ctx) {
//        return super.visitFormalParameter(ctx);
//    }
//
//    @Override
//    public Object visitLastFormalParameter(KaonParser.LastFormalParameterContext ctx) {
//        return super.visitLastFormalParameter(ctx);
//    }
//
//    @Override
//    public Object visitQualifiedName(KaonParser.QualifiedNameContext ctx) {
//        return super.visitQualifiedName(ctx);
//    }
//
//    @Override
//    public Object visitLiteral(KaonParser.LiteralContext ctx) {
//        return super.visitLiteral(ctx);
//    }
//
//    @Override
//    public Object visitIntegerLiteral(KaonParser.IntegerLiteralContext ctx) {
//        return super.visitIntegerLiteral(ctx);
//    }
//
//    @Override
//    public Object visitFloatLiteral(KaonParser.FloatLiteralContext ctx) {
//        return super.visitFloatLiteral(ctx);
//    }
//
//    @Override
//    public Object visitAnnotation(KaonParser.AnnotationContext ctx) {
//        return super.visitAnnotation(ctx);
//    }
//
//    @Override
//    public Object visitElementValuePairs(KaonParser.ElementValuePairsContext ctx) {
//        return super.visitElementValuePairs(ctx);
//    }
//
//    @Override
//    public Object visitElementValuePair(KaonParser.ElementValuePairContext ctx) {
//        return super.visitElementValuePair(ctx);
//    }
//
//    @Override
//    public Object visitElementValue(KaonParser.ElementValueContext ctx) {
//        return super.visitElementValue(ctx);
//    }
//
//    @Override
//    public Object visitElementValueArrayInitializer(KaonParser.ElementValueArrayInitializerContext ctx) {
//        return super.visitElementValueArrayInitializer(ctx);
//    }
//
//    @Override
//    public Object visitDefaultValue(KaonParser.DefaultValueContext ctx) {
//        return super.visitDefaultValue(ctx);
//    }
//
//    @Override
//    public Object visitBlock(KaonParser.BlockContext ctx) {
//        return super.visitBlock(ctx);
//    }
//
//    @Override
//    public Object visitBlockStatement(KaonParser.BlockStatementContext ctx) {
//        if (ctx.getText().contains("plate")) {
//            System.out.println(ctx.getText().substring(6, ctx.getText().length() - 2));
//        } else if (ctx.getText().contains("shop")) {
//            System.out.print("> ");
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//
//            System.out.println("[DEBUG] " + input);
//        }
//            return super.visitBlockStatement(ctx);
//    }
//
//    @Override
//    public Object visitLocalVariableDeclaration(KaonParser.LocalVariableDeclarationContext ctx) {
//        String variable = this.visit(ctx.variableDeclarators()).toString();
//        String type = this.visit(ctx.typeType()).toString();
//
//        variable = variable.replaceAll("[^a-zA-Z0-9]", "");
//        String varValue = "";
//
//        if(valueMap.size() > 0) {
//            if(valueMap.containsKey(variable))
//                varValue = valueMap.get(variable);
//        }
//
//        VariableSymbol vs = new VariableSymbol(variable, type, false, varValue);
//
//        symbolTable.put(variable, vs);
//
//        return 0;
//    }
//
//    @Override
//    public Object visitStatement(KaonParser.StatementContext ctx) {
//        String text = ctx.getText();
//        if (text.contains("beef")) {
//            this.visit(ctx.parExpression());
//        }
//        return super.visitStatement(ctx);
//    }
//
//    @Override
//    public Object visitCompareExpression(KaonParser.CompareExpressionContext ctx) {
//        return super.visitCompareExpression(ctx);
//    }
//
//    @Override
//    public Object visitForError(KaonParser.ForErrorContext ctx) {
//        return super.visitForError(ctx);
//    }
//
//    @Override
//    public Object visitCatchClause(KaonParser.CatchClauseContext ctx) {
//        return super.visitCatchClause(ctx);
//    }
//
//    @Override
//    public Object visitCatchType(KaonParser.CatchTypeContext ctx) {
//        return super.visitCatchType(ctx);
//    }
//
//    @Override
//    public Object visitFinallyBlock(KaonParser.FinallyBlockContext ctx) {
//        return super.visitFinallyBlock(ctx);
//    }
//
//    @Override
//    public Object visitResourceSpecification(KaonParser.ResourceSpecificationContext ctx) {
//        return super.visitResourceSpecification(ctx);
//    }
//
//    @Override
//    public Object visitResources(KaonParser.ResourcesContext ctx) {
//        return super.visitResources(ctx);
//    }
//
//    @Override
//    public Object visitResource(KaonParser.ResourceContext ctx) {
//        return super.visitResource(ctx);
//    }
//
//    @Override
//    public Object visitSwitchBlockStatementGroup(KaonParser.SwitchBlockStatementGroupContext ctx) {
//        return super.visitSwitchBlockStatementGroup(ctx);
//    }
//
//    @Override
//    public Object visitSwitchLabel(KaonParser.SwitchLabelContext ctx) {
//        return super.visitSwitchLabel(ctx);
//    }
//
//    @Override
//    public Object visitForControl(KaonParser.ForControlContext ctx) {
//        return super.visitForControl(ctx);
//    }
//
//    @Override
//    public Object visitForInit(KaonParser.ForInitContext ctx) {
//        return super.visitForInit(ctx);
//    }
//
//    @Override
//    public Object visitEnhancedForControl(KaonParser.EnhancedForControlContext ctx) {
//        return super.visitEnhancedForControl(ctx);
//    }
//
//    @Override
//    public Object visitParExpression(KaonParser.ParExpressionContext ctx) {
//        Object temp = this.visit(ctx.expression());
//        return temp;
//    }
//
//    @Override
//    public Object visitExpressionList(KaonParser.ExpressionListContext ctx) {
//        return super.visitExpressionList(ctx);
//    }
//
//    @Override
//    public Object visitMethodCall(KaonParser.MethodCallContext ctx) {
//        return super.visitMethodCall(ctx);
//    }
//
//    @Override
//    public Object visitExpression(KaonParser.ExpressionContext ctx) {
//        String text = ctx.getText();
//        boolean numeric = false;
//
//        try {
//            Double.parseDouble(text);
//            numeric = true;
//        } catch (NumberFormatException ignored) {
//        }
//
//        if (numeric) {
//            return text;
//        } else if (text.contains("==")) {
//            Object variables = this.visit((ParseTree) ctx.expression());
//        } else if(text.contains("=")) {
//
////            System.out.println(this.visit((ParseTree) ctx.expression()));
////            Object variables = ;
//        } else if(text.contains("+") || text.contains("-") || text.contains("*") || text.contains("/")) {
//            System.out.println();
//            Expression expr = new Expression(text);
//        }
//
//        return text;
//    }
//
//    @Override
//    public Object visitExpressionError(KaonParser.ExpressionErrorContext ctx) {
//        return super.visitExpressionError(ctx);
//    }
//
//    @Override
//    public Object visitPrimary(KaonParser.PrimaryContext ctx) {
//        return super.visitPrimary(ctx);
//    }
//
//    @Override
//    public Object visitArrayCreatorRest(KaonParser.ArrayCreatorRestContext ctx) {
//        return super.visitArrayCreatorRest(ctx);
//    }
//
//    @Override
//    public Object visitTypeList(KaonParser.TypeListContext ctx) {
//        return super.visitTypeList(ctx);
//    }
//
//    @Override
//    public Object visitTypeType(KaonParser.TypeTypeContext ctx) {
//        if(ctx.getChild(0) instanceof KaonParser.PrimitiveTypeContext) {
//            return ctx.getText();
//        } else {
//            System.out.println("Array");
//        }
//        return super.visitTypeType(ctx);
//    }
//
//    @Override
//    public Object visitPrimitiveType(KaonParser.PrimitiveTypeContext ctx) {
//        return super.visitPrimitiveType(ctx);
//    }
//
//    @Override
//    public Object visitTypeArguments(KaonParser.TypeArgumentsContext ctx) {
//        return super.visitTypeArguments(ctx);
//    }
//
//    @Override
//    public Object visitArguments(KaonParser.ArgumentsContext ctx) {
//        return super.visitArguments(ctx);
//    }
//
//    @Override
//    public Object visitScanMissingIdentifierError(KaonParser.ScanMissingIdentifierErrorContext ctx) {
//        Controller.errors.add("Missing identifier at line " + ctx.getStart().getLine());
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public Object visitExpressionAdditionError(KaonParser.ExpressionAdditionErrorContext ctx) {
//        Controller.errors.add("A literal cannot be followed by '++' at line " + ctx.getStart().getLine());
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public Object visitExpressionSubtractionError(KaonParser.ExpressionSubtractionErrorContext ctx) {
//        Controller.errors.add("A literal cannot be followed by '--' at line " + ctx.getStart().getLine());
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public Object visitReturnMissingError(KaonParser.ReturnMissingErrorContext ctx) {
//        Controller.errors.add("Expected ';' at line " + ctx.getStart().getLine());
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public Object visitReturnPrimitiveTypeError(KaonParser.ReturnPrimitiveTypeErrorContext ctx) {
//        Controller.errors.add("Cannot return an explicit data type at line " + ctx.getStart().getLine());
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public Object visitExcessLParenExpression(KaonParser.ExcessLParenExpressionContext ctx) {
//        Controller.errors.add("Excess '(' found at line " + ctx.getStart().getLine());
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public Object visitExcessRParenExpression(KaonParser.ExcessRParenExpressionContext ctx) {
//        Controller.errors.add("Excess ')' found at line " + ctx.getStart().getLine());
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public Object visitWrongLocalVariableDeclaration(KaonParser.WrongLocalVariableDeclarationContext ctx) {
//        Controller.errors.add("Extra ';' found at line " + ctx.getStart().getLine());
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public Object visitWrongPrintStatement(KaonParser.WrongPrintStatementContext ctx) {
//        Controller.errors.add("Unexpected operator at line " + ctx.getStart().getLine());
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public Object visitWrongBlockStatement(KaonParser.WrongBlockStatementContext ctx) {
//        Controller.errors.add("Missing '}' at line " + ctx.getStart().getLine());
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public Object visitPrintMissingQuotesError(KaonParser.PrintMissingQuotesErrorContext ctx) {
//        Controller.errors.add("Missing double quotes at line " + ctx.getStart().getLine());
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public Object visitPrimaryError(KaonParser.PrimaryErrorContext ctx) {
//        Controller.errors.add("Extra opening or parenthesis at line " + ctx.getStart().getLine());
//        return visitChildren(ctx);
//    }
//
////    public void printTable() {
////        System.out.println("SymbolName \t SymbolType \t Value");
////        for (Symbol s : symbolTable) {
////            if(s instanceof VariableSymbol)
////                System.out.println(s.toString());
////        }
////    }
//}
