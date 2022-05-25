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
		IFN=1, ELSEIF=2, ELSE=3, CONTROLLER=4, CONTROLS=5, PAGE=6, EXTENDS=7, 
		HEADER=8, VAL=9, GOTONAME=10, HTML_COMMENT=11, CLOSE=12, COMMA=13, SEA_WS=14, 
		CLASS_NAME=15, TAG_NAME=16, TAG_WHITESPACE=17, SINGLE_QOUTE=18, OPENPage=19, 
		IF_OPEN=20, OPEN_CONTROLLER=21, IFC=22, GOTO=23, PRINT=24, BODYIF=25, 
		IF_NAME=26, CONTROLLERCLOSE=27, INNAME=28, S=29, IN=30, FIELD=31, RADIO=32, 
		COLOR=33, CHECKBOX=34, EMAIL=35, FILE=36, PATH=37, IMAGE=38, NUMBER=39, 
		PASSWORD=40, OUT=41, TEXT=42, LINK=43, DATA=44, Close_PAGE=45, VALID=46, 
		CHECKED=47, REQUIRDE=48, NOVALIED=49, VALIDMM=50, VALIEDPASSDIGIT=51, 
		VALIEDPASSinputmode=52, VALIDEMAIL=53, IF_CLOSE=54;
	public static final int
		RULE_pages = 0, RULE_def_controller = 1, RULE_def_page = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"pages", "def_controller", "def_page"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"';'", "','", null, null, null, null, "'''", null, "'('", null, null, 
			null, null, null, null, null, "'in:'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'novalied'", null, null, null, null, "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IFN", "ELSEIF", "ELSE", "CONTROLLER", "CONTROLS", "PAGE", "EXTENDS", 
			"HEADER", "VAL", "GOTONAME", "HTML_COMMENT", "CLOSE", "COMMA", "SEA_WS", 
			"CLASS_NAME", "TAG_NAME", "TAG_WHITESPACE", "SINGLE_QOUTE", "OPENPage", 
			"IF_OPEN", "OPEN_CONTROLLER", "IFC", "GOTO", "PRINT", "BODYIF", "IF_NAME", 
			"CONTROLLERCLOSE", "INNAME", "S", "IN", "FIELD", "RADIO", "COLOR", "CHECKBOX", 
			"EMAIL", "FILE", "PATH", "IMAGE", "NUMBER", "PASSWORD", "OUT", "TEXT", 
			"LINK", "DATA", "Close_PAGE", "VALID", "CHECKED", "REQUIRDE", "NOVALIED", 
			"VALIDMM", "VALIEDPASSDIGIT", "VALIEDPASSinputmode", "VALIDEMAIL", "IF_CLOSE"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(8); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(8);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPENPage:
					{
					setState(6);
					def_page();
					}
					break;
				case OPEN_CONTROLLER:
					{
					setState(7);
					def_controller();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(10); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPENPage || _la==OPEN_CONTROLLER );
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
		public TerminalNode OPEN_CONTROLLER() { return getToken(Parserp.OPEN_CONTROLLER, 0); }
		public TerminalNode CONTROLLERCLOSE() { return getToken(Parserp.CONTROLLERCLOSE, 0); }
		public List<TerminalNode> IF_NAME() { return getTokens(Parserp.IF_NAME); }
		public TerminalNode IF_NAME(int i) {
			return getToken(Parserp.IF_NAME, i);
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
		enterRule(_localctx, 2, RULE_def_controller);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(OPEN_CONTROLLER);
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF_NAME) {
				{
				{
				setState(13);
				match(IF_NAME);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			match(CONTROLLERCLOSE);
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
		public TerminalNode OPENPage() { return getToken(Parserp.OPENPage, 0); }
		public TerminalNode Close_PAGE() { return getToken(Parserp.Close_PAGE, 0); }
		public List<TerminalNode> S() { return getTokens(Parserp.S); }
		public TerminalNode S(int i) {
			return getToken(Parserp.S, i);
		}
		public List<TerminalNode> IN() { return getTokens(Parserp.IN); }
		public TerminalNode IN(int i) {
			return getToken(Parserp.IN, i);
		}
		public List<TerminalNode> OUT() { return getTokens(Parserp.OUT); }
		public TerminalNode OUT(int i) {
			return getToken(Parserp.OUT, i);
		}
		public List<TerminalNode> LINK() { return getTokens(Parserp.LINK); }
		public TerminalNode LINK(int i) {
			return getToken(Parserp.LINK, i);
		}
		public List<TerminalNode> DATA() { return getTokens(Parserp.DATA); }
		public TerminalNode DATA(int i) {
			return getToken(Parserp.DATA, i);
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
		enterRule(_localctx, 4, RULE_def_page);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(OPENPage);
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(22);
					match(S);
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << LINK) | (1L << DATA))) != 0)) {
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IN:
					{
					setState(28);
					match(IN);
					}
					break;
				case OUT:
					{
					setState(29);
					match(OUT);
					}
					break;
				case LINK:
					{
					setState(30);
					match(LINK);
					}
					break;
				case DATA:
					{
					setState(31);
					match(DATA);
					setState(35);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(32);
							match(S);
							}
							} 
						}
						setState(37);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(43);
				match(S);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(Close_PAGE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\66\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\6\2\13\n\2\r\2\16\2\f\3\3\3\3\7\3\21\n\3\f\3\16\3\24"+
		"\13\3\3\3\3\3\3\4\3\4\7\4\32\n\4\f\4\16\4\35\13\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4$\n\4\f\4\16\4\'\13\4\7\4)\n\4\f\4\16\4,\13\4\3\4\7\4/\n\4\f\4\16"+
		"\4\62\13\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2<\2\n\3\2\2\2\4\16\3\2\2\2\6\27"+
		"\3\2\2\2\b\13\5\6\4\2\t\13\5\4\3\2\n\b\3\2\2\2\n\t\3\2\2\2\13\f\3\2\2"+
		"\2\f\n\3\2\2\2\f\r\3\2\2\2\r\3\3\2\2\2\16\22\7\27\2\2\17\21\7\34\2\2\20"+
		"\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\25\3\2\2\2\24"+
		"\22\3\2\2\2\25\26\7\35\2\2\26\5\3\2\2\2\27\33\7\25\2\2\30\32\7\37\2\2"+
		"\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34*\3\2\2\2\35"+
		"\33\3\2\2\2\36)\7 \2\2\37)\7+\2\2 )\7-\2\2!%\7.\2\2\"$\7\37\2\2#\"\3\2"+
		"\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&)\3\2\2\2\'%\3\2\2\2(\36\3\2\2\2("+
		"\37\3\2\2\2( \3\2\2\2(!\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\60\3\2"+
		"\2\2,*\3\2\2\2-/\7\37\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2"+
		"\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7/\2\2\64\7\3\2\2\2\n\n\f\22\33"+
		"%(*\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}