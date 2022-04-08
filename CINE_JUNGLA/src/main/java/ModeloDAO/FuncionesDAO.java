package ModeloDAO;

import Config.Conexion;
import Interfaces.FuncionesCRUD;
import Modelo.Clientes;
import Modelo.Funciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FuncionesDAO implements FuncionesCRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Funciones c = new Funciones();

    @Override
    public boolean registrarFuncion(Funciones funcion) {
        String sql = "insert into funciones(f_fechahorainicio, f_fechahorafin, i_funcion, k_sala, k_pelicula) values('"+funcion.getFechaInicio()+"','"+funcion.getFechaFinal()+"','"+funcion.getEstado()+"','"+funcion.getIdSala()+"','"+funcion.getIdPelicula()+"')";
        try {
            con =cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        }catch (Exception e) {

        }
        return false;
    }
}
