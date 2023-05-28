package Module_1;/*
Scrivere un metodo che, dato un char a e una stringa b,
stampa il numero di occorrenze di a in b
 */

//dobbiamo creare una funzione perche e' richiesto un metodo
// metoto = funzione definita all'interno di una classe


public class Esercizio6 {

    // siccome il metodo deve stampare non c'e' ritorno quindi e' void

    public static void contaOccorrenze(char a, String b) {

        int result = 0;
        for (int i = 0; i < b.length(); i++){
            char myChar = b.charAt(i);
            if (myChar == a) {
                result++;
            }
        }
        System.out.println("Il numero delle occorrenze di " + a + " in " + b + " e': " + result);
    }

    public static void main(String[] args) {

        contaOccorrenze('s',"supercalifragilissss");

    }
}

