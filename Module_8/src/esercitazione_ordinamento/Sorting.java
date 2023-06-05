package esercitazione_ordinamento;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.lang.System.in;
import static java.lang.System.nanoTime;

public class Sorting {

    public static void main(String[] args) {

        int[] arrayCento = new int[100];
        int[] arrayMille = new int[1000];
        int[] arrayCentoMila = new int[100000];

        List<Integer> listaCento = new ArrayList<>(100);
        List<Integer> listaMille = new ArrayList<>(1000);
        List<Integer> listaCentoMila = new ArrayList<>(100000);

        int[] arrayCentoTemp= new int[100];
        int[] arrayMilleTemp= new int[1000];
        int[] arrayCentoMilaTemp= new int[100000];
        List<Integer> listaCentoTemp = new ArrayList<>(100);
        List<Integer> listaMilleTemp = new ArrayList<>(1000);
      //  List<Integer> listaCentoMilaTemp = new ArrayList<>(100000);

        //Creazione di un array e una lista di 100 interi randomici
        for (int i = 0; i < arrayCento.length; i++) {
            arrayCento[i] = (int) (Math.random() * 100);
            arrayCentoTemp[i]=arrayCento[i];
            listaCento.add((int) (Math.random() * 100));
            listaCentoTemp.add(listaCento.get(i));
        }

        //Creazione di un array e una lista di 1000 interi randomici
        for (int i = 0; i < arrayMille.length; i++) {
            arrayMille[i] = (int) (Math.random() * 100);
            arrayMilleTemp[i]=arrayMille[i];

            listaMille.add((int) (Math.random() * 100));
            listaMilleTemp.add(listaMille.get(i));

        }

        //Creazione di un array e una lista di 1000000 interi randomici
        for (int i = 0; i < arrayCentoMila.length; i++) {
            arrayCentoMila[i] = (int) (Math.random() * 100);
            arrayCentoMilaTemp[i]=arrayCentoMila[i];

            listaCentoMila.add((int) (Math.random() * 100));
          //  listaCentoMilaTemp.add(listaCentoTemp.get(i));

        }



        System.out.println("\n**** Random order sorting ****");
        System.out.println("** 100 numbers **    ");
        System.out.println("* Array *");

        long inizio = nanoTime();
        bubbleSort(arrayCento);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");
        //  System.out.println(Arrays.toString(arrayCento));


        inizio = nanoTime();
        insertionSort(arrayCentoTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


        System.out.println("* List *");

        inizio = nanoTime();
        bubbleSort(listaCento);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");

        inizio = nanoTime();
        insertionSort(listaCentoTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


        System.out.println("** 1000 numbers **");
        System.out.println("* Array *");


        inizio= nanoTime();
        bubbleSort(arrayMille);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");
        //System.out.println(Arrays.toString(arrayMille));

        inizio= nanoTime();
        insertionSort(arrayMilleTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


        System.out.println("* List *");

        inizio = nanoTime();
        bubbleSort(listaMille);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");

        inizio = nanoTime();
        insertionSort(listaMilleTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");



        System.out.println("** 100000 numbers **");
        System.out.println("* Array *");


        inizio= nanoTime();
        bubbleSort(arrayCentoMila);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");
        //System.out.println(Arrays.toString(arrayMille));

        inizio= nanoTime();
        insertionSort(arrayCentoMilaTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


        //System.out.println("* List *");

        //inizio = nanoTime();
        //bubbleSort(listaCentoMila);
        //System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");

        //inizio = nanoTime();
        //insertionSort(listaCentoMilaTemp);
        //System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


        /*
         **** Test Bubble sort randomico ****
         Array di 100: 183667 nanosecondi
         Lista di 100: 2841583 nanosecondi
         Array di 1000: 3031500 nanosecondi
         Lista di 1000: 272736250 nanosecondi
         Array di 100000: 11788540791 nanosecondi
        */


        System.out.println("\n**** Sorted order ****");
        System.out.println("** 100 numbers **    ");
        System.out.println("* Array *");

        inizio = nanoTime();
        bubbleSort(arrayCento);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");
        //  System.out.println(Arrays.toString(arrayCento));


        inizio = nanoTime();
        insertionSort(arrayCentoTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


        System.out.println("* List *");

        inizio = nanoTime();
        bubbleSort(listaCento);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");

        inizio = nanoTime();
        insertionSort(listaCentoTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


        System.out.println("** 1000 numbers **");
        System.out.println("* Array *");


        inizio= nanoTime();
        bubbleSort(arrayMille);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");
        //System.out.println(Arrays.toString(arrayMille));

        inizio= nanoTime();
        insertionSort(arrayMilleTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


        System.out.println("* List *");

        inizio = nanoTime();
        bubbleSort(listaMille);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");

        inizio = nanoTime();
        insertionSort(listaMilleTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");



        System.out.println("** 100000 numbers **");
        System.out.println("* Array *");


        inizio= nanoTime();
        bubbleSort(arrayCentoMila);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");
        //System.out.println(Arrays.toString(arrayMille));

        inizio= nanoTime();
        insertionSort(arrayCentoMilaTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


        //System.out.println("* List *");

        //inizio = nanoTime();
        //bubbleSort(listaCentoMila);
        //System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");

        //inizio = nanoTime();
        //insertionSort(listaCentoMilaTemp);
        //System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");



        /*
        **** Test Bubble sort ordinato ****
        Array di 1003125 nanosecondi
        Lista di 100: 90583 nanosecondi
        Array di 1000: 203833 nanosecondi
        Lista di 1000: 160701000 nanosecondi
        Array di 100000: 1700804417 nanosecondi
         */

        System.out.println("\n**** Counter order ****");
        System.out.println("** 100 numbers **    ");
        System.out.println("* Array *");

        reverse(arrayCento);
        reverse(arrayCentoTemp);
        inizio = nanoTime();
        bubbleSort(arrayCento);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");
        //  System.out.println(Arrays.toString(arrayCento));


        inizio = nanoTime();
        insertionSort(arrayCentoTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


        System.out.println("* List *");

        reverse(listaCento);
        reverse(listaCentoTemp);
        inizio = nanoTime();
        bubbleSort(listaCento);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");

        inizio = nanoTime();
        insertionSort(listaCentoTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


        System.out.println("** 1000 numbers **");
        System.out.println("* Array *");

        reverse(arrayMille);
        reverse(arrayMilleTemp);
        inizio= nanoTime();
        bubbleSort(arrayMille);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");
        //System.out.println(Arrays.toString(arrayMille));

        inizio= nanoTime();
        insertionSort(arrayMilleTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


        System.out.println("* List *");

        reverse(listaMille);
        reverse(listaMilleTemp);
        inizio = nanoTime();
        bubbleSort(listaMille);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");

        inizio = nanoTime();
        insertionSort(listaMilleTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


        System.out.println("** 100000 numbers **");
        System.out.println("* Array *");

        reverse(arrayCentoMila);
        reverse(arrayCentoMilaTemp);
        inizio= nanoTime();
        bubbleSort(arrayCentoMila);
        System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");
        //System.out.println(Arrays.toString(arrayMille));

        inizio= nanoTime();
        insertionSort(arrayCentoMilaTemp);
        System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


        //System.out.println("* List *");

        //inizio = nanoTime();
        //bubbleSort(listaCentoMila);
        //System.out.print("Bubble sort: " + (nanoTime() - inizio) + " nanosecondi.  ");

        //inizio = nanoTime();
        //insertionSort(listaCentoMilaTemp);
        //System.out.println("Insertion sort: " + (nanoTime() - inizio) + " nanosecondi");


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
        long counter= 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length -1 - i; j++) {
                if (array[j]>array[j+1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                    counter++;
                }
            }
        }
         System.out.print(counter + " Iterations for ");
    }

    public static void bubbleSort(List<Integer> lista) {
        int temp;
        long counter= 0;

        for (int i = 0; i < lista.toArray().length-1; i++) {
            for (int j = 0; j < lista.toArray().length -1 - i; j++) {
                if (lista.get(j)>lista.get(j+1)) {
                    Collections.swap(lista,j,j+1);
                    counter++;
                }
            }
        }
        System.out.print(counter + " Iterations for ");

    }

    public static void insertionSort(int[] array) {
        long counter= 0;
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
                counter++;
            }
            array[j+1] = temp;
        }
        System.out.print(counter + " Iterations for ");
    }
    public static void insertionSort(List<Integer> lista) {
        long counter= 0;
        for(int i = 1; i < lista.toArray().length; i++) {
            int temp = lista.get(i);
            int j = i - 1;
            while (j >= 0 && lista.get(j) > temp) {
                //  lista.add(j+1,lista.get(j));
                Collections.swap(lista,j+1,j);
                j = j - 1;
                counter++;
            }
        }
        System.out.print(counter + " Iterations for ");
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
