
package fake_booking;

import java.time.Duration;
import java.time.LocalDate;
import java.util.*;

public class FakeBooking {

    private Set<User> utenti = new HashSet<>();
    private Set<Host> hosts = new HashSet<>();
    // private Set<Abitazione> abitazioni;
    // private Set<Prenotazione> prenotazioni;
    // private Map<Host, Set<Abitazione>> hostSetMap;
    private Map<Abitazione,Set<Prenotazione>> abitazioneSetMap= new HashMap<>();
    private Map<Host, Set<Feedback>> feedbackHost = new HashMap<>();

    public FakeBooking(Set<User> utenti, Set<Host> hosts, Map<Abitazione, Set<Prenotazione>> abitazioneSetMap) {
        this.utenti = utenti;
        this.hosts = hosts;
        this.abitazioneSetMap = abitazioneSetMap;
    }

    public FakeBooking() {
        utenti = new HashSet<>();
        hosts = new HashSet<>();
        abitazioneSetMap= new HashMap<>();
        feedbackHost = new HashMap<>();
    }

    public void addUser(User user){
        utenti.add(user);
    }
    public void addHost(Host host){
        utenti.add(host);
    }

    public void addPrenotazione (Prenotazione prenotazione){
        abitazioneSetMap.get(prenotazione.getAbitazione()).add(prenotazione);
    }


    public Set<Abitazione> getAbitazioniByHostId(UUID uuid){
        for (Host host : hosts) {
            if (uuid == host.getHostId()){
                return host.getAbitazioni();
            }
        }
        return null;
    }

    public Prenotazione getLastPrenotazioneByIdUtente (UUID uuid){
        for (User user : utenti) {
            if (user.getUserId()==uuid){
                int index=0;
                for (Prenotazione prenotazione : user.getPrenotazioni()) {
                    if (index==(user.getPrenotazioni().size()-1)){
                        return prenotazione;
                    }
                    index++;
                }

            }
        } return null;
    }

    public Abitazione getMostGettonataAbitazioneUltimoMese(){
        int max = 0;
        int counter = 0;
        LocalDate lastMonth = LocalDate.now().minusDays(30);
        Abitazione abitazioneGettonata = new Abitazione();

        for(Abitazione k : abitazioneSetMap.keySet()) {
            counter = 0;
            for (Prenotazione prenotazione : abitazioneSetMap.get(k)) {
                if (prenotazione.getDataInizio().isAfter(lastMonth)) {
                    counter++;
                }
            }
            if (counter > max) {
                max = counter;
                abitazioneGettonata = k;
            }
        } return abitazioneGettonata;
    }




 /*   public Abitazione getMostGettonataAbitazioneUltimoMese(){
        int counter = 0;
        int max = 0;
        LocalDate lastMonth = LocalDate.now().minusDays(30);

        Abitazione abitazioneGettonata = new Abitazione();
        for (Abitazione abitazione : abitazioni) {
            for (Prenotazione prenotazione : prenotazioni) {
                if (prenotazione.getAbitazione()==abitazione){
                    if (prenotazione.getDataInizio().isAfter(lastMonth)){
                        counter++;
                    }
                }
            }
            if (counter>max){
                max=counter;
                abitazioneGettonata=abitazione;
            }
        }
        return abitazioneGettonata;
    }

  */

    public Set<Host> getMostPrenotazioniHostLastMese() {
        int max = 0;
        int counter = 0;
        LocalDate lastMonth = LocalDate.now().minusDays(30);
        Set<Host> hostMostPren = new HashSet<>();
        for (Host host : hosts) {
            counter = 0;
            for (Prenotazione prenotazione : getPrenotazioniLastMese(host)) {
                counter=getPrenotazioniLastMese(host).size();
            }
            if (counter > max) {
                max = counter;
            }
        }
        for (Host host : hosts) {
            if (getPrenotazioniLastMese(host).size()==max){
               hostMostPren.add(host);
            }
        }
        return hostMostPren;
    }

    public Set<Prenotazione> getPrenotazioniLastMese (Host host){
        LocalDate lastMonth = LocalDate.now().minusDays(30);
        int counter = 0;
        Set<Prenotazione> prenotazioniLastMese = new HashSet<>();
        for (Prenotazione prenotazione : host.getPrenotazioni()) {
            if (prenotazione.getDataInizio().isAfter(lastMonth)) {
                prenotazioniLastMese.add(prenotazione);
            }
        }
        return prenotazioniLastMese;
    }


    public Set<Host> getSuperHosts(){
        Set<Host> superHosts =new HashSet<>();
        for (Host host : hosts) {
            int counter=0;
            for(Abitazione k : abitazioneSetMap.keySet()){
                if (host.getAbitazioni().contains(k)){
                    counter+=abitazioneSetMap.get(k).size();
                }
            }if (counter>=100){
                host.setSuperHost(true);
                superHosts.add(host);
            }
        }return superHosts;
    }

    public Set<User> fiveMostDaysPrenotazioniLastMese(){
        Map<Integer,User> userWithPrenotationDaysAsKey = new TreeMap<>();
        Set<User> userMostDays= new HashSet<>();
        for (User user : utenti) {
            userWithPrenotationDaysAsKey.put(getDaysOfPrenotazioniLastMOntByUser(user),user);
        }
        int index=0;
        for (User user : userWithPrenotationDaysAsKey.values()) {
            if (index>userWithPrenotationDaysAsKey.size()-5){
                userMostDays.add(user);
            }
        }

        /*
        for (int i = 0; i < 5; i++) {
            userMostDays.add(userWithPrenotationDaysAsKey.get(userWithPrenotationDaysAsKey.size()-i-1));
        }

         */
        return userMostDays;
    }

    public int getDaysOfPrenotazioniLastMOntByUser(User user){
        int counter=0;
        for (Prenotazione prenotazione : user.getPrenotazioni()) {
            counter += Duration.between(prenotazione.getDataInizio(), prenotazione.getDataFine()).toDays();
        }
        return counter;
    }

    public double mediumNumberPostiLettoByAllAbitazioni(){
        double counter=0;
        double sum = 0;
        for(Abitazione k : abitazioneSetMap.keySet()) {
            sum+=k.getPostiLetto();
            counter++;
        }
        return sum/counter;
    }




}

