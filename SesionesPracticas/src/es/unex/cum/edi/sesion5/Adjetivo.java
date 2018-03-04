package es.unex.cum.edi.sesion5;

/**
 * Clase Adjetivo que hereda de la clase Palabra. Esta formado por el texto, la pista y el genero. 
 * En primer lugar se debe llamar a un constructor y a continuacion llamar a los distintos métodos.
 * 
 * @author Jose Antonio Alvarez
 * @version 1
 * @see Class Palabra
 */
public class Adjetivo extends Palabra {

	private int genero;
	
	/**
	 * Constructor por Defecto de la clase Adjetivo. Llama a la clase padre(Palabra).
	 */
	public Adjetivo() {
		super();
		genero = 0;
	}
	
	/**
	 * Constructor Parametrizado de la clase Adjetivo 
	 * @param t - El texto de la clase Palabra
	 * @param p - La pista de la clase Palabra
	 * @param g - El genero de la clase Adjetivo, 1 Masculino, 2 Femenino y 3 Neutro
	 */
	public Adjetivo(String t, String p, int g) {
		super(t,p);
		genero = g;
	}
	
	/**
	 * Metodo que devuelve el atributo genero.
	 * @return Un entero con su valor
	 */
	public int getGenero() {
		return genero;
	}
	
	/**
	 * Metodo para modificar el atributo genero.
	 * @param genero Valor entero con el nuevo valor.
	 */
	public void setGenero(int genero) {
		this.genero = genero;
	}
	
	/**
	 Metodo que redefine el metodo equals  de la clase Object.
	 *@return Booleano con la comparacion de todos los atributos.
	 */
	public boolean equals(Object o) {
		Adjetivo a = (Adjetivo) o;
		return (super.equals(a) && genero==a.genero);
	}
	
	/**
	 * Método que redefine el metodo toString() de la clase Object.
	 * @return Cadena con el formato de salida [] y el valor de todos los atributos.
	 */
	public String toString() {
		return super.toString()+" Adjetivo[Genero="+genero+"]";
	}
}
