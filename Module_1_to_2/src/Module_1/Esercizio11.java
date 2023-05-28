package Module_1;

public class Esercizio11 {

    //Scrivere un programma che, data in input una stringa s, restituisca true se s è palindroma, false
    //altrimenti


    public static boolean palindroma(String s){

        for (int i = 0; i<s.length()/2; i++){
            if (s.charAt(i) != s.length()-1-i){
                return false;
            }
        }
        return true;
    }

    public static boolean palindromaLazy(String s){

        StringBuilder sReverse = new StringBuilder(s).reverse();
        return sReverse.toString().equals(s);
    }
}
