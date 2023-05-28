package Module_1;

/*
Scrivere un metodo che, data una stringa s in input, ne stampi il reverse, ossia la stringa al
contrario. Esempio: data la stringa «ciao», dovrà stampare «oaic».
 */
public class Esercizio7 {

    public static void reverseString(String s) {

        String result = "";
        for (int i = s.length()-1; i >= 0; i--){
            result += s.charAt(i);
        }
        System.out.println("La stringa al contrario e': " + result);
    }
    public static void reverseString2(String s){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.reverse();
        System.out.println("la tringa rigirata e': " + stringBuilder);

    }
}
