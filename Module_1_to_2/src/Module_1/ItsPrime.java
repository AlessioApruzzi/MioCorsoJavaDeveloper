package Module_1;

import java.util.Scanner;

public class ItsPrime {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number =sc.nextInt();
        isPrime(number);

        /* System.out.println(isPrime(number));
        number = 1;
        System.out.println(isPrime(number));
        number = 2;
        System.out.println(isPrime(number));
        number = 17;
        System.out.println(isPrime(number));
        number = 631;
        System.out.println(isPrime(number));
        number = 634;
        System.out.println(!isPrime(number));
        number = 999;
        System.out.println(!isPrime(number));
        number = 997;
        System.out.println(isPrime(number));

         */
    }

     private static boolean isPrime(int number) {
         //inserite qui il vostro codice

         boolean verify = true;
         for (int i = 2; i < number; i++){
             if(number%i == 0){
                 System.out.println("Il numero non e' primo");
                 verify = false;
                 break;
             }
         }
         if (verify == true){
             System.out.println("Il numero e' primo");
         }
         return verify;

     }
}