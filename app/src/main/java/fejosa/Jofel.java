package fejosa;

import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;

//import fejosa.Token.TipoToken;

public class Jofel {
    public static void main(String[] args) {

        String teste = "i32 coiso = 1234;\n"
                + "f32 coiso6 = 123.456;\n"
                + "// blablablablabla\n"
                + "string coiso2 = \"hello world\";\n"
                + "u8 coiso3 = 'a';\n"
                + "fn teste() -> void {\n"
                + "    if (a == 10) {\n"
                + "    } else if (b == 11) {\n"
                + "    } else {\n"
                + "    }\n"
                + "for i in 0..10 {\n"
                + "}\n";

        /*
         * Lexer lexer = new Lexer(teste);
         * Token token = lexer.leToken();
         * while (token.tipo != TipoToken.EOF) {
         * token.imprimiToken();
         * token = lexer.leToken();
         * }
         * 
         * lexer.erros.forEach((erro) -> erro.print());
         */

        // Definindo a entrada
        String input = "string x = \"hello world\";";

        // Criando o Lexer
        GramaticaLexer lexer = new GramaticaLexer(CharStreams.fromString(teste));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Força a criação do fluxo de tokens e imprimi tokens encontrados
        tokens.fill();
        List<Token> allTokens = tokens.getTokens();

        System.out.println("--- TOKENS ENCONTRADOS ---");
        for (Token token : allTokens)
            System.out.println(
                    "Lexema: " + token.getText() + " Token: " +
                            lexer.getVocabulary().getSymbolicName(token.getType()));

        // Criando o Parser
        GramaticaParser parser = new GramaticaParser(tokens);
        ParseTree tree = parser.prog();

        // Imprimindo a árvore de parsing
        System.out.println("\n--- ÁRVORE SINTÁTICA ---");
        System.out.println(tree.toStringTree(parser));

    }
}
