/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_super;

/**
 *
 * @author Usuario Final
 */
//proveedor is a persona
public class proveedores1 extends Persona1 {
    private String RFC;

    public proveedores1(String RFC) {
        this.RFC = RFC;
    }
    
    public proveedores1(){
    super();//la llamada al constructor de la superclse
        this.RFC ="";
    }
    
    public proveedores1(String RFC, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.RFC = RFC;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
}
