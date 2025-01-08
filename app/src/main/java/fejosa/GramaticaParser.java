package fejosa;

// Generated from Gramatica.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue" })
public class GramaticaParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int MAIS = 1, SETA = 2, MENOS = 3, ASTERISCO = 4, BARRA = 5, BARRA_INVERTIDA = 6,
			ABRE_PARENTESE = 7,
			FECHA_PARENTESE = 8, ABRE_COLCHETE = 9, FECHA_COLCHETE = 10, ABRE_CHAVE = 11,
			FECHA_CHAVE = 12, E_LOGICO = 13, E_BINARIO = 14, OU_LOGICO = 15, OU_BINARIO = 16,
			PONTO_PONTO = 17, PONTO = 18, VIRGULA = 19, PONTO_E_VIRGULA = 20, DOIS_PONTOS = 21,
			PORCENTO = 22, MAIOR = 23, MENOR = 24, IGUAL = 25, ATRIBUICAO = 26, EXCLAMACAO = 27,
			NUMERO = 28, COMENTARIO = 29, COMENTARIO_BLOCO = 30, STRING = 31, CHAR = 32, BOOLEANO = 33,
			MAIN = 34, FOR = 35, IN = 36, FUNCAO = 37, VOID = 38, RETURN = 39, IF = 40, ELSE = 41,
			STRUCT = 42, TIPO = 43, IDENTIFICADOR = 44, WHILE = 45, WS = 46, ESC = 47;
	public static final int RULE_prog = 0, RULE_stmt = 1, RULE_varDecl = 2, RULE_funcDecl = 3, RULE_exprStmt = 4,
			RULE_ifStmt = 5, RULE_whileStmt = 6, RULE_forStmt = 7, RULE_returnStmt = 8,
			RULE_expr = 9;

	private static String[] makeRuleNames() {
		return new String[] {
				"prog", "stmt", "varDecl", "funcDecl", "exprStmt", "ifStmt", "whileStmt",
				"forStmt", "returnStmt", "expr"
		};
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'+'", "'->'", "'-'", "'*'", "'/'", "'\\'", "'('", "')'", "'['",
				"']'", "'{'", "'}'", "'&&'", "'&'", "'||'", "'|'", "'..'", "'.'", "','",
				"';'", "':'", "'%'", "'>'", "'<'", "'=='", "'='", "'!'", null, null,
				null, null, null, null, "'main'", "'for'", "'in'", "'fn'", "'void'",
				"'return'", "'if'", "'else'", "'struct'", null, null, "'while'"
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
				"FOR", "IN", "FUNCAO", "VOID", "RETURN", "IF", "ELSE", "STRUCT", "TIPO",
				"IDENTIFICADOR", "WHILE", "WS", "ESC"
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
	public String getGrammarFileName() {
		return "Gramatica.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() {
			return getToken(GramaticaParser.EOF, 0);
		}

		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}

		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class, i);
		}

		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_prog;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GramaticaVisitor)
				return ((GramaticaVisitor<? extends T>) visitor).visitProg(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(20);
							stmt();
						}
					}
					setState(23);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 63400428175360L) != 0));
				setState(25);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class, 0);
		}

		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class, 0);
		}

		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class, 0);
		}

		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class, 0);
		}

		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class, 0);
		}

		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class, 0);
		}

		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class, 0);
		}

		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_stmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GramaticaVisitor)
				return ((GramaticaVisitor<? extends T>) visitor).visitStmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case TIPO:
					enterOuterAlt(_localctx, 1); {
					setState(27);
					varDecl();
				}
					break;
				case FUNCAO:
					enterOuterAlt(_localctx, 2); {
					setState(28);
					funcDecl();
				}
					break;
				case NUMERO:
				case STRING:
				case CHAR:
				case IDENTIFICADOR:
					enterOuterAlt(_localctx, 3); {
					setState(29);
					exprStmt();
				}
					break;
				case IF:
					enterOuterAlt(_localctx, 4); {
					setState(30);
					ifStmt();
				}
					break;
				case WHILE:
					enterOuterAlt(_localctx, 5); {
					setState(31);
					whileStmt();
				}
					break;
				case FOR:
					enterOuterAlt(_localctx, 6); {
					setState(32);
					forStmt();
				}
					break;
				case RETURN:
					enterOuterAlt(_localctx, 7); {
					setState(33);
					returnStmt();
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode TIPO() {
			return getToken(GramaticaParser.TIPO, 0);
		}

		public TerminalNode IDENTIFICADOR() {
			return getToken(GramaticaParser.IDENTIFICADOR, 0);
		}

		public TerminalNode PONTO_E_VIRGULA() {
			return getToken(GramaticaParser.PONTO_E_VIRGULA, 0);
		}

		public TerminalNode ATRIBUICAO() {
			return getToken(GramaticaParser.ATRIBUICAO, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_varDecl;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GramaticaVisitor)
				return ((GramaticaVisitor<? extends T>) visitor).visitVarDecl(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(36);
				match(TIPO);
				setState(37);
				match(IDENTIFICADOR);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == ATRIBUICAO) {
					{
						setState(38);
						match(ATRIBUICAO);
						setState(39);
						expr(0);
					}
				}

				setState(42);
				match(PONTO_E_VIRGULA);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDeclContext extends ParserRuleContext {
		public TerminalNode FUNCAO() {
			return getToken(GramaticaParser.FUNCAO, 0);
		}

		public TerminalNode IDENTIFICADOR() {
			return getToken(GramaticaParser.IDENTIFICADOR, 0);
		}

		public TerminalNode ABRE_PARENTESE() {
			return getToken(GramaticaParser.ABRE_PARENTESE, 0);
		}

		public TerminalNode FECHA_PARENTESE() {
			return getToken(GramaticaParser.FECHA_PARENTESE, 0);
		}

		public TerminalNode ABRE_CHAVE() {
			return getToken(GramaticaParser.ABRE_CHAVE, 0);
		}

		public TerminalNode FECHA_CHAVE() {
			return getToken(GramaticaParser.FECHA_CHAVE, 0);
		}

		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}

		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class, i);
		}

		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_funcDecl;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GramaticaVisitor)
				return ((GramaticaVisitor<? extends T>) visitor).visitFuncDecl(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(44);
				match(FUNCAO);
				setState(45);
				match(IDENTIFICADOR);
				setState(46);
				match(ABRE_PARENTESE);
				setState(47);
				match(FECHA_PARENTESE);
				setState(48);
				match(ABRE_CHAVE);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 63400428175360L) != 0)) {
					{
						{
							setState(49);
							stmt();
						}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				match(FECHA_CHAVE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode PONTO_E_VIRGULA() {
			return getToken(GramaticaParser.PONTO_E_VIRGULA, 0);
		}

		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_exprStmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GramaticaVisitor)
				return ((GramaticaVisitor<? extends T>) visitor).visitExprStmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(57);
				expr(0);
				setState(58);
				match(PONTO_E_VIRGULA);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() {
			return getToken(GramaticaParser.IF, 0);
		}

		public TerminalNode ABRE_PARENTESE() {
			return getToken(GramaticaParser.ABRE_PARENTESE, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode FECHA_PARENTESE() {
			return getToken(GramaticaParser.FECHA_PARENTESE, 0);
		}

		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}

		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class, i);
		}

		public TerminalNode ELSE() {
			return getToken(GramaticaParser.ELSE, 0);
		}

		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifStmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GramaticaVisitor)
				return ((GramaticaVisitor<? extends T>) visitor).visitIfStmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(60);
				match(IF);
				setState(61);
				match(ABRE_PARENTESE);
				setState(62);
				expr(0);
				setState(63);
				match(FECHA_PARENTESE);
				setState(64);
				stmt();
				setState(67);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
					case 1: {
						setState(65);
						match(ELSE);
						setState(66);
						stmt();
					}
						break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() {
			return getToken(GramaticaParser.WHILE, 0);
		}

		public TerminalNode ABRE_PARENTESE() {
			return getToken(GramaticaParser.ABRE_PARENTESE, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode FECHA_PARENTESE() {
			return getToken(GramaticaParser.FECHA_PARENTESE, 0);
		}

		public StmtContext stmt() {
			return getRuleContext(StmtContext.class, 0);
		}

		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_whileStmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GramaticaVisitor)
				return ((GramaticaVisitor<? extends T>) visitor).visitWhileStmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(69);
				match(WHILE);
				setState(70);
				match(ABRE_PARENTESE);
				setState(71);
				expr(0);
				setState(72);
				match(FECHA_PARENTESE);
				setState(73);
				stmt();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() {
			return getToken(GramaticaParser.FOR, 0);
		}

		public TerminalNode ABRE_PARENTESE() {
			return getToken(GramaticaParser.ABRE_PARENTESE, 0);
		}

		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class, 0);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode PONTO_E_VIRGULA() {
			return getToken(GramaticaParser.PONTO_E_VIRGULA, 0);
		}

		public TerminalNode FECHA_PARENTESE() {
			return getToken(GramaticaParser.FECHA_PARENTESE, 0);
		}

		public StmtContext stmt() {
			return getRuleContext(StmtContext.class, 0);
		}

		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forStmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GramaticaVisitor)
				return ((GramaticaVisitor<? extends T>) visitor).visitForStmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(75);
				match(FOR);
				setState(76);
				match(ABRE_PARENTESE);
				setState(77);
				varDecl();
				setState(78);
				expr(0);
				setState(79);
				match(PONTO_E_VIRGULA);
				setState(80);
				expr(0);
				setState(81);
				match(FECHA_PARENTESE);
				setState(82);
				stmt();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() {
			return getToken(GramaticaParser.RETURN, 0);
		}

		public TerminalNode PONTO_E_VIRGULA() {
			return getToken(GramaticaParser.PONTO_E_VIRGULA, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_returnStmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GramaticaVisitor)
				return ((GramaticaVisitor<? extends T>) visitor).visitReturnStmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(84);
				match(RETURN);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17598896930816L) != 0)) {
					{
						setState(85);
						expr(0);
					}
				}

				setState(88);
				match(PONTO_E_VIRGULA);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUMERO() {
			return getToken(GramaticaParser.NUMERO, 0);
		}

		public TerminalNode STRING() {
			return getToken(GramaticaParser.STRING, 0);
		}

		public TerminalNode CHAR() {
			return getToken(GramaticaParser.CHAR, 0);
		}

		public TerminalNode IDENTIFICADOR() {
			return getToken(GramaticaParser.IDENTIFICADOR, 0);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode MAIS() {
			return getToken(GramaticaParser.MAIS, 0);
		}

		public TerminalNode MENOS() {
			return getToken(GramaticaParser.MENOS, 0);
		}

		public TerminalNode ASTERISCO() {
			return getToken(GramaticaParser.ASTERISCO, 0);
		}

		public TerminalNode BARRA() {
			return getToken(GramaticaParser.BARRA, 0);
		}

		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GramaticaVisitor)
				return ((GramaticaVisitor<? extends T>) visitor).visitExpr(this);
			else
				return visitor.visitChildren(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case NUMERO: {
						setState(91);
						match(NUMERO);
					}
						break;
					case STRING: {
						setState(92);
						match(STRING);
					}
						break;
					case CHAR: {
						setState(93);
						match(CHAR);
					}
						break;
					case IDENTIFICADOR: {
						setState(94);
						match(IDENTIFICADOR);
					}
						break;
					default:
						throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(103);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
								case 1: {
									_localctx = new ExprContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(97);
									if (!(precpred(_ctx, 6)))
										throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(98);
									_la = _input.LA(1);
									if (!(_la == MAIS || _la == MENOS)) {
										_errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == EOF)
											matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(99);
									expr(7);
								}
									break;
								case 2: {
									_localctx = new ExprContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(100);
									if (!(precpred(_ctx, 5)))
										throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(101);
									_la = _input.LA(1);
									if (!(_la == ASTERISCO || _la == BARRA)) {
										_errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == EOF)
											matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(102);
									expr(6);
								}
									break;
							}
						}
					}
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 9:
				return expr_sempred((ExprContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 6);
			case 1:
				return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN = "\u0004\u0001/m\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"
			+
			"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005" +
			"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007" +
			"\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000\u000b\u0000\f" +
			"\u0000\u0017\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001" +
			"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001#\b\u0001" +
			"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002)\b\u0002" +
			"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
			"\u0001\u0003\u0001\u0003\u0005\u00033\b\u0003\n\u0003\f\u00036\t\u0003" +
			"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005" +
			"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005" +
			"\u0003\u0005D\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
			"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
			"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001" +
			"\b\u0003\bW\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001" +
			"\t\u0003\t`\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005" +
			"\th\b\t\n\t\f\tk\t\t\u0001\t\u0000\u0001\u0012\n\u0000\u0002\u0004\u0006" +
			"\b\n\f\u000e\u0010\u0012\u0000\u0002\u0002\u0000\u0001\u0001\u0003\u0003" +
			"\u0001\u0000\u0004\u0005r\u0000\u0015\u0001\u0000\u0000\u0000\u0002\"" +
			"\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006,\u0001\u0000" +
			"\u0000\u0000\b9\u0001\u0000\u0000\u0000\n<\u0001\u0000\u0000\u0000\fE" +
			"\u0001\u0000\u0000\u0000\u000eK\u0001\u0000\u0000\u0000\u0010T\u0001\u0000" +
			"\u0000\u0000\u0012_\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001" +
			"\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000" +
			"\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000" +
			"\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0000\u0000" +
			"\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b#\u0003\u0004\u0002\u0000" +
			"\u001c#\u0003\u0006\u0003\u0000\u001d#\u0003\b\u0004\u0000\u001e#\u0003" +
			"\n\u0005\u0000\u001f#\u0003\f\u0006\u0000 #\u0003\u000e\u0007\u0000!#" +
			"\u0003\u0010\b\u0000\"\u001b\u0001\u0000\u0000\u0000\"\u001c\u0001\u0000" +
			"\u0000\u0000\"\u001d\u0001\u0000\u0000\u0000\"\u001e\u0001\u0000\u0000" +
			"\u0000\"\u001f\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"!\u0001" +
			"\u0000\u0000\u0000#\u0003\u0001\u0000\u0000\u0000$%\u0005+\u0000\u0000" +
			"%(\u0005,\u0000\u0000&\'\u0005\u001a\u0000\u0000\')\u0003\u0012\t\u0000" +
			"(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000" +
			"\u0000*+\u0005\u0014\u0000\u0000+\u0005\u0001\u0000\u0000\u0000,-\u0005" +
			"%\u0000\u0000-.\u0005,\u0000\u0000./\u0005\u0007\u0000\u0000/0\u0005\b" +
			"\u0000\u000004\u0005\u000b\u0000\u000013\u0003\u0002\u0001\u000021\u0001" +
			"\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000" +
			"45\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001\u0000\u0000" +
			"\u000078\u0005\f\u0000\u00008\u0007\u0001\u0000\u0000\u00009:\u0003\u0012" +
			"\t\u0000:;\u0005\u0014\u0000\u0000;\t\u0001\u0000\u0000\u0000<=\u0005" +
			"(\u0000\u0000=>\u0005\u0007\u0000\u0000>?\u0003\u0012\t\u0000?@\u0005" +
			"\b\u0000\u0000@C\u0003\u0002\u0001\u0000AB\u0005)\u0000\u0000BD\u0003" +
			"\u0002\u0001\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000" +
			"D\u000b\u0001\u0000\u0000\u0000EF\u0005-\u0000\u0000FG\u0005\u0007\u0000" +
			"\u0000GH\u0003\u0012\t\u0000HI\u0005\b\u0000\u0000IJ\u0003\u0002\u0001" +
			"\u0000J\r\u0001\u0000\u0000\u0000KL\u0005#\u0000\u0000LM\u0005\u0007\u0000" +
			"\u0000MN\u0003\u0004\u0002\u0000NO\u0003\u0012\t\u0000OP\u0005\u0014\u0000" +
			"\u0000PQ\u0003\u0012\t\u0000QR\u0005\b\u0000\u0000RS\u0003\u0002\u0001" +
			"\u0000S\u000f\u0001\u0000\u0000\u0000TV\u0005\'\u0000\u0000UW\u0003\u0012" +
			"\t\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000" +
			"\u0000\u0000XY\u0005\u0014\u0000\u0000Y\u0011\u0001\u0000\u0000\u0000" +
			"Z[\u0006\t\uffff\uffff\u0000[`\u0005\u001c\u0000\u0000\\`\u0005\u001f" +
			"\u0000\u0000]`\u0005 \u0000\u0000^`\u0005,\u0000\u0000_Z\u0001\u0000\u0000" +
			"\u0000_\\\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000" +
			"\u0000\u0000`i\u0001\u0000\u0000\u0000ab\n\u0006\u0000\u0000bc\u0007\u0000" +
			"\u0000\u0000ch\u0003\u0012\t\u0007de\n\u0005\u0000\u0000ef\u0007\u0001" +
			"\u0000\u0000fh\u0003\u0012\t\u0006ga\u0001\u0000\u0000\u0000gd\u0001\u0000" +
			"\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001" +
			"\u0000\u0000\u0000j\u0013\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000" +
			"\u0000\t\u0017\"(4CV_gi";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}