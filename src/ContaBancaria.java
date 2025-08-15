public class ContaBancaria {
    // Atributos
//    public String titular;
//    public double saldo;
    // Alterando modificador de acesso para ter mais controle sobre os atributos da classe:
    private String titular;
    private double saldo;
    // Métodos
    public void depositar(int deposito){
        saldo = saldo + deposito;
    }

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    // Método para retornar o atributo saldo
    public double getSaldo() {
        return saldo;
    }
    // Método para retornar o atributo titular
    public String getTitular(){
        return titular;
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
