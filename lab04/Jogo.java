package lab04;

import java.util.Scanner;

public class Jogo {
    // java lab04/Repeticoes1.java
    public static void main(String[] args) {
        /**
         * while: Executa um bloco de código enquanto uma condição específica for
         * verdadeira.
         */

        var sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        var numero = sc.nextInt();
        var sorteado = 26;

        while (numero != sorteado) {
            System.out.println("Digite um número: ");
            var numero2 = sc.nextInt();
            if(numero == sorteado){
                System.out.println("Parabens vc acertou!");
                break;
            }else if(numero2 != sorteado){
                System.out.println("Digite um número: ");
            }else if (numero2 == sorteado) {
                System.out.println("Numero Correto");
                
            }else if(numero2 < sorteado){
                System.out.println("Digite um número maior");
                
            } else if (numero2 > sorteado) {
                System.out.println("Digite um número menor");
            }
        }
    }
    
}
