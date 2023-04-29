package org.example;
import java.util.ArrayList;

public class ej31 {
    public static int sumanterminosprogresiongeom(int n) throws IllegalArgumentException {
        if (n <= 0) {
            throw new IllegalArgumentException("n no puede ser menor o igual que 0");
        }

        int suma = 1;
        ArrayList lista = new ArrayList();
        for (int i = 1; i <= n; i++) {
            suma =suma*2;
            lista.add(suma);


        }
        //metodo que suma los elementos de la lista
        int sumalista = 0;
        for (int i = 0; i < lista.size(); i++) {
            sumalista +=(int) lista.get(i);
        }
        return sumalista;
    }
}
