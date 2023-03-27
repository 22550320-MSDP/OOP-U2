/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclases;

/**
 *
 * @author Danna Paola
 */
public abstract class electronica extends producto {
    
       private String fabricante;
       private int garantia; // dias de garantia 
       private String modelo;

    public electronica() {
        super();
        this.fabricante = "";
        this.garantia = 0;
        this.modelo = "";
    }
    public electronica(String fabricante, int garantia, String modelo, double precio, String nombre, String unidad) {
        super(precio, nombre, unidad);
        this.fabricante = fabricante;
        this.garantia = garantia;
        this.modelo = modelo;
    }

    

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
       
       

}
