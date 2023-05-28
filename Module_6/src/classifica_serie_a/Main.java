package classifica_serie_a;

public class Main {
    public static void main(String[] args) {


        Campionato serieA = new Campionato();
        Squadra squadra1 = new Squadra(1, "squadra1", 4,5);
        Squadra squadra2 = new Squadra(1, "squadra2",5,8);
        Squadra squadra3 = new Squadra(1, "squadra3",6 ,2);
        Squadra squadra4 = new Squadra(1, "squadra4",8,2);
        Squadra squadra5 = new Squadra(1, "squadra5",10,5);
        Squadra squadra6 = new Squadra(1, "squadra6",9,5);

        serieA.add(squadra1);
        serieA.add(squadra2);
        serieA.add(squadra3);
        serieA.add(squadra4);
        serieA.add(squadra5);

        squadra1.setPunteggio(3);
        squadra2.setPunteggio(5);
        squadra3.setPunteggio(9);
        squadra4.setPunteggio(2);
        squadra5.setPunteggio(5);


        Classifica classificaSerieA = new Classifica(serieA);

        for (int i = 0; i < serieA.length(); i++) {
            System.out.println(serieA.get(i).toString());
        }

        System.out.println(" ");


        classificaSerieA.getClassifica();

        for (int i = 0; i < serieA.length(); i++) {
            System.out.println(serieA.get(serieA.length()-i-1).toString());
        }


        System.out.println("");
        System.out.println("miglior attacco " + classificaSerieA.getMigliorAttacco());
        System.out.println("");
        System.out.println("miglior difesa " + classificaSerieA.getMigliorDifesa());
        System.out.println("");

        classificaSerieA.esitoPartita(squadra1, 16, squadra2, 1);

        classificaSerieA.getClassifica();
        for (int i = 0; i < serieA.length(); i++) {
            System.out.println(serieA.get(serieA.length()-i-1).toString());
        }


        System.out.println("");
        System.out.println("miglior attacco " + classificaSerieA.getMigliorAttacco());
        System.out.println("");
        System.out.println("miglior difesa " + classificaSerieA.getMigliorDifesa());

    }
}