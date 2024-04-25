public class Celular {
    private String marca;
    private String modelo;
    private String cor;

    public Celular(String marca, String modelo, String cor){
        this.marca = marca;
        this.modelo = modelo;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void ligar(){
        System.out.println("O celular da marca " + marca + " está ligando.");
    }

    public void desligar(){
        System.out.println("O celular da marca " + marca + " está desligando.");
    }

    public void reiniciar(){
        System.out.println("O celular da marca " + marca + " está reiniciando.");
        System.out.println();
    }
}
