/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclases;

/**
 *
 * @author Danna paola
 */
public abstract class producto {
    protected double precio;
    private String nombre;
    private String unidad;

    public producto() {
        this.precio = 0;
        this.nombre = "";
        this.unidad = "";
    }

    public producto(double precio, String nombre, String unidad) {
        this.precio = precio;
        this.nombre = nombre;
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    public abstract double precioVenta(int cantidad);
}
