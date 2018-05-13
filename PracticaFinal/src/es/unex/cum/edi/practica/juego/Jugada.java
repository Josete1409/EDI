package es.unex.cum.edi.practica.juego;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase Jugada. Esta formada por el tiempo y la fecha.
 * En primer lugar se debe llamar a un constructor y a continuacion llamar a los distintos métodos. 
 * 
 * @author Jose Anotnio Alvarez
 * @version 1
 * 
 */
public class Jugada implements Serializable{

	public long tiempo;
	public Date fecha;
	
	/**
	 * Constructor por Defecto de la clase Jugada.
	 */
	public Jugada() {
		tiempo = -1;
		fecha = new Date();
	}
	
	/**
	 * Constructor Parametrizado de la clase Jugada.
	 * @param tiempo - Tiempo de la jugada.
	 * @param fecha - Fecha de la jugada.
	 */
	public Jugada(long tiempo, Date fecha) {
		this.tiempo = tiempo;
		this.fecha = fecha;
	}
	
	/**
	 * Metodo de devuelve el tiempo.
	 * @return - Tiempo de la jugada.
	 */
	public long getTiempo() {
		return tiempo;
	}
	
	/**
	 * Metodo que modifica el tiempo.
	 * @param tiempo - Modifica el tiempo de la jugada.
	 */
	public void setTiempo(long tiempo) {
		this.tiempo = tiempo;
	}
	
	/**
	 * Metodo que devuelve la fecha.
	 * @return - La fecha de la jugada.
	 */
	public Date getFecha() {
		return fecha;
	}
	
	/**
	 * Metodo que modifica la fecha. 
	 * @param fecha - Modifica la fecha de la jugada.
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * Método que redefine el metodo toString() de la clase Object.
	 * @return Cadena con el formato de salida [] y el valor de todos los atributos.
	 */
	@Override
	public String toString() {
		return "Jugada [Tiempo: "+this.tiempo+", Fecha: "+this.fecha+"]";
	}
	
	/**
	 * Metodo que redefine el metodo equals  de la clase Object.
	 * @return Booleano con la comparacion de todos los atributos.
	 */
	public boolean equals(Object o) {
		Jugada jd = (Jugada) o;
		return (tiempo == jd.tiempo && fecha.equals(jd.fecha));
	}
}
