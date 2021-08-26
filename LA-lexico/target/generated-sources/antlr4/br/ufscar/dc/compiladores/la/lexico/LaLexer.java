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
		WS=7, OP_REL=8, OP_ARIT=9, DELIM=10, ATRIB=11, VIRGU=12, ABREPAR=13, FECHAPAR=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "ESC_SEQ", 
			"COMENTARIO", "WS", "OP_REL", "OP_ARIT", "DELIM", "ATRIB", "VIRGU", "ABREPAR", 
			"FECHAPAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "':'", "'<-'", 
			"','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "COMENTARIO", 
			"WS", "OP_REL", "OP_ARIT", "DELIM", "ATRIB", "VIRGU", "ABREPAR", "FECHAPAR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u010b\b\1\4\2"+
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
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00b9\n\2\3\3\5\3\u00bc\n\3\3\3\6\3\u00bf"+
		"\n\3\r\3\16\3\u00c0\3\4\5\4\u00c4\n\4\3\4\6\4\u00c7\n\4\r\4\16\4\u00c8"+
		"\3\4\3\4\6\4\u00cd\n\4\r\4\16\4\u00ce\3\5\3\5\7\5\u00d3\n\5\f\5\16\5\u00d6"+
		"\13\5\3\6\3\6\3\6\7\6\u00db\n\6\f\6\16\6\u00de\13\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\7\b\u00e7\n\b\f\b\16\b\u00ea\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00fd\n\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6"+
		"\13\7\r\2\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20\3\2\t\4\2-"+
		"-//\4\2C\\c|\5\2\62;C\\c|\4\2$$^^\3\2\177\177\5\2\13\f\17\17\"\"\5\2,"+
		"-//\61\61\2\u0131\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3\u00b8\3\2\2"+
		"\2\5\u00bb\3\2\2\2\7\u00c3\3\2\2\2\t\u00d0\3\2\2\2\13\u00d7\3\2\2\2\r"+
		"\u00e1\3\2\2\2\17\u00e4\3\2\2\2\21\u00ef\3\2\2\2\23\u00fc\3\2\2\2\25\u00fe"+
		"\3\2\2\2\27\u0100\3\2\2\2\31\u0102\3\2\2\2\33\u0105\3\2\2\2\35\u0107\3"+
		"\2\2\2\37\u0109\3\2\2\2!\"\7c\2\2\"#\7n\2\2#$\7i\2\2$%\7q\2\2%&\7t\2\2"+
		"&\'\7k\2\2\'(\7v\2\2()\7o\2\2)\u00b9\7q\2\2*+\7f\2\2+,\7g\2\2,-\7e\2\2"+
		"-.\7n\2\2./\7c\2\2/\60\7t\2\2\60\u00b9\7g\2\2\61\62\7n\2\2\62\63\7k\2"+
		"\2\63\64\7v\2\2\64\65\7g\2\2\65\66\7t\2\2\66\67\7c\2\2\67\u00b9\7n\2\2"+
		"89\7k\2\29:\7p\2\2:;\7v\2\2;<\7g\2\2<=\7k\2\2=>\7t\2\2>\u00b9\7q\2\2?"+
		"@\7h\2\2@A\7k\2\2AB\7o\2\2BC\7a\2\2CD\7c\2\2DE\7n\2\2EF\7i\2\2FG\7q\2"+
		"\2GH\7t\2\2HI\7k\2\2IJ\7v\2\2JK\7o\2\2K\u00b9\7q\2\2LM\7n\2\2MN\7g\2\2"+
		"NO\7k\2\2O\u00b9\7c\2\2PQ\7g\2\2QR\7u\2\2RS\7e\2\2ST\7t\2\2TU\7g\2\2U"+
		"V\7x\2\2V\u00b9\7c\2\2WX\7t\2\2XY\7g\2\2YZ\7c\2\2Z\u00b9\7n\2\2[\u00b9"+
		"\7g\2\2\\]\7q\2\2]\u00b9\7w\2\2^_\7p\2\2_`\7c\2\2`\u00b9\7q\2\2ab\7n\2"+
		"\2bc\7q\2\2cd\7i\2\2de\7k\2\2ef\7e\2\2f\u00b9\7q\2\2gh\7u\2\2h\u00b9\7"+
		"g\2\2ij\7u\2\2jk\7g\2\2kl\7p\2\2lm\7c\2\2m\u00b9\7q\2\2no\7h\2\2op\7k"+
		"\2\2pq\7o\2\2qr\7a\2\2rs\7u\2\2s\u00b9\7g\2\2tu\7g\2\2uv\7p\2\2vw\7v\2"+
		"\2wx\7c\2\2x\u00b9\7q\2\2yz\7e\2\2z{\7c\2\2{|\7u\2\2|\u00b9\7q\2\2}~\7"+
		"u\2\2~\177\7g\2\2\177\u0080\7l\2\2\u0080\u00b9\7c\2\2\u0081\u0082\7\60"+
		"\2\2\u0082\u00b9\7\60\2\2\u0083\u0084\7h\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7o\2\2\u0086\u0087\7a\2\2\u0087\u0088\7e\2\2\u0088\u0089\7c\2\2"+
		"\u0089\u008a\7u\2\2\u008a\u00b9\7q\2\2\u008b\u008c\7r\2\2\u008c\u008d"+
		"\7c\2\2\u008d\u008e\7t\2\2\u008e\u00b9\7c\2\2\u008f\u0090\7h\2\2\u0090"+
		"\u0091\7c\2\2\u0091\u0092\7e\2\2\u0092\u00b9\7c\2\2\u0093\u0094\7c\2\2"+
		"\u0094\u0095\7v\2\2\u0095\u00b9\7g\2\2\u0096\u0097\7h\2\2\u0097\u0098"+
		"\7k\2\2\u0098\u0099\7o\2\2\u0099\u009a\7a\2\2\u009a\u009b\7u\2\2\u009b"+
		"\u00b9\7g\2\2\u009c\u009d\7h\2\2\u009d\u009e\7k\2\2\u009e\u009f\7o\2\2"+
		"\u009f\u00a0\7a\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3"+
		"\7t\2\2\u00a3\u00b9\7c\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7p\2\2\u00a6"+
		"\u00a7\7s\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7p\2\2"+
		"\u00aa\u00ab\7v\2\2\u00ab\u00b9\7q\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae"+
		"\7k\2\2\u00ae\u00af\7o\2\2\u00af\u00b0\7a\2\2\u00b0\u00b1\7g\2\2\u00b1"+
		"\u00b2\7p\2\2\u00b2\u00b3\7s\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7c\2\2"+
		"\u00b5\u00b6\7p\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b9\7q\2\2\u00b8!\3\2\2"+
		"\2\u00b8*\3\2\2\2\u00b8\61\3\2\2\2\u00b88\3\2\2\2\u00b8?\3\2\2\2\u00b8"+
		"L\3\2\2\2\u00b8P\3\2\2\2\u00b8W\3\2\2\2\u00b8[\3\2\2\2\u00b8\\\3\2\2\2"+
		"\u00b8^\3\2\2\2\u00b8a\3\2\2\2\u00b8g\3\2\2\2\u00b8i\3\2\2\2\u00b8n\3"+
		"\2\2\2\u00b8t\3\2\2\2\u00b8y\3\2\2\2\u00b8}\3\2\2\2\u00b8\u0081\3\2\2"+
		"\2\u00b8\u0083\3\2\2\2\u00b8\u008b\3\2\2\2\u00b8\u008f\3\2\2\2\u00b8\u0093"+
		"\3\2\2\2\u00b8\u0096\3\2\2\2\u00b8\u009c\3\2\2\2\u00b8\u00a4\3\2\2\2\u00b8"+
		"\u00ac\3\2\2\2\u00b9\4\3\2\2\2\u00ba\u00bc\t\2\2\2\u00bb\u00ba\3\2\2\2"+
		"\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\4\62;\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\6\3\2\2\2\u00c2\u00c4\t\2\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2"+
		"\u00c4\u00c6\3\2\2\2\u00c5\u00c7\4\62;\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\7\60\2\2\u00cb\u00cd\4\62;\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\b\3\2\2\2\u00d0\u00d4"+
		"\t\3\2\2\u00d1\u00d3\t\4\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\n\3\2\2\2\u00d6\u00d4\3\2\2\2"+
		"\u00d7\u00dc\7$\2\2\u00d8\u00db\5\r\7\2\u00d9\u00db\n\5\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7$"+
		"\2\2\u00e0\f\3\2\2\2\u00e1\u00e2\7^\2\2\u00e2\u00e3\7$\2\2\u00e3\16\3"+
		"\2\2\2\u00e4\u00e8\7}\2\2\u00e5\u00e7\n\6\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\177\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\b\b\2\2\u00ee\20\3\2\2\2\u00ef\u00f0\t\7\2\2\u00f0\u00f1\3\2\2"+
		"\2\u00f1\u00f2\b\t\2\2\u00f2\22\3\2\2\2\u00f3\u00fd\7@\2\2\u00f4\u00f5"+
		"\7@\2\2\u00f5\u00fd\7?\2\2\u00f6\u00fd\7>\2\2\u00f7\u00f8\7>\2\2\u00f8"+
		"\u00fd\7?\2\2\u00f9\u00fa\7>\2\2\u00fa\u00fd\7@\2\2\u00fb\u00fd\7?\2\2"+
		"\u00fc\u00f3\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f7"+
		"\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\24\3\2\2\2\u00fe"+
		"\u00ff\t\b\2\2\u00ff\26\3\2\2\2\u0100\u0101\7<\2\2\u0101\30\3\2\2\2\u0102"+
		"\u0103\7>\2\2\u0103\u0104\7/\2\2\u0104\32\3\2\2\2\u0105\u0106\7.\2\2\u0106"+
		"\34\3\2\2\2\u0107\u0108\7*\2\2\u0108\36\3\2\2\2\u0109\u010a\7+\2\2\u010a"+
		" \3\2\2\2\16\2\u00b8\u00bb\u00c0\u00c3\u00c8\u00ce\u00d4\u00da\u00dc\u00e8"+
		"\u00fc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}