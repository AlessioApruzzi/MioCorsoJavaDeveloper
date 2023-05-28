package distributore_bevande;

import java.util.Objects;

public class DistributoreDiBevande {

    private ListaProdotti listaProdotti = new ListaProdotti();

    private double importo = 0;

    public DistributoreDiBevande(){}

    public DistributoreDiBevande(int i){

    }

    public void caricaProdotto(Prodotto prodotto){
        listaProdotti.addQuantita(prodotto);
    }

    public void inserisciImporto ( double importo){
        this.importo += importo;
    }

    public void scegliProdotto(String nome){
        int checker = 0;
        for (int i = 0; i < listaProdotti.length(); i++) {
            if (Objects.equals(listaProdotti.get(i).getNome(), nome)) {
                if (this.importo>=listaProdotti.get(i).getPrezzo()) {
                    listaProdotti.get(i).addQuantita(-1);
                    this.importo -= listaProdotti.get(i).getPrezzo();
                    checker = i;
                    return;
                }
            }
        }
        if (this.importo<listaProdotti.get(checker).getPrezzo()) {
            System.out.println("Importo non sufficiente");
            return;
        }
        System.out.println("Prodotto non presente");

    }

    public double saldoAttuale(){
        return importo;
    }

    public double getResto(){
        double saldo;
        saldo = this.importo;
        this.importo = 0;
        return saldo;
    }








}
