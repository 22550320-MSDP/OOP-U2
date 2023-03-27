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

// Clase derivada extends clase base
// subclase extends superclase
// hija clase extends clase padre
//estudiante is a persona
public class estudiante1 extends Persona1 {
    private String NoCotrol;
    
    // hay q incluir el constructor default
    public estudiante1() {
        super();//la llamada al constructor de la superclse
        this.NoCotrol ="";
    }

    public estudiante1(String NoCotrol, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.NoCotrol = NoCotrol;
    }
    
    

    public estudiante1(String NoCotrol) {
        this.NoCotrol = NoCotrol;
    }

    public String getNoCotrol() {
        return NoCotrol;
    }

    public void setNoCotrol(String NoCotrol) {
        this.NoCotrol = NoCotrol;
    }
    //OVERRIDE : reemplaza el metodo (con la misma firma) en la 
    //superclase, en este caso, reemplaza a imprimirdatos() de 
    //persona
    @Override
    public void imprimirdatos(){
        /*System.out.println("datos:");
        System.out.println("nombre:"+ getNombre());
        System.out.println("apellidos:"+getApellido());
        System.out.println("NO. de control: " + getNoCotrol());*/
        super.imprimirdatos();


}
    
}
