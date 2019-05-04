/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_cadenas_caracteres_0;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author flocy
 */
public class CadenasTest {
    
    public CadenasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of largoCadena method, of class Cadenas.
     */
    @Test
    public void testLargoCadena() {
        System.out.println("largoCadena");
        String cade = "Chau! ☺";
        Cadenas instance = new Cadenas();
        int expResult = 7;
        int result = instance.largoCadena(cade);
        assertEquals(expResult, result);
    }

    /**
     * Test of contiene method, of class Cadenas.
     */
    @Test
    public void testContiene() {
        System.out.println("contiene");
        String cade1 = "Tengo un sueño";
        String cade2 = "sueño";
        Cadenas instance = new Cadenas();
        boolean expResult = true;
        boolean result = instance.contiene(cade1, cade2);
        assertEquals(expResult, result);
    }

    /**
     * Test of invierte method, of class Cadenas.
     */
    @Test
    public void testInvierte() {
        System.out.println("invierte");
        String cade = "-.-.-.-.";
        Cadenas instance = new Cadenas();
        String expResult = ".-.-.-.-";
        String result = instance.invierte(cade);
        assertEquals(expResult, result);
    }

    /**
     * Test of contarRepeticiones method, of class Cadenas.
     */
    @Test
    public void testContarRepeticiones() {
        System.out.println("contarRepeticiones");
        String car = "i";
        String cade = "Supercalifragilisticoespialidoso";
        Cadenas instance = new Cadenas();
        int expResult = 6;
        int result = instance.contarRepeticiones(car, cade);
        assertEquals(expResult, result);
    }
    
}
