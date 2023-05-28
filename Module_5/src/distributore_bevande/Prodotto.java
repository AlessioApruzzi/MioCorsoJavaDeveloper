package distributore_bevande;

public class Prodotto {

    private String nome;
    private double prezzo;
    private int quantita = 0;

    public Prodotto(){

    }

    public Prodotto(String nome, double prezzo){
        this.nome=nome;
        this.prezzo=prezzo;
    }

    public Prodotto(String nome, double prezzo, int quantita){
        this.nome=nome;
        this.prezzo=prezzo;
        this.quantita=quantita;
    }

    public String  getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public void addQuantita(int quantita) {
        this.quantita += quantita;
    }

}
