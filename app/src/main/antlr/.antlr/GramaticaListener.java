// Generated from c:/DIO/Compilador/Compilador/app/src/main/antlr/Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GramaticaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GramaticaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(GramaticaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(GramaticaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#mainFunc}.
	 * @param ctx the parse tree
	 */
	void enterMainFunc(GramaticaParser.MainFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#mainFunc}.
	 * @param ctx the parse tree
	 */
	void exitMainFunc(GramaticaParser.MainFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(GramaticaParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(GramaticaParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(GramaticaParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(GramaticaParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void enterParamDecl(GramaticaParser.ParamDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void exitParamDecl(GramaticaParser.ParamDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(GramaticaParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(GramaticaParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(GramaticaParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(GramaticaParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#elseIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStmt(GramaticaParser.ElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#elseIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStmt(GramaticaParser.ElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(GramaticaParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(GramaticaParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(GramaticaParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(GramaticaParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(GramaticaParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(GramaticaParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(GramaticaParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(GramaticaParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(GramaticaParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(GramaticaParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(GramaticaParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(GramaticaParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#scanStmt}.
	 * @param ctx the parse tree
	 */
	void enterScanStmt(GramaticaParser.ScanStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#scanStmt}.
	 * @param ctx the parse tree
	 */
	void exitScanStmt(GramaticaParser.ScanStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GramaticaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GramaticaParser.ExprContext ctx);
}