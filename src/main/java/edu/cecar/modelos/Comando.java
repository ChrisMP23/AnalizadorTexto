/**
 * Clase: Comando
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

package edu.cecar.modelos;

/**
 *
 * clase
 */
public class Comando {
    
    private String comando1;
    private int valor1;
    private String comando2;
    private int valor2;
    private String comando3;
    private int valor3;
    private String ruta;

    public Comando(String comando1, int valor1, String ruta) {
        this.comando1 = comando1;
        this.valor1 = valor1;
        this.ruta = ruta;
    }

    public Comando(String comando1, int valor1, String comando2, int valor2, String ruta) {
        this.comando1 = comando1;
        this.valor1 = valor1;
        this.comando2 = comando2;
        this.valor2 = valor2;
        this.ruta = ruta;
    }

    public Comando(String comando1, int valor1, String comando2, int valor2, String comando3, int valor3, String ruta) {
        this.comando1 = comando1;
        this.valor1 = valor1;
        this.comando2 = comando2;
        this.valor2 = valor2;
        this.comando3 = comando3;
        this.valor3 = valor3;
        this.ruta = ruta;
    }

    public Comando(String ruta) {
        this.ruta = ruta;
    }

    public String getComando1() {
        return comando1;
    }

    public void setComando1(String comando1) {
        this.comando1 = comando1;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public String getComando2() {
        return comando2;
    }

    public void setComando2(String comando2) {
        this.comando2 = comando2;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public String getComando3() {
        return comando3;
    }

    public void setComando3(String comando3) {
        this.comando3 = comando3;
    }

    public int getValor3() {
        return valor3;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    

}
