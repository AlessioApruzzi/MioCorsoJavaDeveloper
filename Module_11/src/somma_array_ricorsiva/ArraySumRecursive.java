package somma_array_ricorsiva;

import javax.annotation.processing.Generated;
import java.util.Arrays;


public class ArraySumRecursive {

    private int[] arrayToSum;

    public ArraySumRecursive() {

        arrayToSum= new int[1000];
        Arrays.fill(arrayToSum, 1);

    }

    public int[] getArrayToSum() {
        return arrayToSum;
    }

    public int arraySum(int[] a){
        return arraySum(a,a.length-1 );
    }

    private int arraySum(int[] a,int index){
        if (index<0){
            return 0;
        }
        return arraySum(a,index-1)+a[index];

    }

    public static void main(String[] args) {
        ArraySumRecursive arraySumRecursive = new ArraySumRecursive();

        System.out.println(arraySumRecursive.arraySum(arraySumRecursive.getArrayToSum()));


    }


}
