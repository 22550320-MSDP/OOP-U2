/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_vehiculo;
import clases.automovil;
import superclase_interfaz.Vehículo;

/**
 *
 * @author Usuario Final
 */
public class EVA2_20_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         automovil auto = new automovil("tsuru", 2000, 0, "");
     auto.acelerar();
     auto.imprimirVelocidad();
     auto.imprimirDatos();
        System.out.println("datos del auto:\n"
                + "modelo:" + auto.getModelo() + 
                "\n año:" + auto.getAño() +
                "\n velocidad:" + auto.getVelocidad());
        
    }
    
}
