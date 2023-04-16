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
public class triangulo implements figura,MostrarDatos {
    private double h;
    private double b;

    public double getAltura() {
        return h;
    }

    public void setAltura(double altura) {
        this.h = altura;
    }

    public double getBase() {
        return b;
    }

    public void setBase(double base) {
        this.b = base;
    }
    public double calcularArea(){
        return (b*h)/2;
    }
    public double calcularPerimetro(){
        return b*3;
    }
    
    public void imprimirDatos() {
        System.out.println("Area: "+calcularArea());
        System.out.println("Perimetro: "+calcularPerimetro());
    }
}
//clases abstractas solo sirven para generalizar, no para crear objetos
//solo para heredar, como superclases

//metodos abstractos sirven solo para cuando hereden lo tengan y 
//este obligado a reescribirlo

//interfaces es un tipo de dato abstracto pero solo tiene metodos abstractos