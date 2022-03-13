// Generated from Geometrics.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GeometricsParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, Int=105, Double=106, Boolean=107, 
		Color=108, HexColor=109, Key=110, Label=111, String=112, SingleLineComment=113, 
		MultiLineComment=114, WS=115;
	public static final int
		RULE_prog = 0, RULE_grammar_declaration = 1, RULE_stat = 2, RULE_load_bank = 3, 
		RULE_render = 4, RULE_create_instance = 5, RULE_destroy_instance = 6, 
		RULE_set_frame_rate = 7, RULE_canvas_size = 8, RULE_instantiate_figure = 9, 
		RULE_figure_declaration = 10, RULE_figure_properties = 11, RULE_primitive_figure_type = 12, 
		RULE_primitive_figure_declaration = 13, RULE_primitive_figure_block = 14, 
		RULE_property_assignment = 15, RULE_property_name = 16, RULE_normal_primitive_type = 17, 
		RULE_normal_primitive_declaration = 18, RULE_normal_primitive_assignment = 19, 
		RULE_point = 20, RULE_position = 21, RULE_time = 22, RULE_time_unit = 23, 
		RULE_create_group = 24, RULE_group = 25, RULE_animation = 26, RULE_animation_block = 27, 
		RULE_argument_declaration = 28, RULE_animate = 29, RULE_animation_statments = 30, 
		RULE_figure_operation = 31, RULE_figure_label = 32, RULE_move_figure = 33, 
		RULE_rotate_figure = 34, RULE_rotate_around = 35, RULE_scale_figure = 36, 
		RULE_hide_figure = 37, RULE_show_figure = 38, RULE_change_property = 39, 
		RULE_cond_statement = 40, RULE_if_statement = 41, RULE_else_if_statement = 42, 
		RULE_else_statment = 43, RULE_expr = 44, RULE_color = 45, RULE_loop_statement = 46, 
		RULE_condition_block = 47, RULE_valid_statments = 48, RULE_breakInLoop = 49, 
		RULE_wait_for_key = 50, RULE_input = 51, RULE_key_pressed = 52, RULE_pew = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "grammar_declaration", "stat", "load_bank", "render", "create_instance", 
			"destroy_instance", "set_frame_rate", "canvas_size", "instantiate_figure", 
			"figure_declaration", "figure_properties", "primitive_figure_type", "primitive_figure_declaration", 
			"primitive_figure_block", "property_assignment", "property_name", "normal_primitive_type", 
			"normal_primitive_declaration", "normal_primitive_assignment", "point", 
			"position", "time", "time_unit", "create_group", "group", "animation", 
			"animation_block", "argument_declaration", "animate", "animation_statments", 
			"figure_operation", "figure_label", "move_figure", "rotate_figure", "rotate_around", 
			"scale_figure", "hide_figure", "show_figure", "change_property", "cond_statement", 
			"if_statement", "else_if_statement", "else_statment", "expr", "color", 
			"loop_statement", "condition_block", "valid_statments", "breakInLoop", 
			"wait_for_key", "input", "key_pressed", "pew"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Geometrics'", "';'", "'load'", "'from'", "'render'", "'create'", 
			"'destroy'", "'Frame'", "'Rate'", "'Canvas Size'", "'figure'", "'{'", 
			"'}'", "'circle'", "'line'", "'rectangle'", "'square'", "'ellipse'", 
			"'polyline'", "'polygon'", "'arc'", "':'", "'hidden'", "'center'", "'points'", 
			"'scale'", "'angle'", "'fill'", "'fill_color'", "'border_color'", "'border'", 
			"'thickness'", "'radius'", "'length'", "'width'", "'height'", "'position'", 
			"'pivot'", "'layer'", "'point'", "'int'", "'double'", "'string'", "'boolean'", 
			"'time'", "'='", "'('", "','", "')'", "'at'", "'s'", "'ms'", "'ns'", 
			"'group'", "'['", "']'", "'animation'", "'animate'", "'.'", "'move'", 
			"'by'", "'to'", "'rotate'", "'around'", "'hide'", "'show'", "'if'", "'else if'", 
			"'else'", "'+'", "'-'", "'!'", "'^'", "'*'", "'/'", "'%'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'and'", "'or'", "'just'", "'collided'", 
			"'is'", "'colliding'", "'stopped'", "'intersects'", "'union'", "'HSV'", 
			"'RGB'", "'do'", "'while'", "'for'", "'times'", "'in'", "'break'", "'wait'", 
			"'input'", "'key'", "'pressed'", "'pew;'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Int", "Double", 
			"Boolean", "Color", "HexColor", "Key", "Label", "String", "SingleLineComment", 
			"MultiLineComment", "WS"
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
	public String getGrammarFileName() { return "Geometrics.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GeometricsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Grammar_declarationContext grammar_declaration() {
			return getRuleContext(Grammar_declarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GeometricsParser.EOF, 0); }
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
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitProg(this);
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
			setState(108);
			grammar_declaration();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__53) | (1L << T__56) | (1L << T__57) | (1L << T__59) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__93 - 65)) | (1L << (T__94 - 65)) | (1L << (T__95 - 65)) | (1L << (T__99 - 65)) | (1L << (T__100 - 65)) | (1L << (T__103 - 65)) | (1L << (Label - 65)))) != 0)) {
				{
				{
				setState(109);
				stat();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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

	public static class Grammar_declarationContext extends ParserRuleContext {
		public Token name;
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public Grammar_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammar_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterGrammar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitGrammar_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitGrammar_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grammar_declarationContext grammar_declaration() throws RecognitionException {
		Grammar_declarationContext _localctx = new Grammar_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammar_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__0);
			setState(118);
			((Grammar_declarationContext)_localctx).name = match(Label);
			setState(119);
			match(T__1);
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
		public RenderContext render() {
			return getRuleContext(RenderContext.class,0);
		}
		public Primitive_figure_declarationContext primitive_figure_declaration() {
			return getRuleContext(Primitive_figure_declarationContext.class,0);
		}
		public Normal_primitive_declarationContext normal_primitive_declaration() {
			return getRuleContext(Normal_primitive_declarationContext.class,0);
		}
		public Normal_primitive_assignmentContext normal_primitive_assignment() {
			return getRuleContext(Normal_primitive_assignmentContext.class,0);
		}
		public Figure_declarationContext figure_declaration() {
			return getRuleContext(Figure_declarationContext.class,0);
		}
		public Create_instanceContext create_instance() {
			return getRuleContext(Create_instanceContext.class,0);
		}
		public Cond_statementContext cond_statement() {
			return getRuleContext(Cond_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Set_frame_rateContext set_frame_rate() {
			return getRuleContext(Set_frame_rateContext.class,0);
		}
		public Canvas_sizeContext canvas_size() {
			return getRuleContext(Canvas_sizeContext.class,0);
		}
		public Figure_operationContext figure_operation() {
			return getRuleContext(Figure_operationContext.class,0);
		}
		public Wait_for_keyContext wait_for_key() {
			return getRuleContext(Wait_for_keyContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public Create_groupContext create_group() {
			return getRuleContext(Create_groupContext.class,0);
		}
		public Destroy_instanceContext destroy_instance() {
			return getRuleContext(Destroy_instanceContext.class,0);
		}
		public Load_bankContext load_bank() {
			return getRuleContext(Load_bankContext.class,0);
		}
		public AnimationContext animation() {
			return getRuleContext(AnimationContext.class,0);
		}
		public AnimateContext animate() {
			return getRuleContext(AnimateContext.class,0);
		}
		public PewContext pew() {
			return getRuleContext(PewContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				render();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				primitive_figure_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				normal_primitive_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				normal_primitive_assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				figure_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				create_instance();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				cond_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				loop_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				set_frame_rate();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(130);
				canvas_size();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(131);
				figure_operation();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(132);
				wait_for_key();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(133);
				input();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(134);
				create_group();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(135);
				destroy_instance();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(136);
				load_bank();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(137);
				animation();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(138);
				animate();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(139);
				pew();
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

	public static class Load_bankContext extends ParserRuleContext {
		public Load_bankContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load_bank; }
	 
		public Load_bankContext() { }
		public void copyFrom(Load_bankContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoadBankContext extends Load_bankContext {
		public TerminalNode String() { return getToken(GeometricsParser.String, 0); }
		public LoadBankContext(Load_bankContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterLoadBank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitLoadBank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitLoadBank(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Load_bankContext load_bank() throws RecognitionException {
		Load_bankContext _localctx = new Load_bankContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_load_bank);
		try {
			_localctx = new LoadBankContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__2);
			setState(143);
			match(T__3);
			setState(144);
			match(String);
			setState(145);
			match(T__1);
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

	public static class RenderContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RenderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_render; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterRender(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitRender(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitRender(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenderContext render() throws RecognitionException {
		RenderContext _localctx = new RenderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_render);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__4);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__46 || _la==T__54 || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__101 - 70)) | (1L << (Int - 70)) | (1L << (Double - 70)) | (1L << (Boolean - 70)) | (1L << (Color - 70)) | (1L << (Label - 70)) | (1L << (String - 70)))) != 0)) {
				{
				setState(148);
				expr(0);
				}
			}

			setState(151);
			match(T__1);
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

	public static class Create_instanceContext extends ParserRuleContext {
		public Instantiate_figureContext instantiate_figure() {
			return getRuleContext(Instantiate_figureContext.class,0);
		}
		public Create_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterCreate_instance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitCreate_instance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitCreate_instance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_instanceContext create_instance() throws RecognitionException {
		Create_instanceContext _localctx = new Create_instanceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create_instance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__5);
			setState(154);
			instantiate_figure();
			setState(155);
			match(T__1);
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

	public static class Destroy_instanceContext extends ParserRuleContext {
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public Destroy_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destroy_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterDestroy_instance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitDestroy_instance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitDestroy_instance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Destroy_instanceContext destroy_instance() throws RecognitionException {
		Destroy_instanceContext _localctx = new Destroy_instanceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_destroy_instance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__6);
			setState(158);
			match(Label);
			setState(159);
			match(T__1);
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

	public static class Set_frame_rateContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Set_frame_rateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_frame_rate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterSet_frame_rate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitSet_frame_rate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitSet_frame_rate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_frame_rateContext set_frame_rate() throws RecognitionException {
		Set_frame_rateContext _localctx = new Set_frame_rateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_set_frame_rate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__7);
			setState(162);
			match(T__8);
			setState(163);
			expr(0);
			setState(164);
			match(T__1);
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

	public static class Canvas_sizeContext extends ParserRuleContext {
		public ExprContext width;
		public ExprContext height;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Canvas_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvas_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterCanvas_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitCanvas_size(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitCanvas_size(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Canvas_sizeContext canvas_size() throws RecognitionException {
		Canvas_sizeContext _localctx = new Canvas_sizeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_canvas_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__9);
			setState(167);
			((Canvas_sizeContext)_localctx).width = expr(0);
			setState(168);
			((Canvas_sizeContext)_localctx).height = expr(0);
			setState(169);
			match(T__1);
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

	public static class Instantiate_figureContext extends ParserRuleContext {
		public int context = -1;
		public String figName = "";
		public Token obj;
		public Token instance_name;
		public List<TerminalNode> Label() { return getTokens(GeometricsParser.Label); }
		public TerminalNode Label(int i) {
			return getToken(GeometricsParser.Label, i);
		}
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public Instantiate_figureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiate_figure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterInstantiate_figure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitInstantiate_figure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitInstantiate_figure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instantiate_figureContext instantiate_figure() throws RecognitionException {
		Instantiate_figureContext _localctx = new Instantiate_figureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instantiate_figure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			((Instantiate_figureContext)_localctx).obj = match(Label);
			setState(172);
			((Instantiate_figureContext)_localctx).instance_name = match(Label);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__49) {
				{
				setState(173);
				position();
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

	public static class Figure_declarationContext extends ParserRuleContext {
		public Token id;
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public List<Figure_propertiesContext> figure_properties() {
			return getRuleContexts(Figure_propertiesContext.class);
		}
		public Figure_propertiesContext figure_properties(int i) {
			return getRuleContext(Figure_propertiesContext.class,i);
		}
		public Figure_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterFigure_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitFigure_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitFigure_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Figure_declarationContext figure_declaration() throws RecognitionException {
		Figure_declarationContext _localctx = new Figure_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_figure_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__10);
			setState(177);
			((Figure_declarationContext)_localctx).id = match(Label);
			setState(178);
			match(T__11);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) || _la==Label) {
				{
				{
				setState(179);
				figure_properties();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(T__12);
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
		public String figName = "";
		public Figure_propertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure_properties; }
	 
		public Figure_propertiesContext() { }
		public void copyFrom(Figure_propertiesContext ctx) {
			super.copyFrom(ctx);
			this.figName = ctx.figName;
		}
	}
	public static class FigureDeclarePrimitiveFigureContext extends Figure_propertiesContext {
		public Primitive_figure_declarationContext primitive_figure_declaration() {
			return getRuleContext(Primitive_figure_declarationContext.class,0);
		}
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public FigureDeclarePrimitiveFigureContext(Figure_propertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterFigureDeclarePrimitiveFigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitFigureDeclarePrimitiveFigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitFigureDeclarePrimitiveFigure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FigureInstanciateFigureContext extends Figure_propertiesContext {
		public Instantiate_figureContext instantiate_figure() {
			return getRuleContext(Instantiate_figureContext.class,0);
		}
		public FigureInstanciateFigureContext(Figure_propertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterFigureInstanciateFigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitFigureInstanciateFigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitFigureInstanciateFigure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FigurePropertyAssignmentContext extends Figure_propertiesContext {
		public Property_assignmentContext property_assignment() {
			return getRuleContext(Property_assignmentContext.class,0);
		}
		public FigurePropertyAssignmentContext(Figure_propertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterFigurePropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitFigurePropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitFigurePropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FigureChangeInstancePropertyContext extends Figure_propertiesContext {
		public Change_propertyContext change_property() {
			return getRuleContext(Change_propertyContext.class,0);
		}
		public FigureChangeInstancePropertyContext(Figure_propertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterFigureChangeInstanceProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitFigureChangeInstanceProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitFigureChangeInstanceProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FigureDeclarePrimitiveContext extends Figure_propertiesContext {
		public Normal_primitive_declarationContext normal_primitive_declaration() {
			return getRuleContext(Normal_primitive_declarationContext.class,0);
		}
		public FigureDeclarePrimitiveContext(Figure_propertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterFigureDeclarePrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitFigureDeclarePrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitFigureDeclarePrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Figure_propertiesContext figure_properties() throws RecognitionException {
		Figure_propertiesContext _localctx = new Figure_propertiesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_figure_properties);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new FigureDeclarePrimitiveFigureContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				primitive_figure_declaration();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__49) {
					{
					setState(188);
					position();
					setState(189);
					match(T__1);
					}
				}

				}
				break;
			case 2:
				_localctx = new FigureDeclarePrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				normal_primitive_declaration();
				}
				break;
			case 3:
				_localctx = new FigureInstanciateFigureContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				instantiate_figure();
				setState(195);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new FigureChangeInstancePropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				change_property();
				}
				break;
			case 5:
				_localctx = new FigurePropertyAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				property_assignment();
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

	public static class Primitive_figure_typeContext extends ParserRuleContext {
		public Primitive_figure_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_figure_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterPrimitive_figure_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitPrimitive_figure_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitPrimitive_figure_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_figure_typeContext primitive_figure_type() throws RecognitionException {
		Primitive_figure_typeContext _localctx = new Primitive_figure_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primitive_figure_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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

	public static class Primitive_figure_declarationContext extends ParserRuleContext {
		public int context = -1;
		public String figName = "";
		public Primitive_figure_typeContext type;
		public Token id;
		public Primitive_figure_typeContext primitive_figure_type() {
			return getRuleContext(Primitive_figure_typeContext.class,0);
		}
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public Primitive_figure_blockContext primitive_figure_block() {
			return getRuleContext(Primitive_figure_blockContext.class,0);
		}
		public Primitive_figure_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_figure_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterPrimitive_figure_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitPrimitive_figure_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitPrimitive_figure_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_figure_declarationContext primitive_figure_declaration() throws RecognitionException {
		Primitive_figure_declarationContext _localctx = new Primitive_figure_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitive_figure_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			((Primitive_figure_declarationContext)_localctx).type = primitive_figure_type();
			setState(204);
			((Primitive_figure_declarationContext)_localctx).id = match(Label);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(205);
				primitive_figure_block();
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

	public static class Primitive_figure_blockContext extends ParserRuleContext {
		public FigureType primType = null;
		public String label = "";
		public List<Property_assignmentContext> property_assignment() {
			return getRuleContexts(Property_assignmentContext.class);
		}
		public Property_assignmentContext property_assignment(int i) {
			return getRuleContext(Property_assignmentContext.class,i);
		}
		public Primitive_figure_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_figure_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterPrimitive_figure_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitPrimitive_figure_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitPrimitive_figure_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_figure_blockContext primitive_figure_block() throws RecognitionException {
		Primitive_figure_blockContext _localctx = new Primitive_figure_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primitive_figure_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__11);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) {
				{
				{
				setState(209);
				property_assignment();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			match(T__12);
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
		public String label = "";
		public Property_nameContext name;
		public ExprContext value;
		public Property_nameContext property_name() {
			return getRuleContext(Property_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Property_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterProperty_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitProperty_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitProperty_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_assignmentContext property_assignment() throws RecognitionException {
		Property_assignmentContext _localctx = new Property_assignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_property_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((Property_assignmentContext)_localctx).name = property_name();
			setState(218);
			match(T__21);
			setState(219);
			((Property_assignmentContext)_localctx).value = expr(0);
			setState(220);
			match(T__1);
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
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterProperty_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitProperty_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitProperty_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_nameContext property_name() throws RecognitionException {
		Property_nameContext _localctx = new Property_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_property_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanTypeContext extends Normal_primitive_typeContext {
		public BooleanTypeContext(Normal_primitive_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends Normal_primitive_typeContext {
		public IntTypeContext(Normal_primitive_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringTypeContext extends Normal_primitive_typeContext {
		public StringTypeContext(Normal_primitive_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitStringType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeTypeContext extends Normal_primitive_typeContext {
		public TimeTypeContext(Normal_primitive_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitTimeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitTimeType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PointTypeContext extends Normal_primitive_typeContext {
		public PointTypeContext(Normal_primitive_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Normal_primitive_typeContext normal_primitive_type() throws RecognitionException {
		Normal_primitive_typeContext _localctx = new Normal_primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_normal_primitive_type);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				_localctx = new PointTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(T__39);
				}
				break;
			case T__40:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__40);
				}
				break;
			case T__41:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(T__41);
				}
				break;
			case T__42:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(T__42);
				}
				break;
			case T__43:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				match(T__43);
				}
				break;
			case T__44:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				match(T__44);
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
	public static class NormalPrimitiveDeclarationAssignmentInputContext extends Normal_primitive_declarationContext {
		public Token id;
		public InputContext inp;
		public Normal_primitive_typeContext normal_primitive_type() {
			return getRuleContext(Normal_primitive_typeContext.class,0);
		}
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public NormalPrimitiveDeclarationAssignmentInputContext(Normal_primitive_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterNormalPrimitiveDeclarationAssignmentInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitNormalPrimitiveDeclarationAssignmentInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitNormalPrimitiveDeclarationAssignmentInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalPrimitiveDeclarationContext extends Normal_primitive_declarationContext {
		public Token id;
		public Normal_primitive_typeContext normal_primitive_type() {
			return getRuleContext(Normal_primitive_typeContext.class,0);
		}
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public NormalPrimitiveDeclarationContext(Normal_primitive_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterNormalPrimitiveDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitNormalPrimitiveDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitNormalPrimitiveDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalPrimitiveDeclarationAssignmentContext extends Normal_primitive_declarationContext {
		public Token id;
		public ExprContext value;
		public Normal_primitive_typeContext normal_primitive_type() {
			return getRuleContext(Normal_primitive_typeContext.class,0);
		}
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NormalPrimitiveDeclarationAssignmentContext(Normal_primitive_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterNormalPrimitiveDeclarationAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitNormalPrimitiveDeclarationAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitNormalPrimitiveDeclarationAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Normal_primitive_declarationContext normal_primitive_declaration() throws RecognitionException {
		Normal_primitive_declarationContext _localctx = new Normal_primitive_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_normal_primitive_declaration);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new NormalPrimitiveDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				normal_primitive_type();
				setState(233);
				((NormalPrimitiveDeclarationContext)_localctx).id = match(Label);
				setState(234);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new NormalPrimitiveDeclarationAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				normal_primitive_type();
				setState(237);
				((NormalPrimitiveDeclarationAssignmentContext)_localctx).id = match(Label);
				setState(238);
				match(T__45);
				setState(239);
				((NormalPrimitiveDeclarationAssignmentContext)_localctx).value = expr(0);
				setState(240);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new NormalPrimitiveDeclarationAssignmentInputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				normal_primitive_type();
				setState(243);
				((NormalPrimitiveDeclarationAssignmentInputContext)_localctx).id = match(Label);
				setState(244);
				match(T__45);
				setState(245);
				((NormalPrimitiveDeclarationAssignmentInputContext)_localctx).inp = input();
				setState(246);
				match(T__1);
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

	public static class Normal_primitive_assignmentContext extends ParserRuleContext {
		public Normal_primitive_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_primitive_assignment; }
	 
		public Normal_primitive_assignmentContext() { }
		public void copyFrom(Normal_primitive_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignInputContext extends Normal_primitive_assignmentContext {
		public Token id;
		public InputContext inp;
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public AssignInputContext(Normal_primitive_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterAssignInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitAssignInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitAssignInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignValueContext extends Normal_primitive_assignmentContext {
		public Token id;
		public ExprContext value;
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignValueContext(Normal_primitive_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterAssignValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitAssignValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Normal_primitive_assignmentContext normal_primitive_assignment() throws RecognitionException {
		Normal_primitive_assignmentContext _localctx = new Normal_primitive_assignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_normal_primitive_assignment);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AssignValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				((AssignValueContext)_localctx).id = match(Label);
				setState(251);
				match(T__45);
				setState(252);
				((AssignValueContext)_localctx).value = expr(0);
				setState(253);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new AssignInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				((AssignInputContext)_localctx).id = match(Label);
				setState(256);
				match(T__45);
				setState(257);
				((AssignInputContext)_localctx).inp = input();
				setState(258);
				match(T__1);
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
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
	 
		public PointContext() { }
		public void copyFrom(PointContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralPointContext extends PointContext {
		public ExprContext x;
		public ExprContext y;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LiteralPointContext(PointContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterLiteralPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitLiteralPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitLiteralPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_point);
		try {
			_localctx = new LiteralPointContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__46);
			setState(263);
			((LiteralPointContext)_localctx).x = expr(0);
			setState(264);
			match(T__47);
			setState(265);
			((LiteralPointContext)_localctx).y = expr(0);
			setState(266);
			match(T__48);
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

	public static class PositionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__49);
			setState(269);
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

	public static class TimeContext extends ParserRuleContext {
		public Token value;
		public Time_unitContext type;
		public TerminalNode Int() { return getToken(GeometricsParser.Int, 0); }
		public Time_unitContext time_unit() {
			return getRuleContext(Time_unitContext.class,0);
		}
		public TerminalNode Double() { return getToken(GeometricsParser.Double, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_time);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				((TimeContext)_localctx).value = match(Int);
				setState(272);
				((TimeContext)_localctx).type = time_unit();
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				((TimeContext)_localctx).value = match(Double);
				setState(274);
				((TimeContext)_localctx).type = time_unit();
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

	public static class Time_unitContext extends ParserRuleContext {
		public Time_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterTime_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitTime_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitTime_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_unitContext time_unit() throws RecognitionException {
		Time_unitContext _localctx = new Time_unitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_time_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__51) | (1L << T__52))) != 0)) ) {
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

	public static class Create_groupContext extends ParserRuleContext {
		public Token id;
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public Create_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterCreate_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitCreate_group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitCreate_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_groupContext create_group() throws RecognitionException {
		Create_groupContext _localctx = new Create_groupContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_create_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__53);
			setState(280);
			((Create_groupContext)_localctx).id = match(Label);
			setState(281);
			group();
			setState(282);
			match(T__1);
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

	public static class GroupContext extends ParserRuleContext {
		public Type type;
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
	 
		public GroupContext() { }
		public void copyFrom(GroupContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class GroupEntitiesContext extends GroupContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GroupEntitiesContext(GroupContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterGroupEntities(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitGroupEntities(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitGroupEntities(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_group);
		int _la;
		try {
			_localctx = new GroupEntitiesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__54);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46 || _la==T__54 || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__101 - 70)) | (1L << (Int - 70)) | (1L << (Double - 70)) | (1L << (Boolean - 70)) | (1L << (Color - 70)) | (1L << (Label - 70)) | (1L << (String - 70)))) != 0)) {
				{
				{
				setState(285);
				expr(0);
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(T__55);
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

	public static class AnimationContext extends ParserRuleContext {
		public Token name;
		public Token sub;
		public Animation_blockContext block;
		public List<TerminalNode> Label() { return getTokens(GeometricsParser.Label); }
		public TerminalNode Label(int i) {
			return getToken(GeometricsParser.Label, i);
		}
		public Animation_blockContext animation_block() {
			return getRuleContext(Animation_blockContext.class,0);
		}
		public List<Argument_declarationContext> argument_declaration() {
			return getRuleContexts(Argument_declarationContext.class);
		}
		public Argument_declarationContext argument_declaration(int i) {
			return getRuleContext(Argument_declarationContext.class,i);
		}
		public AnimationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterAnimation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitAnimation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitAnimation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationContext animation() throws RecognitionException {
		AnimationContext _localctx = new AnimationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_animation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__56);
			setState(294);
			((AnimationContext)_localctx).name = match(Label);
			setState(295);
			match(T__46);
			setState(296);
			((AnimationContext)_localctx).sub = match(Label);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(297);
				match(T__47);
				setState(298);
				argument_declaration();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(T__48);
			setState(305);
			match(T__11);
			setState(306);
			((AnimationContext)_localctx).block = animation_block();
			setState(307);
			match(T__12);
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

	public static class Animation_blockContext extends ParserRuleContext {
		public int objType = -1;
		public List<Animation_statmentsContext> animation_statments() {
			return getRuleContexts(Animation_statmentsContext.class);
		}
		public Animation_statmentsContext animation_statments(int i) {
			return getRuleContext(Animation_statmentsContext.class,i);
		}
		public Animation_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animation_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterAnimation_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitAnimation_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitAnimation_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Animation_blockContext animation_block() throws RecognitionException {
		Animation_blockContext _localctx = new Animation_blockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_animation_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__25) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__59) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__93 - 65)) | (1L << (T__94 - 65)) | (1L << (T__95 - 65)) | (1L << (T__99 - 65)) | (1L << (T__100 - 65)) | (1L << (Label - 65)))) != 0)) {
				{
				{
				setState(309);
				animation_statments();
				}
				}
				setState(314);
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

	public static class Argument_declarationContext extends ParserRuleContext {
		public Symbol s;
		public Token id;
		public Normal_primitive_typeContext normal_primitive_type() {
			return getRuleContext(Normal_primitive_typeContext.class,0);
		}
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public Argument_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterArgument_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitArgument_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitArgument_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_declarationContext argument_declaration() throws RecognitionException {
		Argument_declarationContext _localctx = new Argument_declarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argument_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			normal_primitive_type();
			setState(316);
			((Argument_declarationContext)_localctx).id = match(Label);
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

	public static class AnimateContext extends ParserRuleContext {
		public Token animationName;
		public Token first;
		public List<TerminalNode> Label() { return getTokens(GeometricsParser.Label); }
		public TerminalNode Label(int i) {
			return getToken(GeometricsParser.Label, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AnimateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterAnimate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitAnimate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitAnimate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimateContext animate() throws RecognitionException {
		AnimateContext _localctx = new AnimateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_animate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(T__57);
			setState(319);
			((AnimateContext)_localctx).animationName = match(Label);
			setState(320);
			match(T__46);
			setState(321);
			((AnimateContext)_localctx).first = match(Label);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(322);
				match(T__47);
				setState(323);
				expr(0);
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(T__48);
			setState(330);
			match(T__1);
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

	public static class Animation_statmentsContext extends ParserRuleContext {
		public Figure_operationContext figure_operation() {
			return getRuleContext(Figure_operationContext.class,0);
		}
		public Cond_statementContext cond_statement() {
			return getRuleContext(Cond_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Normal_primitive_declarationContext normal_primitive_declaration() {
			return getRuleContext(Normal_primitive_declarationContext.class,0);
		}
		public Normal_primitive_assignmentContext normal_primitive_assignment() {
			return getRuleContext(Normal_primitive_assignmentContext.class,0);
		}
		public RenderContext render() {
			return getRuleContext(RenderContext.class,0);
		}
		public Wait_for_keyContext wait_for_key() {
			return getRuleContext(Wait_for_keyContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public Set_frame_rateContext set_frame_rate() {
			return getRuleContext(Set_frame_rateContext.class,0);
		}
		public Canvas_sizeContext canvas_size() {
			return getRuleContext(Canvas_sizeContext.class,0);
		}
		public Animation_statmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animation_statments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterAnimation_statments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitAnimation_statments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitAnimation_statments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Animation_statmentsContext animation_statments() throws RecognitionException {
		Animation_statmentsContext _localctx = new Animation_statmentsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_animation_statments);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				figure_operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				cond_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				loop_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				normal_primitive_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				normal_primitive_assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
				render();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(338);
				wait_for_key();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(339);
				input();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(340);
				set_frame_rate();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(341);
				canvas_size();
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

	public static class Figure_operationContext extends ParserRuleContext {
		public Move_figureContext move_figure() {
			return getRuleContext(Move_figureContext.class,0);
		}
		public Rotate_figureContext rotate_figure() {
			return getRuleContext(Rotate_figureContext.class,0);
		}
		public Scale_figureContext scale_figure() {
			return getRuleContext(Scale_figureContext.class,0);
		}
		public Hide_figureContext hide_figure() {
			return getRuleContext(Hide_figureContext.class,0);
		}
		public Show_figureContext show_figure() {
			return getRuleContext(Show_figureContext.class,0);
		}
		public Change_propertyContext change_property() {
			return getRuleContext(Change_propertyContext.class,0);
		}
		public Figure_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterFigure_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitFigure_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitFigure_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Figure_operationContext figure_operation() throws RecognitionException {
		Figure_operationContext _localctx = new Figure_operationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_figure_operation);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__59:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				move_figure();
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				rotate_figure();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				scale_figure();
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				hide_figure();
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 5);
				{
				setState(348);
				show_figure();
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 6);
				{
				setState(349);
				change_property();
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

	public static class Figure_labelContext extends ParserRuleContext {
		public Symbol symbol = null;
		public Type type = null;
		public Figure_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure_label; }
	 
		public Figure_labelContext() { }
		public void copyFrom(Figure_labelContext ctx) {
			super.copyFrom(ctx);
			this.symbol = ctx.symbol;
			this.type = ctx.type;
		}
	}
	public static class FigureLabelChainContext extends Figure_labelContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public FigureLabelChainContext(Figure_labelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterFigureLabelChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitFigureLabelChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitFigureLabelChain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FigureLabelBaseContext extends Figure_labelContext {
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public FigureLabelBaseContext(Figure_labelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterFigureLabelBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitFigureLabelBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitFigureLabelBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Figure_labelContext figure_label() throws RecognitionException {
		return figure_label(0);
	}

	private Figure_labelContext figure_label(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Figure_labelContext _localctx = new Figure_labelContext(_ctx, _parentState);
		Figure_labelContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_figure_label, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FigureLabelBaseContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(353);
			match(Label);
			}
			_ctx.stop = _input.LT(-1);
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FigureLabelChainContext(new Figure_labelContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_figure_label);
					setState(355);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(356);
					match(T__58);
					setState(357);
					match(Label);
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Move_figureContext extends ParserRuleContext {
		public Move_figureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_figure; }
	 
		public Move_figureContext() { }
		public void copyFrom(Move_figureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoveByContext extends Move_figureContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MoveByContext(Move_figureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterMoveBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitMoveBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitMoveBy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoveToContext extends Move_figureContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MoveToContext(Move_figureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterMoveTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitMoveTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitMoveTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Move_figureContext move_figure() throws RecognitionException {
		Move_figureContext _localctx = new Move_figureContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_move_figure);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new MoveByContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(T__59);
				setState(364);
				figure_label(0);
				setState(365);
				match(T__60);
				setState(366);
				expr(0);
				setState(367);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new MoveToContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(T__59);
				setState(370);
				figure_label(0);
				setState(371);
				match(T__61);
				setState(372);
				expr(0);
				setState(373);
				match(T__1);
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

	public static class Rotate_figureContext extends ParserRuleContext {
		public Rotate_figureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotate_figure; }
	 
		public Rotate_figureContext() { }
		public void copyFrom(Rotate_figureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RotateByAroundContext extends Rotate_figureContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Rotate_aroundContext rotate_around() {
			return getRuleContext(Rotate_aroundContext.class,0);
		}
		public RotateByAroundContext(Rotate_figureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterRotateByAround(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitRotateByAround(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitRotateByAround(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RotateByContext extends Rotate_figureContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RotateByContext(Rotate_figureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterRotateBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitRotateBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitRotateBy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RotateToContext extends Rotate_figureContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RotateToContext(Rotate_figureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterRotateTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitRotateTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitRotateTo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RotateToAroundContext extends Rotate_figureContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Rotate_aroundContext rotate_around() {
			return getRuleContext(Rotate_aroundContext.class,0);
		}
		public RotateToAroundContext(Rotate_figureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterRotateToAround(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitRotateToAround(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitRotateToAround(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rotate_figureContext rotate_figure() throws RecognitionException {
		Rotate_figureContext _localctx = new Rotate_figureContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_rotate_figure);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new RotateByContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(T__62);
				setState(378);
				figure_label(0);
				setState(379);
				match(T__60);
				setState(380);
				expr(0);
				setState(381);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new RotateToContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(T__62);
				setState(384);
				figure_label(0);
				setState(385);
				match(T__61);
				setState(386);
				expr(0);
				setState(387);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new RotateByAroundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(T__62);
				setState(390);
				figure_label(0);
				setState(391);
				match(T__60);
				setState(392);
				expr(0);
				setState(393);
				rotate_around();
				setState(394);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new RotateToAroundContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				match(T__62);
				setState(397);
				figure_label(0);
				setState(398);
				match(T__61);
				setState(399);
				expr(0);
				setState(400);
				rotate_around();
				setState(401);
				match(T__1);
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

	public static class Rotate_aroundContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Rotate_aroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotate_around; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterRotate_around(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitRotate_around(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitRotate_around(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rotate_aroundContext rotate_around() throws RecognitionException {
		Rotate_aroundContext _localctx = new Rotate_aroundContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rotate_around);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(T__63);
			setState(406);
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

	public static class Scale_figureContext extends ParserRuleContext {
		public Scale_figureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale_figure; }
	 
		public Scale_figureContext() { }
		public void copyFrom(Scale_figureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ScaleToContext extends Scale_figureContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ScaleToContext(Scale_figureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterScaleTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitScaleTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitScaleTo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScaleByContext extends Scale_figureContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ScaleByContext(Scale_figureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterScaleBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitScaleBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitScaleBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scale_figureContext scale_figure() throws RecognitionException {
		Scale_figureContext _localctx = new Scale_figureContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_scale_figure);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ScaleByContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(T__25);
				setState(409);
				figure_label(0);
				setState(410);
				match(T__60);
				setState(411);
				expr(0);
				setState(412);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new ScaleToContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(T__25);
				setState(415);
				figure_label(0);
				setState(416);
				match(T__61);
				setState(417);
				expr(0);
				setState(418);
				match(T__1);
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

	public static class Hide_figureContext extends ParserRuleContext {
		public Hide_figureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hide_figure; }
	 
		public Hide_figureContext() { }
		public void copyFrom(Hide_figureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HideFigureContext extends Hide_figureContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public HideFigureContext(Hide_figureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterHideFigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitHideFigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitHideFigure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hide_figureContext hide_figure() throws RecognitionException {
		Hide_figureContext _localctx = new Hide_figureContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_hide_figure);
		try {
			_localctx = new HideFigureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__64);
			setState(423);
			figure_label(0);
			setState(424);
			match(T__1);
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

	public static class Show_figureContext extends ParserRuleContext {
		public Show_figureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_figure; }
	 
		public Show_figureContext() { }
		public void copyFrom(Show_figureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowFigureContext extends Show_figureContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public ShowFigureContext(Show_figureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterShowFigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitShowFigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitShowFigure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_figureContext show_figure() throws RecognitionException {
		Show_figureContext _localctx = new Show_figureContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_show_figure);
		try {
			_localctx = new ShowFigureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(T__65);
			setState(427);
			figure_label(0);
			setState(428);
			match(T__1);
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

	public static class Change_propertyContext extends ParserRuleContext {
		public Change_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_property; }
	 
		public Change_propertyContext() { }
		public void copyFrom(Change_propertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChangePrimitiveContext extends Change_propertyContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ChangePrimitiveContext(Change_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterChangePrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitChangePrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitChangePrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChangePropertyContext extends Change_propertyContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public Property_nameContext property_name() {
			return getRuleContext(Property_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ChangePropertyContext(Change_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterChangeProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitChangeProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitChangeProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Change_propertyContext change_property() throws RecognitionException {
		Change_propertyContext _localctx = new Change_propertyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_change_property);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new ChangePropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				figure_label(0);
				setState(431);
				match(T__58);
				setState(432);
				property_name();
				setState(433);
				match(T__45);
				setState(434);
				expr(0);
				setState(435);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new ChangePrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				figure_label(0);
				setState(438);
				match(T__58);
				setState(439);
				match(Label);
				setState(440);
				match(T__45);
				setState(441);
				expr(0);
				setState(442);
				match(T__1);
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

	public static class Cond_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public List<Else_if_statementContext> else_if_statement() {
			return getRuleContexts(Else_if_statementContext.class);
		}
		public Else_if_statementContext else_if_statement(int i) {
			return getRuleContext(Else_if_statementContext.class,i);
		}
		public Else_statmentContext else_statment() {
			return getRuleContext(Else_statmentContext.class,0);
		}
		public Cond_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterCond_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitCond_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitCond_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_statementContext cond_statement() throws RecognitionException {
		Cond_statementContext _localctx = new Cond_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cond_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			if_statement();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__67) {
				{
				{
				setState(447);
				else_if_statement();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(453);
				else_statment();
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

	public static class If_statementContext extends ParserRuleContext {
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	 
		public If_statementContext() { }
		public void copyFrom(If_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementContext extends If_statementContext {
		public ExprContext cond;
		public Condition_blockContext block;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public IfStatementContext(If_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_if_statement);
		try {
			_localctx = new IfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(T__66);
			setState(457);
			match(T__46);
			setState(458);
			((IfStatementContext)_localctx).cond = expr(0);
			setState(459);
			match(T__48);
			setState(460);
			match(T__11);
			setState(461);
			((IfStatementContext)_localctx).block = condition_block();
			setState(462);
			match(T__12);
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

	public static class Else_if_statementContext extends ParserRuleContext {
		public Else_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement; }
	 
		public Else_if_statementContext() { }
		public void copyFrom(Else_if_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseIfStatementContext extends Else_if_statementContext {
		public ExprContext cond;
		public Condition_blockContext block;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public ElseIfStatementContext(Else_if_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_statementContext else_if_statement() throws RecognitionException {
		Else_if_statementContext _localctx = new Else_if_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_else_if_statement);
		try {
			_localctx = new ElseIfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(T__67);
			setState(465);
			match(T__46);
			setState(466);
			((ElseIfStatementContext)_localctx).cond = expr(0);
			setState(467);
			match(T__48);
			setState(468);
			match(T__11);
			setState(469);
			((ElseIfStatementContext)_localctx).block = condition_block();
			setState(470);
			match(T__12);
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

	public static class Else_statmentContext extends ParserRuleContext {
		public Else_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statment; }
	 
		public Else_statmentContext() { }
		public void copyFrom(Else_statmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseStatmentContext extends Else_statmentContext {
		public Condition_blockContext block;
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public ElseStatmentContext(Else_statmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterElseStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitElseStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitElseStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statmentContext else_statment() throws RecognitionException {
		Else_statmentContext _localctx = new Else_statmentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_else_statment);
		try {
			_localctx = new ElseStatmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(T__68);
			setState(473);
			match(T__11);
			setState(474);
			((ElseStatmentContext)_localctx).block = condition_block();
			setState(475);
			match(T__12);
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
		public Type type = null;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class ExprIntContext extends ExprContext {
		public TerminalNode Int() { return getToken(GeometricsParser.Int, 0); }
		public ExprIntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBooleanContext extends ExprContext {
		public TerminalNode Boolean() { return getToken(GeometricsParser.Boolean, 0); }
		public ExprBooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddSubContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprUnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprUnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetLogicContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SetLogicContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterSetLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitSetLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitSetLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParentisisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParentisisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprParentisis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprParentisis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprParentisis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDoubleContext extends ExprContext {
		public TerminalNode Double() { return getToken(GeometricsParser.Double, 0); }
		public ExprDoubleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprLabelContext extends ExprContext {
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public ExprLabelContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CollisionJustContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CollisionJustContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterCollisionJust(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitCollisionJust(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitCollisionJust(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprGreaterLesserContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprGreaterLesserContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprGreaterLesser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprGreaterLesser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprGreaterLesser(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNegationContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNegationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprColorContext extends ExprContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ExprColorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprColor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFigurePropertyContext extends ExprContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public Property_nameContext property_name() {
			return getRuleContext(Property_nameContext.class,0);
		}
		public ExprFigurePropertyContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprFigureProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprFigureProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprFigureProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultDivRemContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultDivRemContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprMultDivRem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprMultDivRem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprMultDivRem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KeyPressedContext extends ExprContext {
		public Key_pressedContext key_pressed() {
			return getRuleContext(Key_pressedContext.class,0);
		}
		public KeyPressedContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterKeyPressed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitKeyPressed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitKeyPressed(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprGroupContext extends ExprContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public ExprGroupContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEqualityContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprEqualityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTimeContext extends ExprContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public ExprTimeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprTime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPointContext extends ExprContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ExprPointContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprPoint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CollisionIsContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CollisionIsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterCollisionIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitCollisionIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitCollisionIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAndOrContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAndOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringContext extends ExprContext {
		public TerminalNode String() { return getToken(GeometricsParser.String, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFigureContext extends ExprContext {
		public Figure_labelContext figure_label() {
			return getRuleContext(Figure_labelContext.class,0);
		}
		public ExprFigureContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprFigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprFigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprFigure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPowerContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprPowerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterExprPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitExprPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitExprPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CollisionStopContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CollisionStopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterCollisionStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitCollisionStop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitCollisionStop(this);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(478);
				((ExprUnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__69 || _la==T__70) ) {
					((ExprUnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(479);
				expr(25);
				}
				break;
			case 2:
				{
				_localctx = new ExprNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(480);
				((ExprNegationContext)_localctx).op = match(T__71);
				setState(481);
				expr(24);
				}
				break;
			case 3:
				{
				_localctx = new ExprParentisisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(482);
				match(T__46);
				setState(483);
				expr(0);
				setState(484);
				match(T__48);
				}
				break;
			case 4:
				{
				_localctx = new KeyPressedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(486);
				key_pressed();
				}
				break;
			case 5:
				{
				_localctx = new ExprPointContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(487);
				point();
				}
				break;
			case 6:
				{
				_localctx = new ExprGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(488);
				group();
				}
				break;
			case 7:
				{
				_localctx = new ExprLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(489);
				match(Label);
				}
				break;
			case 8:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(490);
				match(Int);
				}
				break;
			case 9:
				{
				_localctx = new ExprDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(491);
				match(Double);
				}
				break;
			case 10:
				{
				_localctx = new ExprBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(492);
				match(Boolean);
				}
				break;
			case 11:
				{
				_localctx = new ExprColorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(493);
				color();
				}
				break;
			case 12:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(494);
				match(String);
				}
				break;
			case 13:
				{
				_localctx = new ExprTimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(495);
				time();
				}
				break;
			case 14:
				{
				_localctx = new ExprFigureContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496);
				figure_label(0);
				}
				break;
			case 15:
				{
				_localctx = new ExprFigurePropertyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(497);
				figure_label(0);
				setState(498);
				match(T__58);
				setState(499);
				property_name();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(536);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExprPowerContext(new ExprContext(_parentctx, _parentState));
						((ExprPowerContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(503);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(504);
						((ExprPowerContext)_localctx).op = match(T__72);
						setState(505);
						((ExprPowerContext)_localctx).e2 = expr(24);
						}
						break;
					case 2:
						{
						_localctx = new ExprMultDivRemContext(new ExprContext(_parentctx, _parentState));
						((ExprMultDivRemContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(506);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(507);
						((ExprMultDivRemContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)))) != 0)) ) {
							((ExprMultDivRemContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(508);
						((ExprMultDivRemContext)_localctx).e2 = expr(23);
						}
						break;
					case 3:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						((ExprAddSubContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(509);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(510);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__69 || _la==T__70) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(511);
						((ExprAddSubContext)_localctx).e2 = expr(22);
						}
						break;
					case 4:
						{
						_localctx = new ExprEqualityContext(new ExprContext(_parentctx, _parentState));
						((ExprEqualityContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(512);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(513);
						((ExprEqualityContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__76 || _la==T__77) ) {
							((ExprEqualityContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(514);
						((ExprEqualityContext)_localctx).e2 = expr(20);
						}
						break;
					case 5:
						{
						_localctx = new ExprGreaterLesserContext(new ExprContext(_parentctx, _parentState));
						((ExprGreaterLesserContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(515);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(516);
						((ExprGreaterLesserContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (T__78 - 79)) | (1L << (T__79 - 79)) | (1L << (T__80 - 79)) | (1L << (T__81 - 79)))) != 0)) ) {
							((ExprGreaterLesserContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(517);
						((ExprGreaterLesserContext)_localctx).e2 = expr(19);
						}
						break;
					case 6:
						{
						_localctx = new ExprAndOrContext(new ExprContext(_parentctx, _parentState));
						((ExprAndOrContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(518);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(519);
						((ExprAndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__82 || _la==T__83) ) {
							((ExprAndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(520);
						((ExprAndOrContext)_localctx).e2 = expr(18);
						}
						break;
					case 7:
						{
						_localctx = new CollisionJustContext(new ExprContext(_parentctx, _parentState));
						((CollisionJustContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(521);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(522);
						match(T__84);
						setState(523);
						match(T__85);
						setState(524);
						((CollisionJustContext)_localctx).e2 = expr(17);
						}
						break;
					case 8:
						{
						_localctx = new CollisionIsContext(new ExprContext(_parentctx, _parentState));
						((CollisionIsContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(525);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(526);
						match(T__86);
						setState(527);
						match(T__87);
						setState(528);
						((CollisionIsContext)_localctx).e2 = expr(16);
						}
						break;
					case 9:
						{
						_localctx = new CollisionStopContext(new ExprContext(_parentctx, _parentState));
						((CollisionStopContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(529);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(530);
						match(T__88);
						setState(531);
						match(T__87);
						setState(532);
						((CollisionStopContext)_localctx).e2 = expr(15);
						}
						break;
					case 10:
						{
						_localctx = new SetLogicContext(new ExprContext(_parentctx, _parentState));
						((SetLogicContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(533);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(534);
						_la = _input.LA(1);
						if ( !(_la==T__89 || _la==T__90) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(535);
						((SetLogicContext)_localctx).e2 = expr(14);
						}
						break;
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class ColorContext extends ParserRuleContext {
		public Type type = null;
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
	 
		public ColorContext() { }
		public void copyFrom(ColorContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class ColorNormalContext extends ColorContext {
		public TerminalNode Color() { return getToken(GeometricsParser.Color, 0); }
		public ColorNormalContext(ColorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterColorNormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitColorNormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitColorNormal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColorHSVContext extends ColorContext {
		public Token i1;
		public Token i2;
		public Token i3;
		public TerminalNode HexColor() { return getToken(GeometricsParser.HexColor, 0); }
		public List<TerminalNode> Int() { return getTokens(GeometricsParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(GeometricsParser.Int, i);
		}
		public ColorHSVContext(ColorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterColorHSV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitColorHSV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitColorHSV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColorRGBContext extends ColorContext {
		public Token i1;
		public Token i2;
		public Token i3;
		public TerminalNode HexColor() { return getToken(GeometricsParser.HexColor, 0); }
		public List<TerminalNode> Int() { return getTokens(GeometricsParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(GeometricsParser.Int, i);
		}
		public ColorRGBContext(ColorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterColorRGB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitColorRGB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitColorRGB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_color);
		try {
			setState(556);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Color:
				_localctx = new ColorNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(Color);
				}
				break;
			case T__91:
				_localctx = new ColorHSVContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(T__91);
				setState(547);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Int:
					{
					setState(543);
					((ColorHSVContext)_localctx).i1 = match(Int);
					setState(544);
					((ColorHSVContext)_localctx).i2 = match(Int);
					setState(545);
					((ColorHSVContext)_localctx).i3 = match(Int);
					}
					break;
				case HexColor:
					{
					setState(546);
					match(HexColor);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__92:
				_localctx = new ColorRGBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				match(T__92);
				setState(554);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Int:
					{
					setState(550);
					((ColorRGBContext)_localctx).i1 = match(Int);
					setState(551);
					((ColorRGBContext)_localctx).i2 = match(Int);
					setState(552);
					((ColorRGBContext)_localctx).i3 = match(Int);
					}
					break;
				case HexColor:
					{
					setState(553);
					match(HexColor);
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

	public static class Loop_statementContext extends ParserRuleContext {
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
	 
		public Loop_statementContext() { }
		public void copyFrom(Loop_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoWhileContext extends Loop_statementContext {
		public Condition_blockContext block;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public DoWhileContext(Loop_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForTimesContext extends Loop_statementContext {
		public Condition_blockContext block;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public ForTimesContext(Loop_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterForTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitForTimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitForTimes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileConditionContext extends Loop_statementContext {
		public Condition_blockContext block;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public WhileConditionContext(Loop_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterWhileCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitWhileCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitWhileCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInContext extends Loop_statementContext {
		public Condition_blockContext block;
		public TerminalNode Label() { return getToken(GeometricsParser.Label, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public ForInContext(Loop_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterForIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitForIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitForIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_loop_statement);
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new DoWhileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(T__93);
				setState(559);
				match(T__11);
				setState(560);
				((DoWhileContext)_localctx).block = condition_block();
				setState(561);
				match(T__12);
				setState(562);
				match(T__94);
				setState(563);
				match(T__46);
				setState(564);
				expr(0);
				setState(565);
				match(T__48);
				setState(566);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new ForTimesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(T__95);
				setState(569);
				expr(0);
				setState(570);
				match(T__96);
				setState(571);
				match(T__11);
				setState(572);
				((ForTimesContext)_localctx).block = condition_block();
				setState(573);
				match(T__12);
				}
				break;
			case 3:
				_localctx = new ForInContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				match(T__95);
				setState(576);
				match(T__46);
				setState(577);
				match(Label);
				setState(578);
				match(T__97);
				setState(579);
				expr(0);
				setState(580);
				match(T__48);
				setState(581);
				match(T__11);
				setState(582);
				((ForInContext)_localctx).block = condition_block();
				setState(583);
				match(T__12);
				}
				break;
			case 4:
				_localctx = new WhileConditionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				match(T__94);
				setState(586);
				match(T__46);
				setState(587);
				expr(0);
				setState(588);
				match(T__48);
				setState(589);
				match(T__11);
				setState(590);
				((WhileConditionContext)_localctx).block = condition_block();
				setState(591);
				match(T__12);
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

	public static class Condition_blockContext extends ParserRuleContext {
		public List<Valid_statmentsContext> valid_statments() {
			return getRuleContexts(Valid_statmentsContext.class);
		}
		public Valid_statmentsContext valid_statments(int i) {
			return getRuleContext(Valid_statmentsContext.class,i);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_condition_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__25) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__57) | (1L << T__59) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__93 - 65)) | (1L << (T__94 - 65)) | (1L << (T__95 - 65)) | (1L << (T__98 - 65)) | (1L << (T__99 - 65)) | (1L << (T__100 - 65)) | (1L << (T__103 - 65)) | (1L << (Label - 65)))) != 0)) {
				{
				{
				setState(595);
				valid_statments();
				}
				}
				setState(600);
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

	public static class Valid_statmentsContext extends ParserRuleContext {
		public Figure_operationContext figure_operation() {
			return getRuleContext(Figure_operationContext.class,0);
		}
		public Cond_statementContext cond_statement() {
			return getRuleContext(Cond_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Normal_primitive_declarationContext normal_primitive_declaration() {
			return getRuleContext(Normal_primitive_declarationContext.class,0);
		}
		public Normal_primitive_assignmentContext normal_primitive_assignment() {
			return getRuleContext(Normal_primitive_assignmentContext.class,0);
		}
		public RenderContext render() {
			return getRuleContext(RenderContext.class,0);
		}
		public Wait_for_keyContext wait_for_key() {
			return getRuleContext(Wait_for_keyContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public Create_instanceContext create_instance() {
			return getRuleContext(Create_instanceContext.class,0);
		}
		public Destroy_instanceContext destroy_instance() {
			return getRuleContext(Destroy_instanceContext.class,0);
		}
		public BreakInLoopContext breakInLoop() {
			return getRuleContext(BreakInLoopContext.class,0);
		}
		public Set_frame_rateContext set_frame_rate() {
			return getRuleContext(Set_frame_rateContext.class,0);
		}
		public Canvas_sizeContext canvas_size() {
			return getRuleContext(Canvas_sizeContext.class,0);
		}
		public AnimateContext animate() {
			return getRuleContext(AnimateContext.class,0);
		}
		public PewContext pew() {
			return getRuleContext(PewContext.class,0);
		}
		public Valid_statmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valid_statments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterValid_statments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitValid_statments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitValid_statments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valid_statmentsContext valid_statments() throws RecognitionException {
		Valid_statmentsContext _localctx = new Valid_statmentsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_valid_statments);
		try {
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				figure_operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				cond_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				loop_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(604);
				normal_primitive_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(605);
				normal_primitive_assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(606);
				render();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(607);
				wait_for_key();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(608);
				input();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(609);
				create_instance();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(610);
				destroy_instance();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(611);
				breakInLoop();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(612);
				set_frame_rate();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(613);
				canvas_size();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(614);
				animate();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(615);
				pew();
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

	public static class BreakInLoopContext extends ParserRuleContext {
		public BreakInLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakInLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterBreakInLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitBreakInLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitBreakInLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakInLoopContext breakInLoop() throws RecognitionException {
		BreakInLoopContext _localctx = new BreakInLoopContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_breakInLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(T__98);
			setState(619);
			match(T__1);
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

	public static class Wait_for_keyContext extends ParserRuleContext {
		public Wait_for_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wait_for_key; }
	 
		public Wait_for_keyContext() { }
		public void copyFrom(Wait_for_keyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WaitCommandContext extends Wait_for_keyContext {
		public TerminalNode Key() { return getToken(GeometricsParser.Key, 0); }
		public WaitCommandContext(Wait_for_keyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterWaitCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitWaitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitWaitCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WaitTimeContext extends Wait_for_keyContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WaitTimeContext(Wait_for_keyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterWaitTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitWaitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitWaitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wait_for_keyContext wait_for_key() throws RecognitionException {
		Wait_for_keyContext _localctx = new Wait_for_keyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_wait_for_key);
		try {
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new WaitCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(T__99);
				setState(622);
				match(T__95);
				setState(623);
				match(Key);
				setState(624);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new WaitTimeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(T__99);
				setState(626);
				expr(0);
				setState(627);
				match(T__1);
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

	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputCommandContext extends InputContext {
		public TerminalNode String() { return getToken(GeometricsParser.String, 0); }
		public InputCommandContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterInputCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitInputCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitInputCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_input);
		try {
			_localctx = new InputCommandContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(T__100);
			setState(632);
			match(String);
			setState(633);
			match(T__1);
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

	public static class Key_pressedContext extends ParserRuleContext {
		public Key_pressedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_pressed; }
	 
		public Key_pressedContext() { }
		public void copyFrom(Key_pressedContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KeyPressedMethodContext extends Key_pressedContext {
		public TerminalNode Key() { return getToken(GeometricsParser.Key, 0); }
		public KeyPressedMethodContext(Key_pressedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterKeyPressedMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitKeyPressedMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitKeyPressedMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_pressedContext key_pressed() throws RecognitionException {
		Key_pressedContext _localctx = new Key_pressedContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_key_pressed);
		try {
			_localctx = new KeyPressedMethodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(T__101);
			setState(636);
			match(T__102);
			setState(637);
			match(Key);
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

	public static class PewContext extends ParserRuleContext {
		public PewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pew; }
	 
		public PewContext() { }
		public void copyFrom(PewContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PewCommandContext extends PewContext {
		public PewCommandContext(PewContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).enterPewCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometricsListener ) ((GeometricsListener)listener).exitPewCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometricsVisitor ) return ((GeometricsVisitor<? extends T>)visitor).visitPewCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PewContext pew() throws RecognitionException {
		PewContext _localctx = new PewContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_pew);
		try {
			_localctx = new PewCommandContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(T__103);
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
		case 32:
			return figure_label_sempred((Figure_labelContext)_localctx, predIndex);
		case 44:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean figure_label_sempred(Figure_labelContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 23);
		case 2:
			return precpred(_ctx, 22);
		case 3:
			return precpred(_ctx, 21);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3u\u0284\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\7\2q\n\2\f\2\16\2t\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u008f\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5"+
		"\6\u0098\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u00b1\n\13\3\f\3\f\3\f\3\f"+
		"\7\f\u00b7\n\f\f\f\16\f\u00ba\13\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00c2\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ca\n\r\3\16\3\16\3\17\3\17\3\17\5\17"+
		"\u00d1\n\17\3\20\3\20\7\20\u00d5\n\20\f\20\16\20\u00d8\13\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00e9\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00fb\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0107\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\5\30\u0116\n\30\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\7\33\u0121\n\33\f\33\16\33\u0124\13\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\7\34\u012e\n\34\f\34\16\34\u0131\13\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\7\35\u0139\n\35\f\35\16\35\u013c\13\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0147\n\37\f\37\16\37\u014a"+
		"\13\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0159\n \3!\3!"+
		"\3!\3!\3!\3!\5!\u0161\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0169\n\"\f\"\16"+
		"\"\u016c\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u017a\n#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\5$\u0196\n$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01a7\n"+
		"&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\5)\u01bf\n)\3*\3*\7*\u01c3\n*\f*\16*\u01c6\13*\3*\5*\u01c9\n*\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01f8"+
		"\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u021b\n.\f.\16.\u021e\13.\3/\3/\3"+
		"/\3/\3/\3/\5/\u0226\n/\3/\3/\3/\3/\3/\5/\u022d\n/\5/\u022f\n/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u0254\n\60\3\61\7\61\u0257\n\61\f\61\16"+
		"\61\u025a\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u026b\n\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\5\64\u0278\n\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\2\4BZ8\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\13\3\2\20\27\3\2\31)"+
		"\3\2\65\67\3\2HI\3\2LN\3\2OP\3\2QT\3\2UV\3\2\\]\2\u02bd\2n\3\2\2\2\4w"+
		"\3\2\2\2\6\u008e\3\2\2\2\b\u0090\3\2\2\2\n\u0095\3\2\2\2\f\u009b\3\2\2"+
		"\2\16\u009f\3\2\2\2\20\u00a3\3\2\2\2\22\u00a8\3\2\2\2\24\u00ad\3\2\2\2"+
		"\26\u00b2\3\2\2\2\30\u00c9\3\2\2\2\32\u00cb\3\2\2\2\34\u00cd\3\2\2\2\36"+
		"\u00d2\3\2\2\2 \u00db\3\2\2\2\"\u00e0\3\2\2\2$\u00e8\3\2\2\2&\u00fa\3"+
		"\2\2\2(\u0106\3\2\2\2*\u0108\3\2\2\2,\u010e\3\2\2\2.\u0115\3\2\2\2\60"+
		"\u0117\3\2\2\2\62\u0119\3\2\2\2\64\u011e\3\2\2\2\66\u0127\3\2\2\28\u013a"+
		"\3\2\2\2:\u013d\3\2\2\2<\u0140\3\2\2\2>\u0158\3\2\2\2@\u0160\3\2\2\2B"+
		"\u0162\3\2\2\2D\u0179\3\2\2\2F\u0195\3\2\2\2H\u0197\3\2\2\2J\u01a6\3\2"+
		"\2\2L\u01a8\3\2\2\2N\u01ac\3\2\2\2P\u01be\3\2\2\2R\u01c0\3\2\2\2T\u01ca"+
		"\3\2\2\2V\u01d2\3\2\2\2X\u01da\3\2\2\2Z\u01f7\3\2\2\2\\\u022e\3\2\2\2"+
		"^\u0253\3\2\2\2`\u0258\3\2\2\2b\u026a\3\2\2\2d\u026c\3\2\2\2f\u0277\3"+
		"\2\2\2h\u0279\3\2\2\2j\u027d\3\2\2\2l\u0281\3\2\2\2nr\5\4\3\2oq\5\6\4"+
		"\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\2\2"+
		"\3v\3\3\2\2\2wx\7\3\2\2xy\7q\2\2yz\7\4\2\2z\5\3\2\2\2{\u008f\5\n\6\2|"+
		"\u008f\5\34\17\2}\u008f\5&\24\2~\u008f\5(\25\2\177\u008f\5\26\f\2\u0080"+
		"\u008f\5\f\7\2\u0081\u008f\5R*\2\u0082\u008f\5^\60\2\u0083\u008f\5\20"+
		"\t\2\u0084\u008f\5\22\n\2\u0085\u008f\5@!\2\u0086\u008f\5f\64\2\u0087"+
		"\u008f\5h\65\2\u0088\u008f\5\62\32\2\u0089\u008f\5\16\b\2\u008a\u008f"+
		"\5\b\5\2\u008b\u008f\5\66\34\2\u008c\u008f\5<\37\2\u008d\u008f\5l\67\2"+
		"\u008e{\3\2\2\2\u008e|\3\2\2\2\u008e}\3\2\2\2\u008e~\3\2\2\2\u008e\177"+
		"\3\2\2\2\u008e\u0080\3\2\2\2\u008e\u0081\3\2\2\2\u008e\u0082\3\2\2\2\u008e"+
		"\u0083\3\2\2\2\u008e\u0084\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u0086\3\2"+
		"\2\2\u008e\u0087\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u0089\3\2\2\2\u008e"+
		"\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2"+
		"\2\2\u008f\7\3\2\2\2\u0090\u0091\7\5\2\2\u0091\u0092\7\6\2\2\u0092\u0093"+
		"\7r\2\2\u0093\u0094\7\4\2\2\u0094\t\3\2\2\2\u0095\u0097\7\7\2\2\u0096"+
		"\u0098\5Z.\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2"+
		"\2\u0099\u009a\7\4\2\2\u009a\13\3\2\2\2\u009b\u009c\7\b\2\2\u009c\u009d"+
		"\5\24\13\2\u009d\u009e\7\4\2\2\u009e\r\3\2\2\2\u009f\u00a0\7\t\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7\4\2\2\u00a2\17\3\2\2\2\u00a3\u00a4\7\n\2\2"+
		"\u00a4\u00a5\7\13\2\2\u00a5\u00a6\5Z.\2\u00a6\u00a7\7\4\2\2\u00a7\21\3"+
		"\2\2\2\u00a8\u00a9\7\f\2\2\u00a9\u00aa\5Z.\2\u00aa\u00ab\5Z.\2\u00ab\u00ac"+
		"\7\4\2\2\u00ac\23\3\2\2\2\u00ad\u00ae\7q\2\2\u00ae\u00b0\7q\2\2\u00af"+
		"\u00b1\5,\27\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\25\3\2\2"+
		"\2\u00b2\u00b3\7\r\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b8\7\16\2\2\u00b5\u00b7"+
		"\5\30\r\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc"+
		"\7\17\2\2\u00bc\27\3\2\2\2\u00bd\u00c1\5\34\17\2\u00be\u00bf\5,\27\2\u00bf"+
		"\u00c0\7\4\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00ca\3\2\2\2\u00c3\u00ca\5&\24\2\u00c4\u00c5\5\24\13\2\u00c5"+
		"\u00c6\7\4\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00ca\5P)\2\u00c8\u00ca\5 \21"+
		"\2\u00c9\u00bd\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\31\3\2\2\2\u00cb\u00cc\t\2\2\2\u00cc"+
		"\33\3\2\2\2\u00cd\u00ce\5\32\16\2\u00ce\u00d0\7q\2\2\u00cf\u00d1\5\36"+
		"\20\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\35\3\2\2\2\u00d2\u00d6"+
		"\7\16\2\2\u00d3\u00d5\5 \21\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9\u00da\7\17\2\2\u00da\37\3\2\2\2\u00db\u00dc\5\"\22\2\u00dc"+
		"\u00dd\7\30\2\2\u00dd\u00de\5Z.\2\u00de\u00df\7\4\2\2\u00df!\3\2\2\2\u00e0"+
		"\u00e1\t\3\2\2\u00e1#\3\2\2\2\u00e2\u00e9\7*\2\2\u00e3\u00e9\7+\2\2\u00e4"+
		"\u00e9\7,\2\2\u00e5\u00e9\7-\2\2\u00e6\u00e9\7.\2\2\u00e7\u00e9\7/\2\2"+
		"\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e5"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9%\3\2\2\2\u00ea"+
		"\u00eb\5$\23\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7\4\2\2\u00ed\u00fb\3\2"+
		"\2\2\u00ee\u00ef\5$\23\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7\60\2\2\u00f1"+
		"\u00f2\5Z.\2\u00f2\u00f3\7\4\2\2\u00f3\u00fb\3\2\2\2\u00f4\u00f5\5$\23"+
		"\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7\60\2\2\u00f7\u00f8\5h\65\2\u00f8\u00f9"+
		"\7\4\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00ea\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa"+
		"\u00f4\3\2\2\2\u00fb\'\3\2\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7\60\2\2"+
		"\u00fe\u00ff\5Z.\2\u00ff\u0100\7\4\2\2\u0100\u0107\3\2\2\2\u0101\u0102"+
		"\7q\2\2\u0102\u0103\7\60\2\2\u0103\u0104\5h\65\2\u0104\u0105\7\4\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u00fc\3\2\2\2\u0106\u0101\3\2\2\2\u0107)\3\2\2\2"+
		"\u0108\u0109\7\61\2\2\u0109\u010a\5Z.\2\u010a\u010b\7\62\2\2\u010b\u010c"+
		"\5Z.\2\u010c\u010d\7\63\2\2\u010d+\3\2\2\2\u010e\u010f\7\64\2\2\u010f"+
		"\u0110\5Z.\2\u0110-\3\2\2\2\u0111\u0112\7k\2\2\u0112\u0116\5\60\31\2\u0113"+
		"\u0114\7l\2\2\u0114\u0116\5\60\31\2\u0115\u0111\3\2\2\2\u0115\u0113\3"+
		"\2\2\2\u0116/\3\2\2\2\u0117\u0118\t\4\2\2\u0118\61\3\2\2\2\u0119\u011a"+
		"\78\2\2\u011a\u011b\7q\2\2\u011b\u011c\5\64\33\2\u011c\u011d\7\4\2\2\u011d"+
		"\63\3\2\2\2\u011e\u0122\79\2\2\u011f\u0121\5Z.\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7:\2\2\u0126\65\3\2\2\2\u0127\u0128"+
		"\7;\2\2\u0128\u0129\7q\2\2\u0129\u012a\7\61\2\2\u012a\u012f\7q\2\2\u012b"+
		"\u012c\7\62\2\2\u012c\u012e\5:\36\2\u012d\u012b\3\2\2\2\u012e\u0131\3"+
		"\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0133\7\63\2\2\u0133\u0134\7\16\2\2\u0134\u0135\5"+
		"8\35\2\u0135\u0136\7\17\2\2\u0136\67\3\2\2\2\u0137\u0139\5> \2\u0138\u0137"+
		"\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"9\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\5$\23\2\u013e\u013f\7q\2\2\u013f"+
		";\3\2\2\2\u0140\u0141\7<\2\2\u0141\u0142\7q\2\2\u0142\u0143\7\61\2\2\u0143"+
		"\u0148\7q\2\2\u0144\u0145\7\62\2\2\u0145\u0147\5Z.\2\u0146\u0144\3\2\2"+
		"\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b"+
		"\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7\63\2\2\u014c\u014d\7\4\2\2"+
		"\u014d=\3\2\2\2\u014e\u0159\5@!\2\u014f\u0159\5R*\2\u0150\u0159\5^\60"+
		"\2\u0151\u0159\5&\24\2\u0152\u0159\5(\25\2\u0153\u0159\5\n\6\2\u0154\u0159"+
		"\5f\64\2\u0155\u0159\5h\65\2\u0156\u0159\5\20\t\2\u0157\u0159\5\22\n\2"+
		"\u0158\u014e\3\2\2\2\u0158\u014f\3\2\2\2\u0158\u0150\3\2\2\2\u0158\u0151"+
		"\3\2\2\2\u0158\u0152\3\2\2\2\u0158\u0153\3\2\2\2\u0158\u0154\3\2\2\2\u0158"+
		"\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159?\3\2\2\2"+
		"\u015a\u0161\5D#\2\u015b\u0161\5F$\2\u015c\u0161\5J&\2\u015d\u0161\5L"+
		"\'\2\u015e\u0161\5N(\2\u015f\u0161\5P)\2\u0160\u015a\3\2\2\2\u0160\u015b"+
		"\3\2\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u015f\3\2\2\2\u0161A\3\2\2\2\u0162\u0163\b\"\1\2\u0163\u0164\7q\2\2\u0164"+
		"\u016a\3\2\2\2\u0165\u0166\f\4\2\2\u0166\u0167\7=\2\2\u0167\u0169\7q\2"+
		"\2\u0168\u0165\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016bC\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7>\2\2\u016e\u016f"+
		"\5B\"\2\u016f\u0170\7?\2\2\u0170\u0171\5Z.\2\u0171\u0172\7\4\2\2\u0172"+
		"\u017a\3\2\2\2\u0173\u0174\7>\2\2\u0174\u0175\5B\"\2\u0175\u0176\7@\2"+
		"\2\u0176\u0177\5Z.\2\u0177\u0178\7\4\2\2\u0178\u017a\3\2\2\2\u0179\u016d"+
		"\3\2\2\2\u0179\u0173\3\2\2\2\u017aE\3\2\2\2\u017b\u017c\7A\2\2\u017c\u017d"+
		"\5B\"\2\u017d\u017e\7?\2\2\u017e\u017f\5Z.\2\u017f\u0180\7\4\2\2\u0180"+
		"\u0196\3\2\2\2\u0181\u0182\7A\2\2\u0182\u0183\5B\"\2\u0183\u0184\7@\2"+
		"\2\u0184\u0185\5Z.\2\u0185\u0186\7\4\2\2\u0186\u0196\3\2\2\2\u0187\u0188"+
		"\7A\2\2\u0188\u0189\5B\"\2\u0189\u018a\7?\2\2\u018a\u018b\5Z.\2\u018b"+
		"\u018c\5H%\2\u018c\u018d\7\4\2\2\u018d\u0196\3\2\2\2\u018e\u018f\7A\2"+
		"\2\u018f\u0190\5B\"\2\u0190\u0191\7@\2\2\u0191\u0192\5Z.\2\u0192\u0193"+
		"\5H%\2\u0193\u0194\7\4\2\2\u0194\u0196\3\2\2\2\u0195\u017b\3\2\2\2\u0195"+
		"\u0181\3\2\2\2\u0195\u0187\3\2\2\2\u0195\u018e\3\2\2\2\u0196G\3\2\2\2"+
		"\u0197\u0198\7B\2\2\u0198\u0199\5Z.\2\u0199I\3\2\2\2\u019a\u019b\7\34"+
		"\2\2\u019b\u019c\5B\"\2\u019c\u019d\7?\2\2\u019d\u019e\5Z.\2\u019e\u019f"+
		"\7\4\2\2\u019f\u01a7\3\2\2\2\u01a0\u01a1\7\34\2\2\u01a1\u01a2\5B\"\2\u01a2"+
		"\u01a3\7@\2\2\u01a3\u01a4\5Z.\2\u01a4\u01a5\7\4\2\2\u01a5\u01a7\3\2\2"+
		"\2\u01a6\u019a\3\2\2\2\u01a6\u01a0\3\2\2\2\u01a7K\3\2\2\2\u01a8\u01a9"+
		"\7C\2\2\u01a9\u01aa\5B\"\2\u01aa\u01ab\7\4\2\2\u01abM\3\2\2\2\u01ac\u01ad"+
		"\7D\2\2\u01ad\u01ae\5B\"\2\u01ae\u01af\7\4\2\2\u01afO\3\2\2\2\u01b0\u01b1"+
		"\5B\"\2\u01b1\u01b2\7=\2\2\u01b2\u01b3\5\"\22\2\u01b3\u01b4\7\60\2\2\u01b4"+
		"\u01b5\5Z.\2\u01b5\u01b6\7\4\2\2\u01b6\u01bf\3\2\2\2\u01b7\u01b8\5B\""+
		"\2\u01b8\u01b9\7=\2\2\u01b9\u01ba\7q\2\2\u01ba\u01bb\7\60\2\2\u01bb\u01bc"+
		"\5Z.\2\u01bc\u01bd\7\4\2\2\u01bd\u01bf\3\2\2\2\u01be\u01b0\3\2\2\2\u01be"+
		"\u01b7\3\2\2\2\u01bfQ\3\2\2\2\u01c0\u01c4\5T+\2\u01c1\u01c3\5V,\2\u01c2"+
		"\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c9\5X-\2\u01c8\u01c7"+
		"\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9S\3\2\2\2\u01ca\u01cb\7E\2\2\u01cb\u01cc"+
		"\7\61\2\2\u01cc\u01cd\5Z.\2\u01cd\u01ce\7\63\2\2\u01ce\u01cf\7\16\2\2"+
		"\u01cf\u01d0\5`\61\2\u01d0\u01d1\7\17\2\2\u01d1U\3\2\2\2\u01d2\u01d3\7"+
		"F\2\2\u01d3\u01d4\7\61\2\2\u01d4\u01d5\5Z.\2\u01d5\u01d6\7\63\2\2\u01d6"+
		"\u01d7\7\16\2\2\u01d7\u01d8\5`\61\2\u01d8\u01d9\7\17\2\2\u01d9W\3\2\2"+
		"\2\u01da\u01db\7G\2\2\u01db\u01dc\7\16\2\2\u01dc\u01dd\5`\61\2\u01dd\u01de"+
		"\7\17\2\2\u01deY\3\2\2\2\u01df\u01e0\b.\1\2\u01e0\u01e1\t\5\2\2\u01e1"+
		"\u01f8\5Z.\33\u01e2\u01e3\7J\2\2\u01e3\u01f8\5Z.\32\u01e4\u01e5\7\61\2"+
		"\2\u01e5\u01e6\5Z.\2\u01e6\u01e7\7\63\2\2\u01e7\u01f8\3\2\2\2\u01e8\u01f8"+
		"\5j\66\2\u01e9\u01f8\5*\26\2\u01ea\u01f8\5\64\33\2\u01eb\u01f8\7q\2\2"+
		"\u01ec\u01f8\7k\2\2\u01ed\u01f8\7l\2\2\u01ee\u01f8\7m\2\2\u01ef\u01f8"+
		"\5\\/\2\u01f0\u01f8\7r\2\2\u01f1\u01f8\5.\30\2\u01f2\u01f8\5B\"\2\u01f3"+
		"\u01f4\5B\"\2\u01f4\u01f5\7=\2\2\u01f5\u01f6\5\"\22\2\u01f6\u01f8\3\2"+
		"\2\2\u01f7\u01df\3\2\2\2\u01f7\u01e2\3\2\2\2\u01f7\u01e4\3\2\2\2\u01f7"+
		"\u01e8\3\2\2\2\u01f7\u01e9\3\2\2\2\u01f7\u01ea\3\2\2\2\u01f7\u01eb\3\2"+
		"\2\2\u01f7\u01ec\3\2\2\2\u01f7\u01ed\3\2\2\2\u01f7\u01ee\3\2\2\2\u01f7"+
		"\u01ef\3\2\2\2\u01f7\u01f0\3\2\2\2\u01f7\u01f1\3\2\2\2\u01f7\u01f2\3\2"+
		"\2\2\u01f7\u01f3\3\2\2\2\u01f8\u021c\3\2\2\2\u01f9\u01fa\f\31\2\2\u01fa"+
		"\u01fb\7K\2\2\u01fb\u021b\5Z.\32\u01fc\u01fd\f\30\2\2\u01fd\u01fe\t\6"+
		"\2\2\u01fe\u021b\5Z.\31\u01ff\u0200\f\27\2\2\u0200\u0201\t\5\2\2\u0201"+
		"\u021b\5Z.\30\u0202\u0203\f\25\2\2\u0203\u0204\t\7\2\2\u0204\u021b\5Z"+
		".\26\u0205\u0206\f\24\2\2\u0206\u0207\t\b\2\2\u0207\u021b\5Z.\25\u0208"+
		"\u0209\f\23\2\2\u0209\u020a\t\t\2\2\u020a\u021b\5Z.\24\u020b\u020c\f\22"+
		"\2\2\u020c\u020d\7W\2\2\u020d\u020e\7X\2\2\u020e\u021b\5Z.\23\u020f\u0210"+
		"\f\21\2\2\u0210\u0211\7Y\2\2\u0211\u0212\7Z\2\2\u0212\u021b\5Z.\22\u0213"+
		"\u0214\f\20\2\2\u0214\u0215\7[\2\2\u0215\u0216\7Z\2\2\u0216\u021b\5Z."+
		"\21\u0217\u0218\f\17\2\2\u0218\u0219\t\n\2\2\u0219\u021b\5Z.\20\u021a"+
		"\u01f9\3\2\2\2\u021a\u01fc\3\2\2\2\u021a\u01ff\3\2\2\2\u021a\u0202\3\2"+
		"\2\2\u021a\u0205\3\2\2\2\u021a\u0208\3\2\2\2\u021a\u020b\3\2\2\2\u021a"+
		"\u020f\3\2\2\2\u021a\u0213\3\2\2\2\u021a\u0217\3\2\2\2\u021b\u021e\3\2"+
		"\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d[\3\2\2\2\u021e\u021c"+
		"\3\2\2\2\u021f\u022f\7n\2\2\u0220\u0225\7^\2\2\u0221\u0222\7k\2\2\u0222"+
		"\u0223\7k\2\2\u0223\u0226\7k\2\2\u0224\u0226\7o\2\2\u0225\u0221\3\2\2"+
		"\2\u0225\u0224\3\2\2\2\u0226\u022f\3\2\2\2\u0227\u022c\7_\2\2\u0228\u0229"+
		"\7k\2\2\u0229\u022a\7k\2\2\u022a\u022d\7k\2\2\u022b\u022d\7o\2\2\u022c"+
		"\u0228\3\2\2\2\u022c\u022b\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u021f\3\2"+
		"\2\2\u022e\u0220\3\2\2\2\u022e\u0227\3\2\2\2\u022f]\3\2\2\2\u0230\u0231"+
		"\7`\2\2\u0231\u0232\7\16\2\2\u0232\u0233\5`\61\2\u0233\u0234\7\17\2\2"+
		"\u0234\u0235\7a\2\2\u0235\u0236\7\61\2\2\u0236\u0237\5Z.\2\u0237\u0238"+
		"\7\63\2\2\u0238\u0239\7\4\2\2\u0239\u0254\3\2\2\2\u023a\u023b\7b\2\2\u023b"+
		"\u023c\5Z.\2\u023c\u023d\7c\2\2\u023d\u023e\7\16\2\2\u023e\u023f\5`\61"+
		"\2\u023f\u0240\7\17\2\2\u0240\u0254\3\2\2\2\u0241\u0242\7b\2\2\u0242\u0243"+
		"\7\61\2\2\u0243\u0244\7q\2\2\u0244\u0245\7d\2\2\u0245\u0246\5Z.\2\u0246"+
		"\u0247\7\63\2\2\u0247\u0248\7\16\2\2\u0248\u0249\5`\61\2\u0249\u024a\7"+
		"\17\2\2\u024a\u0254\3\2\2\2\u024b\u024c\7a\2\2\u024c\u024d\7\61\2\2\u024d"+
		"\u024e\5Z.\2\u024e\u024f\7\63\2\2\u024f\u0250\7\16\2\2\u0250\u0251\5`"+
		"\61\2\u0251\u0252\7\17\2\2\u0252\u0254\3\2\2\2\u0253\u0230\3\2\2\2\u0253"+
		"\u023a\3\2\2\2\u0253\u0241\3\2\2\2\u0253\u024b\3\2\2\2\u0254_\3\2\2\2"+
		"\u0255\u0257\5b\62\2\u0256\u0255\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256"+
		"\3\2\2\2\u0258\u0259\3\2\2\2\u0259a\3\2\2\2\u025a\u0258\3\2\2\2\u025b"+
		"\u026b\5@!\2\u025c\u026b\5R*\2\u025d\u026b\5^\60\2\u025e\u026b\5&\24\2"+
		"\u025f\u026b\5(\25\2\u0260\u026b\5\n\6\2\u0261\u026b\5f\64\2\u0262\u026b"+
		"\5h\65\2\u0263\u026b\5\f\7\2\u0264\u026b\5\16\b\2\u0265\u026b\5d\63\2"+
		"\u0266\u026b\5\20\t\2\u0267\u026b\5\22\n\2\u0268\u026b\5<\37\2\u0269\u026b"+
		"\5l\67\2\u026a\u025b\3\2\2\2\u026a\u025c\3\2\2\2\u026a\u025d\3\2\2\2\u026a"+
		"\u025e\3\2\2\2\u026a\u025f\3\2\2\2\u026a\u0260\3\2\2\2\u026a\u0261\3\2"+
		"\2\2\u026a\u0262\3\2\2\2\u026a\u0263\3\2\2\2\u026a\u0264\3\2\2\2\u026a"+
		"\u0265\3\2\2\2\u026a\u0266\3\2\2\2\u026a\u0267\3\2\2\2\u026a\u0268\3\2"+
		"\2\2\u026a\u0269\3\2\2\2\u026bc\3\2\2\2\u026c\u026d\7e\2\2\u026d\u026e"+
		"\7\4\2\2\u026ee\3\2\2\2\u026f\u0270\7f\2\2\u0270\u0271\7b\2\2\u0271\u0272"+
		"\7p\2\2\u0272\u0278\7\4\2\2\u0273\u0274\7f\2\2\u0274\u0275\5Z.\2\u0275"+
		"\u0276\7\4\2\2\u0276\u0278\3\2\2\2\u0277\u026f\3\2\2\2\u0277\u0273\3\2"+
		"\2\2\u0278g\3\2\2\2\u0279\u027a\7g\2\2\u027a\u027b\7r\2\2\u027b\u027c"+
		"\7\4\2\2\u027ci\3\2\2\2\u027d\u027e\7h\2\2\u027e\u027f\7i\2\2\u027f\u0280"+
		"\7p\2\2\u0280k\3\2\2\2\u0281\u0282\7j\2\2\u0282m\3\2\2\2&r\u008e\u0097"+
		"\u00b0\u00b8\u00c1\u00c9\u00d0\u00d6\u00e8\u00fa\u0106\u0115\u0122\u012f"+
		"\u013a\u0148\u0158\u0160\u016a\u0179\u0195\u01a6\u01be\u01c4\u01c8\u01f7"+
		"\u021a\u021c\u0225\u022c\u022e\u0253\u0258\u026a\u0277";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}