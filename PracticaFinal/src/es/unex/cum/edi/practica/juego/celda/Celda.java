package es.unex.cum.edi.practica.juego.celda;

/**
 * Clase Celda tipo abstracta. Esta formada por la fila, la columna, la imageReverso, la imagenFrontal y el estado.
 * En primer lugar se debe llamar a un constructor y a continuacion llamar a los distintos métodos. 
 * 
 * @author Jose Anotnio Alvarez
 * @version 1
 * 
 */
public abstract class Celda {

	protected int fila;
	protected int columna;
	protected String imageReverso;
	protected String imagenFrontal;
	protected int estado;
	
	/**
	 * Constructor por Defecto de la clase Celda.
	 */
	public Celda() {
		fila = 0;
		columna = 0;
		imageReverso = new String();
		imagenFrontal = new String();
		estado = 0;
	}
	
	/**
	 * Constructor Parametrizado de la clase Celda.
	 * @param fila - Número de fila.
	 * @param columna - Número de la columna.
	 */
	public Celda(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}
	
	/**
	 * Constructor Parametrizado de la clase Celda.
	 * @param imageReverso - Contenido del reverso de la celda.
	 * @param imagenFrontal - Contenido del frontal de la celda.
	 * @param estado - Estado de la celda.
	 */
	public Celda(String imageReverso, String imagenFrontal, int estado) {
		this.imageReverso = imageReverso;
		this.imagenFrontal = imagenFrontal;
		this.estado = estado;
	}

	/**
	 * Metodo que devuelve la fila.
	 * @return - Numero de la fila.
	 */
	public int getFila() {
		return fila;
	}

	/**
	 * Metodo que modifica la fila.
	 * @param fila - Modifica el valor de la fila.
	 */
	public void setFila(int fila) {
		this.fila = fila;
	}

	/**
	 * Metodo que devuelve la columna.
	 * @return - Numero de la columna.
	 */
	public int getColumna() {
		return columna;
	}

	/**
	 * Metodo que modifica la columna.
	 * @param columna - Modifica el valor de la columna.
	 */
	public void setColumna(int columna) {
		this.columna = columna;
	}

	/**
	 * Metodo que devuelve la imageReverso.
	 * @return - Cadena de imageReverso.
	 */
	public String getImageReverso() {
		return imageReverso;
	}

	/**
	 * Metodo que modifica la imageReverso.
	 * @param imageReverso - Modifica la cadena imageReverso.
	 */
	public void setImageReverso(String imageReverso) {
		this.imageReverso = imageReverso;
	}

	/**
	 * Metodo que devuelve la imagenFrontal
	 * @return - Cadena de imagenFrontal
	 */
	public String getImagenFrontal() {
		return imagenFrontal;
	}

	/**
	 * Metodo que modifica la imagenFrontal
	 * @param imagenFrontal - Modifica la cadena imagenFrontal.
	 */
	public void setImagenFrontal(String imagenFrontal) {
		this.imagenFrontal = imagenFrontal;
	}

	/**
	 * Metodo que devuelve el estado,
	 * @return - Valor del estado.
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Metodo que modifica el estado.
	 * @param estado - Modifica el valor del estado.
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * Método que redefine el metodo toString() de la clase Object.
	 * @return Cadena con el formato de salida [] y el valor de todos los atributos.
	 */
	public String toString() {
		return "Celda [fila=" + fila + ", columna=" + columna + ", imageReverso=" + imageReverso + ", imagenFrontal="
				+ imagenFrontal + ", estado=" + estado + "]";
	}
	
	/**
	 * Metodo que redefine el metodo equals  de la clase Object.
	 * @return Booleano con la comparacion de todos los atributos.
	 */
	public boolean equals (Object o) {
		Celda c = (Celda) o;
		return (this.fila == c.fila && this.columna == c.columna && this.imageReverso.equals(c.imageReverso) &&
				this.imagenFrontal.equals(c.imagenFrontal) && this.estado == c.estado);
	}
	
}
