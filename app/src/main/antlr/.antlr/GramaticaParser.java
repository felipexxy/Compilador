// Generated from c:/DIO/Compilador/Compilador/app/src/main/antlr/Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIS=1, SETA=2, MENOS=3, ASTERISCO=4, BARRA=5, BARRA_INVERTIDA=6, ABRE_PARENTESE=7, 
		FECHA_PARENTESE=8, ABRE_COLCHETE=9, FECHA_COLCHETE=10, ABRE_CHAVE=11, 
		FECHA_CHAVE=12, E_LOGICO=13, E_BINARIO=14, OU_LOGICO=15, OU_BINARIO=16, 
		PONTO_PONTO=17, PONTO=18, VIRGULA=19, PONTO_E_VIRGULA=20, DOIS_PONTOS=21, 
		PORCENTO=22, MAIOR=23, MENOR=24, IGUAL=25, ATRIBUICAO=26, EXCLAMACAO=27, 
		NUMERO=28, COMENTARIO=29, COMENTARIO_BLOCO=30, STRING=31, CHAR=32, BOOLEANO=33, 
		MAIN=34, FOR=35, IN=36, FUNCAO=37, RETURN=38, IF=39, ELSE=40, STRUCT=41, 
		TIPO=42, WHILE=43, DISPLAY=44, INPUT=45, VOID=46, IDENTIFICADOR=47, WS=48, 
		ESC=49;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_mainFunc = 2, RULE_varDecl = 3, RULE_funcDecl = 4, 
		RULE_paramDecl = 5, RULE_exprStmt = 6, RULE_ifStmt = 7, RULE_elseIfStmt = 8, 
		RULE_elseStmt = 9, RULE_whileStmt = 10, RULE_forStmt = 11, RULE_returnStmt = 12, 
		RULE_assignStmt = 13, RULE_printStmt = 14, RULE_scanStmt = 15, RULE_expr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmt", "mainFunc", "varDecl", "funcDecl", "paramDecl", "exprStmt", 
			"ifStmt", "elseIfStmt", "elseStmt", "whileStmt", "forStmt", "returnStmt", 
			"assignStmt", "printStmt", "scanStmt", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'->'", "'-'", "'*'", "'/'", "'\\'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'&&'", "'&'", "'||'", "'|'", "'..'", "'.'", "','", 
			"';'", "':'", "'%'", "'>'", "'<'", "'=='", "'='", "'!'", null, null, 
			null, null, null, null, "'main'", "'for'", "'in'", "'fn'", "'return'", 
			"'if'", "'else'", "'struct'", null, "'while'", "'display'", "'input'", 
			"'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIS", "SETA", "MENOS", "ASTERISCO", "BARRA", "BARRA_INVERTIDA", 
			"ABRE_PARENTESE", "FECHA_PARENTESE", "ABRE_COLCHETE", "FECHA_COLCHETE", 
			"ABRE_CHAVE", "FECHA_CHAVE", "E_LOGICO", "E_BINARIO", "OU_LOGICO", "OU_BINARIO", 
			"PONTO_PONTO", "PONTO", "VIRGULA", "PONTO_E_VIRGULA", "DOIS_PONTOS", 
			"PORCENTO", "MAIOR", "MENOR", "IGUAL", "ATRIBUICAO", "EXCLAMACAO", "NUMERO", 
			"COMENTARIO", "COMENTARIO_BLOCO", "STRING", "CHAR", "BOOLEANO", "MAIN", 
			"FOR", "IN", "FUNCAO", "RETURN", "IF", "ELSE", "STRUCT", "TIPO", "WHILE", 
			"DISPLAY", "INPUT", "VOID", "IDENTIFICADOR", "WS", "ESC"
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			mainFunc();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 207719919255680L) != 0)) {
				{
				{
				setState(35);
				stmt();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
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
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				funcDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				exprStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				printStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(49);
				scanStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(50);
				forStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(51);
				returnStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(52);
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
	}

	public final MainFuncContext mainFunc() throws RecognitionException {
		MainFuncContext _localctx = new MainFuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(FUNCAO);
			setState(56);
			match(MAIN);
			setState(57);
			match(ABRE_PARENTESE);
			setState(58);
			match(FECHA_PARENTESE);
			setState(59);
			match(SETA);
			setState(60);
			match(VOID);
			setState(61);
			match(ABRE_CHAVE);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 207719919255680L) != 0)) {
				{
				{
				setState(62);
				stmt();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(TIPO);
				setState(71);
				match(IDENTIFICADOR);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATRIBUICAO) {
					{
					setState(72);
					match(ATRIBUICAO);
					setState(73);
					expr(0);
					}
				}

				setState(76);
				match(PONTO_E_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(TIPO);
				setState(78);
				match(IDENTIFICADOR);
				setState(79);
				match(ABRE_COLCHETE);
				setState(80);
				match(NUMERO);
				setState(81);
				match(FECHA_COLCHETE);
				setState(82);
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
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(FUNCAO);
			setState(86);
			match(IDENTIFICADOR);
			setState(87);
			match(ABRE_PARENTESE);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(88);
				paramDecl();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(89);
					match(VIRGULA);
					setState(90);
					paramDecl();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(98);
			match(FECHA_PARENTESE);
			setState(99);
			match(SETA);
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==TIPO || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(101);
			match(ABRE_CHAVE);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 207719919255680L) != 0)) {
				{
				{
				setState(102);
				stmt();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
	public static class ParamDeclContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(GramaticaParser.TIPO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDecl; }
	}

	public final ParamDeclContext paramDecl() throws RecognitionException {
		ParamDeclContext _localctx = new ParamDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(TIPO);
			setState(111);
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
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			expr(0);
			setState(114);
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
	public static class IfStmtContext extends ParserRuleContext {
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
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(IF);
			setState(117);
			match(ABRE_PARENTESE);
			setState(118);
			expr(0);
			setState(119);
			match(FECHA_PARENTESE);
			setState(120);
			match(ABRE_CHAVE);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 207719919255680L) != 0)) {
				{
				{
				setState(121);
				stmt();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(FECHA_CHAVE);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					elseIfStmt();
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(134);
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
	}

	public final ElseIfStmtContext elseIfStmt() throws RecognitionException {
		ElseIfStmtContext _localctx = new ElseIfStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseIfStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ELSE);
			setState(138);
			match(IF);
			setState(139);
			match(ABRE_PARENTESE);
			setState(140);
			expr(0);
			setState(141);
			match(FECHA_PARENTESE);
			setState(142);
			match(ABRE_CHAVE);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 207719919255680L) != 0)) {
				{
				{
				setState(143);
				stmt();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
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
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ELSE);
			setState(152);
			match(ABRE_CHAVE);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 207719919255680L) != 0)) {
				{
				{
				setState(153);
				stmt();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(WHILE);
			setState(162);
			match(ABRE_PARENTESE);
			setState(163);
			expr(0);
			setState(164);
			match(FECHA_PARENTESE);
			setState(165);
			match(ABRE_CHAVE);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 207719919255680L) != 0)) {
				{
				{
				setState(166);
				stmt();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
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
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(FOR);
			setState(175);
			match(IDENTIFICADOR);
			setState(176);
			match(IN);
			setState(177);
			match(NUMERO);
			setState(178);
			match(PONTO_PONTO);
			setState(179);
			match(NUMERO);
			setState(180);
			match(ABRE_CHAVE);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 207719919255680L) != 0)) {
				{
				{
				setState(181);
				stmt();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
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
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(RETURN);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 158344975220864L) != 0)) {
				{
				setState(190);
				expr(0);
				}
			}

			setState(193);
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
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignStmt);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(IDENTIFICADOR);
				setState(196);
				match(ATRIBUICAO);
				setState(197);
				expr(0);
				setState(198);
				match(PONTO_E_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(IDENTIFICADOR);
				setState(201);
				match(ABRE_COLCHETE);
				setState(202);
				expr(0);
				setState(203);
				match(FECHA_COLCHETE);
				setState(204);
				match(ATRIBUICAO);
				setState(205);
				expr(0);
				setState(206);
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
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(DISPLAY);
			setState(211);
			match(ABRE_PARENTESE);
			setState(212);
			expr(0);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(213);
				match(VIRGULA);
				setState(214);
				expr(0);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(FECHA_PARENTESE);
			setState(221);
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
	}

	public final ScanStmtContext scanStmt() throws RecognitionException {
		ScanStmtContext _localctx = new ScanStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scanStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(INPUT);
			setState(224);
			match(ABRE_PARENTESE);
			setState(225);
			expr(0);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(226);
				match(VIRGULA);
				setState(227);
				expr(0);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			match(FECHA_PARENTESE);
			setState(234);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(237);
				match(ABRE_PARENTESE);
				setState(238);
				expr(0);
				setState(239);
				match(FECHA_PARENTESE);
				}
				break;
			case 2:
				{
				setState(241);
				match(NUMERO);
				}
				break;
			case 3:
				{
				setState(242);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(243);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(244);
				match(BOOLEANO);
				}
				break;
			case 6:
				{
				setState(245);
				match(IDENTIFICADOR);
				}
				break;
			case 7:
				{
				setState(246);
				match(IDENTIFICADOR);
				setState(247);
				match(ABRE_COLCHETE);
				setState(248);
				expr(0);
				setState(249);
				match(FECHA_COLCHETE);
				}
				break;
			case 8:
				{
				setState(251);
				match(DISPLAY);
				setState(252);
				match(ABRE_PARENTESE);
				setState(253);
				expr(0);
				setState(254);
				match(FECHA_PARENTESE);
				}
				break;
			case 9:
				{
				setState(256);
				match(IDENTIFICADOR);
				setState(257);
				match(ABRE_PARENTESE);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 158344975220864L) != 0)) {
					{
					setState(258);
					expr(0);
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(259);
						match(VIRGULA);
						setState(260);
						expr(0);
						}
						}
						setState(265);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(268);
				match(FECHA_PARENTESE);
				}
				break;
			case 10:
				{
				setState(269);
				assignStmt();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(272);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(273);
						_la = _input.LA(1);
						if ( !(_la==MAIS || _la==MENOS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(274);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(276);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4194352L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(277);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(279);
						match(IGUAL);
						setState(280);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(288);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(282);
							match(MAIOR);
							}
							break;
						case 2:
							{
							setState(283);
							match(MENOR);
							}
							break;
						case 3:
							{
							setState(284);
							match(MAIOR);
							setState(285);
							match(IGUAL);
							}
							break;
						case 4:
							{
							setState(286);
							match(MENOR);
							setState(287);
							match(IGUAL);
							}
							break;
						}
						setState(290);
						expr(12);
						}
						break;
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u0129\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0005\u0000%\b\u0000"+
		"\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002@\b\u0002\n\u0002\f\u0002C\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003K\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003T\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\\\b\u0004\n\u0004\f\u0004"+
		"_\t\u0004\u0003\u0004a\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004h\b\u0004\n\u0004\f\u0004k\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007{\b\u0007\n\u0007\f\u0007~\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0082\b\u0007\n\u0007\f\u0007\u0085\t\u0007"+
		"\u0001\u0007\u0003\u0007\u0088\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u0091\b\b\n\b\f\b\u0094\t\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\t\u009b\b\t\n\t\f\t\u009e\t\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a8"+
		"\b\n\n\n\f\n\u00ab\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00b7\b\u000b\n\u000b\f\u000b\u00ba\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0003\f\u00c0\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00d1\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00d8\b\u000e\n\u000e\f\u000e\u00db\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00e5\b\u000f\n\u000f\f\u000f\u00e8\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0106\b\u0010\n"+
		"\u0010\f\u0010\u0109\t\u0010\u0003\u0010\u010b\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u010f\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0121\b\u0010\u0001\u0010\u0005\u0010\u0124\b\u0010"+
		"\n\u0010\f\u0010\u0127\t\u0010\u0001\u0010\u0000\u0001 \u0011\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \u0000\u0003\u0002\u0000**..\u0002\u0000\u0001\u0001\u0003\u0003\u0002"+
		"\u0000\u0004\u0005\u0016\u0016\u0144\u0000\"\u0001\u0000\u0000\u0000\u0002"+
		"5\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006S\u0001"+
		"\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\nn\u0001\u0000\u0000\u0000"+
		"\fq\u0001\u0000\u0000\u0000\u000et\u0001\u0000\u0000\u0000\u0010\u0089"+
		"\u0001\u0000\u0000\u0000\u0012\u0097\u0001\u0000\u0000\u0000\u0014\u00a1"+
		"\u0001\u0000\u0000\u0000\u0016\u00ae\u0001\u0000\u0000\u0000\u0018\u00bd"+
		"\u0001\u0000\u0000\u0000\u001a\u00d0\u0001\u0000\u0000\u0000\u001c\u00d2"+
		"\u0001\u0000\u0000\u0000\u001e\u00df\u0001\u0000\u0000\u0000 \u010e\u0001"+
		"\u0000\u0000\u0000\"&\u0003\u0004\u0002\u0000#%\u0003\u0002\u0001\u0000"+
		"$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000)*\u0005\u0000\u0000\u0001*\u0001\u0001\u0000\u0000\u0000"+
		"+6\u0003\u0006\u0003\u0000,6\u0003\b\u0004\u0000-6\u0003\f\u0006\u0000"+
		".6\u0003\u000e\u0007\u0000/6\u0003\u0014\n\u000006\u0003\u001c\u000e\u0000"+
		"16\u0003\u001e\u000f\u000026\u0003\u0016\u000b\u000036\u0003\u0018\f\u0000"+
		"46\u0003\u001a\r\u00005+\u0001\u0000\u0000\u00005,\u0001\u0000\u0000\u0000"+
		"5-\u0001\u0000\u0000\u00005.\u0001\u0000\u0000\u00005/\u0001\u0000\u0000"+
		"\u000050\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u000052\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u00006\u0003"+
		"\u0001\u0000\u0000\u000078\u0005%\u0000\u000089\u0005\"\u0000\u00009:"+
		"\u0005\u0007\u0000\u0000:;\u0005\b\u0000\u0000;<\u0005\u0002\u0000\u0000"+
		"<=\u0005.\u0000\u0000=A\u0005\u000b\u0000\u0000>@\u0003\u0002\u0001\u0000"+
		"?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000DE\u0005\f\u0000\u0000E\u0005\u0001\u0000\u0000\u0000FG\u0005"+
		"*\u0000\u0000GJ\u0005/\u0000\u0000HI\u0005\u001a\u0000\u0000IK\u0003 "+
		"\u0010\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LT\u0005\u0014\u0000\u0000MN\u0005*\u0000\u0000NO\u0005"+
		"/\u0000\u0000OP\u0005\t\u0000\u0000PQ\u0005\u001c\u0000\u0000QR\u0005"+
		"\n\u0000\u0000RT\u0005\u0014\u0000\u0000SF\u0001\u0000\u0000\u0000SM\u0001"+
		"\u0000\u0000\u0000T\u0007\u0001\u0000\u0000\u0000UV\u0005%\u0000\u0000"+
		"VW\u0005/\u0000\u0000W`\u0005\u0007\u0000\u0000X]\u0003\n\u0005\u0000"+
		"YZ\u0005\u0013\u0000\u0000Z\\\u0003\n\u0005\u0000[Y\u0001\u0000\u0000"+
		"\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`X\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bc\u0005\b\u0000\u0000cd\u0005\u0002\u0000\u0000de\u0007\u0000\u0000\u0000"+
		"ei\u0005\u000b\u0000\u0000fh\u0003\u0002\u0001\u0000gf\u0001\u0000\u0000"+
		"\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005"+
		"\f\u0000\u0000m\t\u0001\u0000\u0000\u0000no\u0005*\u0000\u0000op\u0005"+
		"/\u0000\u0000p\u000b\u0001\u0000\u0000\u0000qr\u0003 \u0010\u0000rs\u0005"+
		"\u0014\u0000\u0000s\r\u0001\u0000\u0000\u0000tu\u0005\'\u0000\u0000uv"+
		"\u0005\u0007\u0000\u0000vw\u0003 \u0010\u0000wx\u0005\b\u0000\u0000x|"+
		"\u0005\u000b\u0000\u0000y{\u0003\u0002\u0001\u0000zy\u0001\u0000\u0000"+
		"\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"\u007f\u0083\u0005\f\u0000\u0000\u0080\u0082\u0003\u0010\b\u0000\u0081"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u0003\u0012\t\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u000f\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005(\u0000\u0000\u008a\u008b\u0005\'\u0000\u0000\u008b\u008c\u0005"+
		"\u0007\u0000\u0000\u008c\u008d\u0003 \u0010\u0000\u008d\u008e\u0005\b"+
		"\u0000\u0000\u008e\u0092\u0005\u000b\u0000\u0000\u008f\u0091\u0003\u0002"+
		"\u0001\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005\f\u0000\u0000\u0096\u0011\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005(\u0000\u0000\u0098\u009c\u0005\u000b\u0000\u0000"+
		"\u0099\u009b\u0003\u0002\u0001\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\f\u0000\u0000\u00a0"+
		"\u0013\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005+\u0000\u0000\u00a2\u00a3"+
		"\u0005\u0007\u0000\u0000\u00a3\u00a4\u0003 \u0010\u0000\u00a4\u00a5\u0005"+
		"\b\u0000\u0000\u00a5\u00a9\u0005\u000b\u0000\u0000\u00a6\u00a8\u0003\u0002"+
		"\u0001\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005\f\u0000\u0000\u00ad\u0015\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005#\u0000\u0000\u00af\u00b0\u0005/\u0000\u0000\u00b0"+
		"\u00b1\u0005$\u0000\u0000\u00b1\u00b2\u0005\u001c\u0000\u0000\u00b2\u00b3"+
		"\u0005\u0011\u0000\u0000\u00b3\u00b4\u0005\u001c\u0000\u0000\u00b4\u00b8"+
		"\u0005\u000b\u0000\u0000\u00b5\u00b7\u0003\u0002\u0001\u0000\u00b6\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0005\f\u0000\u0000\u00bc\u0017\u0001\u0000\u0000\u0000\u00bd\u00bf\u0005"+
		"&\u0000\u0000\u00be\u00c0\u0003 \u0010\u0000\u00bf\u00be\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005\u0014\u0000\u0000\u00c2\u0019\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005/\u0000\u0000\u00c4\u00c5\u0005\u001a\u0000\u0000"+
		"\u00c5\u00c6\u0003 \u0010\u0000\u00c6\u00c7\u0005\u0014\u0000\u0000\u00c7"+
		"\u00d1\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005/\u0000\u0000\u00c9\u00ca"+
		"\u0005\t\u0000\u0000\u00ca\u00cb\u0003 \u0010\u0000\u00cb\u00cc\u0005"+
		"\n\u0000\u0000\u00cc\u00cd\u0005\u001a\u0000\u0000\u00cd\u00ce\u0003 "+
		"\u0010\u0000\u00ce\u00cf\u0005\u0014\u0000\u0000\u00cf\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d0\u00c3\u0001\u0000\u0000\u0000\u00d0\u00c8\u0001\u0000"+
		"\u0000\u0000\u00d1\u001b\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005,\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0007\u0000\u0000\u00d4\u00d9\u0003 \u0010\u0000"+
		"\u00d5\u00d6\u0005\u0013\u0000\u0000\u00d6\u00d8\u0003 \u0010\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"\u00dc\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005\b\u0000\u0000\u00dd\u00de\u0005\u0014\u0000\u0000\u00de\u001d"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005-\u0000\u0000\u00e0\u00e1\u0005"+
		"\u0007\u0000\u0000\u00e1\u00e6\u0003 \u0010\u0000\u00e2\u00e3\u0005\u0013"+
		"\u0000\u0000\u00e3\u00e5\u0003 \u0010\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\b\u0000\u0000"+
		"\u00ea\u00eb\u0005\u0014\u0000\u0000\u00eb\u001f\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0006\u0010\uffff\uffff\u0000\u00ed\u00ee\u0005\u0007\u0000"+
		"\u0000\u00ee\u00ef\u0003 \u0010\u0000\u00ef\u00f0\u0005\b\u0000\u0000"+
		"\u00f0\u010f\u0001\u0000\u0000\u0000\u00f1\u010f\u0005\u001c\u0000\u0000"+
		"\u00f2\u010f\u0005\u001f\u0000\u0000\u00f3\u010f\u0005 \u0000\u0000\u00f4"+
		"\u010f\u0005!\u0000\u0000\u00f5\u010f\u0005/\u0000\u0000\u00f6\u00f7\u0005"+
		"/\u0000\u0000\u00f7\u00f8\u0005\t\u0000\u0000\u00f8\u00f9\u0003 \u0010"+
		"\u0000\u00f9\u00fa\u0005\n\u0000\u0000\u00fa\u010f\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0005,\u0000\u0000\u00fc\u00fd\u0005\u0007\u0000\u0000\u00fd"+
		"\u00fe\u0003 \u0010\u0000\u00fe\u00ff\u0005\b\u0000\u0000\u00ff\u010f"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005/\u0000\u0000\u0101\u010a\u0005"+
		"\u0007\u0000\u0000\u0102\u0107\u0003 \u0010\u0000\u0103\u0104\u0005\u0013"+
		"\u0000\u0000\u0104\u0106\u0003 \u0010\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u0102\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"+
		"\u0000\u010c\u010f\u0005\b\u0000\u0000\u010d\u010f\u0003\u001a\r\u0000"+
		"\u010e\u00ec\u0001\u0000\u0000\u0000\u010e\u00f1\u0001\u0000\u0000\u0000"+
		"\u010e\u00f2\u0001\u0000\u0000\u0000\u010e\u00f3\u0001\u0000\u0000\u0000"+
		"\u010e\u00f4\u0001\u0000\u0000\u0000\u010e\u00f5\u0001\u0000\u0000\u0000"+
		"\u010e\u00f6\u0001\u0000\u0000\u0000\u010e\u00fb\u0001\u0000\u0000\u0000"+
		"\u010e\u0100\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000"+
		"\u010f\u0125\u0001\u0000\u0000\u0000\u0110\u0111\n\u000e\u0000\u0000\u0111"+
		"\u0112\u0007\u0001\u0000\u0000\u0112\u0124\u0003 \u0010\u000f\u0113\u0114"+
		"\n\r\u0000\u0000\u0114\u0115\u0007\u0002\u0000\u0000\u0115\u0124\u0003"+
		" \u0010\u000e\u0116\u0117\n\f\u0000\u0000\u0117\u0118\u0005\u0019\u0000"+
		"\u0000\u0118\u0124\u0003 \u0010\r\u0119\u0120\n\u000b\u0000\u0000\u011a"+
		"\u0121\u0005\u0017\u0000\u0000\u011b\u0121\u0005\u0018\u0000\u0000\u011c"+
		"\u011d\u0005\u0017\u0000\u0000\u011d\u0121\u0005\u0019\u0000\u0000\u011e"+
		"\u011f\u0005\u0018\u0000\u0000\u011f\u0121\u0005\u0019\u0000\u0000\u0120"+
		"\u011a\u0001\u0000\u0000\u0000\u0120\u011b\u0001\u0000\u0000\u0000\u0120"+
		"\u011c\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0003 \u0010\f\u0123\u0110"+
		"\u0001\u0000\u0000\u0000\u0123\u0113\u0001\u0000\u0000\u0000\u0123\u0116"+
		"\u0001\u0000\u0000\u0000\u0123\u0119\u0001\u0000\u0000\u0000\u0124\u0127"+
		"\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u0126!\u0001\u0000\u0000\u0000\u0127\u0125\u0001"+
		"\u0000\u0000\u0000\u0019&5AJS]`i|\u0083\u0087\u0092\u009c\u00a9\u00b8"+
		"\u00bf\u00d0\u00d9\u00e6\u0107\u010a\u010e\u0120\u0123\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}