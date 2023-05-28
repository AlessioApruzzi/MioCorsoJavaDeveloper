package distributore_bevande;

import java.util.Arrays;

public class ListaProdotti {

    private Prodotto[] prodotti = new Prodotto[0];

    public ListaProdotti() {

    }

    public ListaProdotti(Prodotto[] prodotti) {
        for (Prodotto prodotto : prodotti) {
            add(prodotto);
        }
    }

    public int length() {
        return prodotti.length;
    }


    public void add(Prodotto prodotto) {
        if (prodotto != null) {
            for (int i = 0; i < prodotti.length; i++) {
                if (prodotti[i] == prodotto) {
                  //  prodotti[i].addQuantita(1);
                    return;
                }
            }
            Prodotto[] temp = new Prodotto[prodotti.length + 1];
            for (int i = 0; i < prodotti.length; i++) {
                temp[i] = prodotti[i];
            }
            temp[prodotti.length] = prodotto;
            prodotti = temp;
        }
    }

    public void addQuantita(Prodotto prodotto) {
        if (prodotto != null) {
            for (int i = 0; i < prodotti.length; i++) {
                if (prodotti[i] == prodotto) {
                    prodotti[i].addQuantita(1);
                    return;
                }
            }

            Prodotto[] temp = new Prodotto[prodotti.length + 1];
            for (int i = 0; i < prodotti.length; i++) {
                temp[i] = prodotti[i];
            }

            temp[prodotti.length] = prodotto;
            temp[prodotti.length].addQuantita(1);
            prodotti = temp;

        }
    }

    public void removeQuantita(Prodotto prodotto) {
        if (prodotto != null) {
            for (int i = 0; i < prodotti.length; i++) {
                if (prodotti[i] == prodotto) {
                    prodotti[i].setQuantita(-1);
                    return;
                }
            }

            Prodotto[] temp = new Prodotto[prodotti.length + 1];
            for (int i = 0; i < prodotti.length; i++) {
                temp[i] = prodotti[i];
            }

            temp[prodotti.length] = prodotto;
            temp[prodotti.length].addQuantita(1);
            prodotti = temp;

        }
    }


    public void remove(Prodotto prodotto) {
        if (prodotto != null) {
            Prodotto[] temp = new Prodotto[prodotti.length - 1];
            int counter = 0;
            for (int i = 0; i < prodotti.length; i++) {
                if (prodotti[i] != prodotto) {
                    temp[counter] = prodotti[i];
                    counter++;
                }
            }
            prodotti = temp;
        }
    }

    public Prodotto get(int i) {
        if (i > prodotti.length) {
            return null;
        } else {
            return prodotti[i];
        }
    }

    @Override
    public String toString() {
        return "ListaProdotti{" +
                "prodotti=" + Arrays.toString(prodotti) +
                '}';
    }
}




