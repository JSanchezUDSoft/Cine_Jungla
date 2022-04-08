package ModeloDAO;

import Config.Conexion;
import Interfaces.VentasCRUD;
import Modelo.Ventas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VentasDAO implements VentasCRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;


    @Override
    public byte Listar(Ventas venta) {

        String sql = "select k_identificacion from clientes where k_identificacion='"+venta.getIdCliente()+"'";

        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            String identificacion = "";
            while(rs.next()) {
                identificacion = rs.getString("k_identificacion");
            }
            if(identificacion.equals(venta.getIdCliente())){
                Conexion.setIdentificacion(venta.getIdCliente());
                return 1;
            }else{
                return 2;
            }
        }catch(Exception e){
            return 3;
        }
    }


    @Override
    public boolean registrarVentas(Ventas venta) {

        String sql = "insert into ventas(f_venta, k_identificacion) values('now()','"+venta.getIdCliente()+"')";

        try {
            con =cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        }catch (Exception e) {

        }
        return false;

    }
}
