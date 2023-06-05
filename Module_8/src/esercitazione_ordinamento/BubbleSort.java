package esercitazione_ordinamento;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.lang.System.nanoTime;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arrayCento = new int[100];
        int[] arrayMille = new int[1000];
        int[] arrayCentoMila = new int[100000];

        List<Integer> listaCento = new ArrayList<>(100);
        List<Integer> listaMille = new ArrayList<>(1000);
        List<Integer> listaCentoMila = new ArrayList<>(100000);

        //Creazione di un array e una lista di 100 interi randomici
        for (int i = 0; i < arrayCento.length; i++) {
            arrayCento[i] = (int) (Math.random() * 100);
            listaCento.add((int) (Math.random() * 100));
        }

        //Creazione di un array e una lista di 1000 interi randomici
        for (int i = 0; i < arrayMille.length; i++) {
            arrayMille[i] = (int) (Math.random() * 100);
            listaMille.add((int) (Math.random() * 100));
        }

        //Creazione di un array e una lista di 1000000 interi randomici
        for (int i = 0; i < arrayCentoMila.length; i++) {
            arrayCentoMila[i] = (int) (Math.random() * 100);
            listaCentoMila.add((int) (Math.random() * 100));
        }

        System.out.println("\n**** Test Bubble sort randomico ****");
        System.out.print(" Array di 100: ");

        long inizio = nanoTime();
        bubbleSort(arrayCento);
        System.out.println(nanoTime() - inizio + " nanosecondi");
      //  System.out.println(Arrays.toString(arrayCento));

        System.out.print(" Lista di 100: ");

        inizio = nanoTime();
        bubbleSort(listaCento);
        System.out.println(nanoTime() - inizio + " nanosecondi");


        System.out.print(" Array di 1000: ");

        inizio= nanoTime();
        bubbleSort(arrayMille);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayMille));

        System.out.print(" Lista di 1000: ");

        inizio = nanoTime();
        bubbleSort(listaMille);
        System.out.println(nanoTime() - inizio + " nanosecondi");

        System.out.print(" Array di 100000: ");

        inizio= nanoTime();
        bubbleSort(arrayCentoMila);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayCentoMila));

       /* System.out.print(" Lista di 100000: ");

        inizio = nanoTime();
        bubbleSortLista(listaCentoMila);
        System.out.println(nanoTime() - inizio + " nanosecondi");

        */




        /*
         **** Test Bubble sort randomico ****
         Array di 100: 183667 nanosecondi
         Lista di 100: 2841583 nanosecondi
         Array di 1000: 3031500 nanosecondi
         Lista di 1000: 272736250 nanosecondi
         Array di 100000: 11788540791 nanosecondi
        */


        System.out.println("\n**** Test Bubble sort ordinato ****");
        System.out.print(" Array di 100");

        inizio = nanoTime();
        bubbleSort(arrayCento);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayCento));

        System.out.print(" Lista di 100: ");

        inizio = nanoTime();
        bubbleSort(listaCento);
        System.out.println(nanoTime() - inizio + " nanosecondi");


        System.out.print(" Array di 1000: ");

        inizio= nanoTime();
        bubbleSort(arrayMille);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayMille));

        System.out.print(" Lista di 1000: ");

        inizio = nanoTime();
        bubbleSort(listaMille);
        System.out.println(nanoTime() - inizio + " nanosecondi");

        System.out.print(" Array di 100000: ");

        inizio= nanoTime();
        bubbleSort(arrayCentoMila);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayCentoMila));

        /*
        System.out.print(" Lista di 100000: ");

        inizio = nanoTime();
        bubbleSortLista(listaCentoMila);
        System.out.println(nanoTime() - inizio + " nanosecondi");

         */


        /*
        **** Test Bubble sort ordinato ****
        Array di 1003125 nanosecondi
        Lista di 100: 90583 nanosecondi
        Array di 1000: 203833 nanosecondi
        Lista di 1000: 160701000 nanosecondi
        Array di 100000: 1700804417 nanosecondi
         */

        System.out.println("\n**** Test Bubble sort contrordinato  ****");
        System.out.print(" Array di 100: ");

        reverse(arrayCento);
        inizio = nanoTime();
        bubbleSort(arrayCento);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayCento));

        System.out.print(" Lista di 100: ");

        reverse(listaCento);
        inizio = nanoTime();
        bubbleSort(listaCento);
        System.out.println(nanoTime() - inizio + " nanosecondi");

        System.out.print(" Array di 1000: ");

        reverse(arrayMille);
        inizio= nanoTime();
        bubbleSort(arrayMille);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayMille));

        System.out.print(" Lista di 1000: ");

        reverse(listaMille);
        inizio = nanoTime();
        bubbleSort(listaMille);
        System.out.println(nanoTime() - inizio + " nanosecondi");

        System.out.print(" Array di 100000: ");

        reverse(arrayCentoMila);
        inizio= nanoTime();
        bubbleSort(arrayCentoMila);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayCentoMila));

        /*

        System.out.print(" Lista di 100000: ");

        reverseList(listaCentoMila);
        inizio = nanoTime();
        bubbleSortLista(listaCentoMila);
        System.out.println(nanoTime() - inizio + " nanosecondi");

         */


        /*
        **** Test Bubble sort contrordinato  ****
        Array di 100: 8959 nanosecondi
        Lista di 100: 105833 nanosecondi
        Array di 1000: 928750 nanosecondi
        Lista di 1000: 95792250 nanosecondi
        Array di 100000: 9934019125 nanosecondi
        */


    }


    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length -1 - i; j++) {
                if (array[j]>array[j+1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void bubbleSort(List<Integer> lista) {
        int temp;
        for (int i = 0; i < lista.toArray().length-1; i++) {
            for (int j = 0; j < lista.toArray().length -1 - i; j++) {
                if (lista.get(j)>lista.get(j+1)) {
                    Collections.swap(lista,j,j+1);
                }
            }
        }
    }
    public static void reverse(List<Integer> lista){
        Collections.reverse(lista);
    }



    public static void reverse(int[] array){
        int temp;
        for (int i = 0; i < (array.length/2); i++) {
            temp= array[array.length-i-1];
            array[array.length-i-1]= array[i];
            array[i]= temp;
        }
    }



}