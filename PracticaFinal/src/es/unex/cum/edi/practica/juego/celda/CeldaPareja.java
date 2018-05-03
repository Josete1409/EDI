package es.unex.cum.edi.practica.juego.celda;

import java.util.Queue;


/**
 * Clase CeldaPareja que hereda de la clase Celda. Esta formada por la fila, la columna, la imageReverso, la imagenFrontal, el estado y el valor.
 * En primer lugar se debe llamar a un constructor y a continuacion llamar a los distintos métodos. 
 * 
 * @author Jose Anotnio Alvarez
 * @version 1
 * @see Class Celda
 * 
 */
public class CeldaPareja extends Celda {

	protected int valor=-1;
	
	/**
	 * Constructor por Defecto de la clase CeldaPareja.
	 */
	public CeldaPareja() {
		super();
		valor = -1;
	}
	
	/**
	 * Constructor Parametrizado de la clase CeldaPareja.
	 * @param fila - Número de fila.
	 * @param columna - Número de la columna.
	 */
	public CeldaPareja(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}
	
	/**
	 * Constructor Parametrizado de la clase CeldaPareja.
	 * @param imageReverso - Contenido del reverso de la celda.
	 * @param imagenFrontal - Contenido del frontal de la celda.
	 * @param estado - Estado de la celda.
	 * @param valor - Valor de la celda.
	 */
	public CeldaPareja(String imageReverso, String imagenFrontal, int estado, int valor) {
		this.imageReverso = imageReverso;
		this.imagenFrontal = imagenFrontal;
		this.estado = estado;
		this.valor = valor;
	}
	
	/**
	 *  Metodo que devuelve el valor de la celda.
	 * @return Numero entero que indica el valor de la celda.
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * Metodo que modifica el valor de la celda.
	 * @param valor - Numero entero que indicará el valor de la celda.
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * Método que redefine el metodo toString() de la clase Object.
	 * @return Cadena con el formato de salida [] y el valor de todos los atributos.
	 */
	public String toString() {
		return super.toString() + " CeldaPareja [valor=" + valor + "]";
	}
	
	/**
	 * Metodo que redefine el metodo equals  de la clase Object.
	 * @return Booleano con la comparacion de todos los atributos.
	 */
	public boolean equals(Object o) {
		CeldaPareja cp = (CeldaPareja) o;
		return (super.equals(cp) && valor == cp.valor);
	}
	
}
