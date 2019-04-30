//Laboratorio de Computación II
package arreglos;

/**
 *
 * @author jmonetti
 */
public class Arreglos {

    public int[] sumaArreglos(int a[], int b[]) {

        int cantidad = a.length;
        int c[] = new int[cantidad]; //inicializar vector de resultados

        for (int i = 0; i < cantidad; i++) {
            c[i] = a[i] + b[i];
        }

        return c;
    }

    //método para mostrar el menor del arreglo
    public int menorDelArreglo(int a[]) {
        int largo = a.length;
        int menor = 10000;  //suponiendo que no viene ninguno mayor en el arreglo

        for (int i = 0; i < largo; i++) {
            if (a[i] < menor) //si encuentro uno menor, que el menor que traia..
            {
                menor = a[i];                  //intercambio
            }
        }

        return menor;
    }

    //metodo para suma solo los valores pares
    public int sumaSoloPares(int a[]) {
        int acumulador = 0;

        //recorrer todo el arreglo
        for (int i = 0; i < a.length; i++) {
            //comprobar si el elemento iesimo es par
            if (a[i] % 2 == 0) {
                acumulador = acumulador + a[i];            //acumular 
            }
        }

        return acumulador;

    }

}
