package andiamo_a_teatro.dao;

import andiamo_a_teatro.model.Posto;

import java.sql.SQLException;

public interface PostoDao extends Dao<Posto> {
    public int getPostoByFilaENumero(int fila, int numero) throws SQLException;
}
