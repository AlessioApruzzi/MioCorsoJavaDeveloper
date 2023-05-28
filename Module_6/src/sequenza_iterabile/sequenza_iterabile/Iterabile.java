package sequenza_iterabile.sequenza_iterabile;

public interface Iterabile {

    //permette di ottenere il prossimo elemento che scorre la sequenza
    public Object next();
    // indica se e' presente il prossimo elemento nella sequenza
    public boolean hasNext();
    // resettal'iterazione
    void reset();
}
