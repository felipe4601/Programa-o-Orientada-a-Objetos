public class Aluno {

//    // Atributos
//    public String nome;
//    public int nota;
    // Atributos com modificadores de acesso
    private String nome;
    private int nota;

    // Refatoração do código acima para usar
    public Aluno(String nome, int nota){
        this.nome = nome;
        this.nota = nota;
    }

    // Métodos
    public void verificarStatus(){
        if(nota >= 7){
            System.out.println(nome + " foi aprovado(a).");
        }
        else{
            System.out.println(nome + " foi reprovado(a).");
        }
    }

    //
}
