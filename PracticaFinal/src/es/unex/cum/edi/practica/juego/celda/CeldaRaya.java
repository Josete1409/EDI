package es.unex.cum.edi.practica.juego.celda;

/**
 * Clase CeldaRaya que hereda de la clase Celda. Esta formada por la fila, la columna, la imageReverso, la imagenFrontal, el estado y el color.
 * En primer lugar se debe llamar a un constructor y a continuacion llamar a los distintos métodos. 
 * 
 * @author Jose Anotnio Alvarez
 * @version 1
 * @see Class Celda
 * 
 */
public class CeldaRaya extends Celda {

	protected int color;
	
	/**
	 * Constructor por Defecto de la clase CeldaRaya.
	 */
	public CeldaRaya() {
		super();
		color = -1;
	}
	
	/**
	 * Constructor Parametrizado de la clase CeldaRaya.
	 * @param fila - Número de fila.
	 * @param columna - Número de la columna.
	 */
	public CeldaRaya(int fila, int columna) {
		fila = -1;
		columna = -1;
	}
	
	/**
	 * Constructor Parametrizado de la clase CeldaRaya.
	 * @param imageReverso - Contenido del reverso de la celda.
	 * @param imagenFrontal - Contenido del frontal de la celda.
	 * @param estado - Estado de la celda.
	 * @param color - Color de la celda.
	 */
	public CeldaRaya(String imageReverso, String imagenFrontal, int estado, int color) {
		imageReverso = " ";
		imagenFrontal = " ";
		estado = -1;
		color = -1;
	}

	/**
	 *  Metodo que devuelve el color de la celda.
	 * @return Numero entero entre 0-1 que indica el color al que pertenece la celda.
	 */
	public int getColor() {
		return color;
	}

	/**
	 * Metodo que cambia el color de la celda.
	 * @param color - Numero entero entre 0-1 que indicara el color de la celda.
	 */
	public void setColor(int color) {
		this.color = color;
	}

	/**
	 * Método que redefine el metodo toString() de la clase Object.
	 * @return Cadena con el formato de salida [] y el valor de todos los atributos.
	 */
	public String toString() {
		return super.toString() + " CeldaRaya [color=" + color + "]";
	}
	
	/**
	 * Metodo que redefine el metodo equals  de la clase Object.
	 * @return Booleano con la comparacion de todos los atributos.
	 */
	public boolean equals(Object o) {
		CeldaRaya cr = (CeldaRaya) o;
		return (super.equals(cr) && color == cr.color);
	}
	
}
