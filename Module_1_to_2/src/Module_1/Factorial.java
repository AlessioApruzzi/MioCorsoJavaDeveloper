package Module_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number =sc.nextInt();
        factorial(number);


       /* System.out.println(factorial(1) == (0));
        System.out.println(factorial(2) == (2));
        System.out.println(factorial(5) == (120));
        System.out.println(factorial(10) == (3628800));
        System.out.println(factorial(20) == 2432902008176640000L);

        */
    }

    private static void factorial(int n) {
        //inserite il vostro codice qui

        int a = n;
        int s = 0;
        for (int i = 1; i<n; i++){
            a=a*i;
        }
        System.out.println(a);
    }
}