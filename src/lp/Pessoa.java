package lp;

public class Pessoa {
    public String nome;
    public double altura;
    private double distancia_passo;
    private int idade;
    private double peso;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura){

    }

    public void setPeso(double peso){

    }

    public void setDistancia_passo(double distancia){

    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    public double calculaImc(){
        return Math.pow((this.altura / this.peso), 2);
    }

    public double andar(int passos){
        return this.distancia_passo * passos;
    }

    public void dormir(){
        System.out.println("To com sono estou indo dormir!!");
    }
}
