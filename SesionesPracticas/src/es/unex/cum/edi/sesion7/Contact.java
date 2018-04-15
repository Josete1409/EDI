package es.unex.cum.edi.sesion7;

import java.util.Vector;

public class Contact {

	private String identificador;
	private Vector<Mensaje> v;
	private String name;
	
	public Contact() {
		identificador = new String();
		name = new String();
		v = new Vector<Mensaje>();
	}
	
	public Contact(String identificador, String name) {
		this.identificador = identificador;
		this.name = name;
		this.v = new Vector<Mensaje>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Contact [identificador=" + identificador + ", name=" + name +", v=" + v + "]";
	}

	public boolean equals(Object o) {
		Contact c = (Contact) o;
		return (this.identificador.equals(c.identificador) && this.name.equals(c.name) && this.v.equals(c.v));
	}
	
}
