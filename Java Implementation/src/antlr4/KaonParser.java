// Generated from C:/Users/rheij/Documents/GitHub/CMPILERMP/Java Implementation/grammar\Kaon.g4 by ANTLR 4.7.2
package antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KaonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		BOOLEAN=10, CHAR=11, CONST=12, DO=13, DOUBLE=14, ELSE=15, FINAL=16, FLOAT=17, 
		FOR=18, IF=19, INT=20, RETURN=21, VOID=22, WHILE=23, PRINT=24, SCAN=25, 
		STRING=26, DECIMAL_LITERAL=27, FLOAT_LITERAL=28, BOOL_LITERAL=29, STRING_LITERAL=30, 
		NULL_LITERAL=31, LPAREN=32, RPAREN=33, LBRACE=34, RBRACE=35, LBRACK=36, 
		RBRACK=37, SEMI=38, COMMA=39, DOT=40, ASSIGN=41, GT=42, LT=43, BANG=44, 
		EQUAL=45, LE=46, GE=47, NOTEQUAL=48, AND=49, OR=50, INC=51, DEC=52, ADD=53, 
		SUB=54, MUL=55, DIV=56, MOD=57, ADD_ASSIGN=58, SUB_ASSIGN=59, MUL_ASSIGN=60, 
		DIV_ASSIGN=61, WS=62, COMMENT=63, LINE_COMMENT=64, IDENTIFIER=65, ERROR=66;
	public static final int
		RULE_compilationUnit = 0, RULE_methodDeclaration = 1, RULE_methodBody = 2, 
		RULE_typeTypeOrVoid = 3, RULE_constDeclaration = 4, RULE_constantDeclarator = 5, 
		RULE_variableDeclarators = 6, RULE_variableDeclarator = 7, RULE_variableDeclaratorId = 8, 
		RULE_variableInitializer = 9, RULE_arrayInitializer = 10, RULE_formalParameters = 11, 
		RULE_formalParameterList = 12, RULE_formalParameter = 13, RULE_lastFormalParameter = 14, 
		RULE_literal = 15, RULE_integerLiteral = 16, RULE_floatLiteral = 17, RULE_block = 18, 
		RULE_blockStatement = 19, RULE_localVariableDeclaration = 20, RULE_elseStatement = 21, 
		RULE_statement = 22, RULE_forControl = 23, RULE_forInit = 24, RULE_parExpression = 25, 
		RULE_expressionList = 26, RULE_methodCall = 27, RULE_expression = 28, 
		RULE_primary = 29, RULE_typeType = 30, RULE_primitiveType = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "methodDeclaration", "methodBody", "typeTypeOrVoid", 
			"constDeclaration", "constantDeclarator", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "formalParameters", 
			"formalParameterList", "formalParameter", "lastFormalParameter", "literal", 
			"integerLiteral", "floatLiteral", "block", "blockStatement", "localVariableDeclaration", 
			"elseStatement", "statement", "forControl", "forInit", "parExpression", 
			"expressionList", "methodCall", "expression", "primary", "typeType", 
			"primitiveType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'...'", "');'", "'&='", "'|='", "'^='", "'>>='", "'>>>='", "'<<='", 
			"'%='", "'bulalo'", "'chicharon'", "'tubig'", "'donut'", "'adobo'", "'eel'", 
			"'garnish'", "'mango'", "'pork'", "'beef'", "'pint'", "'rice'", "'boil'", 
			"'wine'", "'plate'", "'shop'", "'sinulid'", null, null, null, null, "'null'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", 
			"'>'", "'<'", "'!'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", 
			"'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "BOOLEAN", 
			"CHAR", "CONST", "DO", "DOUBLE", "ELSE", "FINAL", "FLOAT", "FOR", "IF", 
			"INT", "RETURN", "VOID", "WHILE", "PRINT", "SCAN", "STRING", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "WS", "COMMENT", "LINE_COMMENT", 
			"IDENTIFIER", "ERROR"
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << STRING))) != 0)) {
				{
				{
				setState(64);
				methodDeclaration();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
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
		enterRule(_localctx, 2, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			typeTypeOrVoid();
			setState(73);
			match(IDENTIFIER);
			setState(74);
			formalParameters();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(75);
				match(LBRACK);
				setState(76);
				match(RBRACK);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
		enterRule(_localctx, 4, RULE_methodBody);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
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
		enterRule(_localctx, 6, RULE_typeTypeOrVoid);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
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
		public TerminalNode FINAL() { return getToken(KaonParser.FINAL, 0); }
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
		enterRule(_localctx, 8, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(FINAL);
			setState(93);
			typeType();
			setState(94);
			constantDeclarator();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				constantDeclarator();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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
		enterRule(_localctx, 10, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IDENTIFIER);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(105);
				match(LBRACK);
				setState(106);
				match(RBRACK);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(ASSIGN);
			setState(113);
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
		enterRule(_localctx, 12, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			variableDeclarator();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(116);
				match(COMMA);
				setState(117);
				variableDeclarator();
				}
				}
				setState(122);
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
		enterRule(_localctx, 14, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			variableDeclaratorId();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(124);
				match(ASSIGN);
				setState(125);
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
		enterRule(_localctx, 16, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IDENTIFIER);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(129);
				match(LBRACK);
				setState(130);
				match(RBRACK);
				}
				}
				setState(135);
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
		enterRule(_localctx, 18, RULE_variableInitializer);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				arrayInitializer();
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
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
		enterRule(_localctx, 20, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(LBRACE);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (DECIMAL_LITERAL - 27)) | (1L << (FLOAT_LITERAL - 27)) | (1L << (BOOL_LITERAL - 27)) | (1L << (STRING_LITERAL - 27)) | (1L << (NULL_LITERAL - 27)) | (1L << (LPAREN - 27)) | (1L << (LBRACE - 27)) | (1L << (IDENTIFIER - 27)))) != 0)) {
				{
				setState(141);
				variableInitializer();
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(142);
						match(COMMA);
						setState(143);
						variableInitializer();
						}
						} 
					}
					setState(148);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(149);
					match(COMMA);
					}
				}

				}
			}

			setState(154);
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
		enterRule(_localctx, 22, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(LPAREN);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(157);
				formalParameterList();
				}
			}

			setState(160);
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
		enterRule(_localctx, 24, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				formalParameter();
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(163);
						match(COMMA);
						setState(164);
						formalParameter();
						}
						} 
					}
					setState(169);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(170);
					match(COMMA);
					setState(171);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
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
		enterRule(_localctx, 26, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			typeType();
			setState(178);
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
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
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
		enterRule(_localctx, 28, RULE_lastFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			typeType();
			setState(181);
			match(T__0);
			setState(182);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_literal);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
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
		enterRule(_localctx, 32, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(DECIMAL_LITERAL);
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
		enterRule(_localctx, 34, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(FLOAT_LITERAL);
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
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(LBRACE);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (BOOLEAN - 10)) | (1L << (CHAR - 10)) | (1L << (DO - 10)) | (1L << (DOUBLE - 10)) | (1L << (FINAL - 10)) | (1L << (FLOAT - 10)) | (1L << (FOR - 10)) | (1L << (IF - 10)) | (1L << (INT - 10)) | (1L << (RETURN - 10)) | (1L << (WHILE - 10)) | (1L << (PRINT - 10)) | (1L << (SCAN - 10)) | (1L << (STRING - 10)) | (1L << (DECIMAL_LITERAL - 10)) | (1L << (FLOAT_LITERAL - 10)) | (1L << (BOOL_LITERAL - 10)) | (1L << (STRING_LITERAL - 10)) | (1L << (NULL_LITERAL - 10)) | (1L << (LPAREN - 10)) | (1L << (LBRACE - 10)) | (1L << (IDENTIFIER - 10)))) != 0)) {
				{
				{
				setState(196);
				blockStatement();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(KaonParser.SEMI, 0); }
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
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
		enterRule(_localctx, 38, RULE_blockStatement);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				localVariableDeclaration();
				setState(205);
				match(SEMI);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				constDeclaration();
				}
				break;
			case DO:
			case FOR:
			case IF:
			case RETURN:
			case WHILE:
			case PRINT:
			case SCAN:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LBRACE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				statement();
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
		enterRule(_localctx, 40, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			typeType();
			setState(212);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	 
		public ElseStatementContext() { }
		public void copyFrom(ElseStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseStmtContext extends ElseStatementContext {
		public TerminalNode ELSE() { return getToken(KaonParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStmtContext(ElseStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseStatement);
		try {
			_localctx = new ElseStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(ELSE);
			setState(215);
			statement();
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
		public Token bop;
		public ExpressionContext statementExpression;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(KaonParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public TerminalNode EQUAL() { return getToken(KaonParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(KaonParser.NOTEQUAL, 0); }
		public TerminalNode FOR() { return getToken(KaonParser.FOR, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(KaonParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(KaonParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(KaonParser.SEMI, 0); }
		public TerminalNode RETURN() { return getToken(KaonParser.RETURN, 0); }
		public TerminalNode PRINT() { return getToken(KaonParser.PRINT, 0); }
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(KaonParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(KaonParser.ADD, i);
		}
		public TerminalNode SCAN() { return getToken(KaonParser.SCAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 44, RULE_statement);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(IF);
				setState(219);
				parExpression();
				setState(220);
				statement();
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(221);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(IF);
				setState(225);
				match(LPAREN);
				setState(226);
				expression(0);
				setState(227);
				((StatementContext)_localctx).bop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
					((StatementContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(228);
				expression(0);
				setState(229);
				match(RPAREN);
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(230);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(FOR);
				setState(234);
				match(LPAREN);
				setState(235);
				forControl();
				setState(236);
				match(RPAREN);
				setState(237);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				match(WHILE);
				setState(240);
				parExpression();
				setState(241);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				match(DO);
				setState(244);
				statement();
				setState(245);
				match(WHILE);
				setState(246);
				parExpression();
				setState(247);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(249);
				match(RETURN);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (DECIMAL_LITERAL - 27)) | (1L << (FLOAT_LITERAL - 27)) | (1L << (BOOL_LITERAL - 27)) | (1L << (STRING_LITERAL - 27)) | (1L << (NULL_LITERAL - 27)) | (1L << (LPAREN - 27)) | (1L << (IDENTIFIER - 27)))) != 0)) {
					{
					setState(250);
					expression(0);
					}
				}

				setState(253);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(255);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(257);
				match(PRINT);
				setState(258);
				match(LPAREN);
				setState(259);
				primary();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD) {
					{
					{
					setState(260);
					match(ADD);
					setState(261);
					primary();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(267);
				match(T__1);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(269);
				match(SCAN);
				setState(270);
				match(LPAREN);
				setState(271);
				match(IDENTIFIER);
				setState(272);
				match(T__1);
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

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KaonParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KaonParser.SEMI, i);
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
		enterRule(_localctx, 46, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			forInit();
			setState(276);
			match(SEMI);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (DECIMAL_LITERAL - 27)) | (1L << (FLOAT_LITERAL - 27)) | (1L << (BOOL_LITERAL - 27)) | (1L << (STRING_LITERAL - 27)) | (1L << (NULL_LITERAL - 27)) | (1L << (LPAREN - 27)) | (1L << (IDENTIFIER - 27)))) != 0)) {
				{
				setState(277);
				expression(0);
				}
			}

			setState(280);
			match(SEMI);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (DECIMAL_LITERAL - 27)) | (1L << (FLOAT_LITERAL - 27)) | (1L << (BOOL_LITERAL - 27)) | (1L << (STRING_LITERAL - 27)) | (1L << (NULL_LITERAL - 27)) | (1L << (LPAREN - 27)) | (1L << (IDENTIFIER - 27)))) != 0)) {
				{
				setState(281);
				((ForControlContext)_localctx).forUpdate = expressionList();
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

	public static class ForInitContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KaonParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
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
		enterRule(_localctx, 48, RULE_forInit);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				typeType();
				setState(285);
				variableDeclaratorId();
				setState(286);
				match(ASSIGN);
				setState(287);
				variableInitializer();
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				expressionList();
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
		enterRule(_localctx, 50, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(LPAREN);
			setState(293);
			expression(0);
			setState(294);
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
		enterRule(_localctx, 52, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			expression(0);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(297);
				match(COMMA);
				setState(298);
				expression(0);
				}
				}
				setState(303);
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
		enterRule(_localctx, 54, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(IDENTIFIER);
			setState(305);
			match(LPAREN);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (DECIMAL_LITERAL - 27)) | (1L << (FLOAT_LITERAL - 27)) | (1L << (BOOL_LITERAL - 27)) | (1L << (STRING_LITERAL - 27)) | (1L << (NULL_LITERAL - 27)) | (1L << (LPAREN - 27)) | (1L << (IDENTIFIER - 27)))) != 0)) {
				{
				setState(306);
				expressionList();
				}
			}

			setState(309);
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
		public Token bop;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(KaonParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(KaonParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(KaonParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(KaonParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KaonParser.SUB, 0); }
		public TerminalNode LE() { return getToken(KaonParser.LE, 0); }
		public TerminalNode GE() { return getToken(KaonParser.GE, 0); }
		public TerminalNode GT() { return getToken(KaonParser.GT, 0); }
		public TerminalNode LT() { return getToken(KaonParser.LT, 0); }
		public TerminalNode EQUAL() { return getToken(KaonParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(KaonParser.NOTEQUAL, 0); }
		public TerminalNode AND() { return getToken(KaonParser.AND, 0); }
		public TerminalNode OR() { return getToken(KaonParser.OR, 0); }
		public TerminalNode ASSIGN() { return getToken(KaonParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(KaonParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(KaonParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(KaonParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(KaonParser.DIV_ASSIGN, 0); }
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(312);
				primary();
				}
				break;
			case 2:
				{
				setState(313);
				methodCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(317);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(318);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(320);
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
						setState(321);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(323);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(324);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(326);
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
						setState(327);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(328);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(329);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(330);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(331);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(332);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(333);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(334);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(335);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << ASSIGN) | (1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(336);
						expression(1);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(337);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(338);
						match(LBRACK);
						setState(339);
						expression(0);
						setState(340);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 58, RULE_primary);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(LPAREN);
				setState(348);
				expression(0);
				setState(349);
				match(RPAREN);
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				match(IDENTIFIER);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(KaonParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(KaonParser.LBRACK, i);
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
		enterRule(_localctx, 60, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			primitiveType();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(356);
				match(LBRACK);
				setState(357);
				match(RBRACK);
				}
				}
				setState(362);
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
		public TerminalNode INT() { return getToken(KaonParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(KaonParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(KaonParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(KaonParser.STRING, 0); }
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
		enterRule(_localctx, 62, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << STRING))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u0170\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3P\n\3\f"+
		"\3\16\3S\13\3\3\3\3\3\3\4\3\4\5\4Y\n\4\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\7\6d\n\6\f\6\16\6g\13\6\3\6\3\6\3\7\3\7\3\7\7\7n\n\7\f\7\16\7q"+
		"\13\7\3\7\3\7\3\7\3\b\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\t\3\t\3\t\5\t"+
		"\u0081\n\t\3\n\3\n\3\n\7\n\u0086\n\n\f\n\16\n\u0089\13\n\3\13\3\13\5\13"+
		"\u008d\n\13\3\f\3\f\3\f\3\f\7\f\u0093\n\f\f\f\16\f\u0096\13\f\3\f\5\f"+
		"\u0099\n\f\5\f\u009b\n\f\3\f\3\f\3\r\3\r\5\r\u00a1\n\r\3\r\3\r\3\16\3"+
		"\16\3\16\7\16\u00a8\n\16\f\16\16\16\u00ab\13\16\3\16\3\16\5\16\u00af\n"+
		"\16\3\16\5\16\u00b2\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00c0\n\21\3\22\3\22\3\23\3\23\3\24\3\24\7\24\u00c8"+
		"\n\24\f\24\16\24\u00cb\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00d4"+
		"\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u00e1"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00ea\n\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00fe\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30"+
		"\u0109\n\30\f\30\16\30\u010c\13\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0114\n\30\3\31\3\31\3\31\5\31\u0119\n\31\3\31\3\31\5\31\u011d\n\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u0125\n\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\7\34\u012e\n\34\f\34\16\34\u0131\13\34\3\35\3\35\3\35\5\35"+
		"\u0136\n\35\3\35\3\35\3\36\3\36\3\36\5\36\u013d\n\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0159\n\36\f\36\16\36"+
		"\u015c\13\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0164\n\37\3 \3 \3 \7"+
		" \u0169\n \f \16 \u016c\13 \3!\3!\3!\2\3:\"\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\b\4\2//\62\62\3\29;\3\2\678\4"+
		"\2,-\60\61\5\2\5\13++<?\7\2\f\r\20\20\23\23\26\26\34\34\2\u0185\2E\3\2"+
		"\2\2\4J\3\2\2\2\6X\3\2\2\2\b\\\3\2\2\2\n^\3\2\2\2\fj\3\2\2\2\16u\3\2\2"+
		"\2\20}\3\2\2\2\22\u0082\3\2\2\2\24\u008c\3\2\2\2\26\u008e\3\2\2\2\30\u009e"+
		"\3\2\2\2\32\u00b1\3\2\2\2\34\u00b3\3\2\2\2\36\u00b6\3\2\2\2 \u00bf\3\2"+
		"\2\2\"\u00c1\3\2\2\2$\u00c3\3\2\2\2&\u00c5\3\2\2\2(\u00d3\3\2\2\2*\u00d5"+
		"\3\2\2\2,\u00d8\3\2\2\2.\u0113\3\2\2\2\60\u0115\3\2\2\2\62\u0124\3\2\2"+
		"\2\64\u0126\3\2\2\2\66\u012a\3\2\2\28\u0132\3\2\2\2:\u013c\3\2\2\2<\u0163"+
		"\3\2\2\2>\u0165\3\2\2\2@\u016d\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2E"+
		"C\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\2\2\3I\3\3\2\2\2JK\5\b\5\2"+
		"KL\7C\2\2LQ\5\30\r\2MN\7&\2\2NP\7\'\2\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2"+
		"QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\5\6\4\2U\5\3\2\2\2VY\5&\24\2WY\7(\2\2"+
		"XV\3\2\2\2XW\3\2\2\2Y\7\3\2\2\2Z]\5> \2[]\7\30\2\2\\Z\3\2\2\2\\[\3\2\2"+
		"\2]\t\3\2\2\2^_\7\22\2\2_`\5> \2`e\5\f\7\2ab\7)\2\2bd\5\f\7\2ca\3\2\2"+
		"\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7(\2\2i\13\3\2"+
		"\2\2jo\7C\2\2kl\7&\2\2ln\7\'\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2"+
		"\2pr\3\2\2\2qo\3\2\2\2rs\7+\2\2st\5\24\13\2t\r\3\2\2\2uz\5\20\t\2vw\7"+
		")\2\2wy\5\20\t\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\17\3\2\2\2|"+
		"z\3\2\2\2}\u0080\5\22\n\2~\177\7+\2\2\177\u0081\5\24\13\2\u0080~\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\21\3\2\2\2\u0082\u0087\7C\2\2\u0083\u0084"+
		"\7&\2\2\u0084\u0086\7\'\2\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\23\3\2\2\2\u0089\u0087\3\2\2"+
		"\2\u008a\u008d\5\26\f\2\u008b\u008d\5:\36\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\25\3\2\2\2\u008e\u009a\7$\2\2\u008f\u0094\5\24\13"+
		"\2\u0090\u0091\7)\2\2\u0091\u0093\5\24\13\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u0099\7)\2\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u008f\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7%\2\2\u009d\27\3\2\2\2\u009e\u00a0"+
		"\7\"\2\2\u009f\u00a1\5\32\16\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7#\2\2\u00a3\31\3\2\2\2\u00a4\u00a9\5"+
		"\34\17\2\u00a5\u00a6\7)\2\2\u00a6\u00a8\5\34\17\2\u00a7\u00a5\3\2\2\2"+
		"\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ae"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7)\2\2\u00ad\u00af\5\36\20\2"+
		"\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b2"+
		"\5\36\20\2\u00b1\u00a4\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\33\3\2\2\2\u00b3"+
		"\u00b4\5> \2\u00b4\u00b5\5\22\n\2\u00b5\35\3\2\2\2\u00b6\u00b7\5> \2\u00b7"+
		"\u00b8\7\3\2\2\u00b8\u00b9\5\22\n\2\u00b9\37\3\2\2\2\u00ba\u00c0\5\"\22"+
		"\2\u00bb\u00c0\5$\23\2\u00bc\u00c0\7 \2\2\u00bd\u00c0\7\37\2\2\u00be\u00c0"+
		"\7!\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0!\3\2\2\2\u00c1\u00c2\7\35\2\2"+
		"\u00c2#\3\2\2\2\u00c3\u00c4\7\36\2\2\u00c4%\3\2\2\2\u00c5\u00c9\7$\2\2"+
		"\u00c6\u00c8\5(\25\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7%\2\2\u00cd\'\3\2\2\2\u00ce\u00cf\5*\26\2\u00cf\u00d0\7(\2\2\u00d0"+
		"\u00d4\3\2\2\2\u00d1\u00d4\5\n\6\2\u00d2\u00d4\5.\30\2\u00d3\u00ce\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4)\3\2\2\2\u00d5\u00d6"+
		"\5> \2\u00d6\u00d7\5\16\b\2\u00d7+\3\2\2\2\u00d8\u00d9\7\21\2\2\u00d9"+
		"\u00da\5.\30\2\u00da-\3\2\2\2\u00db\u0114\5&\24\2\u00dc\u00dd\7\25\2\2"+
		"\u00dd\u00de\5\64\33\2\u00de\u00e0\5.\30\2\u00df\u00e1\5,\27\2\u00e0\u00df"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u0114\3\2\2\2\u00e2\u00e3\7\25\2\2"+
		"\u00e3\u00e4\7\"\2\2\u00e4\u00e5\5:\36\2\u00e5\u00e6\t\2\2\2\u00e6\u00e7"+
		"\5:\36\2\u00e7\u00e9\7#\2\2\u00e8\u00ea\5,\27\2\u00e9\u00e8\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u0114\3\2\2\2\u00eb\u00ec\7\24\2\2\u00ec\u00ed\7"+
		"\"\2\2\u00ed\u00ee\5\60\31\2\u00ee\u00ef\7#\2\2\u00ef\u00f0\5.\30\2\u00f0"+
		"\u0114\3\2\2\2\u00f1\u00f2\7\31\2\2\u00f2\u00f3\5\64\33\2\u00f3\u00f4"+
		"\5.\30\2\u00f4\u0114\3\2\2\2\u00f5\u00f6\7\17\2\2\u00f6\u00f7\5.\30\2"+
		"\u00f7\u00f8\7\31\2\2\u00f8\u00f9\5\64\33\2\u00f9\u00fa\7(\2\2\u00fa\u0114"+
		"\3\2\2\2\u00fb\u00fd\7\27\2\2\u00fc\u00fe\5:\36\2\u00fd\u00fc\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0114\7(\2\2\u0100\u0101"+
		"\5:\36\2\u0101\u0102\7(\2\2\u0102\u0114\3\2\2\2\u0103\u0104\7\32\2\2\u0104"+
		"\u0105\7\"\2\2\u0105\u010a\5<\37\2\u0106\u0107\7\67\2\2\u0107\u0109\5"+
		"<\37\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\4"+
		"\2\2\u010e\u0114\3\2\2\2\u010f\u0110\7\33\2\2\u0110\u0111\7\"\2\2\u0111"+
		"\u0112\7C\2\2\u0112\u0114\7\4\2\2\u0113\u00db\3\2\2\2\u0113\u00dc\3\2"+
		"\2\2\u0113\u00e2\3\2\2\2\u0113\u00eb\3\2\2\2\u0113\u00f1\3\2\2\2\u0113"+
		"\u00f5\3\2\2\2\u0113\u00fb\3\2\2\2\u0113\u0100\3\2\2\2\u0113\u0103\3\2"+
		"\2\2\u0113\u010f\3\2\2\2\u0114/\3\2\2\2\u0115\u0116\5\62\32\2\u0116\u0118"+
		"\7(\2\2\u0117\u0119\5:\36\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011c\7(\2\2\u011b\u011d\5\66\34\2\u011c\u011b\3"+
		"\2\2\2\u011c\u011d\3\2\2\2\u011d\61\3\2\2\2\u011e\u011f\5> \2\u011f\u0120"+
		"\5\22\n\2\u0120\u0121\7+\2\2\u0121\u0122\5\24\13\2\u0122\u0125\3\2\2\2"+
		"\u0123\u0125\5\66\34\2\u0124\u011e\3\2\2\2\u0124\u0123\3\2\2\2\u0125\63"+
		"\3\2\2\2\u0126\u0127\7\"\2\2\u0127\u0128\5:\36\2\u0128\u0129\7#\2\2\u0129"+
		"\65\3\2\2\2\u012a\u012f\5:\36\2\u012b\u012c\7)\2\2\u012c\u012e\5:\36\2"+
		"\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\67\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7C\2\2\u0133"+
		"\u0135\7\"\2\2\u0134\u0136\5\66\34\2\u0135\u0134\3\2\2\2\u0135\u0136\3"+
		"\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7#\2\2\u01389\3\2\2\2\u0139\u013a"+
		"\b\36\1\2\u013a\u013d\5<\37\2\u013b\u013d\58\35\2\u013c\u0139\3\2\2\2"+
		"\u013c\u013b\3\2\2\2\u013d\u015a\3\2\2\2\u013e\u013f\f\t\2\2\u013f\u0140"+
		"\t\3\2\2\u0140\u0159\5:\36\n\u0141\u0142\f\b\2\2\u0142\u0143\t\4\2\2\u0143"+
		"\u0159\5:\36\t\u0144\u0145\f\7\2\2\u0145\u0146\t\5\2\2\u0146\u0159\5:"+
		"\36\b\u0147\u0148\f\6\2\2\u0148\u0149\t\2\2\2\u0149\u0159\5:\36\7\u014a"+
		"\u014b\f\5\2\2\u014b\u014c\7\63\2\2\u014c\u0159\5:\36\6\u014d\u014e\f"+
		"\4\2\2\u014e\u014f\7\64\2\2\u014f\u0159\5:\36\5\u0150\u0151\f\3\2\2\u0151"+
		"\u0152\t\6\2\2\u0152\u0159\5:\36\3\u0153\u0154\f\13\2\2\u0154\u0155\7"+
		"&\2\2\u0155\u0156\5:\36\2\u0156\u0157\7\'\2\2\u0157\u0159\3\2\2\2\u0158"+
		"\u013e\3\2\2\2\u0158\u0141\3\2\2\2\u0158\u0144\3\2\2\2\u0158\u0147\3\2"+
		"\2\2\u0158\u014a\3\2\2\2\u0158\u014d\3\2\2\2\u0158\u0150\3\2\2\2\u0158"+
		"\u0153\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b;\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7\"\2\2\u015e\u015f"+
		"\5:\36\2\u015f\u0160\7#\2\2\u0160\u0164\3\2\2\2\u0161\u0164\5 \21\2\u0162"+
		"\u0164\7C\2\2\u0163\u015d\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2"+
		"\2\2\u0164=\3\2\2\2\u0165\u016a\5@!\2\u0166\u0167\7&\2\2\u0167\u0169\7"+
		"\'\2\2\u0168\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b?\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\t\7\2\2"+
		"\u016eA\3\2\2\2%EQX\\eoz\u0080\u0087\u008c\u0094\u0098\u009a\u00a0\u00a9"+
		"\u00ae\u00b1\u00bf\u00c9\u00d3\u00e0\u00e9\u00fd\u010a\u0113\u0118\u011c"+
		"\u0124\u012f\u0135\u013c\u0158\u015a\u0163\u016a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}