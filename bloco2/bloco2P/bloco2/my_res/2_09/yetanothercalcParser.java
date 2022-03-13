// Generated from yetanothercalc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class yetanothercalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Frac=3, Term=4, NEWLINE=5, WS=6, COMMENT=7, ID=8;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_assignment = 2, RULE_expr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "assignment", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'print'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Frac", "Term", "NEWLINE", "WS", "COMMENT", "ID"
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
	public String getGrammarFileName() { return "yetanothercalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public yetanothercalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(yetanothercalcParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yetanothercalcListener ) ((yetanothercalcListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yetanothercalcListener ) ((yetanothercalcListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yetanothercalcVisitor ) return ((yetanothercalcVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << Frac) | (1L << ID))) != 0)) {
				{
				{
				setState(8);
				stat();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
			match(EOF);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(yetanothercalcParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(yetanothercalcParser.NEWLINE, i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yetanothercalcListener ) ((yetanothercalcListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yetanothercalcListener ) ((yetanothercalcListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yetanothercalcVisitor ) return ((yetanothercalcVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			int _alt;
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(16);
						expr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(19); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(21);
					match(NEWLINE);
					}
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(27);
						assignment();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(30); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(32);
					match(NEWLINE);
					}
					}
					setState(37);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(yetanothercalcParser.ID, 0); }
		public TerminalNode Term() { return getToken(yetanothercalcParser.Term, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yetanothercalcListener ) ((yetanothercalcListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yetanothercalcListener ) ((yetanothercalcListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yetanothercalcVisitor ) return ((yetanothercalcVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			expr();
			setState(41);
			match(T__0);
			setState(42);
			match(ID);
			setState(43);
			match(Term);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprFracContext extends ExprContext {
		public TerminalNode Frac() { return getToken(yetanothercalcParser.Frac, 0); }
		public ExprFracContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yetanothercalcListener ) ((yetanothercalcListener)listener).enterExprFrac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yetanothercalcListener ) ((yetanothercalcListener)listener).exitExprFrac(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yetanothercalcVisitor ) return ((yetanothercalcVisitor<? extends T>)visitor).visitExprFrac(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPrintContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Term() { return getToken(yetanothercalcParser.Term, 0); }
		public ExprPrintContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yetanothercalcListener ) ((yetanothercalcListener)listener).enterExprPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yetanothercalcListener ) ((yetanothercalcListener)listener).exitExprPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yetanothercalcVisitor ) return ((yetanothercalcVisitor<? extends T>)visitor).visitExprPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIdContext extends ExprContext {
		public TerminalNode ID() { return getToken(yetanothercalcParser.ID, 0); }
		public ExprIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yetanothercalcListener ) ((yetanothercalcListener)listener).enterExprId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yetanothercalcListener ) ((yetanothercalcListener)listener).exitExprId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yetanothercalcVisitor ) return ((yetanothercalcVisitor<? extends T>)visitor).visitExprId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new ExprPrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__1);
				setState(46);
				expr();
				setState(47);
				match(Term);
				}
				break;
			case Frac:
				_localctx = new ExprFracContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(Frac);
				}
				break;
			case ID:
				_localctx = new ExprIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(ID);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n8\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\3\3\6\3\24\n"+
		"\3\r\3\16\3\25\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\6\3\37\n\3\r\3\16\3"+
		" \3\3\7\3$\n\3\f\3\16\3\'\13\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\66\n\5\3\5\2\2\6\2\4\6\b\2\2\2;\2\r\3\2\2\2\4(\3\2"+
		"\2\2\6*\3\2\2\2\b\65\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13"+
		"\3\2\2\2\r\16\3\2\2\2\16\20\3\2\2\2\17\r\3\2\2\2\20\21\7\2\2\3\21\3\3"+
		"\2\2\2\22\24\5\b\5\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3"+
		"\2\2\2\26\32\3\2\2\2\27\31\7\7\2\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3"+
		"\2\2\2\32\33\3\2\2\2\33)\3\2\2\2\34\32\3\2\2\2\35\37\5\6\4\2\36\35\3\2"+
		"\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!%\3\2\2\2\"$\7\7\2\2#\"\3\2\2\2"+
		"$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&)\3\2\2\2\'%\3\2\2\2(\23\3\2\2\2(\36\3"+
		"\2\2\2)\5\3\2\2\2*+\5\b\5\2+,\7\3\2\2,-\7\n\2\2-.\7\6\2\2.\7\3\2\2\2/"+
		"\60\7\4\2\2\60\61\5\b\5\2\61\62\7\6\2\2\62\66\3\2\2\2\63\66\7\5\2\2\64"+
		"\66\7\n\2\2\65/\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\t\3\2\2\2\t\r\25"+
		"\32 %(\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}