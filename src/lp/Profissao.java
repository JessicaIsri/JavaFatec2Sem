package lp;

public class Profissao {
    public String nome;
    private Double salario;
    public String funcao;
    public int carga_horaria;

    public Profissao(String nome){
        this.nome = nome;
        this.salario = 500.00;
        this.carga_horaria = 6;
    }

    public Double getSalario() {
        return salario;
    }

    public void mudaFuncao(String funcao){
        this.funcao = funcao;
    }

    public void aumentaSalario(double valor){
        this.salario = this.salario + valor;
        System.out.println(this.salario);
    }

    public void aumentaCargaHoraria(int hora){
        this.carga_horaria = this.carga_horaria + hora;
        System.out.println(this.carga_horaria);
    }
}
