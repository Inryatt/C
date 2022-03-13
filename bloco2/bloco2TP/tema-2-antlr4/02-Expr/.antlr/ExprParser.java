// Generated from /home/inryatt/C/bloco2/bloco2TP/tema-2-antlr4/02-Expr/Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, NUM=5, WS=6;
	public static final int
		RULE_main = 0, RULE_stat = 1, RULE_assignment = 2, RULE_show = 3, RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "stat", "assignment", "show", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'show'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ID", "NUM", "WS"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==ID) {
				{
				{
				setState(10);
				stat();
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(11);
					match(T__0);
					}
				}

				}
				}
				setState(18);
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

	public static class StatContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				assignment();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				show();
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

	public static class AssignmentContext extends ParserRuleContext {
		public Token ID;
		public ExprContext e;
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(24);
			match(T__1);
			setState(25);
			((AssignmentContext)_localctx).e = expr(true);
			System.out.println((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null)+" = "+((AssignmentContext)_localctx).e.res);
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

	public static class ShowContext extends ParserRuleContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__2);
			setState(29);
			((ShowContext)_localctx).expr = expr(false);
			System.out.println(((ShowContext)_localctx).expr.res);
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
		public boolean inAssign;
		public int res;
		public Token NUM;
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, boolean inAssign) {
			super(parent, invokingState);
			this.inAssign = inAssign;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr(boolean inAssign) throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState(), inAssign);
		enterRule(_localctx, 8, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((ExprContext)_localctx).NUM = match(NUM);

			   if (_localctx.inAssign)
			      System.out.println("Woh! Inside an assignment!");
			   ((ExprContext)_localctx).res =  Integer.parseInt((((ExprContext)_localctx).NUM!=null?((ExprContext)_localctx).NUM.getText():null));

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\7\2\21\n\2\f\2\16\2\24\13"+
		"\2\3\3\3\3\5\3\30\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\2\2\7\2\4\6\b\n\2\2\2#\2\22\3\2\2\2\4\27\3\2\2\2\6\31\3\2\2\2\b\36"+
		"\3\2\2\2\n\"\3\2\2\2\f\16\5\4\3\2\r\17\7\3\2\2\16\r\3\2\2\2\16\17\3\2"+
		"\2\2\17\21\3\2\2\2\20\f\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2"+
		"\2\2\23\3\3\2\2\2\24\22\3\2\2\2\25\30\5\6\4\2\26\30\5\b\5\2\27\25\3\2"+
		"\2\2\27\26\3\2\2\2\30\5\3\2\2\2\31\32\7\6\2\2\32\33\7\4\2\2\33\34\5\n"+
		"\6\2\34\35\b\4\1\2\35\7\3\2\2\2\36\37\7\5\2\2\37 \5\n\6\2 !\b\5\1\2!\t"+
		"\3\2\2\2\"#\7\7\2\2#$\b\6\1\2$\13\3\2\2\2\5\16\22\27";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}