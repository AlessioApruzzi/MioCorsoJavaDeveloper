package Module_1;

public class Esercizio10 {

    //Scrivere un programma che, dato un intero n in input, calcoli la somma di una serie armonica
    //fino a n

    public static double sommaArmoica(int n){

        if (n == 0) return 0.0;
        n = Math.abs(n);
        double somma = 0;
        for (int i = 1; i <= n; i++){
            somma += 1.0/i;
        }
        return somma;
    }

    public static double sommaArmonicaric(int n){

        // caso base
        if (n <2) return n;
        else return 1/n+sommaArmoica(n-1);
    }
}
