package ModeloDAO;

import Config.Conexion;
import Interfaces.UsuariosCRUD;
import Modelo.Usuarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDAO implements UsuariosCRUD {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    /*public List listar() {
        ArrayList<u> list = new ArrayList<>();
        String sql = "select * from persona";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){
                Persona per = new Persona();
                per.setId(rs.getString("Id"));
                per.setDni(rs.getString("DNI"));
                per.setNom(rs.getString("Nombre"));
                list.add(per);
            }
        }catch(Exception e){

        }
        return list;
    }*/

    public Usuarios list(String identificacion) {
        return null;
    }

    public boolean registrarUsuario(Usuarios u) {

        String sql="INSERT INTO usuarios (k_empleado, k_identificacion, n_nombre, t_celular, f_contrato, f_rol, v_salario, i_rol, i_cargo, o_contrasena, k_multiplex) VALUES ('"+u.getCodigoEmpleado()+"', '"+u.getIdentificacion()+"', '"+u.getNombre()+"', '"+u.getCelular()+"', '"+u.getFechaContrato()+"', now() ,'"+u.getSalario()+"', '"+u.getRol()+"', '"+u.getCargo()+"', '"+u.getContrasena()+"', '"+u.getMultiplex()+"')";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        }catch (Exception e){
            System.out.println(e.toString());
        }
        return false;
    }

    public boolean edit(Usuarios usuario) {
        return false;
    }

    public boolean eliminar(int id) {
        return false;
    }
}
