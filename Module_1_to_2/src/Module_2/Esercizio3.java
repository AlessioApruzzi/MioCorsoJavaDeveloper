package Module_2;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {

        System.out.println("Inserire il numero di secondi: ");
        Scanner input = new Scanner(System.in);
        int sec = input.nextInt();
        int giorni = 0;
        int ore = 0;
        int minuti = 0;
        int resto = 0;
        giorni = sec/86400;
        ore = (sec%86400)/3600;
        minuti = (sec%86400)%3600/60;
        sec = (sec%86400)%3600%60;
        System.out.println("Il numero di giorni, ore, minuti e secondi e': " + giorni + ":" + ore + ":" + minuti + ":" + sec);

    }
}
