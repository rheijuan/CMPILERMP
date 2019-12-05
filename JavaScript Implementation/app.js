var antlr4 = require('antlr4/index');
var GrammarLexer = require("./grammar/GrammarLexer.js");
var GrammarParser = require("./grammar/GrammarParser.js");
// var visitorImpl = require("./semantic-analyzer/visitorImpl.js");
// var SemanticAnalyzer = require('./semantic-analyzer/SemanticAnalyzer.js');
var InterpreterVisitor = require("./interpreter/InterpreterVisitor.js");
var fs = require("fs")

//Load HTTP module

const http = require("http");
const hostname = '127.0.0.1';
const port = 3000;

//Create HTTP server and listen on port 3000 for requests
const server = http.createServer((req, res) => {

  //Set the response HTTP header with HTTP status and Content type
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  res.end('Hello World\n');

  
});

//listen for request on port 3000, and as a callback function have the port listened on logged
server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);

  var input = fs.readFileSync("grammar/input.txt").toString()

  var chars = new antlr4.InputStream(input);
  var lexer = new GrammarLexer.GrammarLexer(chars);
  var tokens  = new antlr4.CommonTokenStream(lexer);
  var parser = new GrammarParser.GrammarParser(tokens);
  // var analyzer = new SemanticAnalyzer();

  parser.removeErrorListeners();
  lexer.removeErrorListeners();

  parser.buildParseTrees = true;
  var tree = parser.compilationUnit();

  // var printer = new visitorImpl.visitorImpl();
  // printer.visitProgram(tree);

  var aast = new InterpreterVisitor.InterpreterVisitor();
  aast.visitCompilationUnit(tree);
});