package classifica_serie_a;

public class RosaGiocatori {

    private Squadra[] giocatori = new Squadra[0];

    public RosaGiocatori(){
    }

    public int length(){
        return giocatori.length;
    }


    public void add(Squadra giocatore) {

        for (int i = 0; i < giocatori.length; i++) {
            if (giocatori[i] == giocatore) {
                System.out.println("Il giocatore e' gia presente. ");
                return;
            }
        }
        Squadra[] temp = new Squadra[giocatori.length + 1];
        for (int i = 0; i < giocatori.length; i++) {
            temp[i] = giocatori[i];
        }
        temp[giocatori.length] = giocatore;
        giocatori = temp;
    }



    public boolean remove(Squadra prenotazione){
        if (prenotazione != null) {
            Squadra[] temp = new Squadra[giocatori.length - 1];
            int counter = 0;
            for (int i = 0; i < giocatori.length; i++) {
                if (giocatori[i]!=prenotazione) {
                    temp[counter] = giocatori[i];
                    counter++;
                }
            }
            giocatori = temp;
            return true;
        } return false;
    }


    public Squadra get(int i){
        if (i> giocatori.length){
            return null;
        } else{
            return giocatori[i];
        }
    }
}
