import java.util.Arrays;
import java.util.Scanner;

public class PBL2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jogador[] jogadores = new Jogador[3];

        // Lendo o nome dos jogadores
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i] = new Jogador();
            System.out.println("Digite o nome do jogador " + (i + 1) + ":");
            jogadores[i].nome = scan.nextLine();
        }

        // Lendo as pontuações dos jogadores em cada fase
        for (Jogador jogador : jogadores) {
            for (int fase = 0; fase < 2; fase++) {
                System.out.println("Digite a pontuação de " + jogador.nome + " na fase " + (fase + 1) + ":");
                jogador.pontos[fase] = scan.nextInt();
                scan.nextLine(); // Consumir a quebra de linha
            }
        }

        // Encontrando o jogador com a maior pontuação total
        Jogador jogadorComMaiorPontuacao = jogadores[0];
        int maiorPontuacaoTotal = jogadorComMaiorPontuacao.pontuacaoTotal();
        for (Jogador jogador : jogadores) {
            int pontuacaoTotal = jogador.pontuacaoTotal();
            if (pontuacaoTotal > maiorPontuacaoTotal) {
                jogadorComMaiorPontuacao = jogador;
                maiorPontuacaoTotal = pontuacaoTotal;
            }
        }

        // Exibindo o resultado
        System.out.println("\nResultado:");
        System.out.println("Jogador com a maior pontuação total: " + jogadorComMaiorPontuacao.nome);
        System.out.println("Pontuação total: " + maiorPontuacaoTotal);

        System.out.println("\nPontuação de cada jogador em cada fase:");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.nome + ":");
            for (int fase = 0; fase < 2; fase++) {
                System.out.println("Fase " + (fase + 1) + ": " + jogador.pontos[fase]);
            }
        }
    }

    static class Jogador {
        String nome;
        int[] pontos = new int[2];

        int pontuacaoTotal() {
            return Arrays.stream(pontos).sum();
        }
    }
}