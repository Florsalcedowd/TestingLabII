/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author flocy
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]numerosAleatorios = new int[10];
        generarNumerosAleatorios(10, 100, numerosAleatorios);
        ordenamientoPorInsercion(numerosAleatorios);
    }
    
    public static void generarNumerosAleatorios(int cantNumeros,int numeroMayor,int numerosAleatorios[]){
        for (int i = 0; i < cantNumeros; i++) {
            int numero = (int) (Math.random() * numeroMayor) + 1;
            numerosAleatorios[i] = numero;
            System.out.println(numero);
        }
    }
    
    
    
    public static void ordenamientoPorInsercion(int[] vector){
        int pos, aux;
        
        //Ordenamiento por insercion
        for (int i = 0; i < vector.length; i++) {
            pos = i;
            aux = vector[i];
            
            while((pos>0) && (vector[pos-1]) > aux){
                vector[pos] = vector[pos-1];
                pos--;
            }
            vector[pos] = aux;
        }
        
        
        System.out.println("Orden ascendente");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        
        
    
    }
    
}