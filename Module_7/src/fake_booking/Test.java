package fake_booking;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {


        User alessio = new User("alessio", "apruzzi", "via random1", "mail1");
        User marco = new User("marco", "lala", "via random2", "mail2");
        User andrea = new User("andrea", "lala1", "via random3", "mail3");
        User andrea1 = new User("lala", "lala2", "via random4", "mail4");
        User andre2 = new User("lala1", "lala3", "via random5", "mail5");
        User andre3 = new User("lala2", "lala4", "via random6", "mail6");

        Host aleHost = new Host("alessio", "ale", "via random4", "mail4");
        Host andreHost = new Host("andrea", "and", "via random5", "mail5");

        FakeBooking fakeBooking = new FakeBooking();

        fakeBooking.addHost(aleHost);
        fakeBooking.addHost(andreHost);

        fakeBooking.addUser(alessio);
        fakeBooking.addUser(marco);
        fakeBooking.addUser(andrea);
        fakeBooking.addUser(andrea1);
        fakeBooking.addUser(andre2);
        fakeBooking.addUser(andre3);


        Abitazione abitazione1 = new Abitazione("abitazione1","via 1", 3, 5 , 1);
        Abitazione abitazione2 = new Abitazione("abitazione2","via 2", 2, 4, 2);
        Abitazione abitazione3 = new Abitazione("abitazione3","via 3", 4, 7 , 3);

        aleHost.addAbitazione(abitazione1);
        andreHost.addAbitazione(abitazione2);
        Prenotazione prenotazione1 = new Prenotazione(LocalDate.of(2023,5,15),LocalDate.of(2023,5,17),abitazione1,alessio,100);
        Prenotazione prenotazione3 = new Prenotazione(LocalDate.of(2023,5,19),LocalDate.of(2023,5,22),abitazione1,andrea,100);
        Prenotazione prenotazione2 = new Prenotazione(LocalDate.of(2023,5,19),LocalDate.of(2023,5,26),abitazione2,marco,120);

        Set<Prenotazione> setPrenotazioni1 = new HashSet<>();
        Set<Prenotazione> setPrenotazioni2 = new HashSet<>();
        setPrenotazioni1.add(prenotazione1);
        setPrenotazioni2.add(prenotazione2);


        fakeBooking.addMapAbitazionePrenotazioni(abitazione1,setPrenotazioni1);
        fakeBooking.addMapAbitazionePrenotazioni(abitazione2,setPrenotazioni1);

        aleHost.addPrenotazione(prenotazione1);
        aleHost.addPrenotazione(prenotazione3);
        andreHost.addPrenotazione(prenotazione2);
        System.out.println(fakeBooking.getLastPrenotazioneByIdUtente(alessio.getUserId()));
        System.out.println(" ");
        for (Abitazione abitazione : aleHost.getAbitazioni()) {
            System.out.println(abitazione);
        }

        System.out.println(fakeBooking.getMostGettonataAbitazioneUltimoMese());

        System.out.println("1");


        System.out.println("lalala");
        for (Prenotazione prenotazione : fakeBooking.getPrenotazioniLastMese(aleHost)) {
            System.out.println(prenotazione);
        }
        System.out.println("most prenotazioni host");

        System.out.println(fakeBooking.getMostPrenotazioniHostLastMese());

        System.out.println(fakeBooking.getPrenotazioniLastMese(aleHost).size());

        System.out.println("lalala");

        for (Prenotazione prenotazione : aleHost.getPrenotazioni()) {
     //       System.out.println(prenotazione);
        }

        for (Host superHost : fakeBooking.getSuperHosts()) {
            System.out.println(superHost);
        }

        System.out.println("lalala2222");

        for (User user : fakeBooking.fiveMostDaysPrenotazioniLastMese()) {
            System.out.println(user);
        }
        System.out.println("medium number");

        System.out.println(fakeBooking.mediumNumberPostiLettoByAllAbitazioni());


        System.out.println("dateee");
        System.out.println(Period.between(prenotazione1.getDataInizio(), prenotazione1.getDataFine()).getDays());
        System.out.println("daysprenotazione");
        System.out.println(fakeBooking.getDaysOfPrenotazioniLastMOntByUser(alessio));


        System.out.println("lalala2222");

        for (User user : fakeBooking.fiveMostDaysPrenotazioniLastMese()) {
            System.out.println(user);

        }



    }
}
