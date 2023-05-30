package tinder_like;

import java.util.Objects;

public class Interesse {

    private int id = 0;
    private String nome;

    public Interesse(String nome) {
        this.id++;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interesse interesse = (Interesse) o;
        return id == interesse.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Interesse{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
