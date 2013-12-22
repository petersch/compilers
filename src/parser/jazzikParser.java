// Generated from jazzik.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jazzikParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, STRING=2, BOOL=3, ASSIGN=4, COMMA=5, COLON=6, QMARK=7, INC=8, DEC=9, 
		MUL=10, DIV=11, ADD=12, SUB=13, MOD=14, IAND=15, IOR=16, IXOR=17, NEG=18, 
		AND=19, OR=20, EQ=21, NEQ=22, GT=23, LT=24, GTE=25, LTE=26, BOOL_TYPE=27, 
		INT_TYPE=28, ARRAY_TYPE=29, VOID_TYPE=30, IF=31, UNLESS=32, ELSE=33, FOR=34, 
		IN=35, WHILE=36, EXTERN=37, READ=38, WRITE=39, RETURN=40, BREAK=41, CONTINUE=42, 
		ID=43, BLOCK_BEGIN=44, BLOCK_END=45, PAREN_BEGIN=46, PAREN_END=47, ARRAY_BEGIN=48, 
		ARRAY_END=49, INC_RANGE=50, EXC_RANGE=51, NEWLINE=52, WHITESPACE=53;
	public static final String[] tokenNames = {
		"<INVALID>", "INT", "STRING", "BOOL", "'='", "','", "':'", "'?'", "'++'", 
		"'--'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&'", "'|'", "'^'", "'!'", 
		"'&&'", "'||'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'bool'", 
		"'int'", "'int[]'", "'void'", "'if'", "'unless'", "'else'", "'for'", "'in'", 
		"'while'", "'extern'", "'read'", "'write'", "'return'", "'break'", "'continue'", 
		"ID", "'{'", "'}'", "'('", "')'", "'['", "']'", "'..'", "'...'", "NEWLINE", 
		"WHITESPACE"
	};
	public static final int
		RULE_init = 0, RULE_statement = 1, RULE_assignment = 2, RULE_lvalue = 3, 
		RULE_expression = 4, RULE_varaccess = 5, RULE_funcdef = 6, RULE_funcargdef = 7, 
		RULE_ifstatement = 8, RULE_forstatement = 9, RULE_range = 10, RULE_cond = 11, 
		RULE_block = 12;
	public static final String[] ruleNames = {
		"init", "statement", "assignment", "lvalue", "expression", "varaccess", 
		"funcdef", "funcargdef", "ifstatement", "forstatement", "range", "cond", 
		"block"
	};

	@Override
	public String getGrammarFileName() { return "jazzik.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public jazzikParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(jazzikParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(jazzikParser.NEWLINE, i);
		}
		public FuncdefContext funcdef(int i) {
			return getRuleContext(FuncdefContext.class,i);
		}
		public List<FuncdefContext> funcdef() {
			return getRuleContexts(FuncdefContext.class);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << VOID_TYPE) | (1L << EXTERN) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(26); match(NEWLINE);
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(32); funcdef();
				}
				}
				setState(37);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NopContext extends StatementContext {
		public NopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterNop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitNop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitNop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnIntContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnIntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterReturnInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitReturnInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitReturnInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnVoidContext extends StatementContext {
		public ReturnVoidContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterReturnVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitReturnVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitReturnVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakContext extends StatementContext {
		public BreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteIntContext extends StatementContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STRING(int i) {
			return getToken(jazzikParser.STRING, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public List<TerminalNode> STRING() { return getTokens(jazzikParser.STRING); }
		public WriteIntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterWriteInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitWriteInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitWriteInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueContext extends StatementContext {
		public ContinueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadContext extends StatementContext {
		public VaraccessContext varaccess(int i) {
			return getRuleContext(VaraccessContext.class,i);
		}
		public List<VaraccessContext> varaccess() {
			return getRuleContexts(VaraccessContext.class);
		}
		public ReadContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatementContext {
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public ForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignNopeContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignNopeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterAssignNope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitAssignNope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitAssignNope(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnBoolContext extends StatementContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ReturnBoolContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterReturnBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitReturnBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitReturnBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssignNopeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38); assignment();
				}
				break;

			case 2:
				_localctx = new WriteIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39); match(WRITE);
				setState(43);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(40); expression(0);
					}
					break;

				case 2:
					{
					setState(41); cond(0);
					}
					break;

				case 3:
					{
					setState(42); match(STRING);
					}
					break;
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(45); match(COMMA);
					setState(49);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(46); expression(0);
						}
						break;

					case 2:
						{
						setState(47); cond(0);
						}
						break;

					case 3:
						{
						setState(48); match(STRING);
						}
						break;
					}
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56); match(READ);
				setState(57); varaccess();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(58); match(COMMA);
					setState(59); varaccess();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(65); forstatement();
				}
				break;

			case 5:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(66); ifstatement();
				}
				break;

			case 6:
				_localctx = new NopContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				}
				break;

			case 7:
				_localctx = new ReturnIntContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(68); match(RETURN);
				setState(69); expression(0);
				}
				break;

			case 8:
				_localctx = new ReturnBoolContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(70); match(RETURN);
				setState(71); cond(0);
				}
				break;

			case 9:
				_localctx = new ReturnVoidContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(72); match(RETURN);
				}
				break;

			case 10:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(73); match(BREAK);
				}
				break;

			case 11:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(74); match(CONTINUE);
				}
				break;

			case 12:
				_localctx = new ExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(75); expression(0);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntVarDeclContext extends AssignmentContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(jazzikParser.ID); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(jazzikParser.ID, i);
		}
		public IntVarDeclContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterIntVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitIntVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitIntVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignIntContext extends AssignmentContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignIntContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterAssignInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitAssignInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitAssignInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayDeclContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignBoolContext extends AssignmentContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public AssignBoolContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterAssignBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitAssignBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitAssignBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolVarDeclContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(jazzikParser.ID); }
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(jazzikParser.ID, i);
		}
		public BoolVarDeclContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterBoolVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitBoolVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitBoolVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		int _la;
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new IntVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78); match(INT_TYPE);
				setState(83);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(79); match(ID);
					}
					break;

				case 2:
					{
					setState(80); match(ID);
					setState(81); match(ASSIGN);
					setState(82); expression(0);
					}
					break;
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(91);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(85); match(COMMA);
						setState(86); match(ID);
						}
						break;

					case 2:
						{
						setState(87); match(COMMA);
						setState(88); match(ID);
						setState(89); match(ASSIGN);
						setState(90); expression(0);
						}
						break;
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				_localctx = new BoolVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96); match(BOOL_TYPE);
				setState(101);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(97); match(ID);
					}
					break;

				case 2:
					{
					setState(98); match(ID);
					setState(99); match(ASSIGN);
					setState(100); cond(0);
					}
					break;
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(109);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(103); match(COMMA);
						setState(104); match(ID);
						}
						break;

					case 2:
						{
						setState(105); match(COMMA);
						setState(106); match(ID);
						setState(107); match(ASSIGN);
						setState(108); cond(0);
						}
						break;
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				_localctx = new ArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114); match(INT_TYPE);
				setState(115); match(ID);
				setState(116); match(ARRAY_BEGIN);
				setState(117); expression(0);
				setState(118); match(ARRAY_END);
				}
				break;

			case 4:
				_localctx = new AssignIntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120); lvalue();
				setState(121); match(ASSIGN);
				setState(122); expression(0);
				}
				break;

			case 5:
				_localctx = new AssignBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124); lvalue();
				setState(125); match(ASSIGN);
				setState(126); cond(0);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lvalue);
		try {
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); match(ID);
				setState(132); match(ARRAY_BEGIN);
				setState(133); expression(0);
				setState(134); match(ARRAY_END);
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class BinContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BinContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitBin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitBin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntConstantContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(jazzikParser.INT, 0); }
		public IntConstantContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterIntConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitIntConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitIntConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterUna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitUna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitUna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FuncCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarsContext extends ExpressionContext {
		public VaraccessContext varaccess() {
			return getRuleContext(VaraccessContext.class,0);
		}
		public VarsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(139);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(140); expression(8);
				}
				break;

			case 2:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141); match(PAREN_BEGIN);
				setState(142); expression(0);
				setState(143); match(PAREN_END);
				}
				break;

			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145); match(ID);
				setState(146); match(PAREN_BEGIN);
				setState(155);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << ID) | (1L << PAREN_BEGIN))) != 0)) {
					{
					setState(147); expression(0);
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(148); match(COMMA);
						setState(149); expression(0);
						}
						}
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(157); match(PAREN_END);
				}
				break;

			case 4:
				{
				_localctx = new IntConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158); match(INT);
				}
				break;

			case 5:
				{
				_localctx = new VarsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159); varaccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(163);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(164); expression(8);
						}
						break;

					case 2:
						{
						_localctx = new BinContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(166);
						((BinContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IAND) | (1L << IOR) | (1L << IXOR))) != 0)) ) {
							((BinContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(167); expression(7);
						}
						break;

					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(169);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(170); expression(6);
						}
						break;
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class VaraccessContext extends ParserRuleContext {
		public VaraccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varaccess; }
	 
		public VaraccessContext() { }
		public void copyFrom(VaraccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarAccessContext extends VaraccessContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public VarAccessContext(VaraccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterVarAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitVarAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitVarAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessContext extends VaraccessContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAccessContext(VaraccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaraccessContext varaccess() throws RecognitionException {
		VaraccessContext _localctx = new VaraccessContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varaccess);
		try {
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new VarAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176); match(ID);
				}
				break;

			case 2:
				_localctx = new ArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177); match(ID);
				setState(178); match(ARRAY_BEGIN);
				setState(179); expression(0);
				setState(180); match(ARRAY_END);
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

	public static class FuncdefContext extends ParserRuleContext {
		public List<FuncargdefContext> funcargdef() {
			return getRuleContexts(FuncargdefContext.class);
		}
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public FuncargdefContext funcargdef(int i) {
			return getRuleContext(FuncargdefContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcdef);
		int _la;
		try {
			setState(214);
			switch (_input.LA(1)) {
			case BOOL_TYPE:
			case INT_TYPE:
			case VOID_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << VOID_TYPE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(185); match(ID);
				setState(186); match(PAREN_BEGIN);
				setState(188);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << ARRAY_TYPE))) != 0)) {
					{
					setState(187); funcargdef();
					}
				}

				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(190); match(COMMA);
					setState(191); funcargdef();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197); match(PAREN_END);
				setState(198); block();
				}
				break;
			case EXTERN:
				enterOuterAlt(_localctx, 2);
				{
				setState(199); match(EXTERN);
				setState(200);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << VOID_TYPE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(201); match(ID);
				setState(202); match(PAREN_BEGIN);
				setState(204);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << ARRAY_TYPE))) != 0)) {
					{
					setState(203); funcargdef();
					}
				}

				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(206); match(COMMA);
					setState(207); funcargdef();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213); match(PAREN_END);
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

	public static class FuncargdefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public FuncargdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcargdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncargdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncargdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncargdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncargdefContext funcargdef() throws RecognitionException {
		FuncargdefContext _localctx = new FuncargdefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcargdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << ARRAY_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(217); match(ID);
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

	public static class IfstatementContext extends ParserRuleContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifstatement);
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219); match(IF);
				setState(220); cond(0);
				setState(221); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223); match(IF);
				setState(224); cond(0);
				setState(225); block();
				setState(226); match(ELSE);
				setState(227); block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229); match(UNLESS);
				setState(230); cond(0);
				setState(231); block();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233); match(UNLESS);
				setState(234); cond(0);
				setState(235); block();
				setState(236); match(ELSE);
				setState(237); block();
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

	public static class ForstatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterForstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitForstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitForstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forstatement);
		try {
			setState(251);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(241); match(FOR);
				setState(242); match(ID);
				setState(243); match(IN);
				setState(244); range();
				setState(245); block();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(247); match(WHILE);
				setState(248); cond(0);
				setState(249); block();
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

	public static class RangeContext extends ParserRuleContext {
		public Token rtype;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); expression(0);
			setState(254);
			((RangeContext)_localctx).rtype = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INC_RANGE || _la==EXC_RANGE) ) {
				((RangeContext)_localctx).rtype = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(255); expression(0);
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

	public static class CondContext extends ParserRuleContext {
		public int _p;
		public Token op;
		public TerminalNode BOOL() { return getToken(jazzikParser.BOOL, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CondContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState, _p);
		CondContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_cond);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(258); match(NEG);
				setState(259); cond(4);
				}
				break;

			case 2:
				{
				setState(260); expression(0);
				setState(261);
				((CondContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE))) != 0)) ) {
					((CondContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(262); expression(0);
				}
				break;

			case 3:
				{
				setState(264); match(PAREN_BEGIN);
				setState(265); cond(0);
				setState(266); match(PAREN_END);
				}
				break;

			case 4:
				{
				setState(268); match(BOOL);
				}
				break;

			case 5:
				{
				setState(269); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(272);
					if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
					setState(273);
					((CondContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
						((CondContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(274); cond(6);
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(jazzikParser.NEWLINE); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(jazzikParser.NEWLINE, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(280); match(NEWLINE);
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286); match(BLOCK_BEGIN);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(287); match(NEWLINE);
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(293); statement();
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(295); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(294); match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(297); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					} while ( _alt!=2 && _alt!=-1 );
					setState(299); statement();
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(305); match(NEWLINE);
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311); match(BLOCK_END);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(312); match(NEWLINE);
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		case 4: return expression_sempred((ExpressionContext)_localctx, predIndex);

		case 11: return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 7 >= _localctx._p;

		case 1: return 6 >= _localctx._p;

		case 2: return 5 >= _localctx._p;
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return 5 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\67\u0141\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\3\3\5\3"+
		"\64\n\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\3\3\3\7\3?\n\3\f\3\16\3B\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\5\4V\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4h\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4p\n\4\f\4\16\4s\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0083\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u0099\n\6\f\6\16\6\u009c\13\6\5\6\u009e\n\6\3\6"+
		"\3\6\3\6\5\6\u00a3\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00ae\n"+
		"\6\f\6\16\6\u00b1\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b9\n\7\3\b\3\b\3"+
		"\b\3\b\5\b\u00bf\n\b\3\b\3\b\7\b\u00c3\n\b\f\b\16\b\u00c6\13\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00cf\n\b\3\b\3\b\7\b\u00d3\n\b\f\b\16\b\u00d6"+
		"\13\b\3\b\5\b\u00d9\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f2\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00fe\n\13\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0111\n\r\3"+
		"\r\3\r\3\r\7\r\u0116\n\r\f\r\16\r\u0119\13\r\3\16\7\16\u011c\n\16\f\16"+
		"\16\16\u011f\13\16\3\16\3\16\7\16\u0123\n\16\f\16\16\16\u0126\13\16\3"+
		"\16\3\16\6\16\u012a\n\16\r\16\16\16\u012b\3\16\7\16\u012f\n\16\f\16\16"+
		"\16\u0132\13\16\3\16\7\16\u0135\n\16\f\16\16\16\u0138\13\16\3\16\3\16"+
		"\7\16\u013c\n\16\f\16\16\16\u013f\13\16\3\16\2\17\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\2\13\4\2\n\13\16\17\4\2\f\r\20\20\3\2\21\23\3\2\16\17\4\2"+
		"\35\36  \3\2\35\37\3\2\64\65\3\2\27\34\3\2\25\30\u016f\2%\3\2\2\2\4N\3"+
		"\2\2\2\6\u0082\3\2\2\2\b\u008a\3\2\2\2\n\u00a2\3\2\2\2\f\u00b8\3\2\2\2"+
		"\16\u00d8\3\2\2\2\20\u00da\3\2\2\2\22\u00f1\3\2\2\2\24\u00fd\3\2\2\2\26"+
		"\u00ff\3\2\2\2\30\u0110\3\2\2\2\32\u011d\3\2\2\2\34\36\7\66\2\2\35\34"+
		"\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2"+
		"\"$\5\16\b\2#\37\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'%"+
		"\3\2\2\2(O\5\6\4\2)-\7)\2\2*.\5\n\6\2+.\5\30\r\2,.\7\4\2\2-*\3\2\2\2-"+
		"+\3\2\2\2-,\3\2\2\2.\67\3\2\2\2/\63\7\7\2\2\60\64\5\n\6\2\61\64\5\30\r"+
		"\2\62\64\7\4\2\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\66\3\2\2"+
		"\2\65/\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28O\3\2\2\29\67\3\2"+
		"\2\2:;\7(\2\2;@\5\f\7\2<=\7\7\2\2=?\5\f\7\2><\3\2\2\2?B\3\2\2\2@>\3\2"+
		"\2\2@A\3\2\2\2AO\3\2\2\2B@\3\2\2\2CO\5\24\13\2DO\5\22\n\2EO\3\2\2\2FG"+
		"\7*\2\2GO\5\n\6\2HI\7*\2\2IO\5\30\r\2JO\7*\2\2KO\7+\2\2LO\7,\2\2MO\5\n"+
		"\6\2N(\3\2\2\2N)\3\2\2\2N:\3\2\2\2NC\3\2\2\2ND\3\2\2\2NE\3\2\2\2NF\3\2"+
		"\2\2NH\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PU\7"+
		"\36\2\2QV\7-\2\2RS\7-\2\2ST\7\6\2\2TV\5\n\6\2UQ\3\2\2\2UR\3\2\2\2V_\3"+
		"\2\2\2WX\7\7\2\2X^\7-\2\2YZ\7\7\2\2Z[\7-\2\2[\\\7\6\2\2\\^\5\n\6\2]W\3"+
		"\2\2\2]Y\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\u0083\3\2\2\2a_\3\2\2"+
		"\2bg\7\35\2\2ch\7-\2\2de\7-\2\2ef\7\6\2\2fh\5\30\r\2gc\3\2\2\2gd\3\2\2"+
		"\2hq\3\2\2\2ij\7\7\2\2jp\7-\2\2kl\7\7\2\2lm\7-\2\2mn\7\6\2\2np\5\30\r"+
		"\2oi\3\2\2\2ok\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\u0083\3\2\2\2sq"+
		"\3\2\2\2tu\7\36\2\2uv\7-\2\2vw\7\62\2\2wx\5\n\6\2xy\7\63\2\2y\u0083\3"+
		"\2\2\2z{\5\b\5\2{|\7\6\2\2|}\5\n\6\2}\u0083\3\2\2\2~\177\5\b\5\2\177\u0080"+
		"\7\6\2\2\u0080\u0081\5\30\r\2\u0081\u0083\3\2\2\2\u0082P\3\2\2\2\u0082"+
		"b\3\2\2\2\u0082t\3\2\2\2\u0082z\3\2\2\2\u0082~\3\2\2\2\u0083\7\3\2\2\2"+
		"\u0084\u008b\7-\2\2\u0085\u0086\7-\2\2\u0086\u0087\7\62\2\2\u0087\u0088"+
		"\5\n\6\2\u0088\u0089\7\63\2\2\u0089\u008b\3\2\2\2\u008a\u0084\3\2\2\2"+
		"\u008a\u0085\3\2\2\2\u008b\t\3\2\2\2\u008c\u008d\b\6\1\2\u008d\u008e\t"+
		"\2\2\2\u008e\u00a3\5\n\6\2\u008f\u0090\7\60\2\2\u0090\u0091\5\n\6\2\u0091"+
		"\u0092\7\61\2\2\u0092\u00a3\3\2\2\2\u0093\u0094\7-\2\2\u0094\u009d\7\60"+
		"\2\2\u0095\u009a\5\n\6\2\u0096\u0097\7\7\2\2\u0097\u0099\5\n\6\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u0095\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a3\7\61\2\2\u00a0\u00a3\7"+
		"\3\2\2\u00a1\u00a3\5\f\7\2\u00a2\u008c\3\2\2\2\u00a2\u008f\3\2\2\2\u00a2"+
		"\u0093\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00af\3\2"+
		"\2\2\u00a4\u00a5\6\6\2\3\u00a5\u00a6\t\3\2\2\u00a6\u00ae\5\n\6\2\u00a7"+
		"\u00a8\6\6\3\3\u00a8\u00a9\t\4\2\2\u00a9\u00ae\5\n\6\2\u00aa\u00ab\6\6"+
		"\4\3\u00ab\u00ac\t\5\2\2\u00ac\u00ae\5\n\6\2\u00ad\u00a4\3\2\2\2\u00ad"+
		"\u00a7\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\13\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b9"+
		"\7-\2\2\u00b3\u00b4\7-\2\2\u00b4\u00b5\7\62\2\2\u00b5\u00b6\5\n\6\2\u00b6"+
		"\u00b7\7\63\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b3\3"+
		"\2\2\2\u00b9\r\3\2\2\2\u00ba\u00bb\t\6\2\2\u00bb\u00bc\7-\2\2\u00bc\u00be"+
		"\7\60\2\2\u00bd\u00bf\5\20\t\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2"+
		"\u00bf\u00c4\3\2\2\2\u00c0\u00c1\7\7\2\2\u00c1\u00c3\5\20\t\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\61\2\2\u00c8\u00d9\5"+
		"\32\16\2\u00c9\u00ca\7\'\2\2\u00ca\u00cb\t\6\2\2\u00cb\u00cc\7-\2\2\u00cc"+
		"\u00ce\7\60\2\2\u00cd\u00cf\5\20\t\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3"+
		"\2\2\2\u00cf\u00d4\3\2\2\2\u00d0\u00d1\7\7\2\2\u00d1\u00d3\5\20\t\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\7\61\2\2\u00d8"+
		"\u00ba\3\2\2\2\u00d8\u00c9\3\2\2\2\u00d9\17\3\2\2\2\u00da\u00db\t\7\2"+
		"\2\u00db\u00dc\7-\2\2\u00dc\21\3\2\2\2\u00dd\u00de\7!\2\2\u00de\u00df"+
		"\5\30\r\2\u00df\u00e0\5\32\16\2\u00e0\u00f2\3\2\2\2\u00e1\u00e2\7!\2\2"+
		"\u00e2\u00e3\5\30\r\2\u00e3\u00e4\5\32\16\2\u00e4\u00e5\7#\2\2\u00e5\u00e6"+
		"\5\32\16\2\u00e6\u00f2\3\2\2\2\u00e7\u00e8\7\"\2\2\u00e8\u00e9\5\30\r"+
		"\2\u00e9\u00ea\5\32\16\2\u00ea\u00f2\3\2\2\2\u00eb\u00ec\7\"\2\2\u00ec"+
		"\u00ed\5\30\r\2\u00ed\u00ee\5\32\16\2\u00ee\u00ef\7#\2\2\u00ef\u00f0\5"+
		"\32\16\2\u00f0\u00f2\3\2\2\2\u00f1\u00dd\3\2\2\2\u00f1\u00e1\3\2\2\2\u00f1"+
		"\u00e7\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f2\23\3\2\2\2\u00f3\u00f4\7$\2\2"+
		"\u00f4\u00f5\7-\2\2\u00f5\u00f6\7%\2\2\u00f6\u00f7\5\26\f\2\u00f7\u00f8"+
		"\5\32\16\2\u00f8\u00fe\3\2\2\2\u00f9\u00fa\7&\2\2\u00fa\u00fb\5\30\r\2"+
		"\u00fb\u00fc\5\32\16\2\u00fc\u00fe\3\2\2\2\u00fd\u00f3\3\2\2\2\u00fd\u00f9"+
		"\3\2\2\2\u00fe\25\3\2\2\2\u00ff\u0100\5\n\6\2\u0100\u0101\t\b\2\2\u0101"+
		"\u0102\5\n\6\2\u0102\27\3\2\2\2\u0103\u0104\b\r\1\2\u0104\u0105\7\24\2"+
		"\2\u0105\u0111\5\30\r\2\u0106\u0107\5\n\6\2\u0107\u0108\t\t\2\2\u0108"+
		"\u0109\5\n\6\2\u0109\u0111\3\2\2\2\u010a\u010b\7\60\2\2\u010b\u010c\5"+
		"\30\r\2\u010c\u010d\7\61\2\2\u010d\u0111\3\2\2\2\u010e\u0111\7\5\2\2\u010f"+
		"\u0111\7-\2\2\u0110\u0103\3\2\2\2\u0110\u0106\3\2\2\2\u0110\u010a\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0117\3\2\2\2\u0112"+
		"\u0113\6\r\5\3\u0113\u0114\t\n\2\2\u0114\u0116\5\30\r\2\u0115\u0112\3"+
		"\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\31\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\7\66\2\2\u011b\u011a\3\2\2"+
		"\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0124\7.\2\2\u0121\u0123\7\66\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0130\5\4\3\2\u0128"+
		"\u012a\7\66\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3"+
		"\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\5\4\3\2\u012e"+
		"\u0129\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0136\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0135\7\66\2\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013d\7/\2\2\u013a"+
		"\u013c\7\66\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3"+
		"\2\2\2\u013d\u013e\3\2\2\2\u013e\33\3\2\2\2\u013f\u013d\3\2\2\2&\37%-"+
		"\63\67@NU]_goq\u0082\u008a\u009a\u009d\u00a2\u00ad\u00af\u00b8\u00be\u00c4"+
		"\u00ce\u00d4\u00d8\u00f1\u00fd\u0110\u0117\u011d\u0124\u012b\u0130\u0136"+
		"\u013d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}