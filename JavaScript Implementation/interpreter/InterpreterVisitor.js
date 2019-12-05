// Generated from Grammar.g4 by ANTLR 4.7.2
// jshint ignore: start
var antlr4 = require('antlr4/index.js');
var GrammarVisitor = require("../grammar/GrammarVisitor.js");
const SymbolTable = require('../symbol-table/SymbolTable.js');
const VariableSymbol = require('../symbol-table/VariableSymbol');
const ProcedureSymbol = require('../symbol-table/ProcedureSymbol');
const FunctionSymbol = require('../symbol-table/FunctionSymbol');
const ArraySymbol = require('../symbol-table/ArraySymbol');
var readlineSync = require('readline-sync');
var Parser = require('expr-eval').Parser;

var symbolTables = new Map();
var valueMap = new Map();
Parser = new Parser();

var visitor = function() {
    GrammarVisitor.GrammarVisitor.call(this);
    this.ctr = 0;
    this.scope = null;
    this.prevScope = 'global';
}

visitor.prototype = Object.create(GrammarVisitor.GrammarVisitor.prototype);

// Visit a parse tree produced by GrammarParser#compilationUnit.
visitor.prototype.visitCompilationUnit = function(ctx) {
    this.scope = new SymbolTable('global', 1, this.scope);
    symbolTables.set('global', this.scope);
    this.visit(ctx.methodDeclaration());
    this.scope = this.scope.enclosingScope;
};


// Visit a parse tree produced by GrammarParser#variableModifier.
visitor.prototype.visitVariableModifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeParameters.
visitor.prototype.visitTypeParameters = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeParameter.
visitor.prototype.visitTypeParameter = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeBound.
visitor.prototype.visitTypeBound = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#methodDeclaration.
visitor.prototype.visitMethodDeclaration = function(ctx) {
    this.visit(ctx.typeTypeOrVoid());
    this.visit(ctx.formalParameters());
    this.visit(ctx.methodBody());
};


// Visit a parse tree produced by GrammarParser#methodBody.
visitor.prototype.visitMethodBody = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeTypeOrVoid.
visitor.prototype.visitTypeTypeOrVoid = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#constDeclaration.
visitor.prototype.visitConstDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#constantDeclarator.
visitor.prototype.visitConstantDeclarator = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#interfaceMethodDeclaration.
visitor.prototype.visitInterfaceMethodDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#interfaceMethodModifier.
visitor.prototype.visitInterfaceMethodModifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#genericInterfaceMethodDeclaration.
visitor.prototype.visitGenericInterfaceMethodDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#variableDeclarators.
visitor.prototype.visitVariableDeclarators = function(ctx) {
    return this.visit(ctx.variableDeclarator());
};


// Visit a parse tree produced by GrammarParser#variableDeclarator.
visitor.prototype.visitVariableDeclarator = function(ctx) {
    var context = ctx.getText();
    if(context.includes("=")) {
        var identifiers = this.visit(ctx.variableDeclaratorId()); // Gets all the identifiers
        var value = this.visit(ctx.variableInitializer());

        valueMap.set(identifiers[0], value);
    }
    
    return this.visit(ctx.variableDeclaratorId());
};


// Visit a parse tree produced by GrammarParser#variableDeclaratorId.
visitor.prototype.visitVariableDeclaratorId = function(ctx) {
    var temp = [];
    temp.push(ctx.getText());
    return temp;
};


// Visit a parse tree produced by GrammarParser#variableInitializer.
visitor.prototype.visitVariableInitializer = function(ctx) {
  return this.visit(ctx.expression());
};


// Visit a parse tree produced by GrammarParser#arrayInitializer.
visitor.prototype.visitArrayInitializer = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#classOrInterfaceType.
visitor.prototype.visitClassOrInterfaceType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeArgument.
visitor.prototype.visitTypeArgument = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#qualifiedNameList.
visitor.prototype.visitQualifiedNameList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#formalParameters.
visitor.prototype.visitFormalParameters = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#formalParameterList.
visitor.prototype.visitFormalParameterList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#formalParameter.
visitor.prototype.visitFormalParameter = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#lastFormalParameter.
visitor.prototype.visitLastFormalParameter = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#qualifiedName.
visitor.prototype.visitQualifiedName = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#literal.
visitor.prototype.visitLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#integerLiteral.
visitor.prototype.visitIntegerLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#floatLiteral.
visitor.prototype.visitFloatLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#annotation.
visitor.prototype.visitAnnotation = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#elementValuePairs.
visitor.prototype.visitElementValuePairs = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#elementValuePair.
visitor.prototype.visitElementValuePair = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#elementValue.
visitor.prototype.visitElementValue = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#elementValueArrayInitializer.
visitor.prototype.visitElementValueArrayInitializer = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#defaultValue.
visitor.prototype.visitDefaultValue = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#block.
visitor.prototype.visitBlock = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#wrongBlockStatement.
visitor.prototype.visitWrongBlockStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#blockStatement.
visitor.prototype.visitBlockStatement = function(ctx) {
  var statement = ctx.getText();
  if(statement.includes("if")) {
    console.log("If statement");
    console.log(ctx.getText());
    // console.log("--" + ctx.getText());
  }
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#wrongLocalVariableDeclaration.
visitor.prototype.visitWrongLocalVariableDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#localVariableDeclaration.
visitor.prototype.visitLocalVariableDeclaration = function(ctx) {
    // Gets the variable names and data types to store into a symbol table
    var variables = this.visit(ctx.variableDeclarators()); // visit the nodes to get the identifier for variables
    var type = this.visit(ctx.typeType()); // visits the nodes to get the data type of the variables

    var varType = type.type != undefined? type.type : type
    varType = convert(type);
    const typeSymbol = this.scope.lookup(varType.toUpperCase());

    for(x in variables) {
        var varName = variables[x].toString();
        var varValue = null;

        if(valueMap.size > 0) {
            for (const [key, value] of valueMap.entries()) {
                if(varName === key) // Checking if the identifier has an assigned value
                  varValue = value;
            }
        }
            
        if(type.indices == undefined) {
            var varSymbol = null;

            varSymbol = new VariableSymbol(varName, typeSymbol);   

            if(varValue != null)
              varSymbol.setValue(varValue)
           
            this.scope.define(varSymbol);

        } else {
            var arrSymbol = new ArraySymbol(varName, typeSymbol ,parseInt(type.indices[0]),parseInt(type.indices[1]));
            this.scope.define(arrSymbol)
        }
    }
    
    return
};

var convert = function(dataType) {
    if(dataType.toUpperCase() === "PINT") {
        return "INTEGER";
    } else if(dataType.toUpperCase() === "BUTETE") {
        return "BOOLEAN";
    } else if(dataType.toUpperCase() === "CHICHARON") {
        return "CHAR";
    } else if(dataType.toUpperCase() === "MANGO") {
        return "FLOAT";
    } else if(dataType.toUpperCase() === "ADOBO") {
        return "DOUBLE";
    }
}


// Visit a parse tree produced by GrammarParser#statement.
visitor.prototype.visitStatement = function(ctx) {
  var text = ctx.getText();
  if(text.includes("beef")) { // process for if statement
    this.visit(ctx.parExpression());
  }
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#printStatement.
visitor.prototype.visitPrintStatement = function(ctx) {
    var message = ctx.getText(); // ctx.getText() contains the command for printing (i.e plate("aaa");)

    var extract = message.split("\""); // splits the message to get the string literal in the command
    console.log(extract[1]);
};


// Visit a parse tree produced by GrammarParser#printWithIdentifier.
visitor.prototype.visitPrintWithIdentifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#scanMissingIdentifierError.
visitor.prototype.visitScanMissingIdentifierError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#compareExpression.
visitor.prototype.visitCompareExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#printMissingQuotesError.
visitor.prototype.visitPrintMissingQuotesError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#wrongPrintStatement.
visitor.prototype.visitWrongPrintStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#returnPrimitiveTypeError.
visitor.prototype.visitReturnPrimitiveTypeError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#returnMissingError.
visitor.prototype.visitReturnMissingError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#forError.
visitor.prototype.visitForError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#catchClause.
visitor.prototype.visitCatchClause = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#catchType.
visitor.prototype.visitCatchType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#finallyBlock.
visitor.prototype.visitFinallyBlock = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#resourceSpecification.
visitor.prototype.visitResourceSpecification = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#resources.
visitor.prototype.visitResources = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#resource.
visitor.prototype.visitResource = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#switchBlockStatementGroup.
visitor.prototype.visitSwitchBlockStatementGroup = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#switchLabel.
visitor.prototype.visitSwitchLabel = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#forControl.
visitor.prototype.visitForControl = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#forInit.
visitor.prototype.visitForInit = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#enhancedForControl.
visitor.prototype.visitEnhancedForControl = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#parExpression.
visitor.prototype.visitParExpression = function(ctx) {
  var temp = this.visit(ctx.expression());
};


// Visit a parse tree produced by GrammarParser#excessLParenExpression.
visitor.prototype.visitExcessLParenExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#excessRParenExpression.
visitor.prototype.visitExcessRParenExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#expressionList.
visitor.prototype.visitExpressionList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#methodCall.
visitor.prototype.visitMethodCall = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#expression.
visitor.prototype.visitExpression = function(ctx) {
  var text = ctx.getText();
  if(!isNaN(text)) {
    return text;
  } else if(text.includes("==")) { // Expression for calculating the true or false values
    var expr = Parser.parse(text);
    var variables = this.visit(ctx.expression());

    var var1 = variables[0].toString();
    var var2 = variables[1].toString();

    console.log("Var 1: " + var1);
    console.log("Var 2: " + var2);
    
    var value1 = this.scope.lookup(var1, true).value;
    var value2 = this.scope.lookup(var2, true).value;

    console.log("Value 1: " + value1);
    console.log("Value 2: " + value2);

    console.log(expr.evaluate({ var1 : value1, var2 : value2}));

  } else if(text.includes("+") || text.includes("-") || text.includes("*") || text.includes("/")) {
    var expr = Parser.parse(text);
    return expr.evaluate();
  } else if( text.includes("=")) {
    var variable = this.visit(ctx.expression());
    var name = variable[0];
    var value = variable[1];
    var tempVar = this.scope.lookup(name, true);

    if(this.scope.lookup(value, true)) { // Checks if assigning variable to another variable
      var fromValue = this.scope.lookup(value, true).value;
      tempVar.setValue(fromValue);
    } else {
      if(tempVar) {
        tempVar.setValue(value);
      }
    } 
  }
  // console.log(this.scope.toString());
  return text;
};


// Visit a parse tree produced by GrammarParser#primaryError.
visitor.prototype.visitPrimaryError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#expressionError.
visitor.prototype.visitExpressionError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#expressionAdditionError.
visitor.prototype.visitExpressionAdditionError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#expressionSubtractionError.
visitor.prototype.visitExpressionSubtractionError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#primary.
visitor.prototype.visitPrimary = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#arrayCreatorRest.
visitor.prototype.visitArrayCreatorRest = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeList.
visitor.prototype.visitTypeList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeType.
visitor.prototype.visitTypeType = function(ctx) {
    // Checks if the variable is primitive or an array
    if(ctx.getChild(0).constructor.name === "PrimitiveTypeContext") {
        return ctx.getText();
    } else {
        console.log("Array");
    }
};


// Visit a parse tree produced by GrammarParser#primitiveType.
visitor.prototype.visitPrimitiveType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeArguments.
visitor.prototype.visitTypeArguments = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#arguments.
visitor.prototype.visitArguments = function(ctx) {
  return this.visitChildren(ctx);
};



exports.InterpreterVisitor = visitor;