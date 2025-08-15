public class Musica {
    private String titulo;
    private String artista;
    private int duracao;

    public Musica(String titulo, String artista, int duracao){
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
      //seletor.atributo = argumento

    }

    public void exibirFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duração: " + duracao);
    }
}


