// Generated from yetanothercalc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link yetanothercalcParser}.
 */
public interface yetanothercalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link yetanothercalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(yetanothercalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link yetanothercalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(yetanothercalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link yetanothercalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(yetanothercalcParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link yetanothercalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(yetanothercalcParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link yetanothercalcParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(yetanothercalcParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link yetanothercalcParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(yetanothercalcParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPrint}
	 * labeled alternative in {@link yetanothercalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPrint(yetanothercalcParser.ExprPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPrint}
	 * labeled alternative in {@link yetanothercalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPrint(yetanothercalcParser.ExprPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFrac}
	 * labeled alternative in {@link yetanothercalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFrac(yetanothercalcParser.ExprFracContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFrac}
	 * labeled alternative in {@link yetanothercalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFrac(yetanothercalcParser.ExprFracContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link yetanothercalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(yetanothercalcParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link yetanothercalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(yetanothercalcParser.ExprIdContext ctx);
}