package Module_1;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a = sc.nextLine();
        stringReverse(a);
    }

    static void stringReverse(String s) {
        //inserite qui il vostro codice

        for (int i = 0; i<s.length(); i++){
            System.out.print(s.charAt(s.length()-i-1));
        }
    }
}