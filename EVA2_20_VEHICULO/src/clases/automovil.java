/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import superclase_interfaz.Vehículo;

/**
 *
 * @author Usuario Final
 */
public class automovil extends Vehículo{
     private String modelo;
     private int año;

    public automovil() {
        super();
        this.modelo = "";
        this.año = 0;
    }

    public automovil(String modelo, int año, int velocidad, String marca) {
        super(velocidad, marca);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
