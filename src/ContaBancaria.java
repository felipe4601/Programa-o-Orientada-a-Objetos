public class ContaBancaria {
    // Atributos
    public String titular;
    public double saldo;

    // Métodos
    public void depositar(int deposito){
        saldo = saldo + deposito;
    }

    public void saque(int saque){
        if (saque > saldo){
            System.out.println("Saldo insuficiente para saque.");
            System.out.println("Saldo atual: " + saldo);
        }
        else{
            saldo = saldo - saque;
            System.out.println("Saque efetuado!");
            System.out.println("Saldo atual:" + saldo);
        }
    }

}
