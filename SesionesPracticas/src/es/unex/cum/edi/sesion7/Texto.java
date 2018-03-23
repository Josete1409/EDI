package es.unex.cum.edi.sesion7;

import java.util.Date;

public class Texto extends Mensaje{
	
	protected String texto;
	
	public Texto() {
		super();
		this.texto = new String();
	}
	
	public Texto(Date fecha,String texto) {
		super(fecha);
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return super.toString() + "Texto [texto=" + texto + "]";
	}
	
	public boolean equals(Object o) {
		Texto t = (Texto) o;
		return (super.equals(t) && this.texto.equals(t.texto));
	}

}
