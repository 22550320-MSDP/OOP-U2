/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_super;

/**
 *
 * @author Usuario Final
 */
public class EVA2_8_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a = new Animal();
        
    }
}

class Animal {

    private String Nombre;
    private int peso;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Animal() {
        System.out.println("IT´S ALIVE!!!");

    }
}
class mamifero extends Animal{
    private String colorpelo;
    
}