package interpreter;

import org.antlr.v4.runtime.ParserRuleContext;

public class KaonException extends RuntimeException {
    public KaonException(ParserRuleContext ctx) {
        this("Illegal expression: " + ctx.getText(), ctx);
    }

    public KaonException(String msg, ParserRuleContext ctx) {
        super(msg + " line:" + ctx.start.getLine());
    }
}
