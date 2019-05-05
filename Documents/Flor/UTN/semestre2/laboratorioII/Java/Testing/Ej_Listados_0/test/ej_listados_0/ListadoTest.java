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
        Listado instance = new Listado(5);
        Persona per = new Persona("Pedro", 'M', "12345678");
        instance.agregarUnaPersona(per, 0);
        instance.agregarUnaPersona(per, 1);
        instance.agregarUnaPersona(per, 2);
        instance.agregarUnaPersona(per, 3);
        instance.agregarUnaPersona(per, 4);
        
        for (int i = 0; i < 5; i++) {
            assertEquals(per, instance.p[i]);
        }
    }
    
}
