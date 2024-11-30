package fejosa;

public class Token {
    TipoToken tipo;
    String valor;

    static Token tokenTrue = new Token(TipoToken.BOOLEANO, "true");
    static Token tokenFalse = new Token(TipoToken.BOOLEANO, "false");
    static Token tokenMain = new Token(TipoToken.MAIN, "main");
    static Token tokenFor = new Token(TipoToken.FOR, "for");
    static Token tokenIn = new Token(TipoToken.IN, "in");
    static Token tokenFuncao = new Token(TipoToken.FUNCAO, "fn");
    static Token tokenVoid = new Token(TipoToken.VOID, "void");
    static Token tokenReturn = new Token(TipoToken.RETURN, "return");
    static Token tokenIf = new Token(TipoToken.IF, "if");
    static Token tokenElse = new Token(TipoToken.ELSE, "else");
    static Token tokenStruct = new Token(TipoToken.STRUCT, "struct");

    public enum TipoToken {
        INVALIDO,
        MAIS,
        MENOS,
        ASTERISCO,
        BARRA,
        BARRA_INVERTIDA,
        ABRE_PARENTESE,
        FECHA_PARENTESE,
        ABRE_COLCHETE,
        FECHA_COLCHETE,
        ABRE_CHAVE,
        FECHA_CHAVE,
        COMENTARIO,
        COMENTARIO_BLOCO,
        E_BINARIO,
        OU_BINARIO,
        E_LOGICO,
        OU_LOGICO,
        PONTO,
        VIRGULA,
        PONTO_E_VIRGULA,
        DOIS_PONTOS,
        PORCENTO,
        IDENTIFICADOR,
        MAIOR,
        MENOR,
        EXCLAMACAO,
        ATRIBUICAO,
        IGUAL,
        NUMERO,
        CHAR,
        STRING,
        BOOLEANO,
        TIPO,
        IF,
        ELSE,
        ELSE_IF,
        WHILE,
        SETA,
        PONTO_PONTO,
        FUNCAO,
        FOR,
        MAIN,
        RETURN,
        IN,
        VOID,
        STRUCT,
        EOF,
    }

    public Token(TipoToken tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public void imprimiToken() {
        System.out.println("Valor: " + valor + " ... Token: " + tipo);
    }

}
