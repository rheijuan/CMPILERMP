grammar Kaon;

compilationUnit
    : methodDeclaration* EOF
    ;

variableModifier
    : FINAL
    | annotation
    ;

typeParameters
    : '<' typeParameter (',' typeParameter)* '>'
    ;

typeParameter
    : annotation* IDENTIFIER typeBound
    ;

typeBound
    : typeType ('&' typeType)*
    ;

/* We use rule this even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
methodDeclaration
    : typeTypeOrVoid IDENTIFIER formalParameters ('[' ']')*
      (THROWS qualifiedNameList)?
      methodBody
    ;

methodBody
    : block
    | ';'
    ;

typeTypeOrVoid
    : typeType
    | VOID
    ;

constDeclaration
    : typeType constantDeclarator (',' constantDeclarator)* ';'
    ;

constantDeclarator
    : IDENTIFIER ('[' ']')* '=' variableInitializer
    ;

// see matching of [] comment in methodDeclaratorRest
// methodBody from Java8
interfaceMethodDeclaration
    : interfaceMethodModifier* (typeTypeOrVoid | typeParameters annotation* typeTypeOrVoid)
      IDENTIFIER formalParameters ('[' ']')* (THROWS qualifiedNameList)? methodBody
    ;

// Java8
interfaceMethodModifier
    : annotation
    | DEFAULT
    | STATIC
    | STRICTFP
    ;

genericInterfaceMethodDeclaration
    : typeParameters interfaceMethodDeclaration
    ;

variableDeclarators
    : variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    : IDENTIFIER ('[' ']')*
    ;

variableInitializer
    : arrayInitializer
    | expression
    ;

arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

classOrInterfaceType
    : IDENTIFIER typeArguments? ('.' IDENTIFIER typeArguments?)*
    ;

typeArgument
    : typeType
    | '?' typeType?
    ;

qualifiedNameList
    : qualifiedName (',' qualifiedName)*
    ;

formalParameters
    : '(' formalParameterList? ')'
    ;

formalParameterList
    : formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    | lastFormalParameter
    ;

formalParameter
    : variableModifier* typeType variableDeclaratorId
    ;

lastFormalParameter
    : variableModifier* typeType '...' variableDeclaratorId
    ;

qualifiedName
    : IDENTIFIER ('.' IDENTIFIER)*
    ;

literal
    : integerLiteral
    | floatLiteral
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    | HEX_FLOAT_LITERAL
    ;

// ANNOTATIONS

annotation
    : '@' qualifiedName ('(' ( elementValuePairs | elementValue )? ')')?
    ;

elementValuePairs
    : elementValuePair (',' elementValuePair)*
    ;

elementValuePair
    : IDENTIFIER '=' elementValue
    ;

elementValue
    : expression
    | annotation
    | elementValueArrayInitializer
    ;

elementValueArrayInitializer
    : '{' (elementValue (',' elementValue)*)? (',')? '}'
    ;

defaultValue
    : DEFAULT elementValue
    ;

// STATEMENTS / BLOCKS

block
    : '{' blockStatement* '}'
    | wrongBlockStatement
    ;

wrongBlockStatement
    : '{' blockStatement* blockStatement
    ;

blockStatement
    : localVariableDeclaration ';'
    | wrongLocalVariableDeclaration
    | statement
    ;

wrongLocalVariableDeclaration
    : variableModifier* typeType variableDeclarators
    ;

localVariableDeclaration
    : typeType variableDeclarators
    ;

statement
    : blockLabel=block
    | IF (parExpression|excessLParenExpression|excessRParenExpression) statement (ELSE statement)?
    | FOR '(' forControl ')' statement
    | PRINT '(' (STRING_LITERAL | IDENTIFIER) ')' ';'
    | PRINT '(' STRING_LITERAL '+' IDENTIFIER ( '+' STRING_LITERAL '+' IDENTIFIER)* ')' ';'
    | wrongPrintStatement
    | scanMissingIdentifierError
    | SCAN '(' IDENTIFIER ')'
    | WHILE (parExpression|excessLParenExpression|excessRParenExpression) statement
    | DO statement WHILE (parExpression|excessLParenExpression|excessRParenExpression) ';'
    | TRY block (catchClause+ finallyBlock? | finallyBlock)
    | TRY resourceSpecification block catchClause* finallyBlock?
    | SWITCH (parExpression|excessLParenExpression|excessRParenExpression) '{' switchBlockStatementGroup* switchLabel* '}'
    | SYNCHRONIZED (parExpression|excessLParenExpression|excessRParenExpression) block
    | RETURN expression? ';'
    | returnPrimitiveTypeError
    | returnMissingError
    | THROW expression ';'
    | BREAK IDENTIFIER? ';'
    | CONTINUE IDENTIFIER? ';'
    | SEMI
    | statementExpression=expression ';'
    | identifierLabel=IDENTIFIER ':' statement
    ;

scanMissingIdentifierError
    : SCAN '(' ')'
    ;

compareExpression
    : (primary bop=('<=' | '>=' | '>' | '<' | '==' | '!=') primary) ('&&' | '||' primary bop=('<=' | '>=' | '>' | '<' | '==' | '!='))*
    ;

printMissingQuotesError
    : PRINT '(' ERROR_STRING_LITERAL ')'
    ;

wrongPrintStatement
    : PRINT '(' (STRING_LITERAL | IDENTIFIER) '+' IDENTIFIER ('+'|'-'|'/'|'*')+ ')' ';'
    ;

returnPrimitiveTypeError
    : RETURN primitiveType ';'
    | RETURN primitiveType
    ;

returnMissingError
    : RETURN expression?
    ;

forError
    : FOR '(' forControl statement
    | FOR forControl ')' statement
    ;

catchClause
    : CATCH '(' variableModifier* catchType IDENTIFIER ')' block
    ;

catchType
    : qualifiedName ('|' qualifiedName)*
    ;

finallyBlock
    : FINALLY block
    ;

resourceSpecification
    : '(' resources ';'? ')'
    ;

resources
    : resource (';' resource)*
    ;

resource
    : variableModifier* classOrInterfaceType variableDeclaratorId '=' expression
    ;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
    : switchLabel+ blockStatement+
    ;

switchLabel
    : CASE (constantExpression=expression | enumConstantName=IDENTIFIER) ':'
    | DEFAULT ':'
    ;

forControl
    : enhancedForControl
    | forInit? ';' expression? ';' forUpdate=expressionList?
    ;

forInit
    : localVariableDeclaration
    | expressionList
    ;

enhancedForControl
    : variableModifier* typeType variableDeclaratorId ':' expression
    ;

// EXPRESSIONS

parExpression
    : '(' expression ')'
    ;

excessLParenExpression
    : '(' '(' expression ')'
    ;

excessRParenExpression
    : '(' expression ')' ')'
    ;

expressionList
    : expression (',' expression)*
    ;

methodCall
    : IDENTIFIER '(' expressionList? ')'
    ;

expression
    : primary
    | primaryError
    | expression bop='.'
      ( IDENTIFIER
      | methodCall
      )
    | expression '[' expression ']'
    | methodCall
    | '(' typeType ')' expression
    | prefix=('+'|'-'|'++'|'--') expression
    | prefix=('~'|'!') expression
    | IDENTIFIER postfix=('++' | '--')
    | expressionError
    | expressionAdditionError
    | expressionSubtractionError
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=('==' | '!=') expression
    | expression bop='&' expression
    | expression bop='^' expression
    | expression bop='|' expression
    | expression bop='&&' expression
    | expression bop='||' expression
    | <assoc=right> expression bop='?' expression ':' expression
    | <assoc=right> expression
      bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=')
      expression

    // Java 8 methodReference
    | expression '::' typeArguments? IDENTIFIER
    | typeType '::' (typeArguments? IDENTIFIER)
    | '::' typeArguments?
    ;

primaryError
    : '(' expression ')' (')')*
    | '(' ('(')* expression
    ;

expressionError
    : literal postfix=('++' | '--')
    | prefix=('++'|'--') expression
    ;

expressionAdditionError
    : literal postfix='++'
    ;

expressionSubtractionError
    : literal postfix='--'
    ;

// Java8

primary
    : '(' expression ')'
    | literal
    | IDENTIFIER
    | typeTypeOrVoid '.'
    ;

arrayCreatorRest
    : '[' (']' ('[' ']')* arrayInitializer | expression ']' ('[' expression ']')* ('[' ']')*)
    ;

typeList
    : typeType (',' typeType)*
    ;

typeType
    :  primitiveType ('[' DECIMAL_LITERAL ']')*
    ;

primitiveType
    : BOOLEAN
    | CHAR
    | BYTE
    | SHORT
    | INT
    | LONG
    | FLOAT
    | DOUBLE
    ;

typeArguments
    : '<' typeArgument (',' typeArgument)* '>'
    ;

arguments
    : '(' expressionList? ')'
    ;

// Keywords

	BOOLEAN:            'bulalo';
	BREAK:              'kitkat';
	BYTE:               'bite';
	CASE:               'caserola';
	CATCH:              'ketchup';
	CHAR:               'chicharon';
	CONST:              'tubig';
	CONTINUE:           'coconut';
    DEFAULT:            'plain';
	DO:                 'donut';
	DOUBLE:             'adobo';
	ELSE:               'eel';
	FINAL:              'garnish';
	FINALLY:            'serve';
	FLOAT:              'mango';
	FOR:                'pork';
	IF:                 'beef';
	GOTO:               'goto';
	INT:                'pint';
	LONG:               'longganisa';
	NATIVE:             'kangkong';
	RETURN:             'rice';
	SHORT:              'shortcake';
    STATIC:             'stove';
    STRICTFP:           'baking';
	SWITCH:             'sugar';
	SYNCHRONIZED:       'stir';
	THROW:              'turon';
	THROWS:             'turons';
	TRANSIENT:          'truffle';
	TRY:                'fry';
	VOID:               'boil';
	VOLATILE:           'bolabola';
	WHILE:              'wine';
	PRINT:              'plate';
    SCAN:               'shop';

// Literals

DECIMAL_LITERAL:    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
HEX_LITERAL:        '0' [xX] [0-9a-fA-F] ([0-9a-fA-F_]* [0-9a-fA-F])? [lL]?;
OCT_LITERAL:        '0' '_'* [0-7] ([0-7_]* [0-7])? [lL]?;
BINARY_LITERAL:     '0' [bB] [01] ([01_]* [01])? [lL]?;

FLOAT_LITERAL:      (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
             |       Digits (ExponentPart [fFdD]? | [fFdD])
             ;

HEX_FLOAT_LITERAL:  '0' [xX] (HexDigits '.'? | HexDigits? '.' HexDigits) [pP] [+-]? Digits [fFdD]?;

BOOL_LITERAL:       'butete' // true
            |       'palaka' // false
            ;

CHAR_LITERAL:       '\'' (~['\\\r\n] | EscapeSequence) '\'';

STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"';
NULL_LITERAL:       'null';
// Separators
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMI:               ';';
COMMA:              ',';
DOT:                '.';
// Operators
ASSIGN:             '=';
GT:                 '>';
LT:                 '<';
BANG:               '!';
TILDE:              '~';
QUESTION:           '?';
COLON:              ':';
EQUAL:              '==';
LE:                 '<=';
GE:                 '>=';
NOTEQUAL:           '!=';
AND:                '&&';
OR:                 '||';
INC:                '++';
DEC:                '--';
ADD:                '+';
SUB:                '-';
MUL:                '*';
DIV:                '/';
BITAND:             '&';
BITOR:              '|';
CARET:              '^';
MOD:                '%';
ADD_ASSIGN:         '+=';
SUB_ASSIGN:         '-=';
MUL_ASSIGN:         '*=';
DIV_ASSIGN:         '/=';
AND_ASSIGN:         '&=';
OR_ASSIGN:          '|=';
XOR_ASSIGN:         '^=';
MOD_ASSIGN:         '%=';
LSHIFT_ASSIGN:      '<<=';
RSHIFT_ASSIGN:      '>>=';
URSHIFT_ASSIGN:     '>>>=';
// Java 8 tokens
ARROW:              '->';
COLONCOLON:         '::';
// Additional symbol not defined in the lexical specification
AT:                 '@';
ELLIPSIS:           '...';
// Whitespace and comments
WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);

// Identifiers

IDENTIFIER:         Letter LetterOrDigit*;

ERROR_STRING_LITERAL
    : EscapeSequence
    | '"' EscapeSequence
    | EscapeSequence '"'
    ;
// Fragment rules

fragment ExponentPart
    : [eE] [+-]? Digits
    ;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment HexDigits
    : HexDigit ((HexDigit | '_')* HexDigit)?
    ;
fragment HexDigit
    : [0-9a-fA-F]
    ;
fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;
fragment LetterOrDigit
    : Letter
    | [0-9]
    ;
fragment Letter
    : [a-zA-Z$_] // these are the "java letters" below 0x7F
    | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
    ;