
public class Main {
    public static void main(String[] args) {
//        Carro carro1 = new Carro();
//        Carro carro2 = new Carro();
//
//        carro1.marca = "Fiat";
//        carro1.modelo = "Argo";
//
//        carro2.marca = "HB20";
//        carro2.modelo = "Hyundai";

        // Refatoração do código acima para usar o método construtor, que é mais eficiente:
        Carro carro1 = new Carro("Civic", "Honda", 110000);
        Carro carro2 = new Carro("Fiesta", "Ford", 7000);

        carro1.mostrarInformacoes();
        carro2.mostrarInformacoes();

        // Usando a classe Música

        //Musica minhaMusica = new Musica();

//        minhaMusica.artista = "Foreigner";
//        minhaMusica.titulo = "I Don't Want to Live Without You";
//        minhaMusica.duracao = 357;
//
//        System.out.println("Tocando agora: " + minhaMusica.titulo);
//        System.out.println("Artista: " + minhaMusica.artista);
//        System.out.println("Duração em segundos: " + minhaMusica.duracao);

        // Refatoração do código acima usando o método cosntrutor:

        Musica minhaMusica = new Musica("Hotel California", "Eagles", 631);
        minhaMusica.exibirFichaTecnica();

        // Usando a classe Aluno
//        Aluno aluno1 = new Aluno();
//
//        aluno1.nome = "Felipe";
//        aluno1.nota = 10;

        //Refatorando inserção de dados para usar o método construtor, que é mais eficiente
        Aluno aluno1 = new Aluno("Felipe", 8);

        aluno1.verificarStatus();

        // Usando a classe conta Bancaria
        //ContaBancaria minhaConta1 = new ContaBancaria(); ERRO - estou criando objeto sem atributo

        // Dessa formar irá gerar um erro, porque não estou usando o set para acessar o atributo:

        //minhaConta1.titular = "Felipe";
        //minhaConta1.saldo = 1000;
        //FORMA CORRETA:
        // Usando  método construtor:
        ContaBancaria minhaConta2 = new ContaBancaria("João", 2000);

        minhaConta2.depositar(500);

        System.out.println("Saldo atual: R$" + minhaConta2.getSaldo() );
        // Usando o método getSaldo para retornar o atributo saldo.








    }
}