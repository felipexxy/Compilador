package fejosa;

public class Token {
    TipoToken tipo;
    String valor;

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
        NUMERO,
        EOF,
    }

    public Token(TipoToken tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
}
