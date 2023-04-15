/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_21_poliformismo;

/**
 *
 * @author Usuario Final
 */

// Clase derivada extends clase base
// subclase extends superclase
// hija clase extends clase padre
//estudiante is a persona
public class estudiante extends Persona {
    private String NoCotrol;

    public String getNoCotrol() {
        return NoCotrol;
    }

    public void setNoCotrol(String NoCotrol) {
        this.NoCotrol = NoCotrol;
    }
    public estudiante() {
        super();//llamada al constructor de la clase
        this.NoCotrol = "-----";
    }

    public estudiante(String NoCotrol, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.NoCotrol = NoCotrol;
    }
    
    
    //para sobreescribir el metodo de persona
    //reemplaza el metodo (con la misma firma) de la superclase
    @Override
    public void imprimirDatos(){        
        super.imprimirDatos();//de la superclase
        System.out.println("No. control: " + NoCotrol);// lo que se agregue
    }
    

}

