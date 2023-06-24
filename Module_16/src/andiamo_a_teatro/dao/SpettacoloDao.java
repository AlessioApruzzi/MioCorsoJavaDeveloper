package andiamo_a_teatro.dao;

import andiamo_a_teatro.model.Spettacolo;

import java.sql.SQLException;

public interface SpettacoloDao extends Dao<Spettacolo> {
    public int getIdByNome(String nome) throws SQLException;
}
