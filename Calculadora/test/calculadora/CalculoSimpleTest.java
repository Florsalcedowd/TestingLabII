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
public class CalculoSimpleTest {
    
    public CalculoSimpleTest() {
    }
    
    /**
     * Test of suma method, of class CalculoSimple.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 5;
        int b = 5;
        CalculoSimple instance = new CalculoSimple();
        int expResult = 10;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of resta method, of class CalculoSimple.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 10;
        int b = 5;
        CalculoSimple instance = new CalculoSimple();
        int expResult = 5;
        int result = instance.resta(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of division method, of class CalculoSimple.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        float a = 9.0F;
        float b = 2.0F;
        CalculoSimple instance = new CalculoSimple();
        float expResult = 4.5F;
        float result = instance.division(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of multiplicacion method, of class CalculoSimple.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int a = 4;
        int b = 9;
        CalculoSimple instance = new CalculoSimple();
        int expResult = 36;
        int result = instance.multiplicacion(a, b);
        assertEquals(expResult, result);
    }
    
}
