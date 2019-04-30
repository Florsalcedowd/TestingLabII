/*
 Laboratorio de Computacion II
 */

package ej_cadenas_caracteres_0;

/**
 *
 * @author jmonetti
 */
public class Main {

    public static void main(String[] args) {
       Cadenas c =new Cadenas();
       
       //ejemplo de invoacion de algun metodo de Cadenas
       System.err.println( "probando..." + " invertida-> " + c.invierte("probando..."));

       //contar la cantidad de repeticiones de un caracter en un string
       String frase = "hola, como esta ?";
       int cant = c.contarRepeticiones("a", frase);
       System.out.println("La letra 'a' se repite " + cant + " veces en la frase '"+ frase + "'");
       
    }
    
}
