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
		PALAVRA_CHAVE=1, NUMINT=2, NUMREAL=3, IDENT=4, CADEIA=5, COMENTARIO=6, 
		WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUMINT", "NUMREAL", "IDENT", "CADEIA", "ESC_SEQ", "COMENTARIO", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUMINT", "NUMREAL", "IDENT", "CADEIA", "COMENTARIO", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u0084\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2K\n\2\3\3\5\3N\n\3\3\3\6\3Q\n\3\r\3\16\3R\3\4\5\4V\n\4\3\4\6\4Y\n\4"+
		"\r\4\16\4Z\3\4\3\4\6\4_\n\4\r\4\16\4`\3\5\3\5\6\5e\n\5\r\5\16\5f\3\6\3"+
		"\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\7\bx\n\b\f"+
		"\b\16\b{\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13"+
		"\7\r\2\17\b\21\t\3\2\t\5\2*+..<<\4\2--//\4\2C\\c|\5\2\62;C\\c|\4\2))^"+
		"^\3\2\177\177\5\2\13\f\17\17\"\"\2\u0092\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3J\3\2\2\2\5"+
		"M\3\2\2\2\7U\3\2\2\2\tb\3\2\2\2\13h\3\2\2\2\rr\3\2\2\2\17u\3\2\2\2\21"+
		"\u0080\3\2\2\2\23\24\7c\2\2\24\25\7n\2\2\25\26\7i\2\2\26\27\7q\2\2\27"+
		"\30\7t\2\2\30\31\7k\2\2\31\32\7v\2\2\32\33\7o\2\2\33K\7q\2\2\34\35\7f"+
		"\2\2\35\36\7g\2\2\36\37\7e\2\2\37 \7n\2\2 !\7c\2\2!\"\7t\2\2\"K\7g\2\2"+
		"#$\7n\2\2$%\7k\2\2%&\7v\2\2&\'\7g\2\2\'(\7t\2\2()\7c\2\2)K\7n\2\2*+\7"+
		"k\2\2+,\7p\2\2,-\7v\2\2-.\7g\2\2./\7k\2\2/\60\7t\2\2\60K\7q\2\2\61\62"+
		"\7h\2\2\62\63\7k\2\2\63\64\7o\2\2\64\65\7a\2\2\65\66\7c\2\2\66\67\7n\2"+
		"\2\678\7i\2\289\7q\2\29:\7t\2\2:;\7k\2\2;<\7v\2\2<=\7o\2\2=K\7q\2\2>K"+
		"\t\2\2\2?@\7n\2\2@A\7g\2\2AB\7k\2\2BK\7c\2\2CD\7g\2\2DE\7u\2\2EF\7e\2"+
		"\2FG\7t\2\2GH\7g\2\2HI\7x\2\2IK\7c\2\2J\23\3\2\2\2J\34\3\2\2\2J#\3\2\2"+
		"\2J*\3\2\2\2J\61\3\2\2\2J>\3\2\2\2J?\3\2\2\2JC\3\2\2\2K\4\3\2\2\2LN\t"+
		"\3\2\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OQ\4\62;\2PO\3\2\2\2QR\3\2\2\2RP\3"+
		"\2\2\2RS\3\2\2\2S\6\3\2\2\2TV\t\3\2\2UT\3\2\2\2UV\3\2\2\2VX\3\2\2\2WY"+
		"\4\62;\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\7\60\2"+
		"\2]_\4\62;\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\b\3\2\2\2bd\t\4"+
		"\2\2ce\t\5\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\n\3\2\2\2hm\7"+
		")\2\2il\5\r\7\2jl\n\6\2\2ki\3\2\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3"+
		"\2\2\2np\3\2\2\2om\3\2\2\2pq\7)\2\2q\f\3\2\2\2rs\7^\2\2st\7)\2\2t\16\3"+
		"\2\2\2uy\7}\2\2vx\n\7\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3"+
		"\2\2\2{y\3\2\2\2|}\7\177\2\2}~\3\2\2\2~\177\b\b\2\2\177\20\3\2\2\2\u0080"+
		"\u0081\t\b\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\t\2\2\u0083\22\3\2\2"+
		"\2\r\2JMRUZ`fkmy\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}