package es.unex.cum.edi.practica.persona;

import java.io.Serializable;

public class Persona implements Serializable {

	protected String id;
	protected String nombre;
	
	public Persona() {
		id = new String();
		nombre = new String();
	}
	
	public Persona(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	
	public boolean equals(Object o) {
		Persona p = (Persona) o;
		return (id.equals(p.id) && nombre.equals(p.nombre));
	}
}
