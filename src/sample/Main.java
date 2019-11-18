package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
        primaryStage.setTitle("CMPILER MP IDE");
        primaryStage.setScene(new Scene(root, 876, 570));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        // lexer();
    }

    private static void lexer() {
        String path = "test_cases/parser_test_1.txt";
        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        GrammarLexer lexer = new GrammarLexer(fromString(content));
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
}
