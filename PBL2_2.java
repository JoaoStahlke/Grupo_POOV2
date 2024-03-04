import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PBL2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();
        Map<String, Integer> playerScores = new HashMap<>();

        int option;
        do {
            System.out.print("1. Para ver o Ranking.\n2. Para adicionar novos dados.\nDigite a opção desejada: ");
            option = Integer.parseInt(scan.nextLine());

            switch (option) {
                case 1:
                    System.out.println("\nRanking:");
                    players.stream()
                            .sorted(Comparator.comparing(Player::getScore).reversed())
                            .forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Digite o Nick do seu jogador: ");
                    String nick = scan.nextLine();
                    System.out.print("Digite o Score do seu jogador: ");
                    int score = Integer.parseInt(scan.nextLine());
                    System.out.print("Digite a quantidade de moedas do seu jogador: ");
                    int coins = Integer.parseInt(scan.nextLine());

                    Player player = new Player(nick, score, coins);
                    players.add(player);
                    playerScores.put(nick, score);

                    System.out.println("\nJogador adicionado com sucesso!");
                    System.out.println("Nome: " + player.getNick());
                    System.out.println("Score: " + player.getScore());
                    System.out.println("Moedas: " + player.getCoins());
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (option != 1);
    }

    static class Player {
        private String nick;
        private int score;
        private int coins;

        public Player(String nick, int score, int coins) {
            this.nick = nick;
            this.score = score;
            this.coins = coins;
        }

        public String getNick() {
            return nick;
        }

        public int getScore() {
            return score;
        }

        public int getCoins() {
            return coins;
        }

        @Override
        public String toString() {
            return "Nome: " + nick + ", Score: " + score + ", Moedas: " + coins;
        }
    }
}