package antlr4;

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
		T__0=1, MAIN=2, PRINTLN=3, PRINT=4, INPUT=5, FUNC=6, CONST=7, IF=8, ELSE=9, 
		RETURN=10, FOR=11, WHILE=12, TO=13, DO=14, END=15, IN=16, NULL=17, VAR=18, 
		AND=19, OR=20, EQUALS=21, NEQUALS=22, GTEQUALS=23, LTEQUALS=24, POW=25, 
		BANG=26, GT=27, LT=28, MUL=29, DIV=30, ADD=31, SUB=32, MOD=33, RPAREN=34, 
		LPAREN=35, LBRACE=36, RBRACE=37, LBRACKET=38, RBRACKET=39, SCOLON=40, 
		ASSIGN=41, COMMA=42, QMARK=43, BOOL=44, NUMBER=45, IDENTIFIER=46, STRING=47, 
		COMMENT=48, SPACE=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "MAIN", "PRINTLN", "PRINT", "INPUT", "FUNC", "CONST", "IF", "ELSE", 
			"RETURN", "FOR", "WHILE", "TO", "DO", "END", "IN", "NULL", "VAR", "AND", 
			"OR", "EQUALS", "NEQUALS", "GTEQUALS", "LTEQUALS", "POW", "BANG", "GT", 
			"LT", "MUL", "DIV", "ADD", "SUB", "MOD", "RPAREN", "LPAREN", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "SCOLON", "ASSIGN", "COMMA", "QMARK", 
			"BOOL", "NUMBER", "IDENTIFIER", "STRING", "COMMENT", "SPACE", "Int", 
			"Digit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'dish'", "'plate'", "'print'", "'pudding'", "'sidedish'", 
			"'water'", "'beef'", "'eel'", "'rice'", "'pork'", "'wine'", "'to'", "'doughnut'", 
			"'finish'", "'in'", "'starve'", "'ingredient'", "'&&'", "'||'", "'=='", 
			"'!='", "'>='", "'<='", "'^'", "'!'", "'>'", "'<'", "'*'", "'/'", "'+'", 
			"'-'", "'%'", "')'", "'('", "'{'", "'}'", "'['", "']'", "';'", "'='", 
			"','", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "MAIN", "PRINTLN", "PRINT", "INPUT", "FUNC", "CONST", "IF", 
			"ELSE", "RETURN", "FOR", "WHILE", "TO", "DO", "END", "IN", "NULL", "VAR", 
			"AND", "OR", "EQUALS", "NEQUALS", "GTEQUALS", "LTEQUALS", "POW", "BANG", 
			"GT", "LT", "MUL", "DIV", "ADD", "SUB", "MOD", "RPAREN", "LPAREN", "LBRACE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0170\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u011a\n-\3."+
		"\3.\3.\7.\u011f\n.\f.\16.\u0122\13.\5.\u0124\n.\3/\3/\7/\u0128\n/\f/\16"+
		"/\u012b\13/\3\60\3\60\3\60\3\60\7\60\u0131\n\60\f\60\16\60\u0134\13\60"+
		"\3\60\3\60\3\60\3\60\3\60\7\60\u013b\n\60\f\60\16\60\u013e\13\60\3\60"+
		"\5\60\u0141\n\60\3\61\3\61\3\61\3\61\7\61\u0147\n\61\f\61\16\61\u014a"+
		"\13\61\3\61\3\61\3\61\3\61\7\61\u0150\n\61\f\61\16\61\u0153\13\61\3\61"+
		"\3\61\5\61\u0157\n\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\7\63\u0161"+
		"\n\63\f\63\16\63\u0164\13\63\3\63\5\63\u0167\n\63\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\5\65\u016f\n\65\3\u0151\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\2g\2i\2\3\2\20\5\2C\\aac|\6\2\62;C\\aac|\3\2$$"+
		"\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3\2))\6\2\f\f\17\17))^^\5\2\13\f\16\17"+
		"\"\"\3\2\63;\3\2\62;\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01"+
		"\3\2\udc02\ue001\2\u017c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7r\3\2\2"+
		"\2\tx\3\2\2\2\13~\3\2\2\2\r\u0086\3\2\2\2\17\u008f\3\2\2\2\21\u0095\3"+
		"\2\2\2\23\u009a\3\2\2\2\25\u009e\3\2\2\2\27\u00a3\3\2\2\2\31\u00a8\3\2"+
		"\2\2\33\u00ad\3\2\2\2\35\u00b0\3\2\2\2\37\u00b9\3\2\2\2!\u00c0\3\2\2\2"+
		"#\u00c3\3\2\2\2%\u00ca\3\2\2\2\'\u00d5\3\2\2\2)\u00d8\3\2\2\2+\u00db\3"+
		"\2\2\2-\u00de\3\2\2\2/\u00e1\3\2\2\2\61\u00e4\3\2\2\2\63\u00e7\3\2\2\2"+
		"\65\u00e9\3\2\2\2\67\u00eb\3\2\2\29\u00ed\3\2\2\2;\u00ef\3\2\2\2=\u00f1"+
		"\3\2\2\2?\u00f3\3\2\2\2A\u00f5\3\2\2\2C\u00f7\3\2\2\2E\u00f9\3\2\2\2G"+
		"\u00fb\3\2\2\2I\u00fd\3\2\2\2K\u00ff\3\2\2\2M\u0101\3\2\2\2O\u0103\3\2"+
		"\2\2Q\u0105\3\2\2\2S\u0107\3\2\2\2U\u0109\3\2\2\2W\u010b\3\2\2\2Y\u0119"+
		"\3\2\2\2[\u011b\3\2\2\2]\u0125\3\2\2\2_\u0140\3\2\2\2a\u0156\3\2\2\2c"+
		"\u015a\3\2\2\2e\u0166\3\2\2\2g\u0168\3\2\2\2i\u016e\3\2\2\2kl\7<\2\2l"+
		"\4\3\2\2\2mn\7f\2\2no\7k\2\2op\7u\2\2pq\7j\2\2q\6\3\2\2\2rs\7r\2\2st\7"+
		"n\2\2tu\7c\2\2uv\7v\2\2vw\7g\2\2w\b\3\2\2\2xy\7r\2\2yz\7t\2\2z{\7k\2\2"+
		"{|\7p\2\2|}\7v\2\2}\n\3\2\2\2~\177\7r\2\2\177\u0080\7w\2\2\u0080\u0081"+
		"\7f\2\2\u0081\u0082\7f\2\2\u0082\u0083\7k\2\2\u0083\u0084\7p\2\2\u0084"+
		"\u0085\7i\2\2\u0085\f\3\2\2\2\u0086\u0087\7u\2\2\u0087\u0088\7k\2\2\u0088"+
		"\u0089\7f\2\2\u0089\u008a\7g\2\2\u008a\u008b\7f\2\2\u008b\u008c\7k\2\2"+
		"\u008c\u008d\7u\2\2\u008d\u008e\7j\2\2\u008e\16\3\2\2\2\u008f\u0090\7"+
		"y\2\2\u0090\u0091\7c\2\2\u0091\u0092\7v\2\2\u0092\u0093\7g\2\2\u0093\u0094"+
		"\7t\2\2\u0094\20\3\2\2\2\u0095\u0096\7d\2\2\u0096\u0097\7g\2\2\u0097\u0098"+
		"\7g\2\2\u0098\u0099\7h\2\2\u0099\22\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c"+
		"\7g\2\2\u009c\u009d\7n\2\2\u009d\24\3\2\2\2\u009e\u009f\7t\2\2\u009f\u00a0"+
		"\7k\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7g\2\2\u00a2\26\3\2\2\2\u00a3\u00a4"+
		"\7r\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7m\2\2\u00a7"+
		"\30\3\2\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7q\2\2\u00af"+
		"\34\3\2\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7w\2\2\u00b3"+
		"\u00b4\7i\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7w\2\2"+
		"\u00b7\u00b8\7v\2\2\u00b8\36\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7"+
		"k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7u\2\2\u00be\u00bf"+
		"\7j\2\2\u00bf \3\2\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\"\3"+
		"\2\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7c\2\2\u00c6"+
		"\u00c7\7t\2\2\u00c7\u00c8\7x\2\2\u00c8\u00c9\7g\2\2\u00c9$\3\2\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7i\2\2\u00cd\u00ce\7t\2\2"+
		"\u00ce\u00cf\7g\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2"+
		"\7g\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7v\2\2\u00d4&\3\2\2\2\u00d5\u00d6"+
		"\7(\2\2\u00d6\u00d7\7(\2\2\u00d7(\3\2\2\2\u00d8\u00d9\7~\2\2\u00d9\u00da"+
		"\7~\2\2\u00da*\3\2\2\2\u00db\u00dc\7?\2\2\u00dc\u00dd\7?\2\2\u00dd,\3"+
		"\2\2\2\u00de\u00df\7#\2\2\u00df\u00e0\7?\2\2\u00e0.\3\2\2\2\u00e1\u00e2"+
		"\7@\2\2\u00e2\u00e3\7?\2\2\u00e3\60\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6"+
		"\7?\2\2\u00e6\62\3\2\2\2\u00e7\u00e8\7`\2\2\u00e8\64\3\2\2\2\u00e9\u00ea"+
		"\7#\2\2\u00ea\66\3\2\2\2\u00eb\u00ec\7@\2\2\u00ec8\3\2\2\2\u00ed\u00ee"+
		"\7>\2\2\u00ee:\3\2\2\2\u00ef\u00f0\7,\2\2\u00f0<\3\2\2\2\u00f1\u00f2\7"+
		"\61\2\2\u00f2>\3\2\2\2\u00f3\u00f4\7-\2\2\u00f4@\3\2\2\2\u00f5\u00f6\7"+
		"/\2\2\u00f6B\3\2\2\2\u00f7\u00f8\7\'\2\2\u00f8D\3\2\2\2\u00f9\u00fa\7"+
		"+\2\2\u00faF\3\2\2\2\u00fb\u00fc\7*\2\2\u00fcH\3\2\2\2\u00fd\u00fe\7}"+
		"\2\2\u00feJ\3\2\2\2\u00ff\u0100\7\177\2\2\u0100L\3\2\2\2\u0101\u0102\7"+
		"]\2\2\u0102N\3\2\2\2\u0103\u0104\7_\2\2\u0104P\3\2\2\2\u0105\u0106\7="+
		"\2\2\u0106R\3\2\2\2\u0107\u0108\7?\2\2\u0108T\3\2\2\2\u0109\u010a\7.\2"+
		"\2\u010aV\3\2\2\2\u010b\u010c\7A\2\2\u010cX\3\2\2\2\u010d\u010e\7d\2\2"+
		"\u010e\u010f\7w\2\2\u010f\u0110\7v\2\2\u0110\u0111\7g\2\2\u0111\u0112"+
		"\7v\2\2\u0112\u011a\7g\2\2\u0113\u0114\7r\2\2\u0114\u0115\7c\2\2\u0115"+
		"\u0116\7n\2\2\u0116\u0117\7c\2\2\u0117\u0118\7m\2\2\u0118\u011a\7c\2\2"+
		"\u0119\u010d\3\2\2\2\u0119\u0113\3\2\2\2\u011aZ\3\2\2\2\u011b\u0123\5"+
		"e\63\2\u011c\u0120\7\60\2\2\u011d\u011f\5g\64\2\u011e\u011d\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0123\u011c\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\\\3\2\2\2\u0125\u0129\t\2\2\2\u0126\u0128\t\3\2\2\u0127\u0126\3\2\2\2"+
		"\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a^\3"+
		"\2\2\2\u012b\u0129\3\2\2\2\u012c\u0132\t\4\2\2\u012d\u0131\n\5\2\2\u012e"+
		"\u012f\7^\2\2\u012f\u0131\n\6\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0141\t\4\2\2\u0136\u013c\t\7"+
		"\2\2\u0137\u013b\n\b\2\2\u0138\u0139\7^\2\2\u0139\u013b\n\6\2\2\u013a"+
		"\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0141\t\7\2\2\u0140\u012c\3\2\2\2\u0140\u0136\3\2\2\2\u0141`\3\2\2\2"+
		"\u0142\u0143\7\61\2\2\u0143\u0144\7\61\2\2\u0144\u0148\3\2\2\2\u0145\u0147"+
		"\n\6\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u0157\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7\61"+
		"\2\2\u014c\u014d\7,\2\2\u014d\u0151\3\2\2\2\u014e\u0150\13\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0152\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7,\2\2\u0155"+
		"\u0157\7\61\2\2\u0156\u0142\3\2\2\2\u0156\u014b\3\2\2\2\u0157\u0158\3"+
		"\2\2\2\u0158\u0159\b\61\2\2\u0159b\3\2\2\2\u015a\u015b\t\t\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015d\b\62\2\2\u015dd\3\2\2\2\u015e\u0162\t\n\2\2\u015f"+
		"\u0161\5g\64\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0167\3\2\2\2\u0164\u0162\3\2\2\2\u0165"+
		"\u0167\7\62\2\2\u0166\u015e\3\2\2\2\u0166\u0165\3\2\2\2\u0167f\3\2\2\2"+
		"\u0168\u0169\t\13\2\2\u0169h\3\2\2\2\u016a\u016f\t\f\2\2\u016b\u016f\n"+
		"\r\2\2\u016c\u016d\t\16\2\2\u016d\u016f\t\17\2\2\u016e\u016a\3\2\2\2\u016e"+
		"\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016fj\3\2\2\2\22\2\u0119\u0120\u0123"+
		"\u0129\u0130\u0132\u013a\u013c\u0140\u0148\u0151\u0156\u0162\u0166\u016e"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}