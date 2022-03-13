// Generated from Geometrics.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GeometricsParser}.
 */
public interface GeometricsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GeometricsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GeometricsParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#grammar_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGrammar_declaration(GeometricsParser.Grammar_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#grammar_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGrammar_declaration(GeometricsParser.Grammar_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(GeometricsParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(GeometricsParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadBank}
	 * labeled alternative in {@link GeometricsParser#load_bank}.
	 * @param ctx the parse tree
	 */
	void enterLoadBank(GeometricsParser.LoadBankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadBank}
	 * labeled alternative in {@link GeometricsParser#load_bank}.
	 * @param ctx the parse tree
	 */
	void exitLoadBank(GeometricsParser.LoadBankContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#render}.
	 * @param ctx the parse tree
	 */
	void enterRender(GeometricsParser.RenderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#render}.
	 * @param ctx the parse tree
	 */
	void exitRender(GeometricsParser.RenderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#create_instance}.
	 * @param ctx the parse tree
	 */
	void enterCreate_instance(GeometricsParser.Create_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#create_instance}.
	 * @param ctx the parse tree
	 */
	void exitCreate_instance(GeometricsParser.Create_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#destroy_instance}.
	 * @param ctx the parse tree
	 */
	void enterDestroy_instance(GeometricsParser.Destroy_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#destroy_instance}.
	 * @param ctx the parse tree
	 */
	void exitDestroy_instance(GeometricsParser.Destroy_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#set_frame_rate}.
	 * @param ctx the parse tree
	 */
	void enterSet_frame_rate(GeometricsParser.Set_frame_rateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#set_frame_rate}.
	 * @param ctx the parse tree
	 */
	void exitSet_frame_rate(GeometricsParser.Set_frame_rateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#canvas_size}.
	 * @param ctx the parse tree
	 */
	void enterCanvas_size(GeometricsParser.Canvas_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#canvas_size}.
	 * @param ctx the parse tree
	 */
	void exitCanvas_size(GeometricsParser.Canvas_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#instantiate_figure}.
	 * @param ctx the parse tree
	 */
	void enterInstantiate_figure(GeometricsParser.Instantiate_figureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#instantiate_figure}.
	 * @param ctx the parse tree
	 */
	void exitInstantiate_figure(GeometricsParser.Instantiate_figureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#figure_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFigure_declaration(GeometricsParser.Figure_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#figure_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFigure_declaration(GeometricsParser.Figure_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code figureDeclarePrimitiveFigure}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void enterFigureDeclarePrimitiveFigure(GeometricsParser.FigureDeclarePrimitiveFigureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code figureDeclarePrimitiveFigure}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void exitFigureDeclarePrimitiveFigure(GeometricsParser.FigureDeclarePrimitiveFigureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code figureDeclarePrimitive}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void enterFigureDeclarePrimitive(GeometricsParser.FigureDeclarePrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code figureDeclarePrimitive}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void exitFigureDeclarePrimitive(GeometricsParser.FigureDeclarePrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code figureInstanciateFigure}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void enterFigureInstanciateFigure(GeometricsParser.FigureInstanciateFigureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code figureInstanciateFigure}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void exitFigureInstanciateFigure(GeometricsParser.FigureInstanciateFigureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code figureChangeInstanceProperty}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void enterFigureChangeInstanceProperty(GeometricsParser.FigureChangeInstancePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code figureChangeInstanceProperty}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void exitFigureChangeInstanceProperty(GeometricsParser.FigureChangeInstancePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code figurePropertyAssignment}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void enterFigurePropertyAssignment(GeometricsParser.FigurePropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code figurePropertyAssignment}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void exitFigurePropertyAssignment(GeometricsParser.FigurePropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#primitive_figure_type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_figure_type(GeometricsParser.Primitive_figure_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#primitive_figure_type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_figure_type(GeometricsParser.Primitive_figure_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#primitive_figure_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_figure_declaration(GeometricsParser.Primitive_figure_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#primitive_figure_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_figure_declaration(GeometricsParser.Primitive_figure_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#primitive_figure_block}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_figure_block(GeometricsParser.Primitive_figure_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#primitive_figure_block}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_figure_block(GeometricsParser.Primitive_figure_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#property_assignment}.
	 * @param ctx the parse tree
	 */
	void enterProperty_assignment(GeometricsParser.Property_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#property_assignment}.
	 * @param ctx the parse tree
	 */
	void exitProperty_assignment(GeometricsParser.Property_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#property_name}.
	 * @param ctx the parse tree
	 */
	void enterProperty_name(GeometricsParser.Property_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#property_name}.
	 * @param ctx the parse tree
	 */
	void exitProperty_name(GeometricsParser.Property_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pointType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterPointType(GeometricsParser.PointTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pointType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitPointType(GeometricsParser.PointTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(GeometricsParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(GeometricsParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(GeometricsParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(GeometricsParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterStringType(GeometricsParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitStringType(GeometricsParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(GeometricsParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(GeometricsParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterTimeType(GeometricsParser.TimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitTimeType(GeometricsParser.TimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalPrimitiveDeclaration}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalPrimitiveDeclaration(GeometricsParser.NormalPrimitiveDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalPrimitiveDeclaration}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalPrimitiveDeclaration(GeometricsParser.NormalPrimitiveDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalPrimitiveDeclarationAssignment}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalPrimitiveDeclarationAssignment(GeometricsParser.NormalPrimitiveDeclarationAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalPrimitiveDeclarationAssignment}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalPrimitiveDeclarationAssignment(GeometricsParser.NormalPrimitiveDeclarationAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalPrimitiveDeclarationAssignmentInput}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalPrimitiveDeclarationAssignmentInput(GeometricsParser.NormalPrimitiveDeclarationAssignmentInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalPrimitiveDeclarationAssignmentInput}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalPrimitiveDeclarationAssignmentInput(GeometricsParser.NormalPrimitiveDeclarationAssignmentInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignValue}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignValue(GeometricsParser.AssignValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignValue}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignValue(GeometricsParser.AssignValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignInput}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignInput(GeometricsParser.AssignInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignInput}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignInput(GeometricsParser.AssignInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalPoint}
	 * labeled alternative in {@link GeometricsParser#point}.
	 * @param ctx the parse tree
	 */
	void enterLiteralPoint(GeometricsParser.LiteralPointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalPoint}
	 * labeled alternative in {@link GeometricsParser#point}.
	 * @param ctx the parse tree
	 */
	void exitLiteralPoint(GeometricsParser.LiteralPointContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(GeometricsParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(GeometricsParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(GeometricsParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(GeometricsParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#time_unit}.
	 * @param ctx the parse tree
	 */
	void enterTime_unit(GeometricsParser.Time_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#time_unit}.
	 * @param ctx the parse tree
	 */
	void exitTime_unit(GeometricsParser.Time_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#create_group}.
	 * @param ctx the parse tree
	 */
	void enterCreate_group(GeometricsParser.Create_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#create_group}.
	 * @param ctx the parse tree
	 */
	void exitCreate_group(GeometricsParser.Create_groupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code groupEntities}
	 * labeled alternative in {@link GeometricsParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroupEntities(GeometricsParser.GroupEntitiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code groupEntities}
	 * labeled alternative in {@link GeometricsParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroupEntities(GeometricsParser.GroupEntitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#animation}.
	 * @param ctx the parse tree
	 */
	void enterAnimation(GeometricsParser.AnimationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#animation}.
	 * @param ctx the parse tree
	 */
	void exitAnimation(GeometricsParser.AnimationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#animation_block}.
	 * @param ctx the parse tree
	 */
	void enterAnimation_block(GeometricsParser.Animation_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#animation_block}.
	 * @param ctx the parse tree
	 */
	void exitAnimation_block(GeometricsParser.Animation_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#argument_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArgument_declaration(GeometricsParser.Argument_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#argument_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArgument_declaration(GeometricsParser.Argument_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#animate}.
	 * @param ctx the parse tree
	 */
	void enterAnimate(GeometricsParser.AnimateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#animate}.
	 * @param ctx the parse tree
	 */
	void exitAnimate(GeometricsParser.AnimateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#animation_statments}.
	 * @param ctx the parse tree
	 */
	void enterAnimation_statments(GeometricsParser.Animation_statmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#animation_statments}.
	 * @param ctx the parse tree
	 */
	void exitAnimation_statments(GeometricsParser.Animation_statmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#figure_operation}.
	 * @param ctx the parse tree
	 */
	void enterFigure_operation(GeometricsParser.Figure_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#figure_operation}.
	 * @param ctx the parse tree
	 */
	void exitFigure_operation(GeometricsParser.Figure_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code figureLabelChain}
	 * labeled alternative in {@link GeometricsParser#figure_label}.
	 * @param ctx the parse tree
	 */
	void enterFigureLabelChain(GeometricsParser.FigureLabelChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code figureLabelChain}
	 * labeled alternative in {@link GeometricsParser#figure_label}.
	 * @param ctx the parse tree
	 */
	void exitFigureLabelChain(GeometricsParser.FigureLabelChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code figureLabelBase}
	 * labeled alternative in {@link GeometricsParser#figure_label}.
	 * @param ctx the parse tree
	 */
	void enterFigureLabelBase(GeometricsParser.FigureLabelBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code figureLabelBase}
	 * labeled alternative in {@link GeometricsParser#figure_label}.
	 * @param ctx the parse tree
	 */
	void exitFigureLabelBase(GeometricsParser.FigureLabelBaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moveBy}
	 * labeled alternative in {@link GeometricsParser#move_figure}.
	 * @param ctx the parse tree
	 */
	void enterMoveBy(GeometricsParser.MoveByContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moveBy}
	 * labeled alternative in {@link GeometricsParser#move_figure}.
	 * @param ctx the parse tree
	 */
	void exitMoveBy(GeometricsParser.MoveByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moveTo}
	 * labeled alternative in {@link GeometricsParser#move_figure}.
	 * @param ctx the parse tree
	 */
	void enterMoveTo(GeometricsParser.MoveToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moveTo}
	 * labeled alternative in {@link GeometricsParser#move_figure}.
	 * @param ctx the parse tree
	 */
	void exitMoveTo(GeometricsParser.MoveToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rotateBy}
	 * labeled alternative in {@link GeometricsParser#rotate_figure}.
	 * @param ctx the parse tree
	 */
	void enterRotateBy(GeometricsParser.RotateByContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rotateBy}
	 * labeled alternative in {@link GeometricsParser#rotate_figure}.
	 * @param ctx the parse tree
	 */
	void exitRotateBy(GeometricsParser.RotateByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rotateTo}
	 * labeled alternative in {@link GeometricsParser#rotate_figure}.
	 * @param ctx the parse tree
	 */
	void enterRotateTo(GeometricsParser.RotateToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rotateTo}
	 * labeled alternative in {@link GeometricsParser#rotate_figure}.
	 * @param ctx the parse tree
	 */
	void exitRotateTo(GeometricsParser.RotateToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rotateByAround}
	 * labeled alternative in {@link GeometricsParser#rotate_figure}.
	 * @param ctx the parse tree
	 */
	void enterRotateByAround(GeometricsParser.RotateByAroundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rotateByAround}
	 * labeled alternative in {@link GeometricsParser#rotate_figure}.
	 * @param ctx the parse tree
	 */
	void exitRotateByAround(GeometricsParser.RotateByAroundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rotateToAround}
	 * labeled alternative in {@link GeometricsParser#rotate_figure}.
	 * @param ctx the parse tree
	 */
	void enterRotateToAround(GeometricsParser.RotateToAroundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rotateToAround}
	 * labeled alternative in {@link GeometricsParser#rotate_figure}.
	 * @param ctx the parse tree
	 */
	void exitRotateToAround(GeometricsParser.RotateToAroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#rotate_around}.
	 * @param ctx the parse tree
	 */
	void enterRotate_around(GeometricsParser.Rotate_aroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#rotate_around}.
	 * @param ctx the parse tree
	 */
	void exitRotate_around(GeometricsParser.Rotate_aroundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scaleBy}
	 * labeled alternative in {@link GeometricsParser#scale_figure}.
	 * @param ctx the parse tree
	 */
	void enterScaleBy(GeometricsParser.ScaleByContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scaleBy}
	 * labeled alternative in {@link GeometricsParser#scale_figure}.
	 * @param ctx the parse tree
	 */
	void exitScaleBy(GeometricsParser.ScaleByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scaleTo}
	 * labeled alternative in {@link GeometricsParser#scale_figure}.
	 * @param ctx the parse tree
	 */
	void enterScaleTo(GeometricsParser.ScaleToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scaleTo}
	 * labeled alternative in {@link GeometricsParser#scale_figure}.
	 * @param ctx the parse tree
	 */
	void exitScaleTo(GeometricsParser.ScaleToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hideFigure}
	 * labeled alternative in {@link GeometricsParser#hide_figure}.
	 * @param ctx the parse tree
	 */
	void enterHideFigure(GeometricsParser.HideFigureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hideFigure}
	 * labeled alternative in {@link GeometricsParser#hide_figure}.
	 * @param ctx the parse tree
	 */
	void exitHideFigure(GeometricsParser.HideFigureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFigure}
	 * labeled alternative in {@link GeometricsParser#show_figure}.
	 * @param ctx the parse tree
	 */
	void enterShowFigure(GeometricsParser.ShowFigureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFigure}
	 * labeled alternative in {@link GeometricsParser#show_figure}.
	 * @param ctx the parse tree
	 */
	void exitShowFigure(GeometricsParser.ShowFigureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code changeProperty}
	 * labeled alternative in {@link GeometricsParser#change_property}.
	 * @param ctx the parse tree
	 */
	void enterChangeProperty(GeometricsParser.ChangePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code changeProperty}
	 * labeled alternative in {@link GeometricsParser#change_property}.
	 * @param ctx the parse tree
	 */
	void exitChangeProperty(GeometricsParser.ChangePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code changePrimitive}
	 * labeled alternative in {@link GeometricsParser#change_property}.
	 * @param ctx the parse tree
	 */
	void enterChangePrimitive(GeometricsParser.ChangePrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code changePrimitive}
	 * labeled alternative in {@link GeometricsParser#change_property}.
	 * @param ctx the parse tree
	 */
	void exitChangePrimitive(GeometricsParser.ChangePrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#cond_statement}.
	 * @param ctx the parse tree
	 */
	void enterCond_statement(GeometricsParser.Cond_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#cond_statement}.
	 * @param ctx the parse tree
	 */
	void exitCond_statement(GeometricsParser.Cond_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GeometricsParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GeometricsParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GeometricsParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GeometricsParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseIfStatement}
	 * labeled alternative in {@link GeometricsParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(GeometricsParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseIfStatement}
	 * labeled alternative in {@link GeometricsParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(GeometricsParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseStatment}
	 * labeled alternative in {@link GeometricsParser#else_statment}.
	 * @param ctx the parse tree
	 */
	void enterElseStatment(GeometricsParser.ElseStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseStatment}
	 * labeled alternative in {@link GeometricsParser#else_statment}.
	 * @param ctx the parse tree
	 */
	void exitElseStatment(GeometricsParser.ElseStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprInt}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInt(GeometricsParser.ExprIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprInt}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInt(GeometricsParser.ExprIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolean}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolean(GeometricsParser.ExprBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolean}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolean(GeometricsParser.ExprBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(GeometricsParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(GeometricsParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprUnary}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(GeometricsParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprUnary}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(GeometricsParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setLogic}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSetLogic(GeometricsParser.SetLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setLogic}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSetLogic(GeometricsParser.SetLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprParentisis}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParentisis(GeometricsParser.ExprParentisisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprParentisis}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParentisis(GeometricsParser.ExprParentisisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDouble}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDouble(GeometricsParser.ExprDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDouble}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDouble(GeometricsParser.ExprDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLabel}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLabel(GeometricsParser.ExprLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLabel}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLabel(GeometricsParser.ExprLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collisionJust}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCollisionJust(GeometricsParser.CollisionJustContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collisionJust}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCollisionJust(GeometricsParser.CollisionJustContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprGreaterLesser}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprGreaterLesser(GeometricsParser.ExprGreaterLesserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprGreaterLesser}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprGreaterLesser(GeometricsParser.ExprGreaterLesserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNegation}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNegation(GeometricsParser.ExprNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNegation}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNegation(GeometricsParser.ExprNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprColor}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprColor(GeometricsParser.ExprColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprColor}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprColor(GeometricsParser.ExprColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFigureProperty}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFigureProperty(GeometricsParser.ExprFigurePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFigureProperty}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFigureProperty(GeometricsParser.ExprFigurePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMultDivRem}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivRem(GeometricsParser.ExprMultDivRemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMultDivRem}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivRem(GeometricsParser.ExprMultDivRemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keyPressed}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterKeyPressed(GeometricsParser.KeyPressedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keyPressed}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitKeyPressed(GeometricsParser.KeyPressedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprGroup}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprGroup(GeometricsParser.ExprGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprGroup}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprGroup(GeometricsParser.ExprGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEquality}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprEquality(GeometricsParser.ExprEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEquality}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprEquality(GeometricsParser.ExprEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTime}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTime(GeometricsParser.ExprTimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTime}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTime(GeometricsParser.ExprTimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPoint}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPoint(GeometricsParser.ExprPointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPoint}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPoint(GeometricsParser.ExprPointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collisionIs}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCollisionIs(GeometricsParser.CollisionIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collisionIs}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCollisionIs(GeometricsParser.CollisionIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAndOr}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAndOr(GeometricsParser.ExprAndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAndOr}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAndOr(GeometricsParser.ExprAndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprString}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(GeometricsParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprString}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(GeometricsParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFigure}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFigure(GeometricsParser.ExprFigureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFigure}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFigure(GeometricsParser.ExprFigureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPower}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPower(GeometricsParser.ExprPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPower}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPower(GeometricsParser.ExprPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collisionStop}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCollisionStop(GeometricsParser.CollisionStopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collisionStop}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCollisionStop(GeometricsParser.CollisionStopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colorNormal}
	 * labeled alternative in {@link GeometricsParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColorNormal(GeometricsParser.ColorNormalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colorNormal}
	 * labeled alternative in {@link GeometricsParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColorNormal(GeometricsParser.ColorNormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colorHSV}
	 * labeled alternative in {@link GeometricsParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColorHSV(GeometricsParser.ColorHSVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colorHSV}
	 * labeled alternative in {@link GeometricsParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColorHSV(GeometricsParser.ColorHSVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colorRGB}
	 * labeled alternative in {@link GeometricsParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColorRGB(GeometricsParser.ColorRGBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colorRGB}
	 * labeled alternative in {@link GeometricsParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColorRGB(GeometricsParser.ColorRGBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhile}
	 * labeled alternative in {@link GeometricsParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(GeometricsParser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhile}
	 * labeled alternative in {@link GeometricsParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(GeometricsParser.DoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forTimes}
	 * labeled alternative in {@link GeometricsParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterForTimes(GeometricsParser.ForTimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forTimes}
	 * labeled alternative in {@link GeometricsParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitForTimes(GeometricsParser.ForTimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forIn}
	 * labeled alternative in {@link GeometricsParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterForIn(GeometricsParser.ForInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forIn}
	 * labeled alternative in {@link GeometricsParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitForIn(GeometricsParser.ForInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileCondition}
	 * labeled alternative in {@link GeometricsParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileCondition(GeometricsParser.WhileConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileCondition}
	 * labeled alternative in {@link GeometricsParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileCondition(GeometricsParser.WhileConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(GeometricsParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(GeometricsParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#valid_statments}.
	 * @param ctx the parse tree
	 */
	void enterValid_statments(GeometricsParser.Valid_statmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#valid_statments}.
	 * @param ctx the parse tree
	 */
	void exitValid_statments(GeometricsParser.Valid_statmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometricsParser#breakInLoop}.
	 * @param ctx the parse tree
	 */
	void enterBreakInLoop(GeometricsParser.BreakInLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometricsParser#breakInLoop}.
	 * @param ctx the parse tree
	 */
	void exitBreakInLoop(GeometricsParser.BreakInLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code waitCommand}
	 * labeled alternative in {@link GeometricsParser#wait_for_key}.
	 * @param ctx the parse tree
	 */
	void enterWaitCommand(GeometricsParser.WaitCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code waitCommand}
	 * labeled alternative in {@link GeometricsParser#wait_for_key}.
	 * @param ctx the parse tree
	 */
	void exitWaitCommand(GeometricsParser.WaitCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code waitTime}
	 * labeled alternative in {@link GeometricsParser#wait_for_key}.
	 * @param ctx the parse tree
	 */
	void enterWaitTime(GeometricsParser.WaitTimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code waitTime}
	 * labeled alternative in {@link GeometricsParser#wait_for_key}.
	 * @param ctx the parse tree
	 */
	void exitWaitTime(GeometricsParser.WaitTimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputCommand}
	 * labeled alternative in {@link GeometricsParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInputCommand(GeometricsParser.InputCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputCommand}
	 * labeled alternative in {@link GeometricsParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInputCommand(GeometricsParser.InputCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keyPressedMethod}
	 * labeled alternative in {@link GeometricsParser#key_pressed}.
	 * @param ctx the parse tree
	 */
	void enterKeyPressedMethod(GeometricsParser.KeyPressedMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keyPressedMethod}
	 * labeled alternative in {@link GeometricsParser#key_pressed}.
	 * @param ctx the parse tree
	 */
	void exitKeyPressedMethod(GeometricsParser.KeyPressedMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PewCommand}
	 * labeled alternative in {@link GeometricsParser#pew}.
	 * @param ctx the parse tree
	 */
	void enterPewCommand(GeometricsParser.PewCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PewCommand}
	 * labeled alternative in {@link GeometricsParser#pew}.
	 * @param ctx the parse tree
	 */
	void exitPewCommand(GeometricsParser.PewCommandContext ctx);
}