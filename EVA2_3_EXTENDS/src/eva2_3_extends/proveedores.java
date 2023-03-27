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
//proveedor is a persona
public class proveedores extends Persona {
    private String RFC;

    public proveedores(String RFC) {
        this.RFC = RFC;
    }

    public proveedores() {
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
}
