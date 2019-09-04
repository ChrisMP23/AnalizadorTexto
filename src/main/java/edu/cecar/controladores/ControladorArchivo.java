/**
 * Clase: ControladorArchivo
 * 
 * @version: 0.1
 *  
 * @since: 25-ago-2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Yanvier Tamara Meriño
 * 
 * Copyrigth: CECAR
 */

package edu.cecar.controladores;

import edu.cecar.modelos.Archivo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;



/**
 *
 * Clase que controla las operaciones de los archivos
 */
public class ControladorArchivo {
    
    public void leer(Archivo archivo){
      File path;
      FileReader lector = null;
      BufferedReader buffer = null;

      try {
         path = new File (archivo.getDirectorio());
         lector = new FileReader (path);
         buffer = new BufferedReader(lector);
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         
         try{                    
            if( null != lector ){   
               lector.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
   }
    
    public void escribir(Archivo archivo){
        
        
    }
        
}
    


