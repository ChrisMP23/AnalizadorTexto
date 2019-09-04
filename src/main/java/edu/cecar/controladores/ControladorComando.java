/**
 * Clase: ControladorComando
 * 
 * @version: 0.1
 *  
 * @since: 31-ago-2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Yanvier Tamara Meriño
 * 
 * Copyrigth: CECAR
 */

package edu.cecar.controladores;

import edu.cecar.modelos.Comando;
import java.util.StringTokenizer;

/**
 *
 * clase que controla los comandos de entrada
 */
public class ControladorComando {
    
    public void entradaComando(String linea){
        
        String Datos=linea;
	StringTokenizer tokens=new StringTokenizer(Datos, "\\s");
        int numeroDatos=tokens.countTokens();
        
        String[]comandos =new String[numeroDatos];
        int i=0;
        while(tokens.hasMoreTokens()){
            comandos[i]=tokens.nextToken();
            i++;
        }
  
     
      
    }
    
    
    
}
