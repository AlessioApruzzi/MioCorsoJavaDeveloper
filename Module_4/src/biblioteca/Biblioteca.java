package biblioteca;

import java.util.Arrays;
import java.util.Comparator;

public class Biblioteca {

    private int MAX_LIBRI = 100;
    private Libro[] libro;
    private int counter = 0;


    Biblioteca(){}

    Biblioteca(Libro[] libro){
        this.libro = libro;
    }

    public void esisteLibro(int index) {
        boolean verify = false;
        for (int i = 0; i < libro.length; i++) {
            if (this.libro[i].getIndex() == index) {
                System.out.println("Il libro esiste");
                verify = true;
            }
        }
        if (!verify) {
            System.out.println("Il libro non esiste");
        }
    }

    public Libro[] getLibriOrdinati(Libro[] libro){
        Arrays.sort(libro, Comparator.comparing(Libro::getIndex));
     //   for (int i = 0; i < libro.length; i++){
       //     System.out.println("Indice libro: '" + libro[i].getIndice() + "' Nome libro: '" +libro[i].getNome() + "' Autore: '" +libro[i].getAutore() + "'");
        //}
        return libro;
    }

    public void addLibro( int index, String autore, String nome){

    }


}
