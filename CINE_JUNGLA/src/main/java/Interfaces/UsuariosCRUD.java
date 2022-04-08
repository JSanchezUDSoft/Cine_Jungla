package Interfaces;

import Modelo.Usuarios;

import java.util.List;

public interface UsuariosCRUD {
    //public List listar();
    public Usuarios list(String identificacion);
    public boolean registrarUsuario(Usuarios usuario);
    public boolean edit(Usuarios usuario);
    public boolean eliminar(int id);
}
