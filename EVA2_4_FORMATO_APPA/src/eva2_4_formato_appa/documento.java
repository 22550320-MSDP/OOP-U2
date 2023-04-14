/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_formato_appa;

/**
 *
 * @author Usuario Final
 */
public class documento {
    private String ciudad;
    private String titulo;
    private String autor;
    private String mes;
    private int dia;
    private int año;

    public documento() {
        this.ciudad = "";
        this.titulo = "";
        this.autor = "";
        this.mes = "";
        this.dia = 0;
        this.año = 0;
    }

    public documento(String ciudad, String titulo, String autor, String mes, int dia, int año) {
        this.ciudad = ciudad;
        this.titulo = titulo;
        this.autor = autor;
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}
