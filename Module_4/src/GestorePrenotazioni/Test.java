package GestorePrenotazioni;

public class Test {

    public static void main(String[] args) {


        MiniGestorePrenotazioni miniGestorePrenotazioni = new MiniGestorePrenotazioni(3, 5);
        Prenotazione p1 = new PrenotazioneSingola("12", Preferenza.ESTERNO);
        Prenotazione p2 = new PrenotazioneSingola("23", Preferenza.ESTERNO);
        Prenotazione p3 = new PrenotazioneSingola("34", Preferenza.INTERNO);
        Prenotazione p4 = new PrenotazioneSingola("56", Preferenza.ESTERNO);
        miniGestorePrenotazioni.prenota((PrenotazioneSingola) p1);
       // System.out.println(miniGestorePrenotazioni.prenota(p1));
        miniGestorePrenotazioni.prenota((PrenotazioneSingola) p2);
        miniGestorePrenotazioni.prenota((PrenotazioneSingola) p3);
        miniGestorePrenotazioni.prenota((PrenotazioneSingola) p4);

        System.out.println("aaa");

        ListaPrenotazioni prenotazioniInternoArray = miniGestorePrenotazioni.prenotazioniAttualiInterno();
        ListaPrenotazioni prenotazioniEsternoArray = miniGestorePrenotazioni.prenotazioniAttualiEsterno();

        System.out.println("aaaa");


 /*
        int prenotazioniInterno = 0, prenotazioniEsterno = 0;
//contiamo e togliamo i null se presenti
        for (int i = 0; i < prenotazioniInternoArray.length(); i++)
            if (prenotazioniInternoArray.get(i) != null) {
                prenotazioniInterno++;
            }
        for (int i = 0; i < prenotazioniEsternoArray.length(); i++)
            if (prenotazioniEsternoArray.get(i) != null) {
                prenotazioniEsterno++;
            }

  */
        System.out.println(prenotazioniInternoArray.length() == 1);

        System.out.println(prenotazioniInternoArray.length());


        System.out.println(prenotazioniEsternoArray.length() == 3);
        System.out.println(prenotazioniEsternoArray.length());
        Prenotazione p5 = new Prenotazione("45", 2);
        boolean a  = miniGestorePrenotazioni.prenota(p5);
        int prenotazioniInterno = 0;
        int prenotazioniEsterno = 0;
//contiamo e togliamo i null se presenti
        for (int i = 0; i < prenotazioniInternoArray.length(); i++)
            if (prenotazioniInternoArray.get(i) != null) {
                prenotazioniInterno++;
            }
        for (int i = 0; i < prenotazioniEsternoArray.length(); i++)
            if (prenotazioniEsternoArray.get(i) != null) {
                prenotazioniEsterno++;
            }
        System.out.println(prenotazioniInterno + prenotazioniEsterno == 5);
//verifichiamo i posti effettivamente riservati
        int postiTotali = 0;
        for (int i = 0; i < prenotazioniInternoArray.length(); i++)
            if (prenotazioniInternoArray.get(i) != null) {
                postiTotali += prenotazioniInternoArray.get(i).getNumeroPersone();
            }
        for (int i = 0; i < prenotazioniEsternoArray.length(); i++)
            if (prenotazioniEsternoArray.get(i) != null) {
                postiTotali += prenotazioniEsternoArray.get(i).getNumeroPersone();
            }
        System.out.println(postiTotali == 6);
        Prenotazione p6 = new PrenotazioneSingola("67", Preferenza.ESTERNO);
        boolean inserita = miniGestorePrenotazioni.prenota(p6);
        System.out.println(inserita);


    }
}
