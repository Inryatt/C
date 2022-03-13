// Generated from /home/inryatt/C/bloco2/bloco2P/bloco2/my_res/2_09/yetanothercalc.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Integer=3, Frac=4, Term=5, NEWLINE=6, WS=7, COMMENT=8, 
		ID=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Integer", "Frac", "Term", "NEWLINE", "WS", "COMMENT", 
			"ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'print'", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Integer", "Frac", "Term", "NEWLINE", "WS", "COMMENT", 
			"ID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13E\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4 \n\4\r\4\16\4!\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\5\7+\n\7\3\7\3\7\3\b\6\b\60\n\b\r\b\16\b\61\3\b\3\b\3\t\3\t"+
		"\7\t8\n\t\f\t\16\t;\13\t\3\t\3\t\3\t\3\t\3\n\6\nB\n\n\r\n\16\nC\39\2\13"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\5\3\2\62;\4\2\13\13\"\""+
		"\5\2C\\aac|\2I\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2"+
		"\5\30\3\2\2\2\7\37\3\2\2\2\t#\3\2\2\2\13\'\3\2\2\2\r*\3\2\2\2\17/\3\2"+
		"\2\2\21\65\3\2\2\2\23A\3\2\2\2\25\26\7/\2\2\26\27\7@\2\2\27\4\3\2\2\2"+
		"\30\31\7r\2\2\31\32\7t\2\2\32\33\7k\2\2\33\34\7p\2\2\34\35\7v\2\2\35\6"+
		"\3\2\2\2\36 \t\2\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\""+
		"\b\3\2\2\2#$\5\7\4\2$%\7\61\2\2%&\5\7\4\2&\n\3\2\2\2\'(\7=\2\2(\f\3\2"+
		"\2\2)+\7\17\2\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\f\2\2-\16\3\2\2\2.\60"+
		"\t\3\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2"+
		"\2\63\64\b\b\2\2\64\20\3\2\2\2\659\7%\2\2\668\13\2\2\2\67\66\3\2\2\28"+
		";\3\2\2\29:\3\2\2\29\67\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\f\2\2=>\3\2\2"+
		"\2>?\b\t\2\2?\22\3\2\2\2@B\t\4\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2D\24\3\2\2\2\b\2!*\619C\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}