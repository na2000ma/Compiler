// Generated from D:/Compiler/src\Parserp.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parserp}.
 */
public interface ParserpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parserp#pages}.
	 * @param ctx the parse tree
	 */
	void enterPages(Parserp.PagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parserp#pages}.
	 * @param ctx the parse tree
	 */
	void exitPages(Parserp.PagesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parserp#def_controller}.
	 * @param ctx the parse tree
	 */
	void enterDef_controller(Parserp.Def_controllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parserp#def_controller}.
	 * @param ctx the parse tree
	 */
	void exitDef_controller(Parserp.Def_controllerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parserp#def_page}.
	 * @param ctx the parse tree
	 */
	void enterDef_page(Parserp.Def_pageContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parserp#def_page}.
	 * @param ctx the parse tree
	 */
	void exitDef_page(Parserp.Def_pageContext ctx);
}