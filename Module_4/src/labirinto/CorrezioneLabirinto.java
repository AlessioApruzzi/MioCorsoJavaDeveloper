package labirinto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CorrezioneLabirinto {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        // TODO il metodo deve prendere righe e colonne da fuori
        char[][] labirinto = generaLabirintoCasuale(5, 5);

        System.out.println("*** STAMPA LABIRINTO ***");
        printaMatrice(labirinto);
    }

    public static void printaMatrice(char[][] labirinto) {
        System.out.println(Arrays.deepToString(labirinto));
    }

    public static boolean muoviGiocatore(char[][] labirinto, char mossa) {
        return false; //temporaneo
    }

    public static boolean checkVittoriaGiocatore(char[][] labirinto) {
        return false; //temp
    }

   // public static int[] trovaGiocatore(char[][] labirinto) {


  //  }

    public static char[][] generaLabirintoCasuale(int righe, int colonne) {
        Random generatoreCasuale = new Random();
        char[][] labirinto = new char[righe][colonne];

        for (int i = 0; i < labirinto.length; i++) {
            for (int j = 0; j < labirinto[i].length; j++) {
                labirinto[i][j] = '-';
            }
        }

        // Genero casualmente lar ifa su cui voglio posicoinare giocatore ed uscita
        int rigaGiocatore = generatoreCasuale.nextInt(righe);
        int rigaUscita = generatoreCasuale.nextInt(righe);


        // Variante: genero prima i muri e poi metto P ed E (nel caso sovrascrivo)
        labirinto[rigaGiocatore][0] = 'P';
        labirinto[rigaUscita][colonne - 1] = 'E';

        for (int i = 0; i < labirinto.length; i++) {
            for (int j = 0; j < labirinto[i].length; j++) {

                //se ho P oppure E, continua con il ciclo
                if (labirinto[i][j] != '-')
                    continue;

                // probabilita
                int prob = generatoreCasuale.nextInt(10);

                // 2 e' arbitrario potrebbe essere di piu
                if (prob <= 2) {
                    labirinto[i][j] = 'W';
                }
            }
        }

        return labirinto;
    }


}
