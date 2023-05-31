package fake_booking;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Abitazione {

    private UUID abitazioneId; // = UUID.randomUUID(); da inserire nel costruttore
    private String nome;
    private String indirizzo;
    private int numeroLocali;
    private int postiLetto;
    private int piano;
    private LocalDate dataInizioPrenotabilita;
    private LocalDate dataFinePrenotabilita;

    public Abitazione() {
    }

    public Abitazione(String nome, String indirizzo, int numeroLocali, int postiLetto, int piano) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.numeroLocali = numeroLocali;
        this.postiLetto = postiLetto;
        this.piano = piano;
        abitazioneId= UUID.randomUUID();
    }

    public UUID getAbitazioneId() {
        return abitazioneId;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public int getNumeroLocali() {
        return numeroLocali;
    }

    public int getPostiLetto() {
        return postiLetto;
    }

    public int getPiano() {
        return piano;
    }

    public LocalDate getDataInizioPrenotabilita() {
        return dataInizioPrenotabilita;
    }

    public void setDataInizioPrenotabilita(LocalDate dataInizioPrenotabilita) {
        this.dataInizioPrenotabilita = dataInizioPrenotabilita;
    }

    public LocalDate getDataFinePrenotabilita() {
        return dataFinePrenotabilita;
    }

    public void setDataFinePrenotabilita(LocalDate dataFinePrenotabilita) {
        this.dataFinePrenotabilita = dataFinePrenotabilita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abitazione that = (Abitazione) o;
        return Objects.equals(abitazioneId, that.abitazioneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abitazioneId);
    }
}
