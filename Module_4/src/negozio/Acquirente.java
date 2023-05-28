package negozio;

public class Acquirente extends Negozio{
    private int eta;
    private ListaProdotti carrello = new ListaProdotti();

    Acquirente(){}

    Acquirente(ListaProdotti listaProdotti){

    }

    public void addTocart(Prodotto prodotto) {

        carrello.add(prodotto);

    }


    public double scontoOver60(Acquirente acquirente, Prodotto prodotto) {
        double sconto = 0.8;  // sconto 20%
        GiornoSettimana giornoSettimanaAttuale = GiornoSettimana.LUNEDI;
        if (giornoSettimanaAttuale == GiornoSettimana.LUNEDI || giornoSettimanaAttuale == GiornoSettimana.MERCOLEDI) {
            if (acquirente.getEta() > 60) {
                if (prodotto.getTipoProdotto() == TipoProdotto.BENE_ALIMENTARE) {
                    return sconto;
                }
            }
        }
        return 1.0;
    }


    public double getPrezzoTotale(ListaProdotti carrello, Acquirente acquirente) {
        double totale = 0;
        for (int i = 0; i < carrello.length(); i++) {
            totale = carrello.get(i).getPrezzo() * scontoOver60(acquirente, carrello.get(i));
        }

        return totale;
    }


    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
