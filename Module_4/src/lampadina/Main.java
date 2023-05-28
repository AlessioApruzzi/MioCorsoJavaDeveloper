package lampadina;/* # Lampadina :bulb:

        ## Esercizio 1
        Progettare una classe Lampadina, che modella una lampadina classica
        La lampadina può essere accesa, spenta o rotta
        La classe epone due metodi
        * ottenere lo stato corrente della lampadina
        * azionare la lampadina, quindi un metodo che cambia lo stato della lampadina da accesa a spenta o
        da spenta ad accesa, oppure che imposta lo stato a "rotta" se si è raggiunto il limite massimo di azionamenti
        per quella lampadina (il numero massimo di azionamenti viene definito in fase di costruzione dell'istanza)

        La classe deve contenere
        * i campi necessari a descriverne lo stato e il numero di azionamenti
        * un costruttore
        * i metodi indicati sopra

        Scrivere una classe di test che verifichi il funzionamento delle classi


        ## Esercizio 2
        Progettare una classe Interruttore per la lampadina dell'esercizio 1

        * Ogni interruttore regola il comportamento di una lampadina
        * Definire campi e metodi necessari al funzionamento dell'interruttore
        * Creare una classe di test che, dopo aver istanziato due interruttori collegati alla stessa lampadina, permetta all'utente di utilizzare il primo o il secondo interruttore interagendo tramite la console, finchè non decide di interrompere l'interazione


        ## Esercizio 3
        Modificare la classe Lampadina facendo in modo che tutte le lampadine condividano l'informazione relativa alla presenza di corrente all'interno di un ipotetico impianto. Possiamo immaginare che tutte le lampadine siano collegate allo stesso impianto di corrente

        Le lampadine devono comportarsi in modo coerente rispetto alla presenza o assenza di corrente all'interno dell'impianto

        Quando non c'è corrente una lampadina può essere solamente negli stati "rotto" o "spento"

        Scrivere una classe di test che verifichi il comportamento delle lampadine rispetto alla presenza di corrente nell'impianto


 */

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Lampadina lamp1 = new Lampadina();

        Lampadina[] lampadina = new Lampadina[100];
        for (int i = 0; i < 100; i++) {
            lampadina[i] = new Lampadina();
        }

        String decisione = null;
        while (!Objects.equals(decisione, "3")) {
            System.out.print("\nLo stato attuale della corrente e': ");
            lampadina[0].isCourrent();
            System.out.print("Lo stato attuale della lampadina e': ");
            lampadina[0].lampSt();
            System.out.println("\nPremere: \n 1)Utilizzare l'interruttore della corrente \n 2)Utilizzare l'interruttore della lampadina \n 3)Uscire dalla configurazione");
            Scanner input = new Scanner(System.in);
            decisione = input.nextLine();
            if (Objects.equals(decisione, "1")) {
                lampadina[0].courrentSwitch();
            } else if (Objects.equals(decisione, "2")) {
                lampadina[0].lampActuator();
            }
        }

    }

}