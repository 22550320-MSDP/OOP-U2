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
public abstract class ropa extends producto {
    private String color;
    private String marca;

    public ropa() {
        super();
        this.color = "";
        this.marca = "";
    }

    public ropa(String color, String marca, double precio, String nombre, String unidad) {
        super(precio, nombre, unidad);
        this.color = color;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    

}
