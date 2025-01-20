package fejosa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fejosa.GramaticaParser.ExprContext;

public class SemanticAnalyzer extends GramaticaBaseVisitor<Boolean> {
    private Map<String, String> tabelaSimbolos = new HashMap<>();
    private Map<String, List<GramaticaParser.ParamDeclContext>> funcaoParametros = new HashMap<>();

    // verificar se variaveis já foram declaradas e o tipo de atribuição
    @Override
    public Boolean visitVarDecl(GramaticaParser.VarDeclContext ctx) {
        if (ctx.TIPO() == null) return false;
        String tipo = ctx.TIPO().getText();
        String nome = ctx.IDENTIFICADOR().getText();
        String tipoEsperado = verificarTipo(ctx.expr());
        boolean erro = true;

        // Verifica se a variável já foi declarada
        if (tabelaSimbolos.containsKey(nome)) {
            System.out.println("! ERRO SEMÂNTICO: (variável já declarada) - var -> " + "( " + nome + " )");
        } else {
            if (tipo.equals(tipoEsperado)) {
                tabelaSimbolos.put(nome, tipo);
            } else {
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
        return erro;
    }

    // verifica se veriavel já foi definida antes de utilizada-la e expressões dela
    @Override
    public Boolean visitAssignStmt(GramaticaParser.AssignStmtContext ctx) {
        String nome = ctx.IDENTIFICADOR().getText();
        String tipoEsperado = tabelaSimbolos.get(nome);
        boolean erro = false;

        // Verifica se a variável foi declarada
        if (tipoEsperado == null) {
            System.err.println("! ERRO SEMÂNTICO: (variável não declarada) - var -> " + "( " + nome + " )");
        } else {
            // verifica cada exp individual

            for (int i = 0; i < ctx.expr(0).expr().size(); i++) {
                String tipoAtribuido = verificarTipo(ctx.expr(0).expr(i));
                if (!tipoEsperado.equals(tipoAtribuido)) {
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

        return erro;
    }

    @Override
    public Boolean visitStmt(GramaticaParser.StmtContext ctx) {
        System.out.println(ctx.getText());
        if (ctx.funcDecl() != null) {
            visitFuncDecl(ctx.funcDecl());
        } else if (ctx.ifStmt() != null) {
            visitIfStmt(ctx.ifStmt());
        } else if (ctx.varDecl() != null) {
            visitVarDecl(ctx.varDecl());
        } else if (ctx.assignStmt() != null) {
            visitAssignStmt(ctx.assignStmt());
        } else if (ctx.whileStmt() != null) {
            visitWhileStmt(ctx.whileStmt());
        }

        return true;
    }

    @Override
    public Boolean visitIfStmt(GramaticaParser.IfStmtContext ctx) {
        boolean sucesso = visitBoolExpr(ctx.boolExpr());
        for (GramaticaParser.ElseIfStmtContext stmt : ctx.elseIfStmt()) {
            if (!visitElseIfStmt(stmt)) {
                sucesso = false;
                break;
            }
        }

        return sucesso;
    }

    @Override
    public Boolean visitElseIfStmt(GramaticaParser.ElseIfStmtContext ctx) {
        return visitBoolExpr(ctx.boolExpr());
    }

    @Override
    public Boolean visitBoolExpr(GramaticaParser.BoolExprContext ctx) {
        boolean sucesso = true;
        if (ctx.expr(0).IDENTIFICADOR() != null) {
            String id1 = ctx.expr(0).IDENTIFICADOR().getText();
            String tipoId1 = tabelaSimbolos.get(id1);
            if (tipoId1 == null) {
                System.err.println("! ERRO SEMÂNTICO: (variável não declarada) - var -> " + "( " + id1 + " )");
                return false;
            }
            if (ctx.expr(1).IDENTIFICADOR() != null) {
                String id2 = ctx.expr(1).IDENTIFICADOR().getText();
                String tipoId2 = tabelaSimbolos.get(id2);
                if (tipoId2 == null) {
                    System.err.println("! ERRO SEMÂNTICO: (variável não declarada) - var -> " + "( " + id2 + " )");
                    return false;
                }
                switch (tipoId1) {
                    case "f32":
                    case "f64": {
                        switch (tipoId2) {
                            case "f32":
                            case "f64": {
                                sucesso = true;
                            } break;
                            default: sucesso = false; break;
                        }
                    } break;
                    case "i8":
                    case "i16":
                    case "i32":
                    case "i64": {
                        switch (tipoId2) {
                            case "i8":
                            case "i16":
                            case "i32":
                            case "i64": {
                                sucesso = true;
                            } break;
                            default: sucesso = false; break;
                        }
                    } break;
                    case "u8":
                    case "u16":
                    case "u32":
                    case "u64": {
                        switch (tipoId2) {
                            case "u8":
                            case "u16":
                            case "u32":
                            case "u64": {
                                sucesso = true;
                            } break;
                            default: sucesso = false; break;
                        }
                    } break;
                    default: sucesso = tipoId1.equals(tipoId2); break;
                }
            } else {
                String tipo = verificarTipo(ctx.expr(1));
                switch (tipo) {
                    case "real": {
                        sucesso = tipoId1.equals("f32") || tipoId1.equals("f64");
                    } break;
                    case "intneg": {
                        sucesso = tipoId1.equals("f32") || tipoId1.equals("f64") || tipoId1.equals("i8") || tipoId1.equals("i16") || tipoId1.equals("i32") || tipoId1.equals("i64");
                    } break;
                    case "int": {
                        sucesso = tipoId1.equals("f32") || tipoId1.equals("f64") || tipoId1.equals("i8") || tipoId1.equals("i16") || tipoId1.equals("i32") || tipoId1.equals("i64") || tipoId1.equals("u8") || tipoId1.equals("u16") || tipoId1.equals("u32") || tipoId1.equals("u64");
                    } break;
                    case "desconhecido": sucesso = false; break;
                    default: {
                        sucesso = tipo.equals(tipoId1);
                    } break;
                }
            }
        } else {
            String tipo = verificarTipo(ctx.expr(0));
            if (ctx.expr(1).IDENTIFICADOR() != null) {
                String id2 = ctx.expr(1).IDENTIFICADOR().getText();
                String tipoId2 = tabelaSimbolos.get(id2);
                if (tipoId2 == null) {
                    System.err.println("! ERRO SEMÂNTICO: (variável não declarada) - var -> " + "( " + id2 + " )");
                    return false;
                }
                switch (tipo) {
                    case "real": {
                        sucesso = tipoId2.equals("f32") || tipoId2.equals("f64");
                    } break;
                    case "intneg": {
                        sucesso = tipoId2.equals("f32") || tipoId2.equals("f64") || tipoId2.equals("i8") || tipoId2.equals("i16") || tipoId2.equals("i32") || tipoId2.equals("i64");
                    } break;
                    case "int": {
                        sucesso = tipoId2.equals("f32") || tipoId2.equals("f64") || tipoId2.equals("i8") || tipoId2.equals("i16") || tipoId2.equals("i32") || tipoId2.equals("i64") || tipoId2.equals("u8") || tipoId2.equals("u16") || tipoId2.equals("u32") || tipoId2.equals("u64");
                    } break;
                    case "desconhecido": sucesso = false; break;
                    default: sucesso = tipo.equals(tipoId2); break;
                }
            } else {
                String tipo2 = verificarTipo(ctx.expr(1));
                sucesso = tipo.equals(tipo2);
            }
        }

        if (!sucesso) {
            System.out.println("! ERRO SEMÂNTICO: (expressão não booleana) - expressão -> " + "( " + ctx.getText() + " )");
        }

        return sucesso;
    }

    @Override
    public Boolean visitFuncDecl(GramaticaParser.FuncDeclContext ctx) {
        boolean sucesso = true;
        if (tabelaSimbolos.containsKey(ctx.IDENTIFICADOR().getText())) sucesso = false;
        else {
            if (ctx.TIPO() != null) tabelaSimbolos.put(ctx.IDENTIFICADOR().getText(), ctx.TIPO().getText());
            else tabelaSimbolos.put(ctx.IDENTIFICADOR().getText(), "void");
            funcaoParametros.put(ctx.IDENTIFICADOR().getText(), ctx.paramDecl());
        }

        return sucesso;
    }

    @Override
    public Boolean visitWhileStmt(GramaticaParser.WhileStmtContext ctx) {
        boolean sucesso = visitBoolExpr(ctx.boolExpr());
        
        return sucesso;
    }

    public boolean expressaoBooleana(GramaticaParser.ExprContext expr) {
        int tipo = expr.op.getType();
        return tipo == GramaticaLexer.MAIOR || tipo == GramaticaLexer.MENOR || tipo == GramaticaLexer.MAIOR_IGUAL || tipo == GramaticaLexer.MENOR_IGUAL || tipo == GramaticaLexer.IGUAL || tipo == GramaticaLexer.DIFERENTE;
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

    public void exibirFuncoes() {
        System.out.println("Tabela de Funções:");
        System.out.println("====================");

        if (funcaoParametros.isEmpty()) {
            System.out.println("Nenhuma função declarada.");
        } else {
            // Itera pela tabela de símbolos e exibe as variáveis e seus tipos
            for (Map.Entry<String, List<GramaticaParser.ParamDeclContext>> entrada : funcaoParametros.entrySet()) {
                System.out.println("Nome: " + entrada.getKey() + " | Parâmetros: ");
                entrada.getValue().forEach(par -> System.out.println(par.getText()));
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
        } else if (ctx.BOOLEANO() != null) {
            return "bool";
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
