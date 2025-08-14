public class Aluno {

    // Atributos
    public String nome;
    public int nota;

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
