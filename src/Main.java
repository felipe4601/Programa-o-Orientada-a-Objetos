
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Fiat";
        carro1.modelo = "Argo";

        carro2.marca = "HB20";
        carro2.modelo = "Hyundai";

        carro1.mostrarInformacoes();
        carro2.mostrarInformacoes();

        // Usando a classe Música

        Musica minhaMusica = new Musica();

        minhaMusica.artista = "Foreigner";
        minhaMusica.titulo = "I Don't Want to Live Without You";
        minhaMusica.duracao = 357;

        System.out.println("Tocando agora: " + minhaMusica.titulo);
        System.out.println("Artista: " + minhaMusica.artista);
        System.out.println("Duração em segundos: " + minhaMusica.duracao);

        // Usando a classe Aluno
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Felipe";
        aluno1.nota = 10;

        aluno1.verificarStatus();

        // Usando a classe conta Bancaria
        ContaBancaria minhaConta1 = new ContaBancaria();

        minhaConta1.titular = "Felipe";
        minhaConta1.saldo = 1000;

        minhaConta1.depositar(500);







    }
}