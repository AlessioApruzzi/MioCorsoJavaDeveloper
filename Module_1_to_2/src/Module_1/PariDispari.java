package Module_1;

import java.util.Scanner;

public class PariDispari {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number =sc.nextInt();
        checkEvenOdd(number);
    }

    private static void checkEvenOdd(int number) {
        //inserite qui il vostro codice

        if (number > 0){
            if (number%2 == 0){
                System.out.println("The number is even");
            }
            else {
                System.out.println("The number is odd");
            }
        }
        else {
            System.out.println("Error");
        }

    }
}