package Interfaces;

import Modelo.Peliculas;

public interface PeliculasCRUD {
    public boolean registrarPeliculas(Peliculas pelicula);
    public boolean inhabilitarPeliculas(int idPelicula);
}
