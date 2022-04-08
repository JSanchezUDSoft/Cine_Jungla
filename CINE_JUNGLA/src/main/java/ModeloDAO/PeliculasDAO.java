package ModeloDAO;

import Config.Conexion;
import Interfaces.PeliculasCRUD;
import Modelo.Clientes;
import Modelo.Peliculas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PeliculasDAO implements PeliculasCRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Clientes c = new Clientes();


    @Override
    public boolean registrarPeliculas(Peliculas pelicula) {
        String sql = "insert into peliculas(n_titulo, f_estreno, o_genero, o_duracion) values('"+pelicula.getTitulo()+"','"+pelicula.getEstreno()+"','"+pelicula.getGenero()+"','"+pelicula.getDuracion()+"')";
        try {
            con =cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        }catch (Exception e) {

        }
        return false;
    }



    @Override
    public boolean inhabilitarPeliculas(int idPelicula) {
        return false;
    }
}
