package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
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

    @FXML AnchorPane renameAnchorPane;
    @FXML TextArea functionTextArea;
    @FXML TextArea replacementTextArea;

    static ArrayList<String> errors;

    @FXML
    private void execute() {
        parse();
    }

    @FXML
    private void showInstructions() {

    }

    @FXML
    private void rename() {
        renameAnchorPane.setVisible(true);
    }

    @FXML
    private void cancelRename() {
        functionTextArea.setText("");
        replacementTextArea.setText("");
        renameAnchorPane.setVisible(false);
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

    private void lex() {
        String code = codeTextArea.getText();

        GrammarLexer lexer = new GrammarLexer(fromString(code));
        CommonTokenStream token = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(token);

        ParseTree tree = parser.compilationUnit();
        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);

        token.fill();

        // ORIGINAL LOOP
        for(int i = 0; i < token.getTokens().size(); i++) {
            for(int j = 1; j <= lexer.getVocabulary().getMaxTokenType(); j++) {

                if(token.getTokens().get(i).getType() == j && token.getTokens().get(i).getType() >= 1 && token.getTokens().get(i).getType() <= 36)
                    System.out.println(lexer.getVocabulary().getDisplayName(j) + ": KEYWORDS");

                else if(token.getTokens().get(i).getType() == j && token.getTokens().get(i).getType() >= 37 && token.getTokens().get(i).getType() <= 46)
                    System.out.println(token.getTokens().get(i).getText() + ": LITERAL");

                else if(token.getTokens().get(i).getType() == j && token.getTokens().get(i).getType() >= 47 && token.getTokens().get(i).getType() <= 55)
                    System.out.println(lexer.getVocabulary().getDisplayName(j) + ": SEPARATOR");

                else if(token.getTokens().get(i).getType() == j && token.getTokens().get(i).getType() >= 56 && token.getTokens().get(i).getType() <= 89)
                    System.out.println(lexer.getVocabulary().getDisplayName(j) + ": OPERATOR");

                else if(token.getTokens().get(i).getType() == j && token.getTokens().get(i).getType() >= 95 && token.getTokens().get(i).getType() <= 96)
                    System.out.println(token.getTokens().get(i).getText() + ": COMMENTS");

                else if(token.getTokens().get(i).getType() == j && token.getTokens().get(i).getType() == 97)
                    System.out.println(token.getTokens().get(i).getText() + ": IDENTIFIER");
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        errors = new ArrayList<>();

        errorTextArea.setEditable(false);
//        renameAnchorPane.setVisible(false);
    }
}
