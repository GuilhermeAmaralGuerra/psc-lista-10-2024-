public class Pessoa {
    private String nome;
    private int idade;
    private int cpf;
    private double altura;

    public Pessoa(String nome, int idade, int cpf, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void correr() {
        System.out.println(nome + " está correndo!");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo!");
    }

    public void comer() {
        System.out.println(nome + " está comendo!");
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando!");
        System.out.println();
    }
}
