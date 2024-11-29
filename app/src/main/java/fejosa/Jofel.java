package fejosa;

public class Jofel {
    public static void main(String[] args) {
        String teste = "while";
        Lexer leCaractere = new Lexer(teste);
        Token token = leCaractere.leToken();
        token.imprimiToken();

        System.out.println("Hello World");
    }
}
