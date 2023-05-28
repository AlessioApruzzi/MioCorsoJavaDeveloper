package gioco_dell_oca;

import java.util.Random;

public class Giocatore {

    private int posizione;
    private int punti;

    private int valoreDadi;
 //   private Tabellone tabellone;

    public Giocatore(){

    }
    public void tiraDati(){
        Random random = new Random();
        int upperbound = 6;
        int valoreDadi = random.nextInt(upperbound) + 1;
        posizione += valoreDadi;
        System.out.println(valoreDadi);


    }

    public int getPosizione() {
        return posizione;
    }

    public void setPosizione(int posizione) {
        this.posizione += posizione;
    }
    public void annullPosizione() {
        this.posizione = 0;
    }

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti += punti;
    }

    public int getValoreDadi() {
        return valoreDadi;
    }
}
