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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, MAIN=7, PRINTLN=8, PRINT=9, 
		INPUT=10, FUNC=11, CONST=12, IF=13, ELSE=14, RETURN=15, FOR=16, WHILE=17, 
		TO=18, DO=19, END=20, IN=21, NULL=22, VAR=23, AND=24, OR=25, EQUALS=26, 
		NEQUALS=27, GTEQUALS=28, LTEQUALS=29, POW=30, BANG=31, GT=32, LT=33, MUL=34, 
		DIV=35, ADD=36, SUB=37, MOD=38, RPAREN=39, LPAREN=40, LBRACE=41, RBRACE=42, 
		LBRACKET=43, RBRACKET=44, SCOLON=45, ASSIGN=46, COMMA=47, QMARK=48, BOOL=49, 
		NUMBER=50, IDENTIFIER=51, STRING=52, COMMENT=53, SPACE=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "MAIN", "PRINTLN", "PRINT", 
			"INPUT", "FUNC", "CONST", "IF", "ELSE", "RETURN", "FOR", "WHILE", "TO", 
			"DO", "END", "IN", "NULL", "VAR", "AND", "OR", "EQUALS", "NEQUALS", "GTEQUALS", 
			"LTEQUALS", "POW", "BANG", "GT", "LT", "MUL", "DIV", "ADD", "SUB", "MOD", 
			"RPAREN", "LPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SCOLON", 
			"ASSIGN", "COMMA", "QMARK", "BOOL", "NUMBER", "IDENTIFIER", "STRING", 
			"COMMENT", "SPACE", "Int", "Digit", "Letter"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0189\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)"+
		"\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0133\n\62\3\63"+
		"\3\63\3\63\7\63\u0138\n\63\f\63\16\63\u013b\13\63\5\63\u013d\n\63\3\64"+
		"\3\64\7\64\u0141\n\64\f\64\16\64\u0144\13\64\3\65\3\65\3\65\3\65\7\65"+
		"\u014a\n\65\f\65\16\65\u014d\13\65\3\65\3\65\3\65\3\65\3\65\7\65\u0154"+
		"\n\65\f\65\16\65\u0157\13\65\3\65\5\65\u015a\n\65\3\66\3\66\3\66\3\66"+
		"\7\66\u0160\n\66\f\66\16\66\u0163\13\66\3\66\3\66\3\66\3\66\7\66\u0169"+
		"\n\66\f\66\16\66\u016c\13\66\3\66\3\66\5\66\u0170\n\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\38\38\78\u017a\n8\f8\168\u017d\138\38\58\u0180\n8\39\3"+
		"9\3:\3:\3:\3:\5:\u0188\n:\3\u016a\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o\2q\2s\2\3\2\20\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2$$\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3\2))\6\2\f\f\17\17))^"+
		"^\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01"+
		"\3\2\ud802\udc01\3\2\udc02\ue001\2\u0195\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3u\3\2\2\2\5x\3\2\2\2\7{\3"+
		"\2\2\2\t~\3\2\2\2\13\u0081\3\2\2\2\r\u0084\3\2\2\2\17\u0086\3\2\2\2\21"+
		"\u008b\3\2\2\2\23\u0091\3\2\2\2\25\u0097\3\2\2\2\27\u009f\3\2\2\2\31\u00a8"+
		"\3\2\2\2\33\u00ae\3\2\2\2\35\u00b3\3\2\2\2\37\u00b7\3\2\2\2!\u00bc\3\2"+
		"\2\2#\u00c1\3\2\2\2%\u00c6\3\2\2\2\'\u00c9\3\2\2\2)\u00d2\3\2\2\2+\u00d9"+
		"\3\2\2\2-\u00dc\3\2\2\2/\u00e3\3\2\2\2\61\u00ee\3\2\2\2\63\u00f1\3\2\2"+
		"\2\65\u00f4\3\2\2\2\67\u00f7\3\2\2\29\u00fa\3\2\2\2;\u00fd\3\2\2\2=\u0100"+
		"\3\2\2\2?\u0102\3\2\2\2A\u0104\3\2\2\2C\u0106\3\2\2\2E\u0108\3\2\2\2G"+
		"\u010a\3\2\2\2I\u010c\3\2\2\2K\u010e\3\2\2\2M\u0110\3\2\2\2O\u0112\3\2"+
		"\2\2Q\u0114\3\2\2\2S\u0116\3\2\2\2U\u0118\3\2\2\2W\u011a\3\2\2\2Y\u011c"+
		"\3\2\2\2[\u011e\3\2\2\2]\u0120\3\2\2\2_\u0122\3\2\2\2a\u0124\3\2\2\2c"+
		"\u0132\3\2\2\2e\u0134\3\2\2\2g\u013e\3\2\2\2i\u0159\3\2\2\2k\u016f\3\2"+
		"\2\2m\u0173\3\2\2\2o\u017f\3\2\2\2q\u0181\3\2\2\2s\u0187\3\2\2\2uv\7-"+
		"\2\2vw\7-\2\2w\4\3\2\2\2xy\7/\2\2yz\7/\2\2z\6\3\2\2\2{|\7,\2\2|}\7,\2"+
		"\2}\b\3\2\2\2~\177\7\61\2\2\177\u0080\7\61\2\2\u0080\n\3\2\2\2\u0081\u0082"+
		"\7\'\2\2\u0082\u0083\7\'\2\2\u0083\f\3\2\2\2\u0084\u0085\7<\2\2\u0085"+
		"\16\3\2\2\2\u0086\u0087\7f\2\2\u0087\u0088\7k\2\2\u0088\u0089\7u\2\2\u0089"+
		"\u008a\7j\2\2\u008a\20\3\2\2\2\u008b\u008c\7r\2\2\u008c\u008d\7n\2\2\u008d"+
		"\u008e\7c\2\2\u008e\u008f\7v\2\2\u008f\u0090\7g\2\2\u0090\22\3\2\2\2\u0091"+
		"\u0092\7r\2\2\u0092\u0093\7t\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2"+
		"\u0095\u0096\7v\2\2\u0096\24\3\2\2\2\u0097\u0098\7r\2\2\u0098\u0099\7"+
		"w\2\2\u0099\u009a\7f\2\2\u009a\u009b\7f\2\2\u009b\u009c\7k\2\2\u009c\u009d"+
		"\7p\2\2\u009d\u009e\7i\2\2\u009e\26\3\2\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7f\2\2\u00a4"+
		"\u00a5\7k\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7j\2\2\u00a7\30\3\2\2\2\u00a8"+
		"\u00a9\7y\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7g\2\2"+
		"\u00ac\u00ad\7t\2\2\u00ad\32\3\2\2\2\u00ae\u00af\7d\2\2\u00af\u00b0\7"+
		"g\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7h\2\2\u00b2\34\3\2\2\2\u00b3\u00b4"+
		"\7g\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7n\2\2\u00b6\36\3\2\2\2\u00b7\u00b8"+
		"\7t\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		" \3\2\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7m\2\2\u00c0\"\3\2\2\2\u00c1\u00c2\7y\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7p\2\2\u00c4\u00c5\7g\2\2\u00c5$\3\2\2\2\u00c6\u00c7\7v\2\2\u00c7"+
		"\u00c8\7q\2\2\u00c8&\3\2\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7q\2\2\u00cb"+
		"\u00cc\7w\2\2\u00cc\u00cd\7i\2\2\u00cd\u00ce\7j\2\2\u00ce\u00cf\7p\2\2"+
		"\u00cf\u00d0\7w\2\2\u00d0\u00d1\7v\2\2\u00d1(\3\2\2\2\u00d2\u00d3\7h\2"+
		"\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7"+
		"\7u\2\2\u00d7\u00d8\7j\2\2\u00d8*\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db"+
		"\7p\2\2\u00db,\3\2\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7v\2\2\u00de\u00df"+
		"\7c\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7x\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		".\3\2\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7i\2\2\u00e6"+
		"\u00e7\7t\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7k\2\2"+
		"\u00ea\u00eb\7g\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7v\2\2\u00ed\60\3\2"+
		"\2\2\u00ee\u00ef\7(\2\2\u00ef\u00f0\7(\2\2\u00f0\62\3\2\2\2\u00f1\u00f2"+
		"\7~\2\2\u00f2\u00f3\7~\2\2\u00f3\64\3\2\2\2\u00f4\u00f5\7?\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6\66\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8\u00f9\7?\2\2\u00f98"+
		"\3\2\2\2\u00fa\u00fb\7@\2\2\u00fb\u00fc\7?\2\2\u00fc:\3\2\2\2\u00fd\u00fe"+
		"\7>\2\2\u00fe\u00ff\7?\2\2\u00ff<\3\2\2\2\u0100\u0101\7`\2\2\u0101>\3"+
		"\2\2\2\u0102\u0103\7#\2\2\u0103@\3\2\2\2\u0104\u0105\7@\2\2\u0105B\3\2"+
		"\2\2\u0106\u0107\7>\2\2\u0107D\3\2\2\2\u0108\u0109\7,\2\2\u0109F\3\2\2"+
		"\2\u010a\u010b\7\61\2\2\u010bH\3\2\2\2\u010c\u010d\7-\2\2\u010dJ\3\2\2"+
		"\2\u010e\u010f\7/\2\2\u010fL\3\2\2\2\u0110\u0111\7\'\2\2\u0111N\3\2\2"+
		"\2\u0112\u0113\7+\2\2\u0113P\3\2\2\2\u0114\u0115\7*\2\2\u0115R\3\2\2\2"+
		"\u0116\u0117\7}\2\2\u0117T\3\2\2\2\u0118\u0119\7\177\2\2\u0119V\3\2\2"+
		"\2\u011a\u011b\7]\2\2\u011bX\3\2\2\2\u011c\u011d\7_\2\2\u011dZ\3\2\2\2"+
		"\u011e\u011f\7=\2\2\u011f\\\3\2\2\2\u0120\u0121\7?\2\2\u0121^\3\2\2\2"+
		"\u0122\u0123\7.\2\2\u0123`\3\2\2\2\u0124\u0125\7A\2\2\u0125b\3\2\2\2\u0126"+
		"\u0127\7d\2\2\u0127\u0128\7w\2\2\u0128\u0129\7v\2\2\u0129\u012a\7g\2\2"+
		"\u012a\u012b\7v\2\2\u012b\u0133\7g\2\2\u012c\u012d\7r\2\2\u012d\u012e"+
		"\7c\2\2\u012e\u012f\7n\2\2\u012f\u0130\7c\2\2\u0130\u0131\7m\2\2\u0131"+
		"\u0133\7c\2\2\u0132\u0126\3\2\2\2\u0132\u012c\3\2\2\2\u0133d\3\2\2\2\u0134"+
		"\u013c\5o8\2\u0135\u0139\7\60\2\2\u0136\u0138\5q9\2\u0137\u0136\3\2\2"+
		"\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0135\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"f\3\2\2\2\u013e\u0142\t\2\2\2\u013f\u0141\t\3\2\2\u0140\u013f\3\2\2\2"+
		"\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143h\3"+
		"\2\2\2\u0144\u0142\3\2\2\2\u0145\u014b\t\4\2\2\u0146\u014a\n\5\2\2\u0147"+
		"\u0148\7^\2\2\u0148\u014a\n\6\2\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u015a\t\4\2\2\u014f\u0155\t\7"+
		"\2\2\u0150\u0154\n\b\2\2\u0151\u0152\7^\2\2\u0152\u0154\n\6\2\2\u0153"+
		"\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u015a\t\7\2\2\u0159\u0145\3\2\2\2\u0159\u014f\3\2\2\2\u015aj\3\2\2\2"+
		"\u015b\u015c\7\61\2\2\u015c\u015d\7\61\2\2\u015d\u0161\3\2\2\2\u015e\u0160"+
		"\n\6\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0170\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7\61"+
		"\2\2\u0165\u0166\7,\2\2\u0166\u016a\3\2\2\2\u0167\u0169\13\2\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u016b\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7,\2\2\u016e"+
		"\u0170\7\61\2\2\u016f\u015b\3\2\2\2\u016f\u0164\3\2\2\2\u0170\u0171\3"+
		"\2\2\2\u0171\u0172\b\66\2\2\u0172l\3\2\2\2\u0173\u0174\t\t\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0176\b\67\2\2\u0176n\3\2\2\2\u0177\u017b\t\n\2\2\u0178"+
		"\u017a\5q9\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2"+
		"\2\u017b\u017c\3\2\2\2\u017c\u0180\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180"+
		"\7\62\2\2\u017f\u0177\3\2\2\2\u017f\u017e\3\2\2\2\u0180p\3\2\2\2\u0181"+
		"\u0182\t\13\2\2\u0182r\3\2\2\2\u0183\u0188\t\f\2\2\u0184\u0188\n\r\2\2"+
		"\u0185\u0186\t\16\2\2\u0186\u0188\t\17\2\2\u0187\u0183\3\2\2\2\u0187\u0184"+
		"\3\2\2\2\u0187\u0185\3\2\2\2\u0188t\3\2\2\2\22\2\u0132\u0139\u013c\u0142"+
		"\u0149\u014b\u0153\u0155\u0159\u0161\u016a\u016f\u017b\u017f\u0187\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}