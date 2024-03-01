import java.util.Scanner;

public class PBL1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Criação de Objeto Scanner (Scan) para ler inputs dos usuários.

        System.out.print("Digite o Primeiro Número: "); // Entrada de Números pelo usuário e gravados na Double (variáveis).
        double num1 = scan.nextDouble();

        System.out.print("Digite o Segundo Número: ");
        double num2 = scan.nextDouble();

        System.out.print("Escolha a Operação (+, -, *, /): "); // Input de Operação pelo usuário.
        char operacao = scan.next().charAt(0); // Criação de Variável "operacao" que recebe um caracter de operação. Depois le a posição 0, onde esta o caracter da operação.

        double result;
        switch (operacao) { // Abertura de "case" para as diferentes operações
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println("Resultado: " + result);
    }
}