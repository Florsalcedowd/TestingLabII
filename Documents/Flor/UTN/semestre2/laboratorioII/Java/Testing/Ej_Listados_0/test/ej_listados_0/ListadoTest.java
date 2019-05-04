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
        Persona per = new Persona("Laura", 'F', "39457821");
        int n = 0;
        Listado instance = new Listado(5);
        int expResult = n+1;
        int result = instance.agregarUnaPersona(per, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of muestraNombres method, of class Listado.
     */
    @Test
    public void testMuestraNombres() {
        System.out.println("muestraNombres");
        Listado instance = new Listado(2);
        Persona per = new Persona("Nombre", 'F', "12345678");
        instance.agregarUnaPersona(per, 0);
        instance.agregarUnaPersona(per, 1);
        
        for (int i = 0; i < 2; i++) {
            assertEquals(per, instance.p[i]);
        }
    }
    
}
