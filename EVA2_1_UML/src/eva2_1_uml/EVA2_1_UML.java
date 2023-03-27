/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_uml;
import Misclases.Persona;
import Misclases.TV;
import Misclases.Vehiculo;

/**
 * DANNA PAOLA MALDONADO SEPÚLVEDA NO.CONTROL - 22550320
 * @author Usuario Final
 */
public class EVA2_1_UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Persona persona=new Persona();
        persona.setId(24);
        persona.setNombre("pancho");
        persona.setEdad(80);
        persona.imprimirDatos();
        
        
        
        Vehiculo auto=new Vehiculo();
        auto.setMarca("");
        auto.setModelo("");
        auto.setAño(2001);
        auto.imprimirDatos();
        
        
        
        TV tele=new TV();
        tele.setCanal(16);
        tele.setVolumen(32);
        tele.setPower(true);
        tele.imprimirDatos();
    }
    
}
