// Generated from yetanothercalc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link yetanothercalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface yetanothercalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link yetanothercalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(yetanothercalcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link yetanothercalcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(yetanothercalcParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link yetanothercalcParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(yetanothercalcParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPrint}
	 * labeled alternative in {@link yetanothercalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrint(yetanothercalcParser.ExprPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFrac}
	 * labeled alternative in {@link yetanothercalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFrac(yetanothercalcParser.ExprFracContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link yetanothercalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(yetanothercalcParser.ExprIdContext ctx);
}