package ModeloDAO;

import Config.Conexion;
import Interfaces.MultiplexCRUD;
import Modelo.Multiplex;
import Modelo.Persona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MultiplexDAO implements MultiplexCRUD
{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List listar() {
        return null;
    }

    public Multiplex list(int id) {
        return null;
    }

    public boolean registrarMultiplex(Multiplex m) {
        String sql = "INSERT INTO multiplex (n_multiplex, o_direccion) VALUES ('"+m.getNombreM()+"', '"+m.getDireccion()+"')";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        }catch (Exception e){

        }
        return false;
    }

    public boolean edit(Multiplex multiplex) {
        return false;
    }

    public boolean eliminar(int id) {
        return false;
    }
}
