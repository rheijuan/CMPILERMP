package antlr4;// Generated from C:/Users/rheij/Documents/GitHub/CMPILERMP/Java Implementation/grammar\Kaon.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KaonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		MAIN=10, PRINTLN=11, PRINT=12, INPUT=13, FUNC=14, CONST=15, IF=16, ELSE=17, 
		RETURN=18, FOR=19, WHILE=20, TO=21, DO=22, END=23, IN=24, NULL=25, VAR=26, 
		TRY=27, CATCH=28, FINALLY=29, AND=30, OR=31, EQUALS=32, NEQUALS=33, GTEQUALS=34, 
		LTEQUALS=35, POW=36, BANG=37, GT=38, LT=39, MUL=40, DIV=41, ADD=42, SUB=43, 
		MOD=44, RPAREN=45, LPAREN=46, LBRACE=47, RBRACE=48, LBRACKET=49, RBRACKET=50, 
		SCOLON=51, ASSIGN=52, COMMA=53, QMARK=54, BOOL=55, NUMBER=56, IDENTIFIER=57, 
		STRING=58, COMMENT=59, SPACE=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"MAIN", "PRINTLN", "PRINT", "INPUT", "FUNC", "CONST", "IF", "ELSE", "RETURN", 
			"FOR", "WHILE", "TO", "DO", "END", "IN", "NULL", "VAR", "TRY", "CATCH", 
			"FINALLY", "AND", "OR", "EQUALS", "NEQUALS", "GTEQUALS", "LTEQUALS", 
			"POW", "BANG", "GT", "LT", "MUL", "DIV", "ADD", "SUB", "MOD", "RPAREN", 
			"LPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SCOLON", "ASSIGN", 
			"COMMA", "QMARK", "BOOL", "NUMBER", "IDENTIFIER", "STRING", "COMMENT", 
			"SPACE", "Int", "Digit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'NullException'", "'IndexOutOfBounds'", "'DivideByZero'", "'++'", 
			"'--'", "'**'", "'//'", "'%%'", "':'", "'dish'", "'plate'", "'print'", 
			"'pudding'", "'sidedish'", "'water'", "'beef'", "'eel'", "'rice'", "'pork'", 
			"'wine'", "'to'", "'doughnut'", "'finish'", "'in'", "'starve'", "'ingredient'", 
			"'cook'", "'oil'", "'serve'", "'&&'", "'||'", "'=='", "'!='", "'>='", 
			"'<='", "'^'", "'!'", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", 
			"')'", "'('", "'{'", "'}'", "'['", "']'", "';'", "'='", "','", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "MAIN", "PRINTLN", 
			"PRINT", "INPUT", "FUNC", "CONST", "IF", "ELSE", "RETURN", "FOR", "WHILE", 
			"TO", "DO", "END", "IN", "NULL", "VAR", "TRY", "CATCH", "FINALLY", "AND", 
			"OR", "EQUALS", "NEQUALS", "GTEQUALS", "LTEQUALS", "POW", "BANG", "GT", 
			"LT", "MUL", "DIV", "ADD", "SUB", "MOD", "RPAREN", "LPAREN", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "SCOLON", "ASSIGN", "COMMA", "QMARK", 
			"BOOL", "NUMBER", "IDENTIFIER", "STRING", "COMMENT", "SPACE"
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


	public KaonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kaon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u01d0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\38\38\38\38\38\38\38\38\38\38\58\u017a\n8\39\39\39\79\u017f"+
		"\n9\f9\169\u0182\139\59\u0184\n9\3:\3:\7:\u0188\n:\f:\16:\u018b\13:\3"+
		";\3;\3;\3;\7;\u0191\n;\f;\16;\u0194\13;\3;\3;\3;\3;\3;\7;\u019b\n;\f;"+
		"\16;\u019e\13;\3;\5;\u01a1\n;\3<\3<\3<\3<\7<\u01a7\n<\f<\16<\u01aa\13"+
		"<\3<\3<\3<\3<\7<\u01b0\n<\f<\16<\u01b3\13<\3<\3<\5<\u01b7\n<\3<\3<\3="+
		"\3=\3=\3=\3>\3>\7>\u01c1\n>\f>\16>\u01c4\13>\3>\5>\u01c7\n>\3?\3?\3@\3"+
		"@\3@\3@\5@\u01cf\n@\3\u01b1\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{\2}\2\177\2\3\2\20\5\2C\\aac|\6"+
		"\2\62;C\\aac|\3\2$$\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3\2))\6\2\f\f\17\17"+
		"))^^\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\6\2&&C\\aac|\4\2\2\u0081\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\2\u01dc\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3\u0081\3\2\2\2\5\u008f\3"+
		"\2\2\2\7\u00a0\3\2\2\2\t\u00ad\3\2\2\2\13\u00b0\3\2\2\2\r\u00b3\3\2\2"+
		"\2\17\u00b6\3\2\2\2\21\u00b9\3\2\2\2\23\u00bc\3\2\2\2\25\u00be\3\2\2\2"+
		"\27\u00c3\3\2\2\2\31\u00c9\3\2\2\2\33\u00cf\3\2\2\2\35\u00d7\3\2\2\2\37"+
		"\u00e0\3\2\2\2!\u00e6\3\2\2\2#\u00eb\3\2\2\2%\u00ef\3\2\2\2\'\u00f4\3"+
		"\2\2\2)\u00f9\3\2\2\2+\u00fe\3\2\2\2-\u0101\3\2\2\2/\u010a\3\2\2\2\61"+
		"\u0111\3\2\2\2\63\u0114\3\2\2\2\65\u011b\3\2\2\2\67\u0126\3\2\2\29\u012b"+
		"\3\2\2\2;\u012f\3\2\2\2=\u0135\3\2\2\2?\u0138\3\2\2\2A\u013b\3\2\2\2C"+
		"\u013e\3\2\2\2E\u0141\3\2\2\2G\u0144\3\2\2\2I\u0147\3\2\2\2K\u0149\3\2"+
		"\2\2M\u014b\3\2\2\2O\u014d\3\2\2\2Q\u014f\3\2\2\2S\u0151\3\2\2\2U\u0153"+
		"\3\2\2\2W\u0155\3\2\2\2Y\u0157\3\2\2\2[\u0159\3\2\2\2]\u015b\3\2\2\2_"+
		"\u015d\3\2\2\2a\u015f\3\2\2\2c\u0161\3\2\2\2e\u0163\3\2\2\2g\u0165\3\2"+
		"\2\2i\u0167\3\2\2\2k\u0169\3\2\2\2m\u016b\3\2\2\2o\u0179\3\2\2\2q\u017b"+
		"\3\2\2\2s\u0185\3\2\2\2u\u01a0\3\2\2\2w\u01b6\3\2\2\2y\u01ba\3\2\2\2{"+
		"\u01c6\3\2\2\2}\u01c8\3\2\2\2\177\u01ce\3\2\2\2\u0081\u0082\7P\2\2\u0082"+
		"\u0083\7w\2\2\u0083\u0084\7n\2\2\u0084\u0085\7n\2\2\u0085\u0086\7G\2\2"+
		"\u0086\u0087\7z\2\2\u0087\u0088\7e\2\2\u0088\u0089\7g\2\2\u0089\u008a"+
		"\7r\2\2\u008a\u008b\7v\2\2\u008b\u008c\7k\2\2\u008c\u008d\7q\2\2\u008d"+
		"\u008e\7p\2\2\u008e\4\3\2\2\2\u008f\u0090\7K\2\2\u0090\u0091\7p\2\2\u0091"+
		"\u0092\7f\2\2\u0092\u0093\7g\2\2\u0093\u0094\7z\2\2\u0094\u0095\7Q\2\2"+
		"\u0095\u0096\7w\2\2\u0096\u0097\7v\2\2\u0097\u0098\7Q\2\2\u0098\u0099"+
		"\7h\2\2\u0099\u009a\7D\2\2\u009a\u009b\7q\2\2\u009b\u009c\7w\2\2\u009c"+
		"\u009d\7p\2\2\u009d\u009e\7f\2\2\u009e\u009f\7u\2\2\u009f\6\3\2\2\2\u00a0"+
		"\u00a1\7F\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7x\2\2\u00a3\u00a4\7k\2\2"+
		"\u00a4\u00a5\7f\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7D\2\2\u00a7\u00a8"+
		"\7{\2\2\u00a8\u00a9\7\\\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7t\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\b\3\2\2\2\u00ad\u00ae\7-\2\2\u00ae\u00af\7-\2\2\u00af"+
		"\n\3\2\2\2\u00b0\u00b1\7/\2\2\u00b1\u00b2\7/\2\2\u00b2\f\3\2\2\2\u00b3"+
		"\u00b4\7,\2\2\u00b4\u00b5\7,\2\2\u00b5\16\3\2\2\2\u00b6\u00b7\7\61\2\2"+
		"\u00b7\u00b8\7\61\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\7\'\2\2\u00ba\u00bb"+
		"\7\'\2\2\u00bb\22\3\2\2\2\u00bc\u00bd\7<\2\2\u00bd\24\3\2\2\2\u00be\u00bf"+
		"\7f\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7j\2\2\u00c2"+
		"\26\3\2\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7c\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7g\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\7r\2\2\u00ca"+
		"\u00cb\7t\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2"+
		"\u00ce\32\3\2\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7"+
		"f\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6"+
		"\7i\2\2\u00d6\34\3\2\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da"+
		"\7f\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7u\2\2\u00de\u00df\7j\2\2\u00df\36\3\2\2\2\u00e0\u00e1\7y\2\2\u00e1"+
		"\u00e2\7c\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7t\2\2"+
		"\u00e5 \3\2\2\2\u00e6\u00e7\7d\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7g\2"+
		"\2\u00e9\u00ea\7h\2\2\u00ea\"\3\2\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7"+
		"g\2\2\u00ed\u00ee\7n\2\2\u00ee$\3\2\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1"+
		"\7k\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7g\2\2\u00f3&\3\2\2\2\u00f4\u00f5"+
		"\7r\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7m\2\2\u00f8"+
		"(\3\2\2\2\u00f9\u00fa\7y\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2\u00fc"+
		"\u00fd\7g\2\2\u00fd*\3\2\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7q\2\2\u0100"+
		",\3\2\2\2\u0101\u0102\7f\2\2\u0102\u0103\7q\2\2\u0103\u0104\7w\2\2\u0104"+
		"\u0105\7i\2\2\u0105\u0106\7j\2\2\u0106\u0107\7p\2\2\u0107\u0108\7w\2\2"+
		"\u0108\u0109\7v\2\2\u0109.\3\2\2\2\u010a\u010b\7h\2\2\u010b\u010c\7k\2"+
		"\2\u010c\u010d\7p\2\2\u010d\u010e\7k\2\2\u010e\u010f\7u\2\2\u010f\u0110"+
		"\7j\2\2\u0110\60\3\2\2\2\u0111\u0112\7k\2\2\u0112\u0113\7p\2\2\u0113\62"+
		"\3\2\2\2\u0114\u0115\7u\2\2\u0115\u0116\7v\2\2\u0116\u0117\7c\2\2\u0117"+
		"\u0118\7t\2\2\u0118\u0119\7x\2\2\u0119\u011a\7g\2\2\u011a\64\3\2\2\2\u011b"+
		"\u011c\7k\2\2\u011c\u011d\7p\2\2\u011d\u011e\7i\2\2\u011e\u011f\7t\2\2"+
		"\u011f\u0120\7g\2\2\u0120\u0121\7f\2\2\u0121\u0122\7k\2\2\u0122\u0123"+
		"\7g\2\2\u0123\u0124\7p\2\2\u0124\u0125\7v\2\2\u0125\66\3\2\2\2\u0126\u0127"+
		"\7e\2\2\u0127\u0128\7q\2\2\u0128\u0129\7q\2\2\u0129\u012a\7m\2\2\u012a"+
		"8\3\2\2\2\u012b\u012c\7q\2\2\u012c\u012d\7k\2\2\u012d\u012e\7n\2\2\u012e"+
		":\3\2\2\2\u012f\u0130\7u\2\2\u0130\u0131\7g\2\2\u0131\u0132\7t\2\2\u0132"+
		"\u0133\7x\2\2\u0133\u0134\7g\2\2\u0134<\3\2\2\2\u0135\u0136\7(\2\2\u0136"+
		"\u0137\7(\2\2\u0137>\3\2\2\2\u0138\u0139\7~\2\2\u0139\u013a\7~\2\2\u013a"+
		"@\3\2\2\2\u013b\u013c\7?\2\2\u013c\u013d\7?\2\2\u013dB\3\2\2\2\u013e\u013f"+
		"\7#\2\2\u013f\u0140\7?\2\2\u0140D\3\2\2\2\u0141\u0142\7@\2\2\u0142\u0143"+
		"\7?\2\2\u0143F\3\2\2\2\u0144\u0145\7>\2\2\u0145\u0146\7?\2\2\u0146H\3"+
		"\2\2\2\u0147\u0148\7`\2\2\u0148J\3\2\2\2\u0149\u014a\7#\2\2\u014aL\3\2"+
		"\2\2\u014b\u014c\7@\2\2\u014cN\3\2\2\2\u014d\u014e\7>\2\2\u014eP\3\2\2"+
		"\2\u014f\u0150\7,\2\2\u0150R\3\2\2\2\u0151\u0152\7\61\2\2\u0152T\3\2\2"+
		"\2\u0153\u0154\7-\2\2\u0154V\3\2\2\2\u0155\u0156\7/\2\2\u0156X\3\2\2\2"+
		"\u0157\u0158\7\'\2\2\u0158Z\3\2\2\2\u0159\u015a\7+\2\2\u015a\\\3\2\2\2"+
		"\u015b\u015c\7*\2\2\u015c^\3\2\2\2\u015d\u015e\7}\2\2\u015e`\3\2\2\2\u015f"+
		"\u0160\7\177\2\2\u0160b\3\2\2\2\u0161\u0162\7]\2\2\u0162d\3\2\2\2\u0163"+
		"\u0164\7_\2\2\u0164f\3\2\2\2\u0165\u0166\7=\2\2\u0166h\3\2\2\2\u0167\u0168"+
		"\7?\2\2\u0168j\3\2\2\2\u0169\u016a\7.\2\2\u016al\3\2\2\2\u016b\u016c\7"+
		"A\2\2\u016cn\3\2\2\2\u016d\u016e\7d\2\2\u016e\u016f\7w\2\2\u016f\u0170"+
		"\7v\2\2\u0170\u0171\7g\2\2\u0171\u0172\7v\2\2\u0172\u017a\7g\2\2\u0173"+
		"\u0174\7r\2\2\u0174\u0175\7c\2\2\u0175\u0176\7n\2\2\u0176\u0177\7c\2\2"+
		"\u0177\u0178\7m\2\2\u0178\u017a\7c\2\2\u0179\u016d\3\2\2\2\u0179\u0173"+
		"\3\2\2\2\u017ap\3\2\2\2\u017b\u0183\5{>\2\u017c\u0180\7\60\2\2\u017d\u017f"+
		"\5}?\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u017c\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184r\3\2\2\2\u0185\u0189\t\2\2\2\u0186\u0188"+
		"\t\3\2\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018at\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u0192\t\4\2\2"+
		"\u018d\u0191\n\5\2\2\u018e\u018f\7^\2\2\u018f\u0191\n\6\2\2\u0190\u018d"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u01a1\t\4"+
		"\2\2\u0196\u019c\t\7\2\2\u0197\u019b\n\b\2\2\u0198\u0199\7^\2\2\u0199"+
		"\u019b\n\6\2\2\u019a\u0197\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2"+
		"\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019f\u01a1\t\7\2\2\u01a0\u018c\3\2\2\2\u01a0\u0196\3\2"+
		"\2\2\u01a1v\3\2\2\2\u01a2\u01a3\7\61\2\2\u01a3\u01a4\7\61\2\2\u01a4\u01a8"+
		"\3\2\2\2\u01a5\u01a7\n\6\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01b7\3\2\2\2\u01aa\u01a8\3\2"+
		"\2\2\u01ab\u01ac\7\61\2\2\u01ac\u01ad\7,\2\2\u01ad\u01b1\3\2\2\2\u01ae"+
		"\u01b0\13\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01b2\3"+
		"\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01b5\7,\2\2\u01b5\u01b7\7\61\2\2\u01b6\u01a2\3\2\2\2\u01b6\u01ab\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\b<\2\2\u01b9x\3\2\2\2\u01ba\u01bb"+
		"\t\t\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\b=\2\2\u01bdz\3\2\2\2\u01be\u01c2"+
		"\t\n\2\2\u01bf\u01c1\5}?\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c7\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c5\u01c7\7\62\2\2\u01c6\u01be\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7"+
		"|\3\2\2\2\u01c8\u01c9\t\13\2\2\u01c9~\3\2\2\2\u01ca\u01cf\t\f\2\2\u01cb"+
		"\u01cf\n\r\2\2\u01cc\u01cd\t\16\2\2\u01cd\u01cf\t\17\2\2\u01ce\u01ca\3"+
		"\2\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u0080\3\2\2\2\22"+
		"\2\u0179\u0180\u0183\u0189\u0190\u0192\u019a\u019c\u01a0\u01a8\u01b1\u01b6"+
		"\u01c2\u01c6\u01ce\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}