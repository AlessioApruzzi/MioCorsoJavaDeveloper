package negozio;

public class Negozio {

    ListaProdotti prodotti = new ListaProdotti();


 //   Carrello carrello = new Carrello();

    private int quantita = 0;

    public ListaProdotti getListaProdotti() {
        return prodotti;
    }

    public void setListaProdotti(ListaProdotti prodotti) {
        this.prodotti = prodotti;
    }

    Negozio() {

    }


    public void addProdotto(Prodotto prodotto) {

        prodotti.add(prodotto);
    }

    public void removeProdotto(Prodotto prodotto) {
        prodotti.remove(prodotto);
    }

    public void quantitaProdotti() {
        for (int i = 0; i < prodotti.length(); i++) {
            System.out.println("Il prodotto: " + prodotti.get(i).getNome() + " ha una quantita: " + prodotti.get(i).getQuantita());
        }
    }


   /* public void addToCart(Prodotto prodotto, int quantita) {

        for (int i = 0; i < prodotti.length(); i++) {
            if (prodotti.get(i) == prodotto) {
                if (prodotti.get(i).getQuantita() > quantita) {
                    carrello.add(prodotto);
                    prodotti.get(i).addQuantita(-quantita);
                    return;
                }
            }
        }
        System.out.println("Il prodotto e' terminato");
    }



    public void resetCarrello(){
        carrello.reset();
    }


    public double scontoOver60(int verify, Prodotto prodotto) {

        double sconto = 0.8;  // sconto 20%
        if (verify==1) {
                if (prodotto.getTipoProdotto() == TipoProdotto.BENE_ALIMENTARE) {
                    return sconto;
                }
            }
        return 1.0;
    }


    public double getPrezzo(ListaProdotti carrello, Acquirente acquirente) {
        double totale = 0;

        System.out.println("E' lunedi o mercoledi? L'acquirente ha piu di 60 anni? \n 1)si \n2)no ");
        Scanner input = new Scanner(System.in);
        int verify = input.nextInt();

        for (int i = 0; i < carrello.length(); i++) {
            totale += carrello.get(i).getPrezzo() * scontoOver60(verify, carrello.get(i));
        }
        resetCarrello();
        return totale;

    }

    public double rateizzazione(double prezzo, int numeroMesi){
        return prezzo/numeroMesi;
    }



    */
}
