package gioco_dell_oca;

public class Main {
    public static void main(String[] args) {

        Giocatore giocatore1 = new Giocatore();
        Giocatore giocatore2 = new Giocatore();
        Giocatore giocatore3 = new Giocatore();
        Giocatore giocatore4 = new Giocatore();
        Giocatore giocatore5 = new Giocatore();

        Giocatore[] giocatori = {giocatore1, giocatore2, giocatore3, giocatore4, giocatore5};

        // Giocatore[] giocatori1 = { Giocatore,    vedere some si istanziano degli array

        //  Tabellone tabellone = new Tabellone(30, giocatori);

        GiocoOca giocoOca = new GiocoOca(30, giocatori);

     /*   do {
            giocoOca.giocaUnTurno();
            for (int i = 0; i < giocatori.length; i++) {
                System.out.println(giocatori[i].getPosizione());
            }
        } while (!giocoOca.giocaUnTurno());


      */

        boolean verify= false;
        while (!verify){
            verify= giocoOca.giocaUnTurno();
        }


    }
}

