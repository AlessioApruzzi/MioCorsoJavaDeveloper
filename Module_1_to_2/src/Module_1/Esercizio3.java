package Module_1;/*
Data una stringa, stampare la stessa stringa invertendone il contenuto a partire dal primo spazio, ad esempio data la stringa «come stai» stampare a video «stai come». Potete dare per assunto
che la stringa conterrà sempre un solo spazio.
Suggerimento: utilizzate i metodi della classe String
 */

import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {


        //cercare le classi su google scrivendo 'classe' class java

        System.out.println("Inserisci una stringa con due parole e la inverto");
        // creo lo scanner per chiedere la stringa
        Scanner input = new Scanner(System.in);
        // prendo la stringa
        String stringa = input.nextLine();
        // la suddivido in base allo spazio con split
        String[] stringasplit = stringa.split(" ");
        // costruisco la stringa invertita grazie all'arrai creato
        String invertita = stringasplit[1] + " " + stringasplit[0];
        System.out.println("La stringa invertita e':" + invertita);

        /*String myName = "Alessio Apruzzi";
        String[] myNameSplitted = myName.split(" ");
        System.out.println(Arrays.toString(myNameSplitted));
         */

    }
}
