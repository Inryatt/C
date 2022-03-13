// Generated from FigureBank.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FigureBankParser}.
 */
public interface FigureBankListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FigureBankParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(FigureBankParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FigureBankParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(FigureBankParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FigureBankParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(FigureBankParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FigureBankParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(FigureBankParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FigureBankParser#figure}.
	 * @param ctx the parse tree
	 */
	void enterFigure(FigureBankParser.FigureContext ctx);
	/**
	 * Exit a parse tree produced by {@link FigureBankParser#figure}.
	 * @param ctx the parse tree
	 */
	void exitFigure(FigureBankParser.FigureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveProperty}
	 * labeled alternative in {@link FigureBankParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveProperty(FigureBankParser.PrimitivePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveProperty}
	 * labeled alternative in {@link FigureBankParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveProperty(FigureBankParser.PrimitivePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalPrimitiveProperty}
	 * labeled alternative in {@link FigureBankParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void enterNormalPrimitiveProperty(FigureBankParser.NormalPrimitivePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalPrimitiveProperty}
	 * labeled alternative in {@link FigureBankParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void exitNormalPrimitiveProperty(FigureBankParser.NormalPrimitivePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentProperty}
	 * labeled alternative in {@link FigureBankParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentProperty(FigureBankParser.AssignmentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentProperty}
	 * labeled alternative in {@link FigureBankParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentProperty(FigureBankParser.AssignmentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code figureProperty}
	 * labeled alternative in {@link FigureBankParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void enterFigureProperty(FigureBankParser.FigurePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code figureProperty}
	 * labeled alternative in {@link FigureBankParser#figure_properties}.
	 * @param ctx the parse tree
	 */
	void exitFigureProperty(FigureBankParser.FigurePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FigureBankParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(FigureBankParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link FigureBankParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(FigureBankParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link FigureBankParser#primitive_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_declaration(FigureBankParser.Primitive_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FigureBankParser#primitive_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_declaration(FigureBankParser.Primitive_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalPrimitiveDeclaration}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalPrimitiveDeclaration(FigureBankParser.NormalPrimitiveDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalPrimitiveDeclaration}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalPrimitiveDeclaration(FigureBankParser.NormalPrimitiveDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FigureBankParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_type(FigureBankParser.Primitive_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FigureBankParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_type(FigureBankParser.Primitive_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pointType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterPointType(FigureBankParser.PointTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pointType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitPointType(FigureBankParser.PointTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(FigureBankParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(FigureBankParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(FigureBankParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(FigureBankParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterStringType(FigureBankParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitStringType(FigureBankParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(FigureBankParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(FigureBankParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterTimeType(FigureBankParser.TimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitTimeType(FigureBankParser.TimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FigureBankParser#property_assignment}.
	 * @param ctx the parse tree
	 */
	void enterProperty_assignment(FigureBankParser.Property_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FigureBankParser#property_assignment}.
	 * @param ctx the parse tree
	 */
	void exitProperty_assignment(FigureBankParser.Property_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FigureBankParser#property_name}.
	 * @param ctx the parse tree
	 */
	void enterProperty_name(FigureBankParser.Property_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FigureBankParser#property_name}.
	 * @param ctx the parse tree
	 */
	void exitProperty_name(FigureBankParser.Property_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueInt(FigureBankParser.ValueIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueInt(FigureBankParser.ValueIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueDouble}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueDouble(FigureBankParser.ValueDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueDouble}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueDouble(FigureBankParser.ValueDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueBoolean}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueBoolean(FigureBankParser.ValueBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueBoolean}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueBoolean(FigureBankParser.ValueBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueColor}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueColor(FigureBankParser.ValueColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueColor}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueColor(FigureBankParser.ValueColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueHSVColor}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueHSVColor(FigureBankParser.ValueHSVColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueHSVColor}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueHSVColor(FigureBankParser.ValueHSVColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueRGBColor}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueRGBColor(FigureBankParser.ValueRGBColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueRGBColor}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueRGBColor(FigureBankParser.ValueRGBColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valuePoint}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValuePoint(FigureBankParser.ValuePointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valuePoint}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValuePoint(FigureBankParser.ValuePointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueMultPoints}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueMultPoints(FigureBankParser.ValueMultPointsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueMultPoints}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueMultPoints(FigureBankParser.ValueMultPointsContext ctx);
}