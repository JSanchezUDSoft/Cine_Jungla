package ModeloDAO;

import Config.Conexion;
import Interfaces.ClientesCRUD;
import Modelo.Clientes;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class ClientesDAO implements ClientesCRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Clientes c = new Clientes();

    @Override
    public boolean registrarCliente(Clientes cliente) {
        String sql= "insert into clientes(k_identificacion, n_cliente, t_celular, o_correo, v_puntos) values('"+cliente.getIdentifiacion()+"','"+cliente.getNombre()+"','"+cliente.getCelular()+"','"+cliente.getCorreo()+"','"+cliente.getPuntos()+"')";
        try {
            con =cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        }catch (Exception e) {

        }
        return false;
    }

}
