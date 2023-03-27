/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_super;

/**
 *
 * @author Usuario Final
 */
public class EVA2_9_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        estudiante1 alumno = new estudiante1("22550320", "Danna paola", "maldonado", 19);
        alumno.imprimirdatos();
        System.out.println("NO. de control: " + alumno.getNoCotrol());
        proveedores1 provee = new proveedores1("346537254", "Alberto", "Mendoza", 47);
        System.out.println("RFC: " + provee.getRFC());
        
    }
    
}
