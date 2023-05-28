package Module_1;

import java.util.Scanner;

public class ArmonicSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = sc.nextInt();
        harmonicSum(number);

        /*
        System.out.println(harmonicSum(0) == (0));
        System.out.println(harmonicSum(1) == (1));
        System.out.println(harmonicSum(2) == (3./2));
        System.out.println(harmonicSum(20) == (55835135./15519504));

         */
    }


     private static void harmonicSum(int number) {

        //inserite qui il vostro codice

        float sum = 0;
        for (int i = 1; i <= number; i++) {
                sum += (float) 1/i;
        }
        System.out.println(sum);
    }

}