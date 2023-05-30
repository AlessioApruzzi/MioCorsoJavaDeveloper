package libreria;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Autore autore1 = new Autore("alessio1","apruzzi1",1);
        Autore autore2 = new Autore("alessio2","apruzzi2",2);
        Autore autore3 = new Autore("alessio3","apruzzi3",3);
        Libro libro1 = new Libro(1,"libro1","sinossi1", autore1);
        Libro libro2 = new Libro(2,"libro2","sinossi2", autore1);
        Libro libro3 = new Libro(3,"libro3","sinossi3", autore1);
        Libro libro4 = new Libro(4,"libro4","sinossi4", autore2);
        Libro libro5 = new Libro(5,"libro5","sinossi5", autore2);
        Libro libro6 = new Libro(6,"libro6","sinossi6", autore3);
        List<Libro> libri = new ArrayList<>();
        libri.add(libro2);
        libri.add(libro1);
        libri.add(libro3);
        libri.add(libro4);
        libri.add(libro5);
        for (Libro libro : libri) {
            System.out.println(libro.toString());
        }

        Biblioteca biblioteca = new Biblioteca(libri);
        biblioteca.addLibro(libro6);

        for (Libro libro : biblioteca.getLibri()) {
            System.out.println(libro);
        }

        System.out.println("libro 2");
        System.out.println(biblioteca.cercaLibroCodice(2));

        System.out.println("libro 3");
        System.out.println(biblioteca.cercaLibroTitolo("libro3"));

        System.out.println("libri autore 1");
        System.out.println(biblioteca.cercaLibroAutore(autore1));

        System.out.println("sinossi");
        biblioteca.stampaTitoloSinossi(autore1);
      // System.out.println(autore1.getLibriScritti().toString());

    }
}
