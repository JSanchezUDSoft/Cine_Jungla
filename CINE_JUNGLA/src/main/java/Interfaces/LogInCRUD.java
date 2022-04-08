package Interfaces;

import Modelo.LogIn;

import java.util.List;

public interface LogInCRUD {
    public byte listar(LogIn login);
    public LogIn list(int id);
    public boolean registrarLogIn(LogIn login);
    public boolean edit(LogIn multiplex);
    public boolean eliminar(int id);
}
