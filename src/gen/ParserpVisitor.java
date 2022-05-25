// Generated from D:/Compiler/src\Parserp.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parserp}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parserp#pages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPages(Parserp.PagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#def_controller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_controller(Parserp.Def_controllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#def_page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_page(Parserp.Def_pageContext ctx);
}