/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_interfaces_figuras;

/**
 *
 * @author Usuario Final
 */
public class EVA2_19_INTERFACES_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circulo c = new Circulo(20);
       c.imprimirDatos();
       
       Triangulo t = new Triangulo(20,20);
       t.imprimirDatos();
    }
    
}
