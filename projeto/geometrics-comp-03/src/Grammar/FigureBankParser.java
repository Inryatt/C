// Generated from FigureBank.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FigureBankParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, Int=42, Double=43, Boolean=44, Color=45, 
		HexColor=46, HexThing=47, ID=48, SingleLineComment=49, WS=50;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_figure = 2, RULE_figure_properties = 3, 
		RULE_point = 4, RULE_primitive_declaration = 5, RULE_normal_primitive_declaration = 6, 
		RULE_primitive_type = 7, RULE_normal_primitive_type = 8, RULE_property_assignment = 9, 
		RULE_property_name = 10, RULE_value = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "figure", "figure_properties", "point", "primitive_declaration", 
			"normal_primitive_declaration", "primitive_type", "normal_primitive_type", 
			"property_assignment", "property_name", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "':'", "'at'", "'circle'", "'line'", "'rectangle'", 
			"'square'", "'elipse'", "'polyline'", "'polygon'", "'arc'", "'point'", 
			"'int'", "'double'", "'string'", "'boolean'", "'time'", "'='", "'hidden'", 
			"'center'", "'points'", "'scale'", "'angle'", "'fill'", "'fill_color'", 
			"'border_color'", "'border'", "'thickness'", "'radius'", "'length'", 
			"'width'", "'height'", "'position'", "'pivot'", "'layer'", "'HSV'", "'RGB'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "Int", "Double", "Boolean", "Color", 
			"HexColor", "HexThing", "ID", "SingleLineComment", "WS"
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
	public String getGrammarFileName() { return "FigureBank.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FigureBankParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FigureBankParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(24);
				stat();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
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
		public FigureContext figure() {
			return getRuleContext(FigureContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			figure();
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

	public static class FigureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FigureBankParser.ID, 0); }
		public List<Figure_propertiesContext> figure_properties() {
			return getRuleContexts(Figure_propertiesContext.class);
		}
		public Figure_propertiesContext figure_properties(int i) {
			return getRuleContext(Figure_propertiesContext.class,i);
		}
		public FigureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterFigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitFigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitFigure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureContext figure() throws RecognitionException {
		FigureContext _localctx = new FigureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_figure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ID);
			setState(35);
			match(T__0);
			setState(36);
			figure_properties();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(37);
				match(T__1);
				setState(38);
				figure_properties();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(T__2);
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

	public static class Figure_propertiesContext extends ParserRuleContext {
		public String str = "";
		public Figure_propertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure_properties; }
	 
		public Figure_propertiesContext() { }
		public void copyFrom(Figure_propertiesContext ctx) {
			super.copyFrom(ctx);
			this.str = ctx.str;
		}
	}
	public static class PrimitivePropertyContext extends Figure_propertiesContext {
		public Primitive_declarationContext primitive_declaration() {
			return getRuleContext(Primitive_declarationContext.class,0);
		}
		public PrimitivePropertyContext(Figure_propertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterPrimitiveProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitPrimitiveProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitPrimitiveProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentPropertyContext extends Figure_propertiesContext {
		public Property_assignmentContext property_assignment() {
			return getRuleContext(Property_assignmentContext.class,0);
		}
		public AssignmentPropertyContext(Figure_propertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterAssignmentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitAssignmentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitAssignmentProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalPrimitivePropertyContext extends Figure_propertiesContext {
		public Normal_primitive_declarationContext normal_primitive_declaration() {
			return getRuleContext(Normal_primitive_declarationContext.class,0);
		}
		public NormalPrimitivePropertyContext(Figure_propertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterNormalPrimitiveProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitNormalPrimitiveProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitNormalPrimitiveProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FigurePropertyContext extends Figure_propertiesContext {
		public Token inst;
		public Token fig;
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(FigureBankParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FigureBankParser.ID, i);
		}
		public FigurePropertyContext(Figure_propertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterFigureProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitFigureProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitFigureProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Figure_propertiesContext figure_properties() throws RecognitionException {
		Figure_propertiesContext _localctx = new Figure_propertiesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_figure_properties);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new PrimitivePropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				primitive_declaration();
				}
				break;
			case 2:
				_localctx = new NormalPrimitivePropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				normal_primitive_declaration();
				}
				break;
			case 3:
				_localctx = new AssignmentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				property_assignment();
				}
				break;
			case 4:
				_localctx = new FigurePropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				((FigurePropertyContext)_localctx).inst = match(ID);
				setState(50);
				match(T__3);
				setState(51);
				((FigurePropertyContext)_localctx).fig = match(ID);
				setState(52);
				match(T__4);
				setState(53);
				point();
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

	public static class PointContext extends ParserRuleContext {
		public Token x;
		public Token y;
		public List<TerminalNode> Int() { return getTokens(FigureBankParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(FigureBankParser.Int, i);
		}
		public List<TerminalNode> Double() { return getTokens(FigureBankParser.Double); }
		public TerminalNode Double(int i) {
			return getToken(FigureBankParser.Double, i);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			((PointContext)_localctx).x = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Double) ) {
				((PointContext)_localctx).x = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(58);
			match(T__1);
			setState(59);
			((PointContext)_localctx).y = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Double) ) {
				((PointContext)_localctx).y = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(60);
			match(T__2);
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

	public static class Primitive_declarationContext extends ParserRuleContext {
		public Token id;
		public Primitive_typeContext type;
		public List<Property_assignmentContext> property_assignment() {
			return getRuleContexts(Property_assignmentContext.class);
		}
		public Property_assignmentContext property_assignment(int i) {
			return getRuleContext(Property_assignmentContext.class,i);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public TerminalNode ID() { return getToken(FigureBankParser.ID, 0); }
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public Primitive_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterPrimitive_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitPrimitive_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitPrimitive_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_declarationContext primitive_declaration() throws RecognitionException {
		Primitive_declarationContext _localctx = new Primitive_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_primitive_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			((Primitive_declarationContext)_localctx).id = match(ID);
			setState(63);
			match(T__3);
			setState(64);
			((Primitive_declarationContext)_localctx).type = primitive_type();
			setState(65);
			match(T__0);
			setState(66);
			property_assignment();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(67);
				match(T__1);
				setState(68);
				property_assignment();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__2);
			setState(75);
			match(T__4);
			setState(76);
			point();
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

	public static class Normal_primitive_declarationContext extends ParserRuleContext {
		public Normal_primitive_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_primitive_declaration; }
	 
		public Normal_primitive_declarationContext() { }
		public void copyFrom(Normal_primitive_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalPrimitiveDeclarationContext extends Normal_primitive_declarationContext {
		public TerminalNode ID() { return getToken(FigureBankParser.ID, 0); }
		public Normal_primitive_typeContext normal_primitive_type() {
			return getRuleContext(Normal_primitive_typeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NormalPrimitiveDeclarationContext(Normal_primitive_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterNormalPrimitiveDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitNormalPrimitiveDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitNormalPrimitiveDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Normal_primitive_declarationContext normal_primitive_declaration() throws RecognitionException {
		Normal_primitive_declarationContext _localctx = new Normal_primitive_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_normal_primitive_declaration);
		try {
			_localctx = new NormalPrimitiveDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(79);
			match(T__3);
			setState(80);
			normal_primitive_type();
			setState(81);
			value();
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

	public static class Primitive_typeContext extends ParserRuleContext {
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterPrimitive_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitPrimitive_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitPrimitive_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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

	public static class Normal_primitive_typeContext extends ParserRuleContext {
		public Type type = null;
		public Normal_primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_primitive_type; }
	 
		public Normal_primitive_typeContext() { }
		public void copyFrom(Normal_primitive_typeContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class DoubleTypeContext extends Normal_primitive_typeContext {
		public DoubleTypeContext(Normal_primitive_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanTypeContext extends Normal_primitive_typeContext {
		public BooleanTypeContext(Normal_primitive_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends Normal_primitive_typeContext {
		public IntTypeContext(Normal_primitive_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringTypeContext extends Normal_primitive_typeContext {
		public StringTypeContext(Normal_primitive_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitStringType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeTypeContext extends Normal_primitive_typeContext {
		public TimeTypeContext(Normal_primitive_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitTimeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitTimeType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PointTypeContext extends Normal_primitive_typeContext {
		public PointTypeContext(Normal_primitive_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Normal_primitive_typeContext normal_primitive_type() throws RecognitionException {
		Normal_primitive_typeContext _localctx = new Normal_primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_normal_primitive_type);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				_localctx = new PointTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				match(T__18);
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

	public static class Property_assignmentContext extends ParserRuleContext {
		public String name;
		public Property_nameContext pName;
		public ValueContext val;
		public Property_nameContext property_name() {
			return getRuleContext(Property_nameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Property_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterProperty_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitProperty_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitProperty_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_assignmentContext property_assignment() throws RecognitionException {
		Property_assignmentContext _localctx = new Property_assignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_property_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((Property_assignmentContext)_localctx).pName = property_name();
			setState(94);
			match(T__19);
			setState(95);
			((Property_assignmentContext)_localctx).val = value();
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

	public static class Property_nameContext extends ParserRuleContext {
		public Property_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterProperty_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitProperty_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitProperty_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_nameContext property_name() throws RecognitionException {
		Property_nameContext _localctx = new Property_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_property_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
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

	public static class ValueContext extends ParserRuleContext {
		public Type type;
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class ValueBooleanContext extends ValueContext {
		public TerminalNode Boolean() { return getToken(FigureBankParser.Boolean, 0); }
		public ValueBooleanContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterValueBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitValueBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitValueBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueHSVColorContext extends ValueContext {
		public Token i1;
		public Token i2;
		public Token i3;
		public TerminalNode HexColor() { return getToken(FigureBankParser.HexColor, 0); }
		public List<TerminalNode> Int() { return getTokens(FigureBankParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(FigureBankParser.Int, i);
		}
		public ValueHSVColorContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterValueHSVColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitValueHSVColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitValueHSVColor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueRGBColorContext extends ValueContext {
		public Token i1;
		public Token i2;
		public Token i3;
		public TerminalNode HexColor() { return getToken(FigureBankParser.HexColor, 0); }
		public List<TerminalNode> Int() { return getTokens(FigureBankParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(FigureBankParser.Int, i);
		}
		public ValueRGBColorContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterValueRGBColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitValueRGBColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitValueRGBColor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueDoubleContext extends ValueContext {
		public TerminalNode Double() { return getToken(FigureBankParser.Double, 0); }
		public ValueDoubleContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterValueDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitValueDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitValueDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValuePointContext extends ValueContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ValuePointContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterValuePoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitValuePoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitValuePoint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueMultPointsContext extends ValueContext {
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public ValueMultPointsContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterValueMultPoints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitValueMultPoints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitValueMultPoints(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueIntContext extends ValueContext {
		public TerminalNode Int() { return getToken(FigureBankParser.Int, 0); }
		public ValueIntContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterValueInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitValueInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitValueInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueColorContext extends ValueContext {
		public TerminalNode Color() { return getToken(FigureBankParser.Color, 0); }
		public ValueColorContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).enterValueColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FigureBankListener ) ((FigureBankListener)listener).exitValueColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureBankVisitor ) return ((FigureBankVisitor<? extends T>)visitor).visitValueColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
				_localctx = new ValueIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(Int);
				}
				break;
			case Double:
				_localctx = new ValueDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(Double);
				}
				break;
			case Boolean:
				_localctx = new ValueBooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(Boolean);
				}
				break;
			case Color:
				_localctx = new ValueColorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(Color);
				}
				break;
			case T__37:
				_localctx = new ValueHSVColorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				match(T__37);
				setState(108);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Int:
					{
					setState(104);
					((ValueHSVColorContext)_localctx).i1 = match(Int);
					setState(105);
					((ValueHSVColorContext)_localctx).i2 = match(Int);
					setState(106);
					((ValueHSVColorContext)_localctx).i3 = match(Int);
					}
					break;
				case HexColor:
					{
					setState(107);
					match(HexColor);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__38:
				_localctx = new ValueRGBColorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				match(T__38);
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Int:
					{
					setState(111);
					((ValueRGBColorContext)_localctx).i1 = match(Int);
					setState(112);
					((ValueRGBColorContext)_localctx).i2 = match(Int);
					setState(113);
					((ValueRGBColorContext)_localctx).i3 = match(Int);
					}
					break;
				case HexColor:
					{
					setState(114);
					match(HexColor);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__0:
				_localctx = new ValuePointContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				point();
				}
				break;
			case T__39:
				_localctx = new ValueMultPointsContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				match(T__39);
				setState(119);
				point();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(120);
					match(T__1);
					setState(121);
					point();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__40);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0086\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\59\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7H\n\7\f\7\16\7K\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n^\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\ro\n\r\3\r\3\r\3\r\3\r\3\r\5\rv\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r}\n\r\f\r\16\r\u0080\13\r\3\r\3\r\5\r\u0084\n"+
		"\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\5\3\2,-\3\2\b\17\3\2\27"+
		"\'\2\u008e\2\35\3\2\2\2\4\"\3\2\2\2\6$\3\2\2\2\b8\3\2\2\2\n:\3\2\2\2\f"+
		"@\3\2\2\2\16P\3\2\2\2\20U\3\2\2\2\22]\3\2\2\2\24_\3\2\2\2\26c\3\2\2\2"+
		"\30\u0083\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2"+
		"\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\2\2\3!\3\3\2\2\2\"#\5"+
		"\6\4\2#\5\3\2\2\2$%\7\62\2\2%&\7\3\2\2&+\5\b\5\2\'(\7\4\2\2(*\5\b\5\2"+
		")\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\5\2"+
		"\2/\7\3\2\2\2\609\5\f\7\2\619\5\16\b\2\629\5\24\13\2\63\64\7\62\2\2\64"+
		"\65\7\6\2\2\65\66\7\62\2\2\66\67\7\7\2\2\679\5\n\6\28\60\3\2\2\28\61\3"+
		"\2\2\28\62\3\2\2\28\63\3\2\2\29\t\3\2\2\2:;\7\3\2\2;<\t\2\2\2<=\7\4\2"+
		"\2=>\t\2\2\2>?\7\5\2\2?\13\3\2\2\2@A\7\62\2\2AB\7\6\2\2BC\5\20\t\2CD\7"+
		"\3\2\2DI\5\24\13\2EF\7\4\2\2FH\5\24\13\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2"+
		"IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\5\2\2MN\7\7\2\2NO\5\n\6\2O\r\3\2\2"+
		"\2PQ\7\62\2\2QR\7\6\2\2RS\5\22\n\2ST\5\30\r\2T\17\3\2\2\2UV\t\3\2\2V\21"+
		"\3\2\2\2W^\7\20\2\2X^\7\21\2\2Y^\7\22\2\2Z^\7\23\2\2[^\7\24\2\2\\^\7\25"+
		"\2\2]W\3\2\2\2]X\3\2\2\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\23"+
		"\3\2\2\2_`\5\26\f\2`a\7\26\2\2ab\5\30\r\2b\25\3\2\2\2cd\t\4\2\2d\27\3"+
		"\2\2\2e\u0084\7,\2\2f\u0084\7-\2\2g\u0084\7.\2\2h\u0084\7/\2\2in\7(\2"+
		"\2jk\7,\2\2kl\7,\2\2lo\7,\2\2mo\7\60\2\2nj\3\2\2\2nm\3\2\2\2o\u0084\3"+
		"\2\2\2pu\7)\2\2qr\7,\2\2rs\7,\2\2sv\7,\2\2tv\7\60\2\2uq\3\2\2\2ut\3\2"+
		"\2\2v\u0084\3\2\2\2w\u0084\5\n\6\2xy\7*\2\2y~\5\n\6\2z{\7\4\2\2{}\5\n"+
		"\6\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2"+
		"\u0080~\3\2\2\2\u0081\u0082\7+\2\2\u0082\u0084\3\2\2\2\u0083e\3\2\2\2"+
		"\u0083f\3\2\2\2\u0083g\3\2\2\2\u0083h\3\2\2\2\u0083i\3\2\2\2\u0083p\3"+
		"\2\2\2\u0083w\3\2\2\2\u0083x\3\2\2\2\u0084\31\3\2\2\2\13\35+8I]nu~\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}