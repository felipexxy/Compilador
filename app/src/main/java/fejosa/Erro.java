package fejosa;

public class Erro {
    TipoErro tipo;
    int linha;
    int coluna;

    public Erro(TipoErro tipo, int linha, int coluna) {
        this.tipo = tipo;
        this.linha = linha;
        this.coluna = coluna;
    }

    public enum TipoErro {
        ERRO_LEXICO,
    }

    @Override
    public String toString() {
        switch (tipo) {
            case ERRO_LEXICO: {
                return String.format("Erro Léxico: Carácter não reconhecido em: L%d:C%d\n", linha, coluna);
            }
            default:
                return "";
        }
    }

    public void print() {
        System.out.println(this);
    }
}
