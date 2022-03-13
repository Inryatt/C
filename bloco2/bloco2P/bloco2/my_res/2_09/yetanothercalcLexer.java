// Generated from yetanothercalc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class yetanothercalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Frac=3, Term=4, NEWLINE=5, WS=6, COMMENT=7, ID=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Frac", "Term", "NEWLINE", "WS", "COMMENT", "ID"
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


	public yetanothercalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "yetanothercalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nL\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\6\4\36\n\4\r\4\16\4\37\3\4\6\4#\n\4\r\4\16\4"+
		"$\3\4\3\4\6\4)\n\4\r\4\16\4*\5\4-\n\4\3\5\3\5\3\6\5\6\62\n\6\3\6\3\6\3"+
		"\7\6\7\67\n\7\r\7\16\78\3\7\3\7\3\b\3\b\7\b?\n\b\f\b\16\bB\13\b\3\b\3"+
		"\b\3\b\3\b\3\t\6\tI\n\t\r\t\16\tJ\3@\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\3\2\5\3\2\62;\4\2\13\13\"\"\5\2C\\aac|\2S\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\3\23\3\2\2\2\5\26\3\2\2\2\7,\3\2\2\2\t.\3\2\2\2\13\61\3\2\2\2"+
		"\r\66\3\2\2\2\17<\3\2\2\2\21H\3\2\2\2\23\24\7/\2\2\24\25\7@\2\2\25\4\3"+
		"\2\2\2\26\27\7r\2\2\27\30\7t\2\2\30\31\7k\2\2\31\32\7p\2\2\32\33\7v\2"+
		"\2\33\6\3\2\2\2\34\36\t\2\2\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2"+
		"\2\37 \3\2\2\2 -\3\2\2\2!#\t\2\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3"+
		"\2\2\2%&\3\2\2\2&(\7\61\2\2\')\t\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2"+
		"*+\3\2\2\2+-\3\2\2\2,\35\3\2\2\2,\"\3\2\2\2-\b\3\2\2\2./\7=\2\2/\n\3\2"+
		"\2\2\60\62\7\17\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7"+
		"\f\2\2\64\f\3\2\2\2\65\67\t\3\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2"+
		"\289\3\2\2\29:\3\2\2\2:;\b\7\2\2;\16\3\2\2\2<@\7%\2\2=?\13\2\2\2>=\3\2"+
		"\2\2?B\3\2\2\2@A\3\2\2\2@>\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\f\2\2DE\3\2"+
		"\2\2EF\b\b\2\2F\20\3\2\2\2GI\t\4\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3"+
		"\2\2\2K\22\3\2\2\2\13\2\37$*,\618@J\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}