package Module_2;

import java.util.Scanner;


//calcolo quadrato di un numero
public class Esercizio1 {
    public static void main(String[] args) {
        System.out.print("Inserisci numero di cui calcolare quadrato: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int quadrato = 0;

        for(int i = 1; i < (2*number); i=i+2){
            quadrato = quadrato + i;
        }
        System.out.println("Il quadrato e': " + quadrato);
    }
}
