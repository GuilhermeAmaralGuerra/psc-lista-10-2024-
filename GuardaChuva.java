public class GuardaChuva {
    private int tamanho;
    private double peso;
    private String cor;

    public GuardaChuva(int tamanho, double peso, String cor){
        this.tamanho = tamanho;
        this.peso = peso;
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void abrir(){
        System.out.println("O guarda-chuva está abrindo");
    }

    public void fechar(){
        System.out.println("O guarda-chuva está fechando");
        System.out.println();
    }
}
