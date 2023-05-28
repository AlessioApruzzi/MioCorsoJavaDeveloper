package Module_2;

import java.util.Scanner;

/*
Un numero perfetto è un numero che è uguale alla somma dei suoi divisori
escluso se stesso.
Per esempio, il 6 è un numero perfetto perché  i suoi divisori escluso
se stesso sono 3,2 e 1 e sommandoli otteniamo di nuovo il 6
Scrivete un programma che scopre i numeri perfetti fino al 1000.
 */
public class Esercizio5 {
    public static void main(String[] args) {

        System.out.println("Insert a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int divider = 0;
        for (int i = 1; i < number; i++){
            for (int k = 1; k <  i; k++){
                if (i % k == 0){
                    divider += k;
                }
            }
            if (divider == i){
                System.out.println(i + " is perfect");
            }
            divider = 0;
        }
    }
}
