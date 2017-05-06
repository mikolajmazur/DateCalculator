// Generated from DateCalculator.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DateCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DateCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DateCalculatorParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(DateCalculatorParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateCalculatorParser#dataCzas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataCzas(DateCalculatorParser.DataCzasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateCalculatorParser#przedzialCzasu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrzedzialCzasu(DateCalculatorParser.PrzedzialCzasuContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateCalculatorParser#operation2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation2(DateCalculatorParser.Operation2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DateCalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DateCalculatorParser.ExpressionContext ctx);
}