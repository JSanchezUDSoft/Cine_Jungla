package ModeloDAO;

import Interfaces.CRUD;
import Config.Conexion;
import Modelo.Persona;
import java.util.*;
import java.sql.*;


public class PersonaDAO implements CRUD {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p = new Persona();
    public List listar() {
        ArrayList<Persona>list = new ArrayList<>();
        String sql = "select * from persona";
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

    public Persona list(int id) {
        return null;
    }

    public boolean add(Persona per) {
        return false;
    }

    public boolean edit(Persona per) {
        return false;
    }

    public boolean eliminar(int id) {
        return false;
    }
}
