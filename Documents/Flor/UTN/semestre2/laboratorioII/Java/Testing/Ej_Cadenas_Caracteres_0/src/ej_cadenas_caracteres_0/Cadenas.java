/*
 Laboratorio de Computacion II
 */

//Esta clase contiene algunos metodos para ejemplificar
//el manejo de cadenas de caracteres

package ej_cadenas_caracteres_0;

/**
 *
 * @author jmonetti
 */
public class Cadenas {
    
    //devuelve el largo de una cadena de caracteres
    public int largoCadena(String cade) {
        int largo =0;
        
        largo = cade.length();
        
        return largo;
    }
    
    //busca una subcadena dentro de una cadena y devuelve
    //verdadero si la encuentra.  Ej  "hola" esta contenida en "hola y chau"
    public boolean contiene(String cade1, String cade2) {
       boolean contenida = false;
       
       if( cade1.contains( cade2 )) {
          contenida = true;
       }
       return contenida;
    }
    
    //metodo que invierte una cadena de caracteres
    public String invierte(String cade){
        String result="";
        
        for(int i=cade.length(); i>0; i--) {
            String caracter = cade.substring(i-1,i); //obtengo el caracter iesimo
            result = result.concat( caracter );    //y lo concateno en la cadena resultado
 
        }
        return result;
    }
    
    
    //este metodo cuenta cuantas veces se repite la cadena car en la cadena cade
    public int contarRepeticiones(String car, String cade) {
    int contador=0;
    
       for(int i=0; i<cade.length(); i++) {
           String subcar = cade.substring(i, i+1);
           if(car.equals(subcar))
               contador++;
       }
       
    return contador;
    }
    
}
