// Generated from testParser.g by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParserParser}.
 */
public interface testParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(testParserParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(testParserParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParserParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(testParserParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParserParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(testParserParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParserParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(testParserParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParserParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(testParserParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParserParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(testParserParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParserParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(testParserParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(testParserParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(testParserParser.ExprContext ctx);
}