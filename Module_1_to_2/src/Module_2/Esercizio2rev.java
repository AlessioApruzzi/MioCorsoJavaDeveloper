package Module_2;

public class Esercizio2rev {

    // quante consonanti o vocali ha una stringa

    public static void contaVocaliConsonanti(String s){
        int vocali = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
                vocali++;
            }
        }
        int a = s.length() - vocali;
        System.out.println("il numero di vocali e': " + vocali);
        System.out.println("il numero di consonanti e': " + (s.length() - vocali));
    }
}
