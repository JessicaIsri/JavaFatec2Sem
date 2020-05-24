package lp;

import java.util.ArrayList;

public class AlunoFatec {
    public String nome;
    private String curso;
    private int semestre;
    private String materia;
    private int andar = 1;


    private ArrayList <String> materias = new ArrayList<>();
    public AlunoFatec(String nome, String curso){
        this.nome = nome;
        this.curso = curso;
        this.materias.add("Calculo");
        this.materias.add("Ingles");
        this.materias.add("Gestão");
    }

    public int getSemestre() {
        return semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setSemestre(int semestre){
        this.semestre = semestre;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }


    public void proximoSemestre(){
        System.out.println(this.semestre + 1);
    }

    public void puxarMateria(String materia){
        this.materias.add(materia);
        System.out.println(this.materias.toString());
    }

    public void subirAndar(){
        System.out.println(this.andar + 1);
    }

    public void descerAndar(){
        System.out.println(this.andar - 1);
    }

}
