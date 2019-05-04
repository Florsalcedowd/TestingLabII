/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumno
 */
public class ArreglosTest {
    Arreglos instance = new Arreglos();
    
    public ArreglosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Arreglos();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of sumaArreglos method, of class Arreglos.
     */
    @Test
    public void testSumaArreglos() {
        System.out.println("sumaArreglos");
        int[] a = {1, 1, 1};
        int[] b = {1, 1, 1};
        int[] expResult = {2, 2, 2};
        int[] result = instance.sumaArreglos(a, b);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of menorDelArreglo method, of class Arreglos.
     */
    @Test
    public void testMenorDelArreglo() {
        System.out.println("menorDelArreglo");
        int[] a = {-99, -99, -99};
        int expResult = -99;
        int result = instance.menorDelArreglo(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of sumaSoloPares method, of class Arreglos.
     */
    @Test
    public void testSumaSoloPares() {
        System.out.println("sumaSoloPares");
        int[] a = {2147483644, 9, 2};
        int expResult = 2147483646;
        int result = instance.sumaSoloPares(a);
        assertEquals(expResult, result);
    }
    
}
