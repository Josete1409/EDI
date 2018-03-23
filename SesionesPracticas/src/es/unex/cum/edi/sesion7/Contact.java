package es.unex.cum.edi.sesion7;

import java.util.Vector;

public class Contact {

	private String identificador;
	private Vector<Mensaje> v;
	
	public Contact() {
		identificador = new String();
		v = new Vector<Mensaje>();
	}
	
	public Contact(String identificador) {
		this.identificador = identificador;
		this.v = new Vector<Mensaje>();
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Vector<Mensaje> getV() {
		return v;
	}

	public boolean addMensaje(Mensaje m) {
		return v.add(m); 
	}
	
	@Override
	public String toString() {
		return "Contact [identificador=" + identificador + ", v=" + v + "]";
	}

	public boolean equals(Object o) {
		Contact c = (Contact) o;
		return (this.identificador.equals(c.identificador) && this.v.equals(c.v));
	}
	
}
