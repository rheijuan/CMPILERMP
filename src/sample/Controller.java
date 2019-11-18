package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class Controller implements Initializable {

    @FXML TextArea codeTextArea;
    @FXML TextArea errorTextArea;

    static ArrayList<String> errors;

    @FXML
    private void execute() {
        parse();
    }

    private void parse() {
        String code = codeTextArea.getText();

        if(!code.equals("")) {
            CodePointCharStream inputStream = fromString(code);

            GrammarLexer lexer = new GrammarLexer(inputStream);
            lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            GrammarParser parser = new GrammarParser(commonTokenStream);
            GrammarErrorListener listener = new GrammarErrorListener();
            parser.removeErrorListener(ConsoleErrorListener.INSTANCE);

            parser.addErrorListener(listener);
            ParseTree tree = parser.compilationUnit();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);

            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
            // viewer.open();

            if(errors.size() > 0) {
                errorTextArea.setText("");
                for(String err : errors)
                    errorTextArea.appendText(err + "\n");
                errors.clear();
            }

        } else {
            System.out.println("Code Text Area is Empty");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        errors = new ArrayList<>();

        errorTextArea.setEditable(false);
    }
}
