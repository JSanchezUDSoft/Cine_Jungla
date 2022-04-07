package Modelo;

public class Clientes {
    String identifiacion;
    String nombre;
    String celular;
    String correo;
    int puntos;


    public Clientes() {
    }

    public Clientes(String identifiacion, String nombre, String celular, String correo, int puntos) {
        this.identifiacion = identifiacion;
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
        this.puntos = puntos;
    }

    public String getIdentifiacion() {
        return identifiacion;
    }

    public void setIdentifiacion(String identifiacion) {
        this.identifiacion = identifiacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
