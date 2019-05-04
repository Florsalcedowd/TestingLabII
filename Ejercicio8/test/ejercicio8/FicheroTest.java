/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

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
public class FicheroTest {
    
    public FicheroTest() {
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
     * Test of generarArchivo method, of class Fichero.
     */
    @Test
    public void testGenerarArchivo() {
        System.out.println("generarArchivo");
        Fichero instance = new Fichero();
        boolean expResult = true;
        boolean result = instance.generarArchivo();
        assertEquals(expResult, result);
    }
    
}
