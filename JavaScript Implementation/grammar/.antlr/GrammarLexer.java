// Generated from c:\Users\rheij\Desktop\Compiler\grammar\Grammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CONST", "CONTINUE", 
		"DEFAULT", "DO", "DOUBLE", "ELSE", "FINAL", "FINALLY", "FLOAT", "FOR", 
		"IF", "GOTO", "INT", "LONG", "NATIVE", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SWITCH", "SYNCHRONIZED", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", 
		"VOLATILE", "WHILE", "PRINT", "SCAN", "DECIMAL_LITERAL", "HEX_LITERAL", 
		"OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
		"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
		"BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", 
		"WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER", "ERROR_STRING_LITERAL", 
		"ExponentPart", "EscapeSequence", "HexDigits", "HexDigit", "Digits", "LetterOrDigit", 
		"Letter"
	};

	private static final String[] _LITERAL_NAMES = {
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
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CONST", "CONTINUE", 
		"DEFAULT", "DO", "DOUBLE", "ELSE", "FINAL", "FINALLY", "FLOAT", "FOR", 
		"IF", "GOTO", "INT", "LONG", "NATIVE", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SWITCH", "SYNCHRONIZED", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", 
		"VOLATILE", "WHILE", "PRINT", "SCAN", "DECIMAL_LITERAL", "HEX_LITERAL", 
		"OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
		"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
		"BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", 
		"WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER", "ERROR_STRING_LITERAL"
	};
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2d\u033d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&"+
		"\5&\u01c5\n&\3&\6&\u01c8\n&\r&\16&\u01c9\3&\5&\u01cd\n&\5&\u01cf\n&\3"+
		"&\5&\u01d2\n&\3\'\3\'\3\'\3\'\7\'\u01d8\n\'\f\'\16\'\u01db\13\'\3\'\5"+
		"\'\u01de\n\'\3\'\5\'\u01e1\n\'\3(\3(\7(\u01e5\n(\f(\16(\u01e8\13(\3(\3"+
		"(\7(\u01ec\n(\f(\16(\u01ef\13(\3(\5(\u01f2\n(\3(\5(\u01f5\n(\3)\3)\3)"+
		"\3)\7)\u01fb\n)\f)\16)\u01fe\13)\3)\5)\u0201\n)\3)\5)\u0204\n)\3*\3*\3"+
		"*\5*\u0209\n*\3*\3*\5*\u020d\n*\3*\5*\u0210\n*\3*\5*\u0213\n*\3*\3*\3"+
		"*\5*\u0218\n*\3*\5*\u021b\n*\5*\u021d\n*\3+\3+\3+\3+\5+\u0223\n+\3+\5"+
		"+\u0226\n+\3+\3+\5+\u022a\n+\3+\3+\5+\u022e\n+\3+\3+\5+\u0232\n+\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0240\n,\3-\3-\3-\5-\u0245\n-\3-\3"+
		"-\3.\3.\3.\7.\u024c\n.\f.\16.\u024f\13.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3A\3A\3A\3B"+
		"\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3I\3I\3J\3J"+
		"\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3T"+
		"\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z"+
		"\3Z\3[\3[\3[\3\\\3\\\3\\\3]\3]\3^\3^\3^\3^\3_\6_\u02d2\n_\r_\16_\u02d3"+
		"\3_\3_\3`\3`\3`\3`\7`\u02dc\n`\f`\16`\u02df\13`\3`\3`\3`\3`\3`\3a\3a\3"+
		"a\3a\7a\u02ea\na\fa\16a\u02ed\13a\3a\3a\3b\3b\7b\u02f3\nb\fb\16b\u02f6"+
		"\13b\3c\3c\3c\3c\3c\3c\5c\u02fe\nc\3d\3d\5d\u0302\nd\3d\3d\3e\3e\3e\3"+
		"e\5e\u030a\ne\3e\5e\u030d\ne\3e\3e\3e\6e\u0312\ne\re\16e\u0313\3e\3e\3"+
		"e\3e\3e\5e\u031b\ne\3f\3f\3f\7f\u0320\nf\ff\16f\u0323\13f\3f\5f\u0326"+
		"\nf\3g\3g\3h\3h\7h\u032c\nh\fh\16h\u032f\13h\3h\5h\u0332\nh\3i\3i\5i\u0336"+
		"\ni\3j\3j\3j\3j\5j\u033c\nj\3\u02dd\2k\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00ab"+
		"W\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bf"+
		"a\u00c1b\u00c3c\u00c5d\u00c7\2\u00c9\2\u00cb\2\u00cd\2\u00cf\2\u00d1\2"+
		"\u00d3\2\3\2\34\3\2\63;\4\2NNnn\4\2ZZzz\5\2\62;CHch\6\2\62;CHaach\3\2"+
		"\629\4\2\629aa\4\2DDdd\3\2\62\63\4\2\62\63aa\6\2FFHHffhh\4\2RRrr\4\2-"+
		"-//\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17"+
		"\17\4\2GGgg\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\62;\4\2\62;aa\6\2&&C\\a"+
		"ac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\2\u0368\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\3\u00d5\3\2\2\2\5\u00dc\3\2\2\2\7\u00e3\3\2\2\2\t\u00e8"+
		"\3\2\2\2\13\u00f1\3\2\2\2\r\u00f9\3\2\2\2\17\u0103\3\2\2\2\21\u0109\3"+
		"\2\2\2\23\u0111\3\2\2\2\25\u0117\3\2\2\2\27\u011d\3\2\2\2\31\u0123\3\2"+
		"\2\2\33\u0127\3\2\2\2\35\u012f\3\2\2\2\37\u0135\3\2\2\2!\u013b\3\2\2\2"+
		"#\u0140\3\2\2\2%\u0145\3\2\2\2\'\u014a\3\2\2\2)\u014f\3\2\2\2+\u015a\3"+
		"\2\2\2-\u0163\3\2\2\2/\u0168\3\2\2\2\61\u0172\3\2\2\2\63\u0178\3\2\2\2"+
		"\65\u017f\3\2\2\2\67\u0185\3\2\2\29\u018a\3\2\2\2;\u0190\3\2\2\2=\u0197"+
		"\3\2\2\2?\u019f\3\2\2\2A\u01a3\3\2\2\2C\u01a8\3\2\2\2E\u01b1\3\2\2\2G"+
		"\u01b6\3\2\2\2I\u01bc\3\2\2\2K\u01ce\3\2\2\2M\u01d3\3\2\2\2O\u01e2\3\2"+
		"\2\2Q\u01f6\3\2\2\2S\u021c\3\2\2\2U\u021e\3\2\2\2W\u023f\3\2\2\2Y\u0241"+
		"\3\2\2\2[\u0248\3\2\2\2]\u0252\3\2\2\2_\u0257\3\2\2\2a\u0259\3\2\2\2c"+
		"\u025b\3\2\2\2e\u025d\3\2\2\2g\u025f\3\2\2\2i\u0261\3\2\2\2k\u0263\3\2"+
		"\2\2m\u0265\3\2\2\2o\u0267\3\2\2\2q\u0269\3\2\2\2s\u026b\3\2\2\2u\u026d"+
		"\3\2\2\2w\u026f\3\2\2\2y\u0271\3\2\2\2{\u0273\3\2\2\2}\u0275\3\2\2\2\177"+
		"\u0277\3\2\2\2\u0081\u027a\3\2\2\2\u0083\u027d\3\2\2\2\u0085\u0280\3\2"+
		"\2\2\u0087\u0283\3\2\2\2\u0089\u0286\3\2\2\2\u008b\u0289\3\2\2\2\u008d"+
		"\u028c\3\2\2\2\u008f\u028f\3\2\2\2\u0091\u0291\3\2\2\2\u0093\u0293\3\2"+
		"\2\2\u0095\u0295\3\2\2\2\u0097\u0297\3\2\2\2\u0099\u0299\3\2\2\2\u009b"+
		"\u029b\3\2\2\2\u009d\u029d\3\2\2\2\u009f\u029f\3\2\2\2\u00a1\u02a2\3\2"+
		"\2\2\u00a3\u02a5\3\2\2\2\u00a5\u02a8\3\2\2\2\u00a7\u02ab\3\2\2\2\u00a9"+
		"\u02ae\3\2\2\2\u00ab\u02b1\3\2\2\2\u00ad\u02b4\3\2\2\2\u00af\u02b7\3\2"+
		"\2\2\u00b1\u02bb\3\2\2\2\u00b3\u02bf\3\2\2\2\u00b5\u02c4\3\2\2\2\u00b7"+
		"\u02c7\3\2\2\2\u00b9\u02ca\3\2\2\2\u00bb\u02cc\3\2\2\2\u00bd\u02d1\3\2"+
		"\2\2\u00bf\u02d7\3\2\2\2\u00c1\u02e5\3\2\2\2\u00c3\u02f0\3\2\2\2\u00c5"+
		"\u02fd\3\2\2\2\u00c7\u02ff\3\2\2\2\u00c9\u031a\3\2\2\2\u00cb\u031c\3\2"+
		"\2\2\u00cd\u0327\3\2\2\2\u00cf\u0329\3\2\2\2\u00d1\u0335\3\2\2\2\u00d3"+
		"\u033b\3\2\2\2\u00d5\u00d6\7d\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7n\2"+
		"\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7q\2\2\u00db\4\3"+
		"\2\2\2\u00dc\u00dd\7m\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7v\2\2\u00df"+
		"\u00e0\7m\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7v\2\2\u00e2\6\3\2\2\2\u00e3"+
		"\u00e4\7d\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7g\2\2"+
		"\u00e7\b\3\2\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7u"+
		"\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef"+
		"\7n\2\2\u00ef\u00f0\7c\2\2\u00f0\n\3\2\2\2\u00f1\u00f2\7m\2\2\u00f2\u00f3"+
		"\7g\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7j\2\2\u00f6"+
		"\u00f7\7w\2\2\u00f7\u00f8\7r\2\2\u00f8\f\3\2\2\2\u00f9\u00fa\7e\2\2\u00fa"+
		"\u00fb\7j\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7e\2\2\u00fd\u00fe\7j\2\2"+
		"\u00fe\u00ff\7c\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7q\2\2\u0101\u0102"+
		"\7p\2\2\u0102\16\3\2\2\2\u0103\u0104\7v\2\2\u0104\u0105\7w\2\2\u0105\u0106"+
		"\7d\2\2\u0106\u0107\7k\2\2\u0107\u0108\7i\2\2\u0108\20\3\2\2\2\u0109\u010a"+
		"\7e\2\2\u010a\u010b\7q\2\2\u010b\u010c\7e\2\2\u010c\u010d\7q\2\2\u010d"+
		"\u010e\7p\2\2\u010e\u010f\7w\2\2\u010f\u0110\7v\2\2\u0110\22\3\2\2\2\u0111"+
		"\u0112\7r\2\2\u0112\u0113\7n\2\2\u0113\u0114\7c\2\2\u0114\u0115\7k\2\2"+
		"\u0115\u0116\7p\2\2\u0116\24\3\2\2\2\u0117\u0118\7f\2\2\u0118\u0119\7"+
		"q\2\2\u0119\u011a\7p\2\2\u011a\u011b\7w\2\2\u011b\u011c\7v\2\2\u011c\26"+
		"\3\2\2\2\u011d\u011e\7c\2\2\u011e\u011f\7f\2\2\u011f\u0120\7q\2\2\u0120"+
		"\u0121\7d\2\2\u0121\u0122\7q\2\2\u0122\30\3\2\2\2\u0123\u0124\7g\2\2\u0124"+
		"\u0125\7g\2\2\u0125\u0126\7n\2\2\u0126\32\3\2\2\2\u0127\u0128\7i\2\2\u0128"+
		"\u0129\7c\2\2\u0129\u012a\7t\2\2\u012a\u012b\7p\2\2\u012b\u012c\7k\2\2"+
		"\u012c\u012d\7u\2\2\u012d\u012e\7j\2\2\u012e\34\3\2\2\2\u012f\u0130\7"+
		"u\2\2\u0130\u0131\7g\2\2\u0131\u0132\7t\2\2\u0132\u0133\7x\2\2\u0133\u0134"+
		"\7g\2\2\u0134\36\3\2\2\2\u0135\u0136\7o\2\2\u0136\u0137\7c\2\2\u0137\u0138"+
		"\7p\2\2\u0138\u0139\7i\2\2\u0139\u013a\7q\2\2\u013a \3\2\2\2\u013b\u013c"+
		"\7r\2\2\u013c\u013d\7q\2\2\u013d\u013e\7t\2\2\u013e\u013f\7m\2\2\u013f"+
		"\"\3\2\2\2\u0140\u0141\7d\2\2\u0141\u0142\7g\2\2\u0142\u0143\7g\2\2\u0143"+
		"\u0144\7h\2\2\u0144$\3\2\2\2\u0145\u0146\7i\2\2\u0146\u0147\7q\2\2\u0147"+
		"\u0148\7v\2\2\u0148\u0149\7q\2\2\u0149&\3\2\2\2\u014a\u014b\7r\2\2\u014b"+
		"\u014c\7k\2\2\u014c\u014d\7p\2\2\u014d\u014e\7v\2\2\u014e(\3\2\2\2\u014f"+
		"\u0150\7n\2\2\u0150\u0151\7q\2\2\u0151\u0152\7p\2\2\u0152\u0153\7i\2\2"+
		"\u0153\u0154\7i\2\2\u0154\u0155\7c\2\2\u0155\u0156\7p\2\2\u0156\u0157"+
		"\7k\2\2\u0157\u0158\7u\2\2\u0158\u0159\7c\2\2\u0159*\3\2\2\2\u015a\u015b"+
		"\7m\2\2\u015b\u015c\7c\2\2\u015c\u015d\7p\2\2\u015d\u015e\7i\2\2\u015e"+
		"\u015f\7m\2\2\u015f\u0160\7q\2\2\u0160\u0161\7p\2\2\u0161\u0162\7i\2\2"+
		"\u0162,\3\2\2\2\u0163\u0164\7t\2\2\u0164\u0165\7k\2\2\u0165\u0166\7e\2"+
		"\2\u0166\u0167\7g\2\2\u0167.\3\2\2\2\u0168\u0169\7u\2\2\u0169\u016a\7"+
		"j\2\2\u016a\u016b\7q\2\2\u016b\u016c\7t\2\2\u016c\u016d\7v\2\2\u016d\u016e"+
		"\7e\2\2\u016e\u016f\7c\2\2\u016f\u0170\7m\2\2\u0170\u0171\7g\2\2\u0171"+
		"\60\3\2\2\2\u0172\u0173\7u\2\2\u0173\u0174\7v\2\2\u0174\u0175\7q\2\2\u0175"+
		"\u0176\7x\2\2\u0176\u0177\7g\2\2\u0177\62\3\2\2\2\u0178\u0179\7d\2\2\u0179"+
		"\u017a\7c\2\2\u017a\u017b\7m\2\2\u017b\u017c\7k\2\2\u017c\u017d\7p\2\2"+
		"\u017d\u017e\7i\2\2\u017e\64\3\2\2\2\u017f\u0180\7u\2\2\u0180\u0181\7"+
		"w\2\2\u0181\u0182\7i\2\2\u0182\u0183\7c\2\2\u0183\u0184\7t\2\2\u0184\66"+
		"\3\2\2\2\u0185\u0186\7u\2\2\u0186\u0187\7v\2\2\u0187\u0188\7k\2\2\u0188"+
		"\u0189\7t\2\2\u01898\3\2\2\2\u018a\u018b\7v\2\2\u018b\u018c\7w\2\2\u018c"+
		"\u018d\7t\2\2\u018d\u018e\7q\2\2\u018e\u018f\7p\2\2\u018f:\3\2\2\2\u0190"+
		"\u0191\7v\2\2\u0191\u0192\7w\2\2\u0192\u0193\7t\2\2\u0193\u0194\7q\2\2"+
		"\u0194\u0195\7p\2\2\u0195\u0196\7u\2\2\u0196<\3\2\2\2\u0197\u0198\7v\2"+
		"\2\u0198\u0199\7t\2\2\u0199\u019a\7w\2\2\u019a\u019b\7h\2\2\u019b\u019c"+
		"\7h\2\2\u019c\u019d\7n\2\2\u019d\u019e\7g\2\2\u019e>\3\2\2\2\u019f\u01a0"+
		"\7h\2\2\u01a0\u01a1\7t\2\2\u01a1\u01a2\7{\2\2\u01a2@\3\2\2\2\u01a3\u01a4"+
		"\7d\2\2\u01a4\u01a5\7q\2\2\u01a5\u01a6\7k\2\2\u01a6\u01a7\7n\2\2\u01a7"+
		"B\3\2\2\2\u01a8\u01a9\7d\2\2\u01a9\u01aa\7q\2\2\u01aa\u01ab\7n\2\2\u01ab"+
		"\u01ac\7c\2\2\u01ac\u01ad\7d\2\2\u01ad\u01ae\7q\2\2\u01ae\u01af\7n\2\2"+
		"\u01af\u01b0\7c\2\2\u01b0D\3\2\2\2\u01b1\u01b2\7y\2\2\u01b2\u01b3\7k\2"+
		"\2\u01b3\u01b4\7p\2\2\u01b4\u01b5\7g\2\2\u01b5F\3\2\2\2\u01b6\u01b7\7"+
		"r\2\2\u01b7\u01b8\7n\2\2\u01b8\u01b9\7c\2\2\u01b9\u01ba\7v\2\2\u01ba\u01bb"+
		"\7g\2\2\u01bbH\3\2\2\2\u01bc\u01bd\7u\2\2\u01bd\u01be\7j\2\2\u01be\u01bf"+
		"\7q\2\2\u01bf\u01c0\7r\2\2\u01c0J\3\2\2\2\u01c1\u01cf\7\62\2\2\u01c2\u01cc"+
		"\t\2\2\2\u01c3\u01c5\5\u00cfh\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2"+
		"\2\u01c5\u01cd\3\2\2\2\u01c6\u01c8\7a\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01cd\5\u00cfh\2\u01cc\u01c4\3\2\2\2\u01cc\u01c7\3\2\2\2\u01cd\u01cf"+
		"\3\2\2\2\u01ce\u01c1\3\2\2\2\u01ce\u01c2\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0"+
		"\u01d2\t\3\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2L\3\2\2\2"+
		"\u01d3\u01d4\7\62\2\2\u01d4\u01d5\t\4\2\2\u01d5\u01dd\t\5\2\2\u01d6\u01d8"+
		"\t\6\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\t\5"+
		"\2\2\u01dd\u01d9\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df"+
		"\u01e1\t\3\2\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1N\3\2\2\2"+
		"\u01e2\u01e6\7\62\2\2\u01e3\u01e5\7a\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8"+
		"\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8"+
		"\u01e6\3\2\2\2\u01e9\u01f1\t\7\2\2\u01ea\u01ec\t\b\2\2\u01eb\u01ea\3\2"+
		"\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f2\t\7\2\2\u01f1\u01ed\3\2"+
		"\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f5\t\3\2\2\u01f4"+
		"\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5P\3\2\2\2\u01f6\u01f7\7\62\2\2"+
		"\u01f7\u01f8\t\t\2\2\u01f8\u0200\t\n\2\2\u01f9\u01fb\t\13\2\2\u01fa\u01f9"+
		"\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0201\t\n\2\2\u0200\u01fc\3\2"+
		"\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0204\t\3\2\2\u0203"+
		"\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204R\3\2\2\2\u0205\u0206\5\u00cf"+
		"h\2\u0206\u0208\7\60\2\2\u0207\u0209\5\u00cfh\2\u0208\u0207\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020d\3\2\2\2\u020a\u020b\7\60\2\2\u020b\u020d\5"+
		"\u00cfh\2\u020c\u0205\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020f\3\2\2\2"+
		"\u020e\u0210\5\u00c7d\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0212\3\2\2\2\u0211\u0213\t\f\2\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u021d\3\2\2\2\u0214\u021a\5\u00cfh\2\u0215\u0217\5\u00c7d\2"+
		"\u0216\u0218\t\f\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021b"+
		"\3\2\2\2\u0219\u021b\t\f\2\2\u021a\u0215\3\2\2\2\u021a\u0219\3\2\2\2\u021b"+
		"\u021d\3\2\2\2\u021c\u020c\3\2\2\2\u021c\u0214\3\2\2\2\u021dT\3\2\2\2"+
		"\u021e\u021f\7\62\2\2\u021f\u0229\t\4\2\2\u0220\u0222\5\u00cbf\2\u0221"+
		"\u0223\7\60\2\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u022a\3"+
		"\2\2\2\u0224\u0226\5\u00cbf\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2"+
		"\u0226\u0227\3\2\2\2\u0227\u0228\7\60\2\2\u0228\u022a\5\u00cbf\2\u0229"+
		"\u0220\3\2\2\2\u0229\u0225\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\t\r"+
		"\2\2\u022c\u022e\t\16\2\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0231\5\u00cfh\2\u0230\u0232\t\f\2\2\u0231\u0230"+
		"\3\2\2\2\u0231\u0232\3\2\2\2\u0232V\3\2\2\2\u0233\u0234\7d\2\2\u0234\u0235"+
		"\7w\2\2\u0235\u0236\7v\2\2\u0236\u0237\7g\2\2\u0237\u0238\7v\2\2\u0238"+
		"\u0240\7g\2\2\u0239\u023a\7r\2\2\u023a\u023b\7c\2\2\u023b\u023c\7n\2\2"+
		"\u023c\u023d\7c\2\2\u023d\u023e\7m\2\2\u023e\u0240\7c\2\2\u023f\u0233"+
		"\3\2\2\2\u023f\u0239\3\2\2\2\u0240X\3\2\2\2\u0241\u0244\7)\2\2\u0242\u0245"+
		"\n\17\2\2\u0243\u0245\5\u00c9e\2\u0244\u0242\3\2\2\2\u0244\u0243\3\2\2"+
		"\2\u0245\u0246\3\2\2\2\u0246\u0247\7)\2\2\u0247Z\3\2\2\2\u0248\u024d\7"+
		"$\2\2\u0249\u024c\n\20\2\2\u024a\u024c\5\u00c9e\2\u024b\u0249\3\2\2\2"+
		"\u024b\u024a\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e"+
		"\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0251\7$\2\2\u0251"+
		"\\\3\2\2\2\u0252\u0253\7p\2\2\u0253\u0254\7w\2\2\u0254\u0255\7n\2\2\u0255"+
		"\u0256\7n\2\2\u0256^\3\2\2\2\u0257\u0258\7*\2\2\u0258`\3\2\2\2\u0259\u025a"+
		"\7+\2\2\u025ab\3\2\2\2\u025b\u025c\7}\2\2\u025cd\3\2\2\2\u025d\u025e\7"+
		"\177\2\2\u025ef\3\2\2\2\u025f\u0260\7]\2\2\u0260h\3\2\2\2\u0261\u0262"+
		"\7_\2\2\u0262j\3\2\2\2\u0263\u0264\7=\2\2\u0264l\3\2\2\2\u0265\u0266\7"+
		".\2\2\u0266n\3\2\2\2\u0267\u0268\7\60\2\2\u0268p\3\2\2\2\u0269\u026a\7"+
		"?\2\2\u026ar\3\2\2\2\u026b\u026c\7@\2\2\u026ct\3\2\2\2\u026d\u026e\7>"+
		"\2\2\u026ev\3\2\2\2\u026f\u0270\7#\2\2\u0270x\3\2\2\2\u0271\u0272\7\u0080"+
		"\2\2\u0272z\3\2\2\2\u0273\u0274\7A\2\2\u0274|\3\2\2\2\u0275\u0276\7<\2"+
		"\2\u0276~\3\2\2\2\u0277\u0278\7?\2\2\u0278\u0279\7?\2\2\u0279\u0080\3"+
		"\2\2\2\u027a\u027b\7>\2\2\u027b\u027c\7?\2\2\u027c\u0082\3\2\2\2\u027d"+
		"\u027e\7@\2\2\u027e\u027f\7?\2\2\u027f\u0084\3\2\2\2\u0280\u0281\7#\2"+
		"\2\u0281\u0282\7?\2\2\u0282\u0086\3\2\2\2\u0283\u0284\7(\2\2\u0284\u0285"+
		"\7(\2\2\u0285\u0088\3\2\2\2\u0286\u0287\7~\2\2\u0287\u0288\7~\2\2\u0288"+
		"\u008a\3\2\2\2\u0289\u028a\7-\2\2\u028a\u028b\7-\2\2\u028b\u008c\3\2\2"+
		"\2\u028c\u028d\7/\2\2\u028d\u028e\7/\2\2\u028e\u008e\3\2\2\2\u028f\u0290"+
		"\7-\2\2\u0290\u0090\3\2\2\2\u0291\u0292\7/\2\2\u0292\u0092\3\2\2\2\u0293"+
		"\u0294\7,\2\2\u0294\u0094\3\2\2\2\u0295\u0296\7\61\2\2\u0296\u0096\3\2"+
		"\2\2\u0297\u0298\7(\2\2\u0298\u0098\3\2\2\2\u0299\u029a\7~\2\2\u029a\u009a"+
		"\3\2\2\2\u029b\u029c\7`\2\2\u029c\u009c\3\2\2\2\u029d\u029e\7\'\2\2\u029e"+
		"\u009e\3\2\2\2\u029f\u02a0\7-\2\2\u02a0\u02a1\7?\2\2\u02a1\u00a0\3\2\2"+
		"\2\u02a2\u02a3\7/\2\2\u02a3\u02a4\7?\2\2\u02a4\u00a2\3\2\2\2\u02a5\u02a6"+
		"\7,\2\2\u02a6\u02a7\7?\2\2\u02a7\u00a4\3\2\2\2\u02a8\u02a9\7\61\2\2\u02a9"+
		"\u02aa\7?\2\2\u02aa\u00a6\3\2\2\2\u02ab\u02ac\7(\2\2\u02ac\u02ad\7?\2"+
		"\2\u02ad\u00a8\3\2\2\2\u02ae\u02af\7~\2\2\u02af\u02b0\7?\2\2\u02b0\u00aa"+
		"\3\2\2\2\u02b1\u02b2\7`\2\2\u02b2\u02b3\7?\2\2\u02b3\u00ac\3\2\2\2\u02b4"+
		"\u02b5\7\'\2\2\u02b5\u02b6\7?\2\2\u02b6\u00ae\3\2\2\2\u02b7\u02b8\7>\2"+
		"\2\u02b8\u02b9\7>\2\2\u02b9\u02ba\7?\2\2\u02ba\u00b0\3\2\2\2\u02bb\u02bc"+
		"\7@\2\2\u02bc\u02bd\7@\2\2\u02bd\u02be\7?\2\2\u02be\u00b2\3\2\2\2\u02bf"+
		"\u02c0\7@\2\2\u02c0\u02c1\7@\2\2\u02c1\u02c2\7@\2\2\u02c2\u02c3\7?\2\2"+
		"\u02c3\u00b4\3\2\2\2\u02c4\u02c5\7/\2\2\u02c5\u02c6\7@\2\2\u02c6\u00b6"+
		"\3\2\2\2\u02c7\u02c8\7<\2\2\u02c8\u02c9\7<\2\2\u02c9\u00b8\3\2\2\2\u02ca"+
		"\u02cb\7B\2\2\u02cb\u00ba\3\2\2\2\u02cc\u02cd\7\60\2\2\u02cd\u02ce\7\60"+
		"\2\2\u02ce\u02cf\7\60\2\2\u02cf\u00bc\3\2\2\2\u02d0\u02d2\t\21\2\2\u02d1"+
		"\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2"+
		"\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\b_\2\2\u02d6\u00be\3\2\2\2\u02d7"+
		"\u02d8\7\61\2\2\u02d8\u02d9\7,\2\2\u02d9\u02dd\3\2\2\2\u02da\u02dc\13"+
		"\2\2\2\u02db\u02da\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02de\3\2\2\2\u02dd"+
		"\u02db\3\2\2\2\u02de\u02e0\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e1\7,"+
		"\2\2\u02e1\u02e2\7\61\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\b`\2\2\u02e4"+
		"\u00c0\3\2\2\2\u02e5\u02e6\7\61\2\2\u02e6\u02e7\7\61\2\2\u02e7\u02eb\3"+
		"\2\2\2\u02e8\u02ea\n\22\2\2\u02e9\u02e8\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb"+
		"\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02eb\3\2"+
		"\2\2\u02ee\u02ef\ba\2\2\u02ef\u00c2\3\2\2\2\u02f0\u02f4\5\u00d3j\2\u02f1"+
		"\u02f3\5\u00d1i\2\u02f2\u02f1\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u00c4\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7"+
		"\u02fe\5\u00c9e\2\u02f8\u02f9\7$\2\2\u02f9\u02fe\5\u00c9e\2\u02fa\u02fb"+
		"\5\u00c9e\2\u02fb\u02fc\7$\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02f7\3\2\2\2"+
		"\u02fd\u02f8\3\2\2\2\u02fd\u02fa\3\2\2\2\u02fe\u00c6\3\2\2\2\u02ff\u0301"+
		"\t\23\2\2\u0300\u0302\t\16\2\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2"+
		"\u0302\u0303\3\2\2\2\u0303\u0304\5\u00cfh\2\u0304\u00c8\3\2\2\2\u0305"+
		"\u0306\7^\2\2\u0306\u031b\t\24\2\2\u0307\u030c\7^\2\2\u0308\u030a\t\25"+
		"\2\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b"+
		"\u030d\t\7\2\2\u030c\u0309\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030e\u031b\t\7\2\2\u030f\u0311\7^\2\2\u0310\u0312\7w\2\2\u0311\u0310"+
		"\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u0316\5\u00cdg\2\u0316\u0317\5\u00cdg\2\u0317\u0318"+
		"\5\u00cdg\2\u0318\u0319\5\u00cdg\2\u0319\u031b\3\2\2\2\u031a\u0305\3\2"+
		"\2\2\u031a\u0307\3\2\2\2\u031a\u030f\3\2\2\2\u031b\u00ca\3\2\2\2\u031c"+
		"\u0325\5\u00cdg\2\u031d\u0320\5\u00cdg\2\u031e\u0320\7a\2\2\u031f\u031d"+
		"\3\2\2\2\u031f\u031e\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321"+
		"\u0322\3\2\2\2\u0322\u0324\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0326\5\u00cd"+
		"g\2\u0325\u0321\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u00cc\3\2\2\2\u0327"+
		"\u0328\t\5\2\2\u0328\u00ce\3\2\2\2\u0329\u0331\t\26\2\2\u032a\u032c\t"+
		"\27\2\2\u032b\u032a\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d"+
		"\u032e\3\2\2\2\u032e\u0330\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0332\t\26"+
		"\2\2\u0331\u032d\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u00d0\3\2\2\2\u0333"+
		"\u0336\5\u00d3j\2\u0334\u0336\t\26\2\2\u0335\u0333\3\2\2\2\u0335\u0334"+
		"\3\2\2\2\u0336\u00d2\3\2\2\2\u0337\u033c\t\30\2\2\u0338\u033c\n\31\2\2"+
		"\u0339\u033a\t\32\2\2\u033a\u033c\t\33\2\2\u033b\u0337\3\2\2\2\u033b\u0338"+
		"\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u00d4\3\2\2\2\63\2\u01c4\u01c9\u01cc"+
		"\u01ce\u01d1\u01d9\u01dd\u01e0\u01e6\u01ed\u01f1\u01f4\u01fc\u0200\u0203"+
		"\u0208\u020c\u020f\u0212\u0217\u021a\u021c\u0222\u0225\u0229\u022d\u0231"+
		"\u023f\u0244\u024b\u024d\u02d3\u02dd\u02eb\u02f4\u02fd\u0301\u0309\u030c"+
		"\u0313\u031a\u031f\u0321\u0325\u032d\u0331\u0335\u033b\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}