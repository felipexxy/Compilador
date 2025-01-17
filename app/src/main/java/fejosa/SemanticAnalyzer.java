package fejosa;

import java.util.HashMap;
import java.util.Map;

public class SemanticAnalyzer extends GramaticaBaseVisitor<Void> {

    private Map<String, String> tabelaSimbolos = new HashMap<>();

    // verificar se as variaveis foram declaradas
    @Override
    public Void visitVarDecl(GramaticaParser.VarDeclContext ctx) {
        String tipo = ctx.TIPO().getText();
        String nome = ctx.IDENTIFICADOR().getText();
        String tipoEsperado = verificarTipoExpr(ctx.expr());

        // Verifica se a variável já foi declarada
        if (tabelaSimbolos.containsKey(nome)) {
            System.out.println("! ERRO SEMÂNTICO (variável já declarada) - var -> " + "( " + nome + " )");
        } else {
            if (tipo.equals(tipoEsperado)) {
                tabelaSimbolos.put(nome, tipo);
            } else {
                System.out.println("! ERRO SEMÂNTICO: (variável com tipos incompatívei) - var -> " + "( " + nome + " )"
                        + " - tipo esperado: " + "( " + tipo + " )" + " - tipo encontrado:" + "( " + tipoEsperado
                        + " )");
            }
        }
        return null;
    }

    // Método para exibir a tabela de símbolos
    public void exibirTabelaSimbolos() {
        System.out.println("Tabela de Símbolos:");
        System.out.println("====================");

        if (tabelaSimbolos.isEmpty()) {
            System.out.println("Nenhuma variável declarada.");
        } else {
            // Itera pela tabela de símbolos e exibe as variáveis e seus tipos
            for (Map.Entry<String, String> entrada : tabelaSimbolos.entrySet()) {
                System.out.println("Nome: " + entrada.getKey() + " | Tipo: " + entrada.getValue());
            }
        }

        System.out.println("====================");
    }

    // Método auxiliar para verificar o tipo de uma expressão
    private String verificarTipoExpr(GramaticaParser.ExprContext ctx) {
        if (ctx.NUMERO() != null) {
            if (ctx.NUMERO().getText().contains(".")) { // verifica se numero é float
                return "f32";
            } else {
                return "i8";
            }
        } else if (ctx.STRING() != null) {
            return "string";
        } else if (ctx.CHAR() != null) {
            return "u8";
        } else if (ctx.IDENTIFICADOR() != null) {
            return tabelaSimbolos.get(ctx.IDENTIFICADOR().getText());
        }
        return "desconhecido";
    }
}
