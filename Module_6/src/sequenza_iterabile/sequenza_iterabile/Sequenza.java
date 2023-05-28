package sequenza_iterabile.sequenza_iterabile;

public interface Sequenza {

    public Object get(int i);
    public boolean contains(Object o);
    public int size();
    public void add(Object o);
    public boolean remove(int i);
    public void clear();

}
