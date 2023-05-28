package gioco_dell_oca;

import java.util.Random;

public class Tabellone {

    private Casella[] caselle;


    public Tabellone(int n, Giocatore[] giocatori){

        caselle = new Casella[n];
        caselle[0] = new Casella(TipoCasella.Inizio);
        caselle[n-1] = new Casella(TipoCasella.Fine);
    //    System.out.println(caselle[0].getTipoCasella());
        for (int i = 1; i < n-1; i++) {
            caselle[i] = new Casella();

            caselle[i].setTipoCasella(TipoCasella.CasellaVuota);

           Random random = new Random();
            int upperbound = 3;
            int var = random.nextInt(upperbound);

            switch (var){
                case 0:
                    caselle[i].setTipoCasella(TipoCasella.CasellaVuota);
                    break;
                case 1:
                    caselle[i].setTipoCasella(TipoCasella.CasellaPunti);
                    break;
                case 2:
                    caselle[i].setTipoCasella(TipoCasella.CasellaSpostaGiocatore);
                    break;
            }


           System.out.println(caselle[i].getTipoCasella());
        }
     //   System.out.println(caselle[n-1].getTipoCasella());
    }



    public Casella getCasella(int i) {
        return caselle[i];
    }
    public void setCaselle(Casella[] caselle) {
        this.caselle = caselle;
    }
    public void setCasella(Casella casella, int i) {
        this.caselle[i] = casella;
    }


}
