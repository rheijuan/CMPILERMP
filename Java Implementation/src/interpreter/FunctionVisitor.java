package interpreter;

import antlr4.KaonBaseVisitor;
import antlr4.KaonParser;
import model.KaonData;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionVisitor extends KaonBaseVisitor<KaonData> {

    private Map<String, Function> functions;

    public FunctionVisitor(HashMap<String, Function> functions) {
        this.functions = functions;
    }

    // Stores the all functions and its tree to the main functions variable
    @Override
    public KaonData visitFunctionDecl(KaonParser.FunctionDeclContext ctx) {
        List<TerminalNode> params;

        if (ctx.idList() != null) {
            params = ctx.idList().IDENTIFIER();
        } else {
            params = new ArrayList<TerminalNode>();
        }

        String id = ctx.IDENTIFIER().getText() + params.size();

        ParseTree block = ctx.block();

        functions.put(id, new Function(params, block));

        return KaonData.VOID;
    }
}
