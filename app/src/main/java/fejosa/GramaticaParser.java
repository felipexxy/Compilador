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
			MAIN = 34, FOR = 35, IN = 36, FUNCAO = 37, RETURN = 38, IF = 39, ELSE = 40, STRUCT = 41,
			TIPO = 42, IDENTIFICADOR = 43, WHILE = 44, WS = 45, ESC = 46;
	public static final int RULE_prog = 0, RULE_stmt = 1, RULE_varDecl = 2, RULE_funcDecl = 3, RULE_exprStmt = 4,
			RULE_ifStmt = 5, RULE_elseIfStmt = 6, RULE_elseStmt = 7, RULE_whileStmt = 8,
			RULE_forStmt = 9, RULE_returnStmt = 10, RULE_assignStmt = 11, RULE_expr = 12;

	private static String[] makeRuleNames() {
		return new String[] {
				"prog", "stmt", "varDecl", "funcDecl", "exprStmt", "ifStmt", "elseIfStmt",
				"elseStmt", "whileStmt", "forStmt", "returnStmt", "assignStmt", "expr"
		};
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'+'", "'->'", "'-'", "'*'", "'/'", "'\\'", "'('", "')'", "'['",
				"']'", "'{'", "'}'", "'&&'", "'&'", "'||'", "'|'", "'..'", "'.'", "','",
				"';'", "':'", "'%'", "'>'", "'<'", "'=='", "'='", "'!'", null, null,
				null, null, null, null, "'main'", "'for'", "'in'", "'fn'", "'return'",
				"'if'", "'else'", "'struct'", null, null, "'while'"
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
				"FOR", "IN", "FUNCAO", "RETURN", "IF", "ELSE", "STRUCT", "TIPO", "IDENTIFICADOR",
				"WHILE", "WS", "ESC"
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
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(26);
							stmt();
						}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31789468876800L) != 0));
				setState(31);
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
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case TIPO:
					enterOuterAlt(_localctx, 1); {
					setState(33);
					varDecl();
				}
					break;
				case FUNCAO:
					enterOuterAlt(_localctx, 2); {
					setState(34);
					funcDecl();
				}
					break;
				case NUMERO:
				case STRING:
				case CHAR:
				case IDENTIFICADOR:
					enterOuterAlt(_localctx, 3); {
					setState(35);
					exprStmt();
				}
					break;
				case IF:
					enterOuterAlt(_localctx, 4); {
					setState(36);
					ifStmt();
				}
					break;
				case WHILE:
					enterOuterAlt(_localctx, 5); {
					setState(37);
					whileStmt();
				}
					break;
				case FOR:
					enterOuterAlt(_localctx, 6); {
					setState(38);
					forStmt();
				}
					break;
				case RETURN:
					enterOuterAlt(_localctx, 7); {
					setState(39);
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

		public TerminalNode ABRE_COLCHETE() {
			return getToken(GramaticaParser.ABRE_COLCHETE, 0);
		}

		public TerminalNode NUMERO() {
			return getToken(GramaticaParser.NUMERO, 0);
		}

		public TerminalNode FECHA_COLCHETE() {
			return getToken(GramaticaParser.FECHA_COLCHETE, 0);
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
			setState(55);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1); {
					setState(42);
					match(TIPO);
					setState(43);
					match(IDENTIFICADOR);
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == ATRIBUICAO) {
						{
							setState(44);
							match(ATRIBUICAO);
							setState(45);
							expr(0);
						}
					}

					setState(48);
					match(PONTO_E_VIRGULA);
				}
					break;
				case 2:
					enterOuterAlt(_localctx, 2); {
					setState(49);
					match(TIPO);
					setState(50);
					match(IDENTIFICADOR);
					setState(51);
					match(ABRE_COLCHETE);
					setState(52);
					match(NUMERO);
					setState(53);
					match(FECHA_COLCHETE);
					setState(54);
					match(PONTO_E_VIRGULA);
				}
					break;
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

		public List<TerminalNode> IDENTIFICADOR() {
			return getTokens(GramaticaParser.IDENTIFICADOR);
		}

		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(GramaticaParser.IDENTIFICADOR, i);
		}

		public TerminalNode ABRE_PARENTESE() {
			return getToken(GramaticaParser.ABRE_PARENTESE, 0);
		}

		public TerminalNode FECHA_PARENTESE() {
			return getToken(GramaticaParser.FECHA_PARENTESE, 0);
		}

		public TerminalNode SETA() {
			return getToken(GramaticaParser.SETA, 0);
		}

		public TerminalNode TIPO() {
			return getToken(GramaticaParser.TIPO, 0);
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

		public List<TerminalNode> VIRGULA() {
			return getTokens(GramaticaParser.VIRGULA);
		}

		public TerminalNode VIRGULA(int i) {
			return getToken(GramaticaParser.VIRGULA, i);
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
				setState(57);
				match(FUNCAO);
				setState(58);
				match(IDENTIFICADOR);
				setState(59);
				match(ABRE_PARENTESE);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == IDENTIFICADOR) {
					{
						setState(60);
						match(IDENTIFICADOR);
						setState(65);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == VIRGULA) {
							{
								{
									setState(61);
									match(VIRGULA);
									setState(62);
									match(IDENTIFICADOR);
								}
							}
							setState(67);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(70);
				match(FECHA_PARENTESE);
				setState(71);
				match(SETA);
				setState(72);
				match(TIPO);
				setState(73);
				match(ABRE_CHAVE);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31789468876800L) != 0)) {
					{
						{
							setState(74);
							stmt();
						}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
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
				setState(82);
				expr(0);
				setState(83);
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

		public StmtContext stmt() {
			return getRuleContext(StmtContext.class, 0);
		}

		public List<ElseIfStmtContext> elseIfStmt() {
			return getRuleContexts(ElseIfStmtContext.class);
		}

		public ElseIfStmtContext elseIfStmt(int i) {
			return getRuleContext(ElseIfStmtContext.class, i);
		}

		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class, 0);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(85);
				match(IF);
				setState(86);
				match(ABRE_PARENTESE);
				setState(87);
				expr(0);
				setState(88);
				match(FECHA_PARENTESE);
				setState(89);
				stmt();
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(90);
								elseIfStmt();
							}
						}
					}
					setState(95);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
				}
				setState(97);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
					case 1: {
						setState(96);
						elseStmt();
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
	public static class ElseIfStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() {
			return getToken(GramaticaParser.ELSE, 0);
		}

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

		public StmtContext stmt() {
			return getRuleContext(StmtContext.class, 0);
		}

		public ElseIfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elseIfStmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GramaticaVisitor)
				return ((GramaticaVisitor<? extends T>) visitor).visitElseIfStmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ElseIfStmtContext elseIfStmt() throws RecognitionException {
		ElseIfStmtContext _localctx = new ElseIfStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseIfStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(99);
				match(ELSE);
				setState(100);
				match(IF);
				setState(101);
				match(ABRE_PARENTESE);
				setState(102);
				expr(0);
				setState(103);
				match(FECHA_PARENTESE);
				setState(104);
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
	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() {
			return getToken(GramaticaParser.ELSE, 0);
		}

		public StmtContext stmt() {
			return getRuleContext(StmtContext.class, 0);
		}

		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elseStmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GramaticaVisitor)
				return ((GramaticaVisitor<? extends T>) visitor).visitElseStmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(106);
				match(ELSE);
				setState(107);
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
		enterRule(_localctx, 16, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(109);
				match(WHILE);
				setState(110);
				match(ABRE_PARENTESE);
				setState(111);
				expr(0);
				setState(112);
				match(FECHA_PARENTESE);
				setState(113);
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

		public TerminalNode IDENTIFICADOR() {
			return getToken(GramaticaParser.IDENTIFICADOR, 0);
		}

		public TerminalNode IN() {
			return getToken(GramaticaParser.IN, 0);
		}

		public List<TerminalNode> NUMERO() {
			return getTokens(GramaticaParser.NUMERO);
		}

		public TerminalNode NUMERO(int i) {
			return getToken(GramaticaParser.NUMERO, i);
		}

		public TerminalNode PONTO_PONTO() {
			return getToken(GramaticaParser.PONTO_PONTO, 0);
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
		enterRule(_localctx, 18, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(115);
				match(FOR);
				setState(116);
				match(IDENTIFICADOR);
				setState(117);
				match(IN);
				setState(118);
				match(NUMERO);
				setState(119);
				match(PONTO_PONTO);
				setState(120);
				match(NUMERO);
				setState(121);
				match(ABRE_CHAVE);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31789468876800L) != 0)) {
					{
						{
							setState(122);
							stmt();
						}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
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
		enterRule(_localctx, 20, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(130);
				match(RETURN);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8802803908608L) != 0)) {
					{
						setState(131);
						expr(0);
					}
				}

				setState(134);
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
	public static class AssignStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() {
			return getToken(GramaticaParser.IDENTIFICADOR, 0);
		}

		public TerminalNode ATRIBUICAO() {
			return getToken(GramaticaParser.ATRIBUICAO, 0);
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

		public TerminalNode ABRE_COLCHETE() {
			return getToken(GramaticaParser.ABRE_COLCHETE, 0);
		}

		public TerminalNode FECHA_COLCHETE() {
			return getToken(GramaticaParser.FECHA_COLCHETE, 0);
		}

		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignStmt;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GramaticaVisitor)
				return ((GramaticaVisitor<? extends T>) visitor).visitAssignStmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignStmt);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1); {
					setState(136);
					match(IDENTIFICADOR);
					setState(137);
					match(ATRIBUICAO);
					setState(138);
					expr(0);
					setState(139);
					match(PONTO_E_VIRGULA);
				}
					break;
				case 2:
					enterOuterAlt(_localctx, 2); {
					setState(141);
					match(IDENTIFICADOR);
					setState(142);
					match(ABRE_COLCHETE);
					setState(143);
					expr(0);
					setState(144);
					match(FECHA_COLCHETE);
					setState(145);
					match(ATRIBUICAO);
					setState(146);
					expr(0);
					setState(147);
					match(PONTO_E_VIRGULA);
				}
					break;
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

		public TerminalNode ABRE_COLCHETE() {
			return getToken(GramaticaParser.ABRE_COLCHETE, 0);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode FECHA_COLCHETE() {
			return getToken(GramaticaParser.FECHA_COLCHETE, 0);
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

		public TerminalNode IGUAL() {
			return getToken(GramaticaParser.IGUAL, 0);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(161);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
					case 1: {
						setState(152);
						match(NUMERO);
					}
						break;
					case 2: {
						setState(153);
						match(STRING);
					}
						break;
					case 3: {
						setState(154);
						match(CHAR);
					}
						break;
					case 4: {
						setState(155);
						match(IDENTIFICADOR);
					}
						break;
					case 5: {
						setState(156);
						match(IDENTIFICADOR);
						setState(157);
						match(ABRE_COLCHETE);
						setState(158);
						expr(0);
						setState(159);
						match(FECHA_COLCHETE);
					}
						break;
				}
				_ctx.stop = _input.LT(-1);
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(172);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
								case 1: {
									_localctx = new ExprContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(163);
									if (!(precpred(_ctx, 8)))
										throw new FailedPredicateException(this, "precpred(_ctx, 8)");
									setState(164);
									_la = _input.LA(1);
									if (!(_la == MAIS || _la == MENOS)) {
										_errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == EOF)
											matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(165);
									expr(9);
								}
									break;
								case 2: {
									_localctx = new ExprContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(166);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(167);
									_la = _input.LA(1);
									if (!(_la == ASTERISCO || _la == BARRA)) {
										_errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == EOF)
											matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(168);
									expr(8);
								}
									break;
								case 3: {
									_localctx = new ExprContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(169);
									if (!(precpred(_ctx, 6)))
										throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(170);
									match(IGUAL);
									setState(171);
									expr(7);
								}
									break;
							}
						}
					}
					setState(176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
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
			case 12:
				return expr_sempred((ExprContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 8);
			case 1:
				return precpred(_ctx, 7);
			case 2:
				return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN = "\u0004\u0001.\u00b2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
			+
			"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
			"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
			"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
			"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d" +
			"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
			"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002" +
			"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0002" +
			"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
			"\u0003\u00028\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
			"\u0001\u0003\u0001\u0003\u0005\u0003@\b\u0003\n\u0003\f\u0003C\t\u0003" +
			"\u0003\u0003E\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
			"\u0001\u0003\u0005\u0003L\b\u0003\n\u0003\f\u0003O\t\u0003\u0001\u0003" +
			"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005" +
			"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\\\b\u0005" +
			"\n\u0005\f\u0005_\t\u0005\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0006" +
			"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
			"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001" +
			"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001" +
			"\t\u0005\t|\b\t\n\t\f\t\u007f\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003" +
			"\n\u0085\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001" +
			"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001" +
			"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0096\b\u000b\u0001" +
			"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001" +
			"\f\u0003\f\u00a2\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001" +
			"\f\u0001\f\u0001\f\u0005\f\u00ad\b\f\n\f\f\f\u00b0\t\f\u0001\f\u0000\u0001" +
			"\u0018\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018" +
			"\u0000\u0002\u0002\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0004\u0005" +
			"\u00bc\u0000\u001b\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000" +
			"\u00047\u0001\u0000\u0000\u0000\u00069\u0001\u0000\u0000\u0000\bR\u0001" +
			"\u0000\u0000\u0000\nU\u0001\u0000\u0000\u0000\fc\u0001\u0000\u0000\u0000" +
			"\u000ej\u0001\u0000\u0000\u0000\u0010m\u0001\u0000\u0000\u0000\u0012s" +
			"\u0001\u0000\u0000\u0000\u0014\u0082\u0001\u0000\u0000\u0000\u0016\u0095" +
			"\u0001\u0000\u0000\u0000\u0018\u00a1\u0001\u0000\u0000\u0000\u001a\u001c" +
			"\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d" +
			"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e" +
			"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0005" +
			"\u0000\u0000\u0001 \u0001\u0001\u0000\u0000\u0000!)\u0003\u0004\u0002" +
			"\u0000\")\u0003\u0006\u0003\u0000#)\u0003\b\u0004\u0000$)\u0003\n\u0005" +
			"\u0000%)\u0003\u0010\b\u0000&)\u0003\u0012\t\u0000\')\u0003\u0014\n\u0000" +
			"(!\u0001\u0000\u0000\u0000(\"\u0001\u0000\u0000\u0000(#\u0001\u0000\u0000" +
			"\u0000($\u0001\u0000\u0000\u0000(%\u0001\u0000\u0000\u0000(&\u0001\u0000" +
			"\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000\u0000" +
			"*+\u0005*\u0000\u0000+.\u0005+\u0000\u0000,-\u0005\u001a\u0000\u0000-" +
			"/\u0003\u0018\f\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000" +
			"/0\u0001\u0000\u0000\u000008\u0005\u0014\u0000\u000012\u0005*\u0000\u0000" +
			"23\u0005+\u0000\u000034\u0005\t\u0000\u000045\u0005\u001c\u0000\u0000" +
			"56\u0005\n\u0000\u000068\u0005\u0014\u0000\u00007*\u0001\u0000\u0000\u0000" +
			"71\u0001\u0000\u0000\u00008\u0005\u0001\u0000\u0000\u00009:\u0005%\u0000" +
			"\u0000:;\u0005+\u0000\u0000;D\u0005\u0007\u0000\u0000<A\u0005+\u0000\u0000" +
			"=>\u0005\u0013\u0000\u0000>@\u0005+\u0000\u0000?=\u0001\u0000\u0000\u0000" +
			"@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000" +
			"\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000D<\u0001\u0000" +
			"\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005" +
			"\b\u0000\u0000GH\u0005\u0002\u0000\u0000HI\u0005*\u0000\u0000IM\u0005" +
			"\u000b\u0000\u0000JL\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000" +
			"LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000" +
			"\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\f\u0000" +
			"\u0000Q\u0007\u0001\u0000\u0000\u0000RS\u0003\u0018\f\u0000ST\u0005\u0014" +
			"\u0000\u0000T\t\u0001\u0000\u0000\u0000UV\u0005\'\u0000\u0000VW\u0005" +
			"\u0007\u0000\u0000WX\u0003\u0018\f\u0000XY\u0005\b\u0000\u0000Y]\u0003" +
			"\u0002\u0001\u0000Z\\\u0003\f\u0006\u0000[Z\u0001\u0000\u0000\u0000\\" +
			"_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000" +
			"\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`b\u0003\u000e" +
			"\u0007\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u000b" +
			"\u0001\u0000\u0000\u0000cd\u0005(\u0000\u0000de\u0005\'\u0000\u0000ef" +
			"\u0005\u0007\u0000\u0000fg\u0003\u0018\f\u0000gh\u0005\b\u0000\u0000h" +
			"i\u0003\u0002\u0001\u0000i\r\u0001\u0000\u0000\u0000jk\u0005(\u0000\u0000" +
			"kl\u0003\u0002\u0001\u0000l\u000f\u0001\u0000\u0000\u0000mn\u0005,\u0000" +
			"\u0000no\u0005\u0007\u0000\u0000op\u0003\u0018\f\u0000pq\u0005\b\u0000" +
			"\u0000qr\u0003\u0002\u0001\u0000r\u0011\u0001\u0000\u0000\u0000st\u0005" +
			"#\u0000\u0000tu\u0005+\u0000\u0000uv\u0005$\u0000\u0000vw\u0005\u001c" +
			"\u0000\u0000wx\u0005\u0011\u0000\u0000xy\u0005\u001c\u0000\u0000y}\u0005" +
			"\u000b\u0000\u0000z|\u0003\u0002\u0001\u0000{z\u0001\u0000\u0000\u0000" +
			"|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000" +
			"\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000" +
			"\u0080\u0081\u0005\f\u0000\u0000\u0081\u0013\u0001\u0000\u0000\u0000\u0082" +
			"\u0084\u0005&\u0000\u0000\u0083\u0085\u0003\u0018\f\u0000\u0084\u0083" +
			"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086" +
			"\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0014\u0000\u0000\u0087\u0015" +
			"\u0001\u0000\u0000\u0000\u0088\u0089\u0005+\u0000\u0000\u0089\u008a\u0005" +
			"\u001a\u0000\u0000\u008a\u008b\u0003\u0018\f\u0000\u008b\u008c\u0005\u0014" +
			"\u0000\u0000\u008c\u0096\u0001\u0000\u0000\u0000\u008d\u008e\u0005+\u0000" +
			"\u0000\u008e\u008f\u0005\t\u0000\u0000\u008f\u0090\u0003\u0018\f\u0000" +
			"\u0090\u0091\u0005\n\u0000\u0000\u0091\u0092\u0005\u001a\u0000\u0000\u0092" +
			"\u0093\u0003\u0018\f\u0000\u0093\u0094\u0005\u0014\u0000\u0000\u0094\u0096" +
			"\u0001\u0000\u0000\u0000\u0095\u0088\u0001\u0000\u0000\u0000\u0095\u008d" +
			"\u0001\u0000\u0000\u0000\u0096\u0017\u0001\u0000\u0000\u0000\u0097\u0098" +
			"\u0006\f\uffff\uffff\u0000\u0098\u00a2\u0005\u001c\u0000\u0000\u0099\u00a2" +
			"\u0005\u001f\u0000\u0000\u009a\u00a2\u0005 \u0000\u0000\u009b\u00a2\u0005" +
			"+\u0000\u0000\u009c\u009d\u0005+\u0000\u0000\u009d\u009e\u0005\t\u0000" +
			"\u0000\u009e\u009f\u0003\u0018\f\u0000\u009f\u00a0\u0005\n\u0000\u0000" +
			"\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u0097\u0001\u0000\u0000\u0000" +
			"\u00a1\u0099\u0001\u0000\u0000\u0000\u00a1\u009a\u0001\u0000\u0000\u0000" +
			"\u00a1\u009b\u0001\u0000\u0000\u0000\u00a1\u009c\u0001\u0000\u0000\u0000" +
			"\u00a2\u00ae\u0001\u0000\u0000\u0000\u00a3\u00a4\n\b\u0000\u0000\u00a4" +
			"\u00a5\u0007\u0000\u0000\u0000\u00a5\u00ad\u0003\u0018\f\t\u00a6\u00a7" +
			"\n\u0007\u0000\u0000\u00a7\u00a8\u0007\u0001\u0000\u0000\u00a8\u00ad\u0003" +
			"\u0018\f\b\u00a9\u00aa\n\u0006\u0000\u0000\u00aa\u00ab\u0005\u0019\u0000" +
			"\u0000\u00ab\u00ad\u0003\u0018\f\u0007\u00ac\u00a3\u0001\u0000\u0000\u0000" +
			"\u00ac\u00a6\u0001\u0000\u0000\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000" +
			"\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000" +
			"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u0019\u0001\u0000\u0000\u0000" +
			"\u00b0\u00ae\u0001\u0000\u0000\u0000\u000f\u001d(.7ADM]a}\u0084\u0095" +
			"\u00a1\u00ac\u00ae";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}