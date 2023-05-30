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

}
