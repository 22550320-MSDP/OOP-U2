/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_extends;

/**
 *
 * @author Usuario Final
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        estudiante alumno = new estudiante();
        alumno.setNombre("Ronerto");
        alumno.setEdad(19);
        alumno.setApellido("Caballero");
        alumno.setNoCotrol("098774628764");
        
        System.out.println("datos del estudiante:");
        System.out.println("nombre:" + alumno.getNombre());
        System.out.println("apellido:" + alumno.getApellido());
        System.out.println("numero de control:" + alumno.getNoCotrol());
        System.out.println("edad:" + alumno.getEdad());
        
        docente profe = new docente();
        profe.setNombre("");
        profe.setApellido("");
        profe.setEdad(45);
        profe.setPlaza("");
        
        System.out.println("datos del profesor:");
        System.out.println("nombre:" + profe.getNombre());
        System.out.println("apellido:" + profe.getApellido());
        System.out.println("numero de plaza:" + profe.getPlaza());
        System.out.println("edad:" + profe.getEdad());
        
        proveedores provee = new proveedores();
        provee.setRFC("");
        provee.setNombre("");
        provee.setApellido("");
        provee.setEdad(35);
        
        System.out.println("datos del profesor:");
        System.out.println("nombre:" + provee.getNombre());
        System.out.println("apellido:" + provee.getApellido());
        System.out.println("RFC:" + provee.getRFC());
        System.out.println("edad:" + profe.getEdad());

    }
    
}
