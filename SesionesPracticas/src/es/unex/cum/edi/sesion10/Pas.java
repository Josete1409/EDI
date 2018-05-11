package es.unex.cum.edi.sesion10;

public class Pas extends Persona {
    private String categoria;

    private float salario;

    public Pas() {
    }

    public Pas(String n, String a,String d, int e, String cat, float sal) {
	super(n,a,d,e);
	categoria=cat;
	salario=sal;
    }


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String val) {
        this.categoria = val;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float val) {
        this.salario = val;
    }
}
