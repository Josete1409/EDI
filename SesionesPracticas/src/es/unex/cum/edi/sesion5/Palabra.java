package es.unex.cum.edi.sesion5;

/**
 * Clase Palabra. Esta formada por el texto, la pista y la longitud. 
 * En primer lugar se debe llamar a un constructor y a continuacion llamar a los distintos métodos.
 * 
 * @author Jose Antonio Alvarez
 * @version 1
 */
public class Palabra {
	private String texto;
	private String pista;
	private int longitud;
	
	/**
	 * Constructor por Defecto de la clase Palabra.
	 */
	public Palabra() {
		texto= new String();
		pista = new String();
		longitud=0;
	}

	/**
	 * Constructor Parametrizado de la clase Palabra.
	 * @param texto
	 * @param pista
	 */
	public Palabra(String texto, String pista) {		
		this.texto = texto;
		this.pista = pista;
		longitud= texto.length();
	}

	/**
	 * Metodo que devuelve el atributo texto.
	 * @return Una cadena con su valor
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * Metodo que modifica el valor del atributo texto y llama al modificador del atributo longitud pasandole el tamaño del texto.
	 * @param texto Cadena con el nuevo valor.
	 */
	public void setTexto(String texto) {
		this.texto = texto;
		setLongitud(texto.length());
	}

	/**
	 * Metodo que devuelve el atributo pista.
	 * @return Una cadena con su valor
	 */
	public String getPista() {
		return pista;
	}

	/**
	 * Metodo que modifica el valor del atributo pista.
	 * @param pista Cadena con el nuevo valor.
	 */
	public void setPista(String pista) {
		this.pista = pista;
	}

	/**
	 * Metodo que devuelve el atributo longitud.
	 * @return Un entero con su valor
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * Metodo que modifica el valor del atributo longitud.
	 * @param longitud Valor entero con el nuevo valor segun el texto.
	 */
	private void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/** 
	 * Método para mostrar el contenido de los atributos de la clase Palabra.
	 * @return Cadena con el formato de salida [] y el valor de todos los atributos.
	 */
	public String toString() {
		return "Palabra [Texto="+texto+", Pista="+pista+", Longitud="+longitud+"]";
	}

	/**
	 * Metodo que redefine el metodo equals  de la clase Object.
	 *@return Booleano con la comparacion de todos los atributos.
	 */
	public boolean equals(Object o) {
		Palabra p = (Palabra) o;
		return this.texto.equals(p.texto) && this.pista.equals(p.equals(o));
	}
	
}
