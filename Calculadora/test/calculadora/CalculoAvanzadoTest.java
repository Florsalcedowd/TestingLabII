/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author flocy
 */
public class CalculoAvanzadoTest {
    
    public CalculoAvanzadoTest() {
    }

    /**
     * Test of suma method, of class CalculoAvanzado.
     */
    @Test
    public void testRaizCuadrada() {
        System.out.println("raíz cuadrada");
        float a = 9.0F;
        CalculoAvanzado instance = new CalculoAvanzado();
        float expResult = 3.0F;
        float result = instance.raizCuadrada(a);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of suma method, of class CalculoAvanzado.
     */
    @Test
    public void testRaizCubica() {
        System.out.println("raíz cubica");
        float a = 8.0F;
        CalculoAvanzado instance = new CalculoAvanzado();
        float expResult = 2.0F;
        float result = instance.raizCubica(a);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of suma method, of class CalculoAvanzado.
     */
    @Test
    public void testCuadrado() {
        System.out.println("cuadrado");
        float a = 3.0F;
        CalculoAvanzado instance = new CalculoAvanzado();
        float expResult = 9.0F;
        float result = instance.cuadrado(a);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of suma method, of class CalculoAvanzado.
     */
    @Test
    public void testInversoMultiplicativo() {
        System.out.println("inverso multiplicativo");
        float a = 8.0F;
        CalculoAvanzado instance = new CalculoAvanzado();
        float expResult = 0.125F;
        float result = instance.inversoMultiplicativo(a);
        assertEquals(expResult, result, 0.0);
    }
    
}
