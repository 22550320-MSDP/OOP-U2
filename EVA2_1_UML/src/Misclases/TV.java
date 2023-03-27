/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misclases;

/**
 *
 * @author Usuario Final
 */
public class TV {
    private int canal;
    private int volumen;
    private boolean power;
    
    
    public void setCanal(int valor){
        canal=valor;
    }
    public void setVolumen(int valor){
        volumen = valor;
    }
    public void setPower(boolean valorb){
       power=valorb;
    }
    
    
    public int getCanal(){
        return canal;
    }
    public int getVolumen(){
        return volumen;
    }
    public boolean getPower(){
        return power;
    }
    
    
    public void imprimirDatos(){
        System.out.println("Canal: "+canal);
        System.out.println("Volumen: "+volumen);
        System.out.println("Power: "+power);
    }
}
