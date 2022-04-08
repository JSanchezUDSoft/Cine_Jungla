package FactoryMethod;
import Interfaces.Sillas;


public class SillasPreferenciales implements Sillas{

    @Override
    public String[][] CrearSillas() {

        String[] PosicionPreferenciales = new String[]{ "C","D"};
        String[] NumeroPreferenciales = new String[]{ "1","2","3","4","5","6","7","8","9","10" };
        String[][] SPreferenciales = new String[2][10];

        for (int i=0; i<2; i++){
            for (int j=0; j<10; j++){
                SPreferenciales[i][j]=PosicionPreferenciales[i]+NumeroPreferenciales[j];
            }
        }
        return SPreferenciales;
    }
}