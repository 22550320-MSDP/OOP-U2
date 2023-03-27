/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;
import superclases.electronica;

/**
 *
 * @author Danna Paola
 */
public final class computadora extends electronica {
    private double tamaño;
    private int memoria;
    private String procesador;
    private String disco;

    public computadora(double tamaño, int memoria, String procesador, String disco) {
        super();
        this.tamaño = 0;
        this.memoria = 0;
        this.procesador = "";
        this.disco = "";
    }

    public computadora(double tamaño, int memoria, String procesador, String disco, String fabricante, int garantia, String modelo, double precio, String nombre, String unidad) {
        super(fabricante, garantia, modelo, precio, nombre, unidad);
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.procesador = procesador;
        this.disco = disco;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }
    
    @Override
    public double precioVenta(int cantidad) {
        //10 unidades ----> el precio es del 80%
        if(cantidad < 10)
        return precio* cantidad;
        else
            return (precio * 0.8) * 20;
    }

}
// computadora es una clase final 
// ya no se puede heredar de una clase final
/*class laptop extends computadora{
} */