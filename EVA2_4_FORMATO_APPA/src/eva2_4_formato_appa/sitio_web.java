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
public class sitio_web extends documento{
    private String url;
    private String nombre_de_pagina;

    public sitio_web() {
        super();
        this.url = "";
        this.nombre_de_pagina = "";
    }

    public sitio_web(String url, String nombre_de_pagina, String ciudad, String titulo, String autor, String mes, int dia, int año) {
        super(ciudad, titulo, autor, mes, dia, año);
        this.url = url;
        this.nombre_de_pagina = nombre_de_pagina;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombre_de_pagina() {
        return nombre_de_pagina;
    }

    public void setNombre_de_pagina(String nombre_de_pagina) {
        this.nombre_de_pagina = nombre_de_pagina;
    }
    
    
}
