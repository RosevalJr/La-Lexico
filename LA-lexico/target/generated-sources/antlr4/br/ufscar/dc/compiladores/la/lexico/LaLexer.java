// Generated from br/ufscar/dc/compiladores/la/lexico/LaLexer.g4 by ANTLR 4.3
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
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Letra=1, Digito=2, Variavel=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'"
	};
	public static final String[] ruleNames = {
		"Letra", "Digito", "Variavel"
	};


	public LaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LaLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2: Variavel_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void Variavel_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  System.out.println("[Var,"+getText()+"]");  break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\5\27\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4\21\n\4\f\4\16\4\24\13"+
		"\4\3\4\3\4\2\2\5\3\3\5\4\7\5\3\2\3\4\2C\\c|\30\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\3\t\3\2\2\2\5\13\3\2\2\2\7\r\3\2\2\2\t\n\t\2\2\2\n\4\3\2"+
		"\2\2\13\f\4\62;\2\f\6\3\2\2\2\r\22\5\3\2\2\16\21\5\3\2\2\17\21\5\5\3\2"+
		"\20\16\3\2\2\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2"+
		"\23\25\3\2\2\2\24\22\3\2\2\2\25\26\b\4\2\2\26\b\3\2\2\2\5\2\20\22\3\3"+
		"\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}