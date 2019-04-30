/*
 Laboratorio de Computacion II
 */
package ej_listados_0;

/**
 *
 * @author jmonetti
 */
public class Listado {

    Persona p[];

    //constructor
    public Listado(int c) {
        p = new Persona[c];   //inicializar el arreglo p de Persona, con una cantidad c de celdas vacias.
    }

    //mètodo que agrega un objeto persona al arreglo en el lugar n. Devuelve n+1
    public int agregarUnaPersona(Persona per, int n) {

        p[n] = per;

        return n + 1;
    }

    //mètodo que muestra por pantalla solo los nombres de las Personas agregadas al listado
    public void muestraNombres() {

        for (int i = 0; i < p.length; i++) {
            System.out.println( p[i].Nombre );
        }

    }
}