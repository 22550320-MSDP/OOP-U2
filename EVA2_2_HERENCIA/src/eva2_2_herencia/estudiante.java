/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_herencia;

/**
 *
 * @author Usuario Final
 */
public class estudiante {
    private String nombre;
    private String apellido;
    private String num_control;
    private int edad;

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

    public String getNum_control() {
        return num_control;
    }

    public void setNum_control(String num_control) {
        this.num_control = num_control;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public estudiante(String nombre, String apellido, String num_control, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_control = num_control;
        this.edad = edad;
    }
    
}
