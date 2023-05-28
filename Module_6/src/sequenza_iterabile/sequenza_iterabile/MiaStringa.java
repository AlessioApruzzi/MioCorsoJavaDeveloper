package sequenza_iterabile.sequenza_iterabile;

public class MiaStringa implements Sequenza,Iterabile{


    private String miaStringa = new String();
    private int index;

    MiaStringa(){
    }

    MiaStringa(String miastringa){
        this.miaStringa=miastringa;
    }

    @Override
    public Object next() {
            return miaStringa.charAt(index++);
    }

    @Override
    public boolean hasNext() {
        if (index+1 > miaStringa.length()){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void reset() {
        index=0;
    }

    @Override
    public Object get(int i) {
        return miaStringa.charAt(i);
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < miaStringa.length(); i++) {
            if (miaStringa.charAt(i)==(char) o){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return miaStringa.length();
    }

    @Override
    public void add(Object o) {
        miaStringa = miaStringa+(char) o;
    }

    @Override
    public boolean remove(int i) {
        if (i> miaStringa.length()){
            return false;
        }
        String miaStringaMinus =  new String();
        for (int j = 0; j < miaStringa.length(); j++) {
            if (j!=i){
                miaStringaMinus += miaStringa.charAt(j);
            }
        }
        miaStringa=miaStringaMinus;
        return true;
    }

    @Override
    public void clear() {
        miaStringa="";
    }
}
