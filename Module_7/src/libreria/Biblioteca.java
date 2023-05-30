package libreria;

import java.util.*;

public class Biblioteca {

    private List<Libro> libri;



    public Biblioteca(List<Libro> libri) {
        this.libri = libri;
        for (Libro libro : libri) {
            libro.getAutore().addToLibriList(libro);
        }
    }

    public void addLibro(Libro libro){
        libri.add(libro);
        libro.getAutore().addToLibriList(libro);
    }

    public void removeLibro(Libro libro){
        libri.remove(libro);
    }

    public Libro cercaLibroCodice(int codice){
        for (Libro libro : libri) {
            if (libro.getId()==codice){
                return libro;
            }
        } return null;
    }

    public Libro cercaLibroTitolo(String titolo){
        for (Libro libro : libri) {
            if (libro.getTitolo().equals(titolo)){
                return libro;
            }
        } return null;
    }

    public TreeSet<Libro> cercaLibroAutore(Autore autore){
        TreeSet<Libro> libriAutore = new TreeSet<>();
        for (Libro libro : libri) {
            if (libro.getAutore().equals(autore)){
                libriAutore.add(libro);
            }
        } return libriAutore;
    }



    public void stampaTitoloSinossi(Autore autore){
        TreeSet<Libro> libriOrd = cercaLibroAutore(autore);

      //  System.out.println(autore.getLibriScritti().get(0).toString());

      //  Arrays.sort(new List[]{autore.getLibriScritti()});
        for (Libro libro : libriOrd) {
            System.out.println(libro.toString());
            System.out.println("\n");
        }

     /*

        for (Libro libro : autore.getLibriScritti()) {
            System.out.println(libro.toString());
        }

      */


    }

    public List<Libro> getLibri() {
        return libri;
    }
}
