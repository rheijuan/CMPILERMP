package driver;

import antlr4.KaonLexer;
import antlr4.KaonParser;
import interpreter.FunctionVisitor;
import interpreter.TheVisitor;
import interpreter.Function;
import model.Scope;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Kaon {
    public static void main(String[] args) throws IOException {
        KaonLexer lexer = new KaonLexer(fromFileName("input/fibonacci.kaon"));
        KaonParser parser = new KaonParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.source();
        Scope scope = new Scope();
        HashMap<String, Function> functions = new HashMap<>();

        FunctionVisitor functionVisitor = new FunctionVisitor(functions);
        functionVisitor.visit(tree);
        TheVisitor theVisitor = new TheVisitor(scope, functions);
        theVisitor.visit(tree);
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        //viewer.open();
    }
}
