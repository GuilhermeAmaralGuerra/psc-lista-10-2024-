public class Faca {
    private String material;
    private double tamanho;

    public Faca(String material, double tamanho) {
        this.material = material;
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void cortar(){
        System.out.println("A faca de " + material + " com " + tamanho + "cm está cortando, cuidado!");
        System.out.println();
    }
}
