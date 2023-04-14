/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_override_figuras;

/**
 *
 * @author Usuario Final
 */
public class triangulo extends figura {
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
    @Override
    public double calcularArea(){
        return (b*h)/2;
    }
    
    @Override
    public double calcularPerimetro(){
        return b*3;
    }
    
    @Override
    public String toString(){
        //no estamos invocando al metdo sobreescrito de la clase, lo reemplazamos de la superclase
        String cade="Datos triangulo:\n"
                +"Area: " + calcularArea()+"\n"+
                "Perimetro: " + calcularPerimetro();
        
        return cade;
    }
}
//clases abstractas solo sirven para generalizar, no para crear objetos
//solo para heredar, como superclases

//metodos abstractos sirven solo para cuando hereden lo tengan y 
//este obligado a reescribirlo

//interfaces es un tipo de dato abstracto pero solo tiene metodos abstractos