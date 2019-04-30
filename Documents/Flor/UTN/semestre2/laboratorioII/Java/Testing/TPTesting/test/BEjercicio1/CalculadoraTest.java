/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEjercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author flocy
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 4;
        int b = 1;
        Calculadora instance = new Calculadora();
        int expResult = 5;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = -2147483647;
        int b = 1;
        Calculadora instance = new Calculadora();
        int expResult = -2147483648;
        int result = instance.resta(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        float a = 18.0F;
        float b = 5.0F;
        Calculadora instance = new Calculadora();
        float expResult = 3.6F;
        float result = instance.division(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int a = -78;
        int b = 8;
        Calculadora instance = new Calculadora();
        int expResult = -624;
        int result = instance.multiplicacion(a, b);
        assertEquals(expResult, result);
    }
    
}
