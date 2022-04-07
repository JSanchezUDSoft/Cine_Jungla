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
    Persona p = new Persona();
    @Override
    public List listar() {
        String sql = "select * from clientes";

        List list = null;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){
                Persona per = new Persona();
                per.setId(rs.getInt("Id"));
                per.setDni(rs.getString("DNI"));
                per.setNom(rs.getString("Nombre"));
                list.add(per);
            }
        }catch(Exception e){

        }
        return list;
    }

    @Override
    public Clientes list(String identificacion) {
        return null;
    }


    @Override
    public boolean registrarCliente(Clientes client) {
        String sql= "insert into clientes(k_identificacion, n_cliente, t_celular, o_correo, v_puntos) values('"+client.getIdentifiacion()+"','"+client.getNombre()+"','"+client.getCelular()+"','"+client.getCorreo()+"','"+client.getPuntos()+"')";
        try {
            con =cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        }catch (Exception e) {

        }
        return false;
    }

    @Override
    public boolean edit(Clientes per) {
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        return false;
    }
}
