package negozio;

public class Prodotto {

    private String nome;
    private double prezzo;
    private TipoProdotto tipoProdotto;
    private int quantita=0;

    public Prodotto(){
    }

    public Prodotto(String nome, double prezzo){
        this.nome= nome;
        this.prezzo= prezzo;
    }

    public Prodotto(String nome, double prezzo, TipoProdotto tipoProdotto){
        this.nome=nome;
        this.prezzo=prezzo;
        this.tipoProdotto=tipoProdotto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public double getPrezzo() {
        return prezzo;
    }

    public void setTipoProdotto(TipoProdotto tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }
    public TipoProdotto getTipoProdotto() {
        return tipoProdotto;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
    public void addQuantita(int quantita){
        this.quantita += quantita;
    }
    public int getQuantita() {
        return quantita;
    }

}

