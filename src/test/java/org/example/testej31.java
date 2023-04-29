package org.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class testej31 {
    //creamos un test para la clase ej31

    @org.junit.Test(expected = IllegalArgumentException.class)
    //creamos un test para sumanterminosprogresiongeom0
    void Testsumanterminosprogresiongeom0() {
        assertEquals(1,ej31.sumanterminosprogresiongeom(0));
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    //creamos un test para sumanterminosprogresiongeom-1
    void Testsumanterminosprogresiongeom1() {
        assertEquals(1,ej31.sumanterminosprogresiongeom(-1));
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    //creamos un test para sumanterminosprogresiongeom-2
    void Testsumanterminosprogresiongeom2() {
        assertEquals(1,ej31.sumanterminosprogresiongeom(-2));
    }



}
