package Module_1;

import java.util.Scanner;



/* Scrivere un programma Java che permetta all’utente di inserire due numeri interi e, successivamente, stampi a video il risultato di addizione, sottrazione, moltiplicazione e divisione
tra i due numeri.
Suggerimento: inserite il codice della vostra soluzione all’interno del metodo computeValues del
codice che trovate a questo indirizzo:

 */

public class Esercizio1 {

    // si puo scrivere solo main per riempire
    public static void main(String[] args) {

        // sout per scrivere su schermo
        System.out.println("Benvenuto! Inserisci due numberi interi:");
        //oggetto scanner per
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int somma = number1 + number2;
        System.out.println("La somma dei due numeri e':" + somma);
        // System.out.println("La somma dei due numeri e':" + (number2 + number1));
        int sottrazione = number1 - number2;
        System.out.println("La sottrazione tra i due numeri e':" + sottrazione);
        int moltiplicazione = number1 * number2;
        System.out.println("La moltiplicazione tra i due numeri e':" + moltiplicazione);
        double dividendo = number1;
        double divisore = number2;
        while (divisore == 0){
            System.out.println("Non puoi dividere per 0!");
            divisore = input.nextDouble();
        }
            System.out.println("Il risultato della divisione e':" + (dividendo / divisore));

    }
}
