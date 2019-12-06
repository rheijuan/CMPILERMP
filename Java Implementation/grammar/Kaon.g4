grammar Kaon;

compilationUnit
    : methodDeclaration* EOF
    ;

methodDeclaration
    : typeTypeOrVoid IDENTIFIER formalParameters ('[' ']')*
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
    : FINAL typeType constantDeclarator (',' constantDeclarator)* ';'
    ;

constantDeclarator
    : IDENTIFIER ('[' ']')* '=' variableInitializer
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

formalParameters
    : '(' formalParameterList? ')'
    ;

formalParameterList
    : formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    | lastFormalParameter
    ;

formalParameter
    : typeType variableDeclaratorId
    ;

lastFormalParameter
    : typeType '...' variableDeclaratorId
    ;

literal
    : integerLiteral
    | floatLiteral
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    ;

block
    : '{' blockStatement* '}'
    ;

blockStatement
    : localVariableDeclaration ';'
    | constDeclaration
    | statement
    ;

localVariableDeclaration
    : typeType variableDeclarators
    ;

elseStatement
    : ELSE statement
    ;

statement
    : blockLabel=block
    | IF parExpression statement (elseStatement)?
    | FOR '(' forControl ')' statement
    | WHILE parExpression statement
    | DO statement WHILE parExpression ';'
    | RETURN expression? ';'
    | statementExpression=expression ';'
    | PRINT '(' primary ('+'primary)* ');'
    | SCAN  '(' IDENTIFIER ');'
    ;

forControl
    : forInit ';' expression? ';' forUpdate=expressionList?
    ;

forInit
    : typeType variableDeclaratorId '=' variableInitializer
    | expressionList
    ;

parExpression
    : '(' expression ')'
    ;

expressionList
    : expression (',' expression)*
    ;

 methodCall
    : IDENTIFIER '(' expressionList? ')'
    ;

expression
    : primary
    | expression '[' expression ']'
    | methodCall
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=('==' | '!=') expression
    | expression bop='&&' expression
    | expression bop='||' expression
    | <assoc=right> expression bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=') expression
    ;

primary
    : '(' expression ')'
    | literal
    | IDENTIFIER
    ;

typeType
    :  primitiveType ('[' ']')*
    ;

primitiveType
    : BOOLEAN
    | CHAR
    | INT
    | FLOAT
    | DOUBLE
    | STRING
    ;

// Keywords

    BOOLEAN:            'bulalo';
	CHAR:               'chicharon';
	CONST:              'tubig';
	DO:                 'donut';
	DOUBLE:             'adobo';
	ELSE:               'eel';
	FINAL:              'garnish';
	FLOAT:              'mango';
	FOR:                'pork';
	IF:                 'beef';
	INT:                'pint';
	RETURN:             'rice';
	VOID:               'boil';
	WHILE:              'wine';
	PRINT:              'plate';
    SCAN:               'shop';
    STRING:             'sinulid';

// Literals

DECIMAL_LITERAL
    : ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?
    ;

FLOAT_LITERAL
    : (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
    | Digits (ExponentPart [fFdD]? | [fFdD])
    ;

BOOL_LITERAL
    : 'butete' // true
    | 'palaka' // false
    ;

STRING_LITERAL: '"' (~["\\\r\n] | EscapeSequence)* '"';
NULL_LITERAL: 'null';

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
ASSIGN:             '=';
GT:                 '>';
LT:                 '<';
BANG:               '!';
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
MOD:                '%';
ADD_ASSIGN:         '+=';
SUB_ASSIGN:         '-=';
MUL_ASSIGN:         '*=';
DIV_ASSIGN:         '/=';
// Whitespace and comments
WS: [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT: '<!>' .*? '<!>' -> channel(HIDDEN);
LINE_COMMENT: '#' ~[\r\n]* -> channel(HIDDEN);

// Identifiers
IDENTIFIER: Letter LetterOrDigit*;

ERROR
    : [0-9] LetterOrDigit*
    | '\'' (~['\\\r\n] | EscapeSequence) (~['\\\r\n] | EscapeSequence)+ '\''
    | '\'' '\''
    ;

// Fragment rules
fragment ExponentPart
    : [eE] [+-]? Digits
    ;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
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