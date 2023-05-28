package Module_1;

import java.util.Scanner;

public class Esercizio2 {

    /* Dato un numero, stampare true se il numero è pari, false altrimenti.
     */

    public static void main(String[] args) {

        System.out.println("Scrivi un numero intero e ti dico se sia pari o dispari!");
        Scanner input = new Scanner(System.in);
        int next = input.nextInt();
        //double next = input.nextDouble();
        if (next%2 == 0){
            System.out.println("Il numero e' pari");
        }
        else {
            System.out.println("Il numero e' dispari");
        }
    }
}
