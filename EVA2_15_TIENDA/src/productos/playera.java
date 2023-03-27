/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import superclases.ropa;

/**
 * Talla: cadena -----> L, XL, M, CH, XCH
 * Tipo: cadena 
 * @author Danna Paola
 */
public class playera extends ropa{
    private String talla;
    private String tipo;

    public playera() {
        super();
        this.talla = "";
        this.tipo = "";
    }

    public playera(String talla, String tipo, String color, String marca, double precio, String nombre, String unidad) {
        super(color, marca, precio, nombre, unidad);
        this.talla = talla;
        this.tipo = tipo;
    }
    
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public double precioVenta(int cantidad) {
        //10 unidades ----> el precio es del 80%
        if(cantidad < 10)
        return precio * cantidad;
        else
            return (precio * 0.8) * 20;
    }
}
