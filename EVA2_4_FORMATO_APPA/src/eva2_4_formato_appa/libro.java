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
public class libro extends documento{
    private String tema;
    private int paginas;
    
    public libro(String tema, int paginas, String ciudad, String titulo, String autor, String mes, int dia, int año) {
        super(ciudad, titulo, autor, mes, dia, año);
        this.tema = tema;
        this.paginas = paginas;
    }

    public libro() {
        super();
        this.tema = "";
        this.paginas = 0;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
        
}
