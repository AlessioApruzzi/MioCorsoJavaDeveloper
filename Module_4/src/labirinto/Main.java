package labirinto;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Dichiarazione di un array
        int[] myIntArray = new int[10];

        // Se stampo cosi esce indirizzo di memoria
        System.out.println(myIntArray);
        System.out.println(Arrays.toString(myIntArray));

        // con cmd su metodo si apre il metodo

        // Iterare un array
        System.out.println("*** STAMPA ARRAY CON LOOP FOR ***");
        for (int i = 0; i<myIntArray.length; i++){
            System.out.println(myIntArray[i]);
        }
    }
}