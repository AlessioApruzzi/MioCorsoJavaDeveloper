package Module_1;

public class Esercizio9 {

    /*
    Scrivere un programma che, dato un intero n in input, ne calcoli il fattoriale
     */

    //modo iterativo
    public static int fattoriale(int n){
        n = Math.abs(n);
        if (n<2){
            return 1;
        }
        int fact = 1;
        for (int i = 2 ; i <= n ; i ++){
            fact *= i;
        }
        return fact;
    }


    // modo ricorsivo le funzioni richiamano se stesse
    // 5! = 5 * 4 * 3 * 2 * 1 = 5 * 4! = ....
    public static int fattorialericorsivo(int n){
        n = Math.abs(n);

        // caso base, quando si esce dalla funzione
        if (n<2) return 1;
        // caso generale
        else return n*fattorialericorsivo(n-1);


    }
}
