// Generated from /home/nof4c3/Documents/uni/DLP/PMMCompiler/src/parser/Pmm.g4 by ANTLR 4.13.1
package parser;

    import ast.expression.*;
    import ast.node.*;
    import ast.type.*;
    import ast.type.struct.*;
    import ast.definition.*;
    import ast.statement.*;
    import ast.*;
    import errorhandler.*;


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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		INT_CONSTANT=39, REAL_CONSTANT=40, CHAR_CONSTANT=41, ID=42, ONE_LINE_COMMENT=43, 
		MULTI_LINE_COMMENT=44, SPACE=45, TRASH=46;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_expression = 2, RULE_statement = 3, 
		RULE_body = 4, RULE_expressionList = 5, RULE_functioninvocation = 6, RULE_funcDefinition = 7, 
		RULE_parametersList = 8, RULE_type = 9, RULE_structFields = 10, RULE_ids = 11, 
		RULE_basicType = 12, RULE_varDefinition = 13, RULE_parameter = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "expression", "statement", "body", "expressionList", 
			"functioninvocation", "funcDefinition", "parametersList", "type", "structFields", 
			"ids", "basicType", "varDefinition", "parameter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "'}'", "'['", "']'", 
			"'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", 
			"'<='", "'!='", "'=='", "'&&'", "'||'", "'return'", "';'", "'print'", 
			"'input'", "'='", "'while'", "'if'", "'else'", "'++'", "','", "'struct'", 
			"'int'", "'double'", "'char'", null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID", 
			"ONE_LINE_COMMENT", "MULTI_LINE_COMMENT", "SPACE", "TRASH"
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
		public Program ast;
		public List<FunctionDefinition> funcDefinitions = new ArrayList<FunctionDefinition>();
		public List<VarDefinition> globalVarDefs = new ArrayList<VarDefinition>();
		public VarDefinitionContext v;
		public FuncDefinitionContext f;
		public MainContext main;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<FuncDefinitionContext> funcDefinition() {
			return getRuleContexts(FuncDefinitionContext.class);
		}
		public FuncDefinitionContext funcDefinition(int i) {
			return getRuleContext(FuncDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(36);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(30);
						((ProgramContext)_localctx).v = varDefinition();
						_localctx.globalVarDefs.addAll(((ProgramContext)_localctx).v.ast);
						}
						break;
					case T__0:
						{
						setState(33);
						((ProgramContext)_localctx).f = funcDefinition();
						_localctx.funcDefinitions.add(((ProgramContext)_localctx).f.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(41);
			((ProgramContext)_localctx).main = main();
			setState(42);
			match(EOF);

			                            _localctx.funcDefinitions.add(((ProgramContext)_localctx).main.ast);
			                            ((ProgramContext)_localctx).ast =  new Program(0,0,_localctx.globalVarDefs,_localctx.funcDefinitions);
			                        
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
	public static class MainContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public List<VarDefinition> bodyVarDefs = new ArrayList<VarDefinition>();
		public List<Statement> statements = new ArrayList<Statement>();
		public Token kw;
		public Token mn;
		public Token dots;
		public VarDefinitionContext vd;
		public StatementContext st;
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((MainContext)_localctx).kw = match(T__0);
			setState(46);
			((MainContext)_localctx).mn = match(T__1);
			setState(47);
			match(T__2);
			setState(48);
			match(T__3);
			setState(49);
			((MainContext)_localctx).dots = match(T__4);
			setState(50);
			match(T__5);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					((MainContext)_localctx).vd = varDefinition();
					_localctx.bodyVarDefs.addAll(((MainContext)_localctx).vd.ast);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8249994647560L) != 0)) {
				{
				{
				setState(59);
				((MainContext)_localctx).st = statement();
				_localctx.statements.addAll(((MainContext)_localctx).st.ast);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(T__6);

			                ((MainContext)_localctx).ast =  new FunctionDefinition(((MainContext)_localctx).kw.getLine(),((MainContext)_localctx).kw.getCharPositionInLine() + 1,
			                                              (((MainContext)_localctx).mn!=null?((MainContext)_localctx).mn.getText():null),
			                                              new Function(((MainContext)_localctx).dots.getLine(),
			                                                               ((MainContext)_localctx).dots.getCharPositionInLine() + 1,
			                                                               new VoidType(0,0) ,
			                                                               new ArrayList<VarDefinition>()),
			                                              _localctx.bodyVarDefs,
			                                              _localctx.statements);
			            
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
		public Expression ast;
		public ExpressionContext e1;
		public ExpressionContext e;
		public ExpressionContext exp1;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public FunctioninvocationContext functioninvocation;
		public Token pos;
		public TypeContext t;
		public TypeContext type;
		public ExpressionContext exp;
		public Token minus;
		public Token negation;
		public Token operator;
		public ExpressionContext exp2;
		public ExpressionContext e2;
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitExpression(this);
		}
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(71);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 2:
				{
				setState(73);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new FloatLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 3:
				{
				setState(75);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(77);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 5:
				{
				setState(79);
				((ExpressionContext)_localctx).functioninvocation = functioninvocation();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).functioninvocation.ast;
				}
				break;
			case 6:
				{
				setState(82);
				match(T__2);
				setState(83);
				((ExpressionContext)_localctx).e = expression(0);
				setState(84);
				match(T__3);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e.ast;
				}
				break;
			case 7:
				{
				setState(87);
				((ExpressionContext)_localctx).pos = match(T__2);
				setState(88);
				((ExpressionContext)_localctx).t = ((ExpressionContext)_localctx).type = type();
				setState(89);
				match(T__3);
				setState(90);
				((ExpressionContext)_localctx).exp = expression(7);
				((ExpressionContext)_localctx).ast = new Cast(((ExpressionContext)_localctx).pos.getLine(),((ExpressionContext)_localctx).pos.getCharPositionInLine()+1,((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).exp.ast);
				}
				break;
			case 8:
				{
				setState(93);
				((ExpressionContext)_localctx).minus = match(T__10);
				setState(94);
				((ExpressionContext)_localctx).exp = expression(6);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).minus.getLine(),((ExpressionContext)_localctx).minus.getCharPositionInLine()+1, ((ExpressionContext)_localctx).exp.ast);
				}
				break;
			case 9:
				{
				setState(97);
				((ExpressionContext)_localctx).negation = match(T__11);
				setState(98);
				((ExpressionContext)_localctx).exp = expression(5);
				((ExpressionContext)_localctx).ast =  new Negation(((ExpressionContext)_localctx).negation.getLine(),((ExpressionContext)_localctx).negation.getCharPositionInLine()+1, ((ExpressionContext)_localctx).exp.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(133);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(103);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(104);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(105);
						((ExpressionContext)_localctx).exp2 = expression(5);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).operator.getLine(),((ExpressionContext)_localctx).operator.getCharPositionInLine()+1,((ExpressionContext)_localctx).exp1.ast,((ExpressionContext)_localctx).exp2.ast,(((ExpressionContext)_localctx).operator!=null?((ExpressionContext)_localctx).operator.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(109);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__15) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						((ExpressionContext)_localctx).exp2 = expression(4);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).operator.getLine(),((ExpressionContext)_localctx).operator.getCharPositionInLine()+1,((ExpressionContext)_localctx).exp1.ast,((ExpressionContext)_localctx).exp2.ast,(((ExpressionContext)_localctx).operator!=null?((ExpressionContext)_localctx).operator.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(114);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8257536L) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(115);
						((ExpressionContext)_localctx).exp2 = expression(3);
						((ExpressionContext)_localctx).ast =  new ArithmeticComparison(((ExpressionContext)_localctx).operator.getLine(),((ExpressionContext)_localctx).operator.getCharPositionInLine()+1,((ExpressionContext)_localctx).exp1.ast,((ExpressionContext)_localctx).exp2.ast,(((ExpressionContext)_localctx).operator!=null?((ExpressionContext)_localctx).operator.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(119);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(120);
						((ExpressionContext)_localctx).exp2 = expression(2);
						((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).operator.getLine(),((ExpressionContext)_localctx).operator.getCharPositionInLine()+1,((ExpressionContext)_localctx).exp1.ast,((ExpressionContext)_localctx).exp2.ast,(((ExpressionContext)_localctx).operator!=null?((ExpressionContext)_localctx).operator.getText():null));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(124);
						((ExpressionContext)_localctx).pos = match(T__7);
						setState(125);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(126);
						match(T__8);
						((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).pos.getLine(),((ExpressionContext)_localctx).pos.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(130);
						match(T__9);
						setState(131);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new StructAccess(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),((ExpressionContext)_localctx).e.ast);
						}
						break;
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public List<Statement> ast = new ArrayList<Statement>();
		public List<Statement> elseBodyL = new ArrayList<Statement>();
		public boolean hasElseBody = false;
		public Token ret;
		public ExpressionContext expression;
		public Token kw;
		public ExpressionListContext expressionList;
		public ExpressionContext var;
		public Token eq;
		public ExpressionContext val;
		public ExpressionContext cond;
		public BodyContext bd;
		public BodyContext body;
		public BodyContext ifbody;
		public BodyContext elsebody;
		public FunctioninvocationContext funcInv;
		public ExpressionContext exp1;
		public Token operator;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public FunctioninvocationContext functioninvocation() {
			return getRuleContext(FunctioninvocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				((StatementContext)_localctx).ret = match(T__24);
				setState(139);
				((StatementContext)_localctx).expression = expression(0);
				setState(140);
				match(T__25);
				_localctx.ast.add(new Return(((StatementContext)_localctx).ret.getLine(),((StatementContext)_localctx).ret.getCharPositionInLine()+1,((StatementContext)_localctx).expression.ast));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				((StatementContext)_localctx).kw = match(T__26);
				setState(144);
				((StatementContext)_localctx).expressionList = expressionList();
				setState(145);
				match(T__25);

				                    for (Expression expression : ((StatementContext)_localctx).expressionList.ast) {
				                        _localctx.ast.add(new Print(((StatementContext)_localctx).kw.getLine(), ((StatementContext)_localctx).kw.getCharPositionInLine()+1, expression));
				                    }
				                
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				((StatementContext)_localctx).kw = match(T__27);
				setState(149);
				((StatementContext)_localctx).expressionList = expressionList();
				setState(150);
				match(T__25);

				                    for (Expression expression : ((StatementContext)_localctx).expressionList.ast) {
				                        _localctx.ast.add(new Input(((StatementContext)_localctx).kw.getLine(), ((StatementContext)_localctx).kw.getCharPositionInLine()+1, expression));
				                    }
				               
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				((StatementContext)_localctx).var = expression(0);
				setState(154);
				((StatementContext)_localctx).eq = match(T__28);
				setState(155);
				((StatementContext)_localctx).val = expression(0);
				setState(156);
				match(T__25);
				_localctx.ast.add(new Assignment(((StatementContext)_localctx).eq.getLine(),((StatementContext)_localctx).eq.getCharPositionInLine()+1,((StatementContext)_localctx).var.ast,((StatementContext)_localctx).val.ast));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				((StatementContext)_localctx).kw = match(T__29);
				setState(160);
				((StatementContext)_localctx).cond = expression(0);
				setState(161);
				match(T__4);
				setState(162);
				((StatementContext)_localctx).bd = ((StatementContext)_localctx).body = body();
				_localctx.ast.add(new While(((StatementContext)_localctx).kw.getLine(), ((StatementContext)_localctx).kw.getCharPositionInLine()+1, ((StatementContext)_localctx).body.ast, ((StatementContext)_localctx).cond.ast));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				((StatementContext)_localctx).kw = match(T__30);
				setState(166);
				((StatementContext)_localctx).cond = expression(0);
				setState(167);
				match(T__4);
				setState(168);
				((StatementContext)_localctx).ifbody = body();
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(169);
					match(T__31);
					setState(170);
					match(T__4);
					setState(171);
					((StatementContext)_localctx).elsebody = body();

					                                                                                _localctx.elseBodyL.addAll(((StatementContext)_localctx).elsebody.ast);
					                                                                                
					}
					break;
				}

				                    _localctx.ast.add(new If_Else(((StatementContext)_localctx).kw.getLine(), ((StatementContext)_localctx).kw.getCharPositionInLine()+1,((StatementContext)_localctx).ifbody.ast,
				                        _localctx.elseBodyL,((StatementContext)_localctx).cond.ast));
				                
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				((StatementContext)_localctx).funcInv = functioninvocation();
				setState(179);
				match(T__25);
				_localctx.ast.add(((StatementContext)_localctx).funcInv.ast);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(182);
				((StatementContext)_localctx).exp1 = expression(0);
				setState(183);
				((StatementContext)_localctx).operator = match(T__32);
				setState(184);
				match(T__25);
				_localctx.ast.add(new Increment(((StatementContext)_localctx).operator.getLine(),((StatementContext)_localctx).operator.getCharPositionInLine()+1,((StatementContext)_localctx).exp1.ast));
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
	public static class BodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext st;
		public StatementContext st2;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__10:
			case T__11:
			case T__24:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				((BodyContext)_localctx).st = statement();
				 _localctx.ast.addAll(((BodyContext)_localctx).st.ast); 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(T__5);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8249994647560L) != 0)) {
					{
					{
					setState(193);
					((BodyContext)_localctx).st2 = statement();
					 _localctx.ast.addAll(((BodyContext)_localctx).st2.ast);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				match(T__6);
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext e1;
		public ExpressionContext e2;
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitExpressionList(this);
		}
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
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337214472L) != 0)) {
				{
				setState(204);
				((ExpressionListContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ExpressionListContext)_localctx).e1.ast);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__33) {
					{
					{
					setState(206);
					match(T__33);
					setState(207);
					((ExpressionListContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((ExpressionListContext)_localctx).e2.ast);
					}
					}
					setState(214);
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
		public FunctionInvocation ast;
		public Token ID;
		public ExpressionListContext exps;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctioninvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioninvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterFunctioninvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitFunctioninvocation(this);
		}
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
			setState(217);
			((FunctioninvocationContext)_localctx).ID = match(ID);
			setState(218);
			match(T__2);
			setState(219);
			((FunctioninvocationContext)_localctx).exps = expressionList();
			setState(220);
			match(T__3);
			((FunctioninvocationContext)_localctx).ast =  new FunctionInvocation(((FunctioninvocationContext)_localctx).ID.getLine(),((FunctioninvocationContext)_localctx).ID.getCharPositionInLine() + 1,
			                ((FunctioninvocationContext)_localctx).exps.ast,new Variable(((FunctioninvocationContext)_localctx).ID.getLine(),((FunctioninvocationContext)_localctx).ID.getCharPositionInLine(),(((FunctioninvocationContext)_localctx).ID!=null?((FunctioninvocationContext)_localctx).ID.getText():null)));
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
		public FunctionDefinition ast;
		public List<VarDefinition> bodyVarDefs = new ArrayList<VarDefinition>();
		public List<Statement> statements = new ArrayList<Statement>();
		public Type returnType = null;
		public Token kw;
		public Token ID;
		public ParametersListContext parametersList;
		public Token dots;
		public BasicTypeContext rt;
		public VarDefinitionContext vd;
		public StatementContext st;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterFuncDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitFuncDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuncDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			((FuncDefinitionContext)_localctx).kw = match(T__0);
			setState(224);
			((FuncDefinitionContext)_localctx).ID = match(ID);
			setState(225);
			match(T__2);
			setState(226);
			((FuncDefinitionContext)_localctx).parametersList = parametersList();
			setState(227);
			match(T__3);
			setState(228);
			((FuncDefinitionContext)_localctx).dots = match(T__4);
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(229);
				((FuncDefinitionContext)_localctx).rt = basicType();
				((FuncDefinitionContext)_localctx).returnType = ((FuncDefinitionContext)_localctx).rt.ast;
				}
				break;
			}
			setState(234);
			match(T__5);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235);
					((FuncDefinitionContext)_localctx).vd = varDefinition();
					_localctx.bodyVarDefs.addAll(((FuncDefinitionContext)_localctx).vd.ast);
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8249994647560L) != 0)) {
				{
				{
				setState(243);
				((FuncDefinitionContext)_localctx).st = statement();
				_localctx.statements.addAll(((FuncDefinitionContext)_localctx).st.ast);
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			match(T__6);


			            if(_localctx.returnType==null){
			                ((FuncDefinitionContext)_localctx).returnType = new VoidType(0,0);
			            }
			            ((FuncDefinitionContext)_localctx).ast =  new FunctionDefinition(((FuncDefinitionContext)_localctx).kw.getLine(),((FuncDefinitionContext)_localctx).kw.getCharPositionInLine() + 1,(((FuncDefinitionContext)_localctx).ID!=null?((FuncDefinitionContext)_localctx).ID.getText():null),
			                new Function(((FuncDefinitionContext)_localctx).dots.getLine(),((FuncDefinitionContext)_localctx).dots.getCharPositionInLine() + 1,_localctx.returnType, ((FuncDefinitionContext)_localctx).parametersList.ast),
			                   _localctx.bodyVarDefs, _localctx.statements);
			            
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
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public ParameterContext id1;
		public ParameterContext id2;
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterParametersList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitParametersList(this);
		}
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
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(254);
				((ParametersListContext)_localctx).id1 = parameter();
				_localctx.ast.add(((ParametersListContext)_localctx).id1.ast);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__33) {
					{
					{
					setState(256);
					match(T__33);
					setState(257);
					((ParametersListContext)_localctx).id2 = parameter();
					_localctx.ast.add(((ParametersListContext)_localctx).id2.ast);
					}
					}
					setState(264);
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
		public Type ast;
		public BasicTypeContext basicType;
		public Token bracket;
		public Token INT_CONSTANT;
		public TypeContext type;
		public Token st;
		public StructFieldsContext structFields;
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StructFieldsContext structFields() {
			return getRuleContext(StructFieldsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__25:
			case T__33:
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				((TypeContext)_localctx).basicType = basicType();
				((TypeContext)_localctx).ast = ((TypeContext)_localctx).basicType.ast;
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				((TypeContext)_localctx).bracket = match(T__7);
				setState(271);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(272);
				match(T__8);
				setState(273);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast = new Array(((TypeContext)_localctx).bracket.getLine(),((TypeContext)_localctx).bracket.getCharPositionInLine()+1,LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)),((TypeContext)_localctx).type.ast);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				((TypeContext)_localctx).st = match(T__34);
				setState(277);
				match(T__5);
				setState(278);
				((TypeContext)_localctx).structFields = structFields();
				setState(279);
				match(T__6);
				((TypeContext)_localctx).ast =  new Struct(((TypeContext)_localctx).st.getLine(),((TypeContext)_localctx).st.getCharPositionInLine() + 1,((TypeContext)_localctx).structFields.ast);
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
	public static class StructFieldsContext extends ParserRuleContext {
		public List<StructField> ast = new ArrayList<StructField>();
		public IdsContext idList;
		public Token dots;
		public TypeContext tp;
		public List<IdsContext> ids() {
			return getRuleContexts(IdsContext.class);
		}
		public IdsContext ids(int i) {
			return getRuleContext(IdsContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public StructFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterStructFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitStructFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStructFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldsContext structFields() throws RecognitionException {
		StructFieldsContext _localctx = new StructFieldsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_structFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(284);
				((StructFieldsContext)_localctx).idList = ids();
				setState(285);
				((StructFieldsContext)_localctx).dots = match(T__4);
				setState(286);
				((StructFieldsContext)_localctx).tp = type();
				setState(287);
				match(T__25);

				                        for (Variable v : ((StructFieldsContext)_localctx).idList.ast) {

				                            StructField newPossibleField =
				                                new StructField(v.getLine(), v.getColumn(), ((StructFieldsContext)_localctx).tp.ast, v.getName());
				                            if(_localctx.ast.contains(newPossibleField)){
				                                new ErrorType(v.getLine(),v.getColumn(),"StructField " + "\'" + v.getName() +  "\'" +   " already defined");
				                            }else{
				                                _localctx.ast.add(newPossibleField);
				                            }
				                        }
				                     
				}
				}
				setState(294);
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
	public static class IdsContext extends ParserRuleContext {
		public List<Variable> ast = new ArrayList<Variable>();
		public Token id1;
		public Token id2;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			((IdsContext)_localctx).id1 = match(ID);
			 _localctx.ast.add(new Variable(((IdsContext)_localctx).id1.getLine(), ((IdsContext)_localctx).id1.getCharPositionInLine() + 1, (((IdsContext)_localctx).id1!=null?((IdsContext)_localctx).id1.getText():null))); 
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(297);
				match(T__33);
				setState(298);
				((IdsContext)_localctx).id2 = match(ID);
				 _localctx.ast.add(new Variable(((IdsContext)_localctx).id2.getLine(), ((IdsContext)_localctx).id2.getCharPositionInLine() + 1, (((IdsContext)_localctx).id2!=null?((IdsContext)_localctx).id2.getText():null))); 
				}
				}
				setState(304);
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
	public static class BasicTypeContext extends ParserRuleContext {
		public Type ast;
		public Token int_;
		public Token double_;
		public Token char_;
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_basicType);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				((BasicTypeContext)_localctx).int_ = match(T__35);
				((BasicTypeContext)_localctx).ast = new IntType(((BasicTypeContext)_localctx).int_.getLine(),((BasicTypeContext)_localctx).int_.getCharPositionInLine()+1);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				((BasicTypeContext)_localctx).double_ = match(T__36);
				((BasicTypeContext)_localctx).ast = new DoubleType(((BasicTypeContext)_localctx).double_.getLine(),((BasicTypeContext)_localctx).double_.getCharPositionInLine()+1);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				((BasicTypeContext)_localctx).char_ = match(T__37);
				((BasicTypeContext)_localctx).ast = new CharType(((BasicTypeContext)_localctx).char_.getLine(),((BasicTypeContext)_localctx).char_.getCharPositionInLine()+1);
				}
				break;
			case T__3:
			case T__5:
			case T__25:
			case T__33:
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
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public IdsContext idl;
		public TypeContext t;
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterVarDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitVarDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			((VarDefinitionContext)_localctx).idl = ids();
			setState(315);
			match(T__4);
			setState(316);
			((VarDefinitionContext)_localctx).t = type();
			setState(317);
			match(T__25);

			                    for(Variable var: ((VarDefinitionContext)_localctx).idl.ast){
			                        VarDefinition newPossibleVarDef = new VarDefinition(var.getLine(), var.getColumn(),var.getName(),((VarDefinitionContext)_localctx).t.ast);
			                        if(_localctx.ast.contains(newPossibleVarDef)){
			                                new ErrorType(var.getLine(),var.getColumn(),"Variable " + "\'" + var.getName() + "\'" + " already defined");
			                        }else{
			                            _localctx.ast.add(newPossibleVarDef);
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
	public static class ParameterContext extends ParserRuleContext {
		public VarDefinition ast;
		public Token id;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			((ParameterContext)_localctx).id = match(ID);
			setState(321);
			match(T__4);
			setState(322);
			((ParameterContext)_localctx).type = type();
			((ParameterContext)_localctx).ast =  new VarDefinition(((ParameterContext)_localctx).id.getLine(),((ParameterContext)_localctx).id.getCharPositionInLine()+1,(((ParameterContext)_localctx).id!=null?((ParameterContext)_localctx).id.getText():null),((ParameterContext)_localctx).type.ast);
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
		case 2:
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
		"\u0004\u0001.\u0146\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000%\b\u0000"+
		"\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00017\b\u0001\n\u0001\f\u0001"+
		":\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001?\b\u0001\n\u0001"+
		"\f\u0001B\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002f\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u0086\b\u0002\n\u0002\f\u0002\u0089\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00af\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00bc\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00c5\b\u0004"+
		"\n\u0004\f\u0004\u00c8\t\u0004\u0001\u0004\u0003\u0004\u00cb\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00d3\b\u0005\n\u0005\f\u0005\u00d6\t\u0005\u0003\u0005\u00d8\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00e9\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ef\b\u0007\n"+
		"\u0007\f\u0007\u00f2\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00f7\b\u0007\n\u0007\f\u0007\u00fa\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0105"+
		"\b\b\n\b\f\b\u0108\t\b\u0003\b\u010a\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u011b\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0123\b\n\n\n\f\n\u0126\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u012d\b\u000b\n\u000b"+
		"\f\u000b\u0130\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u0139\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0000\u0001\u0004\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u0000\u0004\u0001\u0000\r\u000f\u0002\u0000"+
		"\u000b\u000b\u0010\u0010\u0001\u0000\u0011\u0016\u0001\u0000\u0017\u0018"+
		"\u0160\u0000&\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u0004"+
		"e\u0001\u0000\u0000\u0000\u0006\u00bb\u0001\u0000\u0000\u0000\b\u00ca"+
		"\u0001\u0000\u0000\u0000\n\u00d7\u0001\u0000\u0000\u0000\f\u00d9\u0001"+
		"\u0000\u0000\u0000\u000e\u00df\u0001\u0000\u0000\u0000\u0010\u0109\u0001"+
		"\u0000\u0000\u0000\u0012\u011a\u0001\u0000\u0000\u0000\u0014\u0124\u0001"+
		"\u0000\u0000\u0000\u0016\u0127\u0001\u0000\u0000\u0000\u0018\u0138\u0001"+
		"\u0000\u0000\u0000\u001a\u013a\u0001\u0000\u0000\u0000\u001c\u0140\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0003\u001a\r\u0000\u001f \u0006\u0000"+
		"\uffff\uffff\u0000 %\u0001\u0000\u0000\u0000!\"\u0003\u000e\u0007\u0000"+
		"\"#\u0006\u0000\uffff\uffff\u0000#%\u0001\u0000\u0000\u0000$\u001e\u0001"+
		"\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000"+
		"&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000)*\u0003\u0002\u0001\u0000*+\u0005\u0000"+
		"\u0000\u0001+,\u0006\u0000\uffff\uffff\u0000,\u0001\u0001\u0000\u0000"+
		"\u0000-.\u0005\u0001\u0000\u0000./\u0005\u0002\u0000\u0000/0\u0005\u0003"+
		"\u0000\u000001\u0005\u0004\u0000\u000012\u0005\u0005\u0000\u000028\u0005"+
		"\u0006\u0000\u000034\u0003\u001a\r\u000045\u0006\u0001\uffff\uffff\u0000"+
		"57\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u00007:\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009@\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0003\u0006\u0003\u0000<=\u0006"+
		"\u0001\uffff\uffff\u0000=?\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000"+
		"\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005"+
		"\u0007\u0000\u0000DE\u0006\u0001\uffff\uffff\u0000E\u0003\u0001\u0000"+
		"\u0000\u0000FG\u0006\u0002\uffff\uffff\u0000GH\u0005\'\u0000\u0000Hf\u0006"+
		"\u0002\uffff\uffff\u0000IJ\u0005(\u0000\u0000Jf\u0006\u0002\uffff\uffff"+
		"\u0000KL\u0005)\u0000\u0000Lf\u0006\u0002\uffff\uffff\u0000MN\u0005*\u0000"+
		"\u0000Nf\u0006\u0002\uffff\uffff\u0000OP\u0003\f\u0006\u0000PQ\u0006\u0002"+
		"\uffff\uffff\u0000Qf\u0001\u0000\u0000\u0000RS\u0005\u0003\u0000\u0000"+
		"ST\u0003\u0004\u0002\u0000TU\u0005\u0004\u0000\u0000UV\u0006\u0002\uffff"+
		"\uffff\u0000Vf\u0001\u0000\u0000\u0000WX\u0005\u0003\u0000\u0000XY\u0003"+
		"\u0012\t\u0000YZ\u0005\u0004\u0000\u0000Z[\u0003\u0004\u0002\u0007[\\"+
		"\u0006\u0002\uffff\uffff\u0000\\f\u0001\u0000\u0000\u0000]^\u0005\u000b"+
		"\u0000\u0000^_\u0003\u0004\u0002\u0006_`\u0006\u0002\uffff\uffff\u0000"+
		"`f\u0001\u0000\u0000\u0000ab\u0005\f\u0000\u0000bc\u0003\u0004\u0002\u0005"+
		"cd\u0006\u0002\uffff\uffff\u0000df\u0001\u0000\u0000\u0000eF\u0001\u0000"+
		"\u0000\u0000eI\u0001\u0000\u0000\u0000eK\u0001\u0000\u0000\u0000eM\u0001"+
		"\u0000\u0000\u0000eO\u0001\u0000\u0000\u0000eR\u0001\u0000\u0000\u0000"+
		"eW\u0001\u0000\u0000\u0000e]\u0001\u0000\u0000\u0000ea\u0001\u0000\u0000"+
		"\u0000f\u0087\u0001\u0000\u0000\u0000gh\n\u0004\u0000\u0000hi\u0007\u0000"+
		"\u0000\u0000ij\u0003\u0004\u0002\u0005jk\u0006\u0002\uffff\uffff\u0000"+
		"k\u0086\u0001\u0000\u0000\u0000lm\n\u0003\u0000\u0000mn\u0007\u0001\u0000"+
		"\u0000no\u0003\u0004\u0002\u0004op\u0006\u0002\uffff\uffff\u0000p\u0086"+
		"\u0001\u0000\u0000\u0000qr\n\u0002\u0000\u0000rs\u0007\u0002\u0000\u0000"+
		"st\u0003\u0004\u0002\u0003tu\u0006\u0002\uffff\uffff\u0000u\u0086\u0001"+
		"\u0000\u0000\u0000vw\n\u0001\u0000\u0000wx\u0007\u0003\u0000\u0000xy\u0003"+
		"\u0004\u0002\u0002yz\u0006\u0002\uffff\uffff\u0000z\u0086\u0001\u0000"+
		"\u0000\u0000{|\n\t\u0000\u0000|}\u0005\b\u0000\u0000}~\u0003\u0004\u0002"+
		"\u0000~\u007f\u0005\t\u0000\u0000\u007f\u0080\u0006\u0002\uffff\uffff"+
		"\u0000\u0080\u0086\u0001\u0000\u0000\u0000\u0081\u0082\n\b\u0000\u0000"+
		"\u0082\u0083\u0005\n\u0000\u0000\u0083\u0084\u0005*\u0000\u0000\u0084"+
		"\u0086\u0006\u0002\uffff\uffff\u0000\u0085g\u0001\u0000\u0000\u0000\u0085"+
		"l\u0001\u0000\u0000\u0000\u0085q\u0001\u0000\u0000\u0000\u0085v\u0001"+
		"\u0000\u0000\u0000\u0085{\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000"+
		"\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0005\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0019"+
		"\u0000\u0000\u008b\u008c\u0003\u0004\u0002\u0000\u008c\u008d\u0005\u001a"+
		"\u0000\u0000\u008d\u008e\u0006\u0003\uffff\uffff\u0000\u008e\u00bc\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005\u001b\u0000\u0000\u0090\u0091\u0003"+
		"\n\u0005\u0000\u0091\u0092\u0005\u001a\u0000\u0000\u0092\u0093\u0006\u0003"+
		"\uffff\uffff\u0000\u0093\u00bc\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"\u001c\u0000\u0000\u0095\u0096\u0003\n\u0005\u0000\u0096\u0097\u0005\u001a"+
		"\u0000\u0000\u0097\u0098\u0006\u0003\uffff\uffff\u0000\u0098\u00bc\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0003\u0004\u0002\u0000\u009a\u009b\u0005"+
		"\u001d\u0000\u0000\u009b\u009c\u0003\u0004\u0002\u0000\u009c\u009d\u0005"+
		"\u001a\u0000\u0000\u009d\u009e\u0006\u0003\uffff\uffff\u0000\u009e\u00bc"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u001e\u0000\u0000\u00a0\u00a1"+
		"\u0003\u0004\u0002\u0000\u00a1\u00a2\u0005\u0005\u0000\u0000\u00a2\u00a3"+
		"\u0003\b\u0004\u0000\u00a3\u00a4\u0006\u0003\uffff\uffff\u0000\u00a4\u00bc"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u001f\u0000\u0000\u00a6\u00a7"+
		"\u0003\u0004\u0002\u0000\u00a7\u00a8\u0005\u0005\u0000\u0000\u00a8\u00ae"+
		"\u0003\b\u0004\u0000\u00a9\u00aa\u0005 \u0000\u0000\u00aa\u00ab\u0005"+
		"\u0005\u0000\u0000\u00ab\u00ac\u0003\b\u0004\u0000\u00ac\u00ad\u0006\u0003"+
		"\uffff\uffff\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0006\u0003\uffff\uffff\u0000\u00b1\u00bc"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\f\u0006\u0000\u00b3\u00b4\u0005"+
		"\u001a\u0000\u0000\u00b4\u00b5\u0006\u0003\uffff\uffff\u0000\u00b5\u00bc"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003\u0004\u0002\u0000\u00b7\u00b8"+
		"\u0005!\u0000\u0000\u00b8\u00b9\u0005\u001a\u0000\u0000\u00b9\u00ba\u0006"+
		"\u0003\uffff\uffff\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u008a"+
		"\u0001\u0000\u0000\u0000\u00bb\u008f\u0001\u0000\u0000\u0000\u00bb\u0094"+
		"\u0001\u0000\u0000\u0000\u00bb\u0099\u0001\u0000\u0000\u0000\u00bb\u009f"+
		"\u0001\u0000\u0000\u0000\u00bb\u00a5\u0001\u0000\u0000\u0000\u00bb\u00b2"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b6\u0001\u0000\u0000\u0000\u00bc\u0007"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\u0006\u0003\u0000\u00be\u00bf"+
		"\u0006\u0004\uffff\uffff\u0000\u00bf\u00cb\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c6\u0005\u0006\u0000\u0000\u00c1\u00c2\u0003\u0006\u0003\u0000\u00c2"+
		"\u00c3\u0006\u0004\uffff\uffff\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c9\u00cb\u0005\u0007\u0000\u0000\u00ca\u00bd\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c0\u0001\u0000\u0000\u0000\u00cb\t\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0003\u0004\u0002\u0000\u00cd\u00d4\u0006\u0005\uffff\uffff\u0000"+
		"\u00ce\u00cf\u0005\"\u0000\u0000\u00cf\u00d0\u0003\u0004\u0002\u0000\u00d0"+
		"\u00d1\u0006\u0005\uffff\uffff\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d7\u00cc\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u000b\u0001\u0000\u0000\u0000\u00d9\u00da\u0005*\u0000\u0000\u00da"+
		"\u00db\u0005\u0003\u0000\u0000\u00db\u00dc\u0003\n\u0005\u0000\u00dc\u00dd"+
		"\u0005\u0004\u0000\u0000\u00dd\u00de\u0006\u0006\uffff\uffff\u0000\u00de"+
		"\r\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0001\u0000\u0000\u00e0\u00e1"+
		"\u0005*\u0000\u0000\u00e1\u00e2\u0005\u0003\u0000\u0000\u00e2\u00e3\u0003"+
		"\u0010\b\u0000\u00e3\u00e4\u0005\u0004\u0000\u0000\u00e4\u00e8\u0005\u0005"+
		"\u0000\u0000\u00e5\u00e6\u0003\u0018\f\u0000\u00e6\u00e7\u0006\u0007\uffff"+
		"\uffff\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\u00f0\u0005\u0006\u0000\u0000\u00eb\u00ec\u0003\u001a"+
		"\r\u0000\u00ec\u00ed\u0006\u0007\uffff\uffff\u0000\u00ed\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f8\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0003\u0006\u0003\u0000\u00f4\u00f5\u0006\u0007"+
		"\uffff\uffff\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005"+
		"\u0007\u0000\u0000\u00fc\u00fd\u0006\u0007\uffff\uffff\u0000\u00fd\u000f"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003\u001c\u000e\u0000\u00ff\u0106"+
		"\u0006\b\uffff\uffff\u0000\u0100\u0101\u0005\"\u0000\u0000\u0101\u0102"+
		"\u0003\u001c\u000e\u0000\u0102\u0103\u0006\b\uffff\uffff\u0000\u0103\u0105"+
		"\u0001\u0000\u0000\u0000\u0104\u0100\u0001\u0000\u0000\u0000\u0105\u0108"+
		"\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106"+
		"\u0001\u0000\u0000\u0000\u0109\u00fe\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u0011\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0003\u0018\f\u0000\u010c\u010d\u0006\t\uffff\uffff\u0000\u010d\u011b"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0005\b\u0000\u0000\u010f\u0110\u0005"+
		"\'\u0000\u0000\u0110\u0111\u0005\t\u0000\u0000\u0111\u0112\u0003\u0012"+
		"\t\u0000\u0112\u0113\u0006\t\uffff\uffff\u0000\u0113\u011b\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0005#\u0000\u0000\u0115\u0116\u0005\u0006\u0000"+
		"\u0000\u0116\u0117\u0003\u0014\n\u0000\u0117\u0118\u0005\u0007\u0000\u0000"+
		"\u0118\u0119\u0006\t\uffff\uffff\u0000\u0119\u011b\u0001\u0000\u0000\u0000"+
		"\u011a\u010b\u0001\u0000\u0000\u0000\u011a\u010e\u0001\u0000\u0000\u0000"+
		"\u011a\u0114\u0001\u0000\u0000\u0000\u011b\u0013\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0003\u0016\u000b\u0000\u011d\u011e\u0005\u0005\u0000\u0000"+
		"\u011e\u011f\u0003\u0012\t\u0000\u011f\u0120\u0005\u001a\u0000\u0000\u0120"+
		"\u0121\u0006\n\uffff\uffff\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122"+
		"\u011c\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124"+
		"\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125"+
		"\u0015\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0005*\u0000\u0000\u0128\u012e\u0006\u000b\uffff\uffff\u0000\u0129"+
		"\u012a\u0005\"\u0000\u0000\u012a\u012b\u0005*\u0000\u0000\u012b\u012d"+
		"\u0006\u000b\uffff\uffff\u0000\u012c\u0129\u0001\u0000\u0000\u0000\u012d"+
		"\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0001\u0000\u0000\u0000\u012f\u0017\u0001\u0000\u0000\u0000\u0130"+
		"\u012e\u0001\u0000\u0000\u0000\u0131\u0132\u0005$\u0000\u0000\u0132\u0139"+
		"\u0006\f\uffff\uffff\u0000\u0133\u0134\u0005%\u0000\u0000\u0134\u0139"+
		"\u0006\f\uffff\uffff\u0000\u0135\u0136\u0005&\u0000\u0000\u0136\u0139"+
		"\u0006\f\uffff\uffff\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0131"+
		"\u0001\u0000\u0000\u0000\u0138\u0133\u0001\u0000\u0000\u0000\u0138\u0135"+
		"\u0001\u0000\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u0019"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0003\u0016\u000b\u0000\u013b\u013c"+
		"\u0005\u0005\u0000\u0000\u013c\u013d\u0003\u0012\t\u0000\u013d\u013e\u0005"+
		"\u001a\u0000\u0000\u013e\u013f\u0006\r\uffff\uffff\u0000\u013f\u001b\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0005*\u0000\u0000\u0141\u0142\u0005\u0005"+
		"\u0000\u0000\u0142\u0143\u0003\u0012\t\u0000\u0143\u0144\u0006\u000e\uffff"+
		"\uffff\u0000\u0144\u001d\u0001\u0000\u0000\u0000\u0016$&8@e\u0085\u0087"+
		"\u00ae\u00bb\u00c6\u00ca\u00d4\u00d7\u00e8\u00f0\u00f8\u0106\u0109\u011a"+
		"\u0124\u012e\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}