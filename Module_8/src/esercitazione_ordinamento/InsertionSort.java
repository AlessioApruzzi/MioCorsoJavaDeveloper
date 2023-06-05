package esercitazione_ordinamento;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.nanoTime;


public class InsertionSort {

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

        System.out.println("\n**** Test Insertion sort randomico ****");
        System.out.print(" Array di 100: ");

        long inizio = nanoTime();
        insertionSort(arrayCento);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayCento));

        System.out.print(" Lista di 100: ");

        inizio = nanoTime();
        insertionSort(listaCento);
        System.out.println(nanoTime() - inizio + " nanosecondi");

        System.out.print(" Array di 1000: ");

        inizio= nanoTime();
        insertionSort(arrayMille);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayMille));

        System.out.print(" Lista di 1000: ");

        inizio = nanoTime();
        insertionSort(listaMille);
        System.out.println(nanoTime() - inizio + " nanosecondi");

        System.out.print(" Array di 100000: ");

        inizio= nanoTime();
        insertionSort(arrayCentoMila);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayCentoMila));

        System.out.print(" Lista di 100000: ");

        inizio = nanoTime();
        insertionSort(listaCentoMila);
        System.out.println(nanoTime() - inizio + " nanosecondi");


        /*
        **** Test Insertion sort randomico ****
        Array di 100: 50459 nanosecondi
        Array di 1000: 3291500 nanosecondi
        Array di 100000: 603743917 nanosecondi
         */


        System.out.println("\n**** Test Insertion sort ordinato ****");
        System.out.print(" Array di 100: ");

        inizio = nanoTime();
        insertionSort(arrayCento);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayCento));

        System.out.print(" Lista di 100: ");

        inizio = nanoTime();
        insertionSort(listaCento);
        System.out.println(nanoTime() - inizio + " nanosecondi");

        System.out.print(" Array di 1000: ");

        inizio= nanoTime();
        insertionSort(arrayMille);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayMille));

        System.out.print(" Lista di 1000: ");

        inizio = nanoTime();
        insertionSort(listaMille);
        System.out.println(nanoTime() - inizio + " nanosecondi");

        System.out.print(" Array di 100000: ");

        inizio= nanoTime();
        insertionSort(arrayCentoMila);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayCentoMila));

        System.out.print(" Lista di 100000: ");

        inizio = nanoTime();
        insertionSort(listaCentoMila);
        System.out.println(nanoTime() - inizio + " nanosecondi");


        /*
        **** Test Insertion sort ordinato ****
        Array di 100: 3083 nanosecondi
        Array di 1000: 1500 nanosecondi
        Array di 100000: 122875 nanosecondi
        */


        System.out.println("\n**** Test Insertion sort contrordinato  ****");
        System.out.print(" Array di 100: ");

        reverse(arrayCento);
        inizio = nanoTime();
        insertionSort(arrayCento);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayCento));

        System.out.print(" Lista di 100: ");

        reverse(listaCento);
        inizio = nanoTime();
        insertionSort(listaCento);
        System.out.println(nanoTime() - inizio + " nanosecondi");

        System.out.print(" Array di 1000: ");

        reverse(arrayMille);
        inizio= nanoTime();
        insertionSort(arrayMille);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayMille));

        System.out.print(" Lista di 1000: ");

        reverse(listaMille);
        inizio = nanoTime();
        insertionSort(listaMille);
        System.out.println(nanoTime() - inizio + " nanosecondi");

        System.out.print(" Array di 100000: ");

        reverse(arrayCentoMila);
        inizio= nanoTime();
        insertionSort(arrayCentoMila);
        System.out.println(nanoTime() - inizio + " nanosecondi");
        //System.out.println(Arrays.toString(arrayCentoMila));

        System.out.print(" Lista di 100000: ");

        reverse(listaCentoMila);
        inizio = nanoTime();
        insertionSort(listaCentoMila);
        System.out.println(nanoTime() - inizio + " nanosecondi");


        /*
        **** Test Insertion sort contrordinato  ****
        Array di 100: 2750 nanosecondi
        Array di 1000: 102583 nanosecondi
        Array di 100000: 967898917 nanosecondi
        */
    }


    public static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j+1] = temp;
        }
    }
    public static void insertionSort(List<Integer> lista) {
        for(int i = 1; i < lista.toArray().length; i++) {
            int temp = lista.get(i);
            int j = i - 1;
            while (j >= 0 && lista.get(j) > temp) {
              //  lista.add(j+1,lista.get(j));
                Collections.swap(lista,j+1,j);
                j = j - 1;
            }
            //lista.add(j+1,temp);
        }
    }

    public static void reverse(int[] array){
        int temp;
        for (int i = 0; i < array.length/2; i++) {
            temp= array[array.length-i-1];
            array[array.length-i-1]= array[i];
            array[i]= temp;
        }
    }

    public static void reverse(List<Integer> lista){
        Collections.reverse(lista);
    }


}
