package FactoryMethod;
import Interfaces.Sillas;

public class CrearSillasPreferenciales extends CrearSillasFactory{

    @Override
    public Sillas generarSillas() {
        return new SillasPreferenciales();
    }
}