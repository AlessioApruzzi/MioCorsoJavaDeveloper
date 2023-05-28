package sequenza_iterabile.sequenza_iterabile;

public class ListaInteri implements Sequenza,Iterabile{

    private int[] listaInteri = new int[0];
    private int index=0;

    ListaInteri(){
    }

    ListaInteri(int[] listaInteri){
        this.listaInteri=listaInteri;
    }


    @Override
    public Object next() {

        return listaInteri[index++];
    }

    @Override
    public boolean hasNext() {
        if (index+1> listaInteri.length){
            return false;
        } else
            return true;
    }

    @Override
    public void reset() {
        index=0;
    }

    @Override
    public Object get(int i) {
        return listaInteri[i];
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < listaInteri.length; i++) {
            if (listaInteri[i]==(int) o){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return listaInteri.length;
    }

    @Override
    public void add(Object o) {
        int[] listaInteriPlus = new int[listaInteri.length+1];
        for (int i = 0; i < listaInteri.length; i++) {
            listaInteriPlus[i]=listaInteri[i];
        }
        listaInteriPlus[listaInteri.length]=(int) o;
        listaInteri=listaInteriPlus;
    }

    @Override
    public boolean remove(int i) {
        if (i >= listaInteri.length){
            return false;
        }
        int counter=0;
        int[] listaInteriMinus = new int[listaInteri.length-1];
        for (int j = 0; j < listaInteri.length; j++) {
            if (j!=i){
                listaInteriMinus[counter]=listaInteri[j];
                counter++;
            }
        }
        listaInteri=listaInteriMinus;
        return true;
    }

    @Override
    public void clear() {
        listaInteri=new int[0];
    }
}
