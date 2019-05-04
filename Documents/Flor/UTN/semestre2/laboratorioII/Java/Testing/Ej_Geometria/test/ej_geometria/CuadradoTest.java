/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_geometria;

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
public class CuadradoTest {
    
    public CuadradoTest() {
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
     * Test of calculaArea method, of class Cuadrado.
     */
    @Test
    public void testCalculaArea() {
        System.out.println("calculaArea");
        Cuadrado instance = new Cuadrado(4.528f);
        float expResult =  20.502784f;
        float result = instance.calculaArea();
        assertEquals(expResult, result, 0.0);
    }
    
}
