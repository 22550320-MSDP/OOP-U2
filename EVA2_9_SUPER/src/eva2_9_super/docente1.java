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

public class docente1 extends Persona1 {
    private String plaza;

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    public docente1(){
     super();//la llamada al constructor de la superclse
        this.plaza ="";
    }
    public docente1(String plaza, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }


    public docente1(String plaza, int edad) {
        this.plaza = plaza;
    }
    
    
}
