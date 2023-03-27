/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_protected;

/**
 *
 * @author Usuario Final
 */
public class EVA2_16_PROTECTED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SuperClases sp = new SuperClases();
        sp.dato = 300;
    }
    
}
class SuperClases{
protected int dato;
    }

class SubClase extends SuperClases{
public void ImprimirDatos(){
    System.out.println("el valor del dato es:"+ dato );

 }
}
