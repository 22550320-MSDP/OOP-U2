/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_extends;

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

    public estudiante() {
    }

    public estudiante(String NoCotrol) {
        this.NoCotrol = NoCotrol;
    }

    public String getNoCotrol() {
        return NoCotrol;
    }

    public void setNoCotrol(String NoCotrol) {
        this.NoCotrol = NoCotrol;
    }
    
}
