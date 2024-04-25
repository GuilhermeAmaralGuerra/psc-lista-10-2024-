public class Computador {
    private double peso;
    private String marca;
    private String modelo;
    private String cor;

    public Computador(double peso, String marca, String modelo, String cor){
        this.peso = peso;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void ligar(){
        System.out.println("O computador da marca " + marca + " está ligando");
    }

    public void desligar(){
        System.out.println("O computador da marca " + marca + " está ligando");
    }

    public void reiniciar(){
        System.out.println("O computador da marca " + marca + " está reiniciando");
    }

    public void trabalhar(){
        System.out.println("O computador da marca " + marca + " está trabalhando");
        System.out.println();
    }
}
