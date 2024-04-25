public class Folhas {
    private String tipo;
    private String cor;

    public Folhas(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void desenhar() {
        System.out.println("Alguém está desenhando na folha!");
    }

    public void rasgar() {
        System.out.println("Alguém está rasgando na folha!");
    }

    public void colorir() {
        System.out.println("Alguém está colorindo na folha!");
        System.out.println();
    }
}
