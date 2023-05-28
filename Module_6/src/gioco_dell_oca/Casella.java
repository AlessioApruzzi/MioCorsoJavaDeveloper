package gioco_dell_oca;

import java.util.Random;

public class Casella {

    private TipoCasella tipoCasella;

    private int spostamento;
    private int punti;


    public Casella(){

    }
    public Casella(TipoCasella tipoCasella){
        this.tipoCasella= tipoCasella;
    }





    public TipoCasella getTipoCasella() {
        return tipoCasella;
    }

    public void setTipoCasella(TipoCasella tipoCasella) {
        if (tipoCasella== TipoCasella.CasellaSpostaGiocatore){
            do{
                Random random = new Random();
                int upperbound = 9;
                spostamento = random.nextInt(upperbound);
            spostamento= spostamento-4;}
            while (spostamento==0);
        }
        if (tipoCasella== TipoCasella.CasellaPunti){
                Random random = new Random();
                int upperbound = 4;
                punti = random.nextInt(upperbound)  + 1;
        }
        this.tipoCasella = tipoCasella;
    }

    public int getSpostamento() {
        return spostamento;
    }


    public int getPunti() {
        return punti;
    }
}
