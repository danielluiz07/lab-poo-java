package lab03;

import java.util.Scanner;

public class ConceitosNotas{
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Qual a sua nota:");
        String nota = sc.nextDouble();
        
        if (nota =< 100 && nota >= 91) {
            System.out.println("Conceito A");
        }else if(nota <= 90 && nota >= 81){
            System.out.println("Conceito B");            
        }
        else if(nota <= 80 && nota >= 71){
            System.out.println("Conceito C");
        }
        else if(nota <= 70 && nota >= 61){
            System.out.println("Conceito D");
        }
        else if(nota <= 600 && nota >= 0){
            System.out.println("Conceito E");
        }
    }
}