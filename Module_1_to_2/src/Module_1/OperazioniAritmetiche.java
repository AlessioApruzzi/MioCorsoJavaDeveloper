package Module_1;

import java.util.Scanner;

public class OperazioniAritmetiche {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        computeValues(a, b);
    }

    private static void computeValues(int a, int b) {
        //inserite qui il vostro codice

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        if (b != 0) {
            System.out.println(a/b);
        }

    }
}