/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_poliformismo_figuras;

import java.util.Scanner;

/**
 *
 * @author Usuario Final
 */
public class EVA2_22_POLIFORMISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Un arreglo en java va de la posición 0 a la N-1
        //N es la cantidad de elementos del arreglo
        //int[] datos=new int[10];
        //circulo[] circulos=new circulo[10];       
        //for (int i = 0; i < circulos.length; i++) {
        //circulo[i]=new circulo(5);
        //circulo[i].imprimirDatos();
        figura[] figura;//Se declara un arreglo, pero no se ha creado
    // Con el Scanner capturamos por el teclado la cantidad de figuras a utilizar
        Scanner input = new Scanner(System.in); // el input permite capturar
        System.out.println("Figuras capturar"); 

        int cant = input.nextInt();
        figura = new figura[cant];//Se crea el arreglo con la cantidad de figuras que desea el usuario

        for (int i = 0; i < cant; i++) {
            System.out.println("Designa la figura a capturar: 1-Circulo, 2-Triangulo");
            int figu = input.nextInt();

            if (figu == 1) {
                circulo c = new circulo();
                System.out.println("Introduce radio");

                c.setRadio(input.nextDouble());
                figura[i] = c;
            } else {
                triangulo t = new triangulo();

                t.setAltura(input.nextDouble());
                t.setBase(input.nextDouble());
                figura[i] = t;
            }
        }

        for (int i = 0; i < figura.length; i++) {

            if (figura[i] instanceof circulo) {
                System.out.println("Círculo: " + i);
                //casting
                circulo c = (circulo) figura[i];
                c.imprimirDatos();
                //System.out.println("Area: "+figuras[i].calcularArea());
                //System.out.println("Perimetro: "+figuras[i].calcularPerimetro());
            } else {
                System.out.println("Triángulo: " + i);
                //casting
                triangulo t = (triangulo) figura[i];
                t.imprimirDatos();
                //System.out.println("Area: "+figuras[i].calcularArea());
                //System.out.println("Perimetro: "+figuras[i].calcularPerimetro());
            }

        }
//Polimorfismo: Es convertir un objeto de una subclase a un objeto de una superclase   
    }

}
