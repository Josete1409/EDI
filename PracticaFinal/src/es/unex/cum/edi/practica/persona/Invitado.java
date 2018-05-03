package es.unex.cum.edi.practica.persona;

public class Invitado extends Persona{

	public Invitado() {
		super();
	}

	@Override
	public String toString() {
		return "Invitado [id=" + id + ", nombre=" + nombre + "]";
	}
	
	public boolean equals(Object o) {
		Invitado i = (Invitado) o;
		return (id.equals(i.id) && nombre.equals(i.nombre));
	}
}
