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
		AND=19, OR=20, EQ=21, NEQ=22, GT=23, LT=24, GTE=25, LTE=26, ARRAY_TYPE=27, 
		INT_TYPE=28, BOOL_TYPE=29, VOID_TYPE=30, SIZE=31, IF=32, UNLESS=33, ELSE=34, 
		FOR=35, IN=36, WHILE=37, EXTERN=38, READ=39, WRITE=40, RETURN=41, BREAK=42, 
		CONTINUE=43, ID=44, BLOCK_BEGIN=45, BLOCK_END=46, PAREN_BEGIN=47, PAREN_END=48, 
		ARRAY_BEGIN=49, ARRAY_END=50, INC_RANGE=51, EXC_RANGE=52, NEWLINE=53, 
		WHITESPACE=54;
	public static final String[] tokenNames = {
		"<INVALID>", "INT", "STRING", "BOOL", "'='", "','", "':'", "'?'", "'++'", 
		"'--'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&'", "'|'", "'^'", "'!'", 
		"'&&'", "'||'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'int[]'", 
		"'int'", "'bool'", "'void'", "'size'", "'if'", "'unless'", "'else'", "'for'", 
		"'in'", "'while'", "'extern'", "'read'", "'write'", "'return'", "'break'", 
		"'continue'", "ID", "'{'", "'}'", "'('", "')'", "'['", "']'", "'..'", 
		"'...'", "NEWLINE", "WHITESPACE"
	};
	public static final int
		RULE_init = 0, RULE_funcdecls = 1, RULE_funcdecl = 2, RULE_block = 3, 
		RULE_statement = 4, RULE_writearg = 5, RULE_readarg = 6, RULE_vardecl = 7, 
		RULE_intvardecl = 8, RULE_boolvardecl = 9, RULE_assignment = 10, RULE_expression = 11, 
		RULE_funccall = 12, RULE_funcargs = 13, RULE_funcarg = 14, RULE_varaccess = 15, 
		RULE_funcargdecls = 16, RULE_funcargdecl = 17, RULE_ifstatement = 18, 
		RULE_forstatement = 19, RULE_cond = 20;
	public static final String[] ruleNames = {
		"init", "funcdecls", "funcdecl", "block", "statement", "writearg", "readarg", 
		"vardecl", "intvardecl", "boolvardecl", "assignment", "expression", "funccall", 
		"funcargs", "funcarg", "varaccess", "funcargdecls", "funcargdecl", "ifstatement", 
		"forstatement", "cond"
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
		public FuncdeclsContext funcdecls() {
			return getRuleContext(FuncdeclsContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); funcdecls();
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

	public static class FuncdeclsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(jazzikParser.NEWLINE); }
		public FuncdeclContext funcdecl(int i) {
			return getRuleContext(FuncdeclContext.class,i);
		}
		public List<FuncdeclContext> funcdecl() {
			return getRuleContexts(FuncdeclContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(jazzikParser.NEWLINE, i);
		}
		public FuncdeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncdecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncdecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncdecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdeclsContext funcdecls() throws RecognitionException {
		FuncdeclsContext _localctx = new FuncdeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcdecls);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(44); match(NEWLINE);
						}
						}
						setState(49);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(50); funcdecl();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(56); match(NEWLINE);
				}
				}
				setState(61);
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

	public static class FuncdeclContext extends ParserRuleContext {
		public FuncdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecl; }
	 
		public FuncdeclContext() { }
		public void copyFrom(FuncdeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncDefContext extends FuncdeclContext {
		public Token type;
		public Token name;
		public FuncargdeclsContext args;
		public FuncargdeclsContext funcargdecls() {
			return getRuleContext(FuncargdeclsContext.class,0);
		}
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncDefContext(FuncdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExternContext extends FuncdeclContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public List<FuncargdeclContext> funcargdecl() {
			return getRuleContexts(FuncargdeclContext.class);
		}
		public FuncargdeclContext funcargdecl(int i) {
			return getRuleContext(FuncargdeclContext.class,i);
		}
		public FuncExternContext(FuncdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncExtern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncExtern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncExtern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdeclContext funcdecl() throws RecognitionException {
		FuncdeclContext _localctx = new FuncdeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcdecl);
		int _la;
		try {
			setState(85);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case VOID_TYPE:
				_localctx = new FuncDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				((FuncDefContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT_TYPE || _la==VOID_TYPE) ) {
					((FuncDefContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(63); ((FuncDefContext)_localctx).name = match(ID);
				setState(64); match(PAREN_BEGIN);
				setState(66);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << INT_TYPE) | (1L << BOOL_TYPE))) != 0)) {
					{
					setState(65); ((FuncDefContext)_localctx).args = funcargdecls();
					}
				}

				setState(68); match(PAREN_END);
				setState(69); block();
				}
				break;
			case EXTERN:
				_localctx = new FuncExternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70); match(EXTERN);
				setState(71);
				_la = _input.LA(1);
				if ( !(_la==INT_TYPE || _la==VOID_TYPE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(72); match(ID);
				setState(73); match(PAREN_BEGIN);
				setState(75);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << INT_TYPE) | (1L << BOOL_TYPE))) != 0)) {
					{
					setState(74); funcargdecl();
					}
				}

				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(77); match(COMMA);
					setState(78); funcargdecl();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84); match(PAREN_END);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(jazzikParser.NEWLINE); }
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
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(87); match(NEWLINE);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(BLOCK_BEGIN);
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(94); match(NEWLINE);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100); statement();
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(102); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(101); match(NEWLINE);
							}
							}
							setState(104); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEWLINE );
						setState(106); statement();
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(114); match(NEWLINE);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120); match(BLOCK_END);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(121); match(NEWLINE);
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class AssignContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclContext extends StatementContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public VarDeclContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteContext extends StatementContext {
		public WriteargContext writearg(int i) {
			return getRuleContext(WriteargContext.class,i);
		}
		public List<WriteargContext> writearg() {
			return getRuleContexts(WriteargContext.class);
		}
		public WriteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ErrorNestedContext extends StatementContext {
		public FuncdeclContext funcdecl() {
			return getRuleContext(FuncdeclContext.class,0);
		}
		public ErrorNestedContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterErrorNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitErrorNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitErrorNested(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadContext extends StatementContext {
		public ReadargContext readarg(int i) {
			return getRuleContext(ReadargContext.class,i);
		}
		public List<ReadargContext> readarg() {
			return getRuleContexts(ReadargContext.class);
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
	public static class IfStmContext extends StatementContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public IfStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterIfStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitIfStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitIfStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStmContext extends StatementContext {
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public ForStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterForStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitForStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitForStm(this);
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127); assignment();
				}
				break;

			case 2:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128); vardecl();
				}
				break;

			case 3:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(129); match(WRITE);
				setState(130); writearg();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(131); match(COMMA);
					setState(132); writearg();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(138); match(READ);
				setState(139); readarg();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(140); match(COMMA);
					setState(141); readarg();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				_localctx = new ForStmContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(147); forstatement();
				}
				break;

			case 6:
				_localctx = new IfStmContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(148); ifstatement();
				}
				break;

			case 7:
				_localctx = new ReturnIntContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(149); match(RETURN);
				setState(151);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << SIZE) | (1L << ID) | (1L << PAREN_BEGIN))) != 0)) {
					{
					setState(150); expression(0);
					}
				}

				}
				break;

			case 8:
				_localctx = new ExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(153); expression(0);
				}
				break;

			case 9:
				_localctx = new ErrorNestedContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(154); funcdecl();
				 notifyErrorListeners("nested functions are not allowed"); 
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

	public static class WriteargContext extends ParserRuleContext {
		public WriteargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writearg; }
	 
		public WriteargContext() { }
		public void copyFrom(WriteargContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteStrContext extends WriteargContext {
		public TerminalNode STRING() { return getToken(jazzikParser.STRING, 0); }
		public WriteStrContext(WriteargContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterWriteStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitWriteStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitWriteStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteIntContext extends WriteargContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteIntContext(WriteargContext ctx) { copyFrom(ctx); }
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

	public final WriteargContext writearg() throws RecognitionException {
		WriteargContext _localctx = new WriteargContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_writearg);
		try {
			setState(161);
			switch (_input.LA(1)) {
			case INT:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case NEG:
			case SIZE:
			case ID:
			case PAREN_BEGIN:
				_localctx = new WriteIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159); expression(0);
				}
				break;
			case STRING:
				_localctx = new WriteStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160); match(STRING);
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

	public static class ReadargContext extends ParserRuleContext {
		public ReadargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readarg; }
	 
		public ReadargContext() { }
		public void copyFrom(ReadargContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadArrayContext extends ReadargContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReadArrayContext(ReadargContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterReadArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitReadArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitReadArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadIntContext extends ReadargContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public ReadIntContext(ReadargContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterReadInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitReadInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitReadInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadargContext readarg() throws RecognitionException {
		ReadargContext _localctx = new ReadargContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_readarg);
		try {
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ReadArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163); match(ID);
				setState(164); match(ARRAY_BEGIN);
				setState(165); expression(0);
				setState(166); match(ARRAY_END);
				}
				break;

			case 2:
				_localctx = new ReadIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168); match(ID);
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

	public static class VardeclContext extends ParserRuleContext {
		public IntvardeclContext intvardecl(int i) {
			return getRuleContext(IntvardeclContext.class,i);
		}
		public BoolvardeclContext boolvardecl(int i) {
			return getRuleContext(BoolvardeclContext.class,i);
		}
		public List<BoolvardeclContext> boolvardecl() {
			return getRuleContexts(BoolvardeclContext.class);
		}
		public List<IntvardeclContext> intvardecl() {
			return getRuleContexts(IntvardeclContext.class);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitVardecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vardecl);
		int _la;
		try {
			setState(189);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(171); match(INT_TYPE);
				setState(172); intvardecl();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(173); match(COMMA);
					setState(174); intvardecl();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); match(BOOL_TYPE);
				setState(181); boolvardecl();
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(182); match(COMMA);
					setState(183); boolvardecl();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class IntvardeclContext extends ParserRuleContext {
		public IntvardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intvardecl; }
	 
		public IntvardeclContext() { }
		public void copyFrom(IntvardeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDeclContext extends IntvardeclContext {
		public Token name;
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayDeclContext(IntvardeclContext ctx) { copyFrom(ctx); }
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
	public static class IntDeclContext extends IntvardeclContext {
		public Token name;
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IntDeclContext(IntvardeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterIntDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitIntDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitIntDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntvardeclContext intvardecl() throws RecognitionException {
		IntvardeclContext _localctx = new IntvardeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_intvardecl);
		int _la;
		try {
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new IntDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191); ((IntDeclContext)_localctx).name = match(ID);
				setState(194);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(192); match(ASSIGN);
					setState(193); expression(0);
					}
				}

				}
				break;

			case 2:
				_localctx = new ArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196); ((ArrayDeclContext)_localctx).name = match(ID);
				setState(197); match(ARRAY_BEGIN);
				setState(198); expression(0);
				setState(199); match(ARRAY_END);
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

	public static class BoolvardeclContext extends ParserRuleContext {
		public BoolvardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolvardecl; }
	 
		public BoolvardeclContext() { }
		public void copyFrom(BoolvardeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolDeclContext extends BoolvardeclContext {
		public Token name;
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BoolDeclContext(BoolvardeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterBoolDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitBoolDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitBoolDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolvardeclContext boolvardecl() throws RecognitionException {
		BoolvardeclContext _localctx = new BoolvardeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolvardecl);
		int _la;
		try {
			_localctx = new BoolDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203); ((BoolDeclContext)_localctx).name = match(ID);
			setState(206);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(204); match(ASSIGN);
				setState(205); cond();
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
	public static class AssignArrayContext extends AssignmentContext {
		public Token name;
		public ExpressionContext index;
		public ExpressionContext value;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssignArrayContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterAssignArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitAssignArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitAssignArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignIntContext extends AssignmentContext {
		public Token name;
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
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

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new AssignIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208); ((AssignIntContext)_localctx).name = match(ID);
				setState(209); match(ASSIGN);
				setState(210); expression(0);
				}
				break;

			case 2:
				_localctx = new AssignArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211); ((AssignArrayContext)_localctx).name = match(ID);
				setState(212); match(ARRAY_BEGIN);
				setState(213); ((AssignArrayContext)_localctx).index = expression(0);
				setState(214); match(ARRAY_END);
				setState(215); match(ASSIGN);
				setState(216); ((AssignArrayContext)_localctx).value = expression(0);
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
	public static class LogContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LogContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitLog(this);
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
	public static class CmpContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CmpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitCmp(this);
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
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public FuncargsContext funcargs() {
			return getRuleContext(FuncargsContext.class,0);
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
	public static class IncContext extends ExpressionContext {
		public Token op;
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public IncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitInc(this);
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
	public static class SizeContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public SizeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(221);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << NEG))) != 0)) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(222); expression(11);
				}
				break;

			case 2:
				{
				_localctx = new IncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				((IncContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((IncContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(224); match(ID);
				}
				break;

			case 3:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225); match(PAREN_BEGIN);
				setState(226); expression(0);
				setState(227); match(PAREN_END);
				}
				break;

			case 4:
				{
				_localctx = new SizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229); match(SIZE);
				setState(230); match(PAREN_BEGIN);
				setState(231); match(ID);
				setState(232); match(PAREN_END);
				}
				break;

			case 5:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233); match(ID);
				setState(234); match(PAREN_BEGIN);
				setState(236);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << SIZE) | (1L << ID) | (1L << PAREN_BEGIN))) != 0)) {
					{
					setState(235); funcargs();
					}
				}

				setState(238); match(PAREN_END);
				}
				break;

			case 6:
				{
				_localctx = new IntConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239); match(INT);
				}
				break;

			case 7:
				{
				_localctx = new VarsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240); varaccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(258);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(244);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(245); expression(11);
						}
						break;

					case 2:
						{
						_localctx = new BinContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(247);
						((BinContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IAND) | (1L << IOR) | (1L << IXOR))) != 0)) ) {
							((BinContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(248); expression(10);
						}
						break;

					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(250);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(251); expression(9);
						}
						break;

					case 4:
						{
						_localctx = new CmpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(253);
						((CmpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE))) != 0)) ) {
							((CmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(254); expression(8);
						}
						break;

					case 5:
						{
						_localctx = new LogContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(255);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(256);
						((LogContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(257); expression(7);
						}
						break;
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public FuncargsContext funcargs() {
			return getRuleContext(FuncargsContext.class,0);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFunccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(ID);
			setState(264); match(PAREN_BEGIN);
			setState(266);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << SIZE) | (1L << ID) | (1L << PAREN_BEGIN))) != 0)) {
				{
				setState(265); funcargs();
				}
			}

			setState(268); match(PAREN_END);
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

	public static class FuncargsContext extends ParserRuleContext {
		public List<FuncargContext> funcarg() {
			return getRuleContexts(FuncargContext.class);
		}
		public FuncargContext funcarg(int i) {
			return getRuleContext(FuncargContext.class,i);
		}
		public FuncargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncargsContext funcargs() throws RecognitionException {
		FuncargsContext _localctx = new FuncargsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); funcarg();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(271); match(COMMA);
				setState(272); funcarg();
				}
				}
				setState(277);
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

	public static class FuncargContext extends ParserRuleContext {
		public FuncargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcarg; }
	 
		public FuncargContext() { }
		public void copyFrom(FuncargContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncArgCondContext extends FuncargContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public FuncArgCondContext(FuncargContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncArgCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncArgCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncArgCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncArgExprContext extends FuncargContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncArgExprContext(FuncargContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncArgIDContext extends FuncargContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public FuncArgIDContext(FuncargContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncArgID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncArgID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncArgID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncargContext funcarg() throws RecognitionException {
		FuncargContext _localctx = new FuncargContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcarg);
		try {
			setState(281);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new FuncArgIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278); match(ID);
				}
				break;

			case 2:
				_localctx = new FuncArgExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279); expression(0);
				}
				break;

			case 3:
				_localctx = new FuncArgCondContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280); cond();
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
		enterRule(_localctx, 30, RULE_varaccess);
		try {
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new VarAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283); match(ID);
				}
				break;

			case 2:
				_localctx = new ArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284); match(ID);
				setState(285); match(ARRAY_BEGIN);
				setState(286); expression(0);
				setState(287); match(ARRAY_END);
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

	public static class FuncargdeclsContext extends ParserRuleContext {
		public FuncargdeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcargdecls; }
	 
		public FuncargdeclsContext() { }
		public void copyFrom(FuncargdeclsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncArgDeclsContext extends FuncargdeclsContext {
		public List<FuncargdeclContext> funcargdecl() {
			return getRuleContexts(FuncargdeclContext.class);
		}
		public FuncargdeclContext funcargdecl(int i) {
			return getRuleContext(FuncargdeclContext.class,i);
		}
		public FuncArgDeclsContext(FuncargdeclsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncArgDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncArgDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncArgDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncargdeclsContext funcargdecls() throws RecognitionException {
		FuncargdeclsContext _localctx = new FuncargdeclsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcargdecls);
		int _la;
		try {
			_localctx = new FuncArgDeclsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(291); funcargdecl();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(292); match(COMMA);
				setState(293); funcargdecl();
				}
				}
				setState(298);
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

	public static class FuncargdeclContext extends ParserRuleContext {
		public FuncargdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcargdecl; }
	 
		public FuncargdeclContext() { }
		public void copyFrom(FuncargdeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncArgDeclContext extends FuncargdeclContext {
		public Token type;
		public Token name;
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public FuncArgDeclContext(FuncargdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncArgDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncArgDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncArgDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncargdeclContext funcargdecl() throws RecognitionException {
		FuncargdeclContext _localctx = new FuncargdeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcargdecl);
		int _la;
		try {
			_localctx = new FuncArgDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			((FuncArgDeclContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << INT_TYPE) | (1L << BOOL_TYPE))) != 0)) ) {
				((FuncArgDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(300); ((FuncArgDeclContext)_localctx).name = match(ID);
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
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
	 
		public IfstatementContext() { }
		public void copyFrom(IfstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfContext extends IfstatementContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public IfContext(IfstatementContext ctx) { copyFrom(ctx); }
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
	public static class UnlessContext extends IfstatementContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public UnlessContext(IfstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterUnless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitUnless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitUnless(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifstatement);
		int _la;
		try {
			setState(316);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302); match(IF);
				setState(303); expression(0);
				setState(304); block();
				setState(307);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(305); match(ELSE);
					setState(306); block();
					}
				}

				}
				break;
			case UNLESS:
				_localctx = new UnlessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309); match(UNLESS);
				setState(310); expression(0);
				setState(311); block();
				setState(314);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(312); match(ELSE);
					setState(313); block();
					}
				}

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

	public static class ForstatementContext extends ParserRuleContext {
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
	 
		public ForstatementContext() { }
		public void copyFrom(ForstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileContext extends ForstatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(ForstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends ForstatementContext {
		public Token rtype;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForContext(ForstatementContext ctx) { copyFrom(ctx); }
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

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forstatement);
		int _la;
		try {
			setState(330);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(318); match(FOR);
				setState(319); match(ID);
				setState(320); match(IN);
				setState(321); expression(0);
				setState(322);
				((ForContext)_localctx).rtype = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC_RANGE || _la==EXC_RANGE) ) {
					((ForContext)_localctx).rtype = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(323); expression(0);
				setState(324); block();
				}
				break;
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(326); match(WHILE);
				setState(327); expression(0);
				setState(328); block();
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

	public static class CondContext extends ParserRuleContext {
		public Token op;
		public TerminalNode BOOL() { return getToken(jazzikParser.BOOL, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cond);
		int _la;
		try {
			setState(344);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332); expression(0);
				setState(333);
				((CondContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE))) != 0)) ) {
					((CondContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(334); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336); match(NEG);
				setState(337); cond();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338); match(PAREN_BEGIN);
				setState(339); cond();
				setState(340); match(PAREN_END);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(342); match(BOOL);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(343); match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 10 >= _localctx._p;

		case 1: return 9 >= _localctx._p;

		case 2: return 8 >= _localctx._p;

		case 3: return 7 >= _localctx._p;

		case 4: return 6 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\38\u015d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\7\3\60\n\3\f\3\16"+
		"\3\63\13\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3"+
		"\4\3\4\3\4\3\4\5\4E\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\3\4\7"+
		"\4R\n\4\f\4\16\4U\13\4\3\4\5\4X\n\4\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3"+
		"\5\7\5b\n\5\f\5\16\5e\13\5\3\5\3\5\6\5i\n\5\r\5\16\5j\3\5\7\5n\n\5\f\5"+
		"\16\5q\13\5\5\5s\n\5\3\5\7\5v\n\5\f\5\16\5y\13\5\3\5\3\5\7\5}\n\5\f\5"+
		"\16\5\u0080\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0088\n\6\f\6\16\6\u008b"+
		"\13\6\3\6\3\6\3\6\3\6\7\6\u0091\n\6\f\6\16\6\u0094\13\6\3\6\3\6\3\6\3"+
		"\6\5\6\u009a\n\6\3\6\3\6\3\6\3\6\5\6\u00a0\n\6\3\7\3\7\5\7\u00a4\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ac\n\b\3\t\3\t\3\t\3\t\7\t\u00b2\n\t\f\t"+
		"\16\t\u00b5\13\t\3\t\3\t\3\t\3\t\7\t\u00bb\n\t\f\t\16\t\u00be\13\t\5\t"+
		"\u00c0\n\t\3\n\3\n\3\n\5\n\u00c5\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cc\n\n"+
		"\3\13\3\13\3\13\5\13\u00d1\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00dd\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00ef\n\r\3\r\3\r\3\r\5\r\u00f4\n\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0105\n\r\f\r\16\r\u0108"+
		"\13\r\3\16\3\16\3\16\5\16\u010d\n\16\3\16\3\16\3\17\3\17\3\17\7\17\u0114"+
		"\n\17\f\17\16\17\u0117\13\17\3\20\3\20\3\20\5\20\u011c\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0124\n\21\3\22\3\22\3\22\7\22\u0129\n\22\f"+
		"\22\16\22\u012c\13\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u0136"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u013d\n\24\5\24\u013f\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u014d\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u015b"+
		"\n\26\3\26\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\f\4\2"+
		"\36\36  \4\2\16\17\24\24\3\2\n\13\4\2\f\r\20\20\3\2\21\23\3\2\16\17\3"+
		"\2\27\34\3\2\25\26\3\2\35\37\3\2\65\66\u0183\2,\3\2\2\2\4\67\3\2\2\2\6"+
		"W\3\2\2\2\b\\\3\2\2\2\n\u009f\3\2\2\2\f\u00a3\3\2\2\2\16\u00ab\3\2\2\2"+
		"\20\u00bf\3\2\2\2\22\u00cb\3\2\2\2\24\u00cd\3\2\2\2\26\u00dc\3\2\2\2\30"+
		"\u00f3\3\2\2\2\32\u0109\3\2\2\2\34\u0110\3\2\2\2\36\u011b\3\2\2\2 \u0123"+
		"\3\2\2\2\"\u0125\3\2\2\2$\u012d\3\2\2\2&\u013e\3\2\2\2(\u014c\3\2\2\2"+
		"*\u015a\3\2\2\2,-\5\4\3\2-\3\3\2\2\2.\60\7\67\2\2/.\3\2\2\2\60\63\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\66\5\6\4"+
		"\2\65\61\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28=\3\2\2\29\67\3"+
		"\2\2\2:<\7\67\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\5\3\2\2\2?"+
		"=\3\2\2\2@A\t\2\2\2AB\7.\2\2BD\7\61\2\2CE\5\"\22\2DC\3\2\2\2DE\3\2\2\2"+
		"EF\3\2\2\2FG\7\62\2\2GX\5\b\5\2HI\7(\2\2IJ\t\2\2\2JK\7.\2\2KM\7\61\2\2"+
		"LN\5$\23\2ML\3\2\2\2MN\3\2\2\2NS\3\2\2\2OP\7\7\2\2PR\5$\23\2QO\3\2\2\2"+
		"RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VX\7\62\2\2W@\3\2\2"+
		"\2WH\3\2\2\2X\7\3\2\2\2Y[\7\67\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3"+
		"\2\2\2]_\3\2\2\2^\\\3\2\2\2_r\7/\2\2`b\7\67\2\2a`\3\2\2\2be\3\2\2\2ca"+
		"\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fo\5\n\6\2gi\7\67\2\2hg\3\2\2\2"+
		"ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2ln\5\n\6\2mh\3\2\2\2nq\3\2\2\2"+
		"om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2rc\3\2\2\2rs\3\2\2\2sw\3\2\2\2"+
		"tv\7\67\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2"+
		"\2z~\7\60\2\2{}\7\67\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\t\3\2\2\2\u0080~\3\2\2\2\u0081\u00a0\5\26\f\2\u0082\u00a0\5\20"+
		"\t\2\u0083\u0084\7*\2\2\u0084\u0089\5\f\7\2\u0085\u0086\7\7\2\2\u0086"+
		"\u0088\5\f\7\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u00a0\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\7)\2\2\u008d\u0092\5\16\b\2\u008e\u008f\7\7\2\2\u008f\u0091\5\16"+
		"\b\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u00a0\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u00a0\5("+
		"\25\2\u0096\u00a0\5&\24\2\u0097\u0099\7+\2\2\u0098\u009a\5\30\r\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a0\3\2\2\2\u009b\u00a0\5\30"+
		"\r\2\u009c\u009d\5\6\4\2\u009d\u009e\b\6\1\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u0081\3\2\2\2\u009f\u0082\3\2\2\2\u009f\u0083\3\2\2\2\u009f\u008c\3\2"+
		"\2\2\u009f\u0095\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u0097\3\2\2\2\u009f"+
		"\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\13\3\2\2\2\u00a1\u00a4\5\30\r"+
		"\2\u00a2\u00a4\7\4\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\r"+
		"\3\2\2\2\u00a5\u00a6\7.\2\2\u00a6\u00a7\7\63\2\2\u00a7\u00a8\5\30\r\2"+
		"\u00a8\u00a9\7\64\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ac\7.\2\2\u00ab\u00a5"+
		"\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\17\3\2\2\2\u00ad\u00ae\7\36\2\2\u00ae"+
		"\u00b3\5\22\n\2\u00af\u00b0\7\7\2\2\u00b0\u00b2\5\22\n\2\u00b1\u00af\3"+
		"\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00c0\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\37\2\2\u00b7\u00bc\5"+
		"\24\13\2\u00b8\u00b9\7\7\2\2\u00b9\u00bb\5\24\13\2\u00ba\u00b8\3\2\2\2"+
		"\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00ad\3\2\2\2\u00bf\u00b6\3\2\2\2\u00c0"+
		"\21\3\2\2\2\u00c1\u00c4\7.\2\2\u00c2\u00c3\7\6\2\2\u00c3\u00c5\5\30\r"+
		"\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00cc\3\2\2\2\u00c6\u00c7"+
		"\7.\2\2\u00c7\u00c8\7\63\2\2\u00c8\u00c9\5\30\r\2\u00c9\u00ca\7\64\2\2"+
		"\u00ca\u00cc\3\2\2\2\u00cb\u00c1\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cc\23"+
		"\3\2\2\2\u00cd\u00d0\7.\2\2\u00ce\u00cf\7\6\2\2\u00cf\u00d1\5*\26\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\25\3\2\2\2\u00d2\u00d3\7.\2\2"+
		"\u00d3\u00d4\7\6\2\2\u00d4\u00dd\5\30\r\2\u00d5\u00d6\7.\2\2\u00d6\u00d7"+
		"\7\63\2\2\u00d7\u00d8\5\30\r\2\u00d8\u00d9\7\64\2\2\u00d9\u00da\7\6\2"+
		"\2\u00da\u00db\5\30\r\2\u00db\u00dd\3\2\2\2\u00dc\u00d2\3\2\2\2\u00dc"+
		"\u00d5\3\2\2\2\u00dd\27\3\2\2\2\u00de\u00df\b\r\1\2\u00df\u00e0\t\3\2"+
		"\2\u00e0\u00f4\5\30\r\2\u00e1\u00e2\t\4\2\2\u00e2\u00f4\7.\2\2\u00e3\u00e4"+
		"\7\61\2\2\u00e4\u00e5\5\30\r\2\u00e5\u00e6\7\62\2\2\u00e6\u00f4\3\2\2"+
		"\2\u00e7\u00e8\7!\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ea\7.\2\2\u00ea\u00f4"+
		"\7\62\2\2\u00eb\u00ec\7.\2\2\u00ec\u00ee\7\61\2\2\u00ed\u00ef\5\34\17"+
		"\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f4"+
		"\7\62\2\2\u00f1\u00f4\7\3\2\2\u00f2\u00f4\5 \21\2\u00f3\u00de\3\2\2\2"+
		"\u00f3\u00e1\3\2\2\2\u00f3\u00e3\3\2\2\2\u00f3\u00e7\3\2\2\2\u00f3\u00eb"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u0106\3\2\2\2\u00f5"+
		"\u00f6\6\r\2\3\u00f6\u00f7\t\5\2\2\u00f7\u0105\5\30\r\2\u00f8\u00f9\6"+
		"\r\3\3\u00f9\u00fa\t\6\2\2\u00fa\u0105\5\30\r\2\u00fb\u00fc\6\r\4\3\u00fc"+
		"\u00fd\t\7\2\2\u00fd\u0105\5\30\r\2\u00fe\u00ff\6\r\5\3\u00ff\u0100\t"+
		"\b\2\2\u0100\u0105\5\30\r\2\u0101\u0102\6\r\6\3\u0102\u0103\t\t\2\2\u0103"+
		"\u0105\5\30\r\2\u0104\u00f5\3\2\2\2\u0104\u00f8\3\2\2\2\u0104\u00fb\3"+
		"\2\2\2\u0104\u00fe\3\2\2\2\u0104\u0101\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\31\3\2\2\2\u0108\u0106\3\2\2"+
		"\2\u0109\u010a\7.\2\2\u010a\u010c\7\61\2\2\u010b\u010d\5\34\17\2\u010c"+
		"\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\62"+
		"\2\2\u010f\33\3\2\2\2\u0110\u0115\5\36\20\2\u0111\u0112\7\7\2\2\u0112"+
		"\u0114\5\36\20\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3"+
		"\2\2\2\u0115\u0116\3\2\2\2\u0116\35\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u011c\7.\2\2\u0119\u011c\5\30\r\2\u011a\u011c\5*\26\2\u011b\u0118\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\37\3\2\2\2\u011d\u0124"+
		"\7.\2\2\u011e\u011f\7.\2\2\u011f\u0120\7\63\2\2\u0120\u0121\5\30\r\2\u0121"+
		"\u0122\7\64\2\2\u0122\u0124\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u011e\3"+
		"\2\2\2\u0124!\3\2\2\2\u0125\u012a\5$\23\2\u0126\u0127\7\7\2\2\u0127\u0129"+
		"\5$\23\2\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b#\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\t\n\2\2"+
		"\u012e\u012f\7.\2\2\u012f%\3\2\2\2\u0130\u0131\7\"\2\2\u0131\u0132\5\30"+
		"\r\2\u0132\u0135\5\b\5\2\u0133\u0134\7$\2\2\u0134\u0136\5\b\5\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013f\3\2\2\2\u0137\u0138\7#"+
		"\2\2\u0138\u0139\5\30\r\2\u0139\u013c\5\b\5\2\u013a\u013b\7$\2\2\u013b"+
		"\u013d\5\b\5\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2"+
		"\2\2\u013e\u0130\3\2\2\2\u013e\u0137\3\2\2\2\u013f\'\3\2\2\2\u0140\u0141"+
		"\7%\2\2\u0141\u0142\7.\2\2\u0142\u0143\7&\2\2\u0143\u0144\5\30\r\2\u0144"+
		"\u0145\t\13\2\2\u0145\u0146\5\30\r\2\u0146\u0147\5\b\5\2\u0147\u014d\3"+
		"\2\2\2\u0148\u0149\7\'\2\2\u0149\u014a\5\30\r\2\u014a\u014b\5\b\5\2\u014b"+
		"\u014d\3\2\2\2\u014c\u0140\3\2\2\2\u014c\u0148\3\2\2\2\u014d)\3\2\2\2"+
		"\u014e\u014f\5\30\r\2\u014f\u0150\t\b\2\2\u0150\u0151\5\30\r\2\u0151\u015b"+
		"\3\2\2\2\u0152\u0153\7\24\2\2\u0153\u015b\5*\26\2\u0154\u0155\7\61\2\2"+
		"\u0155\u0156\5*\26\2\u0156\u0157\7\62\2\2\u0157\u015b\3\2\2\2\u0158\u015b"+
		"\7\5\2\2\u0159\u015b\7.\2\2\u015a\u014e\3\2\2\2\u015a\u0152\3\2\2\2\u015a"+
		"\u0154\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b+\3\2\2\2"+
		"+\61\67=DMSW\\cjorw~\u0089\u0092\u0099\u009f\u00a3\u00ab\u00b3\u00bc\u00bf"+
		"\u00c4\u00cb\u00d0\u00dc\u00ee\u00f3\u0104\u0106\u010c\u0115\u011b\u0123"+
		"\u012a\u0135\u013c\u013e\u014c\u015a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}