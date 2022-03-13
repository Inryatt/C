// Generated from Geometrics.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GeometricsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GeometricsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GeometricsParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#grammar_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammar_declaration(GeometricsParser.Grammar_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(GeometricsParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadBank}
	 * labeled alternative in {@link GeometricsParser#load_bank}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadBank(GeometricsParser.LoadBankContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#render}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRender(GeometricsParser.RenderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#create_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_instance(GeometricsParser.Create_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#destroy_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestroy_instance(GeometricsParser.Destroy_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#set_frame_rate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_frame_rate(GeometricsParser.Set_frame_rateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#canvas_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanvas_size(GeometricsParser.Canvas_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#instantiate_figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiate_figure(GeometricsParser.Instantiate_figureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#figure_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigure_declaration(GeometricsParser.Figure_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code figureDeclarePrimitiveFigure}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigureDeclarePrimitiveFigure(GeometricsParser.FigureDeclarePrimitiveFigureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code figureDeclarePrimitive}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigureDeclarePrimitive(GeometricsParser.FigureDeclarePrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code figureInstanciateFigure}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigureInstanciateFigure(GeometricsParser.FigureInstanciateFigureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code figureChangeInstanceProperty}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigureChangeInstanceProperty(GeometricsParser.FigureChangeInstancePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code figurePropertyAssignment}
	 * labeled alternative in {@link GeometricsParser#figure_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigurePropertyAssignment(GeometricsParser.FigurePropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#primitive_figure_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_figure_type(GeometricsParser.Primitive_figure_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#primitive_figure_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_figure_declaration(GeometricsParser.Primitive_figure_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#primitive_figure_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_figure_block(GeometricsParser.Primitive_figure_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#property_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_assignment(GeometricsParser.Property_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#property_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_name(GeometricsParser.Property_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pointType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointType(GeometricsParser.PointTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(GeometricsParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(GeometricsParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(GeometricsParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(GeometricsParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timeType}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeType(GeometricsParser.TimeTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalPrimitiveDeclaration}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalPrimitiveDeclaration(GeometricsParser.NormalPrimitiveDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalPrimitiveDeclarationAssignment}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalPrimitiveDeclarationAssignment(GeometricsParser.NormalPrimitiveDeclarationAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalPrimitiveDeclarationAssignmentInput}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalPrimitiveDeclarationAssignmentInput(GeometricsParser.NormalPrimitiveDeclarationAssignmentInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignValue}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignValue(GeometricsParser.AssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignInput}
	 * labeled alternative in {@link GeometricsParser#normal_primitive_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignInput(GeometricsParser.AssignInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalPoint}
	 * labeled alternative in {@link GeometricsParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralPoint(GeometricsParser.LiteralPointContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(GeometricsParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(GeometricsParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#time_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_unit(GeometricsParser.Time_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#create_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_group(GeometricsParser.Create_groupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupEntities}
	 * labeled alternative in {@link GeometricsParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupEntities(GeometricsParser.GroupEntitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#animation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimation(GeometricsParser.AnimationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#animation_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimation_block(GeometricsParser.Animation_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#argument_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_declaration(GeometricsParser.Argument_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#animate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimate(GeometricsParser.AnimateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#animation_statments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimation_statments(GeometricsParser.Animation_statmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#figure_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigure_operation(GeometricsParser.Figure_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code figureLabelChain}
	 * labeled alternative in {@link GeometricsParser#figure_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigureLabelChain(GeometricsParser.FigureLabelChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code figureLabelBase}
	 * labeled alternative in {@link GeometricsParser#figure_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigureLabelBase(GeometricsParser.FigureLabelBaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveBy}
	 * labeled alternative in {@link GeometricsParser#move_figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveBy(GeometricsParser.MoveByContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveTo}
	 * labeled alternative in {@link GeometricsParser#move_figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveTo(GeometricsParser.MoveToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rotateBy}
	 * labeled alternative in {@link GeometricsParser#rotate_figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotateBy(GeometricsParser.RotateByContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rotateTo}
	 * labeled alternative in {@link GeometricsParser#rotate_figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotateTo(GeometricsParser.RotateToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rotateByAround}
	 * labeled alternative in {@link GeometricsParser#rotate_figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotateByAround(GeometricsParser.RotateByAroundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rotateToAround}
	 * labeled alternative in {@link GeometricsParser#rotate_figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotateToAround(GeometricsParser.RotateToAroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#rotate_around}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotate_around(GeometricsParser.Rotate_aroundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scaleBy}
	 * labeled alternative in {@link GeometricsParser#scale_figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleBy(GeometricsParser.ScaleByContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scaleTo}
	 * labeled alternative in {@link GeometricsParser#scale_figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleTo(GeometricsParser.ScaleToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hideFigure}
	 * labeled alternative in {@link GeometricsParser#hide_figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHideFigure(GeometricsParser.HideFigureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFigure}
	 * labeled alternative in {@link GeometricsParser#show_figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFigure(GeometricsParser.ShowFigureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code changeProperty}
	 * labeled alternative in {@link GeometricsParser#change_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeProperty(GeometricsParser.ChangePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code changePrimitive}
	 * labeled alternative in {@link GeometricsParser#change_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangePrimitive(GeometricsParser.ChangePrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#cond_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_statement(GeometricsParser.Cond_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GeometricsParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GeometricsParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseIfStatement}
	 * labeled alternative in {@link GeometricsParser#else_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(GeometricsParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseStatment}
	 * labeled alternative in {@link GeometricsParser#else_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatment(GeometricsParser.ElseStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprInt}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInt(GeometricsParser.ExprIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolean}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolean(GeometricsParser.ExprBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(GeometricsParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprUnary}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(GeometricsParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setLogic}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetLogic(GeometricsParser.SetLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprParentisis}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParentisis(GeometricsParser.ExprParentisisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDouble}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDouble(GeometricsParser.ExprDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLabel}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLabel(GeometricsParser.ExprLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collisionJust}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollisionJust(GeometricsParser.CollisionJustContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprGreaterLesser}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGreaterLesser(GeometricsParser.ExprGreaterLesserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNegation}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNegation(GeometricsParser.ExprNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprColor}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprColor(GeometricsParser.ExprColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFigureProperty}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFigureProperty(GeometricsParser.ExprFigurePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMultDivRem}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivRem(GeometricsParser.ExprMultDivRemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keyPressed}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyPressed(GeometricsParser.KeyPressedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprGroup}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGroup(GeometricsParser.ExprGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEquality}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEquality(GeometricsParser.ExprEqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTime}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTime(GeometricsParser.ExprTimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPoint}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPoint(GeometricsParser.ExprPointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collisionIs}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollisionIs(GeometricsParser.CollisionIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAndOr}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAndOr(GeometricsParser.ExprAndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprString}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(GeometricsParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFigure}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFigure(GeometricsParser.ExprFigureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPower}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPower(GeometricsParser.ExprPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collisionStop}
	 * labeled alternative in {@link GeometricsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollisionStop(GeometricsParser.CollisionStopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colorNormal}
	 * labeled alternative in {@link GeometricsParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorNormal(GeometricsParser.ColorNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colorHSV}
	 * labeled alternative in {@link GeometricsParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorHSV(GeometricsParser.ColorHSVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colorRGB}
	 * labeled alternative in {@link GeometricsParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorRGB(GeometricsParser.ColorRGBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhile}
	 * labeled alternative in {@link GeometricsParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(GeometricsParser.DoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forTimes}
	 * labeled alternative in {@link GeometricsParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForTimes(GeometricsParser.ForTimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forIn}
	 * labeled alternative in {@link GeometricsParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIn(GeometricsParser.ForInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileCondition}
	 * labeled alternative in {@link GeometricsParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCondition(GeometricsParser.WhileConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(GeometricsParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#valid_statments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValid_statments(GeometricsParser.Valid_statmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometricsParser#breakInLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakInLoop(GeometricsParser.BreakInLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code waitCommand}
	 * labeled alternative in {@link GeometricsParser#wait_for_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitCommand(GeometricsParser.WaitCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code waitTime}
	 * labeled alternative in {@link GeometricsParser#wait_for_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitTime(GeometricsParser.WaitTimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputCommand}
	 * labeled alternative in {@link GeometricsParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputCommand(GeometricsParser.InputCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keyPressedMethod}
	 * labeled alternative in {@link GeometricsParser#key_pressed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyPressedMethod(GeometricsParser.KeyPressedMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PewCommand}
	 * labeled alternative in {@link GeometricsParser#pew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPewCommand(GeometricsParser.PewCommandContext ctx);
}