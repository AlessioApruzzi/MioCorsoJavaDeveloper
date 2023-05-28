package distributore_bevande;

public class Main {
    public static void main(String[] args) {

        Caffe caffe = new Caffe("caffe", 0.5);
        Cappuccino cappuccino = new Cappuccino("cappuccino", 1);
        DistributoreDiBevande distributoreDiBevande = new DistributoreDiBevande();
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        System.out.println(distributoreDiBevande.saldoAttuale());
        System.out.println(distributoreDiBevande.getResto());
        distributoreDiBevande.inserisciImporto(0.4);
        distributoreDiBevande.scegliProdotto("caffe");
        distributoreDiBevande.inserisciImporto(0.2);
        System.out.println(distributoreDiBevande.saldoAttuale());
        distributoreDiBevande.scegliProdotto("caffe");
        System.out.println(distributoreDiBevande.getResto());
        System.out.println(distributoreDiBevande.saldoAttuale());
        distributoreDiBevande.scegliProdotto("caffe");
        distributoreDiBevande.inserisciImporto(2.0);
        distributoreDiBevande.scegliProdotto("caffe");
        distributoreDiBevande.scegliProdotto("cappuccino");
        distributoreDiBevande.scegliProdotto("caffe");
        System.out.println(distributoreDiBevande.saldoAttuale());
        System.out.println(distributoreDiBevande.getResto());

    }
}