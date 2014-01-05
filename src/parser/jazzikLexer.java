// Generated from jazzik.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jazzikLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, STRING=2, BOOL=3, ASSIGN=4, COMMA=5, COLON=6, QMARK=7, INC=8, DEC=9, 
		MUL=10, DIV=11, ADD=12, SUB=13, MOD=14, IAND=15, IOR=16, IXOR=17, NEG=18, 
		AND=19, OR=20, EQ=21, NEQ=22, GT=23, LT=24, GTE=25, LTE=26, ARRAY_TYPE=27, 
		INT_TYPE=28, BOOL_TYPE=29, VOID_TYPE=30, SIZE=31, IF=32, UNLESS=33, ELSE=34, 
		FOR=35, IN=36, WHILE=37, EXTERN=38, READ=39, WRITE=40, RETURN=41, BREAK=42, 
		CONTINUE=43, ID=44, BLOCK_BEGIN=45, BLOCK_END=46, PAREN_BEGIN=47, PAREN_END=48, 
		ARRAY_BEGIN=49, ARRAY_END=50, INC_RANGE=51, EXC_RANGE=52, NEWLINE=53, 
		WHITESPACE=54;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"INT", "STRING", "BOOL", "'='", "','", "':'", "'?'", "'++'", "'--'", "'*'", 
		"'/'", "'+'", "'-'", "'%'", "'&'", "'|'", "'^'", "'!'", "'&&'", "'||'", 
		"'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'int[]'", "'int'", "'bool'", 
		"'void'", "'size'", "'if'", "'unless'", "'else'", "'for'", "'in'", "'while'", 
		"'extern'", "'read'", "'write'", "'return'", "'break'", "'continue'", 
		"ID", "'{'", "'}'", "'('", "')'", "'['", "']'", "'..'", "'...'", "NEWLINE", 
		"WHITESPACE"
	};
	public static final String[] ruleNames = {
		"INT", "STRING", "BOOL", "ASSIGN", "COMMA", "COLON", "QMARK", "INC", "DEC", 
		"MUL", "DIV", "ADD", "SUB", "MOD", "IAND", "IOR", "IXOR", "NEG", "AND", 
		"OR", "EQ", "NEQ", "GT", "LT", "GTE", "LTE", "ARRAY_TYPE", "INT_TYPE", 
		"BOOL_TYPE", "VOID_TYPE", "SIZE", "IF", "UNLESS", "ELSE", "FOR", "IN", 
		"WHILE", "EXTERN", "READ", "WRITE", "RETURN", "BREAK", "CONTINUE", "ID", 
		"BLOCK_BEGIN", "BLOCK_END", "PAREN_BEGIN", "PAREN_END", "ARRAY_BEGIN", 
		"ARRAY_END", "INC_RANGE", "EXC_RANGE", "NEWLINE", "WHITESPACE"
	};


	    public boolean failed = false;
	        public int errcount = 0;

	    @Override
	    public void recover(RecognitionException e) {
	        failed = true;
	                ++errcount;
	                super.recover(e);
	      }

	        @Override
	    public void recover(LexerNoViableAltException e) {
	        failed = true;
	                ++errcount;
	                super.recover(e);
	        }


	public jazzikLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "jazzik.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 53: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\28\u013e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\6\2q\n\2\r\2\16\2r\3\3\3\3\7\3w"+
		"\n\3\f\3\16\3z\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0087"+
		"\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#"+
		"\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\7-\u011e\n-\f-\16-\u0121\13-\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\3\66\5\66\u0137\n\66\3\66\3\66\3\67\3\67\3\67\3\67\28\3"+
		"\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r"+
		"\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\""+
		"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62"+
		"\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\2\3\2\7\3\2\62;\5\2\f\f\17\17$$\4\2"+
		"C\\c|\6\2\62;C\\aac|\4\2\13\13\"\"\u0142\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3p\3\2\2\2\5t\3\2\2\2\7\u0086"+
		"\3\2\2\2\t\u0088\3\2\2\2\13\u008a\3\2\2\2\r\u008c\3\2\2\2\17\u008e\3\2"+
		"\2\2\21\u0090\3\2\2\2\23\u0093\3\2\2\2\25\u0096\3\2\2\2\27\u0098\3\2\2"+
		"\2\31\u009a\3\2\2\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37\u00a0\3\2\2\2"+
		"!\u00a2\3\2\2\2#\u00a4\3\2\2\2%\u00a6\3\2\2\2\'\u00a8\3\2\2\2)\u00ab\3"+
		"\2\2\2+\u00ae\3\2\2\2-\u00b1\3\2\2\2/\u00b4\3\2\2\2\61\u00b6\3\2\2\2\63"+
		"\u00b8\3\2\2\2\65\u00bb\3\2\2\2\67\u00be\3\2\2\29\u00c4\3\2\2\2;\u00c8"+
		"\3\2\2\2=\u00cd\3\2\2\2?\u00d2\3\2\2\2A\u00d7\3\2\2\2C\u00da\3\2\2\2E"+
		"\u00e1\3\2\2\2G\u00e6\3\2\2\2I\u00ea\3\2\2\2K\u00ed\3\2\2\2M\u00f3\3\2"+
		"\2\2O\u00fa\3\2\2\2Q\u00ff\3\2\2\2S\u0105\3\2\2\2U\u010c\3\2\2\2W\u0112"+
		"\3\2\2\2Y\u011b\3\2\2\2[\u0122\3\2\2\2]\u0124\3\2\2\2_\u0126\3\2\2\2a"+
		"\u0128\3\2\2\2c\u012a\3\2\2\2e\u012c\3\2\2\2g\u012e\3\2\2\2i\u0131\3\2"+
		"\2\2k\u0136\3\2\2\2m\u013a\3\2\2\2oq\t\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2"+
		"\2\2rs\3\2\2\2s\4\3\2\2\2tx\7$\2\2uw\n\3\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2"+
		"\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7$\2\2|\6\3\2\2\2}~\7v\2\2~\177\7"+
		"t\2\2\177\u0080\7w\2\2\u0080\u0087\7g\2\2\u0081\u0082\7h\2\2\u0082\u0083"+
		"\7c\2\2\u0083\u0084\7n\2\2\u0084\u0085\7u\2\2\u0085\u0087\7g\2\2\u0086"+
		"}\3\2\2\2\u0086\u0081\3\2\2\2\u0087\b\3\2\2\2\u0088\u0089\7?\2\2\u0089"+
		"\n\3\2\2\2\u008a\u008b\7.\2\2\u008b\f\3\2\2\2\u008c\u008d\7<\2\2\u008d"+
		"\16\3\2\2\2\u008e\u008f\7A\2\2\u008f\20\3\2\2\2\u0090\u0091\7-\2\2\u0091"+
		"\u0092\7-\2\2\u0092\22\3\2\2\2\u0093\u0094\7/\2\2\u0094\u0095\7/\2\2\u0095"+
		"\24\3\2\2\2\u0096\u0097\7,\2\2\u0097\26\3\2\2\2\u0098\u0099\7\61\2\2\u0099"+
		"\30\3\2\2\2\u009a\u009b\7-\2\2\u009b\32\3\2\2\2\u009c\u009d\7/\2\2\u009d"+
		"\34\3\2\2\2\u009e\u009f\7\'\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7(\2\2\u00a1"+
		" \3\2\2\2\u00a2\u00a3\7~\2\2\u00a3\"\3\2\2\2\u00a4\u00a5\7`\2\2\u00a5"+
		"$\3\2\2\2\u00a6\u00a7\7#\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7(\2\2\u00a9\u00aa"+
		"\7(\2\2\u00aa(\3\2\2\2\u00ab\u00ac\7~\2\2\u00ac\u00ad\7~\2\2\u00ad*\3"+
		"\2\2\2\u00ae\u00af\7?\2\2\u00af\u00b0\7?\2\2\u00b0,\3\2\2\2\u00b1\u00b2"+
		"\7#\2\2\u00b2\u00b3\7?\2\2\u00b3.\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\60"+
		"\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\7@\2\2\u00b9"+
		"\u00ba\7?\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7>\2\2\u00bc\u00bd\7?\2\2\u00bd"+
		"\66\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7v\2\2\u00c1"+
		"\u00c2\7]\2\2\u00c2\u00c3\7_\2\2\u00c38\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7v\2\2\u00c7:\3\2\2\2\u00c8\u00c9\7d\2\2\u00c9"+
		"\u00ca\7q\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7n\2\2\u00cc<\3\2\2\2\u00cd"+
		"\u00ce\7x\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7f\2\2"+
		"\u00d1>\3\2\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7|\2"+
		"\2\u00d5\u00d6\7g\2\2\u00d6@\3\2\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7"+
		"h\2\2\u00d9B\3\2\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd"+
		"\7n\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7u\2\2\u00e0"+
		"D\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7u\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5F\3\2\2\2\u00e6\u00e7\7h\2\2\u00e7\u00e8\7q\2\2\u00e8"+
		"\u00e9\7t\2\2\u00e9H\3\2\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7p\2\2\u00ec"+
		"J\3\2\2\2\u00ed\u00ee\7y\2\2\u00ee\u00ef\7j\2\2\u00ef\u00f0\7k\2\2\u00f0"+
		"\u00f1\7n\2\2\u00f1\u00f2\7g\2\2\u00f2L\3\2\2\2\u00f3\u00f4\7g\2\2\u00f4"+
		"\u00f5\7z\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7t\2\2"+
		"\u00f8\u00f9\7p\2\2\u00f9N\3\2\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7g\2"+
		"\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7f\2\2\u00feP\3\2\2\2\u00ff\u0100\7"+
		"y\2\2\u0100\u0101\7t\2\2\u0101\u0102\7k\2\2\u0102\u0103\7v\2\2\u0103\u0104"+
		"\7g\2\2\u0104R\3\2\2\2\u0105\u0106\7t\2\2\u0106\u0107\7g\2\2\u0107\u0108"+
		"\7v\2\2\u0108\u0109\7w\2\2\u0109\u010a\7t\2\2\u010a\u010b\7p\2\2\u010b"+
		"T\3\2\2\2\u010c\u010d\7d\2\2\u010d\u010e\7t\2\2\u010e\u010f\7g\2\2\u010f"+
		"\u0110\7c\2\2\u0110\u0111\7m\2\2\u0111V\3\2\2\2\u0112\u0113\7e\2\2\u0113"+
		"\u0114\7q\2\2\u0114\u0115\7p\2\2\u0115\u0116\7v\2\2\u0116\u0117\7k\2\2"+
		"\u0117\u0118\7p\2\2\u0118\u0119\7w\2\2\u0119\u011a\7g\2\2\u011aX\3\2\2"+
		"\2\u011b\u011f\t\4\2\2\u011c\u011e\t\5\2\2\u011d\u011c\3\2\2\2\u011e\u0121"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120Z\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\7}\2\2\u0123\\\3\2\2\2\u0124\u0125\7\177\2"+
		"\2\u0125^\3\2\2\2\u0126\u0127\7*\2\2\u0127`\3\2\2\2\u0128\u0129\7+\2\2"+
		"\u0129b\3\2\2\2\u012a\u012b\7]\2\2\u012bd\3\2\2\2\u012c\u012d\7_\2\2\u012d"+
		"f\3\2\2\2\u012e\u012f\7\60\2\2\u012f\u0130\7\60\2\2\u0130h\3\2\2\2\u0131"+
		"\u0132\7\60\2\2\u0132\u0133\7\60\2\2\u0133\u0134\7\60\2\2\u0134j\3\2\2"+
		"\2\u0135\u0137\7\17\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\7\f\2\2\u0139l\3\2\2\2\u013a\u013b\t\6\2\2"+
		"\u013b\u013c\3\2\2\2\u013c\u013d\b\67\2\2\u013dn\3\2\2\2\b\2rx\u0086\u011f"+
		"\u0136";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}