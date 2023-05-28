package Module_1;

import java.util.Scanner;

public class RimpiazzaIntrusi {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a=sc.nextLine();
        System.out.print("Enter string:");
        String b=sc.nextLine();
        System.out.print("Enter string:");
        String c=sc.nextLine();
        replaceIntruder(a, b, c);
    }

    private static void replaceIntruder(String a, String b , String c) {
        //inserite qui il vostro codice


        String[] d = c.split(" ");
        for (int i = 0; i<d.length ; i++){
            if (i>0 && i<d.length-1){
                d[i] = d[1].replaceAll(a,b);
            }
            System.out.print(d[i] + " ");
        }
    }

}