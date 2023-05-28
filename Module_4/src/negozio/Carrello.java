package negozio;

public class Carrello {

    private ListaProdotti carrello = new ListaProdotti();
    private Acquirente acquirente;
   // private  Negozio negozio1 = new Negozio();




    Carrello(){

    }

    Carrello(Negozio negozio){
    }


    public void addToCart(Prodotto prodotto, Negozio negozio) {
        ListaProdotti listaProdotti = negozio.getListaProdotti();
        for (int i = 0; i < listaProdotti.length(); i++) {
            if (listaProdotti.get(i) == prodotto) {
                if (listaProdotti.get(i).getQuantita() > 0) {
                    carrello.addcart(prodotto);
                    listaProdotti.get(i).addQuantita(-1);
                    negozio.setListaProdotti(listaProdotti);
                    return;
                } else {
                    System.out.println("Il prodotto e' terminato!!");
                    return;
                }
            }
        }
        System.out.println("Il prodotto non e' presente!!");
    }



    public void addToCartGroup(Prodotto prodotto, int quantita, Negozio negozio) {
        ListaProdotti listaProdotti = negozio.getListaProdotti();
        for (int i = 0; i < listaProdotti.length(); i++) {
            if (listaProdotti.get(i) == prodotto) {
                if (listaProdotti.get(i).getQuantita() >= quantita) {
                    carrello.addcart(prodotto);
                    listaProdotti.get(i).addQuantita(-quantita);
                    negozio.setListaProdotti(listaProdotti);
                    return;
                } else  {
                        System.out.println("La quantita' richiesta eccede la quantita' disponibile, scegliere una quantita minore di: " + listaProdotti.get(i).getQuantita());
                        return;
                }
            }
        }
        System.out.println("Il prodotto non e' presente!!");
    }





    private double scontoOver60(Acquirente acquirente, Prodotto prodotto) {
        double sconto = 0.8;  // sconto 20%
        GiornoSettimana giornoSettimanaAttuale = GiornoSettimana.LUNEDI;
       // if (giornoSettimanaAttuale == GiornoSettimana.LUNEDI || giornoSettimanaAttuale == GiornoSettimana.MERCOLEDI) {
        if (1>0) {
            if (acquirente.getEta() > 60) {
                if (prodotto.getTipoProdotto() == TipoProdotto.BENE_ALIMENTARE) {
                    return sconto;
                }
            }
        }
        return 1.0;
    }


    public double getPrezzo(Acquirente acquirente) {
        double totale = 0;
        for (int i = 0; i < carrello.length(); i++) {
            totale += carrello.get(i).getPrezzo() * scontoOver60(acquirente, carrello.get(i)) * carrello.get(i).getQuantita();
        }
        return totale;
    }

    public double rateizzazione(double prezzo, int numeroMesi){

        return prezzo/numeroMesi;
    }

    public ListaProdotti getCarrello() {
        return carrello;
    }

}


