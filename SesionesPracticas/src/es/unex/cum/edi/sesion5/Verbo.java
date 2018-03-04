package es.unex.cum.edi.sesion5;

/**
 * Clase Verbo que hereda de la clase Palabra. Esta formado por el texto, la pista y el numero. 
 * En primer lugar se debe llamar a un constructor y a continuacion llamar a los distintos métodos.
 * 
 * @author Jose Antonio Alvarez
 * @version 1
 * @see Class Palabra
 */
public class Verbo extends Palabra {

	private int numero;
	
	/**
	 * Constructor por Defcto de la clase Verbo. Llama a la clase padre(Palabra).
	 */
	public Verbo() {
		super();
		numero = 0;
	}
	
	/**
	 * Constructor Parametrizado de la clase Verbo
	 * @param t - El texto de la clase Palabra
	 * @param p - La pista de la clase Palabra
	 * @param n - El número de la clase Verbo, 1 Primera persona, 2 Segunda persona y 3 Tercera persona.
	 */
	public Verbo(String t, String p, int n) {
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
		this.numero=numero;
	}
	
	/**
	 * Metodo que redefine el metodo equals  de la clase Object.
	 *@return Booleano con la comparacion de todos los atributos.
	 */
	public boolean equals(Object o) {
		Verbo v = (Verbo) o;
		return (super.equals(v) && numero==v.numero);
	}
	
	/**
	 * Método que redefine el metodo toString() de la clase Object.
	 * @return Cadena con el formato de salida [] y el valor de todos los atributos.
	 */
	public String toString() {
		return  super.toString()+" Verbo[Numero="+numero+"]";
	}
}

