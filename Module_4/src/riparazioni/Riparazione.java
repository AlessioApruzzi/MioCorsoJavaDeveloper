package riparazioni;

public class Riparazione {

    private String indirizzo;
    private int priorita;
    private boolean stato = false;

    private Tecnico tecnico;

    Riparazione(){

    }

    Riparazione(String indirizzo, int priorita){
        this.indirizzo=indirizzo;
        this.priorita=priorita;
    }

    Riparazione(String indirizzo, int priorita, Tecnico tecnico){
        this.indirizzo=indirizzo;
        this.priorita=priorita;
        this.tecnico=tecnico;
    }



    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getPriorita() {
        return priorita;
    }

    public void setPriorita(int priorita) {
        this.priorita = priorita;
    }

    public boolean isStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
}
