package fejosa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fejosa.Erro.TipoErro;
import fejosa.Token.TipoToken;

public class Lexer {
    public String entrada;
    public int pos;
    public int posLeitura;
    public char ch;
    public ArrayList<Erro> erros;
    public int linha;
    public int coluna;

    static List<String> tipos = Arrays.asList(
        "i8", "i16", "i32", "i64",
        "u8", "u16", "u32", "u64",
        "f32", "f64",
        "string"
    );

    public Lexer(String entrada) {
        this.entrada = entrada;
        pos = 0;
        posLeitura = 1;
        ch = entrada.charAt(pos);
        erros = new ArrayList<Erro>();
        linha = 1;
        coluna = 1;
    }

    public Token leToken() {
        ignoraVazio();

        Token res;

        switch (ch) {
            case '+': {
                res = new Token(TipoToken.MAIS, "+");
            }
                break;
            case '-': {
                if (espiaProx() == '>') {
                    proxChar();
                    res = new Token(TipoToken.SETA, "->");
                    break;
                }
                res = new Token(TipoToken.MENOS, "-");
            }
                break;
            case '*': {
                res = new Token(TipoToken.ASTERISCO, "*");
            }
                break;
            case '/': {
                if (espiaProx() == '/') {
                    proxChar();
                    res = new Token(TipoToken.COMENTARIO, "//");
                    ignoraComentarioLinha();
                    break;
                }
                if (espiaProx() == '*') {
                    proxChar();
                    res = new Token(TipoToken.COMENTARIO_BLOCO, "/*");
                    ignoraComentarioBloco();
                    break;
                }
                res = new Token(TipoToken.BARRA, "/");
            }
                break;
            case '\\': {
                res = new Token(TipoToken.BARRA_INVERTIDA, "\\");
            }
                break;
            case '(': {
                res = new Token(TipoToken.ABRE_PARENTESE, "(");
            }
                break;
            case ')': {
                res = new Token(TipoToken.FECHA_PARENTESE, ")");
            }
                break;
            case '[': {
                res = new Token(TipoToken.ABRE_COLCHETE, "[");
            }
                break;
            case ']': {
                res = new Token(TipoToken.FECHA_COLCHETE, "]");
            }
                break;
            case '{': {
                res = new Token(TipoToken.ABRE_CHAVE, "{");
            }
                break;
            case '}': {
                res = new Token(TipoToken.FECHA_CHAVE, "}");
            }
                break;
            case '&': {
                if (espiaProx() == '&') {
                    proxChar();
                    res = new Token(TipoToken.E_LOGICO, "&&");
                    break;
                }
                res = new Token(TipoToken.E_BINARIO, "&");
            }
                break;
            case '|': {
                if (espiaProx() == '|') {
                    proxChar();
                    res = new Token(TipoToken.OU_LOGICO, "||");
                    break;
                }
                res = new Token(TipoToken.OU_BINARIO, "|");
            }
                break;
            case '.': {
                if (espiaProx() == '.') {
                    proxChar();
                    res = new Token(TipoToken.PONTO_PONTO, "..");
                    break;
                }
                res = new Token(TipoToken.PONTO, ".");
            }
                break;
            case ',': {
                res = new Token(TipoToken.VIRGULA, ",");
            }
                break;
            case ';': {
                res = new Token(TipoToken.PONTO_E_VIRGULA, ";");
            }
                break;
            case ':': {
                res = new Token(TipoToken.DOIS_PONTOS, ":");
            }
                break;
            case '%': {
                res = new Token(TipoToken.PORCENTO, "%");
            }
                break;
            case '<': {
                res = new Token(TipoToken.MAIOR, ">");
            }
                break;
            case '>': {
                res = new Token(TipoToken.MENOR, "<");
            }
                break;
            case '=': {
                if (espiaProx() == '=') {
                    proxChar();
                    res = new Token(TipoToken.IGUAL, "==");
                    break;
                }
                res = new Token(TipoToken.ATRIBUICAO, "=");
            } break;
            case '!': {
                res = new Token(TipoToken.EXCLAMACAO, "!");
            }
                break;
            case '\'': {
                String caracter = leCaracter();
                res = new Token(TipoToken.CHAR, caracter);
            } break;
            case '"': {
                String str = leString();
                res = new Token(TipoToken.STRING, str);
            } break;
            case '\0': {
                res = new Token(TipoToken.EOF, "");
            }
                break;
            default: {
                if (Character.isAlphabetic(ch) || ch == '_') {
                    String valor = leIdentificador();
                    res = verificaReservada(valor);
                    break;
                }
                if (Character.isDigit(ch)) {
                    String valor = leNumero();
                    res = new Token(TipoToken.NUMERO, valor);
                    break;
                }

                res = new Token(TipoToken.INVALIDO, "");
                Erro erro = new Erro(TipoErro.LEXICO, linha, coluna);
                erros.add(erro);
            }
        }

        proxChar();

        return res;
    }

    public void proxChar() {
        if (posLeitura >= entrada.length()) {
            ch = '\0';
            return;
        }

        ch = entrada.charAt(posLeitura);
        pos = posLeitura;
        posLeitura++;
        if (ch == '\n') {
            linha++;
            coluna = 1;
        }
    }

    public void ignoraVazio() {
        while (Character.isWhitespace(ch)) {
            proxChar();
        }
    }

    public String leIdentificador() {
        int comeco = pos;
        while (Character.isAlphabetic(espiaProx()) || Character.isDigit(espiaProx()) || espiaProx() == '_')
            proxChar();

        int fim = posLeitura;
        String res = entrada.substring(comeco, fim);
        return res;
    }

    public Token verificaReservada(String texto) {
        Token res;
        if (tipos.contains(texto)) {
            res = new Token(TipoToken.TIPO, texto);
        } else {
            switch (texto) {
                case "true": {
                    res = Token.tokenTrue;
                } break;
                case "false": {
                    res = Token.tokenFalse;
                } break;
                case "fn": {
                    res = new Token(TipoToken.FUNCAO, texto);
                } break;
                case "for": {
                    res = new Token(TipoToken.FOR, texto);
                } break;
                case "if": {
                    res = new Token(TipoToken.IF, texto);
                } break;
                case "else": {
                    res = new Token(TipoToken.ELSE, texto);
                } break;
                case "main": {
                    res = new Token(TipoToken.MAIN, texto);
                } break;
                case "return": {
                    res = new Token(TipoToken.RETURN, texto);
                } break;
                case "in": {
                    res = new Token(TipoToken.IN, texto);
                } break;
                case "void": {
                    res = new Token(TipoToken.VOID, texto);
                } break;
                default: {
                    res = new Token(TipoToken.IDENTIFICADOR, texto);
                }
            }
        }

        return res;
    }

    public String leNumero() {
        int comeco = pos;
        while (Character.isDigit(espiaProx())) {
            proxChar();
        }
        if (espiaProx() == '.' && espiaProx2() != '.') {
            proxChar();
            while (Character.isDigit(espiaProx())) {
                proxChar();
            }
        }
        int fim = posLeitura;

        String res = entrada.substring(comeco, fim);
        return res;
    }
    
    public String leCaracter() {
        int comeco = pos;
        proxChar();
        proxChar();
        proxChar();
        int fim = comeco + 3;

        String res = entrada.substring(comeco, fim);
        return res;
    }

    public String leString() {
        int comeco = pos;
        while (espiaProx() != '"') {
            proxChar();
        }
        proxChar();
        int fim = posLeitura;

        String res = entrada.substring(comeco, fim);
        return res;
    }

    public void ignoraComentarioLinha() {
        while (ch != '\n') {
            proxChar();
        }
    }

    public void ignoraComentarioBloco() {
        while (!(ch == '*' && espiaProx() == '/')) {
            proxChar();
        }

        proxChar();
    }

    public char espiaProx() {
        if (posLeitura >= entrada.length()) {
            return '\0';
        }
        return entrada.charAt(posLeitura);
    }

    public char espiaProx2() {
        if (posLeitura + 1 >= entrada.length()) {
            return '\0';
        }
        return entrada.charAt(posLeitura + 1);
    }
}
