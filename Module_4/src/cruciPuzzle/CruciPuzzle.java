package cruciPuzzle;/*
# CruciPuzzle

![Esempio](./CruciPuzzle.png)


* Scrivete una funzione che prende in input una matrice di caratteri e una parola e restituisce
true se la parola si trova all’interno della matrice sia verticalmente che orizzontalmente, false altrimenti.
* Fatto questo fate in modo che il programma controlli anche se la parola è scritta al contrario
* Bonus stage: controllate anche se la parola è presente in diagonale!



## :wink: Suggerimenti:
* Scrivetevi una funzione che stampa a schermo la matrice
* Quando trovate una parola stampatevi gli indici della prima lettera

 */

public class CruciPuzzle {
    public static void main(String[] args) {

        System.out.println("Inserire una matrice di caratteri e una parola");
        char[][] cruciverba = {{'h', 'd', 'g', 'u', 'p', 'y', 's', 'p', 'a', 'o'},
                {'t', 's', 'a', 'k', 'o', 'y', 'o', 'l', 'p', 's'},
                {'r', 'c', 'm', 'c', 'n', 'r', 'i', 'a', 'a', 'b'},
                {'i', 'o', 'b', 'a', 'i', 's', 'c', 't', 'l', 'a'},
                {'g', 'r', 'e', 'l', 'f', 'a', 'c', 'e', 'o', 'l'},
                {'l', 'f', 'r', 'a', 'l', 'l', 'u', 's', 'i', 'e'},
                {'i', 'a', 'e', 'm', 'e', 'm', 'l', 's', 'l', 'n'},
                {'a', 'n', 't', 'a', 'd', 'o', 'c', 'a', 'g', 'a'},
                {'j', 'o', 't', 'r', 'b', 'n', 'd', 'g', 'o', 'd'},
                {'l', 'y', 'o', 'o', 'u', 'e', 's', 'm', 's', 'm'}};
        String parola = "luccio";

        for (int i = 0; i < cruciverba.length; i++) {
            for (int k = 0; k < cruciverba[0].length; k++) {
                System.out.print(cruciverba[i][k] + " ");
            }
            System.out.print("\n");
        }

        System.out.println(parola);
        checkWord(cruciverba, parola);

    }


    public static void checkWord(char[][] cruciverba, String parola) {


        boolean[] verify5 = new boolean[parola.length()];
        boolean[] verify6 = new boolean[parola.length()];
        boolean[] verify7 = new boolean[parola.length()];
        boolean[] verify8 = new boolean[parola.length()];


        // scorro tutte le lettere della matrice
        for (int j = 0; j < cruciverba.length; j++) {
            for (int k = 0; k < cruciverba[0].length; k++) {

                // azzero i vettori booleani


                for (int i = 0; i < parola.length(); i++) {
                    verify5[i] = false;
                    verify6[i] = false;
                    verify7[i] = false;
                    verify8[i] = false;
                }


                // per ogni indice cerco in tutte le direzioni e se c'e' un riscontro metto true in verify
                for (int v = 0; v < parola.length(); v++) {
                    char test = parola.charAt(v);
                    // char r = cruciverba[j + v][k];
                    if (j < (cruciverba.length - parola.length()) && cruciverba[j + v][k] == test) {
                        verify5[v] = true;
                    }
                    if (k < (cruciverba[0].length - parola.length()) && cruciverba[j][k + v] == test) {
                        verify6[v] = true;
                    }
                    if (j > (cruciverba.length - (cruciverba.length - parola.length()) -1 ) && cruciverba[j - v - 1][k] == test) {
                        verify7[v] = true;
                    }
                    if (k > (cruciverba[0].length - (cruciverba[0].length - parola.length()) -1 ) && (cruciverba[j][k - v - 1] == test)) {
                        verify8[v] = true;
                    }

                }


                int counter1 = 0;
                int counter2 = 0;
                int counter3 = 0;
                int counter4 = 0;
                for (int i = 0; i < parola.length(); i++) {
                    if (verify5[i]) {
                        counter1++;
                    }
                    if (verify6[i]) {
                        counter2++;
                    }
                    if (verify7[i]) {
                        counter3++;
                    }
                    if (verify8[i]) {
                        counter4++;
                    }
                }


                int d = parola.length();

                if (counter1 == d) {
                    System.out.println(parola + " Si trova all'indice: " + j + " , " + k);
                }
                if (counter2 == d) {
                    System.out.println(parola + " Si trova all'indice: " + j + " , " + k);
                }
                if (counter3 == d) {
                    System.out.println(parola + " Si trova all'indice: " + j + " , " + k);
                }
                if (counter4 == d) {
                    System.out.println(parola + " Si trova all'indice: " + j + " , " + k);
                }
            }
        }
    }
}


