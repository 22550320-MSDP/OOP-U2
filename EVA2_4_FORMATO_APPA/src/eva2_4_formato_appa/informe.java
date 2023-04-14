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
public class informe extends documento{
    private String tipo_informe;
    private String editorial;

    public informe() {
        super();
        this.tipo_informe = "";
        this.editorial = "";
    }

    public informe(String tipo_informe, String editorial, String ciudad, String titulo, String autor, String mes, int dia, int año) {
        super(ciudad, titulo, autor, mes, dia, año);
        this.tipo_informe = tipo_informe;
        this.editorial = editorial;
    }

    public String getTipo_informe() {
        return tipo_informe;
    }

    public void setTipo_informe(String tipo_informe) {
        this.tipo_informe = tipo_informe;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
