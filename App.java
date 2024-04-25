public class App {
    public static void main(String[] args) {

        Livro livro = new Livro("harrypotter", "J.K ", 500, "Fantasia");
        System.out.println("O titulo do livro é " + livro.getTitulo());
        System.out.println("O autor do livro é " + livro.getAutor());
        System.out.println("O número de páginas do livro é " + livro.getNumPaginas());
        System.out.println("O gênero do livro é " + livro.getGenero());
        livro.ler();

        Faca faca = new Faca("aço", 10.0);
        System.out.println("O material da faca é " + faca.getMaterial());
        System.out.println("O tamanho da faca é " + faca.getMaterial() + " cm");
        faca.cortar();

        Pessoa pessoa = new Pessoa("Guilherme", 18, 99999999, 1.75);
        System.out.println("O nome da pessoa é " + pessoa.getNome());
        System.out.println("A idade da pessoa é " + pessoa.getIdade());
        System.out.println("O CPF da pessoa é " + pessoa.getCpf());
        System.out.println("A altura da pessoa é " + pessoa.getAltura());
        pessoa.correr();
        pessoa.dormir();
        pessoa.comer();
        pessoa.trabalhar();

        Carro carro = new Carro("Toyota", "Etios", 1, "preto");
        System.out.println("O carro é da marca " + carro.getMarca());
        System.out.println("O carro é da modelo " + carro.getModelo());
        System.out.println("O carro pesa " + carro.getPeso() + " tonelada");
        System.out.println("O carro é da cor " + carro.getCor());
        carro.dirigir();
        carro.estacionar();

        Celular celular = new Celular("Apple", "Iphone X", "Branco");
        System.out.println("O celular é da marca " + celular.getMarca());
        System.out.println("O celular é da modelo " + celular.getModelo());
        System.out.println("O celular é da cor " + celular.getCor());
        celular.ligar();
        celular.desligar();
        celular.reiniciar();

        GuardaChuva guardaChuva = new GuardaChuva(30, 1, "preto");
        System.out.println("O guarda chuva tem um tamanho de " + guardaChuva.getTamanho() + " cm");
        System.out.println("O guarda chuva pesa " + guardaChuva.getPeso() + " kg");
        System.out.println("O guarda chuva é da cor " + guardaChuva.getCor());
        guardaChuva.abrir();
        guardaChuva.fechar();

        Computador computador = new Computador(2, "DELL", "Vostro 15", "preto");
        System.out.println("O computador pesa " + computador.getPeso() + " kg");
        System.out.println("O computador é da marca " + computador.getMarca());
        System.out.println("O computador é do modelo " + computador.getModelo());
        System.out.println("O computador é do modelo " + computador.getCor());
        computador.ligar();
        computador.desligar();
        computador.reiniciar();
        computador.trabalhar();

        Garrafa garrafa = new Garrafa( 25, 500);
        System.out.println("A garrafa tem capacidade de: " + garrafa.getCapacidade() + " ml");
        System.out.println("A garrafa tem um tamanho de: " + garrafa.getTamanho() + " cm");
        garrafa.encher();
        garrafa.beber();

        BolaFutebol bolaFutebol = new BolaFutebol(30, "preta");
        System.out.println("A bola é da cor: " + bolaFutebol.getCor());
        System.out.println("A bola tem um diâmetro de : " + bolaFutebol.getTamanho() + " cm");
        bolaFutebol.chutar();
        bolaFutebol.inflar();

        Folhas folhas = new Folhas("A4", "Branca");
        System.out.println("A folha é do tipo: " + folhas.getTipo());
        System.out.println("A folha é da cor: " + folhas.getCor());
        folhas.desenhar();
        folhas.rasgar();
        folhas.colorir();


    }
}
