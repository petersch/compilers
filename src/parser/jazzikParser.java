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
		public Token type;
		public Token name;
		public FuncargdeclsContext args;
		public FuncargdeclsContext funcargdecls() {
			return getRuleContext(FuncargdeclsContext.class,0);
		}
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
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
			setState(78);
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
				((FuncExternContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT_TYPE || _la==VOID_TYPE) ) {
					((FuncExternContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(72); ((FuncExternContext)_localctx).name = match(ID);
				setState(73); match(PAREN_BEGIN);
				setState(75);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << INT_TYPE) | (1L << BOOL_TYPE))) != 0)) {
					{
					setState(74); ((FuncExternContext)_localctx).args = funcargdecls();
					}
				}

				setState(77); match(PAREN_END);
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(80); match(NEWLINE);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86); match(BLOCK_BEGIN);
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
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
				setState(93); statement();
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(95); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(94); match(NEWLINE);
							}
							}
							setState(97); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEWLINE );
						setState(99); statement();
						}
						} 
					}
					setState(104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(107); match(NEWLINE);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113); match(BLOCK_END);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(114); match(NEWLINE);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120); assignment();
				}
				break;

			case 2:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121); vardecl();
				}
				break;

			case 3:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(122); match(WRITE);
				setState(123); writearg();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(124); match(COMMA);
					setState(125); writearg();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(131); match(READ);
				setState(132); readarg();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(133); match(COMMA);
					setState(134); readarg();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				_localctx = new ForStmContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(140); forstatement();
				}
				break;

			case 6:
				_localctx = new IfStmContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(141); ifstatement();
				}
				break;

			case 7:
				_localctx = new ReturnIntContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(142); match(RETURN);
				setState(144);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << SIZE) | (1L << ID) | (1L << PAREN_BEGIN))) != 0)) {
					{
					setState(143); expression(0);
					}
				}

				}
				break;

			case 8:
				_localctx = new ExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(146); expression(0);
				}
				break;

			case 9:
				_localctx = new ErrorNestedContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(147); funcdecl();
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
			setState(154);
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
				setState(152); expression(0);
				}
				break;
			case STRING:
				_localctx = new WriteStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153); match(STRING);
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
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ReadArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156); match(ID);
				setState(157); match(ARRAY_BEGIN);
				setState(158); expression(0);
				setState(159); match(ARRAY_END);
				}
				break;

			case 2:
				_localctx = new ReadIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(ID);
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
			setState(182);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(164); match(INT_TYPE);
				setState(165); intvardecl();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(166); match(COMMA);
					setState(167); intvardecl();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(173); match(BOOL_TYPE);
				setState(174); boolvardecl();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(175); match(COMMA);
					setState(176); boolvardecl();
					}
					}
					setState(181);
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
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new IntDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184); ((IntDeclContext)_localctx).name = match(ID);
				setState(187);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(185); match(ASSIGN);
					setState(186); expression(0);
					}
				}

				}
				break;

			case 2:
				_localctx = new ArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189); ((ArrayDeclContext)_localctx).name = match(ID);
				setState(190); match(ARRAY_BEGIN);
				setState(191); expression(0);
				setState(192); match(ARRAY_END);
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
			setState(196); ((BoolDeclContext)_localctx).name = match(ID);
			setState(199);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(197); match(ASSIGN);
				setState(198); cond();
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
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new AssignIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201); ((AssignIntContext)_localctx).name = match(ID);
				setState(202); match(ASSIGN);
				setState(203); expression(0);
				}
				break;

			case 2:
				_localctx = new AssignArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204); ((AssignArrayContext)_localctx).name = match(ID);
				setState(205); match(ARRAY_BEGIN);
				setState(206); ((AssignArrayContext)_localctx).index = expression(0);
				setState(207); match(ARRAY_END);
				setState(208); match(ASSIGN);
				setState(209); ((AssignArrayContext)_localctx).value = expression(0);
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
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(214);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << NEG))) != 0)) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(215); expression(11);
				}
				break;

			case 2:
				{
				_localctx = new IncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				((IncContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((IncContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(217); match(ID);
				}
				break;

			case 3:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218); match(PAREN_BEGIN);
				setState(219); expression(0);
				setState(220); match(PAREN_END);
				}
				break;

			case 4:
				{
				_localctx = new SizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222); match(SIZE);
				setState(223); match(PAREN_BEGIN);
				setState(224); match(ID);
				setState(225); match(PAREN_END);
				}
				break;

			case 5:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226); match(ID);
				setState(227); match(PAREN_BEGIN);
				setState(229);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << SIZE) | (1L << ID) | (1L << PAREN_BEGIN))) != 0)) {
					{
					setState(228); funcargs();
					}
				}

				setState(231); match(PAREN_END);
				}
				break;

			case 6:
				{
				_localctx = new IntConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232); match(INT);
				}
				break;

			case 7:
				{
				_localctx = new VarsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233); varaccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(251);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(237);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(238); expression(11);
						}
						break;

					case 2:
						{
						_localctx = new BinContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(239);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(240);
						((BinContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IAND) | (1L << IOR) | (1L << IXOR))) != 0)) ) {
							((BinContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(241); expression(10);
						}
						break;

					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(243);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(244); expression(9);
						}
						break;

					case 4:
						{
						_localctx = new CmpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(246);
						((CmpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE))) != 0)) ) {
							((CmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(247); expression(8);
						}
						break;

					case 5:
						{
						_localctx = new LogContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(249);
						((LogContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(250); expression(7);
						}
						break;
					}
					} 
				}
				setState(255);
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
			setState(256); match(ID);
			setState(257); match(PAREN_BEGIN);
			setState(259);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << SIZE) | (1L << ID) | (1L << PAREN_BEGIN))) != 0)) {
				{
				setState(258); funcargs();
				}
			}

			setState(261); match(PAREN_END);
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
			setState(263); funcarg();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(264); match(COMMA);
				setState(265); funcarg();
				}
				}
				setState(270);
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
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new FuncArgIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271); match(ID);
				}
				break;

			case 2:
				_localctx = new FuncArgExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272); expression(0);
				}
				break;

			case 3:
				_localctx = new FuncArgCondContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273); cond();
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
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new VarAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276); match(ID);
				}
				break;

			case 2:
				_localctx = new ArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277); match(ID);
				setState(278); match(ARRAY_BEGIN);
				setState(279); expression(0);
				setState(280); match(ARRAY_END);
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
			setState(284); funcargdecl();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(285); match(COMMA);
				setState(286); funcargdecl();
				}
				}
				setState(291);
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
			setState(292);
			((FuncArgDeclContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << INT_TYPE) | (1L << BOOL_TYPE))) != 0)) ) {
				((FuncArgDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(293); ((FuncArgDeclContext)_localctx).name = match(ID);
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
			setState(309);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295); match(IF);
				setState(296); expression(0);
				setState(297); block();
				setState(300);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(298); match(ELSE);
					setState(299); block();
					}
				}

				}
				break;
			case UNLESS:
				_localctx = new UnlessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(302); match(UNLESS);
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
			setState(323);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311); match(FOR);
				setState(312); match(ID);
				setState(313); match(IN);
				setState(314); expression(0);
				setState(315);
				((ForContext)_localctx).rtype = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC_RANGE || _la==EXC_RANGE) ) {
					((ForContext)_localctx).rtype = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(316); expression(0);
				setState(317); block();
				}
				break;
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319); match(WHILE);
				setState(320); expression(0);
				setState(321); block();
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
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325); expression(0);
				setState(326);
				((CondContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE))) != 0)) ) {
					((CondContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(327); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329); match(NEG);
				setState(330); cond();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(331); match(PAREN_BEGIN);
				setState(332); cond();
				setState(333); match(PAREN_END);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335); match(BOOL);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336); match(ID);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\38\u0156\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\7\3\60\n\3\f\3\16"+
		"\3\63\13\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3"+
		"\4\3\4\3\4\3\4\5\4E\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\5\4Q"+
		"\n\4\3\5\7\5T\n\5\f\5\16\5W\13\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3"+
		"\5\6\5b\n\5\r\5\16\5c\3\5\7\5g\n\5\f\5\16\5j\13\5\5\5l\n\5\3\5\7\5o\n"+
		"\5\f\5\16\5r\13\5\3\5\3\5\7\5v\n\5\f\5\16\5y\13\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6\u0081\n\6\f\6\16\6\u0084\13\6\3\6\3\6\3\6\3\6\7\6\u008a\n\6\f"+
		"\6\16\6\u008d\13\6\3\6\3\6\3\6\3\6\5\6\u0093\n\6\3\6\3\6\3\6\3\6\5\6\u0099"+
		"\n\6\3\7\3\7\5\7\u009d\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a5\n\b\3\t\3"+
		"\t\3\t\3\t\7\t\u00ab\n\t\f\t\16\t\u00ae\13\t\3\t\3\t\3\t\3\t\7\t\u00b4"+
		"\n\t\f\t\16\t\u00b7\13\t\5\t\u00b9\n\t\3\n\3\n\3\n\5\n\u00be\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00c5\n\n\3\13\3\13\3\13\5\13\u00ca\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d6\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e8\n\r\3\r\3\r\3\r\5\r\u00ed"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fe"+
		"\n\r\f\r\16\r\u0101\13\r\3\16\3\16\3\16\5\16\u0106\n\16\3\16\3\16\3\17"+
		"\3\17\3\17\7\17\u010d\n\17\f\17\16\17\u0110\13\17\3\20\3\20\3\20\5\20"+
		"\u0115\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u011d\n\21\3\22\3\22\3"+
		"\22\7\22\u0122\n\22\f\22\16\22\u0125\13\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u012f\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0136\n\24"+
		"\5\24\u0138\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0146\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0154\n\26\3\26\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*\2\f\4\2\36\36  \4\2\16\17\24\24\3\2\n\13\4\2\f\r\20\20\3"+
		"\2\21\23\3\2\16\17\3\2\27\34\3\2\25\26\3\2\35\37\3\2\65\66\u017b\2,\3"+
		"\2\2\2\4\67\3\2\2\2\6P\3\2\2\2\bU\3\2\2\2\n\u0098\3\2\2\2\f\u009c\3\2"+
		"\2\2\16\u00a4\3\2\2\2\20\u00b8\3\2\2\2\22\u00c4\3\2\2\2\24\u00c6\3\2\2"+
		"\2\26\u00d5\3\2\2\2\30\u00ec\3\2\2\2\32\u0102\3\2\2\2\34\u0109\3\2\2\2"+
		"\36\u0114\3\2\2\2 \u011c\3\2\2\2\"\u011e\3\2\2\2$\u0126\3\2\2\2&\u0137"+
		"\3\2\2\2(\u0145\3\2\2\2*\u0153\3\2\2\2,-\5\4\3\2-\3\3\2\2\2.\60\7\67\2"+
		"\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63"+
		"\61\3\2\2\2\64\66\5\6\4\2\65\61\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678"+
		"\3\2\2\28=\3\2\2\29\67\3\2\2\2:<\7\67\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2"+
		"\2=>\3\2\2\2>\5\3\2\2\2?=\3\2\2\2@A\t\2\2\2AB\7.\2\2BD\7\61\2\2CE\5\""+
		"\22\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\62\2\2GQ\5\b\5\2HI\7(\2\2IJ\t"+
		"\2\2\2JK\7.\2\2KM\7\61\2\2LN\5\"\22\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ"+
		"\7\62\2\2P@\3\2\2\2PH\3\2\2\2Q\7\3\2\2\2RT\7\67\2\2SR\3\2\2\2TW\3\2\2"+
		"\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2Xk\7/\2\2Y[\7\67\2\2ZY\3\2\2"+
		"\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_h\5\n\6\2`b\7"+
		"\67\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2eg\5\n\6\2fa"+
		"\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2k\\\3\2\2\2"+
		"kl\3\2\2\2lp\3\2\2\2mo\7\67\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2"+
		"\2qs\3\2\2\2rp\3\2\2\2sw\7\60\2\2tv\7\67\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2"+
		"\2\2wx\3\2\2\2x\t\3\2\2\2yw\3\2\2\2z\u0099\5\26\f\2{\u0099\5\20\t\2|}"+
		"\7*\2\2}\u0082\5\f\7\2~\177\7\7\2\2\177\u0081\5\f\7\2\u0080~\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0099\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7)\2\2\u0086\u008b\5\16\b\2\u0087"+
		"\u0088\7\7\2\2\u0088\u008a\5\16\b\2\u0089\u0087\3\2\2\2\u008a\u008d\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0099\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0099\5(\25\2\u008f\u0099\5&\24\2\u0090\u0092\7+"+
		"\2\2\u0091\u0093\5\30\r\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0099\3\2\2\2\u0094\u0099\5\30\r\2\u0095\u0096\5\6\4\2\u0096\u0097\b"+
		"\6\1\2\u0097\u0099\3\2\2\2\u0098z\3\2\2\2\u0098{\3\2\2\2\u0098|\3\2\2"+
		"\2\u0098\u0085\3\2\2\2\u0098\u008e\3\2\2\2\u0098\u008f\3\2\2\2\u0098\u0090"+
		"\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2\2\2\u0099\13\3\2\2\2\u009a"+
		"\u009d\5\30\r\2\u009b\u009d\7\4\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3"+
		"\2\2\2\u009d\r\3\2\2\2\u009e\u009f\7.\2\2\u009f\u00a0\7\63\2\2\u00a0\u00a1"+
		"\5\30\r\2\u00a1\u00a2\7\64\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a5\7.\2\2"+
		"\u00a4\u009e\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\17\3\2\2\2\u00a6\u00a7"+
		"\7\36\2\2\u00a7\u00ac\5\22\n\2\u00a8\u00a9\7\7\2\2\u00a9\u00ab\5\22\n"+
		"\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00b9\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\37\2\2"+
		"\u00b0\u00b5\5\24\13\2\u00b1\u00b2\7\7\2\2\u00b2\u00b4\5\24\13\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00a6\3\2\2\2\u00b8"+
		"\u00af\3\2\2\2\u00b9\21\3\2\2\2\u00ba\u00bd\7.\2\2\u00bb\u00bc\7\6\2\2"+
		"\u00bc\u00be\5\30\r\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c5"+
		"\3\2\2\2\u00bf\u00c0\7.\2\2\u00c0\u00c1\7\63\2\2\u00c1\u00c2\5\30\r\2"+
		"\u00c2\u00c3\7\64\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00bf"+
		"\3\2\2\2\u00c5\23\3\2\2\2\u00c6\u00c9\7.\2\2\u00c7\u00c8\7\6\2\2\u00c8"+
		"\u00ca\5*\26\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\25\3\2\2"+
		"\2\u00cb\u00cc\7.\2\2\u00cc\u00cd\7\6\2\2\u00cd\u00d6\5\30\r\2\u00ce\u00cf"+
		"\7.\2\2\u00cf\u00d0\7\63\2\2\u00d0\u00d1\5\30\r\2\u00d1\u00d2\7\64\2\2"+
		"\u00d2\u00d3\7\6\2\2\u00d3\u00d4\5\30\r\2\u00d4\u00d6\3\2\2\2\u00d5\u00cb"+
		"\3\2\2\2\u00d5\u00ce\3\2\2\2\u00d6\27\3\2\2\2\u00d7\u00d8\b\r\1\2\u00d8"+
		"\u00d9\t\3\2\2\u00d9\u00ed\5\30\r\2\u00da\u00db\t\4\2\2\u00db\u00ed\7"+
		".\2\2\u00dc\u00dd\7\61\2\2\u00dd\u00de\5\30\r\2\u00de\u00df\7\62\2\2\u00df"+
		"\u00ed\3\2\2\2\u00e0\u00e1\7!\2\2\u00e1\u00e2\7\61\2\2\u00e2\u00e3\7."+
		"\2\2\u00e3\u00ed\7\62\2\2\u00e4\u00e5\7.\2\2\u00e5\u00e7\7\61\2\2\u00e6"+
		"\u00e8\5\34\17\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3"+
		"\2\2\2\u00e9\u00ed\7\62\2\2\u00ea\u00ed\7\3\2\2\u00eb\u00ed\5 \21\2\u00ec"+
		"\u00d7\3\2\2\2\u00ec\u00da\3\2\2\2\u00ec\u00dc\3\2\2\2\u00ec\u00e0\3\2"+
		"\2\2\u00ec\u00e4\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00ff\3\2\2\2\u00ee\u00ef\6\r\2\3\u00ef\u00f0\t\5\2\2\u00f0\u00fe\5\30"+
		"\r\2\u00f1\u00f2\6\r\3\3\u00f2\u00f3\t\6\2\2\u00f3\u00fe\5\30\r\2\u00f4"+
		"\u00f5\6\r\4\3\u00f5\u00f6\t\7\2\2\u00f6\u00fe\5\30\r\2\u00f7\u00f8\6"+
		"\r\5\3\u00f8\u00f9\t\b\2\2\u00f9\u00fe\5\30\r\2\u00fa\u00fb\6\r\6\3\u00fb"+
		"\u00fc\t\t\2\2\u00fc\u00fe\5\30\r\2\u00fd\u00ee\3\2\2\2\u00fd\u00f1\3"+
		"\2\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\31\3\2\2"+
		"\2\u0101\u00ff\3\2\2\2\u0102\u0103\7.\2\2\u0103\u0105\7\61\2\2\u0104\u0106"+
		"\5\34\17\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\u0108\7\62\2\2\u0108\33\3\2\2\2\u0109\u010e\5\36\20\2\u010a\u010b"+
		"\7\7\2\2\u010b\u010d\5\36\20\2\u010c\u010a\3\2\2\2\u010d\u0110\3\2\2\2"+
		"\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\35\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0111\u0115\7.\2\2\u0112\u0115\5\30\r\2\u0113\u0115\5*\26\2\u0114"+
		"\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\37\3\2\2"+
		"\2\u0116\u011d\7.\2\2\u0117\u0118\7.\2\2\u0118\u0119\7\63\2\2\u0119\u011a"+
		"\5\30\r\2\u011a\u011b\7\64\2\2\u011b\u011d\3\2\2\2\u011c\u0116\3\2\2\2"+
		"\u011c\u0117\3\2\2\2\u011d!\3\2\2\2\u011e\u0123\5$\23\2\u011f\u0120\7"+
		"\7\2\2\u0120\u0122\5$\23\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124#\3\2\2\2\u0125\u0123\3\2\2\2"+
		"\u0126\u0127\t\n\2\2\u0127\u0128\7.\2\2\u0128%\3\2\2\2\u0129\u012a\7\""+
		"\2\2\u012a\u012b\5\30\r\2\u012b\u012e\5\b\5\2\u012c\u012d\7$\2\2\u012d"+
		"\u012f\5\b\5\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0138\3\2"+
		"\2\2\u0130\u0131\7#\2\2\u0131\u0132\5\30\r\2\u0132\u0135\5\b\5\2\u0133"+
		"\u0134\7$\2\2\u0134\u0136\5\b\5\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0138\3\2\2\2\u0137\u0129\3\2\2\2\u0137\u0130\3\2\2\2\u0138"+
		"\'\3\2\2\2\u0139\u013a\7%\2\2\u013a\u013b\7.\2\2\u013b\u013c\7&\2\2\u013c"+
		"\u013d\5\30\r\2\u013d\u013e\t\13\2\2\u013e\u013f\5\30\r\2\u013f\u0140"+
		"\5\b\5\2\u0140\u0146\3\2\2\2\u0141\u0142\7\'\2\2\u0142\u0143\5\30\r\2"+
		"\u0143\u0144\5\b\5\2\u0144\u0146\3\2\2\2\u0145\u0139\3\2\2\2\u0145\u0141"+
		"\3\2\2\2\u0146)\3\2\2\2\u0147\u0148\5\30\r\2\u0148\u0149\t\b\2\2\u0149"+
		"\u014a\5\30\r\2\u014a\u0154\3\2\2\2\u014b\u014c\7\24\2\2\u014c\u0154\5"+
		"*\26\2\u014d\u014e\7\61\2\2\u014e\u014f\5*\26\2\u014f\u0150\7\62\2\2\u0150"+
		"\u0154\3\2\2\2\u0151\u0154\7\5\2\2\u0152\u0154\7.\2\2\u0153\u0147\3\2"+
		"\2\2\u0153\u014b\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0152\3\2\2\2\u0154+\3\2\2\2*\61\67=DMPU\\chkpw\u0082\u008b\u0092\u0098"+
		"\u009c\u00a4\u00ac\u00b5\u00b8\u00bd\u00c4\u00c9\u00d5\u00e7\u00ec\u00fd"+
		"\u00ff\u0105\u010e\u0114\u011c\u0123\u012e\u0135\u0137\u0145\u0153";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}