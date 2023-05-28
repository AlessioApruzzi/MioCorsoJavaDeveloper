package classifica_serie_a;

public class Classifica {

    Campionato campionato = new Campionato();

    Classifica(){}

    Classifica(Campionato listaSquadre){
        this.campionato =listaSquadre;
    }

    public void esitoPartita(Squadra squadraCasa, int golCasa, Squadra squadraOspite, int golOspite){
        for (int i = 0; i < campionato.length(); i++) {
            if (campionato.get(i).equals(squadraCasa)){
                if (golCasa>golOspite){
                    campionato.get(i).addPunteggio(3);
                    campionato.get(i).addGolFatti(golCasa);
                } else if (golCasa==golOspite){
                    campionato.get(i).addPunteggio(1);
                    campionato.get(i).addGolFatti(golCasa);
                }
            }
            if (campionato.get(i).equals(squadraOspite)){
                if (golCasa<golOspite){
                    campionato.get(i).addPunteggio(3);
                    campionato.get(i).addGolFatti(golCasa);
                } else if (golCasa==golOspite){
                    campionato.get(i).addPunteggio(1);
                    campionato.get(i).addGolFatti(golCasa);
                }
            }
        }
    }

    public Campionato getClassifica(){
        campionato.sortPunteggio();

        return campionato;
    }

    public Squadra getMigliorAttacco(){
        campionato.sortGolFatti();
        return campionato.get(campionato.length()-1);
    }

    public Squadra getMigliorDifesa(){
        campionato.sortGolSubiti();
        return campionato.get(0);
    }




}
