package fake_booking;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Host extends User{
    private UUID hostId;

    private Set<Abitazione> abitazioni;
    private LinkedHashSet<Prenotazione> prenotazioni;
    private boolean superHost = false;



    public Host(String nome, String cognome, String indirizzo, String mail) {

        super(nome, cognome, indirizzo, mail);
        hostId = UUID.randomUUID();

    }

  //  public Host() {
    //    super();
   // }

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
}
