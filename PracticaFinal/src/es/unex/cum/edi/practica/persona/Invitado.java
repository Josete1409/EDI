package es.unex.cum.edi.practica.persona;

/**
 * Clase Invitado que hereda de la clase Persona.
 * En primer lugar se debe llamar a un constructor y a continuacion llamar a los distintos métodos. 
 * 
 * @author Jose Anotnio Alvarez
 * @version 1
 * @see Class Persona
 * 
 */
public class Invitado extends Persona{

	/**
	 * Constructor por defecto de la clase Invitado.
	 */
	public Invitado() {
		super();
	}
	
	/**
	 * Constructor Parametrizado de la clase Invitado.
	 * @param id - Id de la persona.
	 * @param nombre - Nombre de la persona.
	 */
	public Invitado(String id, String nombre) {
		super(id, nombre);
	}

	/**
	 * Método que redefine el metodo toString() de la clase Object.
	 * @return Cadena con el formato de salida [] y el valor de todos los atributos.
	 */
	@Override
	public String toString() {
		return "Invitado [id=" + id + ", nombre=" + nombre + "]";
	}
	
	/**
	 * Metodo que redefine el metodo equals  de la clase Object.
	 * @return Booleano con la comparacion de todos los atributos.
	 */
	public boolean equals(Object o) {
		Invitado i = (Invitado) o;
		return (id.equals(i.id) && nombre.equals(i.nombre));
	}
}
