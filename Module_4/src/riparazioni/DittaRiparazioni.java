package riparazioni;

public class DittaRiparazioni {


    private final int MAX_RIPARAZIONI = 100;
    private final int MAX_TECNICI = 100;
    private Tecnico[] tecnici = new Tecnico[MAX_TECNICI];
    private Riparazione[] riparazioni = new Riparazione[MAX_RIPARAZIONI];
    int nTecnici = 0;
    int nRiparazioni = 0;


    DittaRiparazioni(){}

    DittaRiparazioni(Riparazione[] riparazioni, Tecnico[] tecnici){
        this.riparazioni= riparazioni;
        this.tecnici=tecnici;
    }

    public void addRiparazione(String indirizzo, int priorita){
        this.riparazioni[nRiparazioni] = new Riparazione(indirizzo,priorita);
        nRiparazioni++;
    }

    public Riparazione[] listaRiparazioni(){
        Riparazione[] riparazioniInAttesa = new Riparazione[MAX_RIPARAZIONI];
        for (int i = 0; i < riparazioni.length; i++){
            if (riparazioni[i].isStato()){
                riparazioniInAttesa[i]=riparazioni[i];
            }
        }
        return riparazioniInAttesa;
    }

    public Riparazione nextRiparazione(){
        int[] priorityCheck = new int[riparazioni.length];
        int verify = 0;
        int counter = 0;
        // mettere un controllo per le priorita -1

        for (int i = 0; i < riparazioni.length ; i++){
            priorityCheck[i] = riparazioni[i].getPriorita();
        }
        for (int i = 0; i < riparazioni.length ; i++){
            if (priorityCheck[i]>verify){
                verify = priorityCheck[i];
                counter= i;
            }
        }
        return riparazioni[counter];
    }


    /*   public void assignRiparazioneToTechico(Riparazione riparazione, Tecnico tecnico){
        tecnico.addRiparazione(riparazione);
    }
     */

    public void assignRiparazioneToTechico(Riparazione riparazioni, Tecnico tecnico, int index) {
        if (tecnico.isFerie()){
            this.riparazioni[index].setTecnico(tecnico);
        } else {
            System.out.println("Il tecnico e' in ferie");
        }
    }

    public void concludiRiparazione(Riparazione[] riparazione, int index) {
        riparazione[index].setPriorita(-1);
    }

    public void ferieTecnico(Tecnico tecnico){
        tecnico.setFerie(true);
    }

    public void removeFerie(Tecnico tecnico){
        tecnico.setFerie(true);
    }

}
