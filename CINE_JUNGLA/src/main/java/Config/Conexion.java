package Config;

import javax.swing.*;
import java.sql.*;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba1?useTimezone=true&serverTimezone=UTC","root","javier1234");
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    public Connection getConnection(){
        return con;
    }
    /*
    Connection con;
    public Conexion(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/prueba", "postgres", "javier1234");
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    public Connection getConnection(){
        return con;
    }

    static Connection conexion;
    static Statement sentencia;
    public ResultSet resultado;

    public static void conecta() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar el puente JDBC-ODBC.");
            return;
        }
        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/prueba", "postgres", "javier1234");
            sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//JOptionPane.showMessageDialog(null, "Conexión establecida");
        } catch (Exception er) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
    }

    public static void alta(String cadena) {
        if (conexion == null) {
            conecta();
        }
        try {
            sentencia.execute(cadena);
        } catch (Exception er) {
            JOptionPane.showMessageDialog(null, "Lo sentimos su operación solicitada no se pudo realizar debido a un error de " + er);
        }
    }*/
}
