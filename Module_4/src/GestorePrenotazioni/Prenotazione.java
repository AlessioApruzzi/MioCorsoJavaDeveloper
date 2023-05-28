package GestorePrenotazioni;

public class Prenotazione {


    private String codiceUnivoco;
    private int numeroPersone;

    Prenotazione(){}

    Prenotazione(String codiceUnivoco, int numeroPersone){

        this.codiceUnivoco=codiceUnivoco;
        this.numeroPersone=numeroPersone;
    }


    public String getCodiceUnivoco() {
        return codiceUnivoco;
    }

    public void setCodiceUnivoco(String codiceUnivoco) {
        this.codiceUnivoco = codiceUnivoco;
    }

    public int getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(int numeroPersone) {
        this.numeroPersone = numeroPersone;
    }
}
