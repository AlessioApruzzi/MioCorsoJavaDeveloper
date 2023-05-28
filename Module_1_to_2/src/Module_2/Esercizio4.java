package Module_2;/*
1) Un numero primo è un numero che è divisibile solo per se stesso e 1.
Scrivete un programma che dato un numero N, scopre tutti i numeri primi
fino a N.
Provate a ottimizzare il programma per renderlo il più veloce possibile,
ci sono diversi trick che potete fare per velocizzarlo!
 */

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {

        System.out.println("Inserire un numero: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean verify = true;
        for (int i = 0; i < number; i++) {
            for (int k = 2; k < i; k++) {
                if (i%k == 0){
                    verify= false;
                }
            }
            if (verify == true){
                System.out.println("il numero " + i + " e' primo");
            }
            verify = true;
        }

    }
}
