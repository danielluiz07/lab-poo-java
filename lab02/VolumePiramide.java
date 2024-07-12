package lab02;

import java.util.Scanner;

public class VolumePiramide {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a area da base da piramide: ");
        var base = sc.nextDouble();
        System.out.println("Digite a altura piramide:");
        var altura = sc.nextDouble();
        var volume = base*altura/3;
        System.out.println("O volume da piramide é a" + " " + volume);
    }       
}