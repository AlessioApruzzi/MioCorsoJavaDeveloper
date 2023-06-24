package my_fancy_company.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Impiegati {

    private int id;
    private String nome;
    private String livello;

    public Impiegati() { }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

    public static void readImpiegatiFromResultSet(ResultSet rs) throws SQLException {
        while(rs.next()) {
            Impiegati impiegati = new Impiegati();

            impiegati.id = rs.getInt("id");
            impiegati.nome = rs.getString("nome");
            System.out.println(impiegati.toString());
        }
    }

    @Override
    public String toString() {
        return "Impiegati{" + "id=" + id + ", nome='" + nome + '\'' + '}';
    }
}
