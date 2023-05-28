package gioco_dell_oca;

public class GiocoOca {

    private Giocatore[] giocatori;
    private int n;
    private Tabellone tabellone;

    public GiocoOca(int n, Giocatore[] giocatori) {
        this.n = n;
        this.giocatori = giocatori;
        tabellone = new Tabellone(n, giocatori);

    }

    public boolean giocaUnTurno() {
        for (int i = 0; i < giocatori.length; i++) {
            do {
                int posizioneAttuale = giocatori[i].getPosizione();
               // System.out.println(posizioneAttuale);
                giocatori[i].tiraDati();


                if (giocatori[i].getPosizione() == n - 1) {
                    System.out.println("Il giocatore " + i + " ha vinto");
                    return true;
                }
                System.out.println(posizioneAttuale);
                System.out.println(giocatori[i].getPosizione());
                if (giocatori[i].getPosizione() > n - 1) {
                    giocatori[i].setPosizione(-(giocatori[i].getPosizione() - (n - 1)));
                }

                System.out.println("giocatore " + i + " e' in posizione " + giocatori[i].getPosizione());

                posizioneAttuale = giocatori[i].getPosizione();
                if (tabellone.getCasella(giocatori[i].getPosizione()).getTipoCasella() == TipoCasella.CasellaSpostaGiocatore) {
                    giocatori[i].setPosizione(tabellone.getCasella(giocatori[i].getPosizione()).getSpostamento());
                    if (giocatori[i].getPosizione() > n - 1) {
                        giocatori[i].setPosizione(-(giocatori[i].getPosizione() - (n - 1)) );
                    }
                    if (giocatori[i].getPosizione() < 0) {
                        giocatori[i].annullPosizione();
                    }
                } else if (tabellone.getCasella(giocatori[i].getPosizione()).getTipoCasella() == TipoCasella.CasellaPunti) {
                    giocatori[i].setPunti(tabellone.getCasella(giocatori[i].getPosizione()).getPunti());
                }

                if (giocatori[i].getPosizione() == n - 1) {
                    System.out.println("Il giocatore " + i + " ha vinto");
                    return true;
                }


              //  System.out.println("giocatore" + i + " " + giocatori[i].getPosizione());

            } while (tabellone.getCasella(giocatori[i].getPosizione()).getTipoCasella() == TipoCasella.CasellaSpostaGiocatore);
        }
        return false;
    }
}

