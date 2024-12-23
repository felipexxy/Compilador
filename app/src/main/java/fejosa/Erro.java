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
        LEXICO,
    }

    @Override
    public String toString() {
        switch (tipo) {
            case LEXICO: {
                return String.format("Erro Léxico: Carácter não reconhecido em: L%d:C%d", linha, coluna);
            }
            default:
                return "";
        }
    }

    public void print() {
        System.out.println(this);
    }
}
