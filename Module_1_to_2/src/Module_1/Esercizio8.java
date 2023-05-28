package Module_1;

public class Esercizio8 {

    // Scrivere un metodo che, dato in input un intero a, ritorni true se il numero è primo, false
    //altrimenti.

    public static boolean isPrime(int n){
        n = Math.abs(n);
        if (n<2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
