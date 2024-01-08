// Generated from D:/IdeaProjects/Tests/src/main/java/org/example/lang/ExampleLang.g4 by ANTLR 4.13.1
package org.example.lang;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExampleLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExampleLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExampleLangParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ExampleLangParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ExampleLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ExampleLangParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleLangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ExampleLangParser.AtomContext ctx);
}