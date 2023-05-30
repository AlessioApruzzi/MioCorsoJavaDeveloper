package tinder_like;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Utente {

    private String nome;
    private int eta;
    private int id = 0;
    private Set<Interesse> interessi = new HashSet<>();


    public Utente(){}

    public Utente(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
        this.id ++;
    }

    public void addInteresse(Interesse interesse){
        interessi.add(interesse);
    }

    public Set<Interesse> getInteressi() {
        return interessi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utente utente = (Utente) o;
        return id == utente.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", id=" + id +
                ", interessi=" + interessi +
                '}' + "\n";
    }
}
