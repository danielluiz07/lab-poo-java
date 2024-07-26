package Prova;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        System.out.println("Escolha Uma Opção:");

        System.out.println("--------------------");

        System.out.println("Digite (1) Para Adição");
        System.out.println("Digite (2) Para Subtração");
        System.out.println("Digite (3) Para Multiplicação");
        System.out.println("Digite (4) Para Divisão");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua escolha: ");
        int escolha = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int soma = 0;
        int subtracao = 0;
        int multiplicacao = 0;
        int divisao = 0;

        if(escolha == 1){
            soma = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + soma);
        }else if(escolha == 2){
            subtracao = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + subtracao);
        }else if(escolha == 3){
            multiplicacao = num1 * num2;
            System.out.println(num1 + " / " + num2 + " = " + multiplicacao);
        }else if(escolha == 4){
            divisao = num1 / num2;
            System.out.println(num1 + " * " + num2 + " = " + divisao);
        }else{
            System.out.println("danieúNúmero de escolha Indiponível");
        }
        sc.close();
    }
}