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
public class Persona {
     private int edad;
     private String nombre;
     private String ID;
     public String getID(){
         return ID;
     }
     public String getnombre(){
         return nombre;
     }
     public int getedad(){
         return edad;
     }
     public void setnombre(String valor){
         nombre = valor; 
     }
     public void setID(String valor){
         ID = valor; 
     }
     public void setEdad(int valor){
         edad = valor; 
     }
      public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("ID: " + ID);
    }
}

