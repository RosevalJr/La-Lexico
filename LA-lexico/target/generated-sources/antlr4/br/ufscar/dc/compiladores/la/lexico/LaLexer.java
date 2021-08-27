// Generated from br/ufscar/dc/compiladores/la/lexico/LaLexer.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.la.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, NUM_INT=2, NUM_REAL=3, IDENT=4, CADEIA=5, COMENTARIO=6, 
		WS=7, OP_ARIT=8, OP_REL=9, OP_PON=10, DELIM=11, ATRIB=12, VIRGU=13, ABREPAR=14, 
		FECHAPAR=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "ESC_SEQ", 
			"COMENTARIO", "WS", "OP_ARIT", "OP_REL", "OP_PON", "DELIM", "ATRIB", 
			"VIRGU", "ABREPAR", "FECHAPAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "':'", 
			"'<-'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "COMENTARIO", 
			"WS", "OP_ARIT", "OP_REL", "OP_PON", "DELIM", "ATRIB", "VIRGU", "ABREPAR", 
			"FECHAPAR"
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


	public LaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LaLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0169\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2\u011b\n\2\3\3\6\3\u011e\n\3\r\3\16\3\u011f\3\4\6\4\u0123\n\4\r"+
		"\4\16\4\u0124\3\4\3\4\6\4\u0129\n\4\r\4\16\4\u012a\3\5\3\5\7\5\u012f\n"+
		"\5\f\5\16\5\u0132\13\5\3\6\3\6\3\6\7\6\u0137\n\6\f\6\16\6\u013a\13\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\7\b\u0143\n\b\f\b\16\b\u0146\13\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u015b\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\2\17\b\21\t\23\n\25\13\27"+
		"\f\31\r\33\16\35\17\37\20!\21\3\2\t\4\2C\\c|\6\2\62;C\\aac|\4\2$$^^\3"+
		"\2\177\177\5\2\13\f\17\17\"\"\6\2\'\',-//\61\61\6\2((\60\60]]_`\2\u0198"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3\u011a\3\2\2\2\5\u011d"+
		"\3\2\2\2\7\u0122\3\2\2\2\t\u012c\3\2\2\2\13\u0133\3\2\2\2\r\u013d\3\2"+
		"\2\2\17\u0140\3\2\2\2\21\u014b\3\2\2\2\23\u014f\3\2\2\2\25\u015a\3\2\2"+
		"\2\27\u015c\3\2\2\2\31\u015e\3\2\2\2\33\u0160\3\2\2\2\35\u0163\3\2\2\2"+
		"\37\u0165\3\2\2\2!\u0167\3\2\2\2#$\7c\2\2$%\7n\2\2%&\7i\2\2&\'\7q\2\2"+
		"\'(\7t\2\2()\7k\2\2)*\7v\2\2*+\7o\2\2+\u011b\7q\2\2,-\7f\2\2-.\7g\2\2"+
		"./\7e\2\2/\60\7n\2\2\60\61\7c\2\2\61\62\7t\2\2\62\u011b\7g\2\2\63\64\7"+
		"n\2\2\64\65\7k\2\2\65\66\7v\2\2\66\67\7g\2\2\678\7t\2\289\7c\2\29\u011b"+
		"\7n\2\2:;\7k\2\2;<\7p\2\2<=\7v\2\2=>\7g\2\2>?\7k\2\2?@\7t\2\2@\u011b\7"+
		"q\2\2AB\7h\2\2BC\7k\2\2CD\7o\2\2DE\7a\2\2EF\7c\2\2FG\7n\2\2GH\7i\2\2H"+
		"I\7q\2\2IJ\7t\2\2JK\7k\2\2KL\7v\2\2LM\7o\2\2M\u011b\7q\2\2NO\7n\2\2OP"+
		"\7g\2\2PQ\7k\2\2Q\u011b\7c\2\2RS\7g\2\2ST\7u\2\2TU\7e\2\2UV\7t\2\2VW\7"+
		"g\2\2WX\7x\2\2X\u011b\7c\2\2YZ\7t\2\2Z[\7g\2\2[\\\7c\2\2\\\u011b\7n\2"+
		"\2]\u011b\7g\2\2^_\7q\2\2_\u011b\7w\2\2`a\7p\2\2ab\7c\2\2b\u011b\7q\2"+
		"\2cd\7n\2\2de\7q\2\2ef\7i\2\2fg\7k\2\2gh\7e\2\2h\u011b\7q\2\2ij\7u\2\2"+
		"j\u011b\7g\2\2kl\7u\2\2lm\7g\2\2mn\7p\2\2no\7c\2\2o\u011b\7q\2\2pq\7h"+
		"\2\2qr\7k\2\2rs\7o\2\2st\7a\2\2tu\7u\2\2u\u011b\7g\2\2vw\7g\2\2wx\7p\2"+
		"\2xy\7v\2\2yz\7c\2\2z\u011b\7q\2\2{|\7e\2\2|}\7c\2\2}~\7u\2\2~\u011b\7"+
		"q\2\2\177\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081\u0082\7l\2\2\u0082\u011b"+
		"\7c\2\2\u0083\u0084\7\60\2\2\u0084\u011b\7\60\2\2\u0085\u0086\7h\2\2\u0086"+
		"\u0087\7k\2\2\u0087\u0088\7o\2\2\u0088\u0089\7a\2\2\u0089\u008a\7e\2\2"+
		"\u008a\u008b\7c\2\2\u008b\u008c\7u\2\2\u008c\u011b\7q\2\2\u008d\u008e"+
		"\7r\2\2\u008e\u008f\7c\2\2\u008f\u0090\7t\2\2\u0090\u011b\7c\2\2\u0091"+
		"\u0092\7h\2\2\u0092\u0093\7c\2\2\u0093\u0094\7e\2\2\u0094\u011b\7c\2\2"+
		"\u0095\u0096\7c\2\2\u0096\u0097\7v\2\2\u0097\u011b\7g\2\2\u0098\u0099"+
		"\7h\2\2\u0099\u009a\7k\2\2\u009a\u009b\7o\2\2\u009b\u009c\7a\2\2\u009c"+
		"\u009d\7r\2\2\u009d\u009e\7c\2\2\u009e\u009f\7t\2\2\u009f\u011b\7c\2\2"+
		"\u00a0\u00a1\7g\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7s\2\2\u00a3\u00a4"+
		"\7w\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"\u011b\7q\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7o\2\2"+
		"\u00ab\u00ac\7a\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af"+
		"\7s\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7p\2\2\u00b2"+
		"\u00b3\7v\2\2\u00b3\u011b\7q\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2"+
		"\u00b6\u00b7\7i\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba"+
		"\7v\2\2\u00ba\u00bb\7t\2\2\u00bb\u011b\7q\2\2\u00bc\u00bd\7h\2\2\u00bd"+
		"\u00be\7k\2\2\u00be\u00bf\7o\2\2\u00bf\u00c0\7a\2\2\u00c0\u00c1\7t\2\2"+
		"\u00c1\u00c2\7g\2\2\u00c2\u00c3\7i\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5"+
		"\7u\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7t\2\2\u00c7\u011b\7q\2\2\u00c8"+
		"\u00c9\7v\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7r\2\2\u00cb\u011b\7q\2\2"+
		"\u00cc\u00cd\7r\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0"+
		"\7e\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7o\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7v\2\2"+
		"\u00d7\u011b\7q\2\2\u00d8\u00d9\7x\2\2\u00d9\u00da\7c\2\2\u00da\u011b"+
		"\7t\2\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7o\2\2\u00de"+
		"\u00df\7a\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7q\2\2"+
		"\u00e2\u00e3\7e\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7f\2\2\u00e5\u00e6"+
		"\7k\2\2\u00e6\u00e7\7o\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7p\2\2\u00e9"+
		"\u00ea\7v\2\2\u00ea\u011b\7q\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7g\2\2"+
		"\u00ed\u00ee\7v\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1"+
		"\7p\2\2\u00f1\u011b\7g\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\7k\2\2\u00f4"+
		"\u00f5\7o\2\2\u00f5\u00f6\7a\2\2\u00f6\u00f7\7h\2\2\u00f7\u00f8\7w\2\2"+
		"\u00f8\u00f9\7p\2\2\u00f9\u00fa\7e\2\2\u00fa\u00fb\7c\2\2\u00fb\u011b"+
		"\7q\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7p\2\2\u00ff"+
		"\u0100\7e\2\2\u0100\u0101\7c\2\2\u0101\u011b\7q\2\2\u0102\u0103\7e\2\2"+
		"\u0103\u0104\7q\2\2\u0104\u0105\7p\2\2\u0105\u0106\7u\2\2\u0106\u0107"+
		"\7v\2\2\u0107\u0108\7c\2\2\u0108\u0109\7p\2\2\u0109\u010a\7v\2\2\u010a"+
		"\u011b\7g\2\2\u010b\u010c\7h\2\2\u010c\u010d\7c\2\2\u010d\u010e\7n\2\2"+
		"\u010e\u010f\7u\2\2\u010f\u011b\7q\2\2\u0110\u0111\7x\2\2\u0111\u0112"+
		"\7g\2\2\u0112\u0113\7t\2\2\u0113\u0114\7f\2\2\u0114\u0115\7c\2\2\u0115"+
		"\u0116\7f\2\2\u0116\u0117\7g\2\2\u0117\u0118\7k\2\2\u0118\u0119\7t\2\2"+
		"\u0119\u011b\7q\2\2\u011a#\3\2\2\2\u011a,\3\2\2\2\u011a\63\3\2\2\2\u011a"+
		":\3\2\2\2\u011aA\3\2\2\2\u011aN\3\2\2\2\u011aR\3\2\2\2\u011aY\3\2\2\2"+
		"\u011a]\3\2\2\2\u011a^\3\2\2\2\u011a`\3\2\2\2\u011ac\3\2\2\2\u011ai\3"+
		"\2\2\2\u011ak\3\2\2\2\u011ap\3\2\2\2\u011av\3\2\2\2\u011a{\3\2\2\2\u011a"+
		"\177\3\2\2\2\u011a\u0083\3\2\2\2\u011a\u0085\3\2\2\2\u011a\u008d\3\2\2"+
		"\2\u011a\u0091\3\2\2\2\u011a\u0095\3\2\2\2\u011a\u0098\3\2\2\2\u011a\u00a0"+
		"\3\2\2\2\u011a\u00a8\3\2\2\2\u011a\u00b4\3\2\2\2\u011a\u00bc\3\2\2\2\u011a"+
		"\u00c8\3\2\2\2\u011a\u00cc\3\2\2\2\u011a\u00d8\3\2\2\2\u011a\u00db\3\2"+
		"\2\2\u011a\u00eb\3\2\2\2\u011a\u00f2\3\2\2\2\u011a\u00fc\3\2\2\2\u011a"+
		"\u0102\3\2\2\2\u011a\u010b\3\2\2\2\u011a\u0110\3\2\2\2\u011b\4\3\2\2\2"+
		"\u011c\u011e\4\62;\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\6\3\2\2\2\u0121\u0123\4\62;\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0128\7\60\2\2\u0127\u0129\4\62;\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\b\3\2\2\2\u012c\u0130\t\2\2\2\u012d\u012f\t\3\2\2\u012e\u012d"+
		"\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\n\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0138\7$\2\2\u0134\u0137\5\r\7\2"+
		"\u0135\u0137\n\4\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u013a"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013c\7$\2\2\u013c\f\3\2\2\2\u013d\u013e\7^\2\2\u013e"+
		"\u013f\7$\2\2\u013f\16\3\2\2\2\u0140\u0144\7}\2\2\u0141\u0143\n\5\2\2"+
		"\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\177\2\2"+
		"\u0148\u0149\3\2\2\2\u0149\u014a\b\b\2\2\u014a\20\3\2\2\2\u014b\u014c"+
		"\t\6\2\2\u014c\u014d\3\2\2\2\u014d\u014e\b\t\2\2\u014e\22\3\2\2\2\u014f"+
		"\u0150\t\7\2\2\u0150\24\3\2\2\2\u0151\u015b\7@\2\2\u0152\u0153\7@\2\2"+
		"\u0153\u015b\7?\2\2\u0154\u015b\7>\2\2\u0155\u0156\7>\2\2\u0156\u015b"+
		"\7?\2\2\u0157\u0158\7>\2\2\u0158\u015b\7@\2\2\u0159\u015b\7?\2\2\u015a"+
		"\u0151\3\2\2\2\u015a\u0152\3\2\2\2\u015a\u0154\3\2\2\2\u015a\u0155\3\2"+
		"\2\2\u015a\u0157\3\2\2\2\u015a\u0159\3\2\2\2\u015b\26\3\2\2\2\u015c\u015d"+
		"\t\b\2\2\u015d\30\3\2\2\2\u015e\u015f\7<\2\2\u015f\32\3\2\2\2\u0160\u0161"+
		"\7>\2\2\u0161\u0162\7/\2\2\u0162\34\3\2\2\2\u0163\u0164\7.\2\2\u0164\36"+
		"\3\2\2\2\u0165\u0166\7*\2\2\u0166 \3\2\2\2\u0167\u0168\7+\2\2\u0168\""+
		"\3\2\2\2\f\2\u011a\u011f\u0124\u012a\u0130\u0136\u0138\u0144\u015a\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}