package libreria;

import com.sun.source.tree.Tree;

import java.util.*;

public class Autore implements Comparator<Libro>{

    private String nome;
    private String cognome;
    private int id;
    //private TreeSet<Libro> libriScritti;
   // private List<Libro> libriScritti = new ArrayList<>();
    private Set<Libro> libriScr = new TreeSet<>();

    public Autore(String nome, String cognome, int id) {
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;

    }

    public Autore(String nome, String cognome, int id, Set<Libro> libriScr) {
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
        this.libriScr = libriScr;

    }

    public void addToLibriList(Libro libro){
        libriScr.add(libro);
    }

    public Set<Libro> getLibriScritti() {
        return libriScr;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autore autore = (Autore) o;
        return id == autore.id && Objects.equals(nome, autore.nome) && Objects.equals(cognome, autore.cognome) && Objects.equals(libriScr, autore.libriScr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, id, libriScr);
    }


    @Override
    public int compare(Libro o1, Libro o2) {
        return CharSequence.compare(o1.getTitolo(),o2.getTitolo());
    }


}
