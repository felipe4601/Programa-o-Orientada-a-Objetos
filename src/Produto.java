public class Produto {
    // 1. Atributo

    // public TIPO NOME;
//    public String nome;
//    public double tamanho;
//    public double preco;
//    public String cor;
//    public String marca;
    // Refatorando modificadores de acesso dos atributos, pois estão públicos(desprotegidos)
    private String nome;
    private double tamanho;
    private double preco;
    private String cor;
    private String marca;
    
    //Criando método constrututor para deixar

    // 2. Método
    public void mostrarMensagem(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Tamanho: " + tamanho);

    }

}
