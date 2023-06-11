package tartaglias_triangle;

import java.util.Arrays;

public class Tartaglia {

    public int[] tartaglia(int n){
        int[] tart= new int[n];
        if (n==1){
            tart[0]=1;
            return tart;
        }
        if (n==2){
            tart[0]=1;
            tart[1]=1;
            return tart;
        }
        if (n>2){
            int[] tart1 = tartaglia(n-1);
            tart[0]=tart1[0];
            tart[n-1]=tart1[n-2];
            for (int i = 1; i < n-1; i++) {
                tart[i]= tart1[i-1]+tart1[i];
            }
        }
        return tart;
    }

    public static void main(String[] args) {

        Tartaglia tartaglia = new Tartaglia();

        System.out.println(Arrays.toString(tartaglia.tartaglia(10)));

    }

}
