package Module_1;

import java.util.Scanner;

/*
Date tre stringhe a, b e c in input, stampare l’intero corrispondente al numero di stringhe uguali tra loro (ignorando maiuscole e minuscole). Esempio: se a, b e c sono uguali tra loro stamperà
«3», se invece a e b sono uguali ma c è diversa stamperà 2 etc.
 */
public class Esercizio5 {
    public static void main(String[] args) {

        System.out.println("Inserisci 3 stringhe:");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        String c = input.nextLine();
        int count = 0;
        if(a.equalsIgnoreCase(b)) {
            count += 2;
            if (a.equalsIgnoreCase(c)) {
                count++;
            }
        }
        else{
            if(c.equalsIgnoreCase(a)){
                count += 2;
            }
            else if(c.equalsIgnoreCase(b)){
                count += 2;
            }
        }
        System.out.println(count);

    }
}
