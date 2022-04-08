package FactoryMethod;
import Interfaces.Sillas;


public class CrearSillasComunes extends CrearSillasFactory {

    @Override
    public Sillas generarSillas() {
        return new SillasComunes();
    }
}