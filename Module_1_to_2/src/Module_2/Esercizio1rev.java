package Module_2;

public class Esercizio1rev {

    // quadrato tramite somma numeri dispari

    public static int square(int n){
        int result = 0;
        for (int i = 0; i < n; i++){
            result += 2 * i + 1;
        }
        return result;
    }
}
