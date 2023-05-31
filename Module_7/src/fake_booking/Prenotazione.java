package fake_booking;

import tinder_like.Utente;

import java.time.LocalDate;
import java.util.UUID;

public class Prenotazione {

    private UUID prenotazioneId;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private Abitazione abitazione;
    private Utente utente;
    private double prezzo;

    public Prenotazione(LocalDate dataInizio, LocalDate dataFine, Abitazione abitazione, Utente utente, double prezzo) {
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.abitazione = abitazione;
        this.utente = utente;
        prenotazioneId= UUID.randomUUID();
        this.prezzo=prezzo;
    }

    public UUID getPrenotazioneId() {
        return prenotazioneId;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public Abitazione getAbitazione() {
        return abitazione;
    }

    public Utente getUtente() {
        return utente;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public void setDataFine(LocalDate dataFine) {
        this.dataFine = dataFine;
    }
}
