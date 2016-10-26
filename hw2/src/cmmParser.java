// Generated from /Users/Lucius/IdeaProjects/cmm/cmm.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, Else=2, While=3, Read=4, Write=5, Int=6, Double=7, Break=8, Ident=9, 
		IntConstant=10, RealConstant=11, BooleanConstant=12, CompOp=13, MulDivMod=14, 
		AddMin=15, LParen=16, RParen=17, LCurly=18, RCurly=19, LBracket=20, RBracket=21, 
		Assign=22, LineEnd=23, Comma=24, WS=25, SL_COMMENT=26, MUL_COMMENT=27;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_stmt_block = 2, RULE_var_decl = 3, 
		RULE_type = 4, RULE_var_list = 5, RULE_decl_assign = 6, RULE_if_stmt = 7, 
		RULE_while_stmt = 8, RULE_break_stmt = 9, RULE_read_stmt = 10, RULE_write_stmt = 11, 
		RULE_assign_stmt = 12, RULE_value = 13, RULE_constant = 14, RULE_expr = 15, 
		RULE_if_ = 16, RULE_else_ = 17, RULE_while_ = 18, RULE_read_ = 19, RULE_write_ = 20, 
		RULE_int_ = 21, RULE_double_ = 22, RULE_break_ = 23, RULE_ident = 24, 
		RULE_intconstant = 25, RULE_realconstant = 26, RULE_booleanconstant = 27, 
		RULE_compop = 28, RULE_muldivmod = 29, RULE_addmin = 30, RULE_lparen = 31, 
		RULE_rparen = 32, RULE_lcurly = 33, RULE_rcurly = 34, RULE_lbracket = 35, 
		RULE_rbracket = 36, RULE_assign = 37, RULE_lineend = 38, RULE_comma = 39;
	public static final String[] ruleNames = {
		"program", "stmt", "stmt_block", "var_decl", "type", "var_list", "decl_assign", 
		"if_stmt", "while_stmt", "break_stmt", "read_stmt", "write_stmt", "assign_stmt", 
		"value", "constant", "expr", "if_", "else_", "while_", "read_", "write_", 
		"int_", "double_", "break_", "ident", "intconstant", "realconstant", "booleanconstant", 
		"compop", "muldivmod", "addmin", "lparen", "rparen", "lcurly", "rcurly", 
		"lbracket", "rbracket", "assign", "lineend", "comma"
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

	@Override
	public String getGrammarFileName() { return "cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				stmt();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Read) | (1L << Write) | (1L << Int) | (1L << Double) | (1L << Break) | (1L << Ident) | (1L << LParen) | (1L << LCurly))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhilestmtContext extends StmtContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public WhilestmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtblockContext extends StmtContext {
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public StmtblockContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterStmtblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitStmtblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitStmtblock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfstmtContext extends StmtContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public IfstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadstmtContext extends StmtContext {
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class,0);
		}
		public ReadstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterReadstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitReadstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitReadstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignstmtContext extends StmtContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public AssignstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterAssignstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitAssignstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitAssignstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakstmtContext extends StmtContext {
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public BreakstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterBreakstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitBreakstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitBreakstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VardeclContext extends StmtContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public VardeclContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitVardecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WritestmtContext extends StmtContext {
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class,0);
		}
		public WritestmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterWritestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitWritestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitWritestmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LParenStmtRParenContext extends StmtContext {
		public TerminalNode LParen() { return getToken(cmmParser.LParen, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode RParen() { return getToken(cmmParser.RParen, 0); }
		public LParenStmtRParenContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterLParenStmtRParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitLParenStmtRParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitLParenStmtRParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(97);
			switch (_input.LA(1)) {
			case Int:
			case Double:
				_localctx = new VardeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				var_decl();
				}
				break;
			case If:
				_localctx = new IfstmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				if_stmt();
				}
				break;
			case While:
				_localctx = new WhilestmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				while_stmt();
				}
				break;
			case Break:
				_localctx = new BreakstmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				break_stmt();
				}
				break;
			case Ident:
				_localctx = new AssignstmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				assign_stmt();
				}
				break;
			case Read:
				_localctx = new ReadstmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				read_stmt();
				}
				break;
			case Write:
				_localctx = new WritestmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				write_stmt();
				}
				break;
			case LCurly:
				_localctx = new StmtblockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				stmt_block();
				}
				break;
			case LParen:
				_localctx = new LParenStmtRParenContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(93);
				match(LParen);
				setState(94);
				stmt();
				setState(95);
				match(RParen);
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

	public static class Stmt_blockContext extends ParserRuleContext {
		public LcurlyContext lcurly() {
			return getRuleContext(LcurlyContext.class,0);
		}
		public RcurlyContext rcurly() {
			return getRuleContext(RcurlyContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterStmt_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitStmt_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitStmt_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			lcurly();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Read) | (1L << Write) | (1L << Int) | (1L << Double) | (1L << Break) | (1L << Ident) | (1L << LParen) | (1L << LCurly))) != 0)) {
				{
				{
				setState(100);
				stmt();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			rcurly();
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

	public static class Var_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_listContext var_list() {
			return getRuleContext(Var_listContext.class,0);
		}
		public LineendContext lineend() {
			return getRuleContext(LineendContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			type(0);
			setState(109);
			var_list();
			setState(110);
			lineend();
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

	public static class TypeContext extends ParserRuleContext {
		public Int_Context int_() {
			return getRuleContext(Int_Context.class,0);
		}
		public Double_Context double_() {
			return getRuleContext(Double_Context.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LbracketContext lbracket() {
			return getRuleContext(LbracketContext.class,0);
		}
		public IntconstantContext intconstant() {
			return getRuleContext(IntconstantContext.class,0);
		}
		public RbracketContext rbracket() {
			return getRuleContext(RbracketContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			switch (_input.LA(1)) {
			case Int:
				{
				setState(113);
				int_();
				}
				break;
			case Double:
				{
				setState(114);
				double_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(117);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(118);
					lbracket();
					setState(119);
					intconstant();
					setState(120);
					rbracket();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Var_listContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public Var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterVar_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitVar_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitVar_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_listContext var_list() throws RecognitionException {
		Var_listContext _localctx = new Var_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			ident();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(128);
				comma();
				setState(129);
				ident();
				}
				}
				setState(135);
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

	public static class Decl_assignContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Decl_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterDecl_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitDecl_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitDecl_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_assignContext decl_assign() throws RecognitionException {
		Decl_assignContext _localctx = new Decl_assignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			ident();
			setState(137);
			assign();
			setState(138);
			expr(0);
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

	public static class If_stmtContext extends ParserRuleContext {
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_stmt);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				if_();
				setState(141);
				expr(0);
				setState(142);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				if_();
				setState(145);
				expr(0);
				setState(146);
				stmt();
				setState(147);
				else_();
				setState(148);
				stmt();
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

	public static class While_stmtContext extends ParserRuleContext {
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			while_();
			setState(153);
			expr(0);
			setState(154);
			stmt();
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

	public static class Break_stmtContext extends ParserRuleContext {
		public Break_Context break_() {
			return getRuleContext(Break_Context.class,0);
		}
		public LineendContext lineend() {
			return getRuleContext(LineendContext.class,0);
		}
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			break_();
			setState(157);
			lineend();
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

	public static class Read_stmtContext extends ParserRuleContext {
		public Read_Context read_() {
			return getRuleContext(Read_Context.class,0);
		}
		public LparenContext lparen() {
			return getRuleContext(LparenContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public LineendContext lineend() {
			return getRuleContext(LineendContext.class,0);
		}
		public LbracketContext lbracket() {
			return getRuleContext(LbracketContext.class,0);
		}
		public IntconstantContext intconstant() {
			return getRuleContext(IntconstantContext.class,0);
		}
		public RbracketContext rbracket() {
			return getRuleContext(RbracketContext.class,0);
		}
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterRead_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitRead_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitRead_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_read_stmt);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				read_();
				setState(160);
				lparen();
				setState(161);
				ident();
				setState(162);
				rparen();
				setState(163);
				lineend();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				read_();
				setState(166);
				lparen();
				setState(167);
				ident();
				setState(168);
				lbracket();
				setState(169);
				intconstant();
				setState(170);
				rbracket();
				setState(171);
				lineend();
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

	public static class Write_stmtContext extends ParserRuleContext {
		public Write_Context write_() {
			return getRuleContext(Write_Context.class,0);
		}
		public LparenContext lparen() {
			return getRuleContext(LparenContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public LineendContext lineend() {
			return getRuleContext(LineendContext.class,0);
		}
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterWrite_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitWrite_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitWrite_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			write_();
			setState(176);
			lparen();
			setState(177);
			expr(0);
			setState(178);
			rparen();
			setState(179);
			lineend();
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LineendContext lineend() {
			return getRuleContext(LineendContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			value();
			setState(182);
			assign();
			setState(183);
			expr(0);
			setState(184);
			lineend();
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

	public static class ValueContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public LbracketContext lbracket() {
			return getRuleContext(LbracketContext.class,0);
		}
		public IntconstantContext intconstant() {
			return getRuleContext(IntconstantContext.class,0);
		}
		public RbracketContext rbracket() {
			return getRuleContext(RbracketContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				ident();
				setState(188);
				lbracket();
				setState(189);
				intconstant();
				setState(190);
				rbracket();
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

	public static class ConstantContext extends ParserRuleContext {
		public IntconstantContext intconstant() {
			return getRuleContext(IntconstantContext.class,0);
		}
		public RealconstantContext realconstant() {
			return getRuleContext(RealconstantContext.class,0);
		}
		public BooleanconstantContext booleanconstant() {
			return getRuleContext(BooleanconstantContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constant);
		try {
			setState(197);
			switch (_input.LA(1)) {
			case IntConstant:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				intconstant();
				}
				break;
			case RealConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				realconstant();
				}
				break;
			case BooleanConstant:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				booleanconstant();
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

	public static class ExprContext extends ParserRuleContext {
		public LparenContext lparen() {
			return getRuleContext(LparenContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public AddminContext addmin() {
			return getRuleContext(AddminContext.class,0);
		}
		public MuldivmodContext muldivmod() {
			return getRuleContext(MuldivmodContext.class,0);
		}
		public CompopContext compop() {
			return getRuleContext(CompopContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			switch (_input.LA(1)) {
			case LParen:
				{
				setState(200);
				lparen();
				setState(201);
				expr(0);
				setState(202);
				rparen();
				}
				break;
			case Ident:
				{
				setState(204);
				ident();
				}
				break;
			case IntConstant:
			case RealConstant:
			case BooleanConstant:
				{
				setState(205);
				constant();
				}
				break;
			case AddMin:
				{
				setState(206);
				addmin();
				setState(207);
				expr(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(211);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(212);
						muldivmod();
						setState(213);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(216);
						addmin();
						setState(217);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(220);
						compop();
						setState(221);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(227);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class If_Context extends ParserRuleContext {
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
	 
		public If_Context() { }
		public void copyFrom(If_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetIfContext extends If_Context {
		public TerminalNode If() { return getToken(cmmParser.If, 0); }
		public GetIfContext(If_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_);
		try {
			_localctx = new GetIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(If);
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

	public static class Else_Context extends ParserRuleContext {
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
	 
		public Else_Context() { }
		public void copyFrom(Else_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetElseContext extends Else_Context {
		public TerminalNode Else() { return getToken(cmmParser.Else, 0); }
		public GetElseContext(Else_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_else_);
		try {
			_localctx = new GetElseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(Else);
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

	public static class While_Context extends ParserRuleContext {
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
	 
		public While_Context() { }
		public void copyFrom(While_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetWhileContext extends While_Context {
		public TerminalNode While() { return getToken(cmmParser.While, 0); }
		public GetWhileContext(While_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_);
		try {
			_localctx = new GetWhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(While);
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

	public static class Read_Context extends ParserRuleContext {
		public Read_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_; }
	 
		public Read_Context() { }
		public void copyFrom(Read_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetReadContext extends Read_Context {
		public TerminalNode Read() { return getToken(cmmParser.Read, 0); }
		public GetReadContext(Read_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_Context read_() throws RecognitionException {
		Read_Context _localctx = new Read_Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_read_);
		try {
			_localctx = new GetReadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(Read);
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

	public static class Write_Context extends ParserRuleContext {
		public Write_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_; }
	 
		public Write_Context() { }
		public void copyFrom(Write_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetWriteContext extends Write_Context {
		public TerminalNode Write() { return getToken(cmmParser.Write, 0); }
		public GetWriteContext(Write_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_Context write_() throws RecognitionException {
		Write_Context _localctx = new Write_Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_write_);
		try {
			_localctx = new GetWriteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(Write);
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

	public static class Int_Context extends ParserRuleContext {
		public Int_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_; }
	 
		public Int_Context() { }
		public void copyFrom(Int_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetIntContext extends Int_Context {
		public TerminalNode Int() { return getToken(cmmParser.Int, 0); }
		public GetIntContext(Int_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_Context int_() throws RecognitionException {
		Int_Context _localctx = new Int_Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_int_);
		try {
			_localctx = new GetIntContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(Int);
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

	public static class Double_Context extends ParserRuleContext {
		public Double_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_; }
	 
		public Double_Context() { }
		public void copyFrom(Double_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetDoubleContext extends Double_Context {
		public TerminalNode Double() { return getToken(cmmParser.Double, 0); }
		public GetDoubleContext(Double_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_Context double_() throws RecognitionException {
		Double_Context _localctx = new Double_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_double_);
		try {
			_localctx = new GetDoubleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(Double);
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

	public static class Break_Context extends ParserRuleContext {
		public Break_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_; }
	 
		public Break_Context() { }
		public void copyFrom(Break_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetBreakContext extends Break_Context {
		public TerminalNode Break() { return getToken(cmmParser.Break, 0); }
		public GetBreakContext(Break_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_Context break_() throws RecognitionException {
		Break_Context _localctx = new Break_Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_break_);
		try {
			_localctx = new GetBreakContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(Break);
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

	public static class IdentContext extends ParserRuleContext {
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	 
		public IdentContext() { }
		public void copyFrom(IdentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetIdentContext extends IdentContext {
		public TerminalNode Ident() { return getToken(cmmParser.Ident, 0); }
		public GetIdentContext(IdentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ident);
		try {
			_localctx = new GetIdentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(Ident);
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

	public static class IntconstantContext extends ParserRuleContext {
		public IntconstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intconstant; }
	 
		public IntconstantContext() { }
		public void copyFrom(IntconstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetIntConstantContext extends IntconstantContext {
		public TerminalNode IntConstant() { return getToken(cmmParser.IntConstant, 0); }
		public GetIntConstantContext(IntconstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetIntConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetIntConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetIntConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntconstantContext intconstant() throws RecognitionException {
		IntconstantContext _localctx = new IntconstantContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_intconstant);
		try {
			_localctx = new GetIntConstantContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(IntConstant);
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

	public static class RealconstantContext extends ParserRuleContext {
		public RealconstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realconstant; }
	 
		public RealconstantContext() { }
		public void copyFrom(RealconstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetRealConstantContext extends RealconstantContext {
		public TerminalNode RealConstant() { return getToken(cmmParser.RealConstant, 0); }
		public GetRealConstantContext(RealconstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetRealConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetRealConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetRealConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealconstantContext realconstant() throws RecognitionException {
		RealconstantContext _localctx = new RealconstantContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_realconstant);
		try {
			_localctx = new GetRealConstantContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(RealConstant);
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

	public static class BooleanconstantContext extends ParserRuleContext {
		public BooleanconstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanconstant; }
	 
		public BooleanconstantContext() { }
		public void copyFrom(BooleanconstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetBooleanConstantContext extends BooleanconstantContext {
		public TerminalNode BooleanConstant() { return getToken(cmmParser.BooleanConstant, 0); }
		public GetBooleanConstantContext(BooleanconstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetBooleanConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetBooleanConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanconstantContext booleanconstant() throws RecognitionException {
		BooleanconstantContext _localctx = new BooleanconstantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_booleanconstant);
		try {
			_localctx = new GetBooleanConstantContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(BooleanConstant);
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

	public static class CompopContext extends ParserRuleContext {
		public CompopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compop; }
	 
		public CompopContext() { }
		public void copyFrom(CompopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetCompopContext extends CompopContext {
		public TerminalNode CompOp() { return getToken(cmmParser.CompOp, 0); }
		public GetCompopContext(CompopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetCompop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetCompop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetCompop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompopContext compop() throws RecognitionException {
		CompopContext _localctx = new CompopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_compop);
		try {
			_localctx = new GetCompopContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(CompOp);
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

	public static class MuldivmodContext extends ParserRuleContext {
		public MuldivmodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_muldivmod; }
	 
		public MuldivmodContext() { }
		public void copyFrom(MuldivmodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetMulDivModContext extends MuldivmodContext {
		public TerminalNode MulDivMod() { return getToken(cmmParser.MulDivMod, 0); }
		public GetMulDivModContext(MuldivmodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MuldivmodContext muldivmod() throws RecognitionException {
		MuldivmodContext _localctx = new MuldivmodContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_muldivmod);
		try {
			_localctx = new GetMulDivModContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(MulDivMod);
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

	public static class AddminContext extends ParserRuleContext {
		public AddminContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addmin; }
	 
		public AddminContext() { }
		public void copyFrom(AddminContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetAddMinContext extends AddminContext {
		public TerminalNode AddMin() { return getToken(cmmParser.AddMin, 0); }
		public GetAddMinContext(AddminContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetAddMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetAddMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetAddMin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddminContext addmin() throws RecognitionException {
		AddminContext _localctx = new AddminContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_addmin);
		try {
			_localctx = new GetAddMinContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(AddMin);
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

	public static class LparenContext extends ParserRuleContext {
		public LparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lparen; }
	 
		public LparenContext() { }
		public void copyFrom(LparenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetLParenContext extends LparenContext {
		public TerminalNode LParen() { return getToken(cmmParser.LParen, 0); }
		public GetLParenContext(LparenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetLParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetLParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetLParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LparenContext lparen() throws RecognitionException {
		LparenContext _localctx = new LparenContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lparen);
		try {
			_localctx = new GetLParenContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(LParen);
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

	public static class RparenContext extends ParserRuleContext {
		public RparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rparen; }
	 
		public RparenContext() { }
		public void copyFrom(RparenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetRParenContext extends RparenContext {
		public TerminalNode RParen() { return getToken(cmmParser.RParen, 0); }
		public GetRParenContext(RparenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetRParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetRParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetRParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RparenContext rparen() throws RecognitionException {
		RparenContext _localctx = new RparenContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_rparen);
		try {
			_localctx = new GetRParenContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(RParen);
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

	public static class LcurlyContext extends ParserRuleContext {
		public LcurlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcurly; }
	 
		public LcurlyContext() { }
		public void copyFrom(LcurlyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetLCurlyContext extends LcurlyContext {
		public TerminalNode LCurly() { return getToken(cmmParser.LCurly, 0); }
		public GetLCurlyContext(LcurlyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetLCurly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetLCurly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetLCurly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LcurlyContext lcurly() throws RecognitionException {
		LcurlyContext _localctx = new LcurlyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lcurly);
		try {
			_localctx = new GetLCurlyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(LCurly);
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

	public static class RcurlyContext extends ParserRuleContext {
		public RcurlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rcurly; }
	 
		public RcurlyContext() { }
		public void copyFrom(RcurlyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetRCurlyContext extends RcurlyContext {
		public TerminalNode RCurly() { return getToken(cmmParser.RCurly, 0); }
		public GetRCurlyContext(RcurlyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetRCurly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetRCurly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetRCurly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RcurlyContext rcurly() throws RecognitionException {
		RcurlyContext _localctx = new RcurlyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_rcurly);
		try {
			_localctx = new GetRCurlyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(RCurly);
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

	public static class LbracketContext extends ParserRuleContext {
		public LbracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbracket; }
	 
		public LbracketContext() { }
		public void copyFrom(LbracketContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetLBracketContext extends LbracketContext {
		public TerminalNode LBracket() { return getToken(cmmParser.LBracket, 0); }
		public GetLBracketContext(LbracketContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetLBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetLBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetLBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LbracketContext lbracket() throws RecognitionException {
		LbracketContext _localctx = new LbracketContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lbracket);
		try {
			_localctx = new GetLBracketContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(LBracket);
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

	public static class RbracketContext extends ParserRuleContext {
		public RbracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbracket; }
	 
		public RbracketContext() { }
		public void copyFrom(RbracketContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetRBracketContext extends RbracketContext {
		public TerminalNode RBracket() { return getToken(cmmParser.RBracket, 0); }
		public GetRBracketContext(RbracketContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetRBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetRBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetRBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RbracketContext rbracket() throws RecognitionException {
		RbracketContext _localctx = new RbracketContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_rbracket);
		try {
			_localctx = new GetRBracketContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(RBracket);
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

	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetAssignContext extends AssignContext {
		public TerminalNode Assign() { return getToken(cmmParser.Assign, 0); }
		public GetAssignContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assign);
		try {
			_localctx = new GetAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(Assign);
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

	public static class LineendContext extends ParserRuleContext {
		public LineendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineend; }
	 
		public LineendContext() { }
		public void copyFrom(LineendContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetLineEndContext extends LineendContext {
		public TerminalNode LineEnd() { return getToken(cmmParser.LineEnd, 0); }
		public GetLineEndContext(LineendContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetLineEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetLineEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetLineEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineendContext lineend() throws RecognitionException {
		LineendContext _localctx = new LineendContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lineend);
		try {
			_localctx = new GetLineEndContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(LineEnd);
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

	public static class CommaContext extends ParserRuleContext {
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
	 
		public CommaContext() { }
		public void copyFrom(CommaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetCommaContext extends CommaContext {
		public TerminalNode Comma() { return getToken(cmmParser.Comma, 0); }
		public GetCommaContext(CommaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).enterGetComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cmmListener ) ((cmmListener)listener).exitGetComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cmmVisitor ) return ((cmmVisitor<? extends T>)visitor).visitGetComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_comma);
		try {
			_localctx = new GetCommaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(Comma);
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
		case 4:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u0117\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\6\2T\n\2\r"+
		"\2\16\2U\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3d\n\3\3\4"+
		"\3\4\7\4h\n\4\f\4\16\4k\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6v"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13\6\3\7\3\7\3\7\3\7"+
		"\7\7\u0086\n\7\f\7\16\7\u0089\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0099\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b0\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00c3\n\17\3\20\3\20\3\20\5\20\u00c8\n\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d4\n\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e2\n\21\f\21\16\21\u00e5"+
		"\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3)\2\4\n *\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNP\2\2\u0106\2S\3\2\2\2\4c\3\2\2\2\6e\3\2\2\2\bn\3\2\2\2\n"+
		"u\3\2\2\2\f\u0081\3\2\2\2\16\u008a\3\2\2\2\20\u0098\3\2\2\2\22\u009a\3"+
		"\2\2\2\24\u009e\3\2\2\2\26\u00af\3\2\2\2\30\u00b1\3\2\2\2\32\u00b7\3\2"+
		"\2\2\34\u00c2\3\2\2\2\36\u00c7\3\2\2\2 \u00d3\3\2\2\2\"\u00e6\3\2\2\2"+
		"$\u00e8\3\2\2\2&\u00ea\3\2\2\2(\u00ec\3\2\2\2*\u00ee\3\2\2\2,\u00f0\3"+
		"\2\2\2.\u00f2\3\2\2\2\60\u00f4\3\2\2\2\62\u00f6\3\2\2\2\64\u00f8\3\2\2"+
		"\2\66\u00fa\3\2\2\28\u00fc\3\2\2\2:\u00fe\3\2\2\2<\u0100\3\2\2\2>\u0102"+
		"\3\2\2\2@\u0104\3\2\2\2B\u0106\3\2\2\2D\u0108\3\2\2\2F\u010a\3\2\2\2H"+
		"\u010c\3\2\2\2J\u010e\3\2\2\2L\u0110\3\2\2\2N\u0112\3\2\2\2P\u0114\3\2"+
		"\2\2RT\5\4\3\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\3\3\2\2\2Wd\5"+
		"\b\5\2Xd\5\20\t\2Yd\5\22\n\2Zd\5\24\13\2[d\5\32\16\2\\d\5\26\f\2]d\5\30"+
		"\r\2^d\5\6\4\2_`\7\22\2\2`a\5\4\3\2ab\7\23\2\2bd\3\2\2\2cW\3\2\2\2cX\3"+
		"\2\2\2cY\3\2\2\2cZ\3\2\2\2c[\3\2\2\2c\\\3\2\2\2c]\3\2\2\2c^\3\2\2\2c_"+
		"\3\2\2\2d\5\3\2\2\2ei\5D#\2fh\5\4\3\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij"+
		"\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\5F$\2m\7\3\2\2\2no\5\n\6\2op\5\f\7\2pq"+
		"\5N(\2q\t\3\2\2\2rs\b\6\1\2sv\5,\27\2tv\5.\30\2ur\3\2\2\2ut\3\2\2\2v~"+
		"\3\2\2\2wx\f\3\2\2xy\5H%\2yz\5\64\33\2z{\5J&\2{}\3\2\2\2|w\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\13\3\2\2\2\u0080~\3\2\2\2\u0081\u0087"+
		"\5\62\32\2\u0082\u0083\5P)\2\u0083\u0084\5\62\32\2\u0084\u0086\3\2\2\2"+
		"\u0085\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\r\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\5\62\32\2\u008b"+
		"\u008c\5L\'\2\u008c\u008d\5 \21\2\u008d\17\3\2\2\2\u008e\u008f\5\"\22"+
		"\2\u008f\u0090\5 \21\2\u0090\u0091\5\4\3\2\u0091\u0099\3\2\2\2\u0092\u0093"+
		"\5\"\22\2\u0093\u0094\5 \21\2\u0094\u0095\5\4\3\2\u0095\u0096\5$\23\2"+
		"\u0096\u0097\5\4\3\2\u0097\u0099\3\2\2\2\u0098\u008e\3\2\2\2\u0098\u0092"+
		"\3\2\2\2\u0099\21\3\2\2\2\u009a\u009b\5&\24\2\u009b\u009c\5 \21\2\u009c"+
		"\u009d\5\4\3\2\u009d\23\3\2\2\2\u009e\u009f\5\60\31\2\u009f\u00a0\5N("+
		"\2\u00a0\25\3\2\2\2\u00a1\u00a2\5(\25\2\u00a2\u00a3\5@!\2\u00a3\u00a4"+
		"\5\62\32\2\u00a4\u00a5\5B\"\2\u00a5\u00a6\5N(\2\u00a6\u00b0\3\2\2\2\u00a7"+
		"\u00a8\5(\25\2\u00a8\u00a9\5@!\2\u00a9\u00aa\5\62\32\2\u00aa\u00ab\5H"+
		"%\2\u00ab\u00ac\5\64\33\2\u00ac\u00ad\5J&\2\u00ad\u00ae\5N(\2\u00ae\u00b0"+
		"\3\2\2\2\u00af\u00a1\3\2\2\2\u00af\u00a7\3\2\2\2\u00b0\27\3\2\2\2\u00b1"+
		"\u00b2\5*\26\2\u00b2\u00b3\5@!\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\5B\""+
		"\2\u00b5\u00b6\5N(\2\u00b6\31\3\2\2\2\u00b7\u00b8\5\34\17\2\u00b8\u00b9"+
		"\5L\'\2\u00b9\u00ba\5 \21\2\u00ba\u00bb\5N(\2\u00bb\33\3\2\2\2\u00bc\u00c3"+
		"\5\62\32\2\u00bd\u00be\5\62\32\2\u00be\u00bf\5H%\2\u00bf\u00c0\5\64\33"+
		"\2\u00c0\u00c1\5J&\2\u00c1\u00c3\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bd"+
		"\3\2\2\2\u00c3\35\3\2\2\2\u00c4\u00c8\5\64\33\2\u00c5\u00c8\5\66\34\2"+
		"\u00c6\u00c8\58\35\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\37\3\2\2\2\u00c9\u00ca\b\21\1\2\u00ca\u00cb\5@!\2\u00cb"+
		"\u00cc\5 \21\2\u00cc\u00cd\5B\"\2\u00cd\u00d4\3\2\2\2\u00ce\u00d4\5\62"+
		"\32\2\u00cf\u00d4\5\36\20\2\u00d0\u00d1\5> \2\u00d1\u00d2\5 \21\3\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00c9\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00cf\3\2"+
		"\2\2\u00d3\u00d0\3\2\2\2\u00d4\u00e3\3\2\2\2\u00d5\u00d6\f\t\2\2\u00d6"+
		"\u00d7\5<\37\2\u00d7\u00d8\5 \21\n\u00d8\u00e2\3\2\2\2\u00d9\u00da\f\b"+
		"\2\2\u00da\u00db\5> \2\u00db\u00dc\5 \21\t\u00dc\u00e2\3\2\2\2\u00dd\u00de"+
		"\f\7\2\2\u00de\u00df\5:\36\2\u00df\u00e0\5 \21\b\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00d5\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\u00e5\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4!\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e7\7\3\2\2\u00e7#\3\2\2\2\u00e8\u00e9\7\4\2\2\u00e9"+
		"%\3\2\2\2\u00ea\u00eb\7\5\2\2\u00eb\'\3\2\2\2\u00ec\u00ed\7\6\2\2\u00ed"+
		")\3\2\2\2\u00ee\u00ef\7\7\2\2\u00ef+\3\2\2\2\u00f0\u00f1\7\b\2\2\u00f1"+
		"-\3\2\2\2\u00f2\u00f3\7\t\2\2\u00f3/\3\2\2\2\u00f4\u00f5\7\n\2\2\u00f5"+
		"\61\3\2\2\2\u00f6\u00f7\7\13\2\2\u00f7\63\3\2\2\2\u00f8\u00f9\7\f\2\2"+
		"\u00f9\65\3\2\2\2\u00fa\u00fb\7\r\2\2\u00fb\67\3\2\2\2\u00fc\u00fd\7\16"+
		"\2\2\u00fd9\3\2\2\2\u00fe\u00ff\7\17\2\2\u00ff;\3\2\2\2\u0100\u0101\7"+
		"\20\2\2\u0101=\3\2\2\2\u0102\u0103\7\21\2\2\u0103?\3\2\2\2\u0104\u0105"+
		"\7\22\2\2\u0105A\3\2\2\2\u0106\u0107\7\23\2\2\u0107C\3\2\2\2\u0108\u0109"+
		"\7\24\2\2\u0109E\3\2\2\2\u010a\u010b\7\25\2\2\u010bG\3\2\2\2\u010c\u010d"+
		"\7\26\2\2\u010dI\3\2\2\2\u010e\u010f\7\27\2\2\u010fK\3\2\2\2\u0110\u0111"+
		"\7\30\2\2\u0111M\3\2\2\2\u0112\u0113\7\31\2\2\u0113O\3\2\2\2\u0114\u0115"+
		"\7\32\2\2\u0115Q\3\2\2\2\17Uciu~\u0087\u0098\u00af\u00c2\u00c7\u00d3\u00e1"+
		"\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}