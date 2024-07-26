package Prova;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de números a serem lidos: ");
        int quantidade = sc.nextInt();

        int maiorNumero = 0; 
        int contagemMaior = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número : ");
            int numero = sc.nextInt();
            
            if (numero > maiorNumero) {
                maiorNumero = numero;
                contagemMaior = 1; 
            } else if (numero == maiorNumero) {
                contagemMaior++; 
            }
        }

        System.out.println("O maior número é " + maiorNumero);
        System.out.println("Quantidade de vezes que o maior número foi lido: " + contagemMaior);
        
        sc.close();
    }
}