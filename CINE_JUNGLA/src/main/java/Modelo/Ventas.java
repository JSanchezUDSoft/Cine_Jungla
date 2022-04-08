package Modelo;

public class Ventas {
    private int idVenta;
    private String idCliente;

    public Ventas() {

    }

    public Ventas(int idVenta, String idCliente) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
}
