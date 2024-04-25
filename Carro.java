public class Carro {
    private String marca;
    private String modelo;
    private double peso;
    private String cor;

    public Carro(String marca, String modelo, double peso, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.cor = cor;
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

    public double getPeso() {
        return peso;
    }

    public void setpPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void dirigir(){
        System.out.println("O carro da marca " + marca + " está sendo dirigido.");
    }

    public void estacionar(){
        System.out.println("O carro da marca " + marca + " está sendo estacionado.");
        System.out.println();
    }
}
