package lab02;

import java.util.Scanner;

public class VolumeCilindro {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o raio do cilindro: ");
        var raio = sc.nextDouble();
        System.out.println("Digite a altura do cilindro:");
        var altura = sc.nextDouble();
        var volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("O volume do cilindro é" + " " + volume);
    }       
}