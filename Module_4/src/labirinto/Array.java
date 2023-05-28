package labirinto;

import java.util.Arrays;

public class Array {
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
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println(myIntArray[i]);
        }

        myIntArray = addNewElement(myIntArray, 42);
            // usando il myintarray nel metodo rialloco il puntatore all array creato nel metodo e dealloco il myintarray grazie al garbage collector

         System.out.println(Arrays.toString(myIntArray));

    }


    public static int[] addNewElement(int[] oldArray, int element2add){

        int[] myNewIntArray = new int[oldArray.length+1];

            // copio il contenuto del vecchio array nel nuov

        for (int i = 0; i<oldArray.length; i++){
            myNewIntArray[i] = oldArray[i];
        }

        myNewIntArray[myNewIntArray.length-1] = element2add;

        return myNewIntArray;
    }
}