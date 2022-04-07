package Interfaces;

import Modelo.Clientes;

import java.util.List;

public interface ClientesCRUD {
    public List listar();
    public Clientes list(String identificacion);
    public boolean registrarCliente(Clientes client);
    public boolean edit(Clientes client);
    public boolean eliminar(int id);
}