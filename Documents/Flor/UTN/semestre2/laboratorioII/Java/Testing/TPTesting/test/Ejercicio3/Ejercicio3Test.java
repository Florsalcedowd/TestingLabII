/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author flocy
 */
public class Ejercicio3Test {
    
    public Ejercicio3Test() {
    }

    /**
     * Test of main method, of class Ejercicio3.
     */

    @Test
    public void testGenerarNumerosAleatorios() {
        System.out.println("generarNumerosAleatorios");
        int cantNumeros = 1000000;
        int numeroMayor = 1000000;
        int[] numerosAleatorios = new int[1000000];
        assertEquals(cantNumeros, numerosAleatorios.length);
        Ejercicio3.generarNumerosAleatorios(cantNumeros, numeroMayor, numerosAleatorios);
    }

    /**
     * Test of ordenamientoPorInsercion method, of class Ejercicio3.
     */
    @Test
    public void testOrdenamientoPorInsercion() {
        System.out.println("ordenamientoPorInsercion");
        int[] vector = new int[1000000];
        Ejercicio3.ordenamientoPorInsercion(vector);
    }
    
}
