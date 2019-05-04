/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author flocy
 */
public class Fichero {
    
    
    
    public boolean generarArchivo(){
        // TODO code application logic here
        boolean generado = false;
        File archivo = null;
        FileWriter fr = null;
        BufferedWriter br = null;
        int contador = 0;
        int numero = 0;
        int numeroAnt = 0;
        try {

            archivo = new File("pruebaNumeros.txt");
            fr = new FileWriter(archivo);
            br = new BufferedWriter(fr);

            // Escritura del fichero
            
            for (int i = 1; i <= 1000000; i++) {
               br.write(""+i);
               br.newLine();
            }
            
            br.close();
            generado = true;
        } catch (Exception e) {
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {

            }
        }
        
        return generado;
    }
}
