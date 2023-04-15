/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_21_poliformismo;

/**
 *
 * @author Usuario Final
 */
public class EVA2_21_POLIFORMISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        cuando se usa Is a
        //        tratar objetos de las subclases como objetos de la superclase
        //al reves no
        
        estudiante alumno =new estudiante("22550320", "Danna Paola", "Maldonado Sepúlveda", 18);
        alumno.imprimirDatos();
        docente maestro = new docente("JHVEB63524", "Alfonso", "Martinez", 65);
        maestro.imprimirDatos();
        //polimorfismo es
        //una variable de tipo persona 
        //es un estudiante pero lo va a tratar como una persona
        //lo convierte en una persona y oculta cosas
        Persona p1 = alumno;
        //perso1.13
        Persona p2 = maestro;
        Persona p3 = new Persona();

         //Estudiantes1 estudiante = perso3; <--- no se puede
        //Es imposible convertir una persona en un estudiante 
        //No se pueden agregar cosas, solo se ocultan propiedades
    
         //un Estudiante SI is-a (es-un) persona 
         //una Persona NO is-a (es-un) estudiante
    }
}
