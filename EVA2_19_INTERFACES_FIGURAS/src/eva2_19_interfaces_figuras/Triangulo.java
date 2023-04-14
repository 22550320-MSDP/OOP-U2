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
public class Triangulo implements Figuras, MonstrarDatos  {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
     @Override
    public double calcularA(){
    double area = (base * altura)/2 ; 
    return area;
    }

    @Override
    public double calcularPeri() {
    double h = Math.hypot(base, altura);
    double per = altura + h + base;
    return per;
    }
    @Override
    public void imprimirDatos(){
        System.out.println("Altura:"+ altura);
        System.out.println("base:"+ base);
        System.out.println("area:"+calcularA());
        System.out.println("perímetro:"+calcularPeri());

    }
    
}
