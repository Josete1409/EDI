package es.unex.cum.edi.sesion10;

public class Pdi extends Persona {
    private String dpto;

    public Pdi() {
    }

    public Pdi(String n, String a,String d, int e, String dpt) {
	super(n,a,d,e);
	dpto=dpt;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String val) {
        this.dpto = val;
    }
}
