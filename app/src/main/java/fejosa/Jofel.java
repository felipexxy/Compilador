package fejosa;

import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;

public class Jofel {
    public static void main(String[] args) {

        String caminhoArquivo = "app/src/main/java/fejosa/testes/test_cond.txt";
        StringBuilder conteudoArquivo = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                conteudoArquivo.append(linha).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String teste = conteudoArquivo.toString();

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
