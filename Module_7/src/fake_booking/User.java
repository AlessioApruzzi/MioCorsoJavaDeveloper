package fake_booking;

import java.time.Period;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

public class User {

    private String nome;
    private String cognome;
    private String indirizzo;
    private String mail;
    private UUID userId;
    private LinkedHashSet<Prenotazione> prenotazioni;

    public User(String nome, String cognome, String indirizzo, String mail) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.mail = mail;
        userId= UUID.randomUUID();
        prenotazioni = new LinkedHashSet<>();
    }

    public User() {
        prenotazioni= new LinkedHashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getMail() {
        return mail;
    }

    public UUID getUserId() {
        return userId;
    }

    public LinkedHashSet<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(LinkedHashSet<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    public void addPrenotazione(Prenotazione prenotazione){
        prenotazioni.add(prenotazione);
    }
    public void removePrenotazione(Prenotazione prenotazione){
        prenotazioni.remove(prenotazione);
    }


    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                "giorni prenotazioni" + getDaysOfPrenotazioniLastMOntByUser();
    }

    public int getDaysOfPrenotazioniLastMOntByUser(){
        int counter=0;
        for (Prenotazione prenotazione : prenotazioni) {
            counter += Period.between(prenotazione.getDataInizio(), prenotazione.getDataFine()).getDays();
        }
        return counter;
    }
}
