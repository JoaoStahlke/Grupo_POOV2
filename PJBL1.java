import java.util.Scanner;

public class PJBL1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Criação de Objeto Scanner (Scan) para ler inputs dos usuários.

        System.out.print("Digite o Primeiro Número: "); // Entrada de Números pelo usuário e gravados na Double (variáveis).
        double num1 = scan.nextDouble();

        System.out.print("Digite o Segundo Número: ");
        double num2 = scan.nextDouble();

        System.out.print("Escolha a Operação (+, -, *, /): "); // Input de Operação pelo usuário.
        char operacao = scan.next().charAt(0); // Criação de Variável "operacao" que recebe um caracter de operação. Depois le a posição 0, onde esta o caracter da operação.

        double result = 0;
        switch (operacao) {
            case '+': // Abertura de "case" para as diferentes operações
                result = num1 + num2;
                break;
            case '/':
                result = num1 / num2;
                double resultado = result;
                System.out.print(resultado);







                
                break;
        }
    }
}