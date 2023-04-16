/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_poliformismo_figuras;

/**
 *
 * @author Usuario Final
 */
public class circulo implements figura,MostrarDatos {
        
    private double radio;
    
    /*
    public Circulo() {
        this.radio = 0;
    }
    public Circulo(double radio) {
        this.radio = radio;
    }*/
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    public double calcularArea(){
        return Math.PI*(radio*radio);
    }
    
    public double calcularPerimetro(){
        return Math.PI*(radio*2);
    }
    
    @Override
    public void imprimirDatos() {
        System.out.println("el radio es:"+radio);
        System.out.println("el área es: "+calcularArea());
        System.out.println("el perímetro es: "+calcularPerimetro());
    }
}
