package Modelo;

public class Peliculas {
    private int idPelicula;
    private String titulo;
    private String estreno;
    private String genero;
    private String duracion;

    public Peliculas() {
    }

    public Peliculas(int idPelicula, String titulo, String estreno, String genero, String duracion) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.estreno = estreno;
        this.genero = genero;
        this.duracion = duracion;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstreno() {
        return estreno;
    }

    public void setEstreno(String estreno) {
        this.estreno = estreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
