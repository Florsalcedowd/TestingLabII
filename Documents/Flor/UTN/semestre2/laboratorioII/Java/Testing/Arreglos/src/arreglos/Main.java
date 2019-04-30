/*
Laboratorio de Computación II
 */

package arreglos;

//Trabajo con Arreglos

/**
 *
 * @author jmonetti
 */
public class Main {

    public static void main(String[] args) {
       //ejemplo de uso de la clase Arreglos
        
        Arreglos arr = new Arreglos();
        
        //crear parametros para utilizar los metodos
        int a[] = new int[5];  //crear un arreglo de cuatro enteros
        int b[] = new int[5];  //crear otro arreglo de cuatro enteros
        int c[] = new int[5];  //arreglo donde quedarán los resultados
        
        //inicializar los arreglos
        for(int i=0; i<a.length; i++) {
            a[i] = i;
            b[i] = i;
        }
        
        c = arr.sumaArreglos(a, b);  //sumar los arreglos a y b.  resultado queda en c
        
        //mostrar el resultado de la suma
        for(int i=0; i<c.length; i++)
            System.out.println(c[i]);
        
        
        //imprimir el menor del arreglo a
        System.out.println("el menor es: " +  arr.menorDelArreglo( a ));
        
        //mostrar la suma de los numeros pares
        System.out.println("La suma de los numeros pare es: " + arr.sumaSoloPares(a));
        
    }
    
}
