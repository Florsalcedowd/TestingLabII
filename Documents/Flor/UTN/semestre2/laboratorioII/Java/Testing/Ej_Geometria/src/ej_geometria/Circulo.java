/*
Laboratorio de Computacion II
 */

package ej_geometria;

/**
 *
 * @author jmonetti
 */
public class Circulo extends Figura {
    float radio;
   
    public Circulo(float radio) {
       this.radio = radio;
    }

    @Override
    float calculaArea() {
        float area=0;
        
        area = 3.14f * radio * radio;
        
        return area;
    }
    
}
