package Module_1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a = sc.nextLine();
        palindrome(a);
    }

    static void palindrome(String s) {
        //inserite qui il vostro codice


        boolean isPalindroma = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindroma = false;
                break;
            }
        }
        System.out.println("The string is palindroma: " + isPalindroma);

    }

}