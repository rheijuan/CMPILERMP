// Generated from Grammar.g4 by ANTLR 4.7.2
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete generic GrammarVisitor for a parse tree produced by GrammarParser.

function GrammarVisitor() {
	antlr4.tree.ParseTreeVisitor.call(this);
	return this;
}

GrammarVisitor.prototype = Object.create(antlr4.tree.ParseTreeVisitor.prototype);
GrammarVisitor.prototype.constructor = GrammarVisitor;

// Visit a parse tree produced by GrammarParser#compilationUnit.
GrammarVisitor.prototype.visitCompilationUnit = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#variableModifier.
GrammarVisitor.prototype.visitVariableModifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeParameters.
GrammarVisitor.prototype.visitTypeParameters = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeParameter.
GrammarVisitor.prototype.visitTypeParameter = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeBound.
GrammarVisitor.prototype.visitTypeBound = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#methodDeclaration.
GrammarVisitor.prototype.visitMethodDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#methodBody.
GrammarVisitor.prototype.visitMethodBody = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeTypeOrVoid.
GrammarVisitor.prototype.visitTypeTypeOrVoid = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#constDeclaration.
GrammarVisitor.prototype.visitConstDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#constantDeclarator.
GrammarVisitor.prototype.visitConstantDeclarator = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#interfaceMethodDeclaration.
GrammarVisitor.prototype.visitInterfaceMethodDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#interfaceMethodModifier.
GrammarVisitor.prototype.visitInterfaceMethodModifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#genericInterfaceMethodDeclaration.
GrammarVisitor.prototype.visitGenericInterfaceMethodDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#variableDeclarators.
GrammarVisitor.prototype.visitVariableDeclarators = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#variableDeclarator.
GrammarVisitor.prototype.visitVariableDeclarator = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#variableDeclaratorId.
GrammarVisitor.prototype.visitVariableDeclaratorId = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#variableInitializer.
GrammarVisitor.prototype.visitVariableInitializer = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#arrayInitializer.
GrammarVisitor.prototype.visitArrayInitializer = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#classOrInterfaceType.
GrammarVisitor.prototype.visitClassOrInterfaceType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeArgument.
GrammarVisitor.prototype.visitTypeArgument = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#qualifiedNameList.
GrammarVisitor.prototype.visitQualifiedNameList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#formalParameters.
GrammarVisitor.prototype.visitFormalParameters = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#formalParameterList.
GrammarVisitor.prototype.visitFormalParameterList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#formalParameter.
GrammarVisitor.prototype.visitFormalParameter = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#lastFormalParameter.
GrammarVisitor.prototype.visitLastFormalParameter = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#qualifiedName.
GrammarVisitor.prototype.visitQualifiedName = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#literal.
GrammarVisitor.prototype.visitLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#integerLiteral.
GrammarVisitor.prototype.visitIntegerLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#floatLiteral.
GrammarVisitor.prototype.visitFloatLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#annotation.
GrammarVisitor.prototype.visitAnnotation = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#elementValuePairs.
GrammarVisitor.prototype.visitElementValuePairs = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#elementValuePair.
GrammarVisitor.prototype.visitElementValuePair = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#elementValue.
GrammarVisitor.prototype.visitElementValue = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#elementValueArrayInitializer.
GrammarVisitor.prototype.visitElementValueArrayInitializer = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#defaultValue.
GrammarVisitor.prototype.visitDefaultValue = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#block.
GrammarVisitor.prototype.visitBlock = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#wrongBlockStatement.
GrammarVisitor.prototype.visitWrongBlockStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#blockStatement.
GrammarVisitor.prototype.visitBlockStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#wrongLocalVariableDeclaration.
GrammarVisitor.prototype.visitWrongLocalVariableDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#localVariableDeclaration.
GrammarVisitor.prototype.visitLocalVariableDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#statement.
GrammarVisitor.prototype.visitStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#printStatement.
GrammarVisitor.prototype.visitPrintStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#printWithIdentifier.
GrammarVisitor.prototype.visitPrintWithIdentifier = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#scanMissingIdentifierError.
GrammarVisitor.prototype.visitScanMissingIdentifierError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#compareExpression.
GrammarVisitor.prototype.visitCompareExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#printMissingQuotesError.
GrammarVisitor.prototype.visitPrintMissingQuotesError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#wrongPrintStatement.
GrammarVisitor.prototype.visitWrongPrintStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#returnPrimitiveTypeError.
GrammarVisitor.prototype.visitReturnPrimitiveTypeError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#returnMissingError.
GrammarVisitor.prototype.visitReturnMissingError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#forError.
GrammarVisitor.prototype.visitForError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#catchClause.
GrammarVisitor.prototype.visitCatchClause = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#catchType.
GrammarVisitor.prototype.visitCatchType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#finallyBlock.
GrammarVisitor.prototype.visitFinallyBlock = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#resourceSpecification.
GrammarVisitor.prototype.visitResourceSpecification = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#resources.
GrammarVisitor.prototype.visitResources = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#resource.
GrammarVisitor.prototype.visitResource = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#switchBlockStatementGroup.
GrammarVisitor.prototype.visitSwitchBlockStatementGroup = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#switchLabel.
GrammarVisitor.prototype.visitSwitchLabel = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#forControl.
GrammarVisitor.prototype.visitForControl = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#forInit.
GrammarVisitor.prototype.visitForInit = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#enhancedForControl.
GrammarVisitor.prototype.visitEnhancedForControl = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#parExpression.
GrammarVisitor.prototype.visitParExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#excessLParenExpression.
GrammarVisitor.prototype.visitExcessLParenExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#excessRParenExpression.
GrammarVisitor.prototype.visitExcessRParenExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#expressionList.
GrammarVisitor.prototype.visitExpressionList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#methodCall.
GrammarVisitor.prototype.visitMethodCall = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#expression.
GrammarVisitor.prototype.visitExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#primaryError.
GrammarVisitor.prototype.visitPrimaryError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#expressionError.
GrammarVisitor.prototype.visitExpressionError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#expressionAdditionError.
GrammarVisitor.prototype.visitExpressionAdditionError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#expressionSubtractionError.
GrammarVisitor.prototype.visitExpressionSubtractionError = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#primary.
GrammarVisitor.prototype.visitPrimary = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#arrayCreatorRest.
GrammarVisitor.prototype.visitArrayCreatorRest = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeList.
GrammarVisitor.prototype.visitTypeList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeType.
GrammarVisitor.prototype.visitTypeType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#primitiveType.
GrammarVisitor.prototype.visitPrimitiveType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#typeArguments.
GrammarVisitor.prototype.visitTypeArguments = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by GrammarParser#arguments.
GrammarVisitor.prototype.visitArguments = function(ctx) {
  return this.visitChildren(ctx);
};



exports.GrammarVisitor = GrammarVisitor;