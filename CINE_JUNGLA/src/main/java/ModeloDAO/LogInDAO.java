package ModeloDAO;

import Config.Conexion;
import Interfaces.LogInCRUD;
import Modelo.LogIn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LogInDAO implements LogInCRUD {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;


    public byte listar(LogIn l) {
        String sql = "select i_rol from usuarios where k_identificacion = '"+l.getCedula()+"' and o_contrasena='"+l.getContrasena()+"'";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            String rol = "";
            while(rs.next()) {
                rol = rs.getString("i_rol");
            }

            if(rol.equals("d")){
                Conexion.setIdentificacion(l.getCedula());
                return 1;
            }
            else if(rol.equals("c")){
                Conexion.setIdentificacion(l.getCedula());
                return 2;
            }
            else{
                return 3;
            }
        }catch(Exception e){
            return 4;
        }
    }

    public LogIn list(int id) {
        return null;
    }

    public boolean registrarLogIn(LogIn login) {
        return false;
    }

    public boolean edit(LogIn multiplex) {
        return false;
    }

    public boolean eliminar(int id) {
        return false;
    }
}
