// Generated from C.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__38=1, T__37=2, T__36=3, T__35=4, T__34=5, T__33=6, T__32=7, T__31=8, 
		T__30=9, T__29=10, T__28=11, T__27=12, T__26=13, T__25=14, T__24=15, T__23=16, 
		T__22=17, T__21=18, T__20=19, T__19=20, T__18=21, T__17=22, T__16=23, 
		T__15=24, T__14=25, T__13=26, T__12=27, T__11=28, T__10=29, T__9=30, T__8=31, 
		T__7=32, T__6=33, T__5=34, T__4=35, T__3=36, T__2=37, T__1=38, T__0=39, 
		LINE_COMMENT=40, COMMENT=41, HEADFILE=42, HEAD_DECLARE=43, TYPE=44, STRING=45, 
		ANYSTRING=46, INTEGER=47, FLOAT_NUMBER=48, BOOL_NUMBER=49, WS=50;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'return'", "'#include'", "'!='", "'while'", "'||'", 
		"';'", "'{'", "'&&'", "'<<'", "'>>'", "'='", "'}'", "'for'", "'if'", "'int main()'", 
		"'\"'", "'else if'", "'('", "'*'", "','", "'.'", "'['", "'=='", "'cin'", 
		"'--'", "'++'", "'<'", "']'", "'>'", "'!'", "'else'", "'typedef'", "')'", 
		"'+'", "'struct'", "'cout'", "'-'", "'endl'", "LINE_COMMENT", "COMMENT", 
		"HEADFILE", "'using namespace std;'", "TYPE", "STRING", "ANYSTRING", "INTEGER", 
		"FLOAT_NUMBER", "BOOL_NUMBER", "WS"
	};
	public static final int
		RULE_c = 0, RULE_start = 1, RULE_global = 2, RULE_func = 3, RULE_bot = 4, 
		RULE_both = 5, RULE_structure = 6, RULE_structure_body = 7, RULE_struct_body_body = 8, 
		RULE_defvar = 9, RULE_tem = 10, RULE_assign = 11, RULE_assign_rear = 12, 
		RULE_defvarfun = 13, RULE_value = 14, RULE_expr = 15, RULE_addexpr = 16, 
		RULE_mulexpr = 17, RULE_atom = 18, RULE_main = 19, RULE_stat = 20, RULE_block = 21, 
		RULE_return_val = 22, RULE_in = 23, RULE_out = 24, RULE_call = 25, RULE_if_lable = 26, 
		RULE_if_part = 27, RULE_else_if_part = 28, RULE_else_part = 29, RULE_condition = 30, 
		RULE_and = 31, RULE_atomc = 32, RULE_conexpr = 33, RULE_condition_part = 34, 
		RULE_for_lable = 35, RULE_while_lable = 36;
	public static final String[] ruleNames = {
		"c", "start", "global", "func", "bot", "both", "structure", "structure_body", 
		"struct_body_body", "defvar", "tem", "assign", "assign_rear", "defvarfun", 
		"value", "expr", "addexpr", "mulexpr", "atom", "main", "stat", "block", 
		"return_val", "in", "out", "call", "if_lable", "if_part", "else_if_part", 
		"else_part", "condition", "and", "atomc", "conexpr", "condition_part", 
		"for_lable", "while_lable"
	};

	@Override
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); start();
			setState(75); global();
			setState(76); main();
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode HEAD_DECLARE() { return getToken(CParser.HEAD_DECLARE, 0); }
		public List<TerminalNode> HEADFILE() { return getTokens(CParser.HEADFILE); }
		public TerminalNode HEADFILE(int i) {
			return getToken(CParser.HEADFILE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(78); match(T__36);
				setState(79); match(T__11);
				setState(80); match(HEADFILE);
				setState(81); match(T__9);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(87); match(HEAD_DECLARE);
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

	public static class GlobalContext extends ParserRuleContext {
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public List<StructureContext> structure() {
			return getRuleContexts(StructureContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public StructureContext structure(int i) {
			return getRuleContext(StructureContext.class,i);
		}
		public BothContext both(int i) {
			return getRuleContext(BothContext.class,i);
		}
		public List<BothContext> both() {
			return getRuleContexts(BothContext.class);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGlobal(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__34) | (1L << T__25) | (1L << T__24) | (1L << T__14) | (1L << T__6) | (1L << T__3) | (1L << T__2) | (1L << TYPE) | (1L << STRING))) != 0)) {
				{
				setState(92);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(89); func();
					}
					break;
				case 2:
					{
					setState(90); both();
					}
					break;
				case 3:
					{
					setState(91); structure();
					}
					break;
				}
				}
				setState(96);
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

	public static class FuncContext extends ParserRuleContext {
		public List<DefvarfunContext> defvarfun() {
			return getRuleContexts(DefvarfunContext.class);
		}
		public TerminalNode TYPE() { return getToken(CParser.TYPE, 0); }
		public TerminalNode STRING() { return getToken(CParser.STRING, 0); }
		public DefvarfunContext defvarfun(int i) {
			return getRuleContext(DefvarfunContext.class,i);
		}
		public BothContext both(int i) {
			return getRuleContext(BothContext.class,i);
		}
		public List<BothContext> both() {
			return getRuleContexts(BothContext.class);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(TYPE);
			setState(98); match(STRING);
			setState(99); match(T__20);
			setState(101);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(100); defvarfun();
				}
			}

			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(103); match(T__18);
				setState(104); defvarfun();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110); match(T__5);
			setState(111); match(T__31);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__34) | (1L << T__25) | (1L << T__24) | (1L << T__14) | (1L << T__2) | (1L << TYPE) | (1L << STRING))) != 0)) {
				{
				{
				setState(112); both();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118); match(T__26);
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

	public static class BotContext extends ParserRuleContext {
		public BothContext both(int i) {
			return getRuleContext(BothContext.class,i);
		}
		public List<BothContext> both() {
			return getRuleContexts(BothContext.class);
		}
		public BotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterBot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitBot(this);
		}
	}

	public final BotContext bot() throws RecognitionException {
		BotContext _localctx = new BotContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(T__31);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__34) | (1L << T__25) | (1L << T__24) | (1L << T__14) | (1L << T__2) | (1L << TYPE) | (1L << STRING))) != 0)) {
				{
				{
				setState(121); both();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127); match(T__26);
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

	public static class BothContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BothContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_both; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterBoth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitBoth(this);
		}
	}

	public final BothContext both() throws RecognitionException {
		BothContext _localctx = new BothContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_both);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case T__37:
			case T__14:
			case T__2:
			case TYPE:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); stat();
				setState(130); match(T__32);
				}
				break;
			case T__34:
			case T__25:
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); block();
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

	public static class StructureContext extends ParserRuleContext {
		public TerminalNode STRING(int i) {
			return getToken(CParser.STRING, i);
		}
		public TerminalNode INTEGER() { return getToken(CParser.INTEGER, 0); }
		public List<TerminalNode> STRING() { return getTokens(CParser.STRING); }
		public Structure_bodyContext structure_body() {
			return getRuleContext(Structure_bodyContext.class,0);
		}
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStructure(this);
		}
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(135); match(T__6);
				}
			}

			setState(138); match(T__3);
			setState(139); match(STRING);
			setState(140); structure_body();
			setState(147);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(141); match(STRING);
				setState(145);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(142); match(T__16);
					setState(143); match(INTEGER);
					setState(144); match(T__10);
					}
				}

				}
			}

			setState(149); match(T__32);
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

	public static class Structure_bodyContext extends ParserRuleContext {
		public Struct_body_bodyContext struct_body_body(int i) {
			return getRuleContext(Struct_body_bodyContext.class,i);
		}
		public List<Struct_body_bodyContext> struct_body_body() {
			return getRuleContexts(Struct_body_bodyContext.class);
		}
		public Structure_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStructure_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStructure_body(this);
		}
	}

	public final Structure_bodyContext structure_body() throws RecognitionException {
		Structure_bodyContext _localctx = new Structure_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_structure_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(T__31);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(152); struct_body_body();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158); match(T__26);
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

	public static class Struct_body_bodyContext extends ParserRuleContext {
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Struct_body_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStruct_body_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStruct_body_body(this);
		}
	}

	public final Struct_body_bodyContext struct_body_body() throws RecognitionException {
		Struct_body_bodyContext _localctx = new Struct_body_bodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_struct_body_body);
		try {
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); defvar();
				setState(161); match(T__32);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163); func();
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

	public static class DefvarContext extends ParserRuleContext {
		public TemContext tem(int i) {
			return getRuleContext(TemContext.class,i);
		}
		public TerminalNode TYPE() { return getToken(CParser.TYPE, 0); }
		public List<TemContext> tem() {
			return getRuleContexts(TemContext.class);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDefvar(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(TYPE);
			setState(167); tem();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(168); match(T__18);
				setState(169); tem();
				}
				}
				setState(174);
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

	public static class TemContext extends ParserRuleContext {
		public TemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tem; }
	 
		public TemContext() { }
		public void copyFrom(TemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefineassignContext extends TemContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public DefineassignContext(TemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDefineassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDefineassign(this);
		}
	}
	public static class DefinarrayvarContext extends TemContext {
		public List<TerminalNode> INTEGER() { return getTokens(CParser.INTEGER); }
		public TerminalNode STRING() { return getToken(CParser.STRING, 0); }
		public TerminalNode INTEGER(int i) {
			return getToken(CParser.INTEGER, i);
		}
		public DefinarrayvarContext(TemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDefinarrayvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDefinarrayvar(this);
		}
	}
	public static class DesimplevarContext extends TemContext {
		public TerminalNode STRING() { return getToken(CParser.STRING, 0); }
		public DesimplevarContext(TemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDesimplevar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDesimplevar(this);
		}
	}

	public final TemContext tem() throws RecognitionException {
		TemContext _localctx = new TemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tem);
		int _la;
		try {
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new DefineassignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175); assign();
				}
				break;
			case 2:
				_localctx = new DesimplevarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176); match(STRING);
				}
				break;
			case 3:
				_localctx = new DefinarrayvarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(177); match(STRING);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(178); match(T__16);
					setState(179); match(INTEGER);
					setState(180); match(T__10);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CParser.STRING, 0); }
		public Assign_rearContext assign_rear() {
			return getRuleContext(Assign_rearContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(188); match(STRING);
				setState(189); match(T__17);
				}
				break;
			}
			setState(192); assign_rear();
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

	public static class Assign_rearContext extends ParserRuleContext {
		public Assign_rearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_rear; }
	 
		public Assign_rearContext() { }
		public void copyFrom(Assign_rearContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelfdecreaseContext extends Assign_rearContext {
		public TerminalNode STRING() { return getToken(CParser.STRING, 0); }
		public SelfdecreaseContext(Assign_rearContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterSelfdecrease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitSelfdecrease(this);
		}
	}
	public static class ArrayContext extends Assign_rearContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> INTEGER() { return getTokens(CParser.INTEGER); }
		public TerminalNode STRING() { return getToken(CParser.STRING, 0); }
		public TerminalNode INTEGER(int i) {
			return getToken(CParser.INTEGER, i);
		}
		public ArrayContext(Assign_rearContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitArray(this);
		}
	}
	public static class VariableContext extends Assign_rearContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(CParser.STRING, 0); }
		public VariableContext(Assign_rearContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitVariable(this);
		}
	}
	public static class SelfincreaseContext extends Assign_rearContext {
		public TerminalNode STRING() { return getToken(CParser.STRING, 0); }
		public SelfincreaseContext(Assign_rearContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterSelfincrease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitSelfincrease(this);
		}
	}

	public final Assign_rearContext assign_rear() throws RecognitionException {
		Assign_rearContext _localctx = new Assign_rearContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign_rear);
		int _la;
		try {
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194); match(STRING);
				setState(195); match(T__27);
				setState(196); value();
				}
				break;
			case 2:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197); match(STRING);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(198); match(T__16);
					setState(199); match(INTEGER);
					setState(200); match(T__10);
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206); match(T__27);
				setState(207); value();
				}
				break;
			case 3:
				_localctx = new SelfincreaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208); match(STRING);
				setState(209); match(T__12);
				}
				break;
			case 4:
				_localctx = new SelfdecreaseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(210); match(STRING);
				setState(211); match(T__13);
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

	public static class DefvarfunContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER() { return getTokens(CParser.INTEGER); }
		public TerminalNode TYPE() { return getToken(CParser.TYPE, 0); }
		public TerminalNode STRING() { return getToken(CParser.STRING, 0); }
		public TerminalNode INTEGER(int i) {
			return getToken(CParser.INTEGER, i);
		}
		public DefvarfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDefvarfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDefvarfun(this);
		}
	}

	public final DefvarfunContext defvarfun() throws RecognitionException {
		DefvarfunContext _localctx = new DefvarfunContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defvarfun);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(TYPE);
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(215); match(STRING);
				}
				break;
			case 2:
				{
				setState(216); match(STRING);
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(217); match(T__16);
						setState(218); match(INTEGER);
						setState(219); match(T__10);
						}
						} 
					}
					setState(224);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(225); match(T__16);
				setState(226); match(T__10);
				}
				break;
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ANYSTRING() { return getToken(CParser.ANYSTRING, 0); }
		public TerminalNode INTEGER() { return getToken(CParser.INTEGER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FLOAT_NUMBER() { return getToken(CParser.FLOAT_NUMBER, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode BOOL_NUMBER() { return getToken(CParser.BOOL_NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230); match(T__22);
				setState(231); match(ANYSTRING);
				setState(232); match(T__22);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233); match(FLOAT_NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234); match(BOOL_NUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(235); expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(236); call();
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

	public static class ExprContext extends ParserRuleContext {
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(CParser.STRING, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		try {
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); addexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); match(STRING);
				setState(241); match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242); match(STRING);
				setState(243); match(T__13);
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

	public static class AddexprContext extends ParserRuleContext {
		public List<MulexprContext> mulexpr() {
			return getRuleContexts(MulexprContext.class);
		}
		public MulexprContext mulexpr(int i) {
			return getRuleContext(MulexprContext.class,i);
		}
		public AddexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAddexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAddexpr(this);
		}
	}

	public final AddexprContext addexpr() throws RecognitionException {
		AddexprContext _localctx = new AddexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_addexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); mulexpr();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__1) {
				{
				{
				setState(247);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(248); mulexpr();
				}
				}
				setState(253);
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

	public static class MulexprContext extends ParserRuleContext {
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public MulexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterMulexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitMulexpr(this);
		}
	}

	public final MulexprContext mulexpr() throws RecognitionException {
		MulexprContext _localctx = new MulexprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mulexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); atom();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38 || _la==T__19) {
				{
				{
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==T__38 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(256); atom();
				}
				}
				setState(261);
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

	public static class AtomContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER() { return getTokens(CParser.INTEGER); }
		public TerminalNode STRING(int i) {
			return getToken(CParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(CParser.STRING); }
		public TerminalNode INTEGER(int i) {
			return getToken(CParser.INTEGER, i);
		}
		public TerminalNode FLOAT_NUMBER() { return getToken(CParser.FLOAT_NUMBER, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atom);
		int _la;
		try {
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262); match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263); match(FLOAT_NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(264); match(STRING);
					setState(265); match(T__17);
					}
					break;
				}
				setState(268); match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(269); match(STRING);
					setState(270); match(T__17);
					}
					break;
				}
				setState(273); match(STRING);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(274); match(T__16);
					setState(275); match(INTEGER);
					setState(276); match(T__10);
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class MainContext extends ParserRuleContext {
		public BothContext both(int i) {
			return getRuleContext(BothContext.class,i);
		}
		public List<BothContext> both() {
			return getRuleContexts(BothContext.class);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(T__23);
			setState(285); match(T__31);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__34) | (1L << T__25) | (1L << T__24) | (1L << T__14) | (1L << T__2) | (1L << TYPE) | (1L << STRING))) != 0)) {
				{
				{
				setState(286); both();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292); match(T__26);
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

	public static class StatContext extends ParserRuleContext {
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public Return_valContext return_val() {
			return getRuleContext(Return_valContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stat);
		try {
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294); return_val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295); defvar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296); assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297); in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(298); out();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(299); call();
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

	public static class BlockContext extends ParserRuleContext {
		public While_lableContext while_lable() {
			return getRuleContext(While_lableContext.class,0);
		}
		public If_lableContext if_lable() {
			return getRuleContext(If_lableContext.class,0);
		}
		public For_lableContext for_lable() {
			return getRuleContext(For_lableContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block);
		try {
			setState(305);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(302); if_lable();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(303); for_lable();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(304); while_lable();
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

	public static class Return_valContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Return_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterReturn_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitReturn_val(this);
		}
	}

	public final Return_valContext return_val() throws RecognitionException {
		Return_valContext _localctx = new Return_valContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_return_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); match(T__37);
			setState(309);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT_NUMBER) | (1L << BOOL_NUMBER))) != 0)) {
				{
				setState(308); value();
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

	public static class InContext extends ParserRuleContext {
		public TerminalNode STRING(int i) {
			return getToken(CParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(CParser.STRING); }
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIn(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(T__14);
			setState(314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312); match(T__28);
				setState(313); match(STRING);
				}
				}
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__28 );
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

	public static class OutContext extends ParserRuleContext {
		public TerminalNode STRING(int i) {
			return getToken(CParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(CParser.STRING); }
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitOut(this);
		}
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_out);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318); match(T__2);
			setState(321); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(319); match(T__29);
					setState(320); match(STRING);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(323); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(327);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(325); match(T__29);
				setState(326); match(T__0);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode STRING(int i) {
			return getToken(CParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(CParser.STRING); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(STRING);
			setState(330); match(T__20);
			setState(332);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(331); match(STRING);
				}
			}

			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(334); match(T__18);
				setState(335); match(STRING);
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341); match(T__5);
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

	public static class If_lableContext extends ParserRuleContext {
		public If_partContext if_part() {
			return getRuleContext(If_partContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public List<Else_if_partContext> else_if_part() {
			return getRuleContexts(Else_if_partContext.class);
		}
		public Else_if_partContext else_if_part(int i) {
			return getRuleContext(Else_if_partContext.class,i);
		}
		public If_lableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_lable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIf_lable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIf_lable(this);
		}
	}

	public final If_lableContext if_lable() throws RecognitionException {
		If_lableContext _localctx = new If_lableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_if_lable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343); if_part();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(344); else_if_part();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350); else_part();
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

	public static class If_partContext extends ParserRuleContext {
		public BotContext bot() {
			return getRuleContext(BotContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public If_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIf_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIf_part(this);
		}
	}

	public final If_partContext if_part() throws RecognitionException {
		If_partContext _localctx = new If_partContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_if_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); match(T__24);
			setState(353); match(T__20);
			setState(354); condition();
			setState(355); match(T__5);
			setState(356); bot();
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

	public static class Else_if_partContext extends ParserRuleContext {
		public BotContext bot() {
			return getRuleContext(BotContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Else_if_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterElse_if_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitElse_if_part(this);
		}
	}

	public final Else_if_partContext else_if_part() throws RecognitionException {
		Else_if_partContext _localctx = new Else_if_partContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_else_if_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358); match(T__21);
			setState(359); match(T__20);
			setState(360); condition();
			setState(361); match(T__5);
			setState(362); bot();
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

	public static class Else_partContext extends ParserRuleContext {
		public BotContext bot() {
			return getRuleContext(BotContext.class,0);
		}
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterElse_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitElse_part(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_else_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(364); match(T__7);
				setState(365); bot();
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

	public static class ConditionContext extends ParserRuleContext {
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); and();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(369); match(T__33);
				setState(370); and();
				}
				}
				setState(375);
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

	public static class AndContext extends ParserRuleContext {
		public AtomcContext atomc(int i) {
			return getRuleContext(AtomcContext.class,i);
		}
		public List<AtomcContext> atomc() {
			return getRuleContexts(AtomcContext.class);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); atomc();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(377); match(T__30);
				setState(378); atomc();
				}
				}
				setState(383);
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

	public static class AtomcContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConexprContext conexpr() {
			return getRuleContext(ConexprContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode BOOL_NUMBER() { return getToken(CParser.BOOL_NUMBER, 0); }
		public AtomcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAtomc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAtomc(this);
		}
	}

	public final AtomcContext atomc() throws RecognitionException {
		AtomcContext _localctx = new AtomcContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_atomc);
		int _la;
		try {
			setState(400);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(384); match(T__8);
					}
				}

				setState(387); call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(388); match(T__8);
					}
				}

				setState(391); conexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(392); match(T__8);
					}
				}

				setState(395); expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(396); match(T__8);
					}
				}

				setState(399); match(BOOL_NUMBER);
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

	public static class ConexprContext extends ParserRuleContext {
		public ConexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conexpr; }
	 
		public ConexprContext() { }
		public void copyFrom(ConexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualContext extends ConexprContext {
		public Condition_partContext condition_part(int i) {
			return getRuleContext(Condition_partContext.class,i);
		}
		public List<Condition_partContext> condition_part() {
			return getRuleContexts(Condition_partContext.class);
		}
		public EqualContext(ConexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEqual(this);
		}
	}
	public static class UnequalContext extends ConexprContext {
		public Condition_partContext condition_part(int i) {
			return getRuleContext(Condition_partContext.class,i);
		}
		public List<Condition_partContext> condition_part() {
			return getRuleContexts(Condition_partContext.class);
		}
		public UnequalContext(ConexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterUnequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitUnequal(this);
		}
	}
	public static class LessContext extends ConexprContext {
		public Condition_partContext condition_part(int i) {
			return getRuleContext(Condition_partContext.class,i);
		}
		public List<Condition_partContext> condition_part() {
			return getRuleContexts(Condition_partContext.class);
		}
		public LessContext(ConexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLess(this);
		}
	}
	public static class GreaterContext extends ConexprContext {
		public Condition_partContext condition_part(int i) {
			return getRuleContext(Condition_partContext.class,i);
		}
		public List<Condition_partContext> condition_part() {
			return getRuleContexts(Condition_partContext.class);
		}
		public GreaterContext(ConexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGreater(this);
		}
	}

	public final ConexprContext conexpr() throws RecognitionException {
		ConexprContext _localctx = new ConexprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conexpr);
		int _la;
		try {
			setState(424);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(402); condition_part();
				setState(403); match(T__15);
				setState(404); condition_part();
				}
				break;
			case 2:
				_localctx = new UnequalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(406); condition_part();
				setState(407); match(T__35);
				setState(408); condition_part();
				}
				break;
			case 3:
				_localctx = new GreaterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(410); condition_part();
				setState(411); match(T__9);
				setState(413);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(412); match(T__27);
					}
				}

				setState(415); condition_part();
				}
				break;
			case 4:
				_localctx = new LessContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(417); condition_part();
				setState(418); match(T__11);
				setState(420);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(419); match(T__27);
					}
				}

				setState(422); condition_part();
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

	public static class Condition_partContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Condition_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCondition_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCondition_part(this);
		}
	}

	public final Condition_partContext condition_part() throws RecognitionException {
		Condition_partContext _localctx = new Condition_partContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_condition_part);
		try {
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426); expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427); call();
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

	public static class For_lableContext extends ParserRuleContext {
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public BothContext both(int i) {
			return getRuleContext(BothContext.class,i);
		}
		public List<BothContext> both() {
			return getRuleContexts(BothContext.class);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public For_lableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_lable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFor_lable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFor_lable(this);
		}
	}

	public final For_lableContext for_lable() throws RecognitionException {
		For_lableContext _localctx = new For_lableContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_for_lable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(T__25);
			setState(431); match(T__20);
			setState(433);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(432); defvar();
				}
			}

			setState(435); match(T__32);
			setState(437);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT_NUMBER) | (1L << BOOL_NUMBER))) != 0)) {
				{
				setState(436); condition();
				}
			}

			setState(439); match(T__32);
			setState(441);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(440); assign();
				}
			}

			setState(443); match(T__5);
			setState(444); match(T__31);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__34) | (1L << T__25) | (1L << T__24) | (1L << T__14) | (1L << T__2) | (1L << TYPE) | (1L << STRING))) != 0)) {
				{
				{
				setState(445); both();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451); match(T__26);
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

	public static class While_lableContext extends ParserRuleContext {
		public BothContext both(int i) {
			return getRuleContext(BothContext.class,i);
		}
		public List<BothContext> both() {
			return getRuleContexts(BothContext.class);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public While_lableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_lable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterWhile_lable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitWhile_lable(this);
		}
	}

	public final While_lableContext while_lable() throws RecognitionException {
		While_lableContext _localctx = new While_lableContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_while_lable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453); match(T__34);
			setState(454); match(T__20);
			setState(455); condition();
			setState(456); match(T__5);
			setState(457); match(T__31);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__34) | (1L << T__25) | (1L << T__24) | (1L << T__14) | (1L << T__2) | (1L << TYPE) | (1L << STRING))) != 0)) {
				{
				{
				setState(458); both();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464); match(T__26);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u01d5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7"+
		"\3U\n\3\f\3\16\3X\13\3\3\3\3\3\3\4\3\4\3\4\7\4_\n\4\f\4\16\4b\13\4\3\5"+
		"\3\5\3\5\3\5\5\5h\n\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\5\3\5\3\5\7\5"+
		"t\n\5\f\5\16\5w\13\5\3\5\3\5\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\5\7\u0088\n\7\3\b\5\b\u008b\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0094\n\b\5\b\u0096\n\b\3\b\3\b\3\t\3\t\7\t\u009c\n\t\f"+
		"\t\16\t\u009f\13\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00a7\n\n\3\13\3\13\3\13"+
		"\3\13\7\13\u00ad\n\13\f\13\16\13\u00b0\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00b8\n\f\f\f\16\f\u00bb\13\f\5\f\u00bd\n\f\3\r\3\r\5\r\u00c1\n\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00cc\n\16\f\16\16\16\u00cf"+
		"\13\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d7\n\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u00df\n\17\f\17\16\17\u00e2\13\17\3\17\3\17\5\17\u00e6"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f0\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00f7\n\21\3\22\3\22\3\22\7\22\u00fc\n\22\f\22\16"+
		"\22\u00ff\13\22\3\23\3\23\3\23\7\23\u0104\n\23\f\23\16\23\u0107\13\23"+
		"\3\24\3\24\3\24\3\24\5\24\u010d\n\24\3\24\3\24\3\24\5\24\u0112\n\24\3"+
		"\24\3\24\3\24\3\24\7\24\u0118\n\24\f\24\16\24\u011b\13\24\5\24\u011d\n"+
		"\24\3\25\3\25\3\25\7\25\u0122\n\25\f\25\16\25\u0125\13\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u012f\n\26\3\27\3\27\3\27\5\27\u0134"+
		"\n\27\3\30\3\30\5\30\u0138\n\30\3\31\3\31\3\31\6\31\u013d\n\31\r\31\16"+
		"\31\u013e\3\32\3\32\3\32\6\32\u0144\n\32\r\32\16\32\u0145\3\32\3\32\5"+
		"\32\u014a\n\32\3\33\3\33\3\33\5\33\u014f\n\33\3\33\3\33\7\33\u0153\n\33"+
		"\f\33\16\33\u0156\13\33\3\33\3\33\3\34\3\34\7\34\u015c\n\34\f\34\16\34"+
		"\u015f\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\5\37\u0171\n\37\3 \3 \3 \7 \u0176\n \f \16 \u0179"+
		"\13 \3!\3!\3!\7!\u017e\n!\f!\16!\u0181\13!\3\"\5\"\u0184\n\"\3\"\3\"\5"+
		"\"\u0188\n\"\3\"\3\"\5\"\u018c\n\"\3\"\3\"\5\"\u0190\n\"\3\"\5\"\u0193"+
		"\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01a0\n#\3#\3#\3#\3#\3#\5#\u01a7"+
		"\n#\3#\3#\5#\u01ab\n#\3$\3$\5$\u01af\n$\3%\3%\3%\5%\u01b4\n%\3%\3%\5%"+
		"\u01b8\n%\3%\3%\5%\u01bc\n%\3%\3%\3%\7%\u01c1\n%\f%\16%\u01c4\13%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\7&\u01ce\n&\f&\16&\u01d1\13&\3&\3&\3&\2\2\'\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\4\4"+
		"\2%%((\4\2\3\3\26\26\u01fb\2L\3\2\2\2\4V\3\2\2\2\6`\3\2\2\2\bc\3\2\2\2"+
		"\nz\3\2\2\2\f\u0087\3\2\2\2\16\u008a\3\2\2\2\20\u0099\3\2\2\2\22\u00a6"+
		"\3\2\2\2\24\u00a8\3\2\2\2\26\u00bc\3\2\2\2\30\u00c0\3\2\2\2\32\u00d6\3"+
		"\2\2\2\34\u00d8\3\2\2\2\36\u00ef\3\2\2\2 \u00f6\3\2\2\2\"\u00f8\3\2\2"+
		"\2$\u0100\3\2\2\2&\u011c\3\2\2\2(\u011e\3\2\2\2*\u012e\3\2\2\2,\u0133"+
		"\3\2\2\2.\u0135\3\2\2\2\60\u0139\3\2\2\2\62\u0140\3\2\2\2\64\u014b\3\2"+
		"\2\2\66\u0159\3\2\2\28\u0162\3\2\2\2:\u0168\3\2\2\2<\u0170\3\2\2\2>\u0172"+
		"\3\2\2\2@\u017a\3\2\2\2B\u0192\3\2\2\2D\u01aa\3\2\2\2F\u01ae\3\2\2\2H"+
		"\u01b0\3\2\2\2J\u01c7\3\2\2\2LM\5\4\3\2MN\5\6\4\2NO\5(\25\2O\3\3\2\2\2"+
		"PQ\7\5\2\2QR\7\36\2\2RS\7,\2\2SU\7 \2\2TP\3\2\2\2UX\3\2\2\2VT\3\2\2\2"+
		"VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7-\2\2Z\5\3\2\2\2[_\5\b\5\2\\_\5\f\7"+
		"\2]_\5\16\b\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2"+
		"\2\2a\7\3\2\2\2b`\3\2\2\2cd\7.\2\2de\7/\2\2eg\7\25\2\2fh\5\34\17\2gf\3"+
		"\2\2\2gh\3\2\2\2hm\3\2\2\2ij\7\27\2\2jl\5\34\17\2ki\3\2\2\2lo\3\2\2\2"+
		"mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7$\2\2qu\7\n\2\2rt\5\f\7\2"+
		"sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\17\2"+
		"\2y\t\3\2\2\2z~\7\n\2\2{}\5\f\7\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~"+
		"\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\17\2\2\u0082"+
		"\13\3\2\2\2\u0083\u0084\5*\26\2\u0084\u0085\7\t\2\2\u0085\u0088\3\2\2"+
		"\2\u0086\u0088\5,\27\2\u0087\u0083\3\2\2\2\u0087\u0086\3\2\2\2\u0088\r"+
		"\3\2\2\2\u0089\u008b\7#\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\7&\2\2\u008d\u008e\7/\2\2\u008e\u0095\5\20"+
		"\t\2\u008f\u0093\7/\2\2\u0090\u0091\7\31\2\2\u0091\u0092\7\61\2\2\u0092"+
		"\u0094\7\37\2\2\u0093\u0090\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3"+
		"\2\2\2\u0095\u008f\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\7\t\2\2\u0098\17\3\2\2\2\u0099\u009d\7\n\2\2\u009a\u009c\5\22\n"+
		"\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\17\2\2"+
		"\u00a1\21\3\2\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4\7\t\2\2\u00a4\u00a7"+
		"\3\2\2\2\u00a5\u00a7\5\b\5\2\u00a6\u00a2\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\23\3\2\2\2\u00a8\u00a9\7.\2\2\u00a9\u00ae\5\26\f\2\u00aa\u00ab\7\27\2"+
		"\2\u00ab\u00ad\5\26\f\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\25\3\2\2\2\u00b0\u00ae\3\2\2"+
		"\2\u00b1\u00bd\5\30\r\2\u00b2\u00bd\7/\2\2\u00b3\u00b9\7/\2\2\u00b4\u00b5"+
		"\7\31\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00b8\7\37\2\2\u00b7\u00b4\3\2\2"+
		"\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00b1\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bc"+
		"\u00b3\3\2\2\2\u00bd\27\3\2\2\2\u00be\u00bf\7/\2\2\u00bf\u00c1\7\30\2"+
		"\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3"+
		"\5\32\16\2\u00c3\31\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5\u00c6\7\16\2\2\u00c6"+
		"\u00d7\5\36\20\2\u00c7\u00cd\7/\2\2\u00c8\u00c9\7\31\2\2\u00c9\u00ca\7"+
		"\61\2\2\u00ca\u00cc\7\37\2\2\u00cb\u00c8\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00d1\7\16\2\2\u00d1\u00d7\5\36\20\2\u00d2\u00d3\7/\2\2\u00d3"+
		"\u00d7\7\35\2\2\u00d4\u00d5\7/\2\2\u00d5\u00d7\7\34\2\2\u00d6\u00c4\3"+
		"\2\2\2\u00d6\u00c7\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\33\3\2\2\2\u00d8\u00e5\7.\2\2\u00d9\u00e6\7/\2\2\u00da\u00e0\7/\2\2\u00db"+
		"\u00dc\7\31\2\2\u00dc\u00dd\7\61\2\2\u00dd\u00df\7\37\2\2\u00de\u00db"+
		"\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\31\2\2\u00e4\u00e6\7"+
		"\37\2\2\u00e5\u00d9\3\2\2\2\u00e5\u00da\3\2\2\2\u00e6\35\3\2\2\2\u00e7"+
		"\u00f0\7\61\2\2\u00e8\u00e9\7\23\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00f0"+
		"\7\23\2\2\u00eb\u00f0\7\62\2\2\u00ec\u00f0\7\63\2\2\u00ed\u00f0\5 \21"+
		"\2\u00ee\u00f0\5\64\33\2\u00ef\u00e7\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef"+
		"\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2"+
		"\2\2\u00f0\37\3\2\2\2\u00f1\u00f7\5\"\22\2\u00f2\u00f3\7/\2\2\u00f3\u00f7"+
		"\7\35\2\2\u00f4\u00f5\7/\2\2\u00f5\u00f7\7\34\2\2\u00f6\u00f1\3\2\2\2"+
		"\u00f6\u00f2\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7!\3\2\2\2\u00f8\u00fd\5"+
		"$\23\2\u00f9\u00fa\t\2\2\2\u00fa\u00fc\5$\23\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe#\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u0100\u0105\5&\24\2\u0101\u0102\t\3\2\2\u0102\u0104"+
		"\5&\24\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106%\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u011d\7\61\2\2"+
		"\u0109\u011d\7\62\2\2\u010a\u010b\7/\2\2\u010b\u010d\7\30\2\2\u010c\u010a"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u011d\7/\2\2\u010f"+
		"\u0110\7/\2\2\u0110\u0112\7\30\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0119\7/\2\2\u0114\u0115\7\31\2\2\u0115"+
		"\u0116\7\61\2\2\u0116\u0118\7\37\2\2\u0117\u0114\3\2\2\2\u0118\u011b\3"+
		"\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011c\u0108\3\2\2\2\u011c\u0109\3\2\2\2\u011c\u010c\3\2"+
		"\2\2\u011c\u0111\3\2\2\2\u011d\'\3\2\2\2\u011e\u011f\7\22\2\2\u011f\u0123"+
		"\7\n\2\2\u0120\u0122\5\f\7\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u0127\7\17\2\2\u0127)\3\2\2\2\u0128\u012f\5.\30\2\u0129\u012f"+
		"\5\24\13\2\u012a\u012f\5\30\r\2\u012b\u012f\5\60\31\2\u012c\u012f\5\62"+
		"\32\2\u012d\u012f\5\64\33\2\u012e\u0128\3\2\2\2\u012e\u0129\3\2\2\2\u012e"+
		"\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2"+
		"\2\2\u012f+\3\2\2\2\u0130\u0134\5\66\34\2\u0131\u0134\5H%\2\u0132\u0134"+
		"\5J&\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"-\3\2\2\2\u0135\u0137\7\4\2\2\u0136\u0138\5\36\20\2\u0137\u0136\3\2\2"+
		"\2\u0137\u0138\3\2\2\2\u0138/\3\2\2\2\u0139\u013c\7\33\2\2\u013a\u013b"+
		"\7\r\2\2\u013b\u013d\7/\2\2\u013c\u013a\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\61\3\2\2\2\u0140\u0143\7\'\2"+
		"\2\u0141\u0142\7\f\2\2\u0142\u0144\7/\2\2\u0143\u0141\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0148\7\f\2\2\u0148\u014a\7)\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\63\3\2\2\2\u014b\u014c\7/\2\2\u014c\u014e\7\25\2\2\u014d\u014f"+
		"\7/\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0154\3\2\2\2\u0150"+
		"\u0151\7\27\2\2\u0151\u0153\7/\2\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0158\7$\2\2\u0158\65\3\2\2\2\u0159\u015d\58\35\2"+
		"\u015a\u015c\5:\36\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160"+
		"\u0161\5<\37\2\u0161\67\3\2\2\2\u0162\u0163\7\21\2\2\u0163\u0164\7\25"+
		"\2\2\u0164\u0165\5> \2\u0165\u0166\7$\2\2\u0166\u0167\5\n\6\2\u01679\3"+
		"\2\2\2\u0168\u0169\7\24\2\2\u0169\u016a\7\25\2\2\u016a\u016b\5> \2\u016b"+
		"\u016c\7$\2\2\u016c\u016d\5\n\6\2\u016d;\3\2\2\2\u016e\u016f\7\"\2\2\u016f"+
		"\u0171\5\n\6\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171=\3\2\2\2"+
		"\u0172\u0177\5@!\2\u0173\u0174\7\b\2\2\u0174\u0176\5@!\2\u0175\u0173\3"+
		"\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"?\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017f\5B\"\2\u017b\u017c\7\13\2\2"+
		"\u017c\u017e\5B\"\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180A\3\2\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0184\7!\2\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0193\5\64\33\2\u0186\u0188\7!\2\2\u0187\u0186\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0193\5D#\2\u018a\u018c\7!\2"+
		"\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0193"+
		"\5 \21\2\u018e\u0190\7!\2\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0193\7\63\2\2\u0192\u0183\3\2\2\2\u0192\u0187\3"+
		"\2\2\2\u0192\u018b\3\2\2\2\u0192\u018f\3\2\2\2\u0193C\3\2\2\2\u0194\u0195"+
		"\5F$\2\u0195\u0196\7\32\2\2\u0196\u0197\5F$\2\u0197\u01ab\3\2\2\2\u0198"+
		"\u0199\5F$\2\u0199\u019a\7\6\2\2\u019a\u019b\5F$\2\u019b\u01ab\3\2\2\2"+
		"\u019c\u019d\5F$\2\u019d\u019f\7 \2\2\u019e\u01a0\7\16\2\2\u019f\u019e"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\5F$\2\u01a2"+
		"\u01ab\3\2\2\2\u01a3\u01a4\5F$\2\u01a4\u01a6\7\36\2\2\u01a5\u01a7\7\16"+
		"\2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01a9\5F$\2\u01a9\u01ab\3\2\2\2\u01aa\u0194\3\2\2\2\u01aa\u0198\3\2\2"+
		"\2\u01aa\u019c\3\2\2\2\u01aa\u01a3\3\2\2\2\u01abE\3\2\2\2\u01ac\u01af"+
		"\5 \21\2\u01ad\u01af\5\64\33\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2"+
		"\u01afG\3\2\2\2\u01b0\u01b1\7\20\2\2\u01b1\u01b3\7\25\2\2\u01b2\u01b4"+
		"\5\24\13\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2"+
		"\u01b5\u01b7\7\t\2\2\u01b6\u01b8\5> \2\u01b7\u01b6\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\7\t\2\2\u01ba\u01bc\5\30\r\2"+
		"\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be"+
		"\7$\2\2\u01be\u01c2\7\n\2\2\u01bf\u01c1\5\f\7\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7\17\2\2\u01c6I\3\2\2\2\u01c7\u01c8"+
		"\7\7\2\2\u01c8\u01c9\7\25\2\2\u01c9\u01ca\5> \2\u01ca\u01cb\7$\2\2\u01cb"+
		"\u01cf\7\n\2\2\u01cc\u01ce\5\f\7\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2"+
		"\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d2\u01d3\7\17\2\2\u01d3K\3\2\2\2:V^`gmu~\u0087\u008a"+
		"\u0093\u0095\u009d\u00a6\u00ae\u00b9\u00bc\u00c0\u00cd\u00d6\u00e0\u00e5"+
		"\u00ef\u00f6\u00fd\u0105\u010c\u0111\u0119\u011c\u0123\u012e\u0133\u0137"+
		"\u013e\u0145\u0149\u014e\u0154\u015d\u0170\u0177\u017f\u0183\u0187\u018b"+
		"\u018f\u0192\u019f\u01a6\u01aa\u01ae\u01b3\u01b7\u01bb\u01c2\u01cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}