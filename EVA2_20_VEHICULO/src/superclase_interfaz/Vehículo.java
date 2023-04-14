/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclase_interfaz;

/**
 *
 * @author Danna Maldonado
 */
public class Vehículo implements Control_Velocidad{
    private int velocidad;
    private String marca;

    public Vehículo() {
    }

    public Vehículo(int velocidad, String marca) {
        this.velocidad = velocidad;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    @Override
    public void acelerar() {
        if(velocidad<=0){
        velocidad+= 10;
        }
    }

    @Override 
    public void detener() {
        if(velocidad>0){
            velocidad-= 10;
        }
        velocidad = 0;
    }

    @Override
    public void imprimirVelocidad() {
        System.out.println("la velocidad es:"+velocidad);
    }
    
    public void imprimirDatos(){
        System.out.println("Datos del vehículo:\n"
                + "marca:" + marca);
    }
}

