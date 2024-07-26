package Prova;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int num = sc.nextInt();

        int contagem = 0;
        int i = 1;

        while (i <= num) { 
            if(num % i == 0){
                contagem++;
            }
            i++;
        }

        System.out.println("O número pode ser dividido por " + contagem + " números");
        
        sc.close();
    }
}