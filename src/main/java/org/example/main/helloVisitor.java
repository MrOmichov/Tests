// Generated from D:/IdeaProjects/Tests/src/main/java/org/example/hello.g4 by ANTLR 4.13.1
package org.example.main;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link helloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface helloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link helloParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(helloParser.RContext ctx);
}