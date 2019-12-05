var antlr4 = require('antlr4/index.js');
var visitor = require("../grammar/visitor.js");
const SymbolTable = require('../symbol-table/SymbolTable.js');
const VariableSymbol = require('../symbol-table/VariableSymbol');
const ProcedureSymbol = require('../symbol-table/ProcedureSymbol');
const FunctionSymbol = require('../symbol-table/FunctionSymbol');
const ArraySymbol = require('../symbol-table/ArraySymbol');

var KEYWORDS = [
    'BOOLEAN',
    'BREAK',
    'BYTE',
    'CASE',
    'CATCH',
    'CHAR',
    'CONST',
    'CONTINUE',
    'DEFAULT',
    'DO',
    'DOUBLE',
    'ELSE',
    'FINAL',
    'FINALLY',
    'FLOAT',
    'FOR',
    'IF',
    'GOTO',
    'INT',
    'LONG',
    'NATIVE',
    'RETURN',
    'SHORT',
    'STATIC',
    'STRICTFP',
    'SWITCH',
    'SYNCHRONIZED',
    'THROW',
    'THROWS',
    'TRANSIENT',
    'TRY',
    'VOLATILE',
    'WHILE',
    'PRINT',
    'SCAN'
];

var visitor = function() {
    visitor.visitor.call(this); // chain the constructor
    this.ctr = 0;
    this.scope = null;
    this.prevScope = 'global'
};

// chaining the prototypes
visitor.prototype = Object.create(visitor.visitor.prototype);


// Visit a parse tree produced by GrammarParser#compilationUnit.
visitor.prototype.visitCompilationUnit = function(ctx) {
    this.scope = new SymbolTable('global', 1, this.scope);
    this.visit(ctx.block());
   // console.log(this.scope.toString())
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
    return this.visitChildren(ctx);
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
    return this.visitChildren(ctx);
  };
  
  
  // Visit a parse tree produced by GrammarParser#variableDeclarator.
  visitor.prototype.visitVariableDeclarator = function(ctx) {
    return this.visitChildren(ctx);
  };
  
  
  // Visit a parse tree produced by GrammarParser#variableDeclaratorId.
  visitor.prototype.visitVariableDeclaratorId = function(ctx) {
    return this.visitChildren(ctx);
  };
  
  
  // Visit a parse tree produced by GrammarParser#variableInitializer.
  visitor.prototype.visitVariableInitializer = function(ctx) {
    return this.visitChildren(ctx);
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
    return this.visitChildren(ctx);
  };
  
  
  // Visit a parse tree produced by GrammarParser#wrongLocalVariableDeclaration.
  visitor.prototype.visitWrongLocalVariableDeclaration = function(ctx) {
    return this.visitChildren(ctx);
  };
  
  
  // Visit a parse tree produced by GrammarParser#localVariableDeclaration.
  visitor.prototype.visitLocalVariableDeclaration = function(ctx) {
    return this.visitChildren(ctx);
  };
  
  
  // Visit a parse tree produced by GrammarParser#statement.
  visitor.prototype.visitStatement = function(ctx) {
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
    return this.visitChildren(ctx);
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
    return this.visitChildren(ctx);
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
    return this.visitChildren(ctx);
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

exports.visitorImpl = visitor;