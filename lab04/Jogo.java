package lab04;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        int primeiro = (int) (Math.random() * 100) + 1;
        int numero;

        System.out.println("Digite um número entre 1 e 100: ");
        numero = sc.nextInt();

        while (numero != primeiro) {
            if (numero > primeiro) {
                System.out.println("Digite um número menor!");
            } else {
                System.out.println("Digite um número maior!");
            }

            System.out.println("Digite um número: ");
            numero = sc.nextInt();
        }
        System.out.println("Parabéns! Você acertou o número.");
    }
}