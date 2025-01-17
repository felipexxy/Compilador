// Generated from app/src/main/java/fejosa/Gramatica.g4 by ANTLR 4.13.2
package fejosa;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIS=1, SETA=2, MENOS=3, ASTERISCO=4, BARRA=5, BARRA_INVERTIDA=6, ABRE_PARENTESE=7, 
		FECHA_PARENTESE=8, ABRE_COLCHETE=9, FECHA_COLCHETE=10, ABRE_CHAVE=11, 
		FECHA_CHAVE=12, E_LOGICO=13, E_BINARIO=14, OU_LOGICO=15, OU_BINARIO=16, 
		PONTO_PONTO=17, PONTO=18, VIRGULA=19, PONTO_E_VIRGULA=20, DOIS_PONTOS=21, 
		PORCENTO=22, MAIOR=23, MAIOR_IGUAL=24, MENOR=25, MENOR_IGUAL=26, IGUAL=27, 
		DIFERENTE=28, ATRIBUICAO=29, EXCLAMACAO=30, NUMERO=31, COMENTARIO=32, 
		COMENTARIO_BLOCO=33, STRING=34, CHAR=35, BOOLEANO=36, MAIN=37, FOR=38, 
		IN=39, FUNCAO=40, RETURN=41, IF=42, ELSE=43, STRUCT=44, TIPO=45, WHILE=46, 
		DISPLAY=47, INPUT=48, VOID=49, IDENTIFICADOR=50, WS=51, ESC=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIS", "SETA", "MENOS", "ASTERISCO", "BARRA", "BARRA_INVERTIDA", "ABRE_PARENTESE", 
			"FECHA_PARENTESE", "ABRE_COLCHETE", "FECHA_COLCHETE", "ABRE_CHAVE", "FECHA_CHAVE", 
			"E_LOGICO", "E_BINARIO", "OU_LOGICO", "OU_BINARIO", "PONTO_PONTO", "PONTO", 
			"VIRGULA", "PONTO_E_VIRGULA", "DOIS_PONTOS", "PORCENTO", "MAIOR", "MAIOR_IGUAL", 
			"MENOR", "MENOR_IGUAL", "IGUAL", "DIFERENTE", "ATRIBUICAO", "EXCLAMACAO", 
			"NUMERO", "COMENTARIO", "COMENTARIO_BLOCO", "STRING", "CHAR", "BOOLEANO", 
			"MAIN", "FOR", "IN", "FUNCAO", "RETURN", "IF", "ELSE", "STRUCT", "TIPO", 
			"WHILE", "DISPLAY", "INPUT", "VOID", "IDENTIFICADOR", "WS", "ESC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'->'", "'-'", "'*'", "'/'", "'\\'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'&&'", "'&'", "'||'", "'|'", "'..'", "'.'", "','", 
			"';'", "':'", "'%'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'='", 
			"'!'", null, null, null, null, null, null, "'main'", "'for'", "'in'", 
			"'fn'", "'return'", "'if'", "'else'", "'struct'", null, "'while'", "'display'", 
			"'input'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIS", "SETA", "MENOS", "ASTERISCO", "BARRA", "BARRA_INVERTIDA", 
			"ABRE_PARENTESE", "FECHA_PARENTESE", "ABRE_COLCHETE", "FECHA_COLCHETE", 
			"ABRE_CHAVE", "FECHA_CHAVE", "E_LOGICO", "E_BINARIO", "OU_LOGICO", "OU_BINARIO", 
			"PONTO_PONTO", "PONTO", "VIRGULA", "PONTO_E_VIRGULA", "DOIS_PONTOS", 
			"PORCENTO", "MAIOR", "MAIOR_IGUAL", "MENOR", "MENOR_IGUAL", "IGUAL", 
			"DIFERENTE", "ATRIBUICAO", "EXCLAMACAO", "NUMERO", "COMENTARIO", "COMENTARIO_BLOCO", 
			"STRING", "CHAR", "BOOLEANO", "MAIN", "FOR", "IN", "FUNCAO", "RETURN", 
			"IF", "ELSE", "STRUCT", "TIPO", "WHILE", "DISPLAY", "INPUT", "VOID", 
			"IDENTIFICADOR", "WS", "ESC"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
		"\u0004\u00004\u0169\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0003\u001e\u00af\b\u001e\u0001\u001e"+
		"\u0004\u001e\u00b2\b\u001e\u000b\u001e\f\u001e\u00b3\u0001\u001e\u0001"+
		"\u001e\u0004\u001e\u00b8\b\u001e\u000b\u001e\f\u001e\u00b9\u0003\u001e"+
		"\u00bc\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u00c2\b\u001f\n\u001f\f\u001f\u00c5\t\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0005 \u00cd\b \n \f \u00d0\t \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0005!\u00da\b!\n!\f!\u00dd\t!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0003\"\u00e4\b\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u00f1"+
		"\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u013e\b,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u0001"+
		"0\u00010\u00010\u00011\u00011\u00051\u015b\b1\n1\f1\u015e\t1\u00012\u0004"+
		"2\u0161\b2\u000b2\f2\u0162\u00012\u00012\u00013\u00013\u00013\u0001\u00ce"+
		"\u00004\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4\u0001\u0000\b\u0001\u0000--\u0001"+
		"\u000009\u0002\u0000\n\n\r\r\u0002\u0000\"\"\\\\\u0002\u0000\'\'\\\\\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u017f\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000"+
		"\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000"+
		"C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001"+
		"\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000"+
		"\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000"+
		"Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001"+
		"\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000"+
		"\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000"+
		"_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001"+
		"\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000"+
		"\u0000\u0001i\u0001\u0000\u0000\u0000\u0003k\u0001\u0000\u0000\u0000\u0005"+
		"n\u0001\u0000\u0000\u0000\u0007p\u0001\u0000\u0000\u0000\tr\u0001\u0000"+
		"\u0000\u0000\u000bt\u0001\u0000\u0000\u0000\rv\u0001\u0000\u0000\u0000"+
		"\u000fx\u0001\u0000\u0000\u0000\u0011z\u0001\u0000\u0000\u0000\u0013|"+
		"\u0001\u0000\u0000\u0000\u0015~\u0001\u0000\u0000\u0000\u0017\u0080\u0001"+
		"\u0000\u0000\u0000\u0019\u0082\u0001\u0000\u0000\u0000\u001b\u0085\u0001"+
		"\u0000\u0000\u0000\u001d\u0087\u0001\u0000\u0000\u0000\u001f\u008a\u0001"+
		"\u0000\u0000\u0000!\u008c\u0001\u0000\u0000\u0000#\u008f\u0001\u0000\u0000"+
		"\u0000%\u0091\u0001\u0000\u0000\u0000\'\u0093\u0001\u0000\u0000\u0000"+
		")\u0095\u0001\u0000\u0000\u0000+\u0097\u0001\u0000\u0000\u0000-\u0099"+
		"\u0001\u0000\u0000\u0000/\u009b\u0001\u0000\u0000\u00001\u009e\u0001\u0000"+
		"\u0000\u00003\u00a0\u0001\u0000\u0000\u00005\u00a3\u0001\u0000\u0000\u0000"+
		"7\u00a6\u0001\u0000\u0000\u00009\u00a9\u0001\u0000\u0000\u0000;\u00ab"+
		"\u0001\u0000\u0000\u0000=\u00ae\u0001\u0000\u0000\u0000?\u00bd\u0001\u0000"+
		"\u0000\u0000A\u00c8\u0001\u0000\u0000\u0000C\u00d6\u0001\u0000\u0000\u0000"+
		"E\u00e0\u0001\u0000\u0000\u0000G\u00f0\u0001\u0000\u0000\u0000I\u00f2"+
		"\u0001\u0000\u0000\u0000K\u00f7\u0001\u0000\u0000\u0000M\u00fb\u0001\u0000"+
		"\u0000\u0000O\u00fe\u0001\u0000\u0000\u0000Q\u0101\u0001\u0000\u0000\u0000"+
		"S\u0108\u0001\u0000\u0000\u0000U\u010b\u0001\u0000\u0000\u0000W\u0110"+
		"\u0001\u0000\u0000\u0000Y\u013d\u0001\u0000\u0000\u0000[\u013f\u0001\u0000"+
		"\u0000\u0000]\u0145\u0001\u0000\u0000\u0000_\u014d\u0001\u0000\u0000\u0000"+
		"a\u0153\u0001\u0000\u0000\u0000c\u0158\u0001\u0000\u0000\u0000e\u0160"+
		"\u0001\u0000\u0000\u0000g\u0166\u0001\u0000\u0000\u0000ij\u0005+\u0000"+
		"\u0000j\u0002\u0001\u0000\u0000\u0000kl\u0005-\u0000\u0000lm\u0005>\u0000"+
		"\u0000m\u0004\u0001\u0000\u0000\u0000no\u0005-\u0000\u0000o\u0006\u0001"+
		"\u0000\u0000\u0000pq\u0005*\u0000\u0000q\b\u0001\u0000\u0000\u0000rs\u0005"+
		"/\u0000\u0000s\n\u0001\u0000\u0000\u0000tu\u0005\\\u0000\u0000u\f\u0001"+
		"\u0000\u0000\u0000vw\u0005(\u0000\u0000w\u000e\u0001\u0000\u0000\u0000"+
		"xy\u0005)\u0000\u0000y\u0010\u0001\u0000\u0000\u0000z{\u0005[\u0000\u0000"+
		"{\u0012\u0001\u0000\u0000\u0000|}\u0005]\u0000\u0000}\u0014\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005{\u0000\u0000\u007f\u0016\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005}\u0000\u0000\u0081\u0018\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005&\u0000\u0000\u0083\u0084\u0005&\u0000\u0000\u0084\u001a\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005&\u0000\u0000\u0086\u001c\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005|\u0000\u0000\u0088\u0089\u0005|\u0000\u0000"+
		"\u0089\u001e\u0001\u0000\u0000\u0000\u008a\u008b\u0005|\u0000\u0000\u008b"+
		" \u0001\u0000\u0000\u0000\u008c\u008d\u0005.\u0000\u0000\u008d\u008e\u0005"+
		".\u0000\u0000\u008e\"\u0001\u0000\u0000\u0000\u008f\u0090\u0005.\u0000"+
		"\u0000\u0090$\u0001\u0000\u0000\u0000\u0091\u0092\u0005,\u0000\u0000\u0092"+
		"&\u0001\u0000\u0000\u0000\u0093\u0094\u0005;\u0000\u0000\u0094(\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005:\u0000\u0000\u0096*\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005%\u0000\u0000\u0098,\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005>\u0000\u0000\u009a.\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		">\u0000\u0000\u009c\u009d\u0005=\u0000\u0000\u009d0\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005<\u0000\u0000\u009f2\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005<\u0000\u0000\u00a1\u00a2\u0005=\u0000\u0000\u00a24\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005=\u0000\u0000\u00a4\u00a5\u0005=\u0000"+
		"\u0000\u00a56\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005!\u0000\u0000\u00a7"+
		"\u00a8\u0005=\u0000\u0000\u00a88\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"=\u0000\u0000\u00aa:\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005!\u0000"+
		"\u0000\u00ac<\u0001\u0000\u0000\u0000\u00ad\u00af\u0007\u0000\u0000\u0000"+
		"\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000"+
		"\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00b2\u0007\u0001\u0000\u0000"+
		"\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00bb\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005.\u0000\u0000\u00b6"+
		"\u00b8\u0007\u0001\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b5\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc"+
		">\u0001\u0000\u0000\u0000\u00bd\u00be\u0005/\u0000\u0000\u00be\u00bf\u0005"+
		"/\u0000\u0000\u00bf\u00c3\u0001\u0000\u0000\u0000\u00c0\u00c2\b\u0002"+
		"\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0006\u001f\u0000\u0000\u00c7@\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0005/\u0000\u0000\u00c9\u00ca\u0005*\u0000\u0000\u00ca"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cb\u00cd\t\u0000\u0000\u0000\u00cc\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0005*\u0000\u0000\u00d2\u00d3\u0005/\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0006 \u0000\u0000\u00d5B\u0001\u0000\u0000\u0000"+
		"\u00d6\u00db\u0005\"\u0000\u0000\u00d7\u00da\u0003g3\u0000\u00d8\u00da"+
		"\b\u0003\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"\"\u0000\u0000\u00dfD\u0001\u0000\u0000\u0000\u00e0\u00e3\u0005\'\u0000"+
		"\u0000\u00e1\u00e4\u0003g3\u0000\u00e2\u00e4\b\u0004\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\'\u0000\u0000\u00e6F"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005t\u0000\u0000\u00e8\u00e9\u0005"+
		"r\u0000\u0000\u00e9\u00ea\u0005u\u0000\u0000\u00ea\u00f1\u0005e\u0000"+
		"\u0000\u00eb\u00ec\u0005f\u0000\u0000\u00ec\u00ed\u0005a\u0000\u0000\u00ed"+
		"\u00ee\u0005l\u0000\u0000\u00ee\u00ef\u0005s\u0000\u0000\u00ef\u00f1\u0005"+
		"e\u0000\u0000\u00f0\u00e7\u0001\u0000\u0000\u0000\u00f0\u00eb\u0001\u0000"+
		"\u0000\u0000\u00f1H\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005m\u0000\u0000"+
		"\u00f3\u00f4\u0005a\u0000\u0000\u00f4\u00f5\u0005i\u0000\u0000\u00f5\u00f6"+
		"\u0005n\u0000\u0000\u00f6J\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005f"+
		"\u0000\u0000\u00f8\u00f9\u0005o\u0000\u0000\u00f9\u00fa\u0005r\u0000\u0000"+
		"\u00faL\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005i\u0000\u0000\u00fc\u00fd"+
		"\u0005n\u0000\u0000\u00fdN\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005f"+
		"\u0000\u0000\u00ff\u0100\u0005n\u0000\u0000\u0100P\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0005r\u0000\u0000\u0102\u0103\u0005e\u0000\u0000\u0103\u0104"+
		"\u0005t\u0000\u0000\u0104\u0105\u0005u\u0000\u0000\u0105\u0106\u0005r"+
		"\u0000\u0000\u0106\u0107\u0005n\u0000\u0000\u0107R\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0005i\u0000\u0000\u0109\u010a\u0005f\u0000\u0000\u010aT"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0005e\u0000\u0000\u010c\u010d\u0005"+
		"l\u0000\u0000\u010d\u010e\u0005s\u0000\u0000\u010e\u010f\u0005e\u0000"+
		"\u0000\u010fV\u0001\u0000\u0000\u0000\u0110\u0111\u0005s\u0000\u0000\u0111"+
		"\u0112\u0005t\u0000\u0000\u0112\u0113\u0005r\u0000\u0000\u0113\u0114\u0005"+
		"u\u0000\u0000\u0114\u0115\u0005c\u0000\u0000\u0115\u0116\u0005t\u0000"+
		"\u0000\u0116X\u0001\u0000\u0000\u0000\u0117\u0118\u0005i\u0000\u0000\u0118"+
		"\u013e\u00058\u0000\u0000\u0119\u011a\u0005i\u0000\u0000\u011a\u011b\u0005"+
		"1\u0000\u0000\u011b\u013e\u00056\u0000\u0000\u011c\u011d\u0005i\u0000"+
		"\u0000\u011d\u011e\u00053\u0000\u0000\u011e\u013e\u00052\u0000\u0000\u011f"+
		"\u0120\u0005i\u0000\u0000\u0120\u0121\u00056\u0000\u0000\u0121\u013e\u0005"+
		"4\u0000\u0000\u0122\u0123\u0005u\u0000\u0000\u0123\u013e\u00058\u0000"+
		"\u0000\u0124\u0125\u0005u\u0000\u0000\u0125\u0126\u00051\u0000\u0000\u0126"+
		"\u013e\u00056\u0000\u0000\u0127\u0128\u0005u\u0000\u0000\u0128\u0129\u0005"+
		"3\u0000\u0000\u0129\u013e\u00052\u0000\u0000\u012a\u012b\u0005u\u0000"+
		"\u0000\u012b\u012c\u00056\u0000\u0000\u012c\u013e\u00054\u0000\u0000\u012d"+
		"\u012e\u0005f\u0000\u0000\u012e\u012f\u00053\u0000\u0000\u012f\u013e\u0005"+
		"2\u0000\u0000\u0130\u0131\u0005f\u0000\u0000\u0131\u0132\u00056\u0000"+
		"\u0000\u0132\u013e\u00054\u0000\u0000\u0133\u0134\u0005b\u0000\u0000\u0134"+
		"\u0135\u0005o\u0000\u0000\u0135\u0136\u0005o\u0000\u0000\u0136\u013e\u0005"+
		"l\u0000\u0000\u0137\u0138\u0005s\u0000\u0000\u0138\u0139\u0005t\u0000"+
		"\u0000\u0139\u013a\u0005r\u0000\u0000\u013a\u013b\u0005i\u0000\u0000\u013b"+
		"\u013c\u0005n\u0000\u0000\u013c\u013e\u0005g\u0000\u0000\u013d\u0117\u0001"+
		"\u0000\u0000\u0000\u013d\u0119\u0001\u0000\u0000\u0000\u013d\u011c\u0001"+
		"\u0000\u0000\u0000\u013d\u011f\u0001\u0000\u0000\u0000\u013d\u0122\u0001"+
		"\u0000\u0000\u0000\u013d\u0124\u0001\u0000\u0000\u0000\u013d\u0127\u0001"+
		"\u0000\u0000\u0000\u013d\u012a\u0001\u0000\u0000\u0000\u013d\u012d\u0001"+
		"\u0000\u0000\u0000\u013d\u0130\u0001\u0000\u0000\u0000\u013d\u0133\u0001"+
		"\u0000\u0000\u0000\u013d\u0137\u0001\u0000\u0000\u0000\u013eZ\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0005w\u0000\u0000\u0140\u0141\u0005h\u0000\u0000"+
		"\u0141\u0142\u0005i\u0000\u0000\u0142\u0143\u0005l\u0000\u0000\u0143\u0144"+
		"\u0005e\u0000\u0000\u0144\\\u0001\u0000\u0000\u0000\u0145\u0146\u0005"+
		"d\u0000\u0000\u0146\u0147\u0005i\u0000\u0000\u0147\u0148\u0005s\u0000"+
		"\u0000\u0148\u0149\u0005p\u0000\u0000\u0149\u014a\u0005l\u0000\u0000\u014a"+
		"\u014b\u0005a\u0000\u0000\u014b\u014c\u0005y\u0000\u0000\u014c^\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0005i\u0000\u0000\u014e\u014f\u0005n\u0000"+
		"\u0000\u014f\u0150\u0005p\u0000\u0000\u0150\u0151\u0005u\u0000\u0000\u0151"+
		"\u0152\u0005t\u0000\u0000\u0152`\u0001\u0000\u0000\u0000\u0153\u0154\u0005"+
		"v\u0000\u0000\u0154\u0155\u0005o\u0000\u0000\u0155\u0156\u0005i\u0000"+
		"\u0000\u0156\u0157\u0005d\u0000\u0000\u0157b\u0001\u0000\u0000\u0000\u0158"+
		"\u015c\u0007\u0005\u0000\u0000\u0159\u015b\u0007\u0006\u0000\u0000\u015a"+
		"\u0159\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c"+
		"\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d"+
		"d\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0161"+
		"\u0007\u0007\u0000\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u00062\u0000\u0000\u0165f\u0001\u0000\u0000\u0000\u0166\u0167\u0005\\"+
		"\u0000\u0000\u0167\u0168\t\u0000\u0000\u0000\u0168h\u0001\u0000\u0000"+
		"\u0000\u000e\u0000\u00ae\u00b3\u00b9\u00bb\u00c3\u00ce\u00d9\u00db\u00e3"+
		"\u00f0\u013d\u015c\u0162\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}