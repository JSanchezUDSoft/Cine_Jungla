package Interfaces;

import Modelo.Salas;

public interface SalasCRUD {
    public boolean registrarSalas(Salas sala);
    public boolean generarSillas(String[][] matriz, Salas sala);
}
