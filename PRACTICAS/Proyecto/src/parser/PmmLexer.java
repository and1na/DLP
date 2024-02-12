// Generated from /home/nof4c3/Documents/uni/DLP/PRACTICAS/Proyecto/src/parser/Pmm.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_CONSTANT=1, ONE_LINE_COMMENT=2, MULTI_LINE_COMMENT=3, IDENTIFIER=4, 
		SPACE=5, TRASH=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_CONSTANT", "ONE_LINE_COMMENT", "MULTI_LINE_COMMENT", "IDENTIFIER", 
			"LETRA", "SPACE", "TRASH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_CONSTANT", "ONE_LINE_COMMENT", "MULTI_LINE_COMMENT", "IDENTIFIER", 
			"SPACE", "TRASH"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0006J\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001"+
		"\u0000\u0003\u0000\u0018\b\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u001c"+
		"\b\u0001\n\u0001\f\u0001\u001f\t\u0001\u0001\u0001\u0003\u0001\"\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002*\b\u0002\n\u0002\f\u0002-\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0003\u00037\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"<\b\u0003\n\u0003\f\u0003?\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0002\u001d+\u0000\u0007\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0000\u000b\u0005\r\u0006\u0001\u0000\u0005\u0001\u0000"+
		"19\u0001\u000009\u0001\u0001\n\n\u0002\u0000AZaz\u0002\u0000\n\n\r\rP"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001"+
		"\u0017\u0001\u0000\u0000\u0000\u0003\u0019\u0001\u0000\u0000\u0000\u0005"+
		"%\u0001\u0000\u0000\u0000\u00076\u0001\u0000\u0000\u0000\t@\u0001\u0000"+
		"\u0000\u0000\u000bB\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000"+
		"\u000f\u0013\u0007\u0000\u0000\u0000\u0010\u0012\u0007\u0001\u0000\u0000"+
		"\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000"+
		"\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000"+
		"\u0014\u0018\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000"+
		"\u0016\u0018\u00050\u0000\u0000\u0017\u000f\u0001\u0000\u0000\u0000\u0017"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000\u0019"+
		"\u001d\u0005#\u0000\u0000\u001a\u001c\t\u0000\u0000\u0000\u001b\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e!\u0001"+
		"\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 \"\u0007\u0002"+
		"\u0000\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0006"+
		"\u0001\u0000\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005\"\u0000\u0000"+
		"&\'\u0005\"\u0000\u0000\'+\u0005\"\u0000\u0000(*\t\u0000\u0000\u0000)"+
		"(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000"+
		"\u0000\u0000./\u0005\"\u0000\u0000/0\u0005\"\u0000\u000001\u0005\"\u0000"+
		"\u000012\u0001\u0000\u0000\u000023\u0006\u0002\u0000\u00003\u0006\u0001"+
		"\u0000\u0000\u000047\u0005_\u0000\u000057\u0003\t\u0004\u000064\u0001"+
		"\u0000\u0000\u000065\u0001\u0000\u0000\u00007=\u0001\u0000\u0000\u0000"+
		"8<\u0003\t\u0004\u00009<\u0003\u0001\u0000\u0000:<\u0005_\u0000\u0000"+
		";8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000"+
		"\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>\b\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0007"+
		"\u0003\u0000\u0000A\n\u0001\u0000\u0000\u0000BC\u0005 \u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DE\u0006\u0005\u0000\u0000E\f\u0001\u0000\u0000\u0000"+
		"FG\u0007\u0004\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0006\u0006\u0000"+
		"\u0000I\u000e\u0001\u0000\u0000\u0000\t\u0000\u0013\u0017\u001d!+6;=\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}