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
public class Persona1 {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona1() {
        this.nombre ="--------";
        this.apellido="--------";
        this.edad = 1;
    }
    
    public Persona1(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void imprimirdatos(){
        System.out.println("datos:");
        System.out.println("nombre: "+ this.nombre);
        System.out.println("apellido: "+ this.apellido);
        System.out.println("edad: "+ this.edad);
    }

}
