// Generated from /home/nof4c3/Documents/uni/DLP/PRACTICAS/Proyecto/src/parser/Pmm.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INT_CONSTANT=37, REAL_CONSTANT=38, 
		CHAR_CONSTANT=39, ID=40, ONE_LINE_COMMENT=41, MULTI_LINE_COMMENT=42, SPACE=43, 
		TRASH=44;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_statement = 2, RULE_definition = 3, 
		RULE_statementList = 4, RULE_expressionList = 5, RULE_functioninvocation = 6, 
		RULE_funcDefinition = 7, RULE_parametersList = 8, RULE_type = 9, RULE_basicType = 10, 
		RULE_varDefinition = 11, RULE_parameter = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "statement", "definition", "statementList", 
			"expressionList", "functioninvocation", "funcDefinition", "parametersList", 
			"type", "basicType", "varDefinition", "parameter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", 
			"'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'return'", "';'", "'print'", "'input'", "'='", "'while'", "':'", "'{'", 
			"'}'", "'if'", "'else'", "','", "'def'", "'struct'", "'int'", "'double'", 
			"'char'", null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID", "ONE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "SPACE", "TRASH"
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
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2065879269570L) != 0)) {
				{
				{
				setState(26);
				definition();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(EOF);
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
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public FunctioninvocationContext functioninvocation() {
			return getRuleContext(FunctioninvocationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(35);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(36);
				match(REAL_CONSTANT);
				}
				break;
			case 3:
				{
				setState(37);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(38);
				match(ID);
				}
				break;
			case 5:
				{
				setState(39);
				functioninvocation();
				}
				break;
			case 6:
				{
				setState(40);
				match(T__0);
				setState(41);
				expression(0);
				setState(42);
				match(T__1);
				}
				break;
			case 7:
				{
				setState(44);
				match(T__0);
				setState(45);
				type();
				setState(46);
				match(T__1);
				setState(47);
				expression(7);
				}
				break;
			case 8:
				{
				setState(49);
				match(T__5);
				setState(50);
				expression(6);
				}
				break;
			case 9:
				{
				setState(51);
				match(T__6);
				setState(52);
				expression(5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(55);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(56);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(57);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(58);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(59);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(60);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(61);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(62);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(63);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(64);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(65);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(66);
						expression(2);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(67);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(68);
						match(T__2);
						setState(69);
						expression(0);
						setState(70);
						match(T__3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(72);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(73);
						match(T__4);
						setState(74);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public FunctioninvocationContext functioninvocation() {
			return getRuleContext(FunctioninvocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__19);
				setState(81);
				expression(0);
				setState(82);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__21);
				setState(85);
				expressionList();
				setState(86);
				match(T__20);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(T__22);
				setState(89);
				expressionList();
				setState(90);
				match(T__20);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				expression(0);
				setState(93);
				match(T__23);
				setState(94);
				expression(0);
				setState(95);
				match(T__20);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				match(T__24);
				setState(98);
				expression(0);
				setState(99);
				match(T__25);
				setState(100);
				match(T__26);
				setState(101);
				statementList();
				setState(102);
				match(T__27);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				match(T__28);
				setState(105);
				expression(0);
				setState(106);
				match(T__25);
				setState(107);
				statementList();
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(108);
					match(T__29);
					setState(109);
					match(T__25);
					setState(110);
					statementList();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(113);
				functioninvocation();
				setState(114);
				match(T__20);
				}
				break;
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
	public static class DefinitionContext extends ParserRuleContext {
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public FuncDefinitionContext funcDefinition() {
			return getRuleContext(FuncDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definition);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
			case T__6:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				varDefinition();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				funcDefinition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122);
					statement();
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302274L) != 0)) {
				{
				setState(128);
				expression(0);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__30) {
					{
					{
					setState(129);
					match(T__30);
					setState(130);
					expression(0);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
	public static class FunctioninvocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctioninvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioninvocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunctioninvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioninvocationContext functioninvocation() throws RecognitionException {
		FunctioninvocationContext _localctx = new FunctioninvocationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functioninvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ID);
			setState(139);
			match(T__0);
			setState(140);
			expressionList();
			setState(141);
			match(T__1);
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
	public static class FuncDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuncDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__31);
			setState(144);
			match(ID);
			setState(145);
			match(T__0);
			setState(146);
			parametersList();
			setState(147);
			match(T__1);
			setState(148);
			match(T__25);
			setState(149);
			basicType();
			setState(150);
			match(T__26);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					varDefinition();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(157);
			statementList();
			setState(158);
			match(T__27);
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
	public static class ParametersListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParametersList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametersList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25 || _la==ID) {
				{
				setState(160);
				parameter();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__30) {
					{
					{
					setState(161);
					match(T__30);
					setState(162);
					parameter();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
	public static class TypeContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__20:
			case T__30:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				basicType();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(T__2);
				setState(172);
				match(INT_CONSTANT);
				setState(173);
				match(T__3);
				setState(174);
				type();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(T__32);
				setState(176);
				match(T__26);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302274L) != 0)) {
					{
					{
					setState(177);
					varDefinition();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(T__27);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BasicTypeContext extends ParserRuleContext {
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basicType);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(T__35);
				}
				break;
			case T__1:
			case T__20:
			case T__26:
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDefinitionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			expression(0);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(193);
				match(T__30);
				setState(194);
				expression(0);
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(T__25);
			setState(201);
			type();
			setState(202);
			match(T__20);
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
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(204);
				match(ID);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(T__25);
			setState(211);
			type();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u00d6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001L\b\u0001\n\u0001\f\u0001O\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002p\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002u\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003y\b\u0003\u0001\u0004"+
		"\u0005\u0004|\b\u0004\n\u0004\f\u0004\u007f\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0084\b\u0005\n\u0005\f\u0005\u0087\t\u0005"+
		"\u0003\u0005\u0089\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0099\b\u0007"+
		"\n\u0007\f\u0007\u009c\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00a4\b\b\n\b\f\b\u00a7\t\b\u0003\b\u00a9\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00b3\b\t\n\t\f\t\u00b6\t\t\u0001\t\u0003\t\u00b9\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00bf\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00c4\b\u000b\n\u000b\f\u000b\u00c7\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u00ce\b\f\n\f\f\f\u00d1"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0001\u0002\r\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0004\u0001\u0000"+
		"\b\n\u0002\u0000\u0006\u0006\u000b\u000b\u0001\u0000\f\u0011\u0001\u0000"+
		"\u0012\u0013\u00ed\u0000\u001d\u0001\u0000\u0000\u0000\u00025\u0001\u0000"+
		"\u0000\u0000\u0004t\u0001\u0000\u0000\u0000\u0006x\u0001\u0000\u0000\u0000"+
		"\b}\u0001\u0000\u0000\u0000\n\u0088\u0001\u0000\u0000\u0000\f\u008a\u0001"+
		"\u0000\u0000\u0000\u000e\u008f\u0001\u0000\u0000\u0000\u0010\u00a8\u0001"+
		"\u0000\u0000\u0000\u0012\u00b8\u0001\u0000\u0000\u0000\u0014\u00be\u0001"+
		"\u0000\u0000\u0000\u0016\u00c0\u0001\u0000\u0000\u0000\u0018\u00cf\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0003\u0006\u0003\u0000\u001b\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0005\u0000\u0000\u0001"+
		"!\u0001\u0001\u0000\u0000\u0000\"#\u0006\u0001\uffff\uffff\u0000#6\u0005"+
		"%\u0000\u0000$6\u0005&\u0000\u0000%6\u0005\'\u0000\u0000&6\u0005(\u0000"+
		"\u0000\'6\u0003\f\u0006\u0000()\u0005\u0001\u0000\u0000)*\u0003\u0002"+
		"\u0001\u0000*+\u0005\u0002\u0000\u0000+6\u0001\u0000\u0000\u0000,-\u0005"+
		"\u0001\u0000\u0000-.\u0003\u0012\t\u0000./\u0005\u0002\u0000\u0000/0\u0003"+
		"\u0002\u0001\u000706\u0001\u0000\u0000\u000012\u0005\u0006\u0000\u0000"+
		"26\u0003\u0002\u0001\u000634\u0005\u0007\u0000\u000046\u0003\u0002\u0001"+
		"\u00055\"\u0001\u0000\u0000\u00005$\u0001\u0000\u0000\u00005%\u0001\u0000"+
		"\u0000\u00005&\u0001\u0000\u0000\u00005\'\u0001\u0000\u0000\u00005(\u0001"+
		"\u0000\u0000\u00005,\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u00006M\u0001\u0000\u0000\u000078\n\u0004\u0000\u0000"+
		"89\u0007\u0000\u0000\u00009L\u0003\u0002\u0001\u0005:;\n\u0003\u0000\u0000"+
		";<\u0007\u0001\u0000\u0000<L\u0003\u0002\u0001\u0004=>\n\u0002\u0000\u0000"+
		">?\u0007\u0002\u0000\u0000?L\u0003\u0002\u0001\u0003@A\n\u0001\u0000\u0000"+
		"AB\u0007\u0003\u0000\u0000BL\u0003\u0002\u0001\u0002CD\n\t\u0000\u0000"+
		"DE\u0005\u0003\u0000\u0000EF\u0003\u0002\u0001\u0000FG\u0005\u0004\u0000"+
		"\u0000GL\u0001\u0000\u0000\u0000HI\n\b\u0000\u0000IJ\u0005\u0005\u0000"+
		"\u0000JL\u0005(\u0000\u0000K7\u0001\u0000\u0000\u0000K:\u0001\u0000\u0000"+
		"\u0000K=\u0001\u0000\u0000\u0000K@\u0001\u0000\u0000\u0000KC\u0001\u0000"+
		"\u0000\u0000KH\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0003\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0014\u0000\u0000QR\u0003\u0002"+
		"\u0001\u0000RS\u0005\u0015\u0000\u0000Su\u0001\u0000\u0000\u0000TU\u0005"+
		"\u0016\u0000\u0000UV\u0003\n\u0005\u0000VW\u0005\u0015\u0000\u0000Wu\u0001"+
		"\u0000\u0000\u0000XY\u0005\u0017\u0000\u0000YZ\u0003\n\u0005\u0000Z[\u0005"+
		"\u0015\u0000\u0000[u\u0001\u0000\u0000\u0000\\]\u0003\u0002\u0001\u0000"+
		"]^\u0005\u0018\u0000\u0000^_\u0003\u0002\u0001\u0000_`\u0005\u0015\u0000"+
		"\u0000`u\u0001\u0000\u0000\u0000ab\u0005\u0019\u0000\u0000bc\u0003\u0002"+
		"\u0001\u0000cd\u0005\u001a\u0000\u0000de\u0005\u001b\u0000\u0000ef\u0003"+
		"\b\u0004\u0000fg\u0005\u001c\u0000\u0000gu\u0001\u0000\u0000\u0000hi\u0005"+
		"\u001d\u0000\u0000ij\u0003\u0002\u0001\u0000jk\u0005\u001a\u0000\u0000"+
		"ko\u0003\b\u0004\u0000lm\u0005\u001e\u0000\u0000mn\u0005\u001a\u0000\u0000"+
		"np\u0003\b\u0004\u0000ol\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pu\u0001\u0000\u0000\u0000qr\u0003\f\u0006\u0000rs\u0005\u0015\u0000\u0000"+
		"su\u0001\u0000\u0000\u0000tP\u0001\u0000\u0000\u0000tT\u0001\u0000\u0000"+
		"\u0000tX\u0001\u0000\u0000\u0000t\\\u0001\u0000\u0000\u0000ta\u0001\u0000"+
		"\u0000\u0000th\u0001\u0000\u0000\u0000tq\u0001\u0000\u0000\u0000u\u0005"+
		"\u0001\u0000\u0000\u0000vy\u0003\u0016\u000b\u0000wy\u0003\u000e\u0007"+
		"\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y\u0007\u0001"+
		"\u0000\u0000\u0000z|\u0003\u0004\u0002\u0000{z\u0001\u0000\u0000\u0000"+
		"|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\t\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u0080\u0085\u0003\u0002\u0001\u0000\u0081\u0082\u0005\u001f\u0000\u0000"+
		"\u0082\u0084\u0003\u0002\u0001\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0080\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u000b\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005(\u0000\u0000\u008b\u008c\u0005\u0001\u0000\u0000\u008c"+
		"\u008d\u0003\n\u0005\u0000\u008d\u008e\u0005\u0002\u0000\u0000\u008e\r"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005 \u0000\u0000\u0090\u0091\u0005"+
		"(\u0000\u0000\u0091\u0092\u0005\u0001\u0000\u0000\u0092\u0093\u0003\u0010"+
		"\b\u0000\u0093\u0094\u0005\u0002\u0000\u0000\u0094\u0095\u0005\u001a\u0000"+
		"\u0000\u0095\u0096\u0003\u0014\n\u0000\u0096\u009a\u0005\u001b\u0000\u0000"+
		"\u0097\u0099\u0003\u0016\u000b\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0003\b\u0004\u0000\u009e"+
		"\u009f\u0005\u001c\u0000\u0000\u009f\u000f\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a5\u0003\u0018\f\u0000\u00a1\u00a2\u0005\u001f\u0000\u0000\u00a2\u00a4"+
		"\u0003\u0018\f\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u0011\u0001\u0000\u0000\u0000\u00aa\u00b9\u0003"+
		"\u0014\n\u0000\u00ab\u00ac\u0005\u0003\u0000\u0000\u00ac\u00ad\u0005%"+
		"\u0000\u0000\u00ad\u00ae\u0005\u0004\u0000\u0000\u00ae\u00b9\u0003\u0012"+
		"\t\u0000\u00af\u00b0\u0005!\u0000\u0000\u00b0\u00b4\u0005\u001b\u0000"+
		"\u0000\u00b1\u00b3\u0003\u0016\u000b\u0000\u00b2\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005\u001c\u0000"+
		"\u0000\u00b8\u00aa\u0001\u0000\u0000\u0000\u00b8\u00ab\u0001\u0000\u0000"+
		"\u0000\u00b8\u00af\u0001\u0000\u0000\u0000\u00b9\u0013\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bf\u0005\"\u0000\u0000\u00bb\u00bf\u0005#\u0000\u0000"+
		"\u00bc\u00bf\u0005$\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be"+
		"\u00ba\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf"+
		"\u0015\u0001\u0000\u0000\u0000\u00c0\u00c5\u0003\u0002\u0001\u0000\u00c1"+
		"\u00c2\u0005\u001f\u0000\u0000\u00c2\u00c4\u0003\u0002\u0001\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0005\u001a\u0000\u0000\u00c9\u00ca\u0003\u0012\t\u0000\u00ca\u00cb"+
		"\u0005\u0015\u0000\u0000\u00cb\u0017\u0001\u0000\u0000\u0000\u00cc\u00ce"+
		"\u0005(\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005\u001a\u0000\u0000\u00d3\u00d4\u0003"+
		"\u0012\t\u0000\u00d4\u0019\u0001\u0000\u0000\u0000\u0012\u001d5KMotx}"+
		"\u0085\u0088\u009a\u00a5\u00a8\u00b4\u00b8\u00be\u00c5\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}