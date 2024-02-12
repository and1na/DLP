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
		INT_CONSTANT=1, REAL_CONSTANT=2, CHAR_CONSTANT=3, IDENTIFIER=4, ONE_LINE_COMMENT=5, 
		MULTI_LINE_COMMENT=6, SPACE=7, TRASH=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "IDENTIFIER", "ONE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "SPACE", "TRASH", "EXPLICIT_CHAR", "NUMERIC_CHAR", 
			"SPECIAL_CHAR", "LETRA", "DOTTED_REAL", "EXPONENT_REAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "IDENTIFIER", 
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
		"\u0004\u0000\b\u009a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0005"+
		"\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0003\u0000&\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"3\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00038\b\u0003\n\u0003"+
		"\f\u0003;\t\u0003\u0001\u0004\u0001\u0004\u0005\u0004?\b\u0004\n\u0004"+
		"\f\u0004B\t\u0004\u0001\u0004\u0003\u0004E\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005M\b\u0005"+
		"\n\u0005\f\u0005P\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0005\ft\b\f\n\f\f\fw\t\f\u0001\f\u0003\fz\b\f\u0001\f\u0001\f\u0004"+
		"\f~\b\f\u000b\f\f\f\u007f\u0001\f\u0001\f\u0005\f\u0084\b\f\n\f\f\f\u0087"+
		"\t\f\u0001\f\u0004\f\u008a\b\f\u000b\f\f\f\u008b\u0001\f\u0003\f\u008f"+
		"\b\f\u0001\r\u0001\r\u0003\r\u0093\b\r\u0001\r\u0001\r\u0003\r\u0097\b"+
		"\r\u0001\r\u0001\r\u0002@N\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\u0000\u0013\u0000"+
		"\u0015\u0000\u0017\u0000\u0019\u0000\u001b\u0000\u0001\u0000\b\u0001\u0000"+
		"19\u0001\u000009\u0001\u0001\n\n\u0002\u0000\t\n\r\r\u0002\u0000nntt\u0002"+
		"\u0000AZaz\u0002\u0000EEee\u0002\u0000++--\u00a8\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003"+
		")\u0001\u0000\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u00072\u0001"+
		"\u0000\u0000\u0000\t<\u0001\u0000\u0000\u0000\u000bH\u0001\u0000\u0000"+
		"\u0000\rW\u0001\u0000\u0000\u0000\u000f[\u0001\u0000\u0000\u0000\u0011"+
		"_\u0001\u0000\u0000\u0000\u0013c\u0001\u0000\u0000\u0000\u0015i\u0001"+
		"\u0000\u0000\u0000\u0017o\u0001\u0000\u0000\u0000\u0019\u008e\u0001\u0000"+
		"\u0000\u0000\u001b\u0092\u0001\u0000\u0000\u0000\u001d!\u0007\u0000\u0000"+
		"\u0000\u001e \u0007\u0001\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		" #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"&\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$&\u0005"+
		"0\u0000\u0000%\u001d\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000"+
		"&\u0002\u0001\u0000\u0000\u0000\'*\u0003\u0019\f\u0000(*\u0003\u001b\r"+
		"\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0004\u0001"+
		"\u0000\u0000\u0000+/\u0003\u0011\b\u0000,/\u0003\u0013\t\u0000-/\u0003"+
		"\u0015\n\u0000.+\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000.-\u0001"+
		"\u0000\u0000\u0000/\u0006\u0001\u0000\u0000\u000003\u0005_\u0000\u0000"+
		"13\u0003\u0017\u000b\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000"+
		"\u000039\u0001\u0000\u0000\u000048\u0003\u0017\u000b\u000058\u0003\u0001"+
		"\u0000\u000068\u0005_\u0000\u000074\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\b\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000<@\u0005#\u0000\u0000=?\t\u0000\u0000\u0000"+
		">=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000CE\u0007\u0002\u0000\u0000DC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FG\u0006\u0004\u0000\u0000G\n\u0001\u0000\u0000\u0000"+
		"HI\u0005\"\u0000\u0000IJ\u0005\"\u0000\u0000JN\u0005\"\u0000\u0000KM\t"+
		"\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000QR\u0005\"\u0000\u0000RS\u0005\"\u0000"+
		"\u0000ST\u0005\"\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0006\u0005\u0000"+
		"\u0000V\f\u0001\u0000\u0000\u0000WX\u0005 \u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000YZ\u0006\u0006\u0000\u0000Z\u000e\u0001\u0000\u0000\u0000[\\\u0007"+
		"\u0003\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0006\u0007\u0000\u0000"+
		"^\u0010\u0001\u0000\u0000\u0000_`\u0005\'\u0000\u0000`a\t\u0000\u0000"+
		"\u0000ab\u0005\'\u0000\u0000b\u0012\u0001\u0000\u0000\u0000cd\u0005\'"+
		"\u0000\u0000de\u0005\\\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0003\u0001"+
		"\u0000\u0000gh\u0005\'\u0000\u0000h\u0014\u0001\u0000\u0000\u0000ij\u0005"+
		"\'\u0000\u0000jk\u0005\\\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0007"+
		"\u0004\u0000\u0000mn\u0005\'\u0000\u0000n\u0016\u0001\u0000\u0000\u0000"+
		"op\u0007\u0005\u0000\u0000p\u0018\u0001\u0000\u0000\u0000qu\u0007\u0000"+
		"\u0000\u0000rt\u0007\u0001\u0000\u0000sr\u0001\u0000\u0000\u0000tw\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vz\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xz\u00050\u0000\u0000"+
		"yq\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{}\u0005.\u0000\u0000|~\u0007\u0001\u0000"+
		"\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u008f"+
		"\u0001\u0000\u0000\u0000\u0081\u0085\u0007\u0000\u0000\u0000\u0082\u0084"+
		"\u0007\u0001\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u008a\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u008a\u00050\u0000\u0000\u0089\u0081\u0001"+
		"\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0005"+
		".\u0000\u0000\u008ey\u0001\u0000\u0000\u0000\u008e\u0089\u0001\u0000\u0000"+
		"\u0000\u008f\u001a\u0001\u0000\u0000\u0000\u0090\u0093\u0003\u0019\f\u0000"+
		"\u0091\u0093\u0003\u0001\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0096\u0007\u0006\u0000\u0000\u0095\u0097\u0007\u0007\u0000\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0003\u0001\u0000\u0000"+
		"\u0099\u001c\u0001\u0000\u0000\u0000\u0014\u0000!%).279@DNuy\u007f\u0085"+
		"\u0089\u008b\u008e\u0092\u0096\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}