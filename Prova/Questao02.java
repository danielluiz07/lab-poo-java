package Prova;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int num = sc.nextInt();

        int contagem = 0;

        for (int i = 1; i <= num; i++) { 
            if (num % i == 0) {
                contagem++;
            }
        }

        System.out.println("O número pode ser dividido por " + contagem + " números");
        
        sc.close();
    }
}
