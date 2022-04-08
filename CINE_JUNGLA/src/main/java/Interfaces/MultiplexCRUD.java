package Interfaces;

import Modelo.Multiplex;

import java.util.List;

public interface MultiplexCRUD {
    public List listar();
    public Multiplex list(int id);
    public boolean registrarMultiplex(Multiplex multiplex);
    public boolean edit(Multiplex multiplex);
    public boolean eliminar(int id);
}
