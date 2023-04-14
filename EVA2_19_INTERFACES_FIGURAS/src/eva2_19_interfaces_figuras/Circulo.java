/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_interfaces_figuras;

/**
 *
 * @author Usuario Final
 */
public class Circulo implements Figuras, MonstrarDatos {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcularD(){
    double diametro = radio * 2;
        return diametro;
    }
    @Override
    public double calcularA(){
    double area = Math.PI * radio * radio ; 
    return area;
    }

    @Override
    public double calcularPeri() {
    double per = 2 * Math.PI * radio ;
    return per;
    }
    @Override
    public void imprimirDatos(){
        System.out.println("Circulo:");
        System.out.println("radio:" + radio);        
        System.out.println("diametro:" + calcularD());
        System.out.println("Area:"+calcularA());
        System.out.println("Perímetro:"+calcularPeri());
    }
}
