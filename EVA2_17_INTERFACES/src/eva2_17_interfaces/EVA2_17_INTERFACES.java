/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_interfaces;

/**
 *
 * @author
 */
public class EVA2_17_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        MostrarDatos datos=new MostrarDatos();

        persona persona = new persona("alfonso", 30);
        persona.imprimirDatos();

        computadora compu = new computadora("Intel i8", 12, 25000, "Computadora");
        compu.imprimirDatos();
    }

}

class computadora extends producto implements mostrar_datos {

    private String procesador;
    private int memoria;

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public computadora(String procesador, int memoria, double precio, String nombre) {
        super(precio, nombre);
        this.procesador = procesador;
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public void imprimirDatos() {
        System.out.println(getNombre());
        System.out.println(getPrecio());
        System.out.println(procesador);
        System.out.println(memoria);
    }

}
