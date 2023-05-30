package libreria;

import java.util.Comparator;

public class Libro implements Comparable<Libro>{

    private int id;
    private String titolo;
    private String sinossi;
    private Autore autore;

    public Libro(int id, String titolo, String sinossi, Autore autore) {
        this.id = id;
        this.titolo = titolo;
        this.sinossi = sinossi;
        this.autore = autore;
    }

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public Autore getAutore() {
        return autore;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", sinossi='" + sinossi + '\'' +
                '}';
    }



    /*
    @Override
    public int compare(Libro o1, Libro o2) {
        return CharSequence.compare(o1.getTitolo(),o2.getTitolo());
    }

    */



    @Override
    public int compareTo(Libro o) {
        return titolo.compareTo(o.getTitolo());
    }


}
