package sequenza_iterabile.ListaInteriOrdinata;

import java.util.Arrays;

public class ListaInteriOrdinata {

    private int[] values = new int[0];

    public ListaInteriOrdinata(){

    }

    public ListaInteriOrdinata(int[] values){
       // for (int value : values)
      //      add(value);

        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }

    }

    public void add(int value) {

        int[] tmp = new int[values.length +1];

        if (values.length>0) {
            int index = 0;
            boolean verify = true;
            for (int i = 0; i < values.length; i++) {
               if (verify) {
                    if (value <= values[i]) {
                        tmp[index] = value;
                        index++;
                        verify= false;
                    }
                }
                tmp[index] = values[i];
                index++;
            }
            if (verify){
                tmp[index]=value;
            }
            values = tmp;
        } else {
            tmp[0] = value;
            values = tmp;
        }


    }

    public void add(int value , int position){
        if (value>=values[position-1] && value <= values[position]){
            int[] tmp = new int[values.length + 1];
            int index = 0;
            for (int i = 0; i < values.length; i++) {
                if (i==position) {
                    tmp[index] = value;
                    tmp[index + 1] = values[i];
                    index = index + 2;
                } else {
                    tmp[index] = values[i];
                    index++;
                }
            }
            values=tmp;
        } else
            System.out.println("not possible!");
    }

    public void addLast( int value){
        if (value>values[values.length-1]){
            int[] tmp = new int[values.length + 1];
            for (int i = 0; i < values.length; i++) {
                tmp[i]=values[i];
            }
            tmp[values.length]=value;
            values=tmp;
        } else
            System.out.println("not possible!");
    }

    @Override
    public String toString() {
        return "ListaInteriOrdinata{" +
                "values=" + Arrays.toString(values) +
                '}';
    }

    public static void main(String[] args) {
        int[] lista = new int[]{1108,5,12,3315,42345};
        ListaInteriOrdinata listaoOrdinata = new ListaInteriOrdinata(lista);
        System.out.println(listaoOrdinata.toString());
        listaoOrdinata.add(13,2);
        System.out.println(listaoOrdinata.toString());
        listaoOrdinata.addLast(12);
        listaoOrdinata.addLast(12999999);
        System.out.println(listaoOrdinata.toString());

    }

}
