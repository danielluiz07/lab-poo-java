package lab07;

public class ContaCorrete{
    //atributos
    String usuario;
    String senha;
    Double saldo;
    String agencia;

    //comportamento
    void realizarExtrato(){
        System.out.println("seu saldo é " + saldo);
    }
    void depositar(double valor){
        saldo += valor;
    }

}