package fake_booking;

import java.util.UUID;

public class Feedback {

    private UUID feedbackId;
    private String titolo;
    private String testo;
    private int punteggio;

    public Feedback(String titolo, String testo, int punteggio) {
        this.feedbackId = feedbackId;
        this.titolo = titolo;
        this.testo = testo;
        this.punteggio = punteggio;
        feedbackId= UUID.randomUUID();
    }

    public UUID getFeedbackId() {
        return feedbackId;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getTesto() {
        return testo;
    }

    public int getPunteggio() {
        return punteggio;
    }
}
