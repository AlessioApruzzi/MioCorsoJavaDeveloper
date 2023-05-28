package Module_1;/*
Date tre stringhe a, b e c in input, stampare c dopo aver rimpiazzato,
all’interno di c, ogni occorrenza compresa tra due spazi di a con b. Ad esempio,
date in input le stringhe «a», «b», «a abc d», stampare a video «a bbc d».
Potete dare per assunto che la stringa c conterrà sempre e
solo due spazi.
 */

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {

        System.out.println("Inserisci tre stringhe:");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        String c = input.nextLine();
        String[] splitted_c = c.split(" ");
        String replaced = splitted_c[1].replace(a,b);
        c = splitted_c[0] + " " + replaced + " " + splitted_c[2];
        System.out.println("La stringa modificata e' " + c);
    }
}
