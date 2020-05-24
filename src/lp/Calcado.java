package lp;

public class Calcado {
    public String modelo;
    private int tamanho;
    public String cor;

    public Calcado(){
        System.out.println("Calçado criado");
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void aumentoTamanho(int tamanho){
        this.tamanho += tamanho;
        System.out.println(this.tamanho);
    }


}
