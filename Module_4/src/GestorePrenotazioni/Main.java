package GestorePrenotazioni;

import Ereditarieta_Polimorfismo.Auto;
import Ereditarieta_Polimorfismo.Moto;
import Ereditarieta_Polimorfismo.Veicolo;

public class Main {
    public static void main(String[] args) {

        Veicolo veicolo1 = new Veicolo("Fiat", "Punto");
        Veicolo veicolo2 = new Veicolo("Fiat", "Punto");
        veicolo1.accelera();

        /*
        * Stampa indirizzo di memoria es a09ee92 se
        * non faccio overraid del toString della classe
         */
        System.out.println(veicolo1);

        /*
        * Senza implementare il metodo equals ritorna false perche
        * sto confrontando gli indirizzi di memoria e non gli attributi
        *
         */

        System.out.println(veicolo1.equals(veicolo2));

        Auto auto = new Auto("Ford","Focus", 5);
        System.out.println("Auto: " + auto);
        auto.apriPorte();  // Auto
        auto.accelera();   // Se non faccio override, prendo il metodo della classe Veicolo

        Moto moto = new Moto("Honda","CBR", 1000);
        System.out.println("Moto: " + moto);
        moto.avviaMoto();  // Moto
        moto.accelera();   //

        Veicolo veicolo3 = new Moto("Honda","CBR", 500);
        System.out.println(veicolo3);
        veicolo3.accelera();
        System.out.println(veicolo3.getClass());

        System.out.println("*****");
        System.out.println(veicolo3 instanceof Moto);
        System.out.println(veicolo3 instanceof Veicolo);  // True perche moto estende veicolo
        System.out.println(veicolo3 instanceof Auto);

        System.out.println(moto instanceof Veicolo);

     //   List<Veicolo> veicoli = new ArrayList<Veicolo>();

    }
}