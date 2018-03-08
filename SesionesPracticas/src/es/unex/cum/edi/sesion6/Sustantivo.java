package es.unex.cum.edi.sesion6;

/**
 * Clase Sustantivo que hereda de la clase Palabra. Esta formado por el texto, la pista y el numero. 
 * En primer lugar se debe llamar a un constructor y a continuacion llamar a los distintos métodos.
 * 
 * @author Jose Antonio Alvarez
 * @version 1
 * @see Class Palabra
 *
 */
public class Sustantivo extends Palabra {

	private int numero;
	
	/**
	 * Constructor por Defecto de la clase Sustantivo. Llama a la clase padre(Palabra).
	 */
	public Sustantivo() {
		super();
		numero = 0;
	}
	
	/**
	 * Constructor Parametrizado de la clase Sustantivo.
	 * @param t El texto de la clase Palabra.
	 * @param p La pista de la clase Palabra.
	 * @param n El numero de la clase Sustantivo, 1 Singular, 2 Plural.
	 */
	public Sustantivo(String t, String p, int n) {
		super(t,p);
		numero = n;
	}
	
	/**
	 * Metodo que devuelve el atributo numero.
	 * @return Un entero con su valor.
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Metodo que modifica el valor del atributo numero.
	 * @param numero Valor entero con el nuevo valor.
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 * Metodo que redefine el metodo equals  de la clase Object.
	 *@return Booleano con la comparacion de todos los atributos.
	 */
	public boolean equals(Object o) {
		Sustantivo s = (Sustantivo) o;
		return (super.equals(s) && numero==s.numero);
	}
	
	/**
	 * Método que redefine el metodo toString() de la clase Object.
	 * @return Cadena con el formato de salida [] y el valor de todos los atributos.
	 */
	public String toString() {
		return super.toString()+" Sustantivo[Numero="+numero+"]";
	}
	
}
