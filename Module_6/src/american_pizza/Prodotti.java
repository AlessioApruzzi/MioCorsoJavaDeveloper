package american_pizza;

public class Prodotti {

    private double prezzo;
    private String nome;

    Prodotti(){
    }

    Prodotti(String nome, double prezzo){
        this.nome= nome;
        this.prezzo=prezzo;
    }


    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo += prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return   nome +
                ", prezzo=" + prezzo + "\n";
    }
}
