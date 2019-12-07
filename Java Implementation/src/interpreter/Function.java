package interpreter;

import antlr4.KaonParser;
import model.KaonData;
import model.Scope;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Map;

public class Function {

    private List<TerminalNode> params;
    private ParseTree block;

    public Function(List<TerminalNode> params, ParseTree block) {
        this.params = params;
        this.block = block;
    }

    public KaonData invoke(List<KaonParser.ExpressionContext> params, Map<String, Function> functions, Scope scope) {
        if (params.size() != this.params.size()) {
            throw new RuntimeException("Illegal Function call");
        }
        Scope scopeNext = new Scope(null); // create function scope

        TheVisitor theVisitor = new TheVisitor(scope, functions);
        for (int i = 0; i < this.params.size(); i++) {
            KaonData value = theVisitor.visit(params.get(i));
            scopeNext.assignParam(this.params.get(i).getText(), value);
        }
        TheVisitor theVisitorNext = new TheVisitor(scopeNext, functions);

        KaonData ret = KaonData.VOID;
        try {
            theVisitorNext.visit(this.block);
        } catch (RiceData returnValue) {
            ret = returnValue.value;
        }
        return ret;
    }
}
