package fejosa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fejosa.GramaticaParser.ExprContext;

public class SemanticAnalyzer extends GramaticaBaseVisitor<Void> {

    private Map<String, String> tabelaSimbolos = new HashMap<>();

    // verificar se variaveis já foram declaradas e o tipo de atribuição
    @Override
    public Void visitVarDecl(GramaticaParser.VarDeclContext ctx) {
        String tipo = ctx.TIPO().getText();
        String nome = ctx.IDENTIFICADOR().getText();
        String tipoEsperado = verificarTipo(ctx.expr());

        // Verifica se a variável já foi declarada
        if (tabelaSimbolos.containsKey(nome)) {
            System.out.println("! ERRO SEMÂNTICO (variável já declarada) - var -> " + "( " + nome + " )");
        } else {
            if (tipo.equals(tipoEsperado)) {
                tabelaSimbolos.put(nome, tipo);
            } else {
                boolean erro = true;
                switch (tipo) {
                    case "f32":
                    case "f64": {
                        if (tipoEsperado.equals("real") || tipoEsperado.equals("intneg") || tipoEsperado.equals("int")) {
                            tabelaSimbolos.put(nome, tipo);
                            erro = false;
                        }
                    } break;
                    case "i8":
                    case "i16":
                    case "i32":
                    case "i64": {
                        if (tipoEsperado.equals("intneg") || tipoEsperado.equals("int")) {
                            tabelaSimbolos.put(nome, tipo);
                            erro = false;
                        }
                    } break;
                    case "u8":
                    case "u16":
                    case "u32":
                    case "u64": {
                        if (tipoEsperado.equals("int")) {
                            tabelaSimbolos.put(nome, tipo);
                            erro = false;
                        }
                    } break;
                }
                if (erro) {
                    System.out.println("! ERRO SEMÂNTICO: (variável com tipos incompatívei) - var -> " + "( " + nome + " )"
                        + " - tipo esperado: " + "( " + tipo + " )" + " - tipo encontrado:" + "( " + tipoEsperado
                        + " )");
                }
            }
        }
        return null;
    }

    // verifica se veriavel já foi definida antes de utilizada-la e expressões dela
    @Override
    public Void visitAssignStmt(GramaticaParser.AssignStmtContext ctx) {
        String nome = ctx.IDENTIFICADOR().getText();
        String tipoEsperado = tabelaSimbolos.get(nome);

        // Verifica se a variável foi declarada
        if (tipoEsperado == null) {
            System.err.println("! ERRO SEMÂNTICO (variável não declarada) - var -> " + "( " + nome + " )");
        } else {
            // verifica cada exp individual

            for (int i = 0; i < ctx.expr(0).expr().size(); i++) {
                String tipoAtribuido = verificarTipo(ctx.expr(0).expr(i));
                if (!tipoEsperado.equals(tipoAtribuido)) {
                    boolean erro = false;
                    switch (tipoEsperado) {
                        case "f32":
                        case "f64": {
                            erro = !(tipoAtribuido.equals("real") || tipoAtribuido.equals("intneg") || tipoAtribuido.equals("int"));
                        } break;
                        case "i8":
                        case "i16":
                        case "i32":
                        case "i64": {
                            erro = !(tipoAtribuido.equals("intneg") || tipoAtribuido.equals("int"));
                        } break;
                        case "u8":
                        case "u16":
                        case "u32":
                        case "u64": {
                            erro = !tipoAtribuido.equals("int");
                        } break;
                    }

                    if (erro) {
                        System.out.println(
                            "! ERRO SEMÂNTICO: (variável com tipos incompatívei) - var -> " + "( " + nome + " )"
                            + " - tipo esperado: " + "( " + tipoEsperado + " )" + " - tipo encontrado:"
                            + "( "
                            + tipoAtribuido
                            + " )");
                    }
                }
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

    // Método auxiliar para verificar o tipo quando só tem uma valor atribuido (ex:
    // i8 x = 10;)
    private String verificarTipo(GramaticaParser.ExprContext ctx) {
        if (ctx.NUMERO() != null) {
            String numStr = ctx.NUMERO().getText();
            if (numStr.contains(".")) {
                return "real";
            } else if (numStr.contains("-")) {
                return "intneg";
            } else {
                return "int";
            }
        } else if (ctx.STRING() != null) {
            return "string";
        } else if (ctx.CHAR() != null) {
            return "u8";
        } else if (ctx.IDENTIFICADOR() != null) {
            return tabelaSimbolos.get(ctx.IDENTIFICADOR().getText());
        } else {
            List<String> aux = new ArrayList<>();
            for (int i = 0; i < ctx.expr().size(); i++) {
                if (ctx.expr(i).IDENTIFICADOR() != null
                        && tabelaSimbolos.containsKey(ctx.expr(i).IDENTIFICADOR().getText())) {
                    aux.add(tabelaSimbolos.get(ctx.expr(i).IDENTIFICADOR().getText()));
                } else {
                    aux.add(verificarTipo(ctx.expr(i)));
                }
            }
            if (allElementsEqual(aux)) {
                return aux.get(0);
            }
        }
        return "desconhecido";
    }

    public boolean allElementsEqual(List<String> list) {
        if (list == null || list.isEmpty()) {
            return true; // Uma lista nula ou vazia é considerada com elementos iguais
        }

        String firstElement = list.get(0);
        if (firstElement == null) {
            return false; // Se o primeiro elemento é nulo, consideramos que a lista não é consistente
        }

        for (String element : list) {
            if (!firstElement.equals(element)) {
                return false;
            }
        }
        return true;
    }

}
