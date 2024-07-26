import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = scanner.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            if (i > 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números positivos no intervalo é: " + soma);

        scanner.close();
    }
}
