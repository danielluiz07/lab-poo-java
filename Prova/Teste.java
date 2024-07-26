package Prova;
public class Teste {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};
        
        for( int x : numbers){
            System.out.println(x);
            System.out.println(",");
        }

        System.out.println("\n");
        String [] names = {"James", "Larry", "Tom", "Lacy"};

        for( int i=0; i < names.length; i++){
            System.out.println(names[i]);
            System.out.println("i");
        }
    }
}
