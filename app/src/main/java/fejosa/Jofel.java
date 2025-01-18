package fejosa;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public class Jofel {
    public static void main(String[] args) {

        String caminhoArquivo = "/home/sampie/faculdade/Compilador/app/src/main/java/fejosa/testes/test_declVar.txt";
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

        // Força a criação do fluxo de tokens e imprime tokens encontrados
        tokens.fill();
        List<Token> allTokens = tokens.getTokens();

        System.out.println("--------------------------------------------------");
        System.out.println("                 ANÁLISE LÉXICA");
        System.out.println("--------------------------------------------------");
        System.out.println("+ TOKENS ENCONTRADOS:");
        for (Token token : allTokens) {
            System.out.println(
                    "- (Lexema): " + token.getText() + " (Token): " +
                            lexer.getVocabulary().getSymbolicName(token.getType()));
        }

        // Criando o Parser
        GramaticaParser parser = new GramaticaParser(tokens);
        ParseTree tree = parser.prog();

        System.out.println("\n--------------------------------------------------");
        System.out.println("                 ANÁLISE SINTÁTICA");
        System.out.println("--------------------------------------------------");
        System.out.println("+ ÁRVORE SINTÁTICA:");
        System.out.println("- " + tree.toStringTree(parser));

        // Visualização gráfica da árvore
        JFrame frame = new JFrame("Árvore Sintática");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(0.9); // Ajuste da escala da árvore
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);

        System.out.println("\n--------------------------------------------------");
        System.out.println("                 ANÁLISE SEMÂNTICA");
        System.out.println("--------------------------------------------------");
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);
        analyzer.exibirTabelaSimbolos();
    }
}
