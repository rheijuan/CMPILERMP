package driver;

import antlr4.KaonBaseVisitor;
import antlr4.KaonParser;

public class ErrorVisitor extends KaonBaseVisitor {

    @Override public Object visitSource(KaonParser.SourceContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBlock(KaonParser.BlockContext ctx) { return visitChildren(ctx); }

    @Override public Object visitStatement(KaonParser.StatementContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitAssignment(KaonParser.AssignmentContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitConstantAssignment(KaonParser.ConstantAssignmentContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitIfStatement(KaonParser.IfStatementContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitIfStat(KaonParser.IfStatContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitElseIfStat(KaonParser.ElseIfStatContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitElseStat(KaonParser.ElseStatContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitFunctionDecl(KaonParser.FunctionDeclContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitMissingLBraceFuncDecl(KaonParser.MissingLBraceFuncDeclContext ctx) {
        Kaon.addErrors("Function declaration has no opening brace ({) at line " + ctx.getStart().getLine());

        return visitChildren(ctx);
    }
    
    @Override public Object visitMissingRBraceFuncDecl(KaonParser.MissingRBraceFuncDeclContext ctx) {
        Kaon.addErrors("Function declaration has no closing brace (}) at line " + ctx.getStart().getLine());

        return visitChildren(ctx);
    }
    
    @Override public Object visitForStatement(KaonParser.ForStatementContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitMissingLBraceForLoop(KaonParser.MissingLBraceForLoopContext ctx) {
        Kaon.addErrors("Pork loop does not have an opening brace ({) at line " + ctx.getStart().getLine());

        return visitChildren(ctx);
    }
    
    @Override public Object visitMissingRBraceForLoop(KaonParser.MissingRBraceForLoopContext ctx) {
        Kaon.addErrors("Pork loop does not have a closing brace (}) at line " + ctx.getStart().getLine());

        return visitChildren(ctx);
    }
    
    @Override public Object visitWhileStatement(KaonParser.WhileStatementContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitMissingLBraceWhileLoop(KaonParser.MissingLBraceWhileLoopContext ctx) {
        Kaon.addErrors("Wine loop does not have an opening brace ({) at line " + ctx.getStart().getLine());

        return visitChildren(ctx);
    }
    
    @Override public Object visitMissingRBraceWhileLoop(KaonParser.MissingRBraceWhileLoopContext ctx) {
        Kaon.addErrors("Wine loop does not have a closing brace (}) at line " + ctx.getStart().getLine());

        return visitChildren(ctx);
    }
    
    @Override public Object visitDoWhileStatement(KaonParser.DoWhileStatementContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitMissingLBraceDoWhileLoop(KaonParser.MissingLBraceDoWhileLoopContext ctx) {
        Kaon.addErrors("Doughnut-Wine loop does not have an opening brace ({) at line " + ctx.getStart().getLine());

        return visitChildren(ctx);
    }
    
    @Override public Object visitMissingRBraceDoWhileLoop(KaonParser.MissingRBraceDoWhileLoopContext ctx) {
        Kaon.addErrors("Doughnut-Wine loop does not have a closing brace (}) at line " + ctx.getStart().getLine());

        return visitChildren(ctx);
    }
    
    @Override public Object visitIdentifierFunctionCall(KaonParser.IdentifierFunctionCallContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitPrintlnFunctionCall(KaonParser.PrintlnFunctionCallContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitPrintFunctionCall(KaonParser.PrintFunctionCallContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitMissingLParenPrintStatement(KaonParser.MissingLParenPrintStatementContext ctx) {
        Kaon.addErrors("Missing ')' token at function call at line " + ctx.getStart().getLine());

        return visitChildren(ctx);
    }
    
    @Override public Object visitMissingRParenStatement(KaonParser.MissingRParenStatementContext ctx) {
        Kaon.addErrors("Error in visitMissingRParenStatement");
        return visitChildren(ctx);
    }
    
    @Override public Object visitIdList(KaonParser.IdListContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitExprList(KaonParser.ExprListContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitBoolExpression(KaonParser.BoolExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitNumberExpression(KaonParser.NumberExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitIdentifierExpression(KaonParser.IdentifierExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitMissingLParenExpression(KaonParser.MissingLParenExpressionContext ctx) {
        Kaon.addErrors("Excess ')' or missing '(' in line " + ctx.getStart().getLine());

        return visitChildren(ctx);
    }
    
    @Override public Object visitNotExpression(KaonParser.NotExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitOrExpression(KaonParser.OrExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitUnaryMinusExpression(KaonParser.UnaryMinusExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitPowerExpression(KaonParser.PowerExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitEqExpression(KaonParser.EqExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitAndExpression(KaonParser.AndExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitInExpression(KaonParser.InExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitStringExpression(KaonParser.StringExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitExpressionExpression(KaonParser.ExpressionExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitCompExpression(KaonParser.CompExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitNullExpression(KaonParser.NullExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitMissingRParenExpression(KaonParser.MissingRParenExpressionContext ctx) {
        Kaon.addErrors("Excess '(' or missing ')' in line " + ctx.getStart().getLine());

        return visitChildren(ctx);
    }
    
    @Override public Object visitExcessOperationExpression(KaonParser.ExcessOperationExpressionContext ctx) {
        Kaon.addErrors("Excess operation (+, -, *, /, %) found in line " + ctx.getStart().getLine());

        return visitChildren(ctx);
    }
    
    @Override public Object visitADDExpression(KaonParser.ADDExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitFunctionCallExpression(KaonParser.FunctionCallExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitMultExpression(KaonParser.MultExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitListExpression(KaonParser.ListExpressionContext ctx) { return visitChildren(ctx); }

    @Override public Object visitInputExpression(KaonParser.InputExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitIndexes(KaonParser.IndexesContext ctx) { return visitChildren(ctx); }
    
    @Override public Object visitList(KaonParser.ListContext ctx) { return visitChildren(ctx); }
}
