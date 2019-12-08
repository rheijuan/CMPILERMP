package antlr4;// Generated from C:/Users/rheij/Documents/GitHub/CMPILERMP/Java Implementation/grammar\Kaon.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, MAIN=7, PRINTLN=8, PRINT=9, 
		INPUT=10, FUNC=11, CONST=12, IF=13, ELSE=14, RETURN=15, FOR=16, WHILE=17, 
		TO=18, DO=19, END=20, IN=21, NULL=22, VAR=23, AND=24, OR=25, EQUALS=26, 
		NEQUALS=27, GTEQUALS=28, LTEQUALS=29, POW=30, BANG=31, GT=32, LT=33, MUL=34, 
		DIV=35, ADD=36, SUB=37, MOD=38, RPAREN=39, LPAREN=40, LBRACE=41, RBRACE=42, 
		LBRACKET=43, RBRACKET=44, SCOLON=45, ASSIGN=46, COMMA=47, QMARK=48, BOOL=49, 
		NUMBER=50, IDENTIFIER=51, STRING=52, COMMENT=53, SPACE=54;
	public static final int
		RULE_source = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_constantAssignment = 4, RULE_ifStatement = 5, RULE_ifStat = 6, RULE_elseIfStat = 7, 
		RULE_elseStat = 8, RULE_functionDecl = 9, RULE_missingLBraceFuncDecl = 10, 
		RULE_missingRBraceFuncDecl = 11, RULE_forStatement = 12, RULE_missingLBraceForLoop = 13, 
		RULE_missingRBraceForLoop = 14, RULE_whileStatement = 15, RULE_missingLBraceWhileLoop = 16, 
		RULE_missingRBraceWhileLoop = 17, RULE_doWhileStatement = 18, RULE_missingLBraceDoWhileLoop = 19, 
		RULE_missingRBraceDoWhileLoop = 20, RULE_functionCall = 21, RULE_idList = 22, 
		RULE_exprList = 23, RULE_expression = 24, RULE_indexes = 25, RULE_list = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"source", "block", "statement", "assignment", "constantAssignment", "ifStatement", 
			"ifStat", "elseIfStat", "elseStat", "functionDecl", "missingLBraceFuncDecl", 
			"missingRBraceFuncDecl", "forStatement", "missingLBraceForLoop", "missingRBraceForLoop", 
			"whileStatement", "missingLBraceWhileLoop", "missingRBraceWhileLoop", 
			"doWhileStatement", "missingLBraceDoWhileLoop", "missingRBraceDoWhileLoop", 
			"functionCall", "idList", "exprList", "expression", "indexes", "list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'++'", "'--'", "'**'", "'//'", "'%%'", "':'", "'dish'", "'plate'", 
			"'print'", "'pudding'", "'sidedish'", "'water'", "'beef'", "'eel'", "'rice'", 
			"'pork'", "'wine'", "'to'", "'doughnut'", "'finish'", "'in'", "'starve'", 
			"'ingredient'", "'&&'", "'||'", "'=='", "'!='", "'>='", "'<='", "'^'", 
			"'!'", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "')'", "'('", 
			"'{'", "'}'", "'['", "']'", "';'", "'='", "','", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "MAIN", "PRINTLN", "PRINT", 
			"INPUT", "FUNC", "CONST", "IF", "ELSE", "RETURN", "FOR", "WHILE", "TO", 
			"DO", "END", "IN", "NULL", "VAR", "AND", "OR", "EQUALS", "NEQUALS", "GTEQUALS", 
			"LTEQUALS", "POW", "BANG", "GT", "LT", "MUL", "DIV", "ADD", "SUB", "MOD", 
			"RPAREN", "LPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SCOLON", 
			"ASSIGN", "COMMA", "QMARK", "BOOL", "NUMBER", "IDENTIFIER", "STRING", 
			"COMMENT", "SPACE"
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

	public static class SourceContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KaonParser.EOF, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			block();
			setState(55);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(KaonParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(KaonParser.SCOLON, 0); }
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
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(59);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PRINTLN:
					case PRINT:
					case CONST:
					case IF:
					case FOR:
					case WHILE:
					case DO:
					case VAR:
					case IDENTIFIER:
						{
						setState(57);
						statement();
						}
						break;
					case FUNC:
						{
						setState(58);
						functionDecl();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(64);
				match(RETURN);
				setState(65);
				expression(0);
				setState(66);
				match(SCOLON);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(KaonParser.SCOLON, 0); }
		public ConstantAssignmentContext constantAssignment() {
			return getRuleContext(ConstantAssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				assignment();
				setState(71);
				match(SCOLON);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				constantAssignment();
				setState(74);
				match(SCOLON);
				}
				break;
			case PRINTLN:
			case PRINT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				functionCall();
				setState(77);
				match(SCOLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				whileStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				doWhileStatement();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(KaonParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(KaonParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(VAR);
			setState(86);
			match(IDENTIFIER);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(87);
				indexes();
				}
			}

			setState(90);
			match(ASSIGN);
			setState(91);
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

	public static class ConstantAssignmentContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(KaonParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(KaonParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ConstantAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterConstantAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitConstantAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitConstantAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantAssignmentContext constantAssignment() throws RecognitionException {
		ConstantAssignmentContext _localctx = new ConstantAssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constantAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(CONST);
			setState(94);
			match(IDENTIFIER);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(95);
				indexes();
				}
			}

			setState(98);
			match(ASSIGN);
			setState(99);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public List<ElseIfStatContext> elseIfStat() {
			return getRuleContexts(ElseIfStatContext.class);
		}
		public ElseIfStatContext elseIfStat(int i) {
			return getRuleContext(ElseIfStatContext.class,i);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			ifStat();
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					elseIfStat();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(108);
				elseStat();
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

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KaonParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(IF);
			setState(112);
			expression(0);
			setState(113);
			match(LBRACE);
			setState(114);
			block();
			setState(115);
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

	public static class ElseIfStatContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(KaonParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(KaonParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitElseIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitElseIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ELSE);
			setState(118);
			match(IF);
			setState(119);
			expression(0);
			setState(120);
			match(LBRACE);
			setState(121);
			block();
			setState(122);
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

	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(KaonParser.ELSE, 0); }
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ELSE);
			setState(125);
			match(LBRACE);
			setState(126);
			block();
			setState(127);
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(KaonParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public MissingLBraceFuncDeclContext missingLBraceFuncDecl() {
			return getRuleContext(MissingLBraceFuncDeclContext.class,0);
		}
		public MissingRBraceFuncDeclContext missingRBraceFuncDecl() {
			return getRuleContext(MissingRBraceFuncDeclContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDecl);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(FUNC);
				setState(130);
				match(IDENTIFIER);
				setState(131);
				match(LPAREN);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(132);
					idList();
					}
				}

				setState(135);
				match(RPAREN);
				setState(136);
				match(LBRACE);
				setState(137);
				block();
				setState(138);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				missingLBraceFuncDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				missingRBraceFuncDecl();
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

	public static class MissingLBraceFuncDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(KaonParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public MissingLBraceFuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingLBraceFuncDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMissingLBraceFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMissingLBraceFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMissingLBraceFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingLBraceFuncDeclContext missingLBraceFuncDecl() throws RecognitionException {
		MissingLBraceFuncDeclContext _localctx = new MissingLBraceFuncDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_missingLBraceFuncDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(FUNC);
			setState(145);
			match(IDENTIFIER);
			setState(146);
			match(LPAREN);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(147);
				idList();
				}
			}

			setState(150);
			match(RPAREN);
			setState(151);
			block();
			setState(152);
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

	public static class MissingRBraceFuncDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(KaonParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public MissingRBraceFuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingRBraceFuncDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMissingRBraceFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMissingRBraceFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMissingRBraceFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingRBraceFuncDeclContext missingRBraceFuncDecl() throws RecognitionException {
		MissingRBraceFuncDeclContext _localctx = new MissingRBraceFuncDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_missingRBraceFuncDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(FUNC);
			setState(155);
			match(IDENTIFIER);
			setState(156);
			match(LPAREN);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(157);
				idList();
				}
			}

			setState(160);
			match(RPAREN);
			setState(161);
			match(LBRACE);
			setState(162);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KaonParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(KaonParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(KaonParser.TO, 0); }
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public MissingLBraceForLoopContext missingLBraceForLoop() {
			return getRuleContext(MissingLBraceForLoopContext.class,0);
		}
		public MissingRBraceForLoopContext missingRBraceForLoop() {
			return getRuleContext(MissingRBraceForLoopContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStatement);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(FOR);
				setState(165);
				match(IDENTIFIER);
				setState(166);
				match(ASSIGN);
				setState(167);
				expression(0);
				setState(168);
				match(TO);
				setState(169);
				expression(0);
				setState(170);
				match(LBRACE);
				setState(171);
				block();
				setState(172);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				missingLBraceForLoop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				missingRBraceForLoop();
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

	public static class MissingLBraceForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KaonParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(KaonParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(KaonParser.TO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public MissingLBraceForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingLBraceForLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMissingLBraceForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMissingLBraceForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMissingLBraceForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingLBraceForLoopContext missingLBraceForLoop() throws RecognitionException {
		MissingLBraceForLoopContext _localctx = new MissingLBraceForLoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_missingLBraceForLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(FOR);
			setState(179);
			match(IDENTIFIER);
			setState(180);
			match(ASSIGN);
			setState(181);
			expression(0);
			setState(182);
			match(TO);
			setState(183);
			expression(0);
			setState(184);
			block();
			setState(185);
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

	public static class MissingRBraceForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KaonParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(KaonParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(KaonParser.TO, 0); }
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MissingRBraceForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingRBraceForLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMissingRBraceForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMissingRBraceForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMissingRBraceForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingRBraceForLoopContext missingRBraceForLoop() throws RecognitionException {
		MissingRBraceForLoopContext _localctx = new MissingRBraceForLoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_missingRBraceForLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(FOR);
			setState(188);
			match(IDENTIFIER);
			setState(189);
			match(ASSIGN);
			setState(190);
			expression(0);
			setState(191);
			match(TO);
			setState(192);
			expression(0);
			setState(193);
			match(LBRACE);
			setState(194);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KaonParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public MissingLBraceWhileLoopContext missingLBraceWhileLoop() {
			return getRuleContext(MissingLBraceWhileLoopContext.class,0);
		}
		public MissingRBraceWhileLoopContext missingRBraceWhileLoop() {
			return getRuleContext(MissingRBraceWhileLoopContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStatement);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(WHILE);
				setState(197);
				expression(0);
				setState(198);
				match(LBRACE);
				setState(199);
				block();
				setState(200);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				missingLBraceWhileLoop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				missingRBraceWhileLoop();
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

	public static class MissingLBraceWhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KaonParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public MissingLBraceWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingLBraceWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMissingLBraceWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMissingLBraceWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMissingLBraceWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingLBraceWhileLoopContext missingLBraceWhileLoop() throws RecognitionException {
		MissingLBraceWhileLoopContext _localctx = new MissingLBraceWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_missingLBraceWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(WHILE);
			setState(207);
			expression(0);
			setState(208);
			block();
			setState(209);
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

	public static class MissingRBraceWhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KaonParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MissingRBraceWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingRBraceWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMissingRBraceWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMissingRBraceWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMissingRBraceWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingRBraceWhileLoopContext missingRBraceWhileLoop() throws RecognitionException {
		MissingRBraceWhileLoopContext _localctx = new MissingRBraceWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_missingRBraceWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(WHILE);
			setState(212);
			expression(0);
			setState(213);
			match(LBRACE);
			setState(214);
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(KaonParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(KaonParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(KaonParser.SCOLON, 0); }
		public MissingLBraceDoWhileLoopContext missingLBraceDoWhileLoop() {
			return getRuleContext(MissingLBraceDoWhileLoopContext.class,0);
		}
		public MissingRBraceDoWhileLoopContext missingRBraceDoWhileLoop() {
			return getRuleContext(MissingRBraceDoWhileLoopContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_doWhileStatement);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(DO);
				setState(217);
				match(LBRACE);
				setState(218);
				block();
				setState(219);
				match(RBRACE);
				setState(220);
				match(WHILE);
				setState(221);
				expression(0);
				setState(222);
				match(SCOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				missingLBraceDoWhileLoop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				missingRBraceDoWhileLoop();
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

	public static class MissingLBraceDoWhileLoopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(KaonParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KaonParser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(KaonParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(KaonParser.SCOLON, 0); }
		public MissingLBraceDoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingLBraceDoWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMissingLBraceDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMissingLBraceDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMissingLBraceDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingLBraceDoWhileLoopContext missingLBraceDoWhileLoop() throws RecognitionException {
		MissingLBraceDoWhileLoopContext _localctx = new MissingLBraceDoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_missingLBraceDoWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(DO);
			setState(229);
			block();
			setState(230);
			match(RBRACE);
			setState(231);
			match(WHILE);
			setState(232);
			expression(0);
			setState(233);
			match(SCOLON);
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

	public static class MissingRBraceDoWhileLoopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(KaonParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(KaonParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(KaonParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(KaonParser.SCOLON, 0); }
		public MissingRBraceDoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingRBraceDoWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMissingRBraceDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMissingRBraceDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMissingRBraceDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingRBraceDoWhileLoopContext missingRBraceDoWhileLoop() throws RecognitionException {
		MissingRBraceDoWhileLoopContext _localctx = new MissingRBraceDoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_missingRBraceDoWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(DO);
			setState(236);
			match(LBRACE);
			setState(237);
			block();
			setState(238);
			match(WHILE);
			setState(239);
			expression(0);
			setState(240);
			match(SCOLON);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MissingRParenFunctionCallContext extends FunctionCallContext {
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public MissingRParenFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMissingRParenFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMissingRParenFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMissingRParenFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintlnFunctionCallContext extends FunctionCallContext {
		public TerminalNode PRINTLN() { return getToken(KaonParser.PRINTLN, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterPrintlnFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitPrintlnFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitPrintlnFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MissingLParenFunctionCallContext extends FunctionCallContext {
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public MissingLParenFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMissingLParenFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMissingLParenFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMissingLParenFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MissingRParenStatementContext extends FunctionCallContext {
		public TerminalNode PRINT() { return getToken(KaonParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public MissingRParenStatementContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMissingRParenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMissingRParenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMissingRParenStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierFunctionCallContext extends FunctionCallContext {
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public IdentifierFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterIdentifierFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitIdentifierFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitIdentifierFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFunctionCallContext extends FunctionCallContext {
		public TerminalNode PRINT() { return getToken(KaonParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public PrintFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterPrintFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitPrintFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitPrintFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MissingLParenPrintStatementContext extends FunctionCallContext {
		public TerminalNode PRINT() { return getToken(KaonParser.PRINT, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public MissingLParenPrintStatementContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMissingLParenPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMissingLParenPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMissingLParenPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionCall);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new IdentifierFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(IDENTIFIER);
				setState(243);
				match(LPAREN);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << PRINT) | (1L << INPUT) | (1L << NULL) | (1L << BANG) | (1L << SUB) | (1L << LPAREN) | (1L << LBRACKET) | (1L << BOOL) | (1L << NUMBER) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
					{
					setState(244);
					exprList();
					}
				}

				setState(247);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new PrintlnFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(PRINTLN);
				setState(249);
				match(LPAREN);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << PRINT) | (1L << INPUT) | (1L << NULL) | (1L << BANG) | (1L << SUB) | (1L << LPAREN) | (1L << LBRACKET) | (1L << BOOL) | (1L << NUMBER) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
					{
					setState(250);
					expression(0);
					}
				}

				setState(253);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new PrintFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(PRINT);
				setState(255);
				match(LPAREN);
				setState(256);
				expression(0);
				setState(257);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new MissingLParenFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				match(IDENTIFIER);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << PRINT) | (1L << INPUT) | (1L << NULL) | (1L << BANG) | (1L << SUB) | (1L << LPAREN) | (1L << LBRACKET) | (1L << BOOL) | (1L << NUMBER) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
					{
					setState(260);
					exprList();
					}
				}

				setState(263);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new MissingRParenFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				match(IDENTIFIER);
				setState(265);
				match(LPAREN);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(266);
					exprList();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new MissingLParenPrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				match(PRINT);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << PRINT) | (1L << INPUT) | (1L << NULL) | (1L << BANG) | (1L << SUB) | (1L << LPAREN) | (1L << LBRACKET) | (1L << BOOL) | (1L << NUMBER) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
					{
					setState(270);
					exprList();
					}
				}

				setState(273);
				match(RPAREN);
				}
				break;
			case 7:
				_localctx = new MissingRParenStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(274);
				match(PRINT);
				setState(275);
				match(LPAREN);
				setState(277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(276);
					exprList();
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

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(KaonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(KaonParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KaonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KaonParser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(IDENTIFIER);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(282);
				match(COMMA);
				setState(283);
				match(IDENTIFIER);
				}
				}
				setState(288);
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

	public static class ExprListContext extends ParserRuleContext {
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
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			expression(0);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290);
					match(COMMA);
					setState(291);
					expression(0);
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolExpressionContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(KaonParser.BOOL, 0); }
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(KaonParser.NUMBER, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(KaonParser.IDENTIFIER, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MissingLParenExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public MissingLParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMissingLParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMissingLParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMissingLParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode BANG() { return getToken(KaonParser.BANG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(KaonParser.OR, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public TerminalNode SUB() { return getToken(KaonParser.SUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(KaonParser.POW, 0); }
		public PowerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(KaonParser.EQUALS, 0); }
		public TerminalNode NEQUALS() { return getToken(KaonParser.NEQUALS, 0); }
		public EqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(KaonParser.AND, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(KaonParser.IN, 0); }
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(KaonParser.STRING, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ExpressionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitExpressionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitExpressionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GTEQUALS() { return getToken(KaonParser.GTEQUALS, 0); }
		public TerminalNode LTEQUALS() { return getToken(KaonParser.LTEQUALS, 0); }
		public TerminalNode GT() { return getToken(KaonParser.GT, 0); }
		public TerminalNode LT() { return getToken(KaonParser.LT, 0); }
		public CompExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterCompExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitCompExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitCompExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExpressionContext extends ExpressionContext {
		public TerminalNode NULL() { return getToken(KaonParser.NULL, 0); }
		public NullExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MissingRParenExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MissingRParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMissingRParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMissingRParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMissingRParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExcessOperationExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExcessOperationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterExcessOperationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitExcessOperationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitExcessOperationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ADDExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(KaonParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KaonParser.SUB, 0); }
		public ADDExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterADDExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitADDExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitADDExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(KaonParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(KaonParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(KaonParser.MOD, 0); }
		public MultExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitMultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListExpressionContext extends ExpressionContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QMARK() { return getToken(KaonParser.QMARK, 0); }
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputExpressionContext extends ExpressionContext {
		public TerminalNode INPUT() { return getToken(KaonParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(KaonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KaonParser.RPAREN, 0); }
		public TerminalNode STRING() { return getToken(KaonParser.STRING, 0); }
		public InputExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterInputExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitInputExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitInputExpression(this);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(298);
				match(SUB);
				setState(299);
				expression(23);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				match(BANG);
				setState(301);
				expression(22);
				}
				break;
			case 3:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				match(NUMBER);
				}
				break;
			case 4:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				match(BOOL);
				}
				break;
			case 5:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				match(NULL);
				}
				break;
			case 6:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				functionCall();
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(306);
					indexes();
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new ListExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				list();
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(310);
					indexes();
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				match(IDENTIFIER);
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(314);
					indexes();
					}
					break;
				}
				}
				break;
			case 9:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(STRING);
				setState(319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(318);
					indexes();
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new ExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				match(LPAREN);
				setState(322);
				expression(0);
				setState(323);
				match(RPAREN);
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(324);
					indexes();
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new MissingRParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				match(LPAREN);
				setState(328);
				expression(2);
				}
				break;
			case 12:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329);
				match(INPUT);
				setState(330);
				match(LPAREN);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(331);
					match(STRING);
					}
				}

				setState(334);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(378);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(337);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(338);
						match(POW);
						setState(339);
						expression(21);
						}
						break;
					case 2:
						{
						_localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(340);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(341);
						((MultExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(342);
						expression(21);
						}
						break;
					case 3:
						{
						_localctx = new ADDExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(343);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(344);
						((ADDExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ADDExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(345);
						expression(20);
						}
						break;
					case 4:
						{
						_localctx = new ExcessOperationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(346);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(352);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__0:
							{
							setState(347);
							match(T__0);
							}
							break;
						case T__1:
							{
							setState(348);
							match(T__1);
							}
							break;
						case T__2:
							{
							setState(349);
							match(T__2);
							}
							break;
						case T__3:
							{
							setState(350);
							match(T__3);
							setState(351);
							match(T__4);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(354);
						expression(19);
						}
						break;
					case 5:
						{
						_localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(355);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(356);
						((CompExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTEQUALS) | (1L << LTEQUALS) | (1L << GT) | (1L << LT))) != 0)) ) {
							((CompExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(357);
						expression(18);
						}
						break;
					case 6:
						{
						_localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(358);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(359);
						((EqExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUALS || _la==NEQUALS) ) {
							((EqExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(360);
						expression(17);
						}
						break;
					case 7:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(361);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(362);
						match(AND);
						setState(363);
						expression(16);
						}
						break;
					case 8:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(364);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(365);
						match(OR);
						setState(366);
						expression(15);
						}
						break;
					case 9:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(368);
						match(QMARK);
						setState(369);
						expression(0);
						setState(370);
						match(T__5);
						setState(371);
						expression(14);
						}
						break;
					case 10:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(373);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(374);
						match(IN);
						setState(375);
						expression(13);
						}
						break;
					case 11:
						{
						_localctx = new MissingLParenExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(376);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(377);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class IndexesContext extends ParserRuleContext {
		public List<TerminalNode> LBRACKET() { return getTokens(KaonParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(KaonParser.LBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(KaonParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(KaonParser.RBRACKET, i);
		}
		public IndexesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterIndexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitIndexes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitIndexes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexesContext indexes() throws RecognitionException {
		IndexesContext _localctx = new IndexesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(383);
					match(LBRACKET);
					setState(384);
					expression(0);
					setState(385);
					match(RBRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(389); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(KaonParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(KaonParser.RBRACKET, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KaonListener ) ((KaonListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KaonVisitor ) return ((KaonVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(LBRACKET);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << PRINT) | (1L << INPUT) | (1L << NULL) | (1L << BANG) | (1L << SUB) | (1L << LPAREN) | (1L << LBRACKET) | (1L << BOOL) | (1L << NUMBER) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
				{
				setState(392);
				exprList();
				}
			}

			setState(395);
			match(RBRACKET);
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
		case 24:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0190\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\7\3>\n\3\f\3\16\3A"+
		"\13\3\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\5\5[\n\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6"+
		"c\n\6\3\6\3\6\3\6\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\7\5\7p\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\5\13\u0088\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0091\n\13\3\f\3\f\3\f\3\f\5\f\u0097\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\5\r\u00a1\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00b3\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00cf\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00e5\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00f8\n\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00fe\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0108\n"+
		"\27\3\27\3\27\3\27\3\27\5\27\u010e\n\27\3\27\3\27\5\27\u0112\n\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0118\n\27\5\27\u011a\n\27\3\30\3\30\3\30\7\30\u011f"+
		"\n\30\f\30\16\30\u0122\13\30\3\31\3\31\3\31\7\31\u0127\n\31\f\31\16\31"+
		"\u012a\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0136"+
		"\n\32\3\32\3\32\5\32\u013a\n\32\3\32\3\32\5\32\u013e\n\32\3\32\3\32\5"+
		"\32\u0142\n\32\3\32\3\32\3\32\3\32\5\32\u0148\n\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u014f\n\32\3\32\5\32\u0152\n\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0163\n\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u017d\n\32\f\32\16"+
		"\32\u0180\13\32\3\33\3\33\3\33\3\33\6\33\u0186\n\33\r\33\16\33\u0187\3"+
		"\34\3\34\5\34\u018c\n\34\3\34\3\34\3\34\2\3\62\35\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\6\4\2$%((\3\2&\'\4\2\36\37\""+
		"#\3\2\34\35\2\u01bb\28\3\2\2\2\4?\3\2\2\2\6U\3\2\2\2\bW\3\2\2\2\n_\3\2"+
		"\2\2\fg\3\2\2\2\16q\3\2\2\2\20w\3\2\2\2\22~\3\2\2\2\24\u0090\3\2\2\2\26"+
		"\u0092\3\2\2\2\30\u009c\3\2\2\2\32\u00b2\3\2\2\2\34\u00b4\3\2\2\2\36\u00bd"+
		"\3\2\2\2 \u00ce\3\2\2\2\"\u00d0\3\2\2\2$\u00d5\3\2\2\2&\u00e4\3\2\2\2"+
		"(\u00e6\3\2\2\2*\u00ed\3\2\2\2,\u0119\3\2\2\2.\u011b\3\2\2\2\60\u0123"+
		"\3\2\2\2\62\u0151\3\2\2\2\64\u0185\3\2\2\2\66\u0189\3\2\2\289\5\4\3\2"+
		"9:\7\2\2\3:\3\3\2\2\2;>\5\6\4\2<>\5\24\13\2=;\3\2\2\2=<\3\2\2\2>A\3\2"+
		"\2\2?=\3\2\2\2?@\3\2\2\2@F\3\2\2\2A?\3\2\2\2BC\7\21\2\2CD\5\62\32\2DE"+
		"\7/\2\2EG\3\2\2\2FB\3\2\2\2FG\3\2\2\2G\5\3\2\2\2HI\5\b\5\2IJ\7/\2\2JV"+
		"\3\2\2\2KL\5\n\6\2LM\7/\2\2MV\3\2\2\2NO\5,\27\2OP\7/\2\2PV\3\2\2\2QV\5"+
		"\f\7\2RV\5\32\16\2SV\5 \21\2TV\5&\24\2UH\3\2\2\2UK\3\2\2\2UN\3\2\2\2U"+
		"Q\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\7\3\2\2\2WX\7\31\2\2XZ\7\65\2"+
		"\2Y[\5\64\33\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\60\2\2]^\5\62\32\2"+
		"^\t\3\2\2\2_`\7\16\2\2`b\7\65\2\2ac\5\64\33\2ba\3\2\2\2bc\3\2\2\2cd\3"+
		"\2\2\2de\7\60\2\2ef\5\62\32\2f\13\3\2\2\2gk\5\16\b\2hj\5\20\t\2ih\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2np\5\22\n\2on\3"+
		"\2\2\2op\3\2\2\2p\r\3\2\2\2qr\7\17\2\2rs\5\62\32\2st\7+\2\2tu\5\4\3\2"+
		"uv\7,\2\2v\17\3\2\2\2wx\7\20\2\2xy\7\17\2\2yz\5\62\32\2z{\7+\2\2{|\5\4"+
		"\3\2|}\7,\2\2}\21\3\2\2\2~\177\7\20\2\2\177\u0080\7+\2\2\u0080\u0081\5"+
		"\4\3\2\u0081\u0082\7,\2\2\u0082\23\3\2\2\2\u0083\u0084\7\r\2\2\u0084\u0085"+
		"\7\65\2\2\u0085\u0087\7*\2\2\u0086\u0088\5.\30\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7)\2\2\u008a\u008b\7+\2"+
		"\2\u008b\u008c\5\4\3\2\u008c\u008d\7,\2\2\u008d\u0091\3\2\2\2\u008e\u0091"+
		"\5\26\f\2\u008f\u0091\5\30\r\2\u0090\u0083\3\2\2\2\u0090\u008e\3\2\2\2"+
		"\u0090\u008f\3\2\2\2\u0091\25\3\2\2\2\u0092\u0093\7\r\2\2\u0093\u0094"+
		"\7\65\2\2\u0094\u0096\7*\2\2\u0095\u0097\5.\30\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7)\2\2\u0099\u009a\5\4"+
		"\3\2\u009a\u009b\7,\2\2\u009b\27\3\2\2\2\u009c\u009d\7\r\2\2\u009d\u009e"+
		"\7\65\2\2\u009e\u00a0\7*\2\2\u009f\u00a1\5.\30\2\u00a0\u009f\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7)\2\2\u00a3\u00a4\7+\2"+
		"\2\u00a4\u00a5\5\4\3\2\u00a5\31\3\2\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8"+
		"\7\65\2\2\u00a8\u00a9\7\60\2\2\u00a9\u00aa\5\62\32\2\u00aa\u00ab\7\24"+
		"\2\2\u00ab\u00ac\5\62\32\2\u00ac\u00ad\7+\2\2\u00ad\u00ae\5\4\3\2\u00ae"+
		"\u00af\7,\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b3\5\34\17\2\u00b1\u00b3\5"+
		"\36\20\2\u00b2\u00a6\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\33\3\2\2\2\u00b4\u00b5\7\22\2\2\u00b5\u00b6\7\65\2\2\u00b6\u00b7\7\60"+
		"\2\2\u00b7\u00b8\5\62\32\2\u00b8\u00b9\7\24\2\2\u00b9\u00ba\5\62\32\2"+
		"\u00ba\u00bb\5\4\3\2\u00bb\u00bc\7,\2\2\u00bc\35\3\2\2\2\u00bd\u00be\7"+
		"\22\2\2\u00be\u00bf\7\65\2\2\u00bf\u00c0\7\60\2\2\u00c0\u00c1\5\62\32"+
		"\2\u00c1\u00c2\7\24\2\2\u00c2\u00c3\5\62\32\2\u00c3\u00c4\7+\2\2\u00c4"+
		"\u00c5\5\4\3\2\u00c5\37\3\2\2\2\u00c6\u00c7\7\23\2\2\u00c7\u00c8\5\62"+
		"\32\2\u00c8\u00c9\7+\2\2\u00c9\u00ca\5\4\3\2\u00ca\u00cb\7,\2\2\u00cb"+
		"\u00cf\3\2\2\2\u00cc\u00cf\5\"\22\2\u00cd\u00cf\5$\23\2\u00ce\u00c6\3"+
		"\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf!\3\2\2\2\u00d0\u00d1"+
		"\7\23\2\2\u00d1\u00d2\5\62\32\2\u00d2\u00d3\5\4\3\2\u00d3\u00d4\7,\2\2"+
		"\u00d4#\3\2\2\2\u00d5\u00d6\7\23\2\2\u00d6\u00d7\5\62\32\2\u00d7\u00d8"+
		"\7+\2\2\u00d8\u00d9\5\4\3\2\u00d9%\3\2\2\2\u00da\u00db\7\25\2\2\u00db"+
		"\u00dc\7+\2\2\u00dc\u00dd\5\4\3\2\u00dd\u00de\7,\2\2\u00de\u00df\7\23"+
		"\2\2\u00df\u00e0\5\62\32\2\u00e0\u00e1\7/\2\2\u00e1\u00e5\3\2\2\2\u00e2"+
		"\u00e5\5(\25\2\u00e3\u00e5\5*\26\2\u00e4\u00da\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e3\3\2\2\2\u00e5\'\3\2\2\2\u00e6\u00e7\7\25\2\2\u00e7\u00e8"+
		"\5\4\3\2\u00e8\u00e9\7,\2\2\u00e9\u00ea\7\23\2\2\u00ea\u00eb\5\62\32\2"+
		"\u00eb\u00ec\7/\2\2\u00ec)\3\2\2\2\u00ed\u00ee\7\25\2\2\u00ee\u00ef\7"+
		"+\2\2\u00ef\u00f0\5\4\3\2\u00f0\u00f1\7\23\2\2\u00f1\u00f2\5\62\32\2\u00f2"+
		"\u00f3\7/\2\2\u00f3+\3\2\2\2\u00f4\u00f5\7\65\2\2\u00f5\u00f7\7*\2\2\u00f6"+
		"\u00f8\5\60\31\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3"+
		"\2\2\2\u00f9\u011a\7)\2\2\u00fa\u00fb\7\n\2\2\u00fb\u00fd\7*\2\2\u00fc"+
		"\u00fe\5\62\32\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\u011a\7)\2\2\u0100\u0101\7\13\2\2\u0101\u0102\7*\2\2\u0102"+
		"\u0103\5\62\32\2\u0103\u0104\7)\2\2\u0104\u011a\3\2\2\2\u0105\u0107\7"+
		"\65\2\2\u0106\u0108\5\60\31\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109\u011a\7)\2\2\u010a\u010b\7\65\2\2\u010b\u010d"+
		"\7*\2\2\u010c\u010e\5\60\31\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2"+
		"\u010e\u011a\3\2\2\2\u010f\u0111\7\13\2\2\u0110\u0112\5\60\31\2\u0111"+
		"\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u011a\7)"+
		"\2\2\u0114\u0115\7\13\2\2\u0115\u0117\7*\2\2\u0116\u0118\5\60\31\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u00f4\3\2"+
		"\2\2\u0119\u00fa\3\2\2\2\u0119\u0100\3\2\2\2\u0119\u0105\3\2\2\2\u0119"+
		"\u010a\3\2\2\2\u0119\u010f\3\2\2\2\u0119\u0114\3\2\2\2\u011a-\3\2\2\2"+
		"\u011b\u0120\7\65\2\2\u011c\u011d\7\61\2\2\u011d\u011f\7\65\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121/\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0128\5\62\32\2\u0124\u0125"+
		"\7\61\2\2\u0125\u0127\5\62\32\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2\2"+
		"\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\61\3\2\2\2\u012a\u0128"+
		"\3\2\2\2\u012b\u012c\b\32\1\2\u012c\u012d\7\'\2\2\u012d\u0152\5\62\32"+
		"\31\u012e\u012f\7!\2\2\u012f\u0152\5\62\32\30\u0130\u0152\7\64\2\2\u0131"+
		"\u0152\7\63\2\2\u0132\u0152\7\30\2\2\u0133\u0135\5,\27\2\u0134\u0136\5"+
		"\64\33\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0152\3\2\2\2\u0137"+
		"\u0139\5\66\34\2\u0138\u013a\5\64\33\2\u0139\u0138\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u0152\3\2\2\2\u013b\u013d\7\65\2\2\u013c\u013e\5\64\33"+
		"\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0152\3\2\2\2\u013f\u0141"+
		"\7\66\2\2\u0140\u0142\5\64\33\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2"+
		"\2\u0142\u0152\3\2\2\2\u0143\u0144\7*\2\2\u0144\u0145\5\62\32\2\u0145"+
		"\u0147\7)\2\2\u0146\u0148\5\64\33\2\u0147\u0146\3\2\2\2\u0147\u0148\3"+
		"\2\2\2\u0148\u0152\3\2\2\2\u0149\u014a\7*\2\2\u014a\u0152\5\62\32\4\u014b"+
		"\u014c\7\f\2\2\u014c\u014e\7*\2\2\u014d\u014f\7\66\2\2\u014e\u014d\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\7)\2\2\u0151"+
		"\u012b\3\2\2\2\u0151\u012e\3\2\2\2\u0151\u0130\3\2\2\2\u0151\u0131\3\2"+
		"\2\2\u0151\u0132\3\2\2\2\u0151\u0133\3\2\2\2\u0151\u0137\3\2\2\2\u0151"+
		"\u013b\3\2\2\2\u0151\u013f\3\2\2\2\u0151\u0143\3\2\2\2\u0151\u0149\3\2"+
		"\2\2\u0151\u014b\3\2\2\2\u0152\u017e\3\2\2\2\u0153\u0154\f\27\2\2\u0154"+
		"\u0155\7 \2\2\u0155\u017d\5\62\32\27\u0156\u0157\f\26\2\2\u0157\u0158"+
		"\t\2\2\2\u0158\u017d\5\62\32\27\u0159\u015a\f\25\2\2\u015a\u015b\t\3\2"+
		"\2\u015b\u017d\5\62\32\26\u015c\u0162\f\24\2\2\u015d\u0163\7\3\2\2\u015e"+
		"\u0163\7\4\2\2\u015f\u0163\7\5\2\2\u0160\u0161\7\6\2\2\u0161\u0163\7\7"+
		"\2\2\u0162\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u0162\u015f\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u017d\5\62\32\25\u0165\u0166"+
		"\f\23\2\2\u0166\u0167\t\4\2\2\u0167\u017d\5\62\32\24\u0168\u0169\f\22"+
		"\2\2\u0169\u016a\t\5\2\2\u016a\u017d\5\62\32\23\u016b\u016c\f\21\2\2\u016c"+
		"\u016d\7\32\2\2\u016d\u017d\5\62\32\22\u016e\u016f\f\20\2\2\u016f\u0170"+
		"\7\33\2\2\u0170\u017d\5\62\32\21\u0171\u0172\f\17\2\2\u0172\u0173\7\62"+
		"\2\2\u0173\u0174\5\62\32\2\u0174\u0175\7\b\2\2\u0175\u0176\5\62\32\20"+
		"\u0176\u017d\3\2\2\2\u0177\u0178\f\16\2\2\u0178\u0179\7\27\2\2\u0179\u017d"+
		"\5\62\32\17\u017a\u017b\f\5\2\2\u017b\u017d\7)\2\2\u017c\u0153\3\2\2\2"+
		"\u017c\u0156\3\2\2\2\u017c\u0159\3\2\2\2\u017c\u015c\3\2\2\2\u017c\u0165"+
		"\3\2\2\2\u017c\u0168\3\2\2\2\u017c\u016b\3\2\2\2\u017c\u016e\3\2\2\2\u017c"+
		"\u0171\3\2\2\2\u017c\u0177\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\63\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0181\u0182\7-\2\2\u0182\u0183\5\62\32\2\u0183\u0184\7.\2\2\u0184"+
		"\u0186\3\2\2\2\u0185\u0181\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0185\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\65\3\2\2\2\u0189\u018b\7-\2\2\u018a\u018c"+
		"\5\60\31\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2"+
		"\u018d\u018e\7.\2\2\u018e\67\3\2\2\2&=?FUZbko\u0087\u0090\u0096\u00a0"+
		"\u00b2\u00ce\u00e4\u00f7\u00fd\u0107\u010d\u0111\u0117\u0119\u0120\u0128"+
		"\u0135\u0139\u013d\u0141\u0147\u014e\u0151\u0162\u017c\u017e\u0187\u018b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}