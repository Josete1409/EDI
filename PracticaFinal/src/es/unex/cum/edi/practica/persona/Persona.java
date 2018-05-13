package es.unex.cum.edi.practica.persona;

import java.io.Serializable;

import es.unex.cum.edi.practica.juego.Jugada;

/**
 * Clase Persona - Clase Padre. Esta formada por el id y el nombre.
 * En primer lugar se debe llamar a un constructor y a continuacion llamar a los distintos métodos. 
 * 
 * @author Jose Anotnio Alvarez
 * @version 1
 * 
 */
public class Persona implements Serializable {

	protected String id;
	protected String nombre;
	
	/**
	 * Constructor por Defecto de la clase Persona.
	 */
	public Persona() {
		id = new String();
		nombre = new String();
	}
	
	/**
	 * Constructor Parametrizado de la clase Persona.
	 * @param id - Id de la persona
	 * @param nombre - Nombre de la persona
	 */
	public Persona(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * Metodo que devuelve el id.
	 * @return - Id de la persona.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Metodo que modifica el id.
	 * @param id - Modifica el id de la persona.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Metodo que devuelve el nombre.
	 * @return - Nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que modifica el nombre.
	 * @param nombre - Modifica el nombre de la persona.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método que redefine el metodo toString() de la clase Object.
	 * @return Cadena con el formato de salida [] y el valor de todos los atributos.
	 */
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	
	/**
	 * Metodo que redefine el metodo equals  de la clase Object.
	 * @return Booleano con la comparacion de todos los atributos.
	 */
	public boolean equals(Object o) {
		Persona p = (Persona) o;
		return (id.equals(p.id) && nombre.equals(p.nombre));
	}

}
