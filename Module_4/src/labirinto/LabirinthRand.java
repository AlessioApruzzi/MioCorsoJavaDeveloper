package labirinto;

import java.util.Objects;
import java.util.Scanner;

/*
# Labyrinth

Negli anni 80 molti videogiochi &#x1F3AE; avevano una grafica "testuale" e cioè usavano i caratteri base del computer per disegnare a schermo.

![Rogue](./Immagini/rogue.png)

Possiamo rappresentare un labirinto come una matrice di caratteri, in cui il carattere "-" rappresenta uno spazio vuoto,
la "P" la posizione del giocatore e la "E" l’uscita.


![Possibile labirinto](./Immagini/preview.png)



Scrivete un programma che permette ad un utente di giocare al vostro labirinto.
Per farlo potrà scrivere sulla console di java le lettere «WASD» per muoversi (come in molti videogiochi per PC).
Quando il giocatore raggiunge il traguardo, verrà avvisato di aver vinto e il programma termina.


## Esempio di come funziona
![test](./Immagini/laby.gif)


## &#x1F970; Bonus stage:

Generate il labirinto randomicamente

# &#x1F480; Ultra mega bonus stage:
## Io ve lo dico, è difficile...
Fate in modo che il computer sia in grado di risolvere da solo il labirinto.

 */

public class LabirinthRand {
    public static void main(String[] args) {

        int max = 15;

        int lenght = (int) (Math.random() * max);
        lenght = 5 + lenght;
        String[][] labitinth = new String[lenght][lenght];
        for (int i = 0; i < lenght; i++) {
            for (int k = 0; k < lenght; k++) {
                labitinth[i][k] = "N";
                double rand = Math.random() * 2;
                if (rand < 0.75) {
                    labitinth[i][k] = "-";
                }
                // System.out.print(labitinth[i][k] + " ");
            }
            // System.out.println("");
        }


        int starty = (int) (Math.random() * lenght);
        labitinth[starty][0] = "P";


        int endy = (int) (Math.random() * lenght);
        labitinth[endy][lenght - 1] = "E";

        path(labitinth, lenght, starty);


        System.out.println("   ");
        for (int i = 0; i < lenght; i++) {
            for (int k = 0; k < lenght; k++) {
                System.out.print(labitinth[i][k] + " ");
            }
            System.out.print("\n");
        }

       play(labitinth,starty);
       // autoPlay(labitinth,lenght,starty);


    }



    public static String[][] path(String[][] lab, int len, int starty) {

        int x = 0;
        int y = starty;

        while (!Objects.equals(lab[y][x], "E")) {
            double rand = Math.random();
            if (rand < 0.33 & x < len - 1) {
                if (Objects.equals(lab[y][x + 1], "E")) {
                    break;
                }
                x++;
                lab[y][x] = "-";
            } else if (rand >= 0.33 && rand < 0.66 & y < len - 1) {
                if (Objects.equals(lab[y + 1][x], "E")) {
                    break;
                }
                y++;
                if (!Objects.equals(lab[y][x], "P")) {
                    lab[y][x] = "-";
                }
            } else if (rand >= 0.66 && y > 0) {
                if (Objects.equals(lab[y - 1][x], "E")) {
                    break;
                }
                y--;
                if (!Objects.equals(lab[y][x], "P")) {
                    lab[y][x] = "-";
                }
            }
        }
        return lab;
    }



    public static void play(String[][] labirinth,  int y) {

        int x = 0;

        System.out.println("Le lettere WASD saranno utilizzate per muoversi nel labirinto");
        while (!Objects.equals(labirinth[y][x], "E")) {
            Scanner input = new Scanner(System.in);
            String direction = input.nextLine();

            if (direction.equals("w") && y > 0 && !Objects.equals(labirinth[y - 1][x], "N")) {
                if (labirinth[y - 1][x].equals("E")) {
                    System.out.println("Sei uscito dal labirinto");
                    break;
                }
                labirinth[y][x] = "-";
                labirinth[y - 1][x] = "P";
                y--;

            } else if (direction.equals("a") && x > 0 && !Objects.equals(labirinth[y][x - 1], "N")) {
                if (labirinth[y][x - 1].equals("E")) {
                    System.out.println("Sei uscito dal labirinto");
                    break;
                }
                labirinth[y][x] = "-";
                labirinth[y][x - 1] = "P";
                x--;
            } else if (direction.equals("s") && y < (labirinth.length - 1) && !Objects.equals(labirinth[y + 1][x], "N")) {
                if (labirinth[y + 1][x].equals("E")) {
                    System.out.println("Sei uscito dal labirinto");
                    break;
                }
                labirinth[y][x] = "-";
                labirinth[y + 1][x] = "P";
                y++;

            } else if (direction.equals("d") && x < (labirinth[1].length - 1) && !Objects.equals(labirinth[y][x + 1], "N")) {
                if (labirinth[y][x + 1].equals("E")) {
                    System.out.println("Sei uscito dal labirinto");
                    break;
                }
                labirinth[y][x] = "-";
                labirinth[y][x + 1] = "P";
                x++;
            }


            for (int i = 0; i < labirinth.length; i++) {
                for (int k = 0; k < labirinth[0].length; k++) {
                    System.out.print(labirinth[i][k] + " ");
                }
                System.out.print("\n");
            }
        }

    }

}




