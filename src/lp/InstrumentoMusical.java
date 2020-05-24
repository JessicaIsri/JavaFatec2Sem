package lp;

public class InstrumentoMusical {
    String nome;
    private String tipo;
    private String tipo_execução;

    public InstrumentoMusical(String nome){
        this.nome = nome;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void tocar(){
        System.out.println("---5--3--0---0--3--0");
    }

    public void subirTom(){
        System.out.println("---7--5--2---2-5--2");
    }

    public void showSamples(){
        if (this.tipo.equals("cordas")){
            System.out.println("'Violino, contrabaixo'\n");
        }
        if (this.tipo.equals("sopro")){
            System.out.println("Oboé");
        }
        if (this.tipo.equals("percussão")){
            System.out.println("Tambor");
        }
    }


}
