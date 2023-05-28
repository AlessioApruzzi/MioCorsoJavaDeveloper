package classifica_serie_a;

import java.util.Arrays;
import java.util.Comparator;

public class Campionato {

    private Squadra[] squadre = new Squadra[0];

    public Campionato(){
    }

    public int length(){
        return squadre.length;
    }


    public void sortPunteggio(){
        Arrays.sort(squadre, Comparator.comparing(Squadra::getPunteggio ));
    }

    public void sortGolFatti(){
        Arrays.sort(squadre, Comparator.comparing(Squadra::getGolFatti ));
    }

    public void sortGolSubiti(){
        Arrays.sort(squadre, Comparator.comparing(Squadra::getGolSubiti ));
    }

    public void add(Squadra squadra) {

        for (int i = 0; i < squadre.length; i++) {
            if (squadre[i] == squadra) {
                System.out.println("Il giocatore e' gia presente. ");
                return;
            }
        }
        Squadra[] temp = new Squadra[squadre.length + 1];
        for (int i = 0; i < squadre.length; i++) {
            temp[i] = squadre[i];
        }
        temp[squadre.length] = squadra;
        squadre = temp;
    }



    public boolean remove(Squadra squadra){
        if (squadra != null) {
            Squadra[] temp = new Squadra[squadre.length - 1];
            int counter = 0;
            for (int i = 0; i < squadre.length; i++) {
                if (squadre[i]!=squadra) {
                    temp[counter] = squadre[i];
                    counter++;
                }
            }
            squadre = temp;
            return true;
        } return false;
    }


    public Squadra get(int i){
        if (i> squadre.length){
            return null;
        } else{
            return squadre[i];
        }
    }
}
