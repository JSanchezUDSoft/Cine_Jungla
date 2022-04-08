package Modelo;

public class Multiplex {
    private String  nombreM;
    private String  direccion;

    public Multiplex() {
    }

    public Multiplex(String nombreM, String direccion) {
        this.nombreM = nombreM;
        this.direccion = direccion;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
