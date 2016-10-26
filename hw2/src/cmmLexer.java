// Generated from /Users/Lucius/IdeaProjects/cmm/cmm.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, Else=2, While=3, Read=4, Write=5, Int=6, Double=7, Break=8, Ident=9, 
		IntConstant=10, RealConstant=11, BooleanConstant=12, CompOp=13, MulDivMod=14, 
		AddMin=15, LParen=16, RParen=17, LCurly=18, RCurly=19, LBracket=20, RBracket=21, 
		Assign=22, LineEnd=23, Comma=24, WS=25, SL_COMMENT=26, MUL_COMMENT=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"If", "Else", "While", "Read", "Write", "Int", "Double", "Break", "Ident", 
		"IntConstant", "RealConstant", "BooleanConstant", "CompOp", "MulDivMod", 
		"AddMin", "LParen", "RParen", "LCurly", "RCurly", "LBracket", "RBracket", 
		"Assign", "LineEnd", "Comma", "WS", "SL_COMMENT", "MUL_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'while'", "'read'", "'write'", "'int'", "'double'", 
		"'break'", null, null, null, null, null, null, null, "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "'='", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "If", "Else", "While", "Read", "Write", "Int", "Double", "Break", 
		"Ident", "IntConstant", "RealConstant", "BooleanConstant", "CompOp", "MulDivMod", 
		"AddMin", "LParen", "RParen", "LCurly", "RCurly", "LBracket", "RBracket", 
		"Assign", "LineEnd", "Comma", "WS", "SL_COMMENT", "MUL_COMMENT"
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


	public cmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00cc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\7\nf\n\n\f\n\16\ni\13\n\3\13\3\13\3\13\7\13n\n\13\f\13\16\13q\13\13"+
		"\5\13s\n\13\3\f\3\f\3\f\6\fx\n\f\r\f\16\fy\5\f|\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0087\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u0095\n\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\6\32\u00ae\n\32\r\32\16\32\u00af\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\7\33\u00b8\n\33\f\33\16\33\u00bb\13\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\7\34\u00c3\n\34\f\34\16\34\u00c6\13\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\u00c4\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\35\3\2\13\4\2C\\c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\4\2>>@@\5\2\'"+
		"\',,\61\61\4\2--//\6\2\13\f\17\17\"\"))\4\2\f\f\17\17\u00da\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5<\3\2\2\2\7A\3"+
		"\2\2\2\tG\3\2\2\2\13L\3\2\2\2\rR\3\2\2\2\17V\3\2\2\2\21]\3\2\2\2\23c\3"+
		"\2\2\2\25r\3\2\2\2\27t\3\2\2\2\31\u0086\3\2\2\2\33\u0094\3\2\2\2\35\u0096"+
		"\3\2\2\2\37\u0098\3\2\2\2!\u009a\3\2\2\2#\u009c\3\2\2\2%\u009e\3\2\2\2"+
		"\'\u00a0\3\2\2\2)\u00a2\3\2\2\2+\u00a4\3\2\2\2-\u00a6\3\2\2\2/\u00a8\3"+
		"\2\2\2\61\u00aa\3\2\2\2\63\u00ad\3\2\2\2\65\u00b3\3\2\2\2\67\u00be\3\2"+
		"\2\29:\7k\2\2:;\7h\2\2;\4\3\2\2\2<=\7g\2\2=>\7n\2\2>?\7u\2\2?@\7g\2\2"+
		"@\6\3\2\2\2AB\7y\2\2BC\7j\2\2CD\7k\2\2DE\7n\2\2EF\7g\2\2F\b\3\2\2\2GH"+
		"\7t\2\2HI\7g\2\2IJ\7c\2\2JK\7f\2\2K\n\3\2\2\2LM\7y\2\2MN\7t\2\2NO\7k\2"+
		"\2OP\7v\2\2PQ\7g\2\2Q\f\3\2\2\2RS\7k\2\2ST\7p\2\2TU\7v\2\2U\16\3\2\2\2"+
		"VW\7f\2\2WX\7q\2\2XY\7w\2\2YZ\7d\2\2Z[\7n\2\2[\\\7g\2\2\\\20\3\2\2\2]"+
		"^\7d\2\2^_\7t\2\2_`\7g\2\2`a\7c\2\2ab\7m\2\2b\22\3\2\2\2cg\t\2\2\2df\t"+
		"\3\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\24\3\2\2\2ig\3\2\2\2j"+
		"s\7\62\2\2ko\t\4\2\2ln\t\5\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2"+
		"ps\3\2\2\2qo\3\2\2\2rj\3\2\2\2rk\3\2\2\2s\26\3\2\2\2t{\5\25\13\2uw\7\60"+
		"\2\2vx\t\5\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{u\3\2"+
		"\2\2{|\3\2\2\2|\30\3\2\2\2}~\7v\2\2~\177\7t\2\2\177\u0080\7w\2\2\u0080"+
		"\u0087\7g\2\2\u0081\u0082\7h\2\2\u0082\u0083\7c\2\2\u0083\u0084\7n\2\2"+
		"\u0084\u0085\7u\2\2\u0085\u0087\7g\2\2\u0086}\3\2\2\2\u0086\u0081\3\2"+
		"\2\2\u0087\32\3\2\2\2\u0088\u0089\7>\2\2\u0089\u0095\7?\2\2\u008a\u008b"+
		"\7@\2\2\u008b\u0095\7?\2\2\u008c\u0095\t\6\2\2\u008d\u008e\7#\2\2\u008e"+
		"\u0095\7?\2\2\u008f\u0090\7?\2\2\u0090\u0095\7?\2\2\u0091\u0092\7>\2\2"+
		"\u0092\u0095\7@\2\2\u0093\u0095\3\2\2\2\u0094\u0088\3\2\2\2\u0094\u008a"+
		"\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u008f\3\2\2\2\u0094"+
		"\u0091\3\2\2\2\u0094\u0093\3\2\2\2\u0095\34\3\2\2\2\u0096\u0097\t\7\2"+
		"\2\u0097\36\3\2\2\2\u0098\u0099\t\b\2\2\u0099 \3\2\2\2\u009a\u009b\7*"+
		"\2\2\u009b\"\3\2\2\2\u009c\u009d\7+\2\2\u009d$\3\2\2\2\u009e\u009f\7}"+
		"\2\2\u009f&\3\2\2\2\u00a0\u00a1\7\177\2\2\u00a1(\3\2\2\2\u00a2\u00a3\7"+
		"]\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7_\2\2\u00a5,\3\2\2\2\u00a6\u00a7\7?"+
		"\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7=\2\2\u00a9\60\3\2\2\2\u00aa\u00ab\7"+
		".\2\2\u00ab\62\3\2\2\2\u00ac\u00ae\t\t\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\b\32\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\7\61\2\2\u00b4\u00b5\7\61"+
		"\2\2\u00b5\u00b9\3\2\2\2\u00b6\u00b8\n\n\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\b\33\2\2\u00bd\66\3\2\2\2\u00be\u00bf"+
		"\7\61\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c3\13\2\2\2"+
		"\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7,\2\2\u00c8"+
		"\u00c9\7\61\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\34\2\2\u00cb8\3\2\2"+
		"\2\16\2egory{\u0086\u0094\u00af\u00b9\u00c4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}