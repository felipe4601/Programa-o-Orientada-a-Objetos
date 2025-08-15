public class Carro {

    //Atributos
//    public String descricao;
//    public String marca;
//    public String modelo;
    //Refatoração dos atributos e métodos contrutores:
    private String descricao;
    private String marca;
    private double modelo;

    //Método construtor:
    public Carro(String descricao, String marca, double modelo){
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
     //seletor.atributo = argumento

    }
    // Métodos
    public void mostrarInformacoes(){
        System.out.println("Descrição: " + descricao);
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + modelo);

    }
}
