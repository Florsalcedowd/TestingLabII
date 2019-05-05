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
public class PersonaTest {
    
    public PersonaTest() {
    }
    

    @Test
    public void testPersona() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("TestPersona");
        Persona per = new Persona("Bruno",'M',"25689412");
        assertEquals(per.Nombre, "Bruno");
        assertEquals(per.sexo, 'M');
        assertEquals(per.documento,"25689412");
    
    }
    
}
