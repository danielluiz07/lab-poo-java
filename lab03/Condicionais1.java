package lab03;

public class Condicionais1 {
    public static void main(String[] args) {
        var nota = Integer.parseInt(args[0]);
        if (nota >=70) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
