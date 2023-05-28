package Module_2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        System.out.println("Inserire una stringa:");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int vocali = 0;
        int spazi = 0;
        for (int i = 0; i< a.length(); i++){
            if(a.charAt(i)=='a' || a.charAt(i)=='e' ||a.charAt(i)=='i' ||a.charAt(i)=='o' ||a.charAt(i)=='u'){
                    vocali++;
                }
            if(a.charAt(i)==' '){
                spazi++;
            }
        }
        System.out.println("Le vocali contenute nella stringa sono: " + vocali);
        System.out.println("Le consonanti contenute nella stringa sono: " + (a.length()-vocali-spazi));

    }
}
