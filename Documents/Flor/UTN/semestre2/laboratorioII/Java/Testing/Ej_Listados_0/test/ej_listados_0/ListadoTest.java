/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_listados_0;

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
public class ListadoTest {
    
    public ListadoTest() {
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
     * Test of agregarUnaPersona method, of class Listado.
     */
    @Test
    public void testAgregarUnaPersona() {
        System.out.println("agregarUnaPersona");
        Persona per = null;
        int n = 0;
        Listado instance = null;
        int expResult = 0;
        int result = instance.agregarUnaPersona(per, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of muestraNombres method, of class Listado.
     */
    @Test
    public void testMuestraNombres() {
        System.out.println("muestraNombres");
        Listado instance = null;
        instance.muestraNombres();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
