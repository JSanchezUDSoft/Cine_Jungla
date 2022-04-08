package ModeloDAO;

import Config.Conexion;
import FactoryMethod.CrearSillasComunes;
import FactoryMethod.CrearSillasFactory;
import FactoryMethod.CrearSillasPreferenciales;
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


    public boolean generarSillas(String[][] matriz, Salas sala){


        String tipoP = "preferencial";
        int precioP = 15000;
        String tipoC = "comun";
        int precioC = 11000;
        CrearSillasFactory invocar;
        invocar = new CrearSillasComunes();
        System.out.println(invocar.generarSillas().CrearSillas());
        invocar = new CrearSillasPreferenciales();
        System.out.println(invocar.generarSillas().CrearSillas());

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if(x == 2 || x == 3){
                    String sql = "insert into sillas(k_silla, k_sala, k_multiplex, i_tipo, v_precio) values('" + matriz[x][y] + "','" + sala.getIdSala() + "','" + sala.getIdMultiplex() + "','" + tipoP + "','" + precioP + "')";
                    try {
                        con =cn.getConnection();
                        ps = con.prepareStatement(sql);
                        ps.executeUpdate();

                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                }else{
                    String sql = "insert into sillas(k_silla, k_sala, k_multiplex, i_tipo, v_precio) values('" + matriz[x][y] + "','" + sala.getIdSala() + "','" + sala.getIdMultiplex() + "','" + tipoC + "','" + precioC + "')";
                    try {
                        con =cn.getConnection();
                        ps = con.prepareStatement(sql);
                        ps.executeUpdate();

                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                }

            }
        }
        return false;
    }
}
