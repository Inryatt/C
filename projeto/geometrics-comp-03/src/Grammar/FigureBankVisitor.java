// Generated from FigureBank.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FigureBankParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FigureBankVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FigureBankParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(FigureBankParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureBankParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(FigureBankParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureBankParser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigure(FigureBankParser.FigureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveProperty}
	 * labeled alternative in {@link FigureBankParser#figure_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveProperty(FigureBankParser.PrimitivePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalPrimitiveProperty}
	 * labeled alternative in {@link FigureBankParser#figure_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalPrimitiveProperty(FigureBankParser.NormalPrimitivePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentProperty}
	 * labeled alternative in {@link FigureBankParser#figure_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentProperty(FigureBankParser.AssignmentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code figureProperty}
	 * labeled alternative in {@link FigureBankParser#figure_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigureProperty(FigureBankParser.FigurePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureBankParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(FigureBankParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureBankParser#primitive_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_declaration(FigureBankParser.Primitive_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalPrimitiveDeclaration}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalPrimitiveDeclaration(FigureBankParser.NormalPrimitiveDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureBankParser#primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_type(FigureBankParser.Primitive_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pointType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointType(FigureBankParser.PointTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(FigureBankParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(FigureBankParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(FigureBankParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(FigureBankParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timeType}
	 * labeled alternative in {@link FigureBankParser#normal_primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeType(FigureBankParser.TimeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureBankParser#property_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_assignment(FigureBankParser.Property_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureBankParser#property_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_name(FigureBankParser.Property_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueInt(FigureBankParser.ValueIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueDouble}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDouble(FigureBankParser.ValueDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueBoolean}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueBoolean(FigureBankParser.ValueBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueColor}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueColor(FigureBankParser.ValueColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueHSVColor}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueHSVColor(FigureBankParser.ValueHSVColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueRGBColor}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueRGBColor(FigureBankParser.ValueRGBColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valuePoint}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuePoint(FigureBankParser.ValuePointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueMultPoints}
	 * labeled alternative in {@link FigureBankParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueMultPoints(FigureBankParser.ValueMultPointsContext ctx);
}