public class BolaFutebol {
    private int tamanho;
    private String cor;

    public BolaFutebol(int tamanho, String cor){
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public void chutar(){
        System.out.println("Alguém chutou a bola!");
    }

    public void inflar(){
        System.out.println("Alguém inflou a bola!");
        System.out.println();
    }

    // Getters e Setters
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
