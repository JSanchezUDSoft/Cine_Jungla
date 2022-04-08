package ModeloDAO;

import Config.Conexion;
import Interfaces.SalasCRUD;
import Modelo.Salas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SalasDAO implements SalasCRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;


    @Override
    public boolean registrarSalas(Salas sala) {
        String sql = "insert into salas(k_multiplex, n_sala) values('"+sala.getIdMultiplex()+"','"+sala.getNombreSala()+"')";

        try {
            con =cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        }catch (Exception e) {

        }
        return false;
    }
}
