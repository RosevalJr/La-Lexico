// Generated from br\u005Cufscar\dc\compiladores\la\lexico\LaLexer.g4 by ANTLR 4.7.2
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
			"PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "COMENTARIO", 
			"WS", "OP_ARIT", "OP_REL", "OP_PON", "DELIM", "ATRIB", "VIRGU", "ABREPAR", 
			"FECHAPAR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0163\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
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
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0119"+
		"\n\2\3\3\6\3\u011c\n\3\r\3\16\3\u011d\3\4\6\4\u0121\n\4\r\4\16\4\u0122"+
		"\3\4\3\4\6\4\u0127\n\4\r\4\16\4\u0128\3\5\3\5\7\5\u012d\n\5\f\5\16\5\u0130"+
		"\13\5\3\6\3\6\7\6\u0134\n\6\f\6\16\6\u0137\13\6\3\6\3\6\3\7\3\7\7\7\u013d"+
		"\n\7\f\7\16\7\u0140\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0155\n\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\t\4\2C\\c|\6\2\62"+
		";C\\aac|\5\2\f\f\17\17$$\5\2\f\f\17\17\177\177\5\2\13\f\17\17\"\"\6\2"+
		"\'\',-//\61\61\6\2((\60\60]]_`\2\u0192\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\3\u0118\3\2\2\2\5\u011b\3\2\2\2\7\u0120\3\2\2\2\t"+
		"\u012a\3\2\2\2\13\u0131\3\2\2\2\r\u013a\3\2\2\2\17\u0145\3\2\2\2\21\u0149"+
		"\3\2\2\2\23\u0154\3\2\2\2\25\u0156\3\2\2\2\27\u0158\3\2\2\2\31\u015a\3"+
		"\2\2\2\33\u015d\3\2\2\2\35\u015f\3\2\2\2\37\u0161\3\2\2\2!\"\7c\2\2\""+
		"#\7n\2\2#$\7i\2\2$%\7q\2\2%&\7t\2\2&\'\7k\2\2\'(\7v\2\2()\7o\2\2)\u0119"+
		"\7q\2\2*+\7f\2\2+,\7g\2\2,-\7e\2\2-.\7n\2\2./\7c\2\2/\60\7t\2\2\60\u0119"+
		"\7g\2\2\61\62\7n\2\2\62\63\7k\2\2\63\64\7v\2\2\64\65\7g\2\2\65\66\7t\2"+
		"\2\66\67\7c\2\2\67\u0119\7n\2\289\7k\2\29:\7p\2\2:;\7v\2\2;<\7g\2\2<="+
		"\7k\2\2=>\7t\2\2>\u0119\7q\2\2?@\7h\2\2@A\7k\2\2AB\7o\2\2BC\7a\2\2CD\7"+
		"c\2\2DE\7n\2\2EF\7i\2\2FG\7q\2\2GH\7t\2\2HI\7k\2\2IJ\7v\2\2JK\7o\2\2K"+
		"\u0119\7q\2\2LM\7n\2\2MN\7g\2\2NO\7k\2\2O\u0119\7c\2\2PQ\7g\2\2QR\7u\2"+
		"\2RS\7e\2\2ST\7t\2\2TU\7g\2\2UV\7x\2\2V\u0119\7c\2\2WX\7t\2\2XY\7g\2\2"+
		"YZ\7c\2\2Z\u0119\7n\2\2[\u0119\7g\2\2\\]\7q\2\2]\u0119\7w\2\2^_\7p\2\2"+
		"_`\7c\2\2`\u0119\7q\2\2ab\7n\2\2bc\7q\2\2cd\7i\2\2de\7k\2\2ef\7e\2\2f"+
		"\u0119\7q\2\2gh\7u\2\2h\u0119\7g\2\2ij\7u\2\2jk\7g\2\2kl\7p\2\2lm\7c\2"+
		"\2m\u0119\7q\2\2no\7h\2\2op\7k\2\2pq\7o\2\2qr\7a\2\2rs\7u\2\2s\u0119\7"+
		"g\2\2tu\7g\2\2uv\7p\2\2vw\7v\2\2wx\7c\2\2x\u0119\7q\2\2yz\7e\2\2z{\7c"+
		"\2\2{|\7u\2\2|\u0119\7q\2\2}~\7u\2\2~\177\7g\2\2\177\u0080\7l\2\2\u0080"+
		"\u0119\7c\2\2\u0081\u0082\7\60\2\2\u0082\u0119\7\60\2\2\u0083\u0084\7"+
		"h\2\2\u0084\u0085\7k\2\2\u0085\u0086\7o\2\2\u0086\u0087\7a\2\2\u0087\u0088"+
		"\7e\2\2\u0088\u0089\7c\2\2\u0089\u008a\7u\2\2\u008a\u0119\7q\2\2\u008b"+
		"\u008c\7r\2\2\u008c\u008d\7c\2\2\u008d\u008e\7t\2\2\u008e\u0119\7c\2\2"+
		"\u008f\u0090\7h\2\2\u0090\u0091\7c\2\2\u0091\u0092\7e\2\2\u0092\u0119"+
		"\7c\2\2\u0093\u0094\7c\2\2\u0094\u0095\7v\2\2\u0095\u0119\7g\2\2\u0096"+
		"\u0097\7h\2\2\u0097\u0098\7k\2\2\u0098\u0099\7o\2\2\u0099\u009a\7a\2\2"+
		"\u009a\u009b\7r\2\2\u009b\u009c\7c\2\2\u009c\u009d\7t\2\2\u009d\u0119"+
		"\7c\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7s\2\2\u00a1"+
		"\u00a2\7w\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2"+
		"\u00a5\u0119\7q\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9"+
		"\7o\2\2\u00a9\u00aa\7a\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7p\2\2\u00ac"+
		"\u00ad\7s\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7p\2\2"+
		"\u00b0\u00b1\7v\2\2\u00b1\u0119\7q\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4"+
		"\7g\2\2\u00b4\u00b5\7i\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7u\2\2\u00b7"+
		"\u00b8\7v\2\2\u00b8\u00b9\7t\2\2\u00b9\u0119\7q\2\2\u00ba\u00bb\7h\2\2"+
		"\u00bb\u00bc\7k\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7a\2\2\u00be\u00bf"+
		"\7t\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2\7k\2\2\u00c2"+
		"\u00c3\7u\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7t\2\2\u00c5\u0119\7q\2\2"+
		"\u00c6\u00c7\7v\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7r\2\2\u00c9\u0119"+
		"\7q\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7q\2\2\u00cd"+
		"\u00ce\7e\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7k\2\2"+
		"\u00d1\u00d2\7o\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5"+
		"\7v\2\2\u00d5\u0119\7q\2\2\u00d6\u00d7\7x\2\2\u00d7\u00d8\7c\2\2\u00d8"+
		"\u0119\7t\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7o\2\2"+
		"\u00dc\u00dd\7a\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7t\2\2\u00df\u00e0"+
		"\7q\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7f\2\2\u00e3"+
		"\u00e4\7k\2\2\u00e4\u00e5\7o\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7p\2\2"+
		"\u00e7\u00e8\7v\2\2\u00e8\u0119\7q\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb"+
		"\7g\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7t\2\2\u00ee"+
		"\u00ef\7p\2\2\u00ef\u0119\7g\2\2\u00f0\u00f1\7h\2\2\u00f1\u00f2\7k\2\2"+
		"\u00f2\u00f3\7o\2\2\u00f3\u00f4\7a\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6"+
		"\7w\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7c\2\2\u00f9"+
		"\u0119\7q\2\2\u00fa\u00fb\7h\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7p\2\2"+
		"\u00fd\u00fe\7e\2\2\u00fe\u00ff\7c\2\2\u00ff\u0119\7q\2\2\u0100\u0101"+
		"\7e\2\2\u0101\u0102\7q\2\2\u0102\u0103\7p\2\2\u0103\u0104\7u\2\2\u0104"+
		"\u0105\7v\2\2\u0105\u0106\7c\2\2\u0106\u0107\7p\2\2\u0107\u0108\7v\2\2"+
		"\u0108\u0119\7g\2\2\u0109\u010a\7h\2\2\u010a\u010b\7c\2\2\u010b\u010c"+
		"\7n\2\2\u010c\u010d\7u\2\2\u010d\u0119\7q\2\2\u010e\u010f\7x\2\2\u010f"+
		"\u0110\7g\2\2\u0110\u0111\7t\2\2\u0111\u0112\7f\2\2\u0112\u0113\7c\2\2"+
		"\u0113\u0114\7f\2\2\u0114\u0115\7g\2\2\u0115\u0116\7k\2\2\u0116\u0117"+
		"\7t\2\2\u0117\u0119\7q\2\2\u0118!\3\2\2\2\u0118*\3\2\2\2\u0118\61\3\2"+
		"\2\2\u01188\3\2\2\2\u0118?\3\2\2\2\u0118L\3\2\2\2\u0118P\3\2\2\2\u0118"+
		"W\3\2\2\2\u0118[\3\2\2\2\u0118\\\3\2\2\2\u0118^\3\2\2\2\u0118a\3\2\2\2"+
		"\u0118g\3\2\2\2\u0118i\3\2\2\2\u0118n\3\2\2\2\u0118t\3\2\2\2\u0118y\3"+
		"\2\2\2\u0118}\3\2\2\2\u0118\u0081\3\2\2\2\u0118\u0083\3\2\2\2\u0118\u008b"+
		"\3\2\2\2\u0118\u008f\3\2\2\2\u0118\u0093\3\2\2\2\u0118\u0096\3\2\2\2\u0118"+
		"\u009e\3\2\2\2\u0118\u00a6\3\2\2\2\u0118\u00b2\3\2\2\2\u0118\u00ba\3\2"+
		"\2\2\u0118\u00c6\3\2\2\2\u0118\u00ca\3\2\2\2\u0118\u00d6\3\2\2\2\u0118"+
		"\u00d9\3\2\2\2\u0118\u00e9\3\2\2\2\u0118\u00f0\3\2\2\2\u0118\u00fa\3\2"+
		"\2\2\u0118\u0100\3\2\2\2\u0118\u0109\3\2\2\2\u0118\u010e\3\2\2\2\u0119"+
		"\4\3\2\2\2\u011a\u011c\4\62;\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2"+
		"\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\6\3\2\2\2\u011f\u0121\4"+
		"\62;\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\7\60\2\2\u0125\u0127\4"+
		"\62;\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\b\3\2\2\2\u012a\u012e\t\2\2\2\u012b\u012d\t\3\2\2"+
		"\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\n\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0135\7$\2\2\u0132"+
		"\u0134\n\4\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u0139\7$\2\2\u0139\f\3\2\2\2\u013a\u013e\7}\2\2\u013b\u013d\n\5\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\177\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\b\7\2\2\u0144\16\3\2\2\2\u0145\u0146\t\6\2"+
		"\2\u0146\u0147\3\2\2\2\u0147\u0148\b\b\2\2\u0148\20\3\2\2\2\u0149\u014a"+
		"\t\7\2\2\u014a\22\3\2\2\2\u014b\u0155\7@\2\2\u014c\u014d\7@\2\2\u014d"+
		"\u0155\7?\2\2\u014e\u0155\7>\2\2\u014f\u0150\7>\2\2\u0150\u0155\7?\2\2"+
		"\u0151\u0152\7>\2\2\u0152\u0155\7@\2\2\u0153\u0155\7?\2\2\u0154\u014b"+
		"\3\2\2\2\u0154\u014c\3\2\2\2\u0154\u014e\3\2\2\2\u0154\u014f\3\2\2\2\u0154"+
		"\u0151\3\2\2\2\u0154\u0153\3\2\2\2\u0155\24\3\2\2\2\u0156\u0157\t\b\2"+
		"\2\u0157\26\3\2\2\2\u0158\u0159\7<\2\2\u0159\30\3\2\2\2\u015a\u015b\7"+
		">\2\2\u015b\u015c\7/\2\2\u015c\32\3\2\2\2\u015d\u015e\7.\2\2\u015e\34"+
		"\3\2\2\2\u015f\u0160\7*\2\2\u0160\36\3\2\2\2\u0161\u0162\7+\2\2\u0162"+
		" \3\2\2\2\13\2\u0118\u011d\u0122\u0128\u012e\u0135\u013e\u0154\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}