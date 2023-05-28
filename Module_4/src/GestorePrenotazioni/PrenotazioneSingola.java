package GestorePrenotazioni;

public class PrenotazioneSingola extends Prenotazione {

    private Preferenza preferenza;


    PrenotazioneSingola(String codiceUnivoco, Preferenza preferenza){
        super(codiceUnivoco,1);
        this.preferenza=preferenza;
    }

    public Preferenza getPreferenza() {
        return preferenza;
    }

    public void setPreferenza(Preferenza preferenza) {
        this.preferenza = preferenza;
    }
}
