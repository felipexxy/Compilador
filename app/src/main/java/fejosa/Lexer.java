package fejosa;

import java.util.ArrayList;

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
            } break;
            case '-': {
                res = new Token(TipoToken.MENOS, "-");
            } break;
            case '*': {
                res = new Token(TipoToken.ASTERISCO, "*");
            } break;
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
            } break;
            case '\\': {
                res = new Token(TipoToken.BARRA_INVERTIDA, "\\");
            } break;
            case '(': {
                res = new Token(TipoToken.ABRE_PARENTESE, "(");
            } break;
            case ')': {
                res = new Token(TipoToken.FECHA_PARENTESE, ")");
            } break;
            case '[': {
                res = new Token(TipoToken.ABRE_COLCHETE, "[");
            } break;
            case ']': {
                res = new Token(TipoToken.FECHA_COLCHETE, "]");
            } break;
            case '{': {
                res = new Token(TipoToken.ABRE_CHAVE, "{");
            } break;
            case '}': {
                res = new Token(TipoToken.FECHA_CHAVE, "}");
            } break;
            case '&': {
                if (espiaProx() == '&') {
                    proxChar();
                    res = new Token(TipoToken.E_LOGICO, "&&");
                    break;
                }
                res = new Token(TipoToken.E_BINARIO, "&");
            } break;
            case '|': {
                if (espiaProx() == '|') {
                    proxChar();
                    res = new Token(TipoToken.OU_LOGICO, "||");
                    break;
                }
                res = new Token(TipoToken.OU_BINARIO, "|");
            } break;
            case '.': {
                res = new Token(TipoToken.PONTO, ".");
            } break;
            case ',': {
                res = new Token(TipoToken.VIRGULA, ",");
            } break;
            case ';': {
                res = new Token(TipoToken.PONTO_E_VIRGULA, ";");
            } break;
            case ':': {
                res = new Token(TipoToken.DOIS_PONTOS, ":");
            } break;
            case '%': {
                res = new Token(TipoToken.PORCENTO, "%");
            } break;
            case '<': {
                res = new Token(TipoToken.MAIOR, ">");
            } break;
            case '>': {
                res = new Token(TipoToken.MENOR, "<");
            } break;
            case '!': {
                res = new Token(TipoToken.EXCLAMACAO, "!");
            } break;
            case '\0': {
                res = new Token(TipoToken.EOF, "");
            } break;
            default: {
                if (Character.isAlphabetic(ch) || ch == '_') {
                    String valor = leIdentificador();
                    res = new Token(TipoToken.IDENTIFICADOR, valor);
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
        while (Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '_') {
            proxChar();
        }
        int fim = pos;

        String res = entrada.substring(comeco, fim);
        return res;
    }

    public String leNumero() {
        int comeco = pos;
        while (Character.isDigit(ch)) {
            proxChar();
        }
        if (ch == '.') {
            proxChar();
        }
        while (Character.isDigit(ch)) {
            proxChar();
        }
        int fim = pos;

        String res = entrada.substring(comeco, fim);
        return res;
    }

    public void ignoraComentarioLinha() {
        while (ch != '\n') {
            proxChar();
        }

        proxChar();
    }

    public void ignoraComentarioBloco() {
        while (!(ch == '*' && espiaProx() == '/')) {
            proxChar();
        }

        proxChar();
        proxChar();
    }

    public char espiaProx() {
        if (posLeitura >= entrada.length()) {
            return '\0';
        }
        return entrada.charAt(posLeitura);
    }
}