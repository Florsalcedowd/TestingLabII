/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej_listados_0;

/**
 *
 * @author Alumno
 */
public class Ej_Listados_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //crear un arreglo de 3 personas
        Listado l = new Listado(3);
        
        //agregar 3 personas al listado.
        int n=0;
        n = l.agregarUnaPersona(new Persona("Juan" ,'m',"42445304"), n);
        n = l.agregarUnaPersona(new Persona("Marìa",'f',"43444875"), n);
        n = l.agregarUnaPersona(new Persona("Josè" ,'m',"41004843"), n);
        
        //mostrar por pantalla los nombres de las personas del listado
        l.muestraNombres();
        
        
    }
    
}
