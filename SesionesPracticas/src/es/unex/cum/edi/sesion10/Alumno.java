
package es.unex.cum.edi.sesion10;
/**
 *
 * @author ljarevalo
 */
public class Alumno extends Persona {
    private int curso=1;
    private String titulacion = "";
    public Alumno() {
	super();
    }
    public Alumno(String n, String a,String d, int e, String tit) {
	super(n,a,d,e);
	titulacion=tit;
    }
    public int getCurso() {
        return curso;
    }
    public void setCurso(int val) {
        this.curso = val;
    }
    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String val) {
        this.titulacion = val;
    }
   public String toString(){ 
        String temp="Alumno: "+super.get_nombre()+ " Dni: "+super.get_dni()+ " Titulacion:"   
                          +this.titulacion;
        return temp;
    }
}