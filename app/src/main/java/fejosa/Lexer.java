package fejosa;

import fejosa.Token.TipoToken;

public class Lexer {
    public String entrada;
    public int pos;
    public int posLeitura;
    public char ch;

    static ArrayList<Erro>

    public Lexer(String entrada) {
        this.entrada = entrada;
        pos = 0;
        posLeitura = 1;
        ch = entrada.charAt(pos);
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
            default: {
                if (Character.isAlphabetic(ch) || ch == '_') {
                    String valor = leIdentificador();
                    res = new Token(TipoToken.IDENTIFICADOR, valor);
                } else if (Character.isDigit(ch)) {
                    String valor = leNumero();
                    res = new Token(TipoToken.NUMERO, valor);
                }

                res = null;
            }
        }

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
    }

    public void ignoraVazio() {
        while (Character.isWhitespace(ch)) {
            proxChar();
        }
    }

    public String leIdentificador() {
        int comeco = pos;
        while (Character.isLetterOrDigit(ch) || ch == '_') {
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
        while (!(ch == '*' && espiaProx() == '\\')) {
            proxChar();
        }

        proxChar();
        proxChar();
    }

    public char espiaProx() {
        char res = entrada.charAt(posLeitura);
        return res;
    }
}
