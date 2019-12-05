package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KaonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BREAK=2, BYTE=3, CASE=4, CATCH=5, CHAR=6, CONST=7, CONTINUE=8, 
		DEFAULT=9, DO=10, DOUBLE=11, ELSE=12, FINAL=13, FINALLY=14, FLOAT=15, 
		FOR=16, IF=17, GOTO=18, INT=19, LONG=20, NATIVE=21, RETURN=22, SHORT=23, 
		STATIC=24, STRICTFP=25, SWITCH=26, SYNCHRONIZED=27, THROW=28, THROWS=29, 
		TRANSIENT=30, TRY=31, VOID=32, VOLATILE=33, WHILE=34, PRINT=35, SCAN=36, 
		DECIMAL_LITERAL=37, HEX_LITERAL=38, OCT_LITERAL=39, BINARY_LITERAL=40, 
		FLOAT_LITERAL=41, HEX_FLOAT_LITERAL=42, BOOL_LITERAL=43, CHAR_LITERAL=44, 
		STRING_LITERAL=45, NULL_LITERAL=46, LPAREN=47, RPAREN=48, LBRACE=49, RBRACE=50, 
		LBRACK=51, RBRACK=52, SEMI=53, COMMA=54, DOT=55, ASSIGN=56, GT=57, LT=58, 
		BANG=59, TILDE=60, QUESTION=61, COLON=62, EQUAL=63, LE=64, GE=65, NOTEQUAL=66, 
		AND=67, OR=68, INC=69, DEC=70, ADD=71, SUB=72, MUL=73, DIV=74, BITAND=75, 
		BITOR=76, CARET=77, MOD=78, ADD_ASSIGN=79, SUB_ASSIGN=80, MUL_ASSIGN=81, 
		DIV_ASSIGN=82, AND_ASSIGN=83, OR_ASSIGN=84, XOR_ASSIGN=85, MOD_ASSIGN=86, 
		LSHIFT_ASSIGN=87, RSHIFT_ASSIGN=88, URSHIFT_ASSIGN=89, ARROW=90, COLONCOLON=91, 
		AT=92, ELLIPSIS=93, WS=94, COMMENT=95, LINE_COMMENT=96, IDENTIFIER=97, 
		ERROR_STRING_LITERAL=98;
	public static final int
		RULE_compilationUnit = 0, RULE_variableModifier = 1, RULE_typeParameters = 2, 
		RULE_typeParameter = 3, RULE_typeBound = 4, RULE_methodDeclaration = 5, 
		RULE_methodBody = 6, RULE_typeTypeOrVoid = 7, RULE_constDeclaration = 8, 
		RULE_constantDeclarator = 9, RULE_interfaceMethodDeclaration = 10, RULE_interfaceMethodModifier = 11, 
		RULE_genericInterfaceMethodDeclaration = 12, RULE_variableDeclarators = 13, 
		RULE_variableDeclarator = 14, RULE_variableDeclaratorId = 15, RULE_variableInitializer = 16, 
		RULE_arrayInitializer = 17, RULE_classOrInterfaceType = 18, RULE_typeArgument = 19, 
		RULE_qualifiedNameList = 20, RULE_formalParameters = 21, RULE_formalParameterList = 22, 
		RULE_formalParameter = 23, RULE_lastFormalParameter = 24, RULE_qualifiedName = 25, 
		RULE_literal = 26, RULE_integerLiteral = 27, RULE_floatLiteral = 28, RULE_annotation = 29, 
		RULE_elementValuePairs = 30, RULE_elementValuePair = 31, RULE_elementValue = 32, 
		RULE_elementValueArrayInitializer = 33, RULE_defaultValue = 34, RULE_block = 35, 
		RULE_wrongBlockStatement = 36, RULE_blockStatement = 37, RULE_wrongLocalVariableDeclaration = 38, 
		RULE_localVariableDeclaration = 39, RULE_statement = 40, RULE_scanMissingIdentifierError = 41, 
		RULE_compareExpression = 42, RULE_printMissingQuotesError = 43, RULE_wrongPrintStatement = 44, 
		RULE_returnPrimitiveTypeError = 45, RULE_returnMissingError = 46, RULE_forError = 47, 
		RULE_catchClause = 48, RULE_catchType = 49, RULE_finallyBlock = 50, RULE_resourceSpecification = 51, 
		RULE_resources = 52, RULE_resource = 53, RULE_switchBlockStatementGroup = 54, 
		RULE_switchLabel = 55, RULE_forControl = 56, RULE_forInit = 57, RULE_enhancedForControl = 58, 
		RULE_parExpression = 59, RULE_excessLParenExpression = 60, RULE_excessRParenExpression = 61, 
		RULE_expressionList = 62, RULE_methodCall = 63, RULE_expression = 64, 
		RULE_primaryError = 65, RULE_expressionError = 66, RULE_expressionAdditionError = 67, 
		RULE_expressionSubtractionError = 68, RULE_primary = 69, RULE_arrayCreatorRest = 70, 
		RULE_typeList = 71, RULE_typeType = 72, RULE_primitiveType = 73, RULE_typeArguments = 74, 
		RULE_arguments = 75;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "variableModifier", "typeParameters", "typeParameter", 
			"typeBound", "methodDeclaration", "methodBody", "typeTypeOrVoid", "constDeclaration", 
			"constantDeclarator", "interfaceMethodDeclaration", "interfaceMethodModifier", 
			"genericInterfaceMethodDeclaration", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "classOrInterfaceType", 
			"typeArgument", "qualifiedNameList", "formalParameters", "formalParameterList", 
			"formalParameter", "lastFormalParameter", "qualifiedName", "literal", 
			"integerLiteral", "floatLiteral", "annotation", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "defaultValue", 
			"block", "wrongBlockStatement", "blockStatement", "wrongLocalVariableDeclaration", 
			"localVariableDeclaration", "statement", "scanMissingIdentifierError", 
			"compareExpression", "printMissingQuotesError", "wrongPrintStatement", 
			"returnPrimitiveTypeError", "returnMissingError", "forError", "catchClause", 
			"catchType", "finallyBlock", "resourceSpecification", "resources", "resource", 
			"switchBlockStatementGroup", "switchLabel", "forControl", "forInit", 
			"enhancedForControl", "parExpression", "excessLParenExpression", "excessRParenExpression", 
			"expressionList", "methodCall", "expression", "primaryError", "expressionError", 
			"expressionAdditionError", "expressionSubtractionError", "primary", "arrayCreatorRest", 
			"typeList", "typeType", "primitiveType", "typeArguments", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bulalo'", "'kitkat'", "'bite'", "'caserola'", "'ketchup'", "'chicharon'", 
			"'tubig'", "'coconut'", "'plain'", "'donut'", "'adobo'", "'eel'", "'garnish'", 
			"'serve'", "'mango'", "'pork'", "'beef'", "'goto'", "'pint'", "'longganisa'", 
			"'kangkong'", "'rice'", "'shortcake'", "'stove'", "'baking'", "'sugar'", 
			"'stir'", "'turon'", "'turons'", "'truffle'", "'fry'", "'boil'", "'bolabola'", 
			"'wine'", "'plate'", "'shop'", null, null, null, null, null, null, null, 
			null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", 
			"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
			"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", 
			"'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'->'", "'::'", 
			"'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CONST", "CONTINUE", 
			"DEFAULT", "DO", "DOUBLE", "ELSE", "FINAL", "FINALLY", "FLOAT", "FOR", 
			"IF", "GOTO", "INT", "LONG", "NATIVE", "RETURN", "SHORT", "STATIC", "STRICTFP", 
			"SWITCH", "SYNCHRONIZED", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", 
			"VOLATILE", "WHILE", "PRINT", "SCAN", "DECIMAL_LITERAL", "HEX_LITERAL", 
			"OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", 
			"COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER", 
			"ERROR_STRING_LITERAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Kaon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KaonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(KaonParser.EOF, 0); }
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID))) != 0)) {
				{
				{
				setState(152);
				methodDeclaration();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(KaonParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableModifier);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(KaonParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(KaonParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(KaonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KaonParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(LT);
			setState(165);
			typeParameter();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(166);
				match(COMMA);
				setState(167);
				typeParameter();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(175);
				annotation();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(IDENTIFIER);
			setState(182);
			typeBound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(KaonParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(KaonParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			typeType();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(185);
				match(BITAND);
				setState(186);
				typeType();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(KaonParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(KaonParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(KaonParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(KaonParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(KaonParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			typeTypeOrVoid();
			setState(193);
			match(IDENTIFIER);
			setState(194);
			formalParameters();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(195);
				match(LBRACK);
				setState(196);
				match(RBRACK);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(202);
				match(THROWS);
				setState(203);
				qualifiedNameList();
				}
			}

			setState(206);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(KaonParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodBody);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(KaonParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitTypeTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeTypeOrVoid);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(KaonParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(KaonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KaonParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			typeType();
			setState(217);
			constantDeclarator();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(218);
				match(COMMA);
				setState(219);
				constantDeclarator();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(KaonParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(KaonParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(KaonParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(KaonParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(KaonParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(IDENTIFIER);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(228);
				match(LBRACK);
				setState(229);
				match(RBRACK);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(ASSIGN);
			setState(236);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(KaonParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(KaonParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(KaonParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(KaonParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(KaonParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFAULT) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(238);
				interfaceMethodModifier();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
				{
				setState(244);
				typeTypeOrVoid();
				}
				break;
			case LT:
				{
				setState(245);
				typeParameters();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(246);
					annotation();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				typeTypeOrVoid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(256);
			match(IDENTIFIER);
			setState(257);
			formalParameters();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(258);
				match(LBRACK);
				setState(259);
				match(RBRACK);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(265);
				match(THROWS);
				setState(266);
				qualifiedNameList();
				}
			}

			setState(269);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(KaonParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(KaonParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(KaonParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceMethodModifier);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				annotation();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitGenericInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			typeParameters();
			setState(278);
			interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KaonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KaonParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			variableDeclarator();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(281);
				match(COMMA);
				setState(282);
				variableDeclarator();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KaonParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			variableDeclaratorId();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(289);
				match(ASSIGN);
				setState(290);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(KaonParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(KaonParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(KaonParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(KaonParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(IDENTIFIER);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(294);
				match(LBRACK);
				setState(295);
				match(RBRACK);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableInitializer);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case COLONCOLON:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KaonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KaonParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(LBRACE);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (COLONCOLON - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				setState(306);
				variableInitializer();
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(307);
						match(COMMA);
						setState(308);
						variableInitializer();
						}
						} 
					}
					setState(313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(314);
					match(COMMA);
					}
				}

				}
			}

			setState(319);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(KaonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(KaonParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(KaonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(KaonParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(IDENTIFIER);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(322);
				typeArguments();
				}
			}

			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(325);
				match(DOT);
				setState(326);
				match(IDENTIFIER);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(327);
					typeArguments();
					}
				}

				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(KaonParser.QUESTION, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeArgument);
		int _la;
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(QUESTION);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) {
					{
					setState(337);
					typeType();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KaonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KaonParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			qualifiedName();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(343);
				match(COMMA);
				setState(344);
				qualifiedName();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(LPAREN);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT) {
				{
				setState(351);
				formalParameterList();
				}
			}

			setState(354);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KaonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KaonParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				formalParameter();
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(357);
						match(COMMA);
						setState(358);
						formalParameter();
						}
						} 
					}
					setState(363);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(364);
					match(COMMA);
					setState(365);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(371);
				variableModifier();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
			typeType();
			setState(378);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(KaonParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(380);
				variableModifier();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			typeType();
			setState(387);
			match(ELLIPSIS);
			setState(388);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(KaonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(KaonParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(KaonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(KaonParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(IDENTIFIER);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(391);
				match(DOT);
				setState(392);
				match(IDENTIFIER);
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(KaonParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(KaonParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(KaonParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(KaonParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(403);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(KaonParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(KaonParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(KaonParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(KaonParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(KaonParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(KaonParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(KaonParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(AT);
			setState(411);
			qualifiedName();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(412);
				match(LPAREN);
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(413);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(414);
					elementValue();
					}
					break;
				}
				setState(417);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KaonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KaonParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			elementValuePair();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(421);
				match(COMMA);
				setState(422);
				elementValuePair();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(KaonParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(IDENTIFIER);
			setState(429);
			match(ASSIGN);
			setState(430);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_elementValue);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case COLONCOLON:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KaonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KaonParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(LBRACE);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (COLONCOLON - 69)) | (1L << (AT - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				setState(438);
				elementValue();
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(439);
						match(COMMA);
						setState(440);
						elementValue();
						}
						} 
					}
					setState(445);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
			}

			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(448);
				match(COMMA);
				}
			}

			setState(451);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(KaonParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(DEFAULT);
			setState(454);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public WrongBlockStatementContext wrongBlockStatement() {
			return getRuleContext(WrongBlockStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_block);
		int _la;
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				match(LBRACE);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << RETURN) | (1L << SHORT) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << PRINT) | (1L << SCAN) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (COLONCOLON - 69)) | (1L << (AT - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
					{
					{
					setState(457);
					blockStatement();
					}
					}
					setState(462);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(463);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				wrongBlockStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WrongBlockStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public WrongBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrongBlockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterWrongBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitWrongBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitWrongBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WrongBlockStatementContext wrongBlockStatement() throws RecognitionException {
		WrongBlockStatementContext _localctx = new WrongBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_wrongBlockStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(LBRACE);
			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(468);
					blockStatement();
					}
					} 
				}
				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(474);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(KaonParser.SEMI, 0); }
		public WrongLocalVariableDeclarationContext wrongLocalVariableDeclaration() {
			return getRuleContext(WrongLocalVariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_blockStatement);
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				localVariableDeclaration();
				setState(477);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				wrongLocalVariableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WrongLocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public WrongLocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrongLocalVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterWrongLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitWrongLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitWrongLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WrongLocalVariableDeclarationContext wrongLocalVariableDeclaration() throws RecognitionException {
		WrongLocalVariableDeclarationContext _localctx = new WrongLocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_wrongLocalVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(483);
				variableModifier();
				}
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(489);
			typeType();
			setState(490);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			typeType();
			setState(493);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(KaonParser.IF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ExcessLParenExpressionContext excessLParenExpression() {
			return getRuleContext(ExcessLParenExpressionContext.class,0);
		}
		public ExcessRParenExpressionContext excessRParenExpression() {
			return getRuleContext(ExcessRParenExpressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(KaonParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(KaonParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public TerminalNode PRINT() { return getToken(KaonParser.PRINT, 0); }
		public TerminalNode SEMI() { return getToken(KaonParser.SEMI, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(KaonParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(KaonParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(KaonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(KaonParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ADD() { return getTokens(KaonParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(KaonParser.ADD, i);
		}
		public WrongPrintStatementContext wrongPrintStatement() {
			return getRuleContext(WrongPrintStatementContext.class,0);
		}
		public ScanMissingIdentifierErrorContext scanMissingIdentifierError() {
			return getRuleContext(ScanMissingIdentifierErrorContext.class,0);
		}
		public TerminalNode SCAN() { return getToken(KaonParser.SCAN, 0); }
		public TerminalNode WHILE() { return getToken(KaonParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(KaonParser.DO, 0); }
		public TerminalNode TRY() { return getToken(KaonParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(KaonParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(KaonParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(KaonParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnPrimitiveTypeErrorContext returnPrimitiveTypeError() {
			return getRuleContext(ReturnPrimitiveTypeErrorContext.class,0);
		}
		public ReturnMissingErrorContext returnMissingError() {
			return getRuleContext(ReturnMissingErrorContext.class,0);
		}
		public TerminalNode THROW() { return getToken(KaonParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(KaonParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(KaonParser.CONTINUE, 0); }
		public TerminalNode COLON() { return getToken(KaonParser.COLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(IF);
				setState(500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(497);
					parExpression();
					}
					break;
				case 2:
					{
					setState(498);
					excessLParenExpression();
					}
					break;
				case 3:
					{
					setState(499);
					excessRParenExpression();
					}
					break;
				}
				setState(502);
				statement();
				setState(505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(503);
					match(ELSE);
					setState(504);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
				match(FOR);
				setState(508);
				match(LPAREN);
				setState(509);
				forControl();
				setState(510);
				match(RPAREN);
				setState(511);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(513);
				match(PRINT);
				setState(514);
				match(LPAREN);
				setState(515);
				_la = _input.LA(1);
				if ( !(_la==STRING_LITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(516);
				match(RPAREN);
				setState(517);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(518);
				match(PRINT);
				setState(519);
				match(LPAREN);
				setState(520);
				match(STRING_LITERAL);
				setState(521);
				match(ADD);
				setState(522);
				match(IDENTIFIER);
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD) {
					{
					{
					setState(523);
					match(ADD);
					setState(524);
					match(STRING_LITERAL);
					setState(525);
					match(ADD);
					setState(526);
					match(IDENTIFIER);
					}
					}
					setState(531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(532);
				match(RPAREN);
				setState(533);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(534);
				wrongPrintStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(535);
				scanMissingIdentifierError();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(536);
				match(SCAN);
				setState(537);
				match(LPAREN);
				setState(538);
				match(IDENTIFIER);
				setState(539);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(540);
				match(WHILE);
				setState(544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(541);
					parExpression();
					}
					break;
				case 2:
					{
					setState(542);
					excessLParenExpression();
					}
					break;
				case 3:
					{
					setState(543);
					excessRParenExpression();
					}
					break;
				}
				setState(546);
				statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(548);
				match(DO);
				setState(549);
				statement();
				setState(550);
				match(WHILE);
				setState(554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(551);
					parExpression();
					}
					break;
				case 2:
					{
					setState(552);
					excessLParenExpression();
					}
					break;
				case 3:
					{
					setState(553);
					excessRParenExpression();
					}
					break;
				}
				setState(556);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(558);
				match(TRY);
				setState(559);
				block();
				setState(569);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(561); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(560);
							catchClause();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(563); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(566);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						setState(565);
						finallyBlock();
						}
						break;
					}
					}
					break;
				case FINALLY:
					{
					setState(568);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(571);
				match(TRY);
				setState(572);
				resourceSpecification();
				setState(573);
				block();
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(574);
						catchClause();
						}
						} 
					}
					setState(579);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(581);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(580);
					finallyBlock();
					}
					break;
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(583);
				match(SWITCH);
				setState(587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(584);
					parExpression();
					}
					break;
				case 2:
					{
					setState(585);
					excessLParenExpression();
					}
					break;
				case 3:
					{
					setState(586);
					excessRParenExpression();
					}
					break;
				}
				setState(589);
				match(LBRACE);
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(590);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(595);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(596);
					switchLabel();
					}
					}
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(602);
				match(RBRACE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(604);
				match(SYNCHRONIZED);
				setState(608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(605);
					parExpression();
					}
					break;
				case 2:
					{
					setState(606);
					excessLParenExpression();
					}
					break;
				case 3:
					{
					setState(607);
					excessRParenExpression();
					}
					break;
				}
				setState(610);
				block();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(612);
				match(RETURN);
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (COLONCOLON - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
					{
					setState(613);
					expression(0);
					}
				}

				setState(616);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(617);
				returnPrimitiveTypeError();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(618);
				returnMissingError();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(619);
				match(THROW);
				setState(620);
				expression(0);
				setState(621);
				match(SEMI);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(623);
				match(BREAK);
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(624);
					match(IDENTIFIER);
					}
				}

				setState(627);
				match(SEMI);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(628);
				match(CONTINUE);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(629);
					match(IDENTIFIER);
					}
				}

				setState(632);
				match(SEMI);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(633);
				match(SEMI);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(634);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(635);
				match(SEMI);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(637);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(638);
				match(COLON);
				setState(639);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanMissingIdentifierErrorContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(KaonParser.SCAN, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public ScanMissingIdentifierErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanMissingIdentifierError; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterScanMissingIdentifierError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitScanMissingIdentifierError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitScanMissingIdentifierError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanMissingIdentifierErrorContext scanMissingIdentifierError() throws RecognitionException {
		ScanMissingIdentifierErrorContext _localctx = new ScanMissingIdentifierErrorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_scanMissingIdentifierError);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(SCAN);
			setState(643);
			match(LPAREN);
			setState(644);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareExpressionContext extends ParserRuleContext {
		public Token bop;
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(KaonParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(KaonParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(KaonParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(KaonParser.OR, i);
		}
		public List<TerminalNode> LE() { return getTokens(KaonParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(KaonParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(KaonParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(KaonParser.GE, i);
		}
		public List<TerminalNode> GT() { return getTokens(KaonParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(KaonParser.GT, i);
		}
		public List<TerminalNode> LT() { return getTokens(KaonParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(KaonParser.LT, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(KaonParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(KaonParser.EQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(KaonParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(KaonParser.NOTEQUAL, i);
		}
		public CompareExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_compareExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(646);
			primary();
			setState(647);
			((CompareExpressionContext)_localctx).bop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (GT - 57)) | (1L << (LT - 57)) | (1L << (EQUAL - 57)) | (1L << (LE - 57)) | (1L << (GE - 57)) | (1L << (NOTEQUAL - 57)))) != 0)) ) {
				((CompareExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(648);
			primary();
			}
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				setState(655);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AND:
					{
					setState(650);
					match(AND);
					}
					break;
				case OR:
					{
					setState(651);
					match(OR);
					setState(652);
					primary();
					setState(653);
					((CompareExpressionContext)_localctx).bop = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (GT - 57)) | (1L << (LT - 57)) | (1L << (EQUAL - 57)) | (1L << (LE - 57)) | (1L << (GE - 57)) | (1L << (NOTEQUAL - 57)))) != 0)) ) {
						((CompareExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintMissingQuotesErrorContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(KaonParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public TerminalNode ERROR_STRING_LITERAL() { return getToken(KaonParser.ERROR_STRING_LITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public PrintMissingQuotesErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printMissingQuotesError; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterPrintMissingQuotesError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitPrintMissingQuotesError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitPrintMissingQuotesError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintMissingQuotesErrorContext printMissingQuotesError() throws RecognitionException {
		PrintMissingQuotesErrorContext _localctx = new PrintMissingQuotesErrorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_printMissingQuotesError);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(PRINT);
			setState(661);
			match(LPAREN);
			setState(662);
			match(ERROR_STRING_LITERAL);
			setState(663);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WrongPrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(KaonParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public List<TerminalNode> ADD() { return getTokens(KaonParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(KaonParser.ADD, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(KaonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(KaonParser.IDENTIFIER, i);
		}
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(KaonParser.SEMI, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(KaonParser.STRING_LITERAL, 0); }
		public List<TerminalNode> SUB() { return getTokens(KaonParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(KaonParser.SUB, i);
		}
		public List<TerminalNode> DIV() { return getTokens(KaonParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(KaonParser.DIV, i);
		}
		public List<TerminalNode> MUL() { return getTokens(KaonParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(KaonParser.MUL, i);
		}
		public WrongPrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrongPrintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterWrongPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitWrongPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitWrongPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WrongPrintStatementContext wrongPrintStatement() throws RecognitionException {
		WrongPrintStatementContext _localctx = new WrongPrintStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_wrongPrintStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(PRINT);
			setState(666);
			match(LPAREN);
			setState(667);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(668);
			match(ADD);
			setState(669);
			match(IDENTIFIER);
			setState(671); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(670);
				_la = _input.LA(1);
				if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (MUL - 71)) | (1L << (DIV - 71)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(673); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (MUL - 71)) | (1L << (DIV - 71)))) != 0) );
			setState(675);
			match(RPAREN);
			setState(676);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnPrimitiveTypeErrorContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(KaonParser.RETURN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(KaonParser.SEMI, 0); }
		public ReturnPrimitiveTypeErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnPrimitiveTypeError; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterReturnPrimitiveTypeError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitReturnPrimitiveTypeError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitReturnPrimitiveTypeError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnPrimitiveTypeErrorContext returnPrimitiveTypeError() throws RecognitionException {
		ReturnPrimitiveTypeErrorContext _localctx = new ReturnPrimitiveTypeErrorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_returnPrimitiveTypeError);
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				match(RETURN);
				setState(679);
				primitiveType();
				setState(680);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(RETURN);
				setState(683);
				primitiveType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnMissingErrorContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(KaonParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnMissingErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnMissingError; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterReturnMissingError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitReturnMissingError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitReturnMissingError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnMissingErrorContext returnMissingError() throws RecognitionException {
		ReturnMissingErrorContext _localctx = new ReturnMissingErrorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_returnMissingError);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(RETURN);
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(687);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForErrorContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KaonParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public ForErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forError; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterForError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitForError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitForError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForErrorContext forError() throws RecognitionException {
		ForErrorContext _localctx = new ForErrorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_forError);
		try {
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				match(FOR);
				setState(691);
				match(LPAREN);
				setState(692);
				forControl();
				setState(693);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				match(FOR);
				setState(696);
				forControl();
				setState(697);
				match(RPAREN);
				setState(698);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(KaonParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(CATCH);
			setState(703);
			match(LPAREN);
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(704);
				variableModifier();
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(710);
			catchType();
			setState(711);
			match(IDENTIFIER);
			setState(712);
			match(RPAREN);
			setState(713);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(KaonParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(KaonParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			qualifiedName();
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(716);
				match(BITOR);
				setState(717);
				qualifiedName();
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(KaonParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(FINALLY);
			setState(724);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(KaonParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(LPAREN);
			setState(727);
			resources();
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(728);
				match(SEMI);
				}
			}

			setState(731);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(KaonParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KaonParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			resource();
			setState(738);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(734);
					match(SEMI);
					setState(735);
					resource();
					}
					} 
				}
				setState(740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KaonParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(741);
				variableModifier();
				}
				}
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(747);
			classOrInterfaceType();
			setState(748);
			variableDeclaratorId();
			setState(749);
			match(ASSIGN);
			setState(750);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(752);
				switchLabel();
				}
				}
				setState(755); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(758); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(757);
				blockStatement();
				}
				}
				setState(760); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << RETURN) | (1L << SHORT) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << PRINT) | (1L << SCAN) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (COLONCOLON - 69)) | (1L << (AT - 69)) | (1L << (IDENTIFIER - 69)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(KaonParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(KaonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(KaonParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_switchLabel);
		try {
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				match(CASE);
				setState(765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(763);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(764);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(767);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				match(DEFAULT);
				setState(769);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KaonParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KaonParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forControl);
		int _la;
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (COLONCOLON - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
					{
					setState(773);
					forInit();
					}
				}

				setState(776);
				match(SEMI);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (COLONCOLON - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
					{
					setState(777);
					expression(0);
					}
				}

				setState(780);
				match(SEMI);
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(781);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forInit);
		try {
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KaonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(790);
				variableModifier();
				}
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(796);
			typeType();
			setState(797);
			variableDeclaratorId();
			setState(798);
			match(COLON);
			setState(799);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(LPAREN);
			setState(802);
			expression(0);
			setState(803);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExcessLParenExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(KaonParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(KaonParser.LPAREN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public ExcessLParenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excessLParenExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterExcessLParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitExcessLParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitExcessLParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExcessLParenExpressionContext excessLParenExpression() throws RecognitionException {
		ExcessLParenExpressionContext _localctx = new ExcessLParenExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_excessLParenExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(LPAREN);
			setState(806);
			match(LPAREN);
			setState(807);
			expression(0);
			setState(808);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExcessRParenExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(KaonParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(KaonParser.RPAREN, i);
		}
		public ExcessRParenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excessRParenExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterExcessRParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitExcessRParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitExcessRParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExcessRParenExpressionContext excessRParenExpression() throws RecognitionException {
		ExcessRParenExpressionContext _localctx = new ExcessRParenExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_excessRParenExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(LPAREN);
			setState(811);
			expression(0);
			setState(812);
			match(RPAREN);
			setState(813);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KaonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KaonParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			expression(0);
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(816);
				match(COMMA);
				setState(817);
				expression(0);
				}
				}
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(IDENTIFIER);
			setState(824);
			match(LPAREN);
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (COLONCOLON - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				setState(825);
				expressionList();
				}
			}

			setState(828);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token postfix;
		public Token bop;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryErrorContext primaryError() {
			return getRuleContext(PrimaryErrorContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(KaonParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KaonParser.SUB, 0); }
		public TerminalNode INC() { return getToken(KaonParser.INC, 0); }
		public TerminalNode DEC() { return getToken(KaonParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(KaonParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(KaonParser.BANG, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public ExpressionErrorContext expressionError() {
			return getRuleContext(ExpressionErrorContext.class,0);
		}
		public ExpressionAdditionErrorContext expressionAdditionError() {
			return getRuleContext(ExpressionAdditionErrorContext.class,0);
		}
		public ExpressionSubtractionErrorContext expressionSubtractionError() {
			return getRuleContext(ExpressionSubtractionErrorContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(KaonParser.COLONCOLON, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode MUL() { return getToken(KaonParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(KaonParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(KaonParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(KaonParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(KaonParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(KaonParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(KaonParser.GT, i);
		}
		public TerminalNode LE() { return getToken(KaonParser.LE, 0); }
		public TerminalNode GE() { return getToken(KaonParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(KaonParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(KaonParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(KaonParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(KaonParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(KaonParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(KaonParser.AND, 0); }
		public TerminalNode OR() { return getToken(KaonParser.OR, 0); }
		public TerminalNode COLON() { return getToken(KaonParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(KaonParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(KaonParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(KaonParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(KaonParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(KaonParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(KaonParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(KaonParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(KaonParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(KaonParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(KaonParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(KaonParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(KaonParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(KaonParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(KaonParser.DOT, 0); }
		public TerminalNode LBRACK() { return getToken(KaonParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(KaonParser.RBRACK, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(831);
				primary();
				}
				break;
			case 2:
				{
				setState(832);
				primaryError();
				}
				break;
			case 3:
				{
				setState(833);
				methodCall();
				}
				break;
			case 4:
				{
				setState(834);
				match(LPAREN);
				setState(835);
				typeType();
				setState(836);
				match(RPAREN);
				setState(837);
				expression(22);
				}
				break;
			case 5:
				{
				setState(839);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(840);
				expression(21);
				}
				break;
			case 6:
				{
				setState(841);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(842);
				expression(20);
				}
				break;
			case 7:
				{
				setState(843);
				match(IDENTIFIER);
				setState(844);
				((ExpressionContext)_localctx).postfix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 8:
				{
				setState(845);
				expressionError();
				}
				break;
			case 9:
				{
				setState(846);
				expressionAdditionError();
				}
				break;
			case 10:
				{
				setState(847);
				expressionSubtractionError();
				}
				break;
			case 11:
				{
				setState(848);
				typeType();
				setState(849);
				match(COLONCOLON);
				{
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(850);
					typeArguments();
					}
				}

				setState(853);
				match(IDENTIFIER);
				}
				}
				break;
			case 12:
				{
				setState(855);
				match(COLONCOLON);
				setState(857);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(856);
					typeArguments();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(927);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(925);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(861);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(862);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (MUL - 73)) | (1L << (DIV - 73)) | (1L << (MOD - 73)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(863);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(864);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(865);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(866);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(867);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(875);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
						case 1:
							{
							setState(868);
							match(LT);
							setState(869);
							match(LT);
							}
							break;
						case 2:
							{
							setState(870);
							match(GT);
							setState(871);
							match(GT);
							setState(872);
							match(GT);
							}
							break;
						case 3:
							{
							setState(873);
							match(GT);
							setState(874);
							match(GT);
							}
							break;
						}
						setState(877);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(878);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(879);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (GT - 57)) | (1L << (LT - 57)) | (1L << (LE - 57)) | (1L << (GE - 57)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(880);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(881);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(882);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(883);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(884);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(885);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(886);
						expression(11);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(887);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(888);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(889);
						expression(10);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(890);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(891);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(892);
						expression(9);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(893);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(894);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(895);
						expression(8);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(896);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(897);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(898);
						expression(7);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(899);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(900);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(901);
						expression(0);
						setState(902);
						match(COLON);
						setState(903);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(905);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(906);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (ASSIGN - 56)) | (1L << (ADD_ASSIGN - 56)) | (1L << (SUB_ASSIGN - 56)) | (1L << (MUL_ASSIGN - 56)) | (1L << (DIV_ASSIGN - 56)) | (1L << (AND_ASSIGN - 56)) | (1L << (OR_ASSIGN - 56)) | (1L << (XOR_ASSIGN - 56)) | (1L << (MOD_ASSIGN - 56)) | (1L << (LSHIFT_ASSIGN - 56)) | (1L << (RSHIFT_ASSIGN - 56)) | (1L << (URSHIFT_ASSIGN - 56)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(907);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(908);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(909);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(912);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
						case 1:
							{
							setState(910);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(911);
							methodCall();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(914);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(915);
						match(LBRACK);
						setState(916);
						expression(0);
						setState(917);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(919);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(920);
						match(COLONCOLON);
						setState(922);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(921);
							typeArguments();
							}
						}

						setState(924);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryErrorContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(KaonParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(KaonParser.LPAREN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(KaonParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(KaonParser.RPAREN, i);
		}
		public PrimaryErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryError; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterPrimaryError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitPrimaryError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitPrimaryError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryErrorContext primaryError() throws RecognitionException {
		PrimaryErrorContext _localctx = new PrimaryErrorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_primaryError);
		try {
			int _alt;
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				match(LPAREN);
				setState(931);
				expression(0);
				setState(932);
				match(RPAREN);
				setState(936);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(933);
						match(RPAREN);
						}
						} 
					}
					setState(938);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				match(LPAREN);
				setState(943);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(940);
						match(LPAREN);
						}
						} 
					}
					setState(945);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				setState(946);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionErrorContext extends ParserRuleContext {
		public Token postfix;
		public Token prefix;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode INC() { return getToken(KaonParser.INC, 0); }
		public TerminalNode DEC() { return getToken(KaonParser.DEC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionError; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterExpressionError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitExpressionError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitExpressionError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionErrorContext expressionError() throws RecognitionException {
		ExpressionErrorContext _localctx = new ExpressionErrorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_expressionError);
		int _la;
		try {
			setState(954);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				literal();
				setState(950);
				((ExpressionErrorContext)_localctx).postfix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((ExpressionErrorContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case INC:
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				((ExpressionErrorContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((ExpressionErrorContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(953);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionAdditionErrorContext extends ParserRuleContext {
		public Token postfix;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode INC() { return getToken(KaonParser.INC, 0); }
		public ExpressionAdditionErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAdditionError; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterExpressionAdditionError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitExpressionAdditionError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitExpressionAdditionError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAdditionErrorContext expressionAdditionError() throws RecognitionException {
		ExpressionAdditionErrorContext _localctx = new ExpressionAdditionErrorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_expressionAdditionError);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			literal();
			setState(957);
			((ExpressionAdditionErrorContext)_localctx).postfix = match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSubtractionErrorContext extends ParserRuleContext {
		public Token postfix;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode DEC() { return getToken(KaonParser.DEC, 0); }
		public ExpressionSubtractionErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSubtractionError; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterExpressionSubtractionError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitExpressionSubtractionError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitExpressionSubtractionError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSubtractionErrorContext expressionSubtractionError() throws RecognitionException {
		ExpressionSubtractionErrorContext _localctx = new ExpressionSubtractionErrorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_expressionSubtractionError);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			literal();
			setState(960);
			((ExpressionSubtractionErrorContext)_localctx).postfix = match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(KaonParser.DOT, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_primary);
		try {
			setState(971);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				match(LPAREN);
				setState(963);
				expression(0);
				setState(964);
				match(RPAREN);
				}
				break;
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(967);
				match(IDENTIFIER);
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(968);
				typeTypeOrVoid();
				setState(969);
				match(DOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(KaonParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(KaonParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(KaonParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(KaonParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(LBRACK);
			setState(1001);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(974);
				match(RBRACK);
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(975);
					match(LBRACK);
					setState(976);
					match(RBRACK);
					}
					}
					setState(981);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(982);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case COLONCOLON:
			case IDENTIFIER:
				{
				setState(983);
				expression(0);
				setState(984);
				match(RBRACK);
				setState(991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(985);
						match(LBRACK);
						setState(986);
						expression(0);
						setState(987);
						match(RBRACK);
						}
						} 
					}
					setState(993);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(994);
					match(LBRACK);
					setState(995);
					match(RBRACK);
					}
					}
					setState(1000);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KaonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KaonParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			typeType();
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1004);
				match(COMMA);
				setState(1005);
				typeType();
				}
				}
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(KaonParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(KaonParser.LBRACK, i);
		}
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(KaonParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(KaonParser.DECIMAL_LITERAL, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(KaonParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(KaonParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			primitiveType();
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1012);
				match(LBRACK);
				setState(1013);
				match(DECIMAL_LITERAL);
				setState(1014);
				match(RBRACK);
				}
				}
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(KaonParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(KaonParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(KaonParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(KaonParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(KaonParser.INT, 0); }
		public TerminalNode LONG() { return getToken(KaonParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(KaonParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(KaonParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(KaonParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(KaonParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(KaonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KaonParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			match(LT);
			setState(1023);
			typeArgument();
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1024);
				match(COMMA);
				setState(1025);
				typeArgument();
				}
				}
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1031);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(LPAREN);
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (COLONCOLON - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				setState(1034);
				expressionList();
				}
			}

			setState(1037);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 64:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3d\u0412\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\7\2\u009c\n\2\f\2\16\2\u009f\13\2\3\2"+
		"\3\2\3\3\3\3\5\3\u00a5\n\3\3\4\3\4\3\4\3\4\7\4\u00ab\n\4\f\4\16\4\u00ae"+
		"\13\4\3\4\3\4\3\5\7\5\u00b3\n\5\f\5\16\5\u00b6\13\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\7\6\u00be\n\6\f\6\16\6\u00c1\13\6\3\7\3\7\3\7\3\7\3\7\7\7\u00c8"+
		"\n\7\f\7\16\7\u00cb\13\7\3\7\3\7\5\7\u00cf\n\7\3\7\3\7\3\b\3\b\5\b\u00d5"+
		"\n\b\3\t\3\t\5\t\u00d9\n\t\3\n\3\n\3\n\3\n\7\n\u00df\n\n\f\n\16\n\u00e2"+
		"\13\n\3\n\3\n\3\13\3\13\3\13\7\13\u00e9\n\13\f\13\16\13\u00ec\13\13\3"+
		"\13\3\13\3\13\3\f\7\f\u00f2\n\f\f\f\16\f\u00f5\13\f\3\f\3\f\3\f\7\f\u00fa"+
		"\n\f\f\f\16\f\u00fd\13\f\3\f\3\f\5\f\u0101\n\f\3\f\3\f\3\f\3\f\7\f\u0107"+
		"\n\f\f\f\16\f\u010a\13\f\3\f\3\f\5\f\u010e\n\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\5\r\u0116\n\r\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u011e\n\17\f\17\16\17"+
		"\u0121\13\17\3\20\3\20\3\20\5\20\u0126\n\20\3\21\3\21\3\21\7\21\u012b"+
		"\n\21\f\21\16\21\u012e\13\21\3\22\3\22\5\22\u0132\n\22\3\23\3\23\3\23"+
		"\3\23\7\23\u0138\n\23\f\23\16\23\u013b\13\23\3\23\5\23\u013e\n\23\5\23"+
		"\u0140\n\23\3\23\3\23\3\24\3\24\5\24\u0146\n\24\3\24\3\24\3\24\5\24\u014b"+
		"\n\24\7\24\u014d\n\24\f\24\16\24\u0150\13\24\3\25\3\25\3\25\5\25\u0155"+
		"\n\25\5\25\u0157\n\25\3\26\3\26\3\26\7\26\u015c\n\26\f\26\16\26\u015f"+
		"\13\26\3\27\3\27\5\27\u0163\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u016a\n"+
		"\30\f\30\16\30\u016d\13\30\3\30\3\30\5\30\u0171\n\30\3\30\5\30\u0174\n"+
		"\30\3\31\7\31\u0177\n\31\f\31\16\31\u017a\13\31\3\31\3\31\3\31\3\32\7"+
		"\32\u0180\n\32\f\32\16\32\u0183\13\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\7\33\u018c\n\33\f\33\16\33\u018f\13\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u0197\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u01a2\n\37\3\37\5\37\u01a5\n\37\3 \3 \3 \7 \u01aa\n \f \16 \u01ad\13"+
		" \3!\3!\3!\3!\3\"\3\"\3\"\5\"\u01b6\n\"\3#\3#\3#\3#\7#\u01bc\n#\f#\16"+
		"#\u01bf\13#\5#\u01c1\n#\3#\5#\u01c4\n#\3#\3#\3$\3$\3$\3%\3%\7%\u01cd\n"+
		"%\f%\16%\u01d0\13%\3%\3%\5%\u01d4\n%\3&\3&\7&\u01d8\n&\f&\16&\u01db\13"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u01e4\n\'\3(\7(\u01e7\n(\f(\16(\u01ea"+
		"\13(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\5*\u01f7\n*\3*\3*\3*\5*\u01fc\n"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u0212"+
		"\n*\f*\16*\u0215\13*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0223\n*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\5*\u022d\n*\3*\3*\3*\3*\3*\6*\u0234\n*\r*\16*\u0235"+
		"\3*\5*\u0239\n*\3*\5*\u023c\n*\3*\3*\3*\3*\7*\u0242\n*\f*\16*\u0245\13"+
		"*\3*\5*\u0248\n*\3*\3*\3*\3*\5*\u024e\n*\3*\3*\7*\u0252\n*\f*\16*\u0255"+
		"\13*\3*\7*\u0258\n*\f*\16*\u025b\13*\3*\3*\3*\3*\3*\3*\5*\u0263\n*\3*"+
		"\3*\3*\3*\5*\u0269\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0274\n*\3*\3*\3*"+
		"\5*\u0279\n*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0283\n*\3+\3+\3+\3+\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\7,\u0292\n,\f,\16,\u0295\13,\3-\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3.\3.\6.\u02a2\n.\r.\16.\u02a3\3.\3.\3.\3/\3/\3/\3/\3/\3/\5/\u02af"+
		"\n/\3\60\3\60\5\60\u02b3\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u02bf\n\61\3\62\3\62\3\62\7\62\u02c4\n\62\f\62\16\62\u02c7"+
		"\13\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u02d1\n\63\f\63\16"+
		"\63\u02d4\13\63\3\64\3\64\3\64\3\65\3\65\3\65\5\65\u02dc\n\65\3\65\3\65"+
		"\3\66\3\66\3\66\7\66\u02e3\n\66\f\66\16\66\u02e6\13\66\3\67\7\67\u02e9"+
		"\n\67\f\67\16\67\u02ec\13\67\3\67\3\67\3\67\3\67\3\67\38\68\u02f4\n8\r"+
		"8\168\u02f5\38\68\u02f9\n8\r8\168\u02fa\39\39\39\59\u0300\n9\39\39\39"+
		"\59\u0305\n9\3:\3:\5:\u0309\n:\3:\3:\5:\u030d\n:\3:\3:\5:\u0311\n:\5:"+
		"\u0313\n:\3;\3;\5;\u0317\n;\3<\7<\u031a\n<\f<\16<\u031d\13<\3<\3<\3<\3"+
		"<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\7@\u0335\n@\f"+
		"@\16@\u0338\13@\3A\3A\3A\5A\u033d\nA\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0356\nB\3B\3B\3B\3B\5B\u035c"+
		"\nB\5B\u035e\nB\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u036e\nB"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0393\nB\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\5B\u039d\nB\3B\7B\u03a0\nB\fB\16B\u03a3\13B\3C\3C\3C\3C\7C\u03a9\n"+
		"C\fC\16C\u03ac\13C\3C\3C\7C\u03b0\nC\fC\16C\u03b3\13C\3C\5C\u03b6\nC\3"+
		"D\3D\3D\3D\3D\5D\u03bd\nD\3E\3E\3E\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\5G\u03ce\nG\3H\3H\3H\3H\7H\u03d4\nH\fH\16H\u03d7\13H\3H\3H\3H\3H\3H"+
		"\3H\3H\7H\u03e0\nH\fH\16H\u03e3\13H\3H\3H\7H\u03e7\nH\fH\16H\u03ea\13"+
		"H\5H\u03ec\nH\3I\3I\3I\7I\u03f1\nI\fI\16I\u03f4\13I\3J\3J\3J\3J\7J\u03fa"+
		"\nJ\fJ\16J\u03fd\13J\3K\3K\3L\3L\3L\3L\7L\u0405\nL\fL\16L\u0408\13L\3"+
		"L\3L\3M\3M\5M\u040e\nM\3M\3M\3M\2\3\u0082N\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\2\20\3\2\'*\3\2+,\4\2//cc\4\2;<AD\3\2IL\3\2GJ\3\2=>\3\2GH\4\2K"+
		"LPP\3\2IJ\4\2;<BC\4\2AADD\4\2::Q[\t\2\3\3\5\5\b\b\r\r\21\21\25\26\31\31"+
		"\2\u0472\2\u009d\3\2\2\2\4\u00a4\3\2\2\2\6\u00a6\3\2\2\2\b\u00b4\3\2\2"+
		"\2\n\u00ba\3\2\2\2\f\u00c2\3\2\2\2\16\u00d4\3\2\2\2\20\u00d8\3\2\2\2\22"+
		"\u00da\3\2\2\2\24\u00e5\3\2\2\2\26\u00f3\3\2\2\2\30\u0115\3\2\2\2\32\u0117"+
		"\3\2\2\2\34\u011a\3\2\2\2\36\u0122\3\2\2\2 \u0127\3\2\2\2\"\u0131\3\2"+
		"\2\2$\u0133\3\2\2\2&\u0143\3\2\2\2(\u0156\3\2\2\2*\u0158\3\2\2\2,\u0160"+
		"\3\2\2\2.\u0173\3\2\2\2\60\u0178\3\2\2\2\62\u0181\3\2\2\2\64\u0188\3\2"+
		"\2\2\66\u0196\3\2\2\28\u0198\3\2\2\2:\u019a\3\2\2\2<\u019c\3\2\2\2>\u01a6"+
		"\3\2\2\2@\u01ae\3\2\2\2B\u01b5\3\2\2\2D\u01b7\3\2\2\2F\u01c7\3\2\2\2H"+
		"\u01d3\3\2\2\2J\u01d5\3\2\2\2L\u01e3\3\2\2\2N\u01e8\3\2\2\2P\u01ee\3\2"+
		"\2\2R\u0282\3\2\2\2T\u0284\3\2\2\2V\u0288\3\2\2\2X\u0296\3\2\2\2Z\u029b"+
		"\3\2\2\2\\\u02ae\3\2\2\2^\u02b0\3\2\2\2`\u02be\3\2\2\2b\u02c0\3\2\2\2"+
		"d\u02cd\3\2\2\2f\u02d5\3\2\2\2h\u02d8\3\2\2\2j\u02df\3\2\2\2l\u02ea\3"+
		"\2\2\2n\u02f3\3\2\2\2p\u0304\3\2\2\2r\u0312\3\2\2\2t\u0316\3\2\2\2v\u031b"+
		"\3\2\2\2x\u0323\3\2\2\2z\u0327\3\2\2\2|\u032c\3\2\2\2~\u0331\3\2\2\2\u0080"+
		"\u0339\3\2\2\2\u0082\u035d\3\2\2\2\u0084\u03b5\3\2\2\2\u0086\u03bc\3\2"+
		"\2\2\u0088\u03be\3\2\2\2\u008a\u03c1\3\2\2\2\u008c\u03cd\3\2\2\2\u008e"+
		"\u03cf\3\2\2\2\u0090\u03ed\3\2\2\2\u0092\u03f5\3\2\2\2\u0094\u03fe\3\2"+
		"\2\2\u0096\u0400\3\2\2\2\u0098\u040b\3\2\2\2\u009a\u009c\5\f\7\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\2\2\3\u00a1"+
		"\3\3\2\2\2\u00a2\u00a5\7\17\2\2\u00a3\u00a5\5<\37\2\u00a4\u00a2\3\2\2"+
		"\2\u00a4\u00a3\3\2\2\2\u00a5\5\3\2\2\2\u00a6\u00a7\7<\2\2\u00a7\u00ac"+
		"\5\b\5\2\u00a8\u00a9\78\2\2\u00a9\u00ab\5\b\5\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7;\2\2\u00b0\7\3\2\2\2\u00b1\u00b3"+
		"\5<\37\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7c"+
		"\2\2\u00b8\u00b9\5\n\6\2\u00b9\t\3\2\2\2\u00ba\u00bf\5\u0092J\2\u00bb"+
		"\u00bc\7M\2\2\u00bc\u00be\5\u0092J\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3"+
		"\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\13\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c3\5\20\t\2\u00c3\u00c4\7c\2\2\u00c4\u00c9\5,"+
		"\27\2\u00c5\u00c6\7\65\2\2\u00c6\u00c8\7\66\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ce\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\37\2\2\u00cd\u00cf\5*\26\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\5\16"+
		"\b\2\u00d1\r\3\2\2\2\u00d2\u00d5\5H%\2\u00d3\u00d5\7\67\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\17\3\2\2\2\u00d6\u00d9\5\u0092J\2\u00d7"+
		"\u00d9\7\"\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\21\3\2\2"+
		"\2\u00da\u00db\5\u0092J\2\u00db\u00e0\5\24\13\2\u00dc\u00dd\78\2\2\u00dd"+
		"\u00df\5\24\13\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\7\67\2\2\u00e4\23\3\2\2\2\u00e5\u00ea\7c\2\2\u00e6\u00e7\7\65\2"+
		"\2\u00e7\u00e9\7\66\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ed\u00ee\7:\2\2\u00ee\u00ef\5\"\22\2\u00ef\25\3\2\2\2\u00f0\u00f2"+
		"\5\30\r\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\u0100\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u0101"+
		"\5\20\t\2\u00f7\u00fb\5\6\4\2\u00f8\u00fa\5<\37\2\u00f9\u00f8\3\2\2\2"+
		"\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\5\20\t\2\u00ff\u0101\3\2\2\2"+
		"\u0100\u00f6\3\2\2\2\u0100\u00f7\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103"+
		"\7c\2\2\u0103\u0108\5,\27\2\u0104\u0105\7\65\2\2\u0105\u0107\7\66\2\2"+
		"\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010d\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7\37\2\2"+
		"\u010c\u010e\5*\26\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0110\5\16\b\2\u0110\27\3\2\2\2\u0111\u0116\5<\37\2\u0112"+
		"\u0116\7\13\2\2\u0113\u0116\7\32\2\2\u0114\u0116\7\33\2\2\u0115\u0111"+
		"\3\2\2\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\31\3\2\2\2\u0117\u0118\5\6\4\2\u0118\u0119\5\26\f\2\u0119\33\3\2\2\2"+
		"\u011a\u011f\5\36\20\2\u011b\u011c\78\2\2\u011c\u011e\5\36\20\2\u011d"+
		"\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\35\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0125\5 \21\2\u0123\u0124"+
		"\7:\2\2\u0124\u0126\5\"\22\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\37\3\2\2\2\u0127\u012c\7c\2\2\u0128\u0129\7\65\2\2\u0129\u012b\7\66\2"+
		"\2\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d!\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0132\5$\23\2\u0130"+
		"\u0132\5\u0082B\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132#\3\2\2"+
		"\2\u0133\u013f\7\63\2\2\u0134\u0139\5\"\22\2\u0135\u0136\78\2\2\u0136"+
		"\u0138\5\"\22\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3"+
		"\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013e\78\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2"+
		"\2\2\u013f\u0134\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0142\7\64\2\2\u0142%\3\2\2\2\u0143\u0145\7c\2\2\u0144\u0146\5\u0096"+
		"L\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u014e\3\2\2\2\u0147"+
		"\u0148\79\2\2\u0148\u014a\7c\2\2\u0149\u014b\5\u0096L\2\u014a\u0149\3"+
		"\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u0147\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\'\3\2\2\2"+
		"\u0150\u014e\3\2\2\2\u0151\u0157\5\u0092J\2\u0152\u0154\7?\2\2\u0153\u0155"+
		"\5\u0092J\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2"+
		"\2\u0156\u0151\3\2\2\2\u0156\u0152\3\2\2\2\u0157)\3\2\2\2\u0158\u015d"+
		"\5\64\33\2\u0159\u015a\78\2\2\u015a\u015c\5\64\33\2\u015b\u0159\3\2\2"+
		"\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e+"+
		"\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0162\7\61\2\2\u0161\u0163\5.\30\2"+
		"\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165"+
		"\7\62\2\2\u0165-\3\2\2\2\u0166\u016b\5\60\31\2\u0167\u0168\78\2\2\u0168"+
		"\u016a\5\60\31\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3"+
		"\2\2\2\u016b\u016c\3\2\2\2\u016c\u0170\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u016f\78\2\2\u016f\u0171\5\62\32\2\u0170\u016e\3\2\2\2\u0170\u0171\3"+
		"\2\2\2\u0171\u0174\3\2\2\2\u0172\u0174\5\62\32\2\u0173\u0166\3\2\2\2\u0173"+
		"\u0172\3\2\2\2\u0174/\3\2\2\2\u0175\u0177\5\4\3\2\u0176\u0175\3\2\2\2"+
		"\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b"+
		"\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\5\u0092J\2\u017c\u017d\5 \21"+
		"\2\u017d\61\3\2\2\2\u017e\u0180\5\4\3\2\u017f\u017e\3\2\2\2\u0180\u0183"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0185\5\u0092J\2\u0185\u0186\7_\2\2\u0186\u0187\5"+
		" \21\2\u0187\63\3\2\2\2\u0188\u018d\7c\2\2\u0189\u018a\79\2\2\u018a\u018c"+
		"\7c\2\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\65\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0197\58\35"+
		"\2\u0191\u0197\5:\36\2\u0192\u0197\7.\2\2\u0193\u0197\7/\2\2\u0194\u0197"+
		"\7-\2\2\u0195\u0197\7\60\2\2\u0196\u0190\3\2\2\2\u0196\u0191\3\2\2\2\u0196"+
		"\u0192\3\2\2\2\u0196\u0193\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2"+
		"\2\2\u0197\67\3\2\2\2\u0198\u0199\t\2\2\2\u01999\3\2\2\2\u019a\u019b\t"+
		"\3\2\2\u019b;\3\2\2\2\u019c\u019d\7^\2\2\u019d\u01a4\5\64\33\2\u019e\u01a1"+
		"\7\61\2\2\u019f\u01a2\5> \2\u01a0\u01a2\5B\"\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\7\62"+
		"\2\2\u01a4\u019e\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5=\3\2\2\2\u01a6\u01ab"+
		"\5@!\2\u01a7\u01a8\78\2\2\u01a8\u01aa\5@!\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac?\3\2\2\2"+
		"\u01ad\u01ab\3\2\2\2\u01ae\u01af\7c\2\2\u01af\u01b0\7:\2\2\u01b0\u01b1"+
		"\5B\"\2\u01b1A\3\2\2\2\u01b2\u01b6\5\u0082B\2\u01b3\u01b6\5<\37\2\u01b4"+
		"\u01b6\5D#\2\u01b5\u01b2\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2"+
		"\2\u01b6C\3\2\2\2\u01b7\u01c0\7\63\2\2\u01b8\u01bd\5B\"\2\u01b9\u01ba"+
		"\78\2\2\u01ba\u01bc\5B\"\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01c0\u01b8\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2"+
		"\u01c4\78\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c6\7\64\2\2\u01c6E\3\2\2\2\u01c7\u01c8\7\13\2\2\u01c8\u01c9"+
		"\5B\"\2\u01c9G\3\2\2\2\u01ca\u01ce\7\63\2\2\u01cb\u01cd\5L\'\2\u01cc\u01cb"+
		"\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d4\7\64\2\2\u01d2\u01d4\5"+
		"J&\2\u01d3\u01ca\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4I\3\2\2\2\u01d5\u01d9"+
		"\7\63\2\2\u01d6\u01d8\5L\'\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9"+
		"\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2"+
		"\2\2\u01dc\u01dd\5L\'\2\u01ddK\3\2\2\2\u01de\u01df\5P)\2\u01df\u01e0\7"+
		"\67\2\2\u01e0\u01e4\3\2\2\2\u01e1\u01e4\5N(\2\u01e2\u01e4\5R*\2\u01e3"+
		"\u01de\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4M\3\2\2\2"+
		"\u01e5\u01e7\5\4\3\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ec\5\u0092J\2\u01ec\u01ed\5\34\17\2\u01edO\3\2\2\2\u01ee\u01ef\5\u0092"+
		"J\2\u01ef\u01f0\5\34\17\2\u01f0Q\3\2\2\2\u01f1\u0283\5H%\2\u01f2\u01f6"+
		"\7\23\2\2\u01f3\u01f7\5x=\2\u01f4\u01f7\5z>\2\u01f5\u01f7\5|?\2\u01f6"+
		"\u01f3\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8\u01fb\5R*\2\u01f9\u01fa\7\16\2\2\u01fa\u01fc\5R*\2\u01fb\u01f9"+
		"\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0283\3\2\2\2\u01fd\u01fe\7\22\2\2"+
		"\u01fe\u01ff\7\61\2\2\u01ff\u0200\5r:\2\u0200\u0201\7\62\2\2\u0201\u0202"+
		"\5R*\2\u0202\u0283\3\2\2\2\u0203\u0204\7%\2\2\u0204\u0205\7\61\2\2\u0205"+
		"\u0206\t\4\2\2\u0206\u0207\7\62\2\2\u0207\u0283\7\67\2\2\u0208\u0209\7"+
		"%\2\2\u0209\u020a\7\61\2\2\u020a\u020b\7/\2\2\u020b\u020c\7I\2\2\u020c"+
		"\u0213\7c\2\2\u020d\u020e\7I\2\2\u020e\u020f\7/\2\2\u020f\u0210\7I\2\2"+
		"\u0210\u0212\7c\2\2\u0211\u020d\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2\2\2\u0216"+
		"\u0217\7\62\2\2\u0217\u0283\7\67\2\2\u0218\u0283\5Z.\2\u0219\u0283\5T"+
		"+\2\u021a\u021b\7&\2\2\u021b\u021c\7\61\2\2\u021c\u021d\7c\2\2\u021d\u0283"+
		"\7\62\2\2\u021e\u0222\7$\2\2\u021f\u0223\5x=\2\u0220\u0223\5z>\2\u0221"+
		"\u0223\5|?\2\u0222\u021f\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2\2"+
		"\2\u0223\u0224\3\2\2\2\u0224\u0225\5R*\2\u0225\u0283\3\2\2\2\u0226\u0227"+
		"\7\f\2\2\u0227\u0228\5R*\2\u0228\u022c\7$\2\2\u0229\u022d\5x=\2\u022a"+
		"\u022d\5z>\2\u022b\u022d\5|?\2\u022c\u0229\3\2\2\2\u022c\u022a\3\2\2\2"+
		"\u022c\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\7\67\2\2\u022f\u0283"+
		"\3\2\2\2\u0230\u0231\7!\2\2\u0231\u023b\5H%\2\u0232\u0234\5b\62\2\u0233"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2"+
		"\2\2\u0236\u0238\3\2\2\2\u0237\u0239\5f\64\2\u0238\u0237\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u023c\5f\64\2\u023b\u0233\3\2"+
		"\2\2\u023b\u023a\3\2\2\2\u023c\u0283\3\2\2\2\u023d\u023e\7!\2\2\u023e"+
		"\u023f\5h\65\2\u023f\u0243\5H%\2\u0240\u0242\5b\62\2\u0241\u0240\3\2\2"+
		"\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0247"+
		"\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0248\5f\64\2\u0247\u0246\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0283\3\2\2\2\u0249\u024d\7\34\2\2\u024a\u024e\5"+
		"x=\2\u024b\u024e\5z>\2\u024c\u024e\5|?\2\u024d\u024a\3\2\2\2\u024d\u024b"+
		"\3\2\2\2\u024d\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0253\7\63\2\2"+
		"\u0250\u0252\5n8\2\u0251\u0250\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251"+
		"\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0259\3\2\2\2\u0255\u0253\3\2\2\2\u0256"+
		"\u0258\5p9\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2"+
		"\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d"+
		"\7\64\2\2\u025d\u0283\3\2\2\2\u025e\u0262\7\35\2\2\u025f\u0263\5x=\2\u0260"+
		"\u0263\5z>\2\u0261\u0263\5|?\2\u0262\u025f\3\2\2\2\u0262\u0260\3\2\2\2"+
		"\u0262\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\5H%\2\u0265\u0283"+
		"\3\2\2\2\u0266\u0268\7\30\2\2\u0267\u0269\5\u0082B\2\u0268\u0267\3\2\2"+
		"\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0283\7\67\2\2\u026b"+
		"\u0283\5\\/\2\u026c\u0283\5^\60\2\u026d\u026e\7\36\2\2\u026e\u026f\5\u0082"+
		"B\2\u026f\u0270\7\67\2\2\u0270\u0283\3\2\2\2\u0271\u0273\7\4\2\2\u0272"+
		"\u0274\7c\2\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2"+
		"\2\2\u0275\u0283\7\67\2\2\u0276\u0278\7\n\2\2\u0277\u0279\7c\2\2\u0278"+
		"\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0283\7\67"+
		"\2\2\u027b\u0283\7\67\2\2\u027c\u027d\5\u0082B\2\u027d\u027e\7\67\2\2"+
		"\u027e\u0283\3\2\2\2\u027f\u0280\7c\2\2\u0280\u0281\7@\2\2\u0281\u0283"+
		"\5R*\2\u0282\u01f1\3\2\2\2\u0282\u01f2\3\2\2\2\u0282\u01fd\3\2\2\2\u0282"+
		"\u0203\3\2\2\2\u0282\u0208\3\2\2\2\u0282\u0218\3\2\2\2\u0282\u0219\3\2"+
		"\2\2\u0282\u021a\3\2\2\2\u0282\u021e\3\2\2\2\u0282\u0226\3\2\2\2\u0282"+
		"\u0230\3\2\2\2\u0282\u023d\3\2\2\2\u0282\u0249\3\2\2\2\u0282\u025e\3\2"+
		"\2\2\u0282\u0266\3\2\2\2\u0282\u026b\3\2\2\2\u0282\u026c\3\2\2\2\u0282"+
		"\u026d\3\2\2\2\u0282\u0271\3\2\2\2\u0282\u0276\3\2\2\2\u0282\u027b\3\2"+
		"\2\2\u0282\u027c\3\2\2\2\u0282\u027f\3\2\2\2\u0283S\3\2\2\2\u0284\u0285"+
		"\7&\2\2\u0285\u0286\7\61\2\2\u0286\u0287\7\62\2\2\u0287U\3\2\2\2\u0288"+
		"\u0289\5\u008cG\2\u0289\u028a\t\5\2\2\u028a\u028b\5\u008cG\2\u028b\u0293"+
		"\3\2\2\2\u028c\u0292\7E\2\2\u028d\u028e\7F\2\2\u028e\u028f\5\u008cG\2"+
		"\u028f\u0290\t\5\2\2\u0290\u0292\3\2\2\2\u0291\u028c\3\2\2\2\u0291\u028d"+
		"\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"W\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0297\7%\2\2\u0297\u0298\7\61\2\2"+
		"\u0298\u0299\7d\2\2\u0299\u029a\7\62\2\2\u029aY\3\2\2\2\u029b\u029c\7"+
		"%\2\2\u029c\u029d\7\61\2\2\u029d\u029e\t\4\2\2\u029e\u029f\7I\2\2\u029f"+
		"\u02a1\7c\2\2\u02a0\u02a2\t\6\2\2\u02a1\u02a0\3\2\2\2\u02a2\u02a3\3\2"+
		"\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a6\7\62\2\2\u02a6\u02a7\7\67\2\2\u02a7[\3\2\2\2\u02a8\u02a9\7\30\2"+
		"\2\u02a9\u02aa\5\u0094K\2\u02aa\u02ab\7\67\2\2\u02ab\u02af\3\2\2\2\u02ac"+
		"\u02ad\7\30\2\2\u02ad\u02af\5\u0094K\2\u02ae\u02a8\3\2\2\2\u02ae\u02ac"+
		"\3\2\2\2\u02af]\3\2\2\2\u02b0\u02b2\7\30\2\2\u02b1\u02b3\5\u0082B\2\u02b2"+
		"\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3_\3\2\2\2\u02b4\u02b5\7\22\2\2"+
		"\u02b5\u02b6\7\61\2\2\u02b6\u02b7\5r:\2\u02b7\u02b8\5R*\2\u02b8\u02bf"+
		"\3\2\2\2\u02b9\u02ba\7\22\2\2\u02ba\u02bb\5r:\2\u02bb\u02bc\7\62\2\2\u02bc"+
		"\u02bd\5R*\2\u02bd\u02bf\3\2\2\2\u02be\u02b4\3\2\2\2\u02be\u02b9\3\2\2"+
		"\2\u02bfa\3\2\2\2\u02c0\u02c1\7\7\2\2\u02c1\u02c5\7\61\2\2\u02c2\u02c4"+
		"\5\4\3\2\u02c3\u02c2\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5"+
		"\u02c6\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\5d"+
		"\63\2\u02c9\u02ca\7c\2\2\u02ca\u02cb\7\62\2\2\u02cb\u02cc\5H%\2\u02cc"+
		"c\3\2\2\2\u02cd\u02d2\5\64\33\2\u02ce\u02cf\7N\2\2\u02cf\u02d1\5\64\33"+
		"\2\u02d0\u02ce\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3"+
		"\3\2\2\2\u02d3e\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d6\7\20\2\2\u02d6"+
		"\u02d7\5H%\2\u02d7g\3\2\2\2\u02d8\u02d9\7\61\2\2\u02d9\u02db\5j\66\2\u02da"+
		"\u02dc\7\67\2\2\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3"+
		"\2\2\2\u02dd\u02de\7\62\2\2\u02dei\3\2\2\2\u02df\u02e4\5l\67\2\u02e0\u02e1"+
		"\7\67\2\2\u02e1\u02e3\5l\67\2\u02e2\u02e0\3\2\2\2\u02e3\u02e6\3\2\2\2"+
		"\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5k\3\2\2\2\u02e6\u02e4\3"+
		"\2\2\2\u02e7\u02e9\5\4\3\2\u02e8\u02e7\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea"+
		"\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ea\3\2"+
		"\2\2\u02ed\u02ee\5&\24\2\u02ee\u02ef\5 \21\2\u02ef\u02f0\7:\2\2\u02f0"+
		"\u02f1\5\u0082B\2\u02f1m\3\2\2\2\u02f2\u02f4\5p9\2\u02f3\u02f2\3\2\2\2"+
		"\u02f4\u02f5\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8"+
		"\3\2\2\2\u02f7\u02f9\5L\'\2\u02f8\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fbo\3\2\2\2\u02fc\u02ff\7\6\2\2"+
		"\u02fd\u0300\5\u0082B\2\u02fe\u0300\7c\2\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe"+
		"\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0305\7@\2\2\u0302\u0303\7\13\2\2\u0303"+
		"\u0305\7@\2\2\u0304\u02fc\3\2\2\2\u0304\u0302\3\2\2\2\u0305q\3\2\2\2\u0306"+
		"\u0313\5v<\2\u0307\u0309\5t;\2\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2\2"+
		"\u0309\u030a\3\2\2\2\u030a\u030c\7\67\2\2\u030b\u030d\5\u0082B\2\u030c"+
		"\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0310\7\67"+
		"\2\2\u030f\u0311\5~@\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313"+
		"\3\2\2\2\u0312\u0306\3\2\2\2\u0312\u0308\3\2\2\2\u0313s\3\2\2\2\u0314"+
		"\u0317\5P)\2\u0315\u0317\5~@\2\u0316\u0314\3\2\2\2\u0316\u0315\3\2\2\2"+
		"\u0317u\3\2\2\2\u0318\u031a\5\4\3\2\u0319\u0318\3\2\2\2\u031a\u031d\3"+
		"\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d"+
		"\u031b\3\2\2\2\u031e\u031f\5\u0092J\2\u031f\u0320\5 \21\2\u0320\u0321"+
		"\7@\2\2\u0321\u0322\5\u0082B\2\u0322w\3\2\2\2\u0323\u0324\7\61\2\2\u0324"+
		"\u0325\5\u0082B\2\u0325\u0326\7\62\2\2\u0326y\3\2\2\2\u0327\u0328\7\61"+
		"\2\2\u0328\u0329\7\61\2\2\u0329\u032a\5\u0082B\2\u032a\u032b\7\62\2\2"+
		"\u032b{\3\2\2\2\u032c\u032d\7\61\2\2\u032d\u032e\5\u0082B\2\u032e\u032f"+
		"\7\62\2\2\u032f\u0330\7\62\2\2\u0330}\3\2\2\2\u0331\u0336\5\u0082B\2\u0332"+
		"\u0333\78\2\2\u0333\u0335\5\u0082B\2\u0334\u0332\3\2\2\2\u0335\u0338\3"+
		"\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337\177\3\2\2\2\u0338"+
		"\u0336\3\2\2\2\u0339\u033a\7c\2\2\u033a\u033c\7\61\2\2\u033b\u033d\5~"+
		"@\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\3\2\2\2\u033e"+
		"\u033f\7\62\2\2\u033f\u0081\3\2\2\2\u0340\u0341\bB\1\2\u0341\u035e\5\u008c"+
		"G\2\u0342\u035e\5\u0084C\2\u0343\u035e\5\u0080A\2\u0344\u0345\7\61\2\2"+
		"\u0345\u0346\5\u0092J\2\u0346\u0347\7\62\2\2\u0347\u0348\5\u0082B\30\u0348"+
		"\u035e\3\2\2\2\u0349\u034a\t\7\2\2\u034a\u035e\5\u0082B\27\u034b\u034c"+
		"\t\b\2\2\u034c\u035e\5\u0082B\26\u034d\u034e\7c\2\2\u034e\u035e\t\t\2"+
		"\2\u034f\u035e\5\u0086D\2\u0350\u035e\5\u0088E\2\u0351\u035e\5\u008aF"+
		"\2\u0352\u0353\5\u0092J\2\u0353\u0355\7]\2\2\u0354\u0356\5\u0096L\2\u0355"+
		"\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\7c"+
		"\2\2\u0358\u035e\3\2\2\2\u0359\u035b\7]\2\2\u035a\u035c\5\u0096L\2\u035b"+
		"\u035a\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e\3\2\2\2\u035d\u0340\3\2"+
		"\2\2\u035d\u0342\3\2\2\2\u035d\u0343\3\2\2\2\u035d\u0344\3\2\2\2\u035d"+
		"\u0349\3\2\2\2\u035d\u034b\3\2\2\2\u035d\u034d\3\2\2\2\u035d\u034f\3\2"+
		"\2\2\u035d\u0350\3\2\2\2\u035d\u0351\3\2\2\2\u035d\u0352\3\2\2\2\u035d"+
		"\u0359\3\2\2\2\u035e\u03a1\3\2\2\2\u035f\u0360\f\21\2\2\u0360\u0361\t"+
		"\n\2\2\u0361\u03a0\5\u0082B\22\u0362\u0363\f\20\2\2\u0363\u0364\t\13\2"+
		"\2\u0364\u03a0\5\u0082B\21\u0365\u036d\f\17\2\2\u0366\u0367\7<\2\2\u0367"+
		"\u036e\7<\2\2\u0368\u0369\7;\2\2\u0369\u036a\7;\2\2\u036a\u036e\7;\2\2"+
		"\u036b\u036c\7;\2\2\u036c\u036e\7;\2\2\u036d\u0366\3\2\2\2\u036d\u0368"+
		"\3\2\2\2\u036d\u036b\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u03a0\5\u0082B"+
		"\20\u0370\u0371\f\16\2\2\u0371\u0372\t\f\2\2\u0372\u03a0\5\u0082B\17\u0373"+
		"\u0374\f\r\2\2\u0374\u0375\t\r\2\2\u0375\u03a0\5\u0082B\16\u0376\u0377"+
		"\f\f\2\2\u0377\u0378\7M\2\2\u0378\u03a0\5\u0082B\r\u0379\u037a\f\13\2"+
		"\2\u037a\u037b\7O\2\2\u037b\u03a0\5\u0082B\f\u037c\u037d\f\n\2\2\u037d"+
		"\u037e\7N\2\2\u037e\u03a0\5\u0082B\13\u037f\u0380\f\t\2\2\u0380\u0381"+
		"\7E\2\2\u0381\u03a0\5\u0082B\n\u0382\u0383\f\b\2\2\u0383\u0384\7F\2\2"+
		"\u0384\u03a0\5\u0082B\t\u0385\u0386\f\7\2\2\u0386\u0387\7?\2\2\u0387\u0388"+
		"\5\u0082B\2\u0388\u0389\7@\2\2\u0389\u038a\5\u0082B\7\u038a\u03a0\3\2"+
		"\2\2\u038b\u038c\f\6\2\2\u038c\u038d\t\16\2\2\u038d\u03a0\5\u0082B\6\u038e"+
		"\u038f\f\33\2\2\u038f\u0392\79\2\2\u0390\u0393\7c\2\2\u0391\u0393\5\u0080"+
		"A\2\u0392\u0390\3\2\2\2\u0392\u0391\3\2\2\2\u0393\u03a0\3\2\2\2\u0394"+
		"\u0395\f\32\2\2\u0395\u0396\7\65\2\2\u0396\u0397\5\u0082B\2\u0397\u0398"+
		"\7\66\2\2\u0398\u03a0\3\2\2\2\u0399\u039a\f\5\2\2\u039a\u039c\7]\2\2\u039b"+
		"\u039d\5\u0096L\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e"+
		"\3\2\2\2\u039e\u03a0\7c\2\2\u039f\u035f\3\2\2\2\u039f\u0362\3\2\2\2\u039f"+
		"\u0365\3\2\2\2\u039f\u0370\3\2\2\2\u039f\u0373\3\2\2\2\u039f\u0376\3\2"+
		"\2\2\u039f\u0379\3\2\2\2\u039f\u037c\3\2\2\2\u039f\u037f\3\2\2\2\u039f"+
		"\u0382\3\2\2\2\u039f\u0385\3\2\2\2\u039f\u038b\3\2\2\2\u039f\u038e\3\2"+
		"\2\2\u039f\u0394\3\2\2\2\u039f\u0399\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1"+
		"\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u0083\3\2\2\2\u03a3\u03a1\3\2"+
		"\2\2\u03a4\u03a5\7\61\2\2\u03a5\u03a6\5\u0082B\2\u03a6\u03aa\7\62\2\2"+
		"\u03a7\u03a9\7\62\2\2\u03a8\u03a7\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03a8"+
		"\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03b6\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad"+
		"\u03b1\7\61\2\2\u03ae\u03b0\7\61\2\2\u03af\u03ae\3\2\2\2\u03b0\u03b3\3"+
		"\2\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4\3\2\2\2\u03b3"+
		"\u03b1\3\2\2\2\u03b4\u03b6\5\u0082B\2\u03b5\u03a4\3\2\2\2\u03b5\u03ad"+
		"\3\2\2\2\u03b6\u0085\3\2\2\2\u03b7\u03b8\5\66\34\2\u03b8\u03b9\t\t\2\2"+
		"\u03b9\u03bd\3\2\2\2\u03ba\u03bb\t\t\2\2\u03bb\u03bd\5\u0082B\2\u03bc"+
		"\u03b7\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u0087\3\2\2\2\u03be\u03bf\5\66"+
		"\34\2\u03bf\u03c0\7G\2\2\u03c0\u0089\3\2\2\2\u03c1\u03c2\5\66\34\2\u03c2"+
		"\u03c3\7H\2\2\u03c3\u008b\3\2\2\2\u03c4\u03c5\7\61\2\2\u03c5\u03c6\5\u0082"+
		"B\2\u03c6\u03c7\7\62\2\2\u03c7\u03ce\3\2\2\2\u03c8\u03ce\5\66\34\2\u03c9"+
		"\u03ce\7c\2\2\u03ca\u03cb\5\20\t\2\u03cb\u03cc\79\2\2\u03cc\u03ce\3\2"+
		"\2\2\u03cd\u03c4\3\2\2\2\u03cd\u03c8\3\2\2\2\u03cd\u03c9\3\2\2\2\u03cd"+
		"\u03ca\3\2\2\2\u03ce\u008d\3\2\2\2\u03cf\u03eb\7\65\2\2\u03d0\u03d5\7"+
		"\66\2\2\u03d1\u03d2\7\65\2\2\u03d2\u03d4\7\66\2\2\u03d3\u03d1\3\2\2\2"+
		"\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8"+
		"\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03ec\5$\23\2\u03d9\u03da\5\u0082B"+
		"\2\u03da\u03e1\7\66\2\2\u03db\u03dc\7\65\2\2\u03dc\u03dd\5\u0082B\2\u03dd"+
		"\u03de\7\66\2\2\u03de\u03e0\3\2\2\2\u03df\u03db\3\2\2\2\u03e0\u03e3\3"+
		"\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e8\3\2\2\2\u03e3"+
		"\u03e1\3\2\2\2\u03e4\u03e5\7\65\2\2\u03e5\u03e7\7\66\2\2\u03e6\u03e4\3"+
		"\2\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9"+
		"\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03eb\u03d0\3\2\2\2\u03eb\u03d9\3\2"+
		"\2\2\u03ec\u008f\3\2\2\2\u03ed\u03f2\5\u0092J\2\u03ee\u03ef\78\2\2\u03ef"+
		"\u03f1\5\u0092J\2\u03f0\u03ee\3\2\2\2\u03f1\u03f4\3\2\2\2\u03f2\u03f0"+
		"\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u0091\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f5"+
		"\u03fb\5\u0094K\2\u03f6\u03f7\7\65\2\2\u03f7\u03f8\7\'\2\2\u03f8\u03fa"+
		"\7\66\2\2\u03f9\u03f6\3\2\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2"+
		"\u03fb\u03fc\3\2\2\2\u03fc\u0093\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u03ff"+
		"\t\17\2\2\u03ff\u0095\3\2\2\2\u0400\u0401\7<\2\2\u0401\u0406\5(\25\2\u0402"+
		"\u0403\78\2\2\u0403\u0405\5(\25\2\u0404\u0402\3\2\2\2\u0405\u0408\3\2"+
		"\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409\3\2\2\2\u0408"+
		"\u0406\3\2\2\2\u0409\u040a\7;\2\2\u040a\u0097\3\2\2\2\u040b\u040d\7\61"+
		"\2\2\u040c\u040e\5~@\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f"+
		"\3\2\2\2\u040f\u0410\7\62\2\2\u0410\u0099\3\2\2\2r\u009d\u00a4\u00ac\u00b4"+
		"\u00bf\u00c9\u00ce\u00d4\u00d8\u00e0\u00ea\u00f3\u00fb\u0100\u0108\u010d"+
		"\u0115\u011f\u0125\u012c\u0131\u0139\u013d\u013f\u0145\u014a\u014e\u0154"+
		"\u0156\u015d\u0162\u016b\u0170\u0173\u0178\u0181\u018d\u0196\u01a1\u01a4"+
		"\u01ab\u01b5\u01bd\u01c0\u01c3\u01ce\u01d3\u01d9\u01e3\u01e8\u01f6\u01fb"+
		"\u0213\u0222\u022c\u0235\u0238\u023b\u0243\u0247\u024d\u0253\u0259\u0262"+
		"\u0268\u0273\u0278\u0282\u0291\u0293\u02a3\u02ae\u02b2\u02be\u02c5\u02d2"+
		"\u02db\u02e4\u02ea\u02f5\u02fa\u02ff\u0304\u0308\u030c\u0310\u0312\u0316"+
		"\u031b\u0336\u033c\u0355\u035b\u035d\u036d\u0392\u039c\u039f\u03a1\u03aa"+
		"\u03b1\u03b5\u03bc\u03cd\u03d5\u03e1\u03e8\u03eb\u03f2\u03fb\u0406\u040d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}