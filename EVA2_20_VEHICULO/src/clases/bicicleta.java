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
public class bicicleta extends Vehículo{
    private String tipo;
    private String color;

    public bicicleta() {
        super();
        this.tipo = "";
        this.color = "";
    }

    public bicicleta(String tipo, String color, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
