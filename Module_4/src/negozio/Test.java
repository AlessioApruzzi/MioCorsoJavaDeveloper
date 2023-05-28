package negozio;

public class Test {

    public static void main(String[] args) {

        Negozio negozio = new Negozio();

        Carrello carrello = new Carrello(negozio);

        Acquirente acquirente = new Acquirente();


        acquirente.setEta(70);

        Prodotto mela = new Prodotto("mela",1.20, TipoProdotto.BENE_ALIMENTARE);
        Prodotto pera = new Prodotto("pera",1.50, TipoProdotto.BENE_ALIMENTARE);
        Prodotto forchetta = new Prodotto("forchetta",5.12, TipoProdotto.GENERICO);


        negozio.addProdotto(mela);
     //   negozio.addProdotto(pera);
    //    negozio.addProdotto(forchetta);


        negozio.quantitaProdotti();

        System.out.println("");

        negozio.removeProdotto(mela);


       // negozio.quantitaProdotti();

     //   negozio.getListaProdotti().addQuantita(pera, 5);
        negozio.getListaProdotti().addQuantita(mela, 20);
     //   negozio.getListaProdotti().addQuantita(forchetta, 150);

        negozio.quantitaProdotti();

        System.out.println("");

        carrello.addToCartGroup(mela,2,negozio);

        negozio.quantitaProdotti();

        carrello.addToCartGroup(mela,3,negozio);

        System.out.println("");

        negozio.quantitaProdotti();

        System.out.println(carrello.getCarrello().get(0).getQuantita());

        System.out.println(carrello.getPrezzo(acquirente));
        
    }
}
