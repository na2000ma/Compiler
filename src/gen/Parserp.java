// Generated from D:/Compiler/src\Parserp.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Parserp extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INCLUDE=1, AA=2, LINK=3, DATA=4, CASE=5, PREAK=6, INNAME=7, ENDSWITCH=8, 
		CONTROLLER=9, TO=10, CONTROLS=11, PAGE=12, EXTENDS=13, HEADER=14, VAL=15, 
		GOTONAME=16, PRINTNAME=17, REQUEST=18, GO=19, PR=20, EQUAL=21, OPENBRACKET=22, 
		CLOSEBRACKET=23, OPENC=24, CLOSEC=25, STRINGARR=26, VAR=27, NUM=28, HTML_COMMENT=29, 
		CLOSE=30, COMMA=31, SWAN=32, SEA_WS=33, TAG_WHITESPACE=34, SINGLE_QOUTE=35, 
		TAG_NAME=36, IF_OPEN=37, FOR_OPEN=38, ARRAY_OPEN=39, SWITCH_OPEN=40, FOREACH_OPEN=41, 
		PRINT_OPEN=42, VAREQUAL_OPEN=43, IN_OPEN=44, OUT_OPEN=45, TEXT=46, IMAGEOUT=47, 
		OPENPOUT=48, CLOSEPOUT=49, NOUT=50, PATHOUT=51, COMMAMOUT=52, TOOUT=53, 
		OUT_CLOSE=54, FILE=55, IMAGEIN=56, EMAIL=57, COLOR=58, NUMBERn=59, NUAMIN=60, 
		NU=61, OPENP=62, CLOSEP=63, TOIN=64, N=65, PATH=66, H=67, COMMAM=68, E=69, 
		IN_CLOSE=70, FUNCTON=71, BODY_CLOSE=72, VAREACH=73, BDYFOREACH=74, FOREACH_CLOSE=75, 
		VARF=76, BDYFOR=77, FOR_CLOSE=78, PRSWITCH=79, VARSWITCH=80, TN=81, SWITCH_CLOSEC=82, 
		SWITCH_CLOSEP=83, OPENARRV=84, NUME=85, FUNCTIONE=86, W=87, STRINGG=88, 
		ST=89, VAREQUAL_CLOSE=90, STRINGP=91, NUMP=92, VARP=93, PRP=94, F=95, 
		PRINT_CLOSE=96, NUMarr=97, COMMAARR=98, STRINGARR1=99, VARARR=100, ARRAY_CLOSE=101, 
		ELSEIF=102, ELSE=103, VALID=104, CHECKED=105, REQUIRDE=106, NOVALIED=107, 
		VALIDMM=108, VALIEDPASSDIGIT=109, VALIEDPASSinputmode=110, VALIDEMAIL=111, 
		FIF=112, REQ=113, VAREQ=114, VIF=115, TAG_OPERATOR=116, IF_CLOSE=117, 
		ATT=118;
	public static final int
		RULE_pages = 0, RULE_body_controller = 1, RULE_def_controller = 2, RULE_def_page = 3, 
		RULE_body_page = 4, RULE_bodyIN = 5, RULE_bodyOUT = 6, RULE_in = 7, RULE_out = 8, 
		RULE_print = 9, RULE_arr = 10, RULE_arrv = 11, RULE_bodyarr = 12, RULE_varequal = 13, 
		RULE_foreach = 14, RULE_foreachp = 15, RULE_for = 16, RULE_forp = 17, 
		RULE_bodyfor = 18, RULE_bodyforeach = 19, RULE_bodyifc = 20, RULE_body = 21, 
		RULE_bodyP = 22, RULE_goto = 23, RULE_ifc = 24, RULE_if = 25, RULE_ifp = 26, 
		RULE_switch = 27, RULE_switchp = 28, RULE_body_switch = 29, RULE_f = 30, 
		RULE_include = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"pages", "body_controller", "def_controller", "def_page", "body_page", 
			"bodyIN", "bodyOUT", "in", "out", "print", "arr", "arrv", "bodyarr", 
			"varequal", "foreach", "foreachp", "for", "forp", "bodyfor", "bodyforeach", 
			"bodyifc", "body", "bodyP", "goto", "ifc", "if", "ifp", "switch", "switchp", 
			"body_switch", "f", "include"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'@'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'\n'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "','", null, null, "'file'", "'image'", "'email'", 
			"'color'", "'number'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'as'", null, null, "'in'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'else'", 
			null, null, null, null, "'novalied'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INCLUDE", "AA", "LINK", "DATA", "CASE", "PREAK", "INNAME", "ENDSWITCH", 
			"CONTROLLER", "TO", "CONTROLS", "PAGE", "EXTENDS", "HEADER", "VAL", "GOTONAME", 
			"PRINTNAME", "REQUEST", "GO", "PR", "EQUAL", "OPENBRACKET", "CLOSEBRACKET", 
			"OPENC", "CLOSEC", "STRINGARR", "VAR", "NUM", "HTML_COMMENT", "CLOSE", 
			"COMMA", "SWAN", "SEA_WS", "TAG_WHITESPACE", "SINGLE_QOUTE", "TAG_NAME", 
			"IF_OPEN", "FOR_OPEN", "ARRAY_OPEN", "SWITCH_OPEN", "FOREACH_OPEN", "PRINT_OPEN", 
			"VAREQUAL_OPEN", "IN_OPEN", "OUT_OPEN", "TEXT", "IMAGEOUT", "OPENPOUT", 
			"CLOSEPOUT", "NOUT", "PATHOUT", "COMMAMOUT", "TOOUT", "OUT_CLOSE", "FILE", 
			"IMAGEIN", "EMAIL", "COLOR", "NUMBERn", "NUAMIN", "NU", "OPENP", "CLOSEP", 
			"TOIN", "N", "PATH", "H", "COMMAM", "E", "IN_CLOSE", "FUNCTON", "BODY_CLOSE", 
			"VAREACH", "BDYFOREACH", "FOREACH_CLOSE", "VARF", "BDYFOR", "FOR_CLOSE", 
			"PRSWITCH", "VARSWITCH", "TN", "SWITCH_CLOSEC", "SWITCH_CLOSEP", "OPENARRV", 
			"NUME", "FUNCTIONE", "W", "STRINGG", "ST", "VAREQUAL_CLOSE", "STRINGP", 
			"NUMP", "VARP", "PRP", "F", "PRINT_CLOSE", "NUMarr", "COMMAARR", "STRINGARR1", 
			"VARARR", "ARRAY_CLOSE", "ELSEIF", "ELSE", "VALID", "CHECKED", "REQUIRDE", 
			"NOVALIED", "VALIDMM", "VALIEDPASSDIGIT", "VALIEDPASSinputmode", "VALIDEMAIL", 
			"FIF", "REQ", "VAREQ", "VIF", "TAG_OPERATOR", "IF_CLOSE", "ATT"
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

	@Override
	public String getGrammarFileName() { return "Parserp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parserp(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PagesContext extends ParserRuleContext {
		public List<TerminalNode> TAG_WHITESPACE() { return getTokens(Parserp.TAG_WHITESPACE); }
		public TerminalNode TAG_WHITESPACE(int i) {
			return getToken(Parserp.TAG_WHITESPACE, i);
		}
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public List<Def_pageContext> def_page() {
			return getRuleContexts(Def_pageContext.class);
		}
		public Def_pageContext def_page(int i) {
			return getRuleContext(Def_pageContext.class,i);
		}
		public List<Def_controllerContext> def_controller() {
			return getRuleContexts(Def_controllerContext.class);
		}
		public Def_controllerContext def_controller(int i) {
			return getRuleContext(Def_controllerContext.class,i);
		}
		public PagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pages; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterPages(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitPages(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitPages(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PagesContext pages() throws RecognitionException {
		PagesContext _localctx = new PagesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pages);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					match(TAG_WHITESPACE);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(70);
				include();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					match(TAG_WHITESPACE);
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PAGE:
				case TAG_WHITESPACE:
					{
					setState(82);
					def_page();
					}
					break;
				case CONTROLLER:
					{
					setState(83);
					def_controller();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTROLLER) | (1L << PAGE) | (1L << TAG_WHITESPACE))) != 0) );
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

	public static class Body_controllerContext extends ParserRuleContext {
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(Parserp.CLOSE, 0); }
		public VarequalContext varequal() {
			return getRuleContext(VarequalContext.class,0);
		}
		public IfContext if() {
			return getRuleContext(IfContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public SwitchContext switch() {
			return getRuleContext(SwitchContext.class,0);
		}
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public ForContext for() {
			return getRuleContext(ForContext.class,0);
		}
		public Body_controllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_controller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterBody_controller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitBody_controller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitBody_controller(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_controllerContext body_controller() throws RecognitionException {
		Body_controllerContext _localctx = new Body_controllerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body_controller);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(88);
				arr();
				setState(89);
				match(CLOSE);
				}
				}
				break;
			case VAREQUAL_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				varequal();
				}
				break;
			case IF_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				if();
				}
				break;
			case PRINT_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				print();
				}
				break;
			case SWITCH_OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				switch();
				}
				break;
			case FOREACH_OPEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				foreach();
				}
				break;
			case TAG_NAME:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				f();
				}
				break;
			case FOR_OPEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				for();
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

	public static class Def_controllerContext extends ParserRuleContext {
		public TerminalNode CONTROLLER() { return getToken(Parserp.CONTROLLER, 0); }
		public List<TerminalNode> TAG_NAME() { return getTokens(Parserp.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(Parserp.TAG_NAME, i);
		}
		public TerminalNode CONTROLS() { return getToken(Parserp.CONTROLS, 0); }
		public TerminalNode OPENBRACKET() { return getToken(Parserp.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(Parserp.CLOSEBRACKET, 0); }
		public List<Body_controllerContext> body_controller() {
			return getRuleContexts(Body_controllerContext.class);
		}
		public Body_controllerContext body_controller(int i) {
			return getRuleContext(Body_controllerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parserp.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parserp.COMMA, i);
		}
		public List<TerminalNode> TAG_WHITESPACE() { return getTokens(Parserp.TAG_WHITESPACE); }
		public TerminalNode TAG_WHITESPACE(int i) {
			return getToken(Parserp.TAG_WHITESPACE, i);
		}
		public Def_controllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_controller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterDef_controller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitDef_controller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitDef_controller(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_controllerContext def_controller() throws RecognitionException {
		Def_controllerContext _localctx = new Def_controllerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def_controller);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(CONTROLLER);
			setState(101);
			match(TAG_NAME);
			setState(102);
			match(CONTROLS);
			{
			setState(103);
			match(TAG_NAME);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(104);
				match(COMMA);
				setState(105);
				match(TAG_NAME);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(111);
			match(OPENBRACKET);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAG_NAME) | (1L << IF_OPEN) | (1L << FOR_OPEN) | (1L << ARRAY_OPEN) | (1L << SWITCH_OPEN) | (1L << FOREACH_OPEN) | (1L << PRINT_OPEN) | (1L << VAREQUAL_OPEN))) != 0)) {
				{
				{
				setState(112);
				body_controller();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_WHITESPACE) {
					{
					{
					setState(113);
					match(TAG_WHITESPACE);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(CLOSEBRACKET);
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

	public static class Def_pageContext extends ParserRuleContext {
		public TerminalNode PAGE() { return getToken(Parserp.PAGE, 0); }
		public List<TerminalNode> TAG_NAME() { return getTokens(Parserp.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(Parserp.TAG_NAME, i);
		}
		public TerminalNode OPENBRACKET() { return getToken(Parserp.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(Parserp.CLOSEBRACKET, 0); }
		public List<TerminalNode> TAG_WHITESPACE() { return getTokens(Parserp.TAG_WHITESPACE); }
		public TerminalNode TAG_WHITESPACE(int i) {
			return getToken(Parserp.TAG_WHITESPACE, i);
		}
		public List<TerminalNode> EXTENDS() { return getTokens(Parserp.EXTENDS); }
		public TerminalNode EXTENDS(int i) {
			return getToken(Parserp.EXTENDS, i);
		}
		public List<TerminalNode> HEADER() { return getTokens(Parserp.HEADER); }
		public TerminalNode HEADER(int i) {
			return getToken(Parserp.HEADER, i);
		}
		public List<Body_pageContext> body_page() {
			return getRuleContexts(Body_pageContext.class);
		}
		public Body_pageContext body_page(int i) {
			return getRuleContext(Body_pageContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parserp.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parserp.COMMA, i);
		}
		public Def_pageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterDef_page(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitDef_page(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitDef_page(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_pageContext def_page() throws RecognitionException {
		Def_pageContext _localctx = new Def_pageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_WHITESPACE) {
				{
				{
				setState(126);
				match(TAG_WHITESPACE);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(PAGE);
			setState(133);
			match(TAG_NAME);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXTENDS) {
				{
				{
				setState(134);
				match(EXTENDS);
				{
				setState(135);
				match(TAG_NAME);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(136);
					match(COMMA);
					setState(137);
					match(TAG_NAME);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(143);
				match(HEADER);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(OPENBRACKET);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AA) | (1L << LINK) | (1L << DATA) | (1L << TAG_NAME) | (1L << PRINT_OPEN) | (1L << VAREQUAL_OPEN) | (1L << IN_OPEN) | (1L << OUT_OPEN))) != 0)) {
				{
				{
				setState(150);
				body_page();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_WHITESPACE) {
				{
				{
				setState(156);
				match(TAG_WHITESPACE);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(CLOSEBRACKET);
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

	public static class Body_pageContext extends ParserRuleContext {
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public TerminalNode LINK() { return getToken(Parserp.LINK, 0); }
		public TerminalNode DATA() { return getToken(Parserp.DATA, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public VarequalContext varequal() {
			return getRuleContext(VarequalContext.class,0);
		}
		public IfpContext ifp() {
			return getRuleContext(IfpContext.class,0);
		}
		public ForeachpContext foreachp() {
			return getRuleContext(ForeachpContext.class,0);
		}
		public ForpContext forp() {
			return getRuleContext(ForpContext.class,0);
		}
		public SwitchpContext switchp() {
			return getRuleContext(SwitchpContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public Body_pageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterBody_page(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitBody_page(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitBody_page(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_pageContext body_page() throws RecognitionException {
		Body_pageContext _localctx = new Body_pageContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(164);
				in();
				}
				break;
			case 2:
				{
				setState(165);
				out();
				}
				break;
			case 3:
				{
				setState(166);
				match(LINK);
				}
				break;
			case 4:
				{
				setState(167);
				match(DATA);
				}
				break;
			case 5:
				{
				setState(168);
				print();
				}
				break;
			case 6:
				{
				setState(169);
				varequal();
				}
				break;
			case 7:
				{
				setState(170);
				ifp();
				}
				break;
			case 8:
				{
				setState(171);
				foreachp();
				}
				break;
			case 9:
				{
				setState(172);
				forp();
				}
				break;
			case 10:
				{
				setState(173);
				switchp();
				}
				break;
			case 11:
				{
				setState(174);
				f();
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

	public static class BodyINContext extends ParserRuleContext {
		public TerminalNode TOIN() { return getToken(Parserp.TOIN, 0); }
		public TerminalNode OPENP() { return getToken(Parserp.OPENP, 0); }
		public TerminalNode CLOSEP() { return getToken(Parserp.CLOSEP, 0); }
		public List<TerminalNode> N() { return getTokens(Parserp.N); }
		public TerminalNode N(int i) {
			return getToken(Parserp.N, i);
		}
		public TerminalNode COMMAM() { return getToken(Parserp.COMMAM, 0); }
		public BodyINContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyIN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterBodyIN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitBodyIN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitBodyIN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyINContext bodyIN() throws RecognitionException {
		BodyINContext _localctx = new BodyINContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bodyIN);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(177);
			match(TOIN);
			setState(178);
			match(OPENP);
			{
			setState(179);
			match(N);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAM) {
				{
				setState(180);
				match(COMMAM);
				setState(181);
				match(N);
				}
			}

			}
			setState(184);
			match(CLOSEP);
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

	public static class BodyOUTContext extends ParserRuleContext {
		public TerminalNode TOOUT() { return getToken(Parserp.TOOUT, 0); }
		public TerminalNode OPENPOUT() { return getToken(Parserp.OPENPOUT, 0); }
		public TerminalNode CLOSEPOUT() { return getToken(Parserp.CLOSEPOUT, 0); }
		public List<TerminalNode> NOUT() { return getTokens(Parserp.NOUT); }
		public TerminalNode NOUT(int i) {
			return getToken(Parserp.NOUT, i);
		}
		public TerminalNode COMMAMOUT() { return getToken(Parserp.COMMAMOUT, 0); }
		public BodyOUTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyOUT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterBodyOUT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitBodyOUT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitBodyOUT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyOUTContext bodyOUT() throws RecognitionException {
		BodyOUTContext _localctx = new BodyOUTContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bodyOUT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(186);
			match(TOOUT);
			setState(187);
			match(OPENPOUT);
			{
			setState(188);
			match(NOUT);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAMOUT) {
				{
				setState(189);
				match(COMMAMOUT);
				setState(190);
				match(NOUT);
				}
			}

			}
			setState(193);
			match(CLOSEPOUT);
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
		public TerminalNode IN_OPEN() { return getToken(Parserp.IN_OPEN, 0); }
		public TerminalNode CLOSEP() { return getToken(Parserp.CLOSEP, 0); }
		public TerminalNode IN_CLOSE() { return getToken(Parserp.IN_CLOSE, 0); }
		public BodyINContext bodyIN() {
			return getRuleContext(BodyINContext.class,0);
		}
		public TerminalNode COLOR() { return getToken(Parserp.COLOR, 0); }
		public TerminalNode OPENP() { return getToken(Parserp.OPENP, 0); }
		public TerminalNode H() { return getToken(Parserp.H, 0); }
		public TerminalNode EMAIL() { return getToken(Parserp.EMAIL, 0); }
		public TerminalNode E() { return getToken(Parserp.E, 0); }
		public TerminalNode PATH() { return getToken(Parserp.PATH, 0); }
		public TerminalNode NUMBERn() { return getToken(Parserp.NUMBERn, 0); }
		public TerminalNode NU() { return getToken(Parserp.NU, 0); }
		public TerminalNode NUAMIN() { return getToken(Parserp.NUAMIN, 0); }
		public TerminalNode N() { return getToken(Parserp.N, 0); }
		public TerminalNode FILE() { return getToken(Parserp.FILE, 0); }
		public TerminalNode IMAGEIN() { return getToken(Parserp.IMAGEIN, 0); }
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(IN_OPEN);
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				{
				{
				setState(196);
				match(COLOR);
				setState(197);
				match(OPENP);
				setState(198);
				match(H);
				}
				}
				break;
			case EMAIL:
				{
				{
				setState(199);
				match(EMAIL);
				setState(200);
				match(OPENP);
				setState(201);
				match(E);
				}
				}
				break;
			case FILE:
			case IMAGEIN:
				{
				{
				setState(202);
				_la = _input.LA(1);
				if ( !(_la==FILE || _la==IMAGEIN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(203);
				match(OPENP);
				setState(204);
				match(PATH);
				}
				}
				break;
			case NUMBERn:
				{
				{
				setState(205);
				match(NUMBERn);
				setState(206);
				match(OPENP);
				setState(207);
				match(NU);
				}
				}
				break;
			case NUAMIN:
				{
				{
				setState(208);
				match(NUAMIN);
				setState(209);
				match(OPENP);
				setState(210);
				match(N);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(213);
			match(CLOSEP);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOIN) {
				{
				setState(214);
				bodyIN();
				}
			}

			setState(217);
			match(IN_CLOSE);
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
		public TerminalNode CLOSEPOUT() { return getToken(Parserp.CLOSEPOUT, 0); }
		public TerminalNode OUT_CLOSE() { return getToken(Parserp.OUT_CLOSE, 0); }
		public TerminalNode OUT_OPEN() { return getToken(Parserp.OUT_OPEN, 0); }
		public BodyOUTContext bodyOUT() {
			return getRuleContext(BodyOUTContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(Parserp.TEXT, 0); }
		public TerminalNode OPENPOUT() { return getToken(Parserp.OPENPOUT, 0); }
		public TerminalNode NOUT() { return getToken(Parserp.NOUT, 0); }
		public TerminalNode IMAGEOUT() { return getToken(Parserp.IMAGEOUT, 0); }
		public TerminalNode PATHOUT() { return getToken(Parserp.PATHOUT, 0); }
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_out);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(219);
			match(OUT_OPEN);
			}
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				{
				{
				setState(220);
				match(TEXT);
				setState(221);
				match(OPENPOUT);
				setState(222);
				match(NOUT);
				}
				}
				break;
			case IMAGEOUT:
				{
				{
				setState(223);
				match(IMAGEOUT);
				setState(224);
				match(OPENPOUT);
				setState(225);
				match(PATHOUT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(228);
			match(CLOSEPOUT);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOOUT) {
				{
				setState(229);
				bodyOUT();
				}
			}

			setState(232);
			match(OUT_CLOSE);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT_OPEN() { return getToken(Parserp.PRINT_OPEN, 0); }
		public TerminalNode PRINT_CLOSE() { return getToken(Parserp.PRINT_CLOSE, 0); }
		public TerminalNode CLOSE() { return getToken(Parserp.CLOSE, 0); }
		public TerminalNode VARP() { return getToken(Parserp.VARP, 0); }
		public TerminalNode PRP() { return getToken(Parserp.PRP, 0); }
		public TerminalNode F() { return getToken(Parserp.F, 0); }
		public List<TerminalNode> TAG_WHITESPACE() { return getTokens(Parserp.TAG_WHITESPACE); }
		public TerminalNode TAG_WHITESPACE(int i) {
			return getToken(Parserp.TAG_WHITESPACE, i);
		}
		public List<TerminalNode> STRINGP() { return getTokens(Parserp.STRINGP); }
		public TerminalNode STRINGP(int i) {
			return getToken(Parserp.STRINGP, i);
		}
		public List<TerminalNode> NUMP() { return getTokens(Parserp.NUMP); }
		public TerminalNode NUMP(int i) {
			return getToken(Parserp.NUMP, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(PRINT_OPEN);
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGP:
				{
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(235);
					match(STRINGP);
					}
					}
					setState(238); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRINGP );
				}
				break;
			case VARP:
				{
				setState(240);
				match(VARP);
				}
				break;
			case NUMP:
				{
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(241);
					match(NUMP);
					}
					}
					setState(244); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMP );
				}
				break;
			case PRP:
				{
				setState(246);
				match(PRP);
				}
				break;
			case F:
				{
				setState(247);
				match(F);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_WHITESPACE) {
				{
				{
				setState(250);
				match(TAG_WHITESPACE);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(PRINT_CLOSE);
			setState(257);
			match(CLOSE);
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

	public static class ArrContext extends ParserRuleContext {
		public TerminalNode ARRAY_OPEN() { return getToken(Parserp.ARRAY_OPEN, 0); }
		public BodyarrContext bodyarr() {
			return getRuleContext(BodyarrContext.class,0);
		}
		public TerminalNode ARRAY_CLOSE() { return getToken(Parserp.ARRAY_CLOSE, 0); }
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ARRAY_OPEN);
			setState(260);
			bodyarr();
			setState(261);
			match(ARRAY_CLOSE);
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

	public static class ArrvContext extends ParserRuleContext {
		public TerminalNode OPENARRV() { return getToken(Parserp.OPENARRV, 0); }
		public BodyarrContext bodyarr() {
			return getRuleContext(BodyarrContext.class,0);
		}
		public TerminalNode ARRAY_CLOSE() { return getToken(Parserp.ARRAY_CLOSE, 0); }
		public ArrvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterArrv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitArrv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitArrv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrvContext arrv() throws RecognitionException {
		ArrvContext _localctx = new ArrvContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(OPENARRV);
			setState(264);
			bodyarr();
			setState(265);
			match(ARRAY_CLOSE);
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

	public static class BodyarrContext extends ParserRuleContext {
		public List<TerminalNode> STRINGARR1() { return getTokens(Parserp.STRINGARR1); }
		public TerminalNode STRINGARR1(int i) {
			return getToken(Parserp.STRINGARR1, i);
		}
		public List<TerminalNode> COMMAARR() { return getTokens(Parserp.COMMAARR); }
		public TerminalNode COMMAARR(int i) {
			return getToken(Parserp.COMMAARR, i);
		}
		public List<TerminalNode> NUMarr() { return getTokens(Parserp.NUMarr); }
		public TerminalNode NUMarr(int i) {
			return getToken(Parserp.NUMarr, i);
		}
		public List<TerminalNode> VARARR() { return getTokens(Parserp.VARARR); }
		public TerminalNode VARARR(int i) {
			return getToken(Parserp.VARARR, i);
		}
		public BodyarrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyarr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterBodyarr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitBodyarr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitBodyarr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyarrContext bodyarr() throws RecognitionException {
		BodyarrContext _localctx = new BodyarrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bodyarr);
		int _la;
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGARR1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(267);
				match(STRINGARR1);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAARR) {
					{
					{
					setState(268);
					match(COMMAARR);
					setState(269);
					match(STRINGARR1);
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case NUMarr:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(275);
					match(NUMarr);
					}
					}
					setState(278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMarr );
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAARR) {
					{
					{
					setState(280);
					match(COMMAARR);
					setState(282); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(281);
						match(NUMarr);
						}
						}
						setState(284); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NUMarr );
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case VARARR:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(291);
				match(VARARR);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAARR) {
					{
					{
					setState(292);
					match(COMMAARR);
					setState(293);
					match(VARARR);
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class VarequalContext extends ParserRuleContext {
		public TerminalNode VAREQUAL_OPEN() { return getToken(Parserp.VAREQUAL_OPEN, 0); }
		public TerminalNode VAREQUAL_CLOSE() { return getToken(Parserp.VAREQUAL_CLOSE, 0); }
		public ArrvContext arrv() {
			return getRuleContext(ArrvContext.class,0);
		}
		public TerminalNode STRINGG() { return getToken(Parserp.STRINGG, 0); }
		public TerminalNode FUNCTIONE() { return getToken(Parserp.FUNCTIONE, 0); }
		public TerminalNode ST() { return getToken(Parserp.ST, 0); }
		public List<TerminalNode> NUME() { return getTokens(Parserp.NUME); }
		public TerminalNode NUME(int i) {
			return getToken(Parserp.NUME, i);
		}
		public VarequalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varequal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterVarequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitVarequal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitVarequal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarequalContext varequal() throws RecognitionException {
		VarequalContext _localctx = new VarequalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varequal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(VAREQUAL_OPEN);
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENARRV:
				{
				setState(302);
				arrv();
				}
				break;
			case STRINGG:
				{
				setState(303);
				match(STRINGG);
				}
				break;
			case NUME:
				{
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(304);
					match(NUME);
					}
					}
					setState(307); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUME );
				}
				break;
			case FUNCTIONE:
				{
				setState(309);
				match(FUNCTIONE);
				}
				break;
			case ST:
				{
				setState(310);
				match(ST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(313);
			match(VAREQUAL_CLOSE);
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

	public static class ForeachContext extends ParserRuleContext {
		public TerminalNode FOREACH_OPEN() { return getToken(Parserp.FOREACH_OPEN, 0); }
		public BodyforeachContext bodyforeach() {
			return getRuleContext(BodyforeachContext.class,0);
		}
		public TerminalNode FOREACH_CLOSE() { return getToken(Parserp.FOREACH_CLOSE, 0); }
		public TerminalNode OPENBRACKET() { return getToken(Parserp.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(Parserp.CLOSEBRACKET, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitForeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitForeach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_foreach);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(FOREACH_OPEN);
			setState(316);
			bodyforeach();
			setState(317);
			match(FOREACH_CLOSE);
			setState(318);
			match(OPENBRACKET);
			setState(320); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(319);
				body();
				}
				}
				setState(322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AA) | (1L << GOTONAME) | (1L << TAG_WHITESPACE) | (1L << IF_OPEN) | (1L << FOR_OPEN) | (1L << ARRAY_OPEN) | (1L << FOREACH_OPEN) | (1L << PRINT_OPEN) | (1L << VAREQUAL_OPEN))) != 0) || _la==FUNCTON );
			setState(324);
			match(CLOSEBRACKET);
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

	public static class ForeachpContext extends ParserRuleContext {
		public TerminalNode AA() { return getToken(Parserp.AA, 0); }
		public TerminalNode FOREACH_OPEN() { return getToken(Parserp.FOREACH_OPEN, 0); }
		public BodyforeachContext bodyforeach() {
			return getRuleContext(BodyforeachContext.class,0);
		}
		public TerminalNode FOREACH_CLOSE() { return getToken(Parserp.FOREACH_CLOSE, 0); }
		public TerminalNode OPENBRACKET() { return getToken(Parserp.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(Parserp.CLOSEBRACKET, 0); }
		public List<BodyPContext> bodyP() {
			return getRuleContexts(BodyPContext.class);
		}
		public BodyPContext bodyP(int i) {
			return getRuleContext(BodyPContext.class,i);
		}
		public ForeachpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterForeachp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitForeachp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitForeachp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachpContext foreachp() throws RecognitionException {
		ForeachpContext _localctx = new ForeachpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_foreachp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(AA);
			setState(327);
			match(FOREACH_OPEN);
			setState(328);
			bodyforeach();
			setState(329);
			match(FOREACH_CLOSE);
			setState(330);
			match(OPENBRACKET);
			setState(332); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(331);
				bodyP();
				}
				}
				setState(334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AA) | (1L << LINK) | (1L << DATA) | (1L << GOTONAME) | (1L << TAG_WHITESPACE) | (1L << ARRAY_OPEN) | (1L << PRINT_OPEN) | (1L << VAREQUAL_OPEN) | (1L << IN_OPEN) | (1L << OUT_OPEN))) != 0) || _la==FUNCTON );
			setState(336);
			match(CLOSEBRACKET);
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

	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR_OPEN() { return getToken(Parserp.FOR_OPEN, 0); }
		public BodyforContext bodyfor() {
			return getRuleContext(BodyforContext.class,0);
		}
		public TerminalNode FOR_CLOSE() { return getToken(Parserp.FOR_CLOSE, 0); }
		public TerminalNode OPENBRACKET() { return getToken(Parserp.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(Parserp.CLOSEBRACKET, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(FOR_OPEN);
			setState(339);
			bodyfor();
			setState(340);
			match(FOR_CLOSE);
			setState(341);
			match(OPENBRACKET);
			setState(343); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(342);
				body();
				}
				}
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AA) | (1L << GOTONAME) | (1L << TAG_WHITESPACE) | (1L << IF_OPEN) | (1L << FOR_OPEN) | (1L << ARRAY_OPEN) | (1L << FOREACH_OPEN) | (1L << PRINT_OPEN) | (1L << VAREQUAL_OPEN))) != 0) || _la==FUNCTON );
			setState(347);
			match(CLOSEBRACKET);
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

	public static class ForpContext extends ParserRuleContext {
		public TerminalNode AA() { return getToken(Parserp.AA, 0); }
		public TerminalNode FOR_OPEN() { return getToken(Parserp.FOR_OPEN, 0); }
		public BodyforContext bodyfor() {
			return getRuleContext(BodyforContext.class,0);
		}
		public TerminalNode FOR_CLOSE() { return getToken(Parserp.FOR_CLOSE, 0); }
		public TerminalNode OPENBRACKET() { return getToken(Parserp.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(Parserp.CLOSEBRACKET, 0); }
		public List<BodyPContext> bodyP() {
			return getRuleContexts(BodyPContext.class);
		}
		public BodyPContext bodyP(int i) {
			return getRuleContext(BodyPContext.class,i);
		}
		public ForpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterForp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitForp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitForp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForpContext forp() throws RecognitionException {
		ForpContext _localctx = new ForpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(AA);
			setState(350);
			match(FOR_OPEN);
			setState(351);
			bodyfor();
			setState(352);
			match(FOR_CLOSE);
			setState(353);
			match(OPENBRACKET);
			setState(355); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(354);
				bodyP();
				}
				}
				setState(357); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AA) | (1L << LINK) | (1L << DATA) | (1L << GOTONAME) | (1L << TAG_WHITESPACE) | (1L << ARRAY_OPEN) | (1L << PRINT_OPEN) | (1L << VAREQUAL_OPEN) | (1L << IN_OPEN) | (1L << OUT_OPEN))) != 0) || _la==FUNCTON );
			setState(359);
			match(CLOSEBRACKET);
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

	public static class BodyforContext extends ParserRuleContext {
		public List<TerminalNode> VARF() { return getTokens(Parserp.VARF); }
		public TerminalNode VARF(int i) {
			return getToken(Parserp.VARF, i);
		}
		public TerminalNode BDYFOR() { return getToken(Parserp.BDYFOR, 0); }
		public BodyforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterBodyfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitBodyfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitBodyfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyforContext bodyfor() throws RecognitionException {
		BodyforContext _localctx = new BodyforContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bodyfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(VARF);
			setState(362);
			match(BDYFOR);
			setState(363);
			match(VARF);
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

	public static class BodyforeachContext extends ParserRuleContext {
		public List<TerminalNode> VAREACH() { return getTokens(Parserp.VAREACH); }
		public TerminalNode VAREACH(int i) {
			return getToken(Parserp.VAREACH, i);
		}
		public TerminalNode BDYFOREACH() { return getToken(Parserp.BDYFOREACH, 0); }
		public BodyforeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyforeach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterBodyforeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitBodyforeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitBodyforeach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyforeachContext bodyforeach() throws RecognitionException {
		BodyforeachContext _localctx = new BodyforeachContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bodyforeach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(VAREACH);
			setState(366);
			match(BDYFOREACH);
			setState(367);
			match(VAREACH);
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

	public static class BodyifcContext extends ParserRuleContext {
		public TerminalNode FIF() { return getToken(Parserp.FIF, 0); }
		public TerminalNode VIF() { return getToken(Parserp.VIF, 0); }
		public TerminalNode REQ() { return getToken(Parserp.REQ, 0); }
		public TerminalNode VAREQ() { return getToken(Parserp.VAREQ, 0); }
		public TerminalNode TAG_OPERATOR() { return getToken(Parserp.TAG_OPERATOR, 0); }
		public BodyifcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyifc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterBodyifc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitBodyifc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitBodyifc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyifcContext bodyifc() throws RecognitionException {
		BodyifcContext _localctx = new BodyifcContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bodyifc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQ:
				{
				{
				setState(369);
				match(REQ);
				setState(370);
				match(VAREQ);
				}
				}
				break;
			case FIF:
				{
				setState(371);
				match(FIF);
				}
				break;
			case VIF:
				{
				setState(372);
				match(VIF);
				setState(377);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_OPERATOR:
				case IF_CLOSE:
					{
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TAG_OPERATOR) {
						{
						setState(373);
						match(TAG_OPERATOR);
						}
					}

					}
					break;
				case VAREQ:
					{
					{
					setState(376);
					match(VAREQ);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BodyContext extends ParserRuleContext {
		public VarequalContext varequal() {
			return getRuleContext(VarequalContext.class,0);
		}
		public IfContext if() {
			return getRuleContext(IfContext.class,0);
		}
		public ForContext for() {
			return getRuleContext(ForContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public GotoContext goto() {
			return getRuleContext(GotoContext.class,0);
		}
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public SwitchpContext switchp() {
			return getRuleContext(SwitchpContext.class,0);
		}
		public TerminalNode FUNCTON() { return getToken(Parserp.FUNCTON, 0); }
		public List<TerminalNode> TAG_WHITESPACE() { return getTokens(Parserp.TAG_WHITESPACE); }
		public TerminalNode TAG_WHITESPACE(int i) {
			return getToken(Parserp.TAG_WHITESPACE, i);
		}
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(Parserp.CLOSE, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_WHITESPACE) {
				{
				{
				setState(381);
				match(TAG_WHITESPACE);
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAREQUAL_OPEN:
				{
				setState(387);
				varequal();
				}
				break;
			case IF_OPEN:
				{
				setState(388);
				if();
				}
				break;
			case FOR_OPEN:
				{
				setState(389);
				for();
				}
				break;
			case PRINT_OPEN:
				{
				setState(390);
				print();
				}
				break;
			case GOTONAME:
				{
				setState(391);
				goto();
				}
				break;
			case FOREACH_OPEN:
				{
				setState(392);
				foreach();
				}
				break;
			case AA:
				{
				setState(393);
				switchp();
				}
				break;
			case FUNCTON:
				{
				setState(394);
				match(FUNCTON);
				}
				break;
			case ARRAY_OPEN:
				{
				{
				setState(395);
				arr();
				setState(396);
				match(CLOSE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(400);
					match(TAG_WHITESPACE);
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class BodyPContext extends ParserRuleContext {
		public VarequalContext varequal() {
			return getRuleContext(VarequalContext.class,0);
		}
		public IfpContext ifp() {
			return getRuleContext(IfpContext.class,0);
		}
		public ForpContext forp() {
			return getRuleContext(ForpContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public GotoContext goto() {
			return getRuleContext(GotoContext.class,0);
		}
		public ForeachpContext foreachp() {
			return getRuleContext(ForeachpContext.class,0);
		}
		public SwitchpContext switchp() {
			return getRuleContext(SwitchpContext.class,0);
		}
		public TerminalNode FUNCTON() { return getToken(Parserp.FUNCTON, 0); }
		public TerminalNode LINK() { return getToken(Parserp.LINK, 0); }
		public TerminalNode DATA() { return getToken(Parserp.DATA, 0); }
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public List<TerminalNode> TAG_WHITESPACE() { return getTokens(Parserp.TAG_WHITESPACE); }
		public TerminalNode TAG_WHITESPACE(int i) {
			return getToken(Parserp.TAG_WHITESPACE, i);
		}
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(Parserp.CLOSE, 0); }
		public BodyPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterBodyP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitBodyP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitBodyP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyPContext bodyP() throws RecognitionException {
		BodyPContext _localctx = new BodyPContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bodyP);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_WHITESPACE) {
				{
				{
				setState(406);
				match(TAG_WHITESPACE);
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(412);
				varequal();
				}
				break;
			case 2:
				{
				setState(413);
				ifp();
				}
				break;
			case 3:
				{
				setState(414);
				forp();
				}
				break;
			case 4:
				{
				setState(415);
				print();
				}
				break;
			case 5:
				{
				setState(416);
				goto();
				}
				break;
			case 6:
				{
				setState(417);
				foreachp();
				}
				break;
			case 7:
				{
				setState(418);
				switchp();
				}
				break;
			case 8:
				{
				setState(419);
				match(FUNCTON);
				}
				break;
			case 9:
				{
				{
				setState(420);
				arr();
				setState(421);
				match(CLOSE);
				}
				}
				break;
			case 10:
				{
				setState(423);
				match(LINK);
				}
				break;
			case 11:
				{
				setState(424);
				match(DATA);
				}
				break;
			case 12:
				{
				setState(425);
				in();
				}
				break;
			case 13:
				{
				setState(426);
				out();
				}
				break;
			}
			setState(432);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(429);
					match(TAG_WHITESPACE);
					}
					} 
				}
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class GotoContext extends ParserRuleContext {
		public TerminalNode GOTONAME() { return getToken(Parserp.GOTONAME, 0); }
		public TerminalNode TAG_NAME() { return getToken(Parserp.TAG_NAME, 0); }
		public TerminalNode CLOSE() { return getToken(Parserp.CLOSE, 0); }
		public TerminalNode OPENC() { return getToken(Parserp.OPENC, 0); }
		public List<TerminalNode> VAR() { return getTokens(Parserp.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(Parserp.VAR, i);
		}
		public TerminalNode CLOSEC() { return getToken(Parserp.CLOSEC, 0); }
		public List<TerminalNode> TAG_WHITESPACE() { return getTokens(Parserp.TAG_WHITESPACE); }
		public TerminalNode TAG_WHITESPACE(int i) {
			return getToken(Parserp.TAG_WHITESPACE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parserp.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parserp.COMMA, i);
		}
		public GotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitGoto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitGoto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoContext goto() throws RecognitionException {
		GotoContext _localctx = new GotoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_goto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(GOTONAME);
			setState(436);
			match(TAG_NAME);
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_WHITESPACE) {
					{
					{
					setState(437);
					match(TAG_WHITESPACE);
					}
					}
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(443);
				match(OPENC);
				setState(444);
				match(VAR);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(445);
					match(COMMA);
					setState(446);
					match(VAR);
					}
					}
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(452);
				match(CLOSEC);
				}
				break;
			}
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_WHITESPACE) {
				{
				{
				setState(455);
				match(TAG_WHITESPACE);
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
			match(CLOSE);
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

	public static class IfcContext extends ParserRuleContext {
		public TerminalNode IF_OPEN() { return getToken(Parserp.IF_OPEN, 0); }
		public BodyifcContext bodyifc() {
			return getRuleContext(BodyifcContext.class,0);
		}
		public TerminalNode IF_CLOSE() { return getToken(Parserp.IF_CLOSE, 0); }
		public IfcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterIfc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitIfc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitIfc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfcContext ifc() throws RecognitionException {
		IfcContext _localctx = new IfcContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(IF_OPEN);
			setState(464);
			bodyifc();
			setState(465);
			match(IF_CLOSE);
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

	public static class IfContext extends ParserRuleContext {
		public List<IfcContext> ifc() {
			return getRuleContexts(IfcContext.class);
		}
		public IfcContext ifc(int i) {
			return getRuleContext(IfcContext.class,i);
		}
		public List<TerminalNode> OPENBRACKET() { return getTokens(Parserp.OPENBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(Parserp.OPENBRACKET, i);
		}
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(Parserp.CLOSEBRACKET); }
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(Parserp.CLOSEBRACKET, i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(Parserp.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(Parserp.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(Parserp.ELSE, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			ifc();
			setState(468);
			match(OPENBRACKET);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AA) | (1L << GOTONAME) | (1L << TAG_WHITESPACE) | (1L << IF_OPEN) | (1L << FOR_OPEN) | (1L << ARRAY_OPEN) | (1L << FOREACH_OPEN) | (1L << PRINT_OPEN) | (1L << VAREQUAL_OPEN))) != 0) || _la==FUNCTON) {
				{
				{
				setState(469);
				body();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
			match(CLOSEBRACKET);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(476);
				match(ELSEIF);
				setState(477);
				ifc();
				setState(478);
				match(OPENBRACKET);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AA) | (1L << GOTONAME) | (1L << TAG_WHITESPACE) | (1L << IF_OPEN) | (1L << FOR_OPEN) | (1L << ARRAY_OPEN) | (1L << FOREACH_OPEN) | (1L << PRINT_OPEN) | (1L << VAREQUAL_OPEN))) != 0) || _la==FUNCTON) {
					{
					{
					setState(479);
					body();
					}
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(485);
				match(CLOSEBRACKET);
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(492);
				match(ELSE);
				setState(493);
				match(OPENBRACKET);
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AA) | (1L << GOTONAME) | (1L << TAG_WHITESPACE) | (1L << IF_OPEN) | (1L << FOR_OPEN) | (1L << ARRAY_OPEN) | (1L << FOREACH_OPEN) | (1L << PRINT_OPEN) | (1L << VAREQUAL_OPEN))) != 0) || _la==FUNCTON) {
					{
					{
					setState(494);
					body();
					}
					}
					setState(499);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(500);
				match(CLOSEBRACKET);
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

	public static class IfpContext extends ParserRuleContext {
		public TerminalNode AA() { return getToken(Parserp.AA, 0); }
		public List<IfcContext> ifc() {
			return getRuleContexts(IfcContext.class);
		}
		public IfcContext ifc(int i) {
			return getRuleContext(IfcContext.class,i);
		}
		public List<TerminalNode> OPENBRACKET() { return getTokens(Parserp.OPENBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(Parserp.OPENBRACKET, i);
		}
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(Parserp.CLOSEBRACKET); }
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(Parserp.CLOSEBRACKET, i);
		}
		public List<BodyPContext> bodyP() {
			return getRuleContexts(BodyPContext.class);
		}
		public BodyPContext bodyP(int i) {
			return getRuleContext(BodyPContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(Parserp.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(Parserp.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(Parserp.ELSE, 0); }
		public IfpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterIfp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitIfp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitIfp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfpContext ifp() throws RecognitionException {
		IfpContext _localctx = new IfpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(AA);
			setState(504);
			ifc();
			setState(505);
			match(OPENBRACKET);
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AA) | (1L << LINK) | (1L << DATA) | (1L << GOTONAME) | (1L << TAG_WHITESPACE) | (1L << ARRAY_OPEN) | (1L << PRINT_OPEN) | (1L << VAREQUAL_OPEN) | (1L << IN_OPEN) | (1L << OUT_OPEN))) != 0) || _la==FUNCTON) {
				{
				{
				setState(506);
				bodyP();
				}
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(512);
			match(CLOSEBRACKET);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(513);
				match(ELSEIF);
				setState(514);
				ifc();
				setState(515);
				match(OPENBRACKET);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AA) | (1L << LINK) | (1L << DATA) | (1L << GOTONAME) | (1L << TAG_WHITESPACE) | (1L << ARRAY_OPEN) | (1L << PRINT_OPEN) | (1L << VAREQUAL_OPEN) | (1L << IN_OPEN) | (1L << OUT_OPEN))) != 0) || _la==FUNCTON) {
					{
					{
					setState(516);
					bodyP();
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(522);
				match(CLOSEBRACKET);
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(529);
				match(ELSE);
				setState(530);
				match(OPENBRACKET);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AA) | (1L << LINK) | (1L << DATA) | (1L << GOTONAME) | (1L << TAG_WHITESPACE) | (1L << ARRAY_OPEN) | (1L << PRINT_OPEN) | (1L << VAREQUAL_OPEN) | (1L << IN_OPEN) | (1L << OUT_OPEN))) != 0) || _la==FUNCTON) {
					{
					{
					setState(531);
					bodyP();
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(537);
				match(CLOSEBRACKET);
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

	public static class SwitchContext extends ParserRuleContext {
		public TerminalNode SWITCH_OPEN() { return getToken(Parserp.SWITCH_OPEN, 0); }
		public Body_switchContext body_switch() {
			return getRuleContext(Body_switchContext.class,0);
		}
		public TerminalNode SWITCH_CLOSEC() { return getToken(Parserp.SWITCH_CLOSEC, 0); }
		public TerminalNode ENDSWITCH() { return getToken(Parserp.ENDSWITCH, 0); }
		public List<TerminalNode> CASE() { return getTokens(Parserp.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(Parserp.CASE, i);
		}
		public List<TerminalNode> STRINGARR() { return getTokens(Parserp.STRINGARR); }
		public TerminalNode STRINGARR(int i) {
			return getToken(Parserp.STRINGARR, i);
		}
		public List<TerminalNode> PREAK() { return getTokens(Parserp.PREAK); }
		public TerminalNode PREAK(int i) {
			return getToken(Parserp.PREAK, i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public SwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchContext switch() throws RecognitionException {
		SwitchContext _localctx = new SwitchContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(SWITCH_OPEN);
			setState(541);
			body_switch();
			setState(542);
			match(SWITCH_CLOSEC);
			setState(552); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(543);
				match(CASE);
				setState(544);
				match(STRINGARR);
				setState(546); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(545);
					body();
					}
					}
					setState(548); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AA) | (1L << GOTONAME) | (1L << TAG_WHITESPACE) | (1L << IF_OPEN) | (1L << FOR_OPEN) | (1L << ARRAY_OPEN) | (1L << FOREACH_OPEN) | (1L << PRINT_OPEN) | (1L << VAREQUAL_OPEN))) != 0) || _la==FUNCTON );
				setState(550);
				match(PREAK);
				}
				}
				setState(554); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(556);
			match(ENDSWITCH);
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

	public static class SwitchpContext extends ParserRuleContext {
		public TerminalNode AA() { return getToken(Parserp.AA, 0); }
		public TerminalNode SWITCH_OPEN() { return getToken(Parserp.SWITCH_OPEN, 0); }
		public Body_switchContext body_switch() {
			return getRuleContext(Body_switchContext.class,0);
		}
		public TerminalNode SWITCH_CLOSEC() { return getToken(Parserp.SWITCH_CLOSEC, 0); }
		public TerminalNode ENDSWITCH() { return getToken(Parserp.ENDSWITCH, 0); }
		public List<TerminalNode> CASE() { return getTokens(Parserp.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(Parserp.CASE, i);
		}
		public List<TerminalNode> STRINGARR() { return getTokens(Parserp.STRINGARR); }
		public TerminalNode STRINGARR(int i) {
			return getToken(Parserp.STRINGARR, i);
		}
		public List<TerminalNode> PREAK() { return getTokens(Parserp.PREAK); }
		public TerminalNode PREAK(int i) {
			return getToken(Parserp.PREAK, i);
		}
		public List<BodyPContext> bodyP() {
			return getRuleContexts(BodyPContext.class);
		}
		public BodyPContext bodyP(int i) {
			return getRuleContext(BodyPContext.class,i);
		}
		public SwitchpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterSwitchp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitSwitchp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitSwitchp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchpContext switchp() throws RecognitionException {
		SwitchpContext _localctx = new SwitchpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_switchp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(AA);
			setState(559);
			match(SWITCH_OPEN);
			setState(560);
			body_switch();
			setState(561);
			match(SWITCH_CLOSEC);
			setState(571); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(562);
				match(CASE);
				setState(563);
				match(STRINGARR);
				setState(565); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(564);
					bodyP();
					}
					}
					setState(567); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AA) | (1L << LINK) | (1L << DATA) | (1L << GOTONAME) | (1L << TAG_WHITESPACE) | (1L << ARRAY_OPEN) | (1L << PRINT_OPEN) | (1L << VAREQUAL_OPEN) | (1L << IN_OPEN) | (1L << OUT_OPEN))) != 0) || _la==FUNCTON );
				setState(569);
				match(PREAK);
				}
				}
				setState(573); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(575);
			match(ENDSWITCH);
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

	public static class Body_switchContext extends ParserRuleContext {
		public TerminalNode PRSWITCH() { return getToken(Parserp.PRSWITCH, 0); }
		public TerminalNode TN() { return getToken(Parserp.TN, 0); }
		public TerminalNode VARSWITCH() { return getToken(Parserp.VARSWITCH, 0); }
		public Body_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterBody_switch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitBody_switch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitBody_switch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_switchContext body_switch() throws RecognitionException {
		Body_switchContext _localctx = new Body_switchContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_body_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (PRSWITCH - 79)) | (1L << (VARSWITCH - 79)) | (1L << (TN - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(Parserp.TAG_NAME, 0); }
		public TerminalNode OPENC() { return getToken(Parserp.OPENC, 0); }
		public TerminalNode CLOSEC() { return getToken(Parserp.CLOSEC, 0); }
		public TerminalNode CLOSE() { return getToken(Parserp.CLOSE, 0); }
		public List<TerminalNode> VAR() { return getTokens(Parserp.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(Parserp.VAR, i);
		}
		public List<TerminalNode> NUM() { return getTokens(Parserp.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Parserp.NUM, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parserp.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parserp.COMMA, i);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_f);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(TAG_NAME);
			setState(580);
			match(OPENC);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==NUM) {
				{
				setState(597);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					{
					setState(581);
					match(VAR);
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(582);
						match(COMMA);
						setState(583);
						match(VAR);
						}
						}
						setState(588);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case NUM:
					{
					{
					setState(589);
					match(NUM);
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(590);
						match(COMMA);
						setState(591);
						match(NUM);
						}
						}
						setState(596);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(602);
			match(CLOSEC);
			setState(603);
			match(CLOSE);
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(Parserp.INCLUDE, 0); }
		public TerminalNode OPENC() { return getToken(Parserp.OPENC, 0); }
		public TerminalNode TAG_NAME() { return getToken(Parserp.TAG_NAME, 0); }
		public TerminalNode CLOSEC() { return getToken(Parserp.CLOSEC, 0); }
		public TerminalNode CLOSE() { return getToken(Parserp.CLOSE, 0); }
		public List<TerminalNode> TAG_WHITESPACE() { return getTokens(Parserp.TAG_WHITESPACE); }
		public TerminalNode TAG_WHITESPACE(int i) {
			return getToken(Parserp.TAG_WHITESPACE, i);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserpListener ) ((ParserpListener)listener).exitInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserpVisitor ) return ((ParserpVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_include);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(INCLUDE);
			setState(606);
			match(OPENC);
			setState(607);
			match(TAG_NAME);
			setState(608);
			match(CLOSEC);
			setState(609);
			match(CLOSE);
			setState(613);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(610);
					match(TAG_WHITESPACE);
					}
					} 
				}
				setState(615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3x\u026b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\7\2P\n"+
		"\2\f\2\16\2S\13\2\3\2\3\2\6\2W\n\2\r\2\16\2X\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3e\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4m\n\4\f\4\16\4p\13"+
		"\4\3\4\3\4\3\4\7\4u\n\4\f\4\16\4x\13\4\7\4z\n\4\f\4\16\4}\13\4\3\4\3\4"+
		"\3\5\7\5\u0082\n\5\f\5\16\5\u0085\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008d"+
		"\n\5\f\5\16\5\u0090\13\5\3\5\7\5\u0093\n\5\f\5\16\5\u0096\13\5\3\5\3\5"+
		"\7\5\u009a\n\5\f\5\16\5\u009d\13\5\3\5\7\5\u00a0\n\5\f\5\16\5\u00a3\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b2\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00b9\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u00c2"+
		"\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u00d6\n\t\3\t\3\t\5\t\u00da\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00e5\n\n\3\n\3\n\5\n\u00e9\n\n\3\n\3\n\3\13\3\13\6\13\u00ef"+
		"\n\13\r\13\16\13\u00f0\3\13\3\13\6\13\u00f5\n\13\r\13\16\13\u00f6\3\13"+
		"\3\13\5\13\u00fb\n\13\3\13\7\13\u00fe\n\13\f\13\16\13\u0101\13\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u0111\n"+
		"\16\f\16\16\16\u0114\13\16\3\16\6\16\u0117\n\16\r\16\16\16\u0118\3\16"+
		"\3\16\6\16\u011d\n\16\r\16\16\16\u011e\7\16\u0121\n\16\f\16\16\16\u0124"+
		"\13\16\3\16\3\16\3\16\7\16\u0129\n\16\f\16\16\16\u012c\13\16\5\16\u012e"+
		"\n\16\3\17\3\17\3\17\3\17\6\17\u0134\n\17\r\17\16\17\u0135\3\17\3\17\5"+
		"\17\u013a\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\6\20\u0143\n\20\r\20"+
		"\16\20\u0144\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u014f\n\21\r"+
		"\21\16\21\u0150\3\21\3\21\3\22\3\22\3\22\3\22\3\22\6\22\u015a\n\22\r\22"+
		"\16\22\u015b\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u0166\n\23\r"+
		"\23\16\23\u0167\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0179\n\26\3\26\5\26\u017c\n\26\5\26\u017e\n"+
		"\26\3\27\7\27\u0181\n\27\f\27\16\27\u0184\13\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0191\n\27\3\27\7\27\u0194\n\27"+
		"\f\27\16\27\u0197\13\27\3\30\7\30\u019a\n\30\f\30\16\30\u019d\13\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u01ae\n\30\3\30\7\30\u01b1\n\30\f\30\16\30\u01b4\13\30\3\31\3"+
		"\31\3\31\7\31\u01b9\n\31\f\31\16\31\u01bc\13\31\3\31\3\31\3\31\3\31\7"+
		"\31\u01c2\n\31\f\31\16\31\u01c5\13\31\3\31\5\31\u01c8\n\31\3\31\7\31\u01cb"+
		"\n\31\f\31\16\31\u01ce\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\7\33\u01d9\n\33\f\33\16\33\u01dc\13\33\3\33\3\33\3\33\3\33\3\33\7"+
		"\33\u01e3\n\33\f\33\16\33\u01e6\13\33\3\33\3\33\7\33\u01ea\n\33\f\33\16"+
		"\33\u01ed\13\33\3\33\3\33\3\33\7\33\u01f2\n\33\f\33\16\33\u01f5\13\33"+
		"\3\33\5\33\u01f8\n\33\3\34\3\34\3\34\3\34\7\34\u01fe\n\34\f\34\16\34\u0201"+
		"\13\34\3\34\3\34\3\34\3\34\3\34\7\34\u0208\n\34\f\34\16\34\u020b\13\34"+
		"\3\34\3\34\7\34\u020f\n\34\f\34\16\34\u0212\13\34\3\34\3\34\3\34\7\34"+
		"\u0217\n\34\f\34\16\34\u021a\13\34\3\34\5\34\u021d\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\6\35\u0225\n\35\r\35\16\35\u0226\3\35\3\35\6\35\u022b"+
		"\n\35\r\35\16\35\u022c\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\6"+
		"\36\u0238\n\36\r\36\16\36\u0239\3\36\3\36\6\36\u023e\n\36\r\36\16\36\u023f"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \7 \u024b\n \f \16 \u024e\13 \3 \3"+
		" \3 \7 \u0253\n \f \16 \u0256\13 \7 \u0258\n \f \16 \u025b\13 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\7!\u0266\n!\f!\16!\u0269\13!\3!\2\2\"\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\4\3\29:\3\2QS"+
		"\2\u02bb\2E\3\2\2\2\4d\3\2\2\2\6f\3\2\2\2\b\u0083\3\2\2\2\n\u00b1\3\2"+
		"\2\2\f\u00b3\3\2\2\2\16\u00bc\3\2\2\2\20\u00c5\3\2\2\2\22\u00dd\3\2\2"+
		"\2\24\u00ec\3\2\2\2\26\u0105\3\2\2\2\30\u0109\3\2\2\2\32\u012d\3\2\2\2"+
		"\34\u012f\3\2\2\2\36\u013d\3\2\2\2 \u0148\3\2\2\2\"\u0154\3\2\2\2$\u015f"+
		"\3\2\2\2&\u016b\3\2\2\2(\u016f\3\2\2\2*\u017d\3\2\2\2,\u0182\3\2\2\2."+
		"\u019b\3\2\2\2\60\u01b5\3\2\2\2\62\u01d1\3\2\2\2\64\u01d5\3\2\2\2\66\u01f9"+
		"\3\2\2\28\u021e\3\2\2\2:\u0230\3\2\2\2<\u0243\3\2\2\2>\u0245\3\2\2\2@"+
		"\u025f\3\2\2\2BD\7$\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FK\3\2"+
		"\2\2GE\3\2\2\2HJ\5@!\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LQ\3\2\2"+
		"\2MK\3\2\2\2NP\7$\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RV\3\2\2"+
		"\2SQ\3\2\2\2TW\5\b\5\2UW\5\6\4\2VT\3\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2"+
		"\2XY\3\2\2\2Y\3\3\2\2\2Z[\5\26\f\2[\\\7 \2\2\\e\3\2\2\2]e\5\34\17\2^e"+
		"\5\64\33\2_e\5\24\13\2`e\58\35\2ae\5\36\20\2be\5> \2ce\5\"\22\2dZ\3\2"+
		"\2\2d]\3\2\2\2d^\3\2\2\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2"+
		"\2\2e\5\3\2\2\2fg\7\13\2\2gh\7&\2\2hi\7\r\2\2in\7&\2\2jk\7!\2\2km\7&\2"+
		"\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2q{\7\30"+
		"\2\2rv\5\4\3\2su\7$\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2"+
		"\2\2xv\3\2\2\2yr\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2"+
		"\2\2~\177\7\31\2\2\177\7\3\2\2\2\u0080\u0082\7$\2\2\u0081\u0080\3\2\2"+
		"\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\16\2\2\u0087\u0094\7&\2\2\u0088"+
		"\u0089\7\17\2\2\u0089\u008e\7&\2\2\u008a\u008b\7!\2\2\u008b\u008d\7&\2"+
		"\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\7\20\2\2"+
		"\u0092\u0088\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009b\7\30\2\2"+
		"\u0098\u009a\5\n\6\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a1\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00a0\7$\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a5\7\31\2\2\u00a5\t\3\2\2\2\u00a6\u00b2\5\20\t\2\u00a7\u00b2\5\22"+
		"\n\2\u00a8\u00b2\7\5\2\2\u00a9\u00b2\7\6\2\2\u00aa\u00b2\5\24\13\2\u00ab"+
		"\u00b2\5\34\17\2\u00ac\u00b2\5\66\34\2\u00ad\u00b2\5 \21\2\u00ae\u00b2"+
		"\5$\23\2\u00af\u00b2\5:\36\2\u00b0\u00b2\5> \2\u00b1\u00a6\3\2\2\2\u00b1"+
		"\u00a7\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00aa\3\2"+
		"\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1"+
		"\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\13\3\2\2"+
		"\2\u00b3\u00b4\7B\2\2\u00b4\u00b5\7@\2\2\u00b5\u00b8\7C\2\2\u00b6\u00b7"+
		"\7F\2\2\u00b7\u00b9\7C\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\7A\2\2\u00bb\r\3\2\2\2\u00bc\u00bd\7\67\2\2"+
		"\u00bd\u00be\7\62\2\2\u00be\u00c1\7\64\2\2\u00bf\u00c0\7\66\2\2\u00c0"+
		"\u00c2\7\64\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c4\7\63\2\2\u00c4\17\3\2\2\2\u00c5\u00d5\7.\2\2\u00c6"+
		"\u00c7\7<\2\2\u00c7\u00c8\7@\2\2\u00c8\u00d6\7E\2\2\u00c9\u00ca\7;\2\2"+
		"\u00ca\u00cb\7@\2\2\u00cb\u00d6\7G\2\2\u00cc\u00cd\t\2\2\2\u00cd\u00ce"+
		"\7@\2\2\u00ce\u00d6\7D\2\2\u00cf\u00d0\7=\2\2\u00d0\u00d1\7@\2\2\u00d1"+
		"\u00d6\7?\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d4\7@\2\2\u00d4\u00d6\7C\2\2"+
		"\u00d5\u00c6\3\2\2\2\u00d5\u00c9\3\2\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00cf"+
		"\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\7A\2\2\u00d8"+
		"\u00da\5\f\7\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\7H\2\2\u00dc\21\3\2\2\2\u00dd\u00e4\7/\2\2\u00de\u00df"+
		"\7\60\2\2\u00df\u00e0\7\62\2\2\u00e0\u00e5\7\64\2\2\u00e1\u00e2\7\61\2"+
		"\2\u00e2\u00e3\7\62\2\2\u00e3\u00e5\7\65\2\2\u00e4\u00de\3\2\2\2\u00e4"+
		"\u00e1\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\7\63\2\2\u00e7\u00e9\5"+
		"\16\b\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\78\2\2\u00eb\23\3\2\2\2\u00ec\u00fa\7,\2\2\u00ed\u00ef\7]\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00fb\3\2\2\2\u00f2\u00fb\7_\2\2\u00f3\u00f5\7^\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00fb\3\2\2\2\u00f8\u00fb\7`\2\2\u00f9\u00fb\7a\2\2\u00fa\u00ee\3\2\2"+
		"\2\u00fa\u00f2\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fe\7$\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7b\2\2\u0103\u0104\7 \2\2\u0104\25"+
		"\3\2\2\2\u0105\u0106\7)\2\2\u0106\u0107\5\32\16\2\u0107\u0108\7g\2\2\u0108"+
		"\27\3\2\2\2\u0109\u010a\7V\2\2\u010a\u010b\5\32\16\2\u010b\u010c\7g\2"+
		"\2\u010c\31\3\2\2\2\u010d\u0112\7e\2\2\u010e\u010f\7d\2\2\u010f\u0111"+
		"\7e\2\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u012e\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\7c"+
		"\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u0122\3\2\2\2\u011a\u011c\7d\2\2\u011b\u011d\7c\2"+
		"\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011a\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u012e\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0125\u012a\7f\2\2\u0126\u0127\7d\2\2\u0127\u0129\7f\2\2\u0128\u0126"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u010d\3\2\2\2\u012d\u0116\3\2"+
		"\2\2\u012d\u0125\3\2\2\2\u012e\33\3\2\2\2\u012f\u0139\7-\2\2\u0130\u013a"+
		"\5\30\r\2\u0131\u013a\7Z\2\2\u0132\u0134\7W\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013a\3\2"+
		"\2\2\u0137\u013a\7X\2\2\u0138\u013a\7[\2\2\u0139\u0130\3\2\2\2\u0139\u0131"+
		"\3\2\2\2\u0139\u0133\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\7\\\2\2\u013c\35\3\2\2\2\u013d\u013e\7+\2\2"+
		"\u013e\u013f\5(\25\2\u013f\u0140\7M\2\2\u0140\u0142\7\30\2\2\u0141\u0143"+
		"\5,\27\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\31\2\2\u0147\37\3\2\2"+
		"\2\u0148\u0149\7\4\2\2\u0149\u014a\7+\2\2\u014a\u014b\5(\25\2\u014b\u014c"+
		"\7M\2\2\u014c\u014e\7\30\2\2\u014d\u014f\5.\30\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\7\31\2\2\u0153!\3\2\2\2\u0154\u0155\7(\2\2\u0155\u0156"+
		"\5&\24\2\u0156\u0157\7P\2\2\u0157\u0159\7\30\2\2\u0158\u015a\5,\27\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015d\u015e\7\31\2\2\u015e#\3\2\2\2\u015f\u0160"+
		"\7\4\2\2\u0160\u0161\7(\2\2\u0161\u0162\5&\24\2\u0162\u0163\7P\2\2\u0163"+
		"\u0165\7\30\2\2\u0164\u0166\5.\30\2\u0165\u0164\3\2\2\2\u0166\u0167\3"+
		"\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\7\31\2\2\u016a%\3\2\2\2\u016b\u016c\7N\2\2\u016c\u016d\7O\2\2\u016d"+
		"\u016e\7N\2\2\u016e\'\3\2\2\2\u016f\u0170\7K\2\2\u0170\u0171\7L\2\2\u0171"+
		"\u0172\7K\2\2\u0172)\3\2\2\2\u0173\u0174\7s\2\2\u0174\u017e\7t\2\2\u0175"+
		"\u017e\7r\2\2\u0176\u017b\7u\2\2\u0177\u0179\7v\2\2\u0178\u0177\3\2\2"+
		"\2\u0178\u0179\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u017c\7t\2\2\u017b\u0178"+
		"\3\2\2\2\u017b\u017a\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u0173\3\2\2\2\u017d"+
		"\u0175\3\2\2\2\u017d\u0176\3\2\2\2\u017e+\3\2\2\2\u017f\u0181\7$\2\2\u0180"+
		"\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0190\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0191\5\34\17\2\u0186"+
		"\u0191\5\64\33\2\u0187\u0191\5\"\22\2\u0188\u0191\5\24\13\2\u0189\u0191"+
		"\5\60\31\2\u018a\u0191\5\36\20\2\u018b\u0191\5:\36\2\u018c\u0191\7I\2"+
		"\2\u018d\u018e\5\26\f\2\u018e\u018f\7 \2\2\u018f\u0191\3\2\2\2\u0190\u0185"+
		"\3\2\2\2\u0190\u0186\3\2\2\2\u0190\u0187\3\2\2\2\u0190\u0188\3\2\2\2\u0190"+
		"\u0189\3\2\2\2\u0190\u018a\3\2\2\2\u0190\u018b\3\2\2\2\u0190\u018c\3\2"+
		"\2\2\u0190\u018d\3\2\2\2\u0191\u0195\3\2\2\2\u0192\u0194\7$\2\2\u0193"+
		"\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196-\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\7$\2\2\u0199\u0198"+
		"\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u01ad\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01ae\5\34\17\2\u019f\u01ae\5"+
		"\66\34\2\u01a0\u01ae\5$\23\2\u01a1\u01ae\5\24\13\2\u01a2\u01ae\5\60\31"+
		"\2\u01a3\u01ae\5 \21\2\u01a4\u01ae\5:\36\2\u01a5\u01ae\7I\2\2\u01a6\u01a7"+
		"\5\26\f\2\u01a7\u01a8\7 \2\2\u01a8\u01ae\3\2\2\2\u01a9\u01ae\7\5\2\2\u01aa"+
		"\u01ae\7\6\2\2\u01ab\u01ae\5\20\t\2\u01ac\u01ae\5\22\n\2\u01ad\u019e\3"+
		"\2\2\2\u01ad\u019f\3\2\2\2\u01ad\u01a0\3\2\2\2\u01ad\u01a1\3\2\2\2\u01ad"+
		"\u01a2\3\2\2\2\u01ad\u01a3\3\2\2\2\u01ad\u01a4\3\2\2\2\u01ad\u01a5\3\2"+
		"\2\2\u01ad\u01a6\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b2\3\2\2\2\u01af\u01b1\7$"+
		"\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3/\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7\22\2\2"+
		"\u01b6\u01c7\7&\2\2\u01b7\u01b9\7$\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bd\u01be\7\32\2\2\u01be\u01c3\7\35\2\2\u01bf\u01c0\7"+
		"!\2\2\u01c0\u01c2\7\35\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c6\u01c8\7\33\2\2\u01c7\u01ba\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01cc\3\2\2\2\u01c9\u01cb\7$\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2"+
		"\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01cf\u01d0\7 \2\2\u01d0\61\3\2\2\2\u01d1\u01d2\7\'\2\2"+
		"\u01d2\u01d3\5*\26\2\u01d3\u01d4\7w\2\2\u01d4\63\3\2\2\2\u01d5\u01d6\5"+
		"\62\32\2\u01d6\u01da\7\30\2\2\u01d7\u01d9\5,\27\2\u01d8\u01d7\3\2\2\2"+
		"\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd"+
		"\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01eb\7\31\2\2\u01de\u01df\7h\2\2\u01df"+
		"\u01e0\5\62\32\2\u01e0\u01e4\7\30\2\2\u01e1\u01e3\5,\27\2\u01e2\u01e1"+
		"\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\7\31\2\2\u01e8\u01ea\3"+
		"\2\2\2\u01e9\u01de\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01f7\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7i"+
		"\2\2\u01ef\u01f3\7\30\2\2\u01f0\u01f2\5,\27\2\u01f1\u01f0\3\2\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f8\7\31\2\2\u01f7\u01ee\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\65\3\2\2\2\u01f9\u01fa\7\4\2\2\u01fa\u01fb\5\62\32"+
		"\2\u01fb\u01ff\7\30\2\2\u01fc\u01fe\5.\30\2\u01fd\u01fc\3\2\2\2\u01fe"+
		"\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2"+
		"\2\2\u0201\u01ff\3\2\2\2\u0202\u0210\7\31\2\2\u0203\u0204\7h\2\2\u0204"+
		"\u0205\5\62\32\2\u0205\u0209\7\30\2\2\u0206\u0208\5.\30\2\u0207\u0206"+
		"\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7\31\2\2\u020d\u020f\3"+
		"\2\2\2\u020e\u0203\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u021c\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0214\7i"+
		"\2\2\u0214\u0218\7\30\2\2\u0215\u0217\5.\30\2\u0216\u0215\3\2\2\2\u0217"+
		"\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2"+
		"\2\2\u021a\u0218\3\2\2\2\u021b\u021d\7\31\2\2\u021c\u0213\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\67\3\2\2\2\u021e\u021f\7*\2\2\u021f\u0220\5<\37\2"+
		"\u0220\u022a\7T\2\2\u0221\u0222\7\7\2\2\u0222\u0224\7\34\2\2\u0223\u0225"+
		"\5,\27\2\u0224\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0224\3\2\2\2\u0226"+
		"\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\7\b\2\2\u0229\u022b\3\2"+
		"\2\2\u022a\u0221\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022a\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\7\n\2\2\u022f9\3\2\2\2"+
		"\u0230\u0231\7\4\2\2\u0231\u0232\7*\2\2\u0232\u0233\5<\37\2\u0233\u023d"+
		"\7T\2\2\u0234\u0235\7\7\2\2\u0235\u0237\7\34\2\2\u0236\u0238\5.\30\2\u0237"+
		"\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023a\u023b\3\2\2\2\u023b\u023c\7\b\2\2\u023c\u023e\3\2\2\2\u023d"+
		"\u0234\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0241\u0242\7\n\2\2\u0242;\3\2\2\2\u0243\u0244"+
		"\t\3\2\2\u0244=\3\2\2\2\u0245\u0246\7&\2\2\u0246\u0259\7\32\2\2\u0247"+
		"\u024c\7\35\2\2\u0248\u0249\7!\2\2\u0249\u024b\7\35\2\2\u024a\u0248\3"+
		"\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u0258\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0254\7\36\2\2\u0250\u0251\7"+
		"!\2\2\u0251\u0253\7\36\2\2\u0252\u0250\3\2\2\2\u0253\u0256\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2"+
		"\2\2\u0257\u0247\3\2\2\2\u0257\u024f\3\2\2\2\u0258\u025b\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2"+
		"\2\2\u025c\u025d\7\33\2\2\u025d\u025e\7 \2\2\u025e?\3\2\2\2\u025f\u0260"+
		"\7\3\2\2\u0260\u0261\7\32\2\2\u0261\u0262\7&\2\2\u0262\u0263\7\33\2\2"+
		"\u0263\u0267\7 \2\2\u0264\u0266\7$\2\2\u0265\u0264\3\2\2\2\u0266\u0269"+
		"\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268A\3\2\2\2\u0269"+
		"\u0267\3\2\2\2GEKQVXdnv{\u0083\u008e\u0094\u009b\u00a1\u00b1\u00b8\u00c1"+
		"\u00d5\u00d9\u00e4\u00e8\u00f0\u00f6\u00fa\u00ff\u0112\u0118\u011e\u0122"+
		"\u012a\u012d\u0135\u0139\u0144\u0150\u015b\u0167\u0178\u017b\u017d\u0182"+
		"\u0190\u0195\u019b\u01ad\u01b2\u01ba\u01c3\u01c7\u01cc\u01da\u01e4\u01eb"+
		"\u01f3\u01f7\u01ff\u0209\u0210\u0218\u021c\u0226\u022c\u0239\u023f\u024c"+
		"\u0254\u0257\u0259\u0267";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}