package main;

import antlr4.KaonLexer;
import antlr4.KaonParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Tester {
    public static void main(String[] args) throws IOException {

        CharStream inputStream = fromFileName("test_cases/test.txt");
        // CodePointCharStream inputStream = fromString("");

        KaonLexer lexer = new KaonLexer(inputStream);
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        KaonParser parser = new KaonParser(commonTokenStream);
        KaonErrorListener listener = new KaonErrorListener();
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);

        parser.addErrorListener(listener);
        ParseTree tree = parser.compilationUnit();
        TheVisitor visitor = new TheVisitor();
        visitor.visit(tree);

//        visitor.printTable();

//        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
//        viewer.open();
    }
}
