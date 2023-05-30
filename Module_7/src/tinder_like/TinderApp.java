package tinder_like;

import java.util.*;

public class TinderApp {

    //   Set<Interesse> interessi = new HashSet<>();
    Set<Utente> utenti = new HashSet<>();

    public TinderApp(Set<Utente> utenti) {
        this.utenti = utenti;
    }

    public TinderApp() {
    }

    public void addUtenteAndInteressi(Utente utente) {
        utenti.add(utente);
    }


    public void removeUtente(Utente utente) {
        utenti.remove(utente);
    }

    public Utente mostCommonInterest(Utente utente) {
        int maxCorr = 0;
        Utente user = new Utente();
        for (Utente utente1 : utenti) {
            if (utente1 != utente) {
                int index = 0;
                for (Interesse interesse : utente.getInteressi()) {
                    if (utente1.getInteressi().contains(interesse)) {
                        index++;
                    }
                }
                if (index > maxCorr) {
                    maxCorr = index;
                    user = utente1;
                }
            }
        }
        if (maxCorr == 0) {
            System.out.println("Non ci sono utenti con interessi simili");
            return null;
        } else {
            return user;
        }
    }

    public Set<Utente> getMostSimilarUser() {
        int index = 0;

        int maxCorr = 0;
        Utente user1 = new Utente();
        Utente user2 = new Utente();
        for (Utente utente : utenti) {
            for (Utente utente1 : utenti) {
                if (utente1 != utente) {
                    index = 0;
                    for (Interesse interesse : utente1.getInteressi()) {
                        if (utente.getInteressi().contains(interesse)) {
                            index++;
                        }
                    }
                    if (index > maxCorr) {
                        maxCorr = index;
                        user1 = utente1;
                        user2 = utente;
                    }
                }
            }
        }
        Set<Utente> mostSimilarUser = new HashSet<>();
        mostSimilarUser.add(user2);
        mostSimilarUser.add(user1);
        return mostSimilarUser;
    }

    public Set<Utente> getUtenti() {
        return utenti;
    }
}




