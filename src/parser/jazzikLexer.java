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
		INT=1, STRING=2, TRUE=3, FALSE=4, ASSIGN=5, COMMA=6, COLON=7, QMARK=8, 
		INC=9, DEC=10, MUL=11, DIV=12, ADD=13, SUB=14, MOD=15, EQ=16, NEQ=17, 
		GT=18, LT=19, GTE=20, LTE=21, NEG=22, AND=23, IAND=24, OR=25, IOR=26, 
		IXOR=27, INEG=28, ARRAY_TYPE=29, INT_TYPE=30, BOOL_TYPE=31, VOID_TYPE=32, 
		SIZE=33, IF=34, UNLESS=35, ELSE=36, FOR=37, IN=38, WHILE=39, EXTERN=40, 
		READ=41, WRITE=42, RETURN=43, BREAK=44, CONTINUE=45, ID=46, BLOCK_BEGIN=47, 
		BLOCK_END=48, PAREN_BEGIN=49, PAREN_END=50, ARRAY_BEGIN=51, ARRAY_END=52, 
		INC_RANGE=53, EXC_RANGE=54, NEWLINE=55, WHITESPACE=56;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"INT", "STRING", "'true'", "'false'", "'='", "','", "':'", "'?'", "'++'", 
		"'--'", "'*'", "'/'", "'+'", "'-'", "'%'", "'=='", "'!='", "'>'", "'<'", 
		"'>='", "'<='", "'!'", "'&&'", "'&'", "'||'", "'|'", "'^'", "'~'", "'int[]'", 
		"'int'", "'bool'", "'void'", "'size'", "'if'", "'unless'", "'else'", "'for'", 
		"'in'", "'while'", "'extern'", "'read'", "'write'", "'return'", "'break'", 
		"'continue'", "ID", "'{'", "'}'", "'('", "')'", "'['", "']'", "'..'", 
		"'...'", "NEWLINE", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"INT", "STRING", "TRUE", "FALSE", "ASSIGN", "COMMA", "COLON", "QMARK", 
		"INC", "DEC", "MUL", "DIV", "ADD", "SUB", "MOD", "EQ", "NEQ", "GT", "LT", 
		"GTE", "LTE", "NEG", "AND", "IAND", "OR", "IOR", "IXOR", "INEG", "ARRAY_TYPE", 
		"INT_TYPE", "BOOL_TYPE", "VOID_TYPE", "SIZE", "IF", "UNLESS", "ELSE", 
		"FOR", "IN", "WHILE", "EXTERN", "READ", "WRITE", "RETURN", "BREAK", "CONTINUE", 
		"ID", "BLOCK_BEGIN", "BLOCK_END", "PAREN_BEGIN", "PAREN_END", "ARRAY_BEGIN", 
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
		case 55: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2:\u0144\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\6\2u\n\2\r\2\16\2v\3"+
		"\3\3\3\7\3{\n\3\f\3\16\3~\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\7/\u0124\n/\f/\16/\u0127\13/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\38\58\u013d\n8\38\38\39\39\39\39\2:\3\3\1\5\4\1\7\5\1"+
		"\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17"+
		"\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61"+
		"\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1"+
		"K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65"+
		"\1i\66\1k\67\1m8\1o9\1q:\2\3\2\7\3\2\62;\5\2\f\f\17\17$$\4\2C\\c|\6\2"+
		"\62;C\\aac|\4\2\13\13\"\"\u0147\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3t\3\2\2\2\5x"+
		"\3\2\2\2\7\u0081\3\2\2\2\t\u0086\3\2\2\2\13\u008c\3\2\2\2\r\u008e\3\2"+
		"\2\2\17\u0090\3\2\2\2\21\u0092\3\2\2\2\23\u0094\3\2\2\2\25\u0097\3\2\2"+
		"\2\27\u009a\3\2\2\2\31\u009c\3\2\2\2\33\u009e\3\2\2\2\35\u00a0\3\2\2\2"+
		"\37\u00a2\3\2\2\2!\u00a4\3\2\2\2#\u00a7\3\2\2\2%\u00aa\3\2\2\2\'\u00ac"+
		"\3\2\2\2)\u00ae\3\2\2\2+\u00b1\3\2\2\2-\u00b4\3\2\2\2/\u00b6\3\2\2\2\61"+
		"\u00b9\3\2\2\2\63\u00bb\3\2\2\2\65\u00be\3\2\2\2\67\u00c0\3\2\2\29\u00c2"+
		"\3\2\2\2;\u00c4\3\2\2\2=\u00ca\3\2\2\2?\u00ce\3\2\2\2A\u00d3\3\2\2\2C"+
		"\u00d8\3\2\2\2E\u00dd\3\2\2\2G\u00e0\3\2\2\2I\u00e7\3\2\2\2K\u00ec\3\2"+
		"\2\2M\u00f0\3\2\2\2O\u00f3\3\2\2\2Q\u00f9\3\2\2\2S\u0100\3\2\2\2U\u0105"+
		"\3\2\2\2W\u010b\3\2\2\2Y\u0112\3\2\2\2[\u0118\3\2\2\2]\u0121\3\2\2\2_"+
		"\u0128\3\2\2\2a\u012a\3\2\2\2c\u012c\3\2\2\2e\u012e\3\2\2\2g\u0130\3\2"+
		"\2\2i\u0132\3\2\2\2k\u0134\3\2\2\2m\u0137\3\2\2\2o\u013c\3\2\2\2q\u0140"+
		"\3\2\2\2su\t\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\4\3\2\2\2"+
		"x|\7$\2\2y{\n\3\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2"+
		"\2~|\3\2\2\2\177\u0080\7$\2\2\u0080\6\3\2\2\2\u0081\u0082\7v\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7w\2\2\u0084\u0085\7g\2\2\u0085\b\3\2\2\2\u0086"+
		"\u0087\7h\2\2\u0087\u0088\7c\2\2\u0088\u0089\7n\2\2\u0089\u008a\7u\2\2"+
		"\u008a\u008b\7g\2\2\u008b\n\3\2\2\2\u008c\u008d\7?\2\2\u008d\f\3\2\2\2"+
		"\u008e\u008f\7.\2\2\u008f\16\3\2\2\2\u0090\u0091\7<\2\2\u0091\20\3\2\2"+
		"\2\u0092\u0093\7A\2\2\u0093\22\3\2\2\2\u0094\u0095\7-\2\2\u0095\u0096"+
		"\7-\2\2\u0096\24\3\2\2\2\u0097\u0098\7/\2\2\u0098\u0099\7/\2\2\u0099\26"+
		"\3\2\2\2\u009a\u009b\7,\2\2\u009b\30\3\2\2\2\u009c\u009d\7\61\2\2\u009d"+
		"\32\3\2\2\2\u009e\u009f\7-\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7/\2\2\u00a1"+
		"\36\3\2\2\2\u00a2\u00a3\7\'\2\2\u00a3 \3\2\2\2\u00a4\u00a5\7?\2\2\u00a5"+
		"\u00a6\7?\2\2\u00a6\"\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8\u00a9\7?\2\2\u00a9"+
		"$\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab&\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad("+
		"\3\2\2\2\u00ae\u00af\7@\2\2\u00af\u00b0\7?\2\2\u00b0*\3\2\2\2\u00b1\u00b2"+
		"\7>\2\2\u00b2\u00b3\7?\2\2\u00b3,\3\2\2\2\u00b4\u00b5\7#\2\2\u00b5.\3"+
		"\2\2\2\u00b6\u00b7\7(\2\2\u00b7\u00b8\7(\2\2\u00b8\60\3\2\2\2\u00b9\u00ba"+
		"\7(\2\2\u00ba\62\3\2\2\2\u00bb\u00bc\7~\2\2\u00bc\u00bd\7~\2\2\u00bd\64"+
		"\3\2\2\2\u00be\u00bf\7~\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\7`\2\2\u00c1"+
		"8\3\2\2\2\u00c2\u00c3\7\u0080\2\2\u00c3:\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7]\2\2\u00c8\u00c9\7_\2\2"+
		"\u00c9<\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7v\2"+
		"\2\u00cd>\3\2\2\2\u00ce\u00cf\7d\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7"+
		"q\2\2\u00d1\u00d2\7n\2\2\u00d2@\3\2\2\2\u00d3\u00d4\7x\2\2\u00d4\u00d5"+
		"\7q\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7f\2\2\u00d7B\3\2\2\2\u00d8\u00d9"+
		"\7u\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7|\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"D\3\2\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7h\2\2\u00dfF\3\2\2\2\u00e0\u00e1"+
		"\7w\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		"\u00e5\7u\2\2\u00e5\u00e6\7u\2\2\u00e6H\3\2\2\2\u00e7\u00e8\7g\2\2\u00e8"+
		"\u00e9\7n\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7g\2\2\u00ebJ\3\2\2\2\u00ec"+
		"\u00ed\7h\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7t\2\2\u00efL\3\2\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7p\2\2\u00f2N\3\2\2\2\u00f3\u00f4\7y\2\2\u00f4"+
		"\u00f5\7j\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7g\2\2"+
		"\u00f8P\3\2\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7z\2\2\u00fb\u00fc\7v\2"+
		"\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7p\2\2\u00ffR\3\2"+
		"\2\2\u0100\u0101\7t\2\2\u0101\u0102\7g\2\2\u0102\u0103\7c\2\2\u0103\u0104"+
		"\7f\2\2\u0104T\3\2\2\2\u0105\u0106\7y\2\2\u0106\u0107\7t\2\2\u0107\u0108"+
		"\7k\2\2\u0108\u0109\7v\2\2\u0109\u010a\7g\2\2\u010aV\3\2\2\2\u010b\u010c"+
		"\7t\2\2\u010c\u010d\7g\2\2\u010d\u010e\7v\2\2\u010e\u010f\7w\2\2\u010f"+
		"\u0110\7t\2\2\u0110\u0111\7p\2\2\u0111X\3\2\2\2\u0112\u0113\7d\2\2\u0113"+
		"\u0114\7t\2\2\u0114\u0115\7g\2\2\u0115\u0116\7c\2\2\u0116\u0117\7m\2\2"+
		"\u0117Z\3\2\2\2\u0118\u0119\7e\2\2\u0119\u011a\7q\2\2\u011a\u011b\7p\2"+
		"\2\u011b\u011c\7v\2\2\u011c\u011d\7k\2\2\u011d\u011e\7p\2\2\u011e\u011f"+
		"\7w\2\2\u011f\u0120\7g\2\2\u0120\\\3\2\2\2\u0121\u0125\t\4\2\2\u0122\u0124"+
		"\t\5\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126^\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7}\2\2\u0129"+
		"`\3\2\2\2\u012a\u012b\7\177\2\2\u012bb\3\2\2\2\u012c\u012d\7*\2\2\u012d"+
		"d\3\2\2\2\u012e\u012f\7+\2\2\u012ff\3\2\2\2\u0130\u0131\7]\2\2\u0131h"+
		"\3\2\2\2\u0132\u0133\7_\2\2\u0133j\3\2\2\2\u0134\u0135\7\60\2\2\u0135"+
		"\u0136\7\60\2\2\u0136l\3\2\2\2\u0137\u0138\7\60\2\2\u0138\u0139\7\60\2"+
		"\2\u0139\u013a\7\60\2\2\u013an\3\2\2\2\u013b\u013d\7\17\2\2\u013c\u013b"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7\f\2\2\u013f"+
		"p\3\2\2\2\u0140\u0141\t\6\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b9\2\2\u0143"+
		"r\3\2\2\2\7\2v|\u0125\u013c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}