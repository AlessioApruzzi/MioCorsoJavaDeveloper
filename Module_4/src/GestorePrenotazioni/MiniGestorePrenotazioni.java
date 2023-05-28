package GestorePrenotazioni;

public class MiniGestorePrenotazioni {
    private int interne;

    private int esterne;
    ListaPrenotazioni listaPrenotazioniInterne = new ListaPrenotazioni();
    ListaPrenotazioni listaPrenotazioniEsterne = new ListaPrenotazioni();


    MiniGestorePrenotazioni() {

    }

    MiniGestorePrenotazioni(int n, int m){
        interne=n;
        esterne=m;
    }

    public boolean prenota(PrenotazioneSingola prenotazioneSingola) {

        if (prenotazioneSingola.getPreferenza() == Preferenza.INTERNO) {

            if (prenotazioneSingola.getNumeroPersone() < interne) {
                listaPrenotazioniInterne.add(prenotazioneSingola);
                interne -= prenotazioneSingola.getNumeroPersone();
                return true;
            }
        } else if (prenotazioneSingola.getPreferenza() == Preferenza.ESTERNO) {

            if ( prenotazioneSingola.getNumeroPersone() < esterne) {
                listaPrenotazioniEsterne.add(prenotazioneSingola);
                esterne -= prenotazioneSingola.getNumeroPersone();
                return true;
            }
        }
        return false;

    }

    public boolean prenota(Prenotazione prenotazione) {

        if ( prenotazione.getNumeroPersone() <= interne) {
            listaPrenotazioniInterne.add(prenotazione);
            interne -= prenotazione.getNumeroPersone();
            return true;
        } else if ( prenotazione.getNumeroPersone() <= esterne) {
            listaPrenotazioniEsterne.add(prenotazione);
            esterne -= prenotazione.getNumeroPersone();
            return true;
        }
        return false;
    }

    public void terminaPrenotazione(Prenotazione prenotazione) {
        if (listaPrenotazioniInterne.remove(prenotazione)) {
            interne += prenotazione.getNumeroPersone();
            if (controllaPrenotazioni(listaPrenotazioniEsterne, Preferenza.ESTERNO)){

                esterne++;
            }


        } else if (listaPrenotazioniInterne.remove(prenotazione)){
        esterne+=prenotazione.getNumeroPersone();
            if(controllaPrenotazioni(listaPrenotazioniInterne, Preferenza.INTERNO)) {
                interne++;
            }
        }
    }

    public boolean controllaPrenotazioni (ListaPrenotazioni listaPrenotazioni, Preferenza preferenza) {
        for (int i = 0; i < listaPrenotazioni.length(); i++) {
            if (listaPrenotazioni.get(i) instanceof PrenotazioneSingola) {
                if (((PrenotazioneSingola) listaPrenotazioni.get(i)).getPreferenza() != preferenza) {
                    prenota(listaPrenotazioni.get(i));
                    listaPrenotazioni.remove(listaPrenotazioni.get(i));
                    return true;
                }
            }
        }return false;

    }

    public ListaPrenotazioni prenotazioniAttualiInterno() {
        return listaPrenotazioniInterne;
    }

    public ListaPrenotazioni prenotazioniAttualiEsterno() {
        return listaPrenotazioniEsterne;
    }
}



