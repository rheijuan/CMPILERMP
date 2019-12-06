package main;

import antlr4.KaonBaseVisitor;
import antlr4.KaonParser;
import com.udojava.evalex.Expression;
import symbol_table.VariableSymbol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MrVisitor extends KaonBaseVisitor {

    @Override public Object visitCompilationUnit(KaonParser.CompilationUnitContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMethodDeclaration(KaonParser.MethodDeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMethodBody(KaonParser.MethodBodyContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTypeTypeOrVoid(KaonParser.TypeTypeOrVoidContext ctx) { return visitChildren(ctx); }

    @Override public Object visitConstDeclaration(KaonParser.ConstDeclarationContext ctx) {
        String type = this.visit(ctx.typeType()).toString();
        Object constantDeclarator = this.visit(ctx.getChild(2));

        List<String> parsedValues = (List<String>) convertObjectToList(constantDeclarator);

        String name = parsedValues.get(0);
        String value = parsedValues.get(1);

        VariableSymbol variableSymbol = new VariableSymbol(name, type, true, value);

        // TODO: push variable into symbol table

        return visitChildren(ctx);
    }

    private static List<?> convertObjectToList(Object obj) {
        List<?> list = new ArrayList<>();
        if (obj.getClass().isArray()) {
            list = Arrays.asList((Object[])obj);
        } else if (obj instanceof Collection) {
            list = new ArrayList<>((Collection<?>)obj);
        }
        return list;
    }

    @Override public Object visitConstantDeclarator(KaonParser.ConstantDeclaratorContext ctx) {
        String name = ctx.getChild(0).toString();
        String variableInitializer = this.visit(ctx.getChild(2)).toString();
        ArrayList<String> children = new ArrayList<>();
        children.add(name);
        children.add(variableInitializer);

        return children;
    }

    @Override public Object visitVariableDeclarators(KaonParser.VariableDeclaratorsContext ctx) {
        return this.visit(ctx.variableDeclarator(0));
    }

    @Override public Object visitVariableDeclarator(KaonParser.VariableDeclaratorContext ctx) {
        String variableId = this.visit(ctx.variableDeclaratorId()).toString();
        String variableInitializer = this.visit(ctx.getChild(2)).toString();

        ArrayList<String> children = new ArrayList<>();
        children.add(variableId);
        children.add(variableInitializer);

        return children;
    }

    @Override public Object visitVariableDeclaratorId(KaonParser.VariableDeclaratorIdContext ctx) { return ctx.getText(); }

    @Override public Object visitVariableInitializer(KaonParser.VariableInitializerContext ctx) { return this.visit(ctx.expression()); }

    @Override public Object visitArrayInitializer(KaonParser.ArrayInitializerContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFormalParameters(KaonParser.FormalParametersContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFormalParameterList(KaonParser.FormalParameterListContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFormalParameter(KaonParser.FormalParameterContext ctx) { return visitChildren(ctx); }

    @Override public Object visitLastFormalParameter(KaonParser.LastFormalParameterContext ctx) { return visitChildren(ctx); }

    @Override public Object visitLiteral(KaonParser.LiteralContext ctx) { return visitChildren(ctx); }

    @Override public Object visitIntegerLiteral(KaonParser.IntegerLiteralContext ctx) {
        return ctx.getText();
    }

    @Override public Object visitFloatLiteral(KaonParser.FloatLiteralContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBlock(KaonParser.BlockContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBlockStatement(KaonParser.BlockStatementContext ctx) {
        String context = ctx.getText();
        if(context.contains("garnish")) {
            // Pushing a constant variable into the symbol table
            return this.visit(ctx.constDeclaration());
        } else if(context.contains("beef")) {
            return this.visit(ctx.statement());
        } else if(context.contains("=")) {
            // Pushing a variable into the symbol table
//            return this.visit(ctx.localVariableDeclaration());
        }
        return visitChildren(ctx);
    }

    @Override public Object visitLocalVariableDeclaration(KaonParser.LocalVariableDeclarationContext ctx) {
        String type = this.visit(ctx.typeType()).toString();
        Object variableDeclarators = this.visit(ctx.variableDeclarators());

        List<String> parsedValues = (List<String>) convertObjectToList(variableDeclarators);

        String name = parsedValues.get(0);
        String value = parsedValues.get(1);

        VariableSymbol variableSymbol = new VariableSymbol(name, type, false, value);

        // TODO: push variable into symbol table

        return visitChildren(ctx);
    }

    @Override public Object visitStatement(KaonParser.StatementContext ctx) {
        String context = ctx.getText();
        if(context.contains("beef")) {
            String expression = this.visit(ctx.parExpression()).toString();
            Expression expr = new Expression(expression);

            String result = expr.eval().toString();

            if(result.equals("0"))
                System.out.println("False");
            else
                System.out.println("True");

            return expression;
        } else if(context.contains("=")) {

            Object values = this.visitExpression(ctx.expression());

            // TODO: Look for the varible in the lookup table and update value

            List<String> parsedValues = (List<String>) convertObjectToList(values);

            String name = parsedValues.get(0);
            String newValue = parsedValues.get(1);

        }
        return visitChildren(ctx);
    }

    @Override public Object visitForControl(KaonParser.ForControlContext ctx) { return visitChildren(ctx); }

    @Override public Object visitForInit(KaonParser.ForInitContext ctx) { return visitChildren(ctx); }

    @Override public Object visitParExpression(KaonParser.ParExpressionContext ctx) {
        return ctx.getText();
    }

    @Override public Object visitExpressionList(KaonParser.ExpressionListContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMethodCall(KaonParser.MethodCallContext ctx) { return visitChildren(ctx); }

    @Override public Object visitExpression(KaonParser.ExpressionContext ctx) {
        String context = ctx.getText();
        if(context.contains("==")) {
            System.out.println("Hello");
        } else if(context.contains("=")) {
            String name = this.visitExpression(ctx.expression(0)).toString();
            String varValue = this.visitExpression(ctx.expression(1)).toString();

            List<String> children = (List<String>) convertObjectToList(varValue);

            children.add(name);
            children.add(varValue);

            return children;
        } else if(context.contains("+") || context.contains("-")) {
            // TODO: check if variables are in the symbol table
            Expression expr = new Expression(context);
            return expr.eval().toString();
        } else if(context.contains("*") || context.contains("/") || context.contains("%")) {

        }
        return ctx.getText();
    }

    @Override public Object visitPrimary(KaonParser.PrimaryContext ctx) {
        String context = ctx.getText();

        if(context.contains("+") || context.contains("-") || context.contains("*") || context.contains("/") || context.contains("%")) {
            return this.visit(ctx.expression());
        } else
            return ctx.getText();
    }

    @Override public Object visitTypeType(KaonParser.TypeTypeContext ctx) { return visitChildren(ctx); }

    @Override public Object visitPrimitiveType(KaonParser.PrimitiveTypeContext ctx) { return ctx.getText(); }
}
