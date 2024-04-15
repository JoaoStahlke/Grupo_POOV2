public class Calculadora {

    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public double soma(int num1, double num2) {
        return num1 + num2;
    }

    public int soma(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }
}