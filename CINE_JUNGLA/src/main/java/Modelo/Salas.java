package Modelo;

public class Salas {
    private int idSala;
    private String idMultiplex;
    private String nombreSala;

    public Salas() {
    }

    public Salas(int idSala, String idMultiplex, String nombreSala) {
        this.idSala = idSala;
        this.idMultiplex = idMultiplex;
        this.nombreSala = nombreSala;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getIdMultiplex() {
        return idMultiplex;
    }

    public void setIdMultiplex(String idMultiplex) {
        this.idMultiplex = idMultiplex;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }
}
