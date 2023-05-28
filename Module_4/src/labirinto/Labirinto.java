package labirinto;

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

public class Labirinto {
    public static void main(String[] args) {


        String[][] labirinth = new String[6][5];
        //System.out.println(labirinth[5][4]);
        for (int i = 0; i < labirinth.length; i++) {
            for (int k = 0; k < labirinth[k].length; k++) {
                labirinth[i][k] = "-";
            }
            //System.out.println(Arrays.toString(labirinth[i]));
        }
        // System.out.println(labirinth.length); //6
        // System.out.println(labirinth[1].length); //5
        labirinth[0][1] = "N";
        labirinth[1][1] = "N";
        labirinth[2][1] = "N";
        labirinth[2][2] = "N";
        labirinth[3][2] = "N";
        labirinth[4][2] = "N";
        labirinth[4][3] = "N";
        labirinth[3][3] = "N";
        labirinth[2][3] = "N";
        labirinth[1][3] = "N";
        labirinth[1][4] = "N";
        labirinth[5][0] = "N";
        labirinth[4][0] = "N";
        labirinth[2][0] = "P";
        labirinth[2][4] = "E";

        // for (int i = 0; i < labirinth.length; i++){
        //    System.out.println(Arrays.toString(labirinth[i]));
        // }

        for (int i = 0; i < labirinth.length; i++) {
            for (int k = 0; k < labirinth[0].length; k++) {
                System.out.print(labirinth[i][k] + " ");
            }
            System.out.println("");
        }


        int x = 0;
        int y = 2;
        System.out.println("Le lettere WASD saranno utilizzate per muoversi nel labirinto");


        while (labirinth[y][x] != "E") {
            Scanner input = new Scanner(System.in);
            String direction = input.nextLine();


            if (direction.equals("w") && y > 0 && labirinth[y-1][x] != "N") {
                if (labirinth[y-1][x].equals("E")){
                    System.out.println("Sei uscito dal labirinto");
                    break;
                }
                labirinth[y][x] = "-";
                labirinth[y-1][x] = "P";
                y--;

            } else if (direction.equals("a") && x > 0 && labirinth[y][x-1] != "N") {
                if (labirinth[y][x-1].equals("E")){
                    System.out.println("Sei uscito dal labirinto");
                    break;
                }
                labirinth[y][x] = "-";
                labirinth[y][x-1] = "P";
                x--;
            } else if (direction.equals("s") && y < (labirinth.length - 1) && labirinth[y+1][x] != "N") {
                if (labirinth[y+1][x].equals("E")){
                    System.out.println("Sei uscito dal labirinto");
                    break;
                }
                labirinth[y][x] = "-";
                labirinth[y+1][x] = "P";
                y++;

            } else if (direction.equals("d") && x < (labirinth[1].length - 1) && labirinth[y][x+1] != "N") {
                if (labirinth[y][x+1].equals("E")){
                    System.out.println("Sei uscito dal labirinto");
                    break;
                }
                labirinth[y][x] = "-";
                labirinth[y][x+1] = "P";
                x++;
            }


            for (int i = 0; i < labirinth.length; i++) {
                for (int k = 0; k < labirinth[0].length; k++) {
                    System.out.print(labirinth[i][k] + " ");
                }
                System.out.println("");
            }


        }



    }
}

