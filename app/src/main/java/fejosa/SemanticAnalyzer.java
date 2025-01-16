package fejosa;

import java.util.ArrayList;
import java.util.List;

public class SemanticAnalyzer extends GramaticaBaseVisitor<Void> {

    SymbolTable symbolTable = new SymbolTable();
    List<String> errors = new ArrayList<>();

    @Override
    public Void visitVarDecl(GramaticaParser.VarDeclContext ctx) {
        String name = ctx.IDENTIFICADOR().getText();
        String type = ctx.TIPO().getText();
        symbolTable.define(name, type);

        Symbol symbol = symbolTable.resolve(name);
        if (symbol != null) {
            System.out.println("- (Variável): " + symbol.name + " (tipo): " + symbol.type);
        } else {
            errors.add("! Erro ao registrar a variável: " + name);
        }
        return null;
    }

    @Override
    public Void visitAssignStmt(GramaticaParser.AssignStmtContext ctx) {
        String varName = ctx.IDENTIFICADOR().getText();
        Symbol symbol = symbolTable.resolve(varName);

        if (symbol == null) {
            errors.add("! Erro: Variável " + varName + " não definida.");
        } else {
            String varType = symbol.type;
            List<GramaticaParser.ExprContext> exprContexts = ctx.expr(); // Obtém a lista de contextos de expressão
            for (GramaticaParser.ExprContext exprCtx : exprContexts) {
                if (exprCtx != null) {
                    String exprType = getType(exprCtx);
                    if (!varType.equals(exprType)) {
                        errors.add("Erro: Tipo incompatível para a variável " + varName + ". Esperado: " + varType
                                + ", Encontrado: " + exprType);
                    }
                } else {
                    errors.add("Erro: Contexto de expressão nulo para a variável " + varName);
                }
            }
        }
        return null;
    }

    private String getType(GramaticaParser.ExprContext ctx) {
        if (ctx.NUMERO() != null) {
            return "int";
        } else if (ctx.STRING() != null) {
            return "string";
        } else if (ctx.IDENTIFICADOR() != null) {
            Symbol symbol = symbolTable.resolve(ctx.IDENTIFICADOR().getText());
            if (symbol != null) {
                return symbol.type;
            }
        }
        return "unknown";
    }

    public void printErrors() {
        if (errors.isEmpty()) {
            System.out.println("\n- Nenhum erro semântico encontrado.");
        } else {
            System.out.println("\n+ Erros semânticos encontrados:");
            for (String error : errors) {
                System.out.println(error);
            }
        }
    }
}
