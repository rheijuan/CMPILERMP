package interpreter;

import antlr4.KaonBaseVisitor;
import antlr4.KaonLexer;
import antlr4.KaonParser;
import antlr4.KaonParser.*;
import model.KaonData;
import model.Scope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import driver.Kaon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class TheVisitor extends KaonBaseVisitor<KaonData> {
    private static RiceData returnValue = new RiceData();
    private Scope scope;
    private Map<String, Function> functions;

    public TheVisitor(Scope scope, Map<String, Function> functions) {
        this.scope = scope;
        this.functions = functions;
    }

    // functionDecl
    @Override
    public KaonData visitFunctionDecl(FunctionDeclContext ctx) {
        return KaonData.VOID;
    }

    // list: '[' exprList? ']'
    @Override
    public KaonData visitList(ListContext ctx) {
        List<KaonData> list = new ArrayList<>();
        if (ctx.exprList() != null) {
            for (ExpressionContext ex : ctx.exprList().expression()) {
                list.add(this.visit(ex));
            }
        }
        return new KaonData(list);
    }


    // '-' expression                           #unaryMinusExpression
    @Override
    public KaonData visitUnaryMinusExpression(UnaryMinusExpressionContext ctx) {
        KaonData v = this.visit(ctx.expression());
        if (!v.isNumber()) {
            throw new KaonException(ctx);
        }
        return new KaonData(-1 * v.asDouble());
    }

    // '!' expression                           #notExpression
    @Override
    public KaonData visitNotExpression(NotExpressionContext ctx) {
        KaonData v = this.visit(ctx.expression());
        if (!v.isBoolean()) {
            throw new KaonException(ctx);
        }
        return new KaonData(!v.asBoolean());
    }

    // expression '^' expression                #powerExpression
    @Override
    public KaonData visitPowerExpression(PowerExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new KaonData(Math.pow(lhs.asDouble(), rhs.asDouble()));
        }
        throw new KaonException(ctx);
    }

    // expression op=( '*' | '/' | '%' ) expression         #multExpression
    @Override
    public KaonData visitMultExpression(MultExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case KaonLexer.MUL:
                return MUL(ctx);
            case KaonLexer.DIV:
                return DIV(ctx);
            case KaonLexer.MOD:
                return MOD(ctx);
            default:
                throw new RuntimeException("unknown operator type: " + ctx.op.getType());
        }
    }

    // expression op=( '+' | '-' ) expression               #ADDExpression
    @Override
    public KaonData visitADDExpression(ADDExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case KaonLexer.ADD:
                return ADD(ctx);
            case KaonLexer.SUB:
                return SUB(ctx);
            default:
                throw new RuntimeException("unknown operator type: " + ctx.op.getType());
        }
    }

    // expression op=( '>=' | '<=' | '>' | '<' ) expression #compExpression
    @Override
    public KaonData visitCompExpression(CompExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case KaonLexer.LT:
                return lt(ctx);
            case KaonLexer.LTEQUALS:
                return ltEq(ctx);
            case KaonLexer.GT:
                return gt(ctx);
            case KaonLexer.GTEQUALS:
                return gtEq(ctx);
            default:
                throw new RuntimeException("unknown operator type: " + ctx.op.getType());
        }
    }

    // expression op=( '==' | '!=' ) expression             #eqExpression
    @Override
    public KaonData visitEqExpression(EqExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case KaonLexer.EQUALS:
                return eq(ctx);
            case KaonLexer.NEQUALS:
                return nEq(ctx);
            default:
                throw new RuntimeException("unknown operator type: " + ctx.op.getType());
        }
    }

    public KaonData MUL(MultExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));

        // number * number
        if (lhs.isNumber() && rhs.isNumber()) {
            return new KaonData(lhs.asDouble() * rhs.asDouble());
        }

        // string * number
        if (lhs.isString() && rhs.isNumber()) {
            StringBuilder str = new StringBuilder();
            int stop = rhs.asDouble().intValue();
            for (int i = 0; i < stop; i++) {
                str.append(lhs.asString());
            }
            return new KaonData(str.toString());
        }

        // list * number
        if (lhs.isList() && rhs.isNumber()) {
            List<KaonData> total = new ArrayList<>();
            int stop = rhs.asDouble().intValue();
            for (int i = 0; i < stop; i++) {
                total.addAll(lhs.asList());
            }
            return new KaonData(total);
        }

        throw new KaonException(ctx);
    }

    private KaonData DIV(MultExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));

        if (lhs.isNumber() && rhs.isNumber()) {
            return new KaonData(lhs.asDouble() / rhs.asDouble());
        }
        throw new KaonException(ctx);
    }

    private KaonData MOD(MultExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));

        if (lhs.isNumber() && rhs.isNumber()) {
            return new KaonData(lhs.asDouble() % rhs.asDouble());
        }
        throw new KaonException(ctx);
    }

    private KaonData ADD(ADDExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));

        // number + number
        if (lhs.isNumber() && rhs.isNumber()) {
            return new KaonData(lhs.asDouble() + rhs.asDouble());
        }

        // list + any
        if (lhs.isList()) {
            List<KaonData> list = lhs.asList();
            list.add(rhs);
            return new KaonData(list);
        }

        // string + any
        if (lhs.isString()) {
            return new KaonData(lhs.asString() + "" + rhs.toString());
        }

        // any + string
        if (rhs.isString()) {
            return new KaonData(lhs.toString() + "" + rhs.asString());
        }

        return new KaonData(lhs.toString() + rhs.toString());
    }

    private KaonData SUB(ADDExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));

        if (lhs.isNumber() && rhs.isNumber()) {
            return new KaonData(lhs.asDouble() - rhs.asDouble());
        }
        if (lhs.isList()) {
            List<KaonData> list = lhs.asList();
            list.remove(rhs);
            return new KaonData(list);
        }
        throw new KaonException(ctx);
    }

    private KaonData gtEq(CompExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));

        if (lhs.isNumber() && rhs.isNumber()) {
            return new KaonData(lhs.asDouble() >= rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new KaonData(lhs.asString().compareTo(rhs.asString()) >= 0);
        }
        throw new KaonException(ctx);
    }

    private KaonData ltEq(CompExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));

        if (lhs.isNumber() && rhs.isNumber()) {
            return new KaonData(lhs.asDouble() <= rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new KaonData(lhs.asString().compareTo(rhs.asString()) <= 0);
        }
        throw new KaonException(ctx);
    }

    private KaonData gt(CompExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));

        if (lhs.isNumber() && rhs.isNumber()) {
            return new KaonData(lhs.asDouble() > rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new KaonData(lhs.asString().compareTo(rhs.asString()) > 0);
        }
        throw new KaonException(ctx);
    }

    private KaonData lt(CompExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));

        if (lhs == null || rhs == null) {

            Kaon.appendOutput("Null Pointer Exception: Trying to compare with null");

            throw new KaonException(ctx);
        }

        if (lhs.isNumber() && rhs.isNumber()) {
            return new KaonData(lhs.asDouble() < rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new KaonData(lhs.asString().compareTo(rhs.asString()) < 0);
        }
        throw new KaonException(ctx);
    }

    private KaonData eq(EqExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));

        return new KaonData(lhs.equals(rhs));
    }

    private KaonData nEq(EqExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));

        return new KaonData(!lhs.equals(rhs));
    }

    // expression '&&' expression               #andExpression
    @Override
    public KaonData visitAndExpression(AndExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));

        if (!lhs.isBoolean() || !rhs.isBoolean()) {
            throw new KaonException(ctx);
        }
        return new KaonData(lhs.asBoolean() && rhs.asBoolean());
    }

    // expression '||' expression               #orExpression
    @Override
    public KaonData visitOrExpression(OrExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));

        if (!lhs.isBoolean() || !rhs.isBoolean()) {
            throw new KaonException(ctx);
        }
        return new KaonData(lhs.asBoolean() || rhs.asBoolean());
    }

    // expression '?' expression ':' expression #ternaryExpression
    @Override
    public KaonData visitTernaryExpression(TernaryExpressionContext ctx) {
        KaonData condition = this.visit(ctx.expression(0));
        if (condition.asBoolean()) {
            return new KaonData(this.visit(ctx.expression(1)));
        } else {
            return new KaonData(this.visit(ctx.expression(2)));
        }
    }

    // expression In expression                 #inExpression
    @Override
    public KaonData visitInExpression(InExpressionContext ctx) {
        KaonData lhs = this.visit(ctx.expression(0));
        KaonData rhs = this.visit(ctx.expression(1));

        if (rhs.isList()) {
            for (KaonData val : rhs.asList()) {
                if (val.equals(lhs)) {
                    return new KaonData(true);
                }
            }
            return new KaonData(false);
        }
        throw new KaonException(ctx);
    }

    // Number                                   #numberExpression
    @Override
    public KaonData visitNumberExpression(NumberExpressionContext ctx) {
        return new KaonData(Double.valueOf(ctx.getText()));
    }

    // Bool                                     #boolExpression
    @Override
    public KaonData visitBoolExpression(BoolExpressionContext ctx) {
        return new KaonData(Boolean.valueOf(ctx.getText()));
    }

    // Null                                     #nullExpression
    @Override
    public KaonData visitNullExpression(NullExpressionContext ctx) {
        return KaonData.NULL;
    }

    private KaonData resolveIndexes(KaonData val, List<ExpressionContext> indexes) {
        for (ExpressionContext ec : indexes) {
            KaonData idx = this.visit(ec);
            if (!idx.isNumber() || (!val.isList() && !val.isString())) {
                throw new KaonException("Problem resolving indexes on " + val + " at " + idx, ec);
            }
            int i = idx.asDouble().intValue();
            if (val.isString()) {
                val = new KaonData(val.asString().substring(i, i + 1));
            } else {
                val = val.asList().get(i);
            }
        }
        return val;
    }

    private void setAtIndex(ParserRuleContext ctx, List<ExpressionContext> indexes, KaonData val, KaonData newVal) {
        if (!val.isList()) {
            throw new KaonException(ctx);
        }
        for (int i = 0; i < indexes.size() - 1; i++) {
            KaonData idx = this.visit(indexes.get(i));
            if (!idx.isNumber()) {
                throw new KaonException(ctx);
            }
            val = val.asList().get(idx.asDouble().intValue());
        }
        KaonData idx = this.visit(indexes.get(indexes.size() - 1));
        if (!idx.isNumber()) {
            throw new KaonException(ctx);
        }
        val.asList().set(idx.asDouble().intValue(), newVal);
    }

    // functionCall indexes?                    #functionCallExpression
    @Override
    public KaonData visitFunctionCallExpression(FunctionCallExpressionContext ctx) {
        KaonData val = this.visit(ctx.functionCall());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    // list indexes?                            #listExpression
    @Override
    public KaonData visitListExpression(ListExpressionContext ctx) {
        KaonData val = this.visit(ctx.list());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    // Identifier indexes?                      #identifierExpression
    @Override
    public KaonData visitIdentifierExpression(IdentifierExpressionContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        KaonData val = scope.resolve(id);

        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    // String indexes?                          #stringExpression
    @Override
    public KaonData visitStringExpression(StringExpressionContext ctx) {
        String text = ctx.getText();
        text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
        KaonData val = new KaonData(text);
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    // '(' expression ')' indexes?              #expressionExpression
    @Override
    public KaonData visitExpressionExpression(ExpressionExpressionContext ctx) {
        KaonData val = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
                Kaon.appendOutput(val + " insideinsideinside vse");
        }

//        Kaon.appendOutput(val + "inside vse");
        return val;
    }

//    // Input '(' String? ')'                    #inputExpression
//    @Override
//    public KaonData visitInputExpression(InputExpressionContext ctx) {
//        String input = Kaon.getInput();
//        KaonData kaonInput = new KaonData(input);
//        System.out.println(kaonInput.toString());
//
//
////        TerminalNode inputString = ctx.STRING();
////        try {
////            if (inputString != null) {
////                String text = inputString.getText();
////                text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
////                return new KaonData(new String(Files.readAllBytes(Paths.get(text))));
////            } else {
////                BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
////                return new KaonData(buffer.readLine());
////            }
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
//
//        return kaonInput;
//    }


    // assignment
    // : Identifier indexes? '=' expression
    // ;
    @Override
    public KaonData visitAssignment(AssignmentContext ctx) {
        if(ctx.getText().contains("pudding()")) {
            KaonData newVal = new KaonData(Kaon.getInput());
            String id = ctx.IDENTIFIER().getText();
            scope.assign(id, newVal);
            return KaonData.VOID;
        } else {
            KaonData newVal = this.visit(ctx.expression());
            if (ctx.indexes() != null) {
                KaonData val = scope.resolve(ctx.IDENTIFIER().getText());
                List<ExpressionContext> exps = ctx.indexes().expression();
                setAtIndex(ctx, exps, val, newVal);
            } else {
                String id = ctx.IDENTIFIER().getText();
                scope.assign(id, newVal);
            }
            return KaonData.VOID;
        }
    }

    // Identifier '(' exprList? ')' #identifierFunctionCall
    @Override
    public KaonData visitIdentifierFunctionCall(IdentifierFunctionCallContext ctx) {
        List<ExpressionContext> params = ctx.exprList() != null ? ctx.exprList().expression() : new ArrayList<ExpressionContext>();
        String id = ctx.IDENTIFIER().getText() + params.size();
        Function function;
        if ((function = functions.get(id)) != null) {
            return function.invoke(params, functions, scope);
        }
        throw new KaonException(ctx);
    }

    // Println '(' expression? ')'  #printlnFunctionCall
    @Override
    public KaonData visitPrintlnFunctionCall(PrintlnFunctionCallContext ctx) {
            Kaon.appendOutput(this.visit(ctx.expression()).toString());
        return KaonData.VOID;
    }

    // Print '(' expression ')'     #printFunctionCall
    @Override
    public KaonData visitPrintFunctionCall(PrintFunctionCallContext ctx) {
            Kaon.appendOutput(this.visit(ctx.expression()).toString());
        return KaonData.VOID;
    }

    // ifStatement
    //  : ifStat elseIfStat* elseStat? End
    //  ;
    //
    // ifStat
    //  : If expression Do block
    //  ;
    //
    // elseIfStat
    //  : Else If expression Do block
    //  ;
    //
    // elseStat
    //  : Else Do block
    //  ;
    @Override
    public KaonData visitIfStatement(IfStatementContext ctx) {

        // if ...
        if (this.visit(ctx.ifStat().expression()).asBoolean()) {
            return this.visit(ctx.ifStat().block());
        }
        // else if ...
        for (int i = 0; i < ctx.elseIfStat().size(); i++) {
            if (this.visit(ctx.elseIfStat(i).expression()).asBoolean()) {
                return this.visit(ctx.elseIfStat(i).block());
            }
        }

        // else ...
        if (ctx.elseStat() != null) {
            return this.visit(ctx.elseStat().block());
        }

        return KaonData.VOID;
    }

    // block
    // : (statement | functionDecl)* (Return expression)?
    // ;
    @Override
    public KaonData visitBlock(BlockContext ctx) {

        scope = new Scope(scope); // create new local scope
        for (StatementContext sx : ctx.statement()) {
            this.visit(sx);
        }
        ExpressionContext ex;
        if ((ex = ctx.expression()) != null) {
            returnValue.value = this.visit(ex);
            scope = scope.parent();
            throw returnValue;
        }
        scope = scope.parent();
        return KaonData.VOID;
    }

    // forStatement
    // : For Identifier '=' expression To expression OBrace block CBrace
    // ;
    @Override
    public KaonData visitForStatement(ForStatementContext ctx) {
        int start = this.visit(ctx.expression(0)).asDouble().intValue();
        int stop = this.visit(ctx.expression(1)).asDouble().intValue();
        for (int i = start; i <= stop; i++) {
            scope.assign(ctx.IDENTIFIER().getText(), new KaonData(i));
            KaonData returnValue = this.visit(ctx.block());
            if (returnValue != KaonData.VOID) {
                return returnValue;
            }
        }
        return KaonData.VOID;
    }

    // whileStatement
    // : While expression OBrace block CBrace
    // ;
    @Override
    public KaonData visitWhileStatement(WhileStatementContext ctx) {
        while (this.visit(ctx.expression()).asBoolean()) {
            KaonData returnValue = this.visit(ctx.block());
            if (returnValue != KaonData.VOID) {
                return returnValue;
            }
        }
        return KaonData.VOID;
    }

    @Override
    public KaonData visitDoWhileStatement(DoWhileStatementContext ctx) {
        do {
            KaonData returnValue = this.visit(ctx.block());
            if (returnValue != KaonData.VOID) {
                return returnValue;
            }
        } while (this.visit(ctx.expression()).asBoolean());
        return KaonData.VOID;
    }

    @Override
    public KaonData visitTryCatchNullStatement(TryCatchNullStatementContext ctx) {
        try{
            scope = new Scope(scope);
            for(StatementContext sx : ctx.statement()) {
                this.visit(sx);
            }
        } catch(NullPointerException e) {
            scope = new Scope(scope);
            for(StatementContext sx : ctx.statement()) {
                this.visit(sx);
            }
        } finally {
            scope = new Scope(scope);
            for(StatementContext sx : ctx.statement()) {
                this.visit(sx);
            }
        }
        return KaonData.VOID;
    }

    @Override public KaonData visitTryCatchIndexOutOfBoundsStatement(TryCatchIndexOutOfBoundsStatementContext ctx) {
        try {
            scope = new Scope(scope);
            for(StatementContext sx : ctx.statement()) {
                this.visit(sx);
            }
        } catch(IndexOutOfBoundsException e) {
            scope = new Scope(scope);
            for(StatementContext sx : ctx.statement()) {
                this.visit(sx);
            }
        } finally {
            scope = new Scope(scope);
            for(StatementContext sx : ctx.statement()) {
                this.visit(sx);
            }
        }

        return KaonData.VOID;
    }

    @Override public KaonData visitTryCatchDivideByZeroStatement(TryCatchDivideByZeroStatementContext ctx) {
        try{
            scope = new Scope(scope);
            for(StatementContext sx : ctx.statement()) {
                this.visit(sx);
            }
        } catch(ArithmeticException e) {
            scope = new Scope(scope);
            for(StatementContext sx : ctx.statement()) {
                this.visit(sx);
            }
        } finally {
            scope = new Scope(scope);
            for(StatementContext sx : ctx.statement()) {
                this.visit(sx);
            }
        }
        return KaonData.VOID;
    }
}
