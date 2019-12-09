package driver;

import antlr4.KaonLexer;
import antlr4.KaonParser;
import interpreter.FunctionVisitor;
import interpreter.TheVisitor;
import interpreter.Function;
import model.Scope;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.fife.ui.autocomplete.AutoCompletion;
import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.DefaultCompletionProvider;
import org.fife.ui.rsyntaxtextarea.templates.CodeTemplate;
import org.fife.ui.rsyntaxtextarea.templates.StaticCodeTemplate;
import org.fife.ui.rtextarea.*;
import org.fife.ui.rsyntaxtextarea.*;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class Kaon extends JFrame {

    private JPanel cp;
    private static TextArea outputArea;
    private static ArrayList<String> errors;

    private Kaon() {
        cp = new JPanel();
        cp.setLayout(null);

        AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory)TokenMakerFactory.getDefaultInstance();
        atmf.putMapping("Kaon.g4", "TokenMaker");

        RSyntaxTextArea textArea = new RSyntaxTextArea(100, 100);
        textArea.setSyntaxEditingStyle("/Kaon.g4");
        textArea.setCodeFoldingEnabled(true);
        RTextScrollPane sp = new RTextScrollPane(textArea);
        cp.add(sp);
        textArea.setSize(700, 500);

        CompletionProvider provider = createCompletionProvider();
        AutoCompletion ac = new AutoCompletion(provider);
        ac.install(textArea);

        RSyntaxTextArea.setTemplatesEnabled(true);
        CodeTemplateManager ctm = RSyntaxTextArea.getCodeTemplateManager();

        CodeTemplate ct = new StaticCodeTemplate("pt", "plate(", null);
        ctm.addTemplate(ct);

        ct = new StaticCodeTemplate("it", "pudding(", null);
        ctm.addTemplate(ct);

        ct = new StaticCodeTemplate("pk", "pork i=0 to ", "{\n\t\n}\n");
        ctm.addTemplate(ct);

        ct = new StaticCodeTemplate("do", "donut { \n\n } wine(", ")\n");
        ctm.addTemplate(ct);

        ct = new StaticCodeTemplate("wn", "wine (", ") {\n\t\n}\n");
        ctm.addTemplate(ct);

        cp.add(textArea);
        textArea.setLocation(20, 20);

        outputArea = new TextArea();
        outputArea.setSize(950, 200);

        cp.add(outputArea);
        outputArea.setLocation(20, 550);

        ImageIcon imageIcon = new ImageIcon(Kaon.class.getResource("../images/rice.png"));
        Image image = imageIcon.getImage();
        image = image.getScaledInstance(75, 75,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);

        JLabel logo = new JLabel(imageIcon);
        logo.setSize(75, 75);

        cp.add(logo);
        logo.setLocation(750, 20);

        Label label = new Label("Kaon");
        label.setSize(150,50);
        label.setFont(new Font("Verdana", Font.BOLD, 40));

        cp.add(label);
        label.setLocation(850, 35);

        imageIcon = new ImageIcon(Kaon.class.getResource("../images/xchan.png"));
        image = imageIcon.getImage();
        image = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);

        JLabel icon1 = new JLabel(imageIcon);
        icon1.setSize(75, 75);

        cp.add(icon1);
        icon1.setLocation(730, 100);

        JLabel name1 = new JLabel("Christian Dequito");
        name1.setSize(200,75);
        name1.setFont(new Font("Verdana", Font.PLAIN, 16));

        cp.add(name1);
        name1.setLocation(810, 110);

        imageIcon = new ImageIcon(Kaon.class.getResource("../images/don.png"));
        image = imageIcon.getImage();
        image = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);

        JLabel icon2 = new JLabel(imageIcon);
        icon2.setSize(75, 75);

        cp.add(icon2);
        icon2.setLocation(730, 170);

        JLabel name2 = new JLabel("Don Minaga");
        name2.setSize(200,75);
        name2.setFont(new Font("Verdana", Font.PLAIN, 16));

        cp.add(name2);
        name2.setLocation(810, 175);

        imageIcon = new ImageIcon(Kaon.class.getResource("../images/ivan.png"));
        image = imageIcon.getImage();
        image = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);

        JLabel icon3 = new JLabel(imageIcon);
        icon3.setSize(75, 75);

        cp.add(icon3);
        icon3.setLocation(730, 240);

        JLabel name3 = new JLabel("Ivan Dichaves");
        name3.setSize(200,75);
        name3.setFont(new Font("Verdana", Font.PLAIN, 16));

        cp.add(name3);
        name3.setLocation(810, 245);

        imageIcon = new ImageIcon(Kaon.class.getResource("../images/rhei.png"));
        image = imageIcon.getImage();
        image = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);

        JLabel icon4 = new JLabel(imageIcon);
        icon4.setSize(75, 75);

        cp.add(icon4);
        icon4.setLocation(730, 310);

        JLabel name4 = new JLabel("Rhei Juan");
        name4.setSize(200,75);
        name4.setFont(new Font("Verdana", Font.PLAIN, 16));

        cp.add(name4);
        name4.setLocation(810, 310);

        JButton runButton = new JButton("Run");
        runButton.setSize(220, 50);
        runButton.addActionListener(e -> {
            perform(textArea.getText());
        });

        cp.add(runButton);
        runButton.setLocation(750, 400);

        JButton manualButton = new JButton("User Manual");
        manualButton.setSize(220, 50);
        manualButton.addActionListener(e -> {
            openManual();
        });

        cp.add(manualButton);
        manualButton.setLocation(750, 470);

        setContentPane(cp);
        pack();
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        errors = new ArrayList<>();
        SwingUtilities.invokeLater(() -> {
            try {
                String laf = UIManager.getSystemLookAndFeelClassName();
                UIManager.setLookAndFeel(laf);
            } catch (Exception e) {
                e.printStackTrace();
            }
            new Kaon().setVisible(true);
        });
    }

    private static void perform(String code)  {
        outputArea.setText("");
        errors.clear();

        KaonLexer lexer = new KaonLexer(fromString(code));
        KaonParser parser = new KaonParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.source();
        Scope scope = new Scope();
        HashMap<String, Function> functions = new HashMap<>();

        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);

        ErrorVisitor errorVisitor = new ErrorVisitor();
        errorVisitor.visit(tree);

        if(errors.size() > 0) {
            for(String error : errors)
                outputArea.append(error + "\n");
        } else {
            FunctionVisitor functionVisitor = new FunctionVisitor(functions);
            functionVisitor.visit(tree);
            TheVisitor theVisitor = new TheVisitor(scope, functions);
            theVisitor.refreshErrors();
            theVisitor.visit(tree);
            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            viewer.open();
        }
    }

    private static void openManual() {
        JFrame manualFrame = new JFrame("Kaon User Manual");
        JPanel manualPanel = new JPanel();

        manualPanel.setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setSize(300, 410);
        textArea.setEditable(false);
        textArea.setLineWrap(true);

        manualPanel.add(textArea);
        textArea.setLocation(350, 30);

        JButton variableDeclaration = new JButton("Variable Declarations");
        variableDeclaration.setSize(250,50);
        variableDeclaration.addActionListener(e -> {
            textArea.setText("There are no data types in the grammar Kaon. There are two types of variables that can be declared\n\n" +
                             "1. Normal Variable\n" +
                             "- Normal variables can be used in expressions, print statements, conditionals, loops, etc\n" +
                             "Syntax: ingredient *identifier* = ..." +
                             "2. Constant Variable\n" +
                             "- Constant variables are the same as normal variables but their value stays the same throughout the program\n" +
                             "Syntax: water *identifier* = ...");
        });

        manualPanel.add(variableDeclaration);
        variableDeclaration.setLocation(50, 30);

        JButton inputOrOutput = new JButton("Input/ Output Statements");
        inputOrOutput.setSize(250, 50);
        inputOrOutput.addActionListener(e -> {
            textArea.setText("1. Input \n" +
                            "Syntax: ingredient x = pudding(); \n" +
                            "2. Output \n" +
                            "Syntax: plate(identifier or string);");
        });

        manualPanel.add(inputOrOutput);
        inputOrOutput.setLocation(50, 90);

        JButton conditional = new JButton("Conditional Statements");
        conditional.setSize(250, 50);
        conditional.addActionListener(e -> {
           textArea.setText("Kaon supports the use of nested ifs and if else if statements\n" +
                   "Syntax: beef(condition) { \n *statements* \n } eel beef(condition) {\n *statements* \n} \n eel {*statements*}");
        });

        manualPanel.add(conditional);
        conditional.setLocation(50, 150);

        JButton loop = new JButton("Loops");
        loop.setSize(250, 50);
        loop.addActionListener(e -> {
            textArea.setText("This language supports three loops: \n\n" +
                             "1. For loop \n" +
                             "Syntax: pork i = 0 to { \n *insert statements * \n}\n\n" +
                             "2. Do While loop \n" +
                             "Syntax: doughnut { \n *insert statements * \n} wine(condition)\n\n" +
                             "3. While loop \n" +
                             "Syntax: wine(condition) { \n *insert statements * \n}");
        });

        manualPanel.add(loop);
        loop.setLocation(50, 210);

        JButton functions = new JButton("Functions");
        functions.setSize(250, 50);
        functions.addActionListener(e -> {
            textArea.setText("Syntax: sidedish functionName(parameters) {\n " +
                             "*statements* \n +" +
                             " rice (expression) \n } ");
        });

        manualPanel.add(functions);
        functions.setLocation(50, 270);

        JButton keywords = new JButton("Keywords");
        keywords.setSize(250, 50);
        keywords.addActionListener(e -> {
            textArea.setText("MAIN: \t 'dish'\n" +
                             "PRINT: \t 'plate' \n" +
                             "INPUT: \t 'pudding' \n" +
                             "FUNC: \t 'sidedish' \n" +
                             "CONST: \t 'water' \n" +
                             "IF: \t 'beef' \n " +
                             "ELSE: \t 'eel' \n " +
                             "RETURN: \t 'rice' \n " +
                             "FOR: \t 'pork' \n " +
                             "WHILE: \t 'wine' \n " +
                             "DO: \t 'doughnut' \n " +
                             "NULL: \t 'starve' \n " +
                             "VAR: \t 'ingredient' \n ");
        });

        manualPanel.add(keywords);
        keywords.setLocation(50, 330);

        JButton codeShortcuts = new JButton("Code Shortcuts");
        codeShortcuts.setSize(250, 50);

        manualPanel.add(codeShortcuts);
        codeShortcuts.setLocation(50, 390);
        codeShortcuts.addActionListener(e -> {
            textArea.setText("There are a few helpful features in this IDE: \n\n" +
                             "1. Code Templates \n" +
                             "-Type the keywords written below and press Ctrl+Shift+Space to generate code templates \n" +
                             "a.pt \n" +
                             "- Shortcut for a print statement. Generates 'plate('\n" +
                             "b.it \n" +
                             "- Shortcut for an input statement. Generates 'pudding('\n" +
                             "c.pk \n" +
                             "- Shortcut for a for loop. Generates 'pork(ingredient i = 0; i < ; i++ { \n\n }'\n" +
                             "d.do \n" +
                             "- Shortcut for a do while loop. Generates 'do { \n\n } while()'\n" +
                             "e.wn \n" +
                             "- Shortcut for a while loop. Generates 'while() { \n \n}'");
        });

        manualFrame.setContentPane(manualPanel);
        manualFrame.pack();
        manualFrame.setSize(700, 500);
        manualFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        manualFrame.setLocationRelativeTo(null);
        manualFrame.setVisible(true);
    }

    private static CompletionProvider createCompletionProvider() {

        DefaultCompletionProvider provider = new DefaultCompletionProvider();

        provider.addCompletion(new BasicCompletion(provider, "plate"));
        provider.addCompletion(new BasicCompletion(provider, "pudding"));
        provider.addCompletion(new BasicCompletion(provider, "state"));
        provider.addCompletion(new BasicCompletion(provider, "water"));
        provider.addCompletion(new BasicCompletion(provider, "beef"));
        provider.addCompletion(new BasicCompletion(provider, "eel"));
        provider.addCompletion(new BasicCompletion(provider, "rice"));
        provider.addCompletion(new BasicCompletion(provider, "pork"));
        provider.addCompletion(new BasicCompletion(provider, "wine"));
        provider.addCompletion(new BasicCompletion(provider, "to"));
        provider.addCompletion(new BasicCompletion(provider, "donut"));
        provider.addCompletion(new BasicCompletion(provider, "finish"));
        provider.addCompletion(new BasicCompletion(provider, "in"));
        provider.addCompletion(new BasicCompletion(provider, "null"));
        provider.addCompletion(new BasicCompletion(provider, "ingredient"));

        return provider;

    }

    public static void appendOutput(String output) {
        outputArea.append(output + "\n");
    }

    public static String getInput() {
        /**
        String value = "";

        JFrame inputFrame = new JFrame("Input");
        JPanel inputPanel = new JPanel();

        inputPanel.setLayout(null);

        JTextArea inputArea = new JTextArea();
        inputArea.setSize(100, 100);

        inputPanel.add(inputArea);
        inputArea.setLocation(0,0);

        JButton okButton = new JButton("OK");
        okButton.setSize(100,100);

        inputPanel.add(okButton);
        okButton.setLocation(100,100);

        inputFrame.setContentPane(inputPanel);
        inputFrame.pack();
        inputFrame.setSize(300, 200);
        inputFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        inputFrame.setLocationRelativeTo(null);
        inputFrame.setLocationRelativeTo(null);
        inputFrame.setVisible(true);

        return value;
         **/

        final String[] result = {""};

        JFrame f = new JFrame("Input");
        return JOptionPane.showInputDialog(f, "Enter Name");
    }

    static void addErrors(String error) {
        errors.add(error);
    }
}
