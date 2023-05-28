package biblioteca;

import java.util.Arrays;
import java.util.Comparator;

public class Libro implements Comparable<Libro>{

    private int index;
    private String nome;
    private String autore;

    Libro(){
    }

    Libro(int index, String autore,String nome){
        this.index = index;
        this.autore = autore;
        this.nome=nome;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int indice) {
        this.index = indice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String toString() {
        return "Libro{" +
                "index=" + index +
                ", author='" + autore + '\'' +
                ", name='" + nome + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Libro[] array = {
                new Libro(1, "andrea", "libro 1"),
                new Libro(2,"andrea2", "Libro2"),
        };

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Comparator.comparing(l -> l.getIndex()));
        System.out.println(Arrays.toString(array));
    }


    public int compareTo(Libro libro){
        /*
        if (libro.getIndex() == this.getIndex()){
            return 0; // this e' uguale a libro
        }
        else if (libro.getIndex()>this.getIndex()){
            return -1; // valori negativi this e' piu grande di libro
        }else {
            return 1; // valori positivi this e' piu grande di libro
        }

        // return (libro.getIndex()> this.getIndex()) ? -1 : (libro.getIndex() == this.getIndex()) ? 0 : 1);

         */

        int indexComparison = Integer.compare((libro.getIndex()),this.getIndex());

        if (indexComparison == 0){
            return this.autore.compareTo(libro.autore);

        }else {
            return indexComparison;
        }
    }
}
