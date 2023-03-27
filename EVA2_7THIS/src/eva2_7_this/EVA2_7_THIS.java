/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_this;

/**
 *
 * @author Usuario Final
 */
public class EVA2_7_THIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // imprimir();
        // this no se puede usar en un contexto estatico
    }
        
    
    
    
    
    
    
    
    class persona{
      // this es una referencia a una instancia de la clase
    // todos los objetos tienen this 
    private String nombre;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
           //this.nombre es el atributo de la clase 
           // nombre es la variable (parámetro) declarado en el método
        }
    public void imprimirdatos(){
        System.out.println("el nombre es:" + this.nombre);
    }
    }

}
