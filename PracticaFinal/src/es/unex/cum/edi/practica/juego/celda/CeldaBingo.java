package es.unex.cum.edi.practica.juego.celda;

/**
 * Clase CeldaBingo que hereda de la clase Celda. Esta formada por la fila, la columna, la imageReverso, la imagenFrontal, el estado y el numero.
 * En primer lugar se debe llamar a un constructor y a continuacion llamar a los distintos métodos. 
 * 
 * @author Jose Anotnio Alvarez
 * @version 1
 * @see Class Celda
 * 
 */
public class CeldaBingo extends Celda {

	protected int numero;
	
	/**
	 * Constructor por Defecto de la clase CeldaBingo.
	 */
	public CeldaBingo() {
		super();
		numero = -1;
	}
	
	/**
	 * Constructor Parametrizado de la clase CeldaBingo.
	 * @param fila - Número de fila.
	 * @param columna - Número de la columna.
	 */
	public CeldaBingo(int fila, int columna) {
		fila = -1;
		columna = -1;
	}

	/**
	 * Constructor Parametrizado de la clase CeldaBingo.
	 * @param imageReverso - Contenido del reverso de la celda.
	 * @param imagenFrontal - Contenido del frontal de la celda.
	 * @param estado - Estado de la celda.
	 * @param numero - Numero que contiene la celda.
	 */
	public CeldaBingo(String imageReverso, String imagenFrontal, int estado, int numero) {
		imageReverso = " ";
		imagenFrontal = " ";
		estado = -1;
		numero = -1;
	}

	/**
	 * Metodo que devuelve el numero de la celda.
	 * @return - Numero que contiene la celda
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Metodo que modifica el numero de la celda.
	 * @param numero - Numero entero que contiene la celda.
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Método que redefine el metodo toString() de la clase Object.
	 * @return Cadena con el formato de salida [] y el valor de todos los atributos.
	 */
	public String toString() {
		return super.toString() + " CeldaBingo [numero=" + numero + "]";
	}
	
	/**
	 * Metodo que redefine el metodo equals  de la clase Object.
	 * @return Booleano con la comparacion de todos los atributos.
	 */
	public boolean equals(Object o) {
		CeldaBingo cb = (CeldaBingo) o;
		return (super.equals(cb) && numero == cb.numero);
	}
}
