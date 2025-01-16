package fejosa;
// Generated from Gramatica.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GramaticaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(GramaticaParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#mainFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunc(GramaticaParser.MainFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(GramaticaParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(GramaticaParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#paramDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDecl(GramaticaParser.ParamDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(GramaticaParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(GramaticaParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#elseIfStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStmt(GramaticaParser.ElseIfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(GramaticaParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(GramaticaParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(GramaticaParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(GramaticaParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(GramaticaParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(GramaticaParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#scanStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanStmt(GramaticaParser.ScanStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GramaticaParser.ExprContext ctx);
}