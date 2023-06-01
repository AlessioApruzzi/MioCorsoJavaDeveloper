package fake_booking;

import java.time.LocalDate;
import java.util.*;

public class Host extends User{
    private UUID hostId;

    private Set<Abitazione> abitazioni;
    private LinkedHashSet<Prenotazione> prenotazioni;
    private boolean superHost = false;



    public Host(String nome, String cognome, String indirizzo, String mail) {

        super(nome, cognome, indirizzo, mail);
        hostId = UUID.randomUUID();
        abitazioni= new HashSet<>();
        prenotazioni= new LinkedHashSet<>();
    }

    public Host(){
        abitazioni= new HashSet<>();
        prenotazioni= new LinkedHashSet<>();
    }

  //  public Host() {
    //    super();
   // }

    public void addPrenotazione(Prenotazione prenotazione){
        prenotazioni.add(prenotazione);
    }
    public void addAbitazione(Abitazione abitazione){
        abitazioni.add(abitazione);
    }

    public UUID getHostId() {
        return hostId;
    }

    public Set<Abitazione> getAbitazioni() {
        return abitazioni;
    }

    public LinkedHashSet<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }



    //   private Map<Integer,Abitazione> abitazioni;

    private void caricaAbitazione(Abitazione o){
        abitazioni.add(o);
    }

    private void caricaAbitazioni(Set<Abitazione> abitazioni){
        this.abitazioni.addAll(abitazioni);
    }

    private void specificaPrezzo(double prezzo, Prenotazione prenotazione){
        prenotazione.setPrezzo(prezzo);
    }
    public void periodoAttivo(LocalDate dataInizioPrenotabilita, LocalDate dataFinePrenotabilita, Abitazione abitazione){
        abitazione.setDataInizioPrenotabilita(dataInizioPrenotabilita);
        abitazione.setDataFinePrenotabilita(dataFinePrenotabilita);
    }

    public boolean isSuperHost() {
        return superHost;
    }

    public void setSuperHost(boolean superHost) {
        this.superHost = superHost;
    }

    @Override
    public String toString() {
        return "Host{" +
                "hostId=" + hostId +
                ", abitazioni=" + abitazioni +
                ", prenotazioni=" + prenotazioni +
                ", superHost=" + superHost +
                '}';
    }
}
