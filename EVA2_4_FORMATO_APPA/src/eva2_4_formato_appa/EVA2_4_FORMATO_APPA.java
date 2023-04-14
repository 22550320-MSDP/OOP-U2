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
public class EVA2_4_FORMATO_APPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear super clase documento
        //tiene ciudad, año, titulo, autor, mes, dia
        //subclases:
        //heredar de documento y agregar dos campos adicionales:
        // LIBRO
        // SITIO WEB
        // ARTICULOS
        //INFORME
        
        sitio_web sitio = new sitio_web();
        sitio.setTitulo("La casa de los espiritus: un libro entre lo paranormal y lo historico");
        sitio.setAutor("Martin Martinez");
        sitio.setAño(2011);
        sitio.setCiudad("-----");
        sitio.setDia(26);
        sitio.setMes("marzo");
        sitio.setNombre_de_pagina("----");
        sitio.setUrl("www.analisisdelibros.com");
        
        System.out.println("referencia del sitio web en formato APA");
        System.out.println("Titulo: " + sitio.getTitulo());
        System.out.println("Autor: "+ sitio.getAutor());
        System.out.println("Ciudad: "+ sitio.getCiudad());
        System.out.println("Año: "+ sitio.getAño());
        System.out.println("Mes: "+ sitio.getMes());
        System.out.println("Dia: "+ sitio.getDia());
        System.out.println("nombre del sitio: "+ sitio.getNombre_de_pagina());
        System.out.println("url: "+ sitio.getUrl());
    }
    
}
