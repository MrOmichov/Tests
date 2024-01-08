// Generated from D:/IdeaProjects/Tests/src/main/java/org/example/lang/ExampleLang.g4 by ANTLR 4.13.1
package org.example.lang;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExampleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, PLUS=2, MINUS=3, TIMES=4, DIV=5, LPAREN=6, RPAREN=7, WS=8;
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_term = 2, RULE_atom = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression", "term", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "PLUS", "MINUS", "TIMES", "DIV", "LPAREN", "RPAREN", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ExampleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	public int result = 0;
	Map<String, Integer> vars = new HashMap<>();

	public ExampleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExampleLangParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleLangListener ) ((ExampleLangListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleLangListener ) ((ExampleLangListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleLangVisitor ) return ((ExampleLangVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			((StartContext)_localctx).expression = expression();
			setState(9);
			match(EOF);
			result = ((StartContext)_localctx).expression.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public int value;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ExampleLangParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ExampleLangParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ExampleLangParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ExampleLangParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleLangListener ) ((ExampleLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleLangListener ) ((ExampleLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleLangVisitor ) return ((ExampleLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((ExpressionContext)_localctx).t1 = term();
			((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).t1.value;
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(22);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(14);
					match(PLUS);
					setState(15);
					((ExpressionContext)_localctx).t2 = term();
					_localctx.value += ((ExpressionContext)_localctx).t2.value;
					}
					break;
				case MINUS:
					{
					setState(18);
					match(MINUS);
					setState(19);
					((ExpressionContext)_localctx).t2 = term();
					_localctx.value -= ((ExpressionContext)_localctx).t2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public int value;
		public AtomContext a1;
		public AtomContext a2;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(ExampleLangParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(ExampleLangParser.TIMES, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ExampleLangParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ExampleLangParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleLangListener ) ((ExampleLangListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleLangListener ) ((ExampleLangListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleLangVisitor ) return ((ExampleLangVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			((TermContext)_localctx).a1 = atom();
			((TermContext)_localctx).value =  ((TermContext)_localctx).a1.value;
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIV) {
				{
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(29);
					match(TIMES);
					setState(30);
					((TermContext)_localctx).a2 = atom();
					_localctx.value *= ((TermContext)_localctx).a2.value;
					}
					break;
				case DIV:
					{
					setState(33);
					match(DIV);
					setState(34);
					((TermContext)_localctx).a2 = atom();
					_localctx.value /= ((TermContext)_localctx).a2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public int value;
		public Token NUMBER;
		public ExpressionContext expression;
		public TerminalNode NUMBER() { return getToken(ExampleLangParser.NUMBER, 0); }
		public TerminalNode LPAREN() { return getToken(ExampleLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExampleLangParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleLangListener ) ((ExampleLangListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleLangListener ) ((ExampleLangListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleLangVisitor ) return ((ExampleLangVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				((AtomContext)_localctx).NUMBER = match(NUMBER);
				((AtomContext)_localctx).value =  Integer.parseInt((((AtomContext)_localctx).NUMBER!=null?((AtomContext)_localctx).NUMBER.getText():null));
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(LPAREN);
				setState(45);
				((AtomContext)_localctx).expression = expression();
				setState(46);
				match(RPAREN);
				((AtomContext)_localctx).value =  ((AtomContext)_localctx).expression.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\b4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0017\b\u0001\n\u0001\f\u0001\u001a\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002&\b\u0002\n\u0002\f\u0002)\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u00032\b\u0003\u0001\u0003\u0000\u0000\u0004\u0000"+
		"\u0002\u0004\u0006\u0000\u00004\u0000\b\u0001\u0000\u0000\u0000\u0002"+
		"\f\u0001\u0000\u0000\u0000\u0004\u001b\u0001\u0000\u0000\u0000\u00061"+
		"\u0001\u0000\u0000\u0000\b\t\u0003\u0002\u0001\u0000\t\n\u0005\u0000\u0000"+
		"\u0001\n\u000b\u0006\u0000\uffff\uffff\u0000\u000b\u0001\u0001\u0000\u0000"+
		"\u0000\f\r\u0003\u0004\u0002\u0000\r\u0018\u0006\u0001\uffff\uffff\u0000"+
		"\u000e\u000f\u0005\u0002\u0000\u0000\u000f\u0010\u0003\u0004\u0002\u0000"+
		"\u0010\u0011\u0006\u0001\uffff\uffff\u0000\u0011\u0017\u0001\u0000\u0000"+
		"\u0000\u0012\u0013\u0005\u0003\u0000\u0000\u0013\u0014\u0003\u0004\u0002"+
		"\u0000\u0014\u0015\u0006\u0001\uffff\uffff\u0000\u0015\u0017\u0001\u0000"+
		"\u0000\u0000\u0016\u000e\u0001\u0000\u0000\u0000\u0016\u0012\u0001\u0000"+
		"\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0003\u0001\u0000"+
		"\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001c\u0003\u0006"+
		"\u0003\u0000\u001c\'\u0006\u0002\uffff\uffff\u0000\u001d\u001e\u0005\u0004"+
		"\u0000\u0000\u001e\u001f\u0003\u0006\u0003\u0000\u001f \u0006\u0002\uffff"+
		"\uffff\u0000 &\u0001\u0000\u0000\u0000!\"\u0005\u0005\u0000\u0000\"#\u0003"+
		"\u0006\u0003\u0000#$\u0006\u0002\uffff\uffff\u0000$&\u0001\u0000\u0000"+
		"\u0000%\u001d\u0001\u0000\u0000\u0000%!\u0001\u0000\u0000\u0000&)\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(\u0005\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005\u0001"+
		"\u0000\u0000+2\u0006\u0003\uffff\uffff\u0000,-\u0005\u0006\u0000\u0000"+
		"-.\u0003\u0002\u0001\u0000./\u0005\u0007\u0000\u0000/0\u0006\u0003\uffff"+
		"\uffff\u000002\u0001\u0000\u0000\u00001*\u0001\u0000\u0000\u00001,\u0001"+
		"\u0000\u0000\u00002\u0007\u0001\u0000\u0000\u0000\u0005\u0016\u0018%\'"+
		"1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}