package es.unex.cum.edi.practica.persona;

import java.io.Serializable;
import java.util.ArrayList;

import es.unex.cum.edi.practica.juego.Jugada;

/**
 * Clase Jugador que hereda de la clase Persona. Esta formada por el id de la persona, nombre de la persona y una lista de sus jugadas.
 * En primer lugar se debe llamar a un constructor y a continuacion llamar a los distintos métodos. 
 * 
 * @author Jose Anotnio Alvarez
 * @version 1
 * @see Class Persona
 * @see Class Jugada
 * 
 */
public class Jugador extends Persona implements Serializable {

	protected ArrayList<Jugada>lista;
	
	/**
	 * Constructor por Defecto de la clase Jugador.
	 */
	public Jugador() {
		super();
		lista = new ArrayList<Jugada>();
	}
	
	/**
	 * Constructor Parametrizado de la clase Jugador.
	 * @param id - Id de la persona.
	 * @param nombre - Nombre de la persona.
	 */
	public Jugador(String id, String nombre) {
		super(id, nombre);
		lista = new ArrayList<Jugada>();
	}
	
	/**
	 * Metodo que devuelve la lista de jugadas.
	 * @return - Lista de jugadas.
	 */
	public ArrayList<Jugada> getArrayList(){
		return lista;
	}
	
	/**
	 * Metodo que añade una jugada a la lista.
	 * @param j - Nueva jugada.
	 */
	public void addJugada(Jugada j) {
		lista.add(j);
	}
	
	/**
	 * Método que redefine el metodo toString() de la clase Object.
	 * @return Cadena con el formato de salida [] y el valor de todos los atributos.
	 */
	@Override
	public String toString() {
		return "Jugador [lista=" + lista + "]";
	}
	
	/**
	 * Metodo que redefine el metodo equals  de la clase Object.
	 * @return Booleano con la comparacion de todos los atributos.
	 */
	public boolean equals(Object o) {
		Jugador j = (Jugador) o;
		return (id.equals(j.id) && nombre.equals(j.nombre) && lista.equals(j.lista));
	}
}
