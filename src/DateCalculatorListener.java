// Generated from DateCalculator.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DateCalculatorParser}.
 */
public interface DateCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DateCalculatorParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(DateCalculatorParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateCalculatorParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(DateCalculatorParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateCalculatorParser#dataCzas}.
	 * @param ctx the parse tree
	 */
	void enterDataCzas(DateCalculatorParser.DataCzasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateCalculatorParser#dataCzas}.
	 * @param ctx the parse tree
	 */
	void exitDataCzas(DateCalculatorParser.DataCzasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateCalculatorParser#przedzialCzasu}.
	 * @param ctx the parse tree
	 */
	void enterPrzedzialCzasu(DateCalculatorParser.PrzedzialCzasuContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateCalculatorParser#przedzialCzasu}.
	 * @param ctx the parse tree
	 */
	void exitPrzedzialCzasu(DateCalculatorParser.PrzedzialCzasuContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateCalculatorParser#operation2}.
	 * @param ctx the parse tree
	 */
	void enterOperation2(DateCalculatorParser.Operation2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DateCalculatorParser#operation2}.
	 * @param ctx the parse tree
	 */
	void exitOperation2(DateCalculatorParser.Operation2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DateCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DateCalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DateCalculatorParser.ExpressionContext ctx);
}