package riparazioni;

public class Tecnico {

    private String nome;
    private int counter = 0;
    private boolean ferie = false;

    public Tecnico(){

    }

    public Tecnico(String nome){
        this.nome=nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isFerie() {
        return ferie;
    }

    public void setFerie(boolean ferie) {
        this.ferie = ferie;
    }
}
