package fejosa;

public class Token {
    TipoToken tipo;
    String valor;

    public enum TipoToken {
        MAIS,
        MENOS,
        ASTERISCO,
        BARRA,
        BARRA_INVERTIDA,
        ABRE_PARENTESE,
        FECHA_PARENTESE,
        IDENTIFICADOR,
        NUMERO,
        EOF,
    }

    public Token(TipoToken tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
}
