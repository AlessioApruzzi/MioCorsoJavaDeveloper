package Module_1;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String a=sc.nextLine();
        System.out.print("Enter String:");
        String b=sc.nextLine();
        System.out.print("Enter string:");
        String c=sc.nextLine();
        findEquals(a, b, c);
    }

    private static void findEquals(String a, String b, String c) {
        int equal=1;
        if(a.toLowerCase().equals(b.toLowerCase())){
            equal++;
        }
        if(a.toLowerCase().equals(c.toLowerCase())) {
            equal++;
        }else {
            if (b.toLowerCase().equals(c.toLowerCase())) {
                equal++;
            }
        }
        System.out.println(equal);
    }
}