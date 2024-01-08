// Generated from D:/IdeaProjects/Tests/src/main/java/org/example/lang/ExampleLang.g4 by ANTLR 4.13.1
package org.example.lang;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExampleLangParser}.
 */
public interface ExampleLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExampleLangParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ExampleLangParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleLangParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ExampleLangParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExampleLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExampleLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ExampleLangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ExampleLangParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ExampleLangParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ExampleLangParser.AtomContext ctx);
}