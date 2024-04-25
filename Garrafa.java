public class Garrafa {
    private int tamanho;
    private double capacidade;

    public Garrafa(int tamanho, double capacidade){
        this.tamanho = tamanho;
        this.capacidade = capacidade;
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
    
    public void encher(){
        System.out.println("A garrafa está enchendo!");
    }

    public void beber(){
        System.out.println("Alguem está bebendo a garrafa!");
        System.out.println();
    }
}
