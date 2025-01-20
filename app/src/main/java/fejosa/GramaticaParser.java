// Generated from app/src/main/java/fejosa/Gramatica.g4 by ANTLR 4.13.2
package fejosa;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GramaticaParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_mainFunc = 2, RULE_varDecl = 3, RULE_funcDecl = 4, 
		RULE_funcCall = 5, RULE_paramDecl = 6, RULE_exprStmt = 7, RULE_boolExpr = 8, 
		RULE_ifStmt = 9, RULE_elseIfStmt = 10, RULE_elseStmt = 11, RULE_whileStmt = 12, 
		RULE_forStmt = 13, RULE_returnStmt = 14, RULE_assignStmt = 15, RULE_printStmt = 16, 
		RULE_scanStmt = 17, RULE_expr = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmt", "mainFunc", "varDecl", "funcDecl", "funcCall", "paramDecl", 
			"exprStmt", "boolExpr", "ifStmt", "elseIfStmt", "elseStmt", "whileStmt", 
			"forStmt", "returnStmt", "assignStmt", "printStmt", "scanStmt", "expr"
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

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public MainFuncContext mainFunc() {
			return getRuleContext(MainFuncContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GramaticaParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					stmt();
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(44);
			mainFunc();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1661759354044544L) != 0)) {
				{
				{
				setState(45);
				stmt();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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
	public static class StmtContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public ScanStmtContext scanStmt() {
			return getRuleContext(ScanStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				funcDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				exprStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				printStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				scanStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				forStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				returnStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(62);
				assignStmt();
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
	public static class MainFuncContext extends ParserRuleContext {
		public TerminalNode FUNCAO() { return getToken(GramaticaParser.FUNCAO, 0); }
		public TerminalNode MAIN() { return getToken(GramaticaParser.MAIN, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(GramaticaParser.ABRE_PARENTESE, 0); }
		public TerminalNode FECHA_PARENTESE() { return getToken(GramaticaParser.FECHA_PARENTESE, 0); }
		public TerminalNode SETA() { return getToken(GramaticaParser.SETA, 0); }
		public TerminalNode VOID() { return getToken(GramaticaParser.VOID, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(GramaticaParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(GramaticaParser.FECHA_CHAVE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public MainFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMainFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMainFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMainFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFuncContext mainFunc() throws RecognitionException {
		MainFuncContext _localctx = new MainFuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(FUNCAO);
			setState(66);
			match(MAIN);
			setState(67);
			match(ABRE_PARENTESE);
			setState(68);
			match(FECHA_PARENTESE);
			setState(69);
			match(SETA);
			setState(70);
			match(VOID);
			setState(71);
			match(ABRE_CHAVE);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1661759354044544L) != 0)) {
				{
				{
				setState(72);
				stmt();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(FECHA_CHAVE);
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
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(GramaticaParser.TIPO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(GramaticaParser.PONTO_E_VIRGULA, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(GramaticaParser.ATRIBUICAO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ABRE_COLCHETE() { return getToken(GramaticaParser.ABRE_COLCHETE, 0); }
		public TerminalNode NUMERO() { return getToken(GramaticaParser.NUMERO, 0); }
		public TerminalNode FECHA_COLCHETE() { return getToken(GramaticaParser.FECHA_COLCHETE, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(TIPO);
				setState(81);
				match(IDENTIFICADOR);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATRIBUICAO) {
					{
					setState(82);
					match(ATRIBUICAO);
					setState(83);
					expr(0);
					}
				}

				setState(86);
				match(PONTO_E_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(TIPO);
				setState(88);
				match(IDENTIFICADOR);
				setState(89);
				match(ABRE_COLCHETE);
				setState(90);
				match(NUMERO);
				setState(91);
				match(FECHA_COLCHETE);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATRIBUICAO) {
					{
					setState(92);
					match(ATRIBUICAO);
					setState(93);
					expr(0);
					}
				}

				setState(96);
				match(PONTO_E_VIRGULA);
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
	public static class FuncDeclContext extends ParserRuleContext {
		public TerminalNode FUNCAO() { return getToken(GramaticaParser.FUNCAO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(GramaticaParser.ABRE_PARENTESE, 0); }
		public TerminalNode FECHA_PARENTESE() { return getToken(GramaticaParser.FECHA_PARENTESE, 0); }
		public TerminalNode SETA() { return getToken(GramaticaParser.SETA, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(GramaticaParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(GramaticaParser.FECHA_CHAVE, 0); }
		public TerminalNode TIPO() { return getToken(GramaticaParser.TIPO, 0); }
		public TerminalNode VOID() { return getToken(GramaticaParser.VOID, 0); }
		public List<ParamDeclContext> paramDecl() {
			return getRuleContexts(ParamDeclContext.class);
		}
		public ParamDeclContext paramDecl(int i) {
			return getRuleContext(ParamDeclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(GramaticaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(GramaticaParser.VIRGULA, i);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(FUNCAO);
			setState(100);
			match(IDENTIFICADOR);
			setState(101);
			match(ABRE_PARENTESE);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(102);
				paramDecl();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(103);
					match(VIRGULA);
					setState(104);
					paramDecl();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(112);
			match(FECHA_PARENTESE);
			setState(113);
			match(SETA);
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==TIPO || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(115);
			match(ABRE_CHAVE);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1661759354044544L) != 0)) {
				{
				{
				setState(116);
				stmt();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(FECHA_CHAVE);
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
	public static class FuncCallContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(GramaticaParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(GramaticaParser.IDENTIFICADOR, i);
		}
		public TerminalNode ABRE_PARENTESE() { return getToken(GramaticaParser.ABRE_PARENTESE, 0); }
		public TerminalNode FECHA_PARENTESE() { return getToken(GramaticaParser.FECHA_PARENTESE, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(GramaticaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(GramaticaParser.VIRGULA, i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IDENTIFICADOR);
			setState(125);
			match(ABRE_PARENTESE);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(126);
				match(IDENTIFICADOR);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(127);
					match(VIRGULA);
					setState(128);
					match(IDENTIFICADOR);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(136);
			match(FECHA_PARENTESE);
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
	public static class ParamDeclContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(GramaticaParser.TIPO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParamDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParamDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamDeclContext paramDecl() throws RecognitionException {
		ParamDeclContext _localctx = new ParamDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(TIPO);
			setState(139);
			match(IDENTIFICADOR);
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
	public static class ExprStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PONTO_E_VIRGULA() { return getToken(GramaticaParser.PONTO_E_VIRGULA, 0); }
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			expr(0);
			setState(142);
			match(PONTO_E_VIRGULA);
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
	public static class BoolExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAIOR() { return getToken(GramaticaParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(GramaticaParser.MENOR, 0); }
		public TerminalNode IGUAL() { return getToken(GramaticaParser.IGUAL, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(GramaticaParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(GramaticaParser.MENOR_IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(GramaticaParser.DIFERENTE, 0); }
		public TerminalNode BOOLEANO() { return getToken(GramaticaParser.BOOLEANO, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolExpr);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				expr(0);
				setState(145);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(BOOLEANO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				funcCall();
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
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GramaticaParser.IF, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(GramaticaParser.ABRE_PARENTESE, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(GramaticaParser.FECHA_PARENTESE, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(GramaticaParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(GramaticaParser.FECHA_CHAVE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<ElseIfStmtContext> elseIfStmt() {
			return getRuleContexts(ElseIfStmtContext.class);
		}
		public ElseIfStmtContext elseIfStmt(int i) {
			return getRuleContext(ElseIfStmtContext.class,i);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(IF);
			setState(153);
			match(ABRE_PARENTESE);
			setState(154);
			boolExpr();
			setState(155);
			match(FECHA_PARENTESE);
			setState(156);
			match(ABRE_CHAVE);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1661759354044544L) != 0)) {
				{
				{
				setState(157);
				stmt();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(FECHA_CHAVE);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					elseIfStmt();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(170);
				elseStmt();
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
	public static class ElseIfStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GramaticaParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(GramaticaParser.IF, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(GramaticaParser.ABRE_PARENTESE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(GramaticaParser.FECHA_PARENTESE, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(GramaticaParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(GramaticaParser.FECHA_CHAVE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElseIfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterElseIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitElseIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitElseIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStmtContext elseIfStmt() throws RecognitionException {
		ElseIfStmtContext _localctx = new ElseIfStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseIfStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ELSE);
			setState(174);
			match(IF);
			setState(175);
			match(ABRE_PARENTESE);
			setState(176);
			expr(0);
			setState(177);
			match(FECHA_PARENTESE);
			setState(178);
			match(ABRE_CHAVE);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1661759354044544L) != 0)) {
				{
				{
				setState(179);
				stmt();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(FECHA_CHAVE);
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
	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GramaticaParser.ELSE, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(GramaticaParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(GramaticaParser.FECHA_CHAVE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ELSE);
			setState(188);
			match(ABRE_CHAVE);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1661759354044544L) != 0)) {
				{
				{
				setState(189);
				stmt();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(FECHA_CHAVE);
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
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GramaticaParser.WHILE, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(GramaticaParser.ABRE_PARENTESE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(GramaticaParser.FECHA_PARENTESE, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(GramaticaParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(GramaticaParser.FECHA_CHAVE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(WHILE);
			setState(198);
			match(ABRE_PARENTESE);
			setState(199);
			expr(0);
			setState(200);
			match(FECHA_PARENTESE);
			setState(201);
			match(ABRE_CHAVE);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1661759354044544L) != 0)) {
				{
				{
				setState(202);
				stmt();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(FECHA_CHAVE);
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
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GramaticaParser.FOR, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode IN() { return getToken(GramaticaParser.IN, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(GramaticaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(GramaticaParser.NUMERO, i);
		}
		public TerminalNode PONTO_PONTO() { return getToken(GramaticaParser.PONTO_PONTO, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(GramaticaParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(GramaticaParser.FECHA_CHAVE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(FOR);
			setState(211);
			match(IDENTIFICADOR);
			setState(212);
			match(IN);
			setState(213);
			match(NUMERO);
			setState(214);
			match(PONTO_PONTO);
			setState(215);
			match(NUMERO);
			setState(216);
			match(ABRE_CHAVE);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1661759354044544L) != 0)) {
				{
				{
				setState(217);
				stmt();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(FECHA_CHAVE);
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
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GramaticaParser.RETURN, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(GramaticaParser.PONTO_E_VIRGULA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(RETURN);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1266759801766016L) != 0)) {
				{
				setState(226);
				expr(0);
				}
			}

			setState(229);
			match(PONTO_E_VIRGULA);
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
	public static class AssignStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(GramaticaParser.ATRIBUICAO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PONTO_E_VIRGULA() { return getToken(GramaticaParser.PONTO_E_VIRGULA, 0); }
		public TerminalNode ABRE_COLCHETE() { return getToken(GramaticaParser.ABRE_COLCHETE, 0); }
		public TerminalNode FECHA_COLCHETE() { return getToken(GramaticaParser.FECHA_COLCHETE, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignStmt);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(IDENTIFICADOR);
				setState(232);
				match(ATRIBUICAO);
				setState(233);
				expr(0);
				setState(234);
				match(PONTO_E_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(IDENTIFICADOR);
				setState(237);
				match(ABRE_COLCHETE);
				setState(238);
				expr(0);
				setState(239);
				match(FECHA_COLCHETE);
				setState(240);
				match(ATRIBUICAO);
				setState(241);
				expr(0);
				setState(242);
				match(PONTO_E_VIRGULA);
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
	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(GramaticaParser.DISPLAY, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(GramaticaParser.ABRE_PARENTESE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(GramaticaParser.FECHA_PARENTESE, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(GramaticaParser.PONTO_E_VIRGULA, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(GramaticaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(GramaticaParser.VIRGULA, i);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(DISPLAY);
			setState(247);
			match(ABRE_PARENTESE);
			setState(248);
			expr(0);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(249);
				match(VIRGULA);
				setState(250);
				expr(0);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(FECHA_PARENTESE);
			setState(257);
			match(PONTO_E_VIRGULA);
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
	public static class ScanStmtContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(GramaticaParser.INPUT, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(GramaticaParser.ABRE_PARENTESE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(GramaticaParser.FECHA_PARENTESE, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(GramaticaParser.PONTO_E_VIRGULA, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(GramaticaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(GramaticaParser.VIRGULA, i);
		}
		public ScanStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterScanStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitScanStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitScanStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanStmtContext scanStmt() throws RecognitionException {
		ScanStmtContext _localctx = new ScanStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_scanStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(INPUT);
			setState(260);
			match(ABRE_PARENTESE);
			setState(261);
			expr(0);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(262);
				match(VIRGULA);
				setState(263);
				expr(0);
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(FECHA_PARENTESE);
			setState(270);
			match(PONTO_E_VIRGULA);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext lhs;
		public Token op;
		public ExprContext rhs;
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode ABRE_PARENTESE() { return getToken(GramaticaParser.ABRE_PARENTESE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(GramaticaParser.FECHA_PARENTESE, 0); }
		public TerminalNode NUMERO() { return getToken(GramaticaParser.NUMERO, 0); }
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(GramaticaParser.CHAR, 0); }
		public TerminalNode BOOLEANO() { return getToken(GramaticaParser.BOOLEANO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode ABRE_COLCHETE() { return getToken(GramaticaParser.ABRE_COLCHETE, 0); }
		public TerminalNode FECHA_COLCHETE() { return getToken(GramaticaParser.FECHA_COLCHETE, 0); }
		public TerminalNode DISPLAY() { return getToken(GramaticaParser.DISPLAY, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(GramaticaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(GramaticaParser.VIRGULA, i);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public TerminalNode MAIS() { return getToken(GramaticaParser.MAIS, 0); }
		public TerminalNode MENOS() { return getToken(GramaticaParser.MENOS, 0); }
		public TerminalNode ASTERISCO() { return getToken(GramaticaParser.ASTERISCO, 0); }
		public TerminalNode BARRA() { return getToken(GramaticaParser.BARRA, 0); }
		public TerminalNode PORCENTO() { return getToken(GramaticaParser.PORCENTO, 0); }
		public TerminalNode IGUAL() { return getToken(GramaticaParser.IGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(GramaticaParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(GramaticaParser.MENOR, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(GramaticaParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(GramaticaParser.MENOR_IGUAL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(273);
				funcCall();
				}
				break;
			case 2:
				{
				setState(274);
				match(ABRE_PARENTESE);
				setState(275);
				expr(0);
				setState(276);
				match(FECHA_PARENTESE);
				}
				break;
			case 3:
				{
				setState(278);
				match(NUMERO);
				}
				break;
			case 4:
				{
				setState(279);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(280);
				match(CHAR);
				}
				break;
			case 6:
				{
				setState(281);
				match(BOOLEANO);
				}
				break;
			case 7:
				{
				setState(282);
				match(IDENTIFICADOR);
				}
				break;
			case 8:
				{
				setState(283);
				match(IDENTIFICADOR);
				setState(284);
				match(ABRE_COLCHETE);
				setState(285);
				expr(0);
				setState(286);
				match(FECHA_COLCHETE);
				}
				break;
			case 9:
				{
				setState(288);
				match(DISPLAY);
				setState(289);
				match(ABRE_PARENTESE);
				setState(290);
				expr(0);
				setState(291);
				match(FECHA_PARENTESE);
				}
				break;
			case 10:
				{
				setState(293);
				match(IDENTIFICADOR);
				setState(294);
				match(ABRE_PARENTESE);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1266759801766016L) != 0)) {
					{
					setState(295);
					expr(0);
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(296);
						match(VIRGULA);
						setState(297);
						expr(0);
						}
						}
						setState(302);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(305);
				match(FECHA_PARENTESE);
				}
				break;
			case 11:
				{
				setState(306);
				assignStmt();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(309);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(310);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAIS || _la==MENOS) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(311);
						((ExprContext)_localctx).rhs = expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(313);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4194352L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(314);
						((ExprContext)_localctx).rhs = expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(316);
						((ExprContext)_localctx).op = match(IGUAL);
						setState(317);
						((ExprContext)_localctx).rhs = expr(14);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(319);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						((ExprContext)_localctx).rhs = expr(13);
						}
						break;
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u0147\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000/\b\u0000\n\u0000\f\u00002\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"@\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002J\b\u0002\n\u0002\f\u0002"+
		"M\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"_\b\u0003\u0001\u0003\u0003\u0003b\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004j\b\u0004\n\u0004"+
		"\f\u0004m\t\u0004\u0003\u0004o\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004v\b\u0004\n\u0004\f\u0004y\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u0082\b\u0005\n\u0005\f\u0005\u0085\t\u0005\u0003"+
		"\u0005\u0087\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0097\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u009f\b\t\n\t\f\t\u00a2\t\t\u0001\t\u0001\t\u0005\t"+
		"\u00a6\b\t\n\t\f\t\u00a9\t\t\u0001\t\u0003\t\u00ac\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b5\b\n\n\n\f\n\u00b8"+
		"\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00bf"+
		"\b\u000b\n\u000b\f\u000b\u00c2\t\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00cc\b\f\n\f\f\f\u00cf"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00db\b\r\n\r\f\r\u00de\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00e4\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00f5\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00fc\b\u0010\n\u0010\f\u0010\u00ff\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u0109\b\u0011\n\u0011\f\u0011\u010c\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u012b\b\u0012\n\u0012\f\u0012\u012e\t\u0012\u0003\u0012\u0130\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0134\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0142\b\u0012"+
		"\n\u0012\f\u0012\u0145\t\u0012\u0001\u0012\u0000\u0001$\u0013\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$\u0000\u0005\u0002\u0000--11\u0001\u0000\u0017\u001c\u0002\u0000\u0001"+
		"\u0001\u0003\u0003\u0002\u0000\u0004\u0005\u0016\u0016\u0001\u0000\u0017"+
		"\u001a\u0164\u0000)\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000"+
		"\u0004A\u0001\u0000\u0000\u0000\u0006a\u0001\u0000\u0000\u0000\bc\u0001"+
		"\u0000\u0000\u0000\n|\u0001\u0000\u0000\u0000\f\u008a\u0001\u0000\u0000"+
		"\u0000\u000e\u008d\u0001\u0000\u0000\u0000\u0010\u0096\u0001\u0000\u0000"+
		"\u0000\u0012\u0098\u0001\u0000\u0000\u0000\u0014\u00ad\u0001\u0000\u0000"+
		"\u0000\u0016\u00bb\u0001\u0000\u0000\u0000\u0018\u00c5\u0001\u0000\u0000"+
		"\u0000\u001a\u00d2\u0001\u0000\u0000\u0000\u001c\u00e1\u0001\u0000\u0000"+
		"\u0000\u001e\u00f4\u0001\u0000\u0000\u0000 \u00f6\u0001\u0000\u0000\u0000"+
		"\"\u0103\u0001\u0000\u0000\u0000$\u0133\u0001\u0000\u0000\u0000&(\u0003"+
		"\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000,0\u0003\u0004\u0002\u0000-/\u0003\u0002"+
		"\u0001\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000034\u0005\u0000\u0000\u00014\u0001\u0001\u0000"+
		"\u0000\u00005@\u0003\u0006\u0003\u00006@\u0003\b\u0004\u00007@\u0003\u000e"+
		"\u0007\u00008@\u0003\u0012\t\u00009@\u0003\u0018\f\u0000:@\u0003 \u0010"+
		"\u0000;@\u0003\"\u0011\u0000<@\u0003\u001a\r\u0000=@\u0003\u001c\u000e"+
		"\u0000>@\u0003\u001e\u000f\u0000?5\u0001\u0000\u0000\u0000?6\u0001\u0000"+
		"\u0000\u0000?7\u0001\u0000\u0000\u0000?8\u0001\u0000\u0000\u0000?9\u0001"+
		"\u0000\u0000\u0000?:\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000"+
		"?<\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000"+
		"\u0000@\u0003\u0001\u0000\u0000\u0000AB\u0005(\u0000\u0000BC\u0005%\u0000"+
		"\u0000CD\u0005\u0007\u0000\u0000DE\u0005\b\u0000\u0000EF\u0005\u0002\u0000"+
		"\u0000FG\u00051\u0000\u0000GK\u0005\u000b\u0000\u0000HJ\u0003\u0002\u0001"+
		"\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000NO\u0005\f\u0000\u0000O\u0005\u0001\u0000\u0000\u0000"+
		"PQ\u0005-\u0000\u0000QT\u00052\u0000\u0000RS\u0005\u001d\u0000\u0000S"+
		"U\u0003$\u0012\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000Vb\u0005\u0014\u0000\u0000WX\u0005-\u0000\u0000"+
		"XY\u00052\u0000\u0000YZ\u0005\t\u0000\u0000Z[\u0005\u001f\u0000\u0000"+
		"[^\u0005\n\u0000\u0000\\]\u0005\u001d\u0000\u0000]_\u0003$\u0012\u0000"+
		"^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`b\u0005\u0014\u0000\u0000aP\u0001\u0000\u0000\u0000aW\u0001\u0000"+
		"\u0000\u0000b\u0007\u0001\u0000\u0000\u0000cd\u0005(\u0000\u0000de\u0005"+
		"2\u0000\u0000en\u0005\u0007\u0000\u0000fk\u0003\f\u0006\u0000gh\u0005"+
		"\u0013\u0000\u0000hj\u0003\f\u0006\u0000ig\u0001\u0000\u0000\u0000jm\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000nf\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0005\b\u0000"+
		"\u0000qr\u0005\u0002\u0000\u0000rs\u0007\u0000\u0000\u0000sw\u0005\u000b"+
		"\u0000\u0000tv\u0003\u0002\u0001\u0000ut\u0001\u0000\u0000\u0000vy\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005\f\u0000\u0000"+
		"{\t\u0001\u0000\u0000\u0000|}\u00052\u0000\u0000}\u0086\u0005\u0007\u0000"+
		"\u0000~\u0083\u00052\u0000\u0000\u007f\u0080\u0005\u0013\u0000\u0000\u0080"+
		"\u0082\u00052\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086~\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"\b\u0000\u0000\u0089\u000b\u0001\u0000\u0000\u0000\u008a\u008b\u0005-"+
		"\u0000\u0000\u008b\u008c\u00052\u0000\u0000\u008c\r\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0003$\u0012\u0000\u008e\u008f\u0005\u0014\u0000\u0000"+
		"\u008f\u000f\u0001\u0000\u0000\u0000\u0090\u0091\u0003$\u0012\u0000\u0091"+
		"\u0092\u0007\u0001\u0000\u0000\u0092\u0093\u0003$\u0012\u0000\u0093\u0097"+
		"\u0001\u0000\u0000\u0000\u0094\u0097\u0005$\u0000\u0000\u0095\u0097\u0003"+
		"\n\u0005\u0000\u0096\u0090\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0011\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0005*\u0000\u0000\u0099\u009a\u0005\u0007\u0000"+
		"\u0000\u009a\u009b\u0003\u0010\b\u0000\u009b\u009c\u0005\b\u0000\u0000"+
		"\u009c\u00a0\u0005\u000b\u0000\u0000\u009d\u009f\u0003\u0002\u0001\u0000"+
		"\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a7\u0005\f\u0000\u0000\u00a4\u00a6\u0003\u0014\n\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u0003\u0016\u000b\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u0013\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005+\u0000\u0000\u00ae\u00af\u0005*\u0000\u0000\u00af\u00b0\u0005"+
		"\u0007\u0000\u0000\u00b0\u00b1\u0003$\u0012\u0000\u00b1\u00b2\u0005\b"+
		"\u0000\u0000\u00b2\u00b6\u0005\u000b\u0000\u0000\u00b3\u00b5\u0003\u0002"+
		"\u0001\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0005\f\u0000\u0000\u00ba\u0015\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0005+\u0000\u0000\u00bc\u00c0\u0005\u000b\u0000\u0000"+
		"\u00bd\u00bf\u0003\u0002\u0001\u0000\u00be\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\f\u0000\u0000\u00c4"+
		"\u0017\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005.\u0000\u0000\u00c6\u00c7"+
		"\u0005\u0007\u0000\u0000\u00c7\u00c8\u0003$\u0012\u0000\u00c8\u00c9\u0005"+
		"\b\u0000\u0000\u00c9\u00cd\u0005\u000b\u0000\u0000\u00ca\u00cc\u0003\u0002"+
		"\u0001\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005\f\u0000\u0000\u00d1\u0019\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0005&\u0000\u0000\u00d3\u00d4\u00052\u0000\u0000\u00d4"+
		"\u00d5\u0005\'\u0000\u0000\u00d5\u00d6\u0005\u001f\u0000\u0000\u00d6\u00d7"+
		"\u0005\u0011\u0000\u0000\u00d7\u00d8\u0005\u001f\u0000\u0000\u00d8\u00dc"+
		"\u0005\u000b\u0000\u0000\u00d9\u00db\u0003\u0002\u0001\u0000\u00da\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df"+
		"\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0005\f\u0000\u0000\u00e0\u001b\u0001\u0000\u0000\u0000\u00e1\u00e3\u0005"+
		")\u0000\u0000\u00e2\u00e4\u0003$\u0012\u0000\u00e3\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0005\u0014\u0000\u0000\u00e6\u001d\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u00052\u0000\u0000\u00e8\u00e9\u0005\u001d\u0000\u0000"+
		"\u00e9\u00ea\u0003$\u0012\u0000\u00ea\u00eb\u0005\u0014\u0000\u0000\u00eb"+
		"\u00f5\u0001\u0000\u0000\u0000\u00ec\u00ed\u00052\u0000\u0000\u00ed\u00ee"+
		"\u0005\t\u0000\u0000\u00ee\u00ef\u0003$\u0012\u0000\u00ef\u00f0\u0005"+
		"\n\u0000\u0000\u00f0\u00f1\u0005\u001d\u0000\u0000\u00f1\u00f2\u0003$"+
		"\u0012\u0000\u00f2\u00f3\u0005\u0014\u0000\u0000\u00f3\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f4\u00e7\u0001\u0000\u0000\u0000\u00f4\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f5\u001f\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005/\u0000"+
		"\u0000\u00f7\u00f8\u0005\u0007\u0000\u0000\u00f8\u00fd\u0003$\u0012\u0000"+
		"\u00f9\u00fa\u0005\u0013\u0000\u0000\u00fa\u00fc\u0003$\u0012\u0000\u00fb"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe"+
		"\u0100\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0005\b\u0000\u0000\u0101\u0102\u0005\u0014\u0000\u0000\u0102!"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u00050\u0000\u0000\u0104\u0105\u0005"+
		"\u0007\u0000\u0000\u0105\u010a\u0003$\u0012\u0000\u0106\u0107\u0005\u0013"+
		"\u0000\u0000\u0107\u0109\u0003$\u0012\u0000\u0108\u0106\u0001\u0000\u0000"+
		"\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000\u0000"+
		"\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0005\b\u0000\u0000"+
		"\u010e\u010f\u0005\u0014\u0000\u0000\u010f#\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0006\u0012\uffff\uffff\u0000\u0111\u0134\u0003\n\u0005\u0000\u0112"+
		"\u0113\u0005\u0007\u0000\u0000\u0113\u0114\u0003$\u0012\u0000\u0114\u0115"+
		"\u0005\b\u0000\u0000\u0115\u0134\u0001\u0000\u0000\u0000\u0116\u0134\u0005"+
		"\u001f\u0000\u0000\u0117\u0134\u0005\"\u0000\u0000\u0118\u0134\u0005#"+
		"\u0000\u0000\u0119\u0134\u0005$\u0000\u0000\u011a\u0134\u00052\u0000\u0000"+
		"\u011b\u011c\u00052\u0000\u0000\u011c\u011d\u0005\t\u0000\u0000\u011d"+
		"\u011e\u0003$\u0012\u0000\u011e\u011f\u0005\n\u0000\u0000\u011f\u0134"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0005/\u0000\u0000\u0121\u0122\u0005"+
		"\u0007\u0000\u0000\u0122\u0123\u0003$\u0012\u0000\u0123\u0124\u0005\b"+
		"\u0000\u0000\u0124\u0134\u0001\u0000\u0000\u0000\u0125\u0126\u00052\u0000"+
		"\u0000\u0126\u012f\u0005\u0007\u0000\u0000\u0127\u012c\u0003$\u0012\u0000"+
		"\u0128\u0129\u0005\u0013\u0000\u0000\u0129\u012b\u0003$\u0012\u0000\u012a"+
		"\u0128\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c"+
		"\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d"+
		"\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f"+
		"\u0127\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0001\u0000\u0000\u0000\u0131\u0134\u0005\b\u0000\u0000\u0132\u0134"+
		"\u0003\u001e\u000f\u0000\u0133\u0110\u0001\u0000\u0000\u0000\u0133\u0112"+
		"\u0001\u0000\u0000\u0000\u0133\u0116\u0001\u0000\u0000\u0000\u0133\u0117"+
		"\u0001\u0000\u0000\u0000\u0133\u0118\u0001\u0000\u0000\u0000\u0133\u0119"+
		"\u0001\u0000\u0000\u0000\u0133\u011a\u0001\u0000\u0000\u0000\u0133\u011b"+
		"\u0001\u0000\u0000\u0000\u0133\u0120\u0001\u0000\u0000\u0000\u0133\u0125"+
		"\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0143"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\n\u000f\u0000\u0000\u0136\u0137\u0007"+
		"\u0002\u0000\u0000\u0137\u0142\u0003$\u0012\u0010\u0138\u0139\n\u000e"+
		"\u0000\u0000\u0139\u013a\u0007\u0003\u0000\u0000\u013a\u0142\u0003$\u0012"+
		"\u000f\u013b\u013c\n\r\u0000\u0000\u013c\u013d\u0005\u001b\u0000\u0000"+
		"\u013d\u0142\u0003$\u0012\u000e\u013e\u013f\n\f\u0000\u0000\u013f\u0140"+
		"\u0007\u0004\u0000\u0000\u0140\u0142\u0003$\u0012\r\u0141\u0135\u0001"+
		"\u0000\u0000\u0000\u0141\u0138\u0001\u0000\u0000\u0000\u0141\u013b\u0001"+
		"\u0000\u0000\u0000\u0141\u013e\u0001\u0000\u0000\u0000\u0142\u0145\u0001"+
		"\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144%\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000"+
		"\u0000\u0000\u001d)0?KT^aknw\u0083\u0086\u0096\u00a0\u00a7\u00ab\u00b6"+
		"\u00c0\u00cd\u00dc\u00e3\u00f4\u00fd\u010a\u012c\u012f\u0133\u0141\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}