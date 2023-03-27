/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misclases;

/**
 * Danna Paola Maldonado Sepúlveda - NO.Control=22550320
 * @author Usuario Final
 */
public class Vehiculo {

    private int año;
    private String marca;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public void setMarca(String valor) {
        marca = valor;
    }

    public void setModelo(String valor) {
        modelo = valor;
    }

    public void setAño(int valor) {
        año = valor;
    }

    public void imprimirDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + año);
    }
}
