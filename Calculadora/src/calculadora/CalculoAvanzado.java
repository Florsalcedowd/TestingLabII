/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static java.lang.Math.cbrt;
import static java.lang.Math.sqrt;

/**
 *
 * @author flocy
 */
public class CalculoAvanzado {
    float raizCuadrada(float a){
        float rCuad= (float) sqrt(a);
        return rCuad;
    } 
    
    float raizCubica(float a){
        float rCub= (float) cbrt(a);
        return rCub;
    }
    
    float cuadrado(float a){
        float cuad= (float) Math.pow(a,2);
        return cuad;
    }
    
    float inversoMultiplicativo(float a){
        float inv= 1/a;
        return inv;
    }
}
