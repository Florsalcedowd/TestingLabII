/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Docente
 */
public class BalanceTest {
    
    public BalanceTest() {
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
     * Test of ganancia method, of class Balance.
     */
    @Test
    public void testGanancia() {
        System.out.println("ganancia");
        Factura[] v = new Factura[2];
        Producto pro1[] = new Producto[2];
        Producto pro2[] = new Producto[2];
        
        pro1[0] = new Producto("clavo" , 50.0f);
        pro1[1] = new Producto("tuerca" , 25.0f);
        
        pro2[0] = new Producto("pinza" , 50.0f);
        pro2[1] = new Producto("madera" , 25.0f);
        
        v[0] = new Factura( pro1 );
        v[1] = new Factura( pro2 );
        
        ArrayList ga = new ArrayList();
        ga.add( 25.0f );
        ga.add( 25.0f );
        Gastos g = new Gastos(ga);
        Balance instance = new Balance();
        float expResult = 100.0F;
        float result = instance.ganancia(v, g);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
