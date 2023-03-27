/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_override;

/**
 * 22550320
 * @author Danna Paola Maldonado Sepúlveda
 */
public class EVA2_10_OVERRIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Persona p1 = new Persona();//instanciar(guarda la memoria de la clase Persona)
     Persona p2 = new Persona("Pancho Villa", 83);
        System.out.println(p1);
        System.out.println(p2);
     
    }
    
}

class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "-----";
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString(){
        // no estamos invocando al metodo sobreescrito de
        //la superclase
        //aqui estamos reemplazando totalmente a toString de
        //la superclase
     String cade = "datos: \n" +
             "nombre:" +  nombre + "\n"+
             "edad:" + edad;
             return cade;
    }
}
