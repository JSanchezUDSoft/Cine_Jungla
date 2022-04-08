package FactoryMethod;


import Interfaces.Sillas;

public class SillasComunes implements Sillas{

    @Override
    public String [][] CrearSillas(){

        String[] PosicionComunes = new String[]{ "A","B","E","F" };
        String[] NumeroComunes = new String[]{ "1","2","3","4","5","6","7","8","9","10" };
        String[][] SComunes = new String[4][10];

        for (int i=0; i<4; i++){
            for (int j=0; j<10; j++){
                SComunes[i][j]=PosicionComunes[i]+NumeroComunes[j];
            }
        }

        return SComunes;
    }
}