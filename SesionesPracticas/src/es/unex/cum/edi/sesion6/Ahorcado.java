package es.unex.cum.edi.sesion6;

import java.util.Random;

/**
 * Clase Ahorcado. Esta formada por lista, seleccionada, intentos, maximo y
 * contador. En primer lugar se debe llamar a un constructor y a continuacion
 * llamar a los distintos m�todos.
 * 
 * @author Jose Antonio Alvarez
 * @version 1
 *
 */
public class Ahorcado {

	private Palabra[] lista;
	private Palabra seleccionada;
	private int intentos;
	private int maximo;
	private int contador;
	private boolean[] letras;

	/**
	 * Constructor por Defecto de la clase Ahorcado.
	 */
	public Ahorcado() {
		lista = new Palabra[50];
		seleccionada = new Palabra();
		intentos = 0;
		maximo = 0;
		contador = 0;
		letras = new boolean[15];
	}

	/**
	 * Constructor Parametrizado de la clase Ahorcado.
	 * 
	 * @param tam
	 *            - El tama�o del array lista.
	 * @param max
	 *            - El maximo de intentos.
	 */
	public Ahorcado(int tam, int max) {
		lista = new Palabra[tam];
		maximo = max;
	}

	/**
	 * 
	 * Metodo que devuelve el atributo lista.
	 * 
	 * @return Contenido del array de palabra.
	 */
	public Palabra[] getLista() {
		return lista;
	}

	/**
	 * Metodo que devuelve true o false dependiendo si la palabra que se pasa por
	 * parametro se ha introducido correctamente en el array.
	 * 
	 * @param p
	 *            Palabra que queremos a�adir a la lista
	 * @return True(La ha a�adido correctamente) o False(No se ha a�adido)
	 */
	public boolean addLista(Palabra p) {
		if (contador < lista.length) {
			lista[contador] = p;
			contador++;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo que devuelve el atributo seleccionada.
	 * 
	 * @return Objeto de la clase Palabra con su valor.
	 */
	public Palabra getSeleccionada() {
		return seleccionada;
	}

	/**
	 * Metodo que modifica el valor del atributo seleccionada.
	 * 
	 * @param s
	 *            Obejeto de la clase Palabra con el nuevo valor.
	 */
	public void setSeleccionada(Palabra s) {
		seleccionada = s;
	}

	/**
	 * Metodo que devuelve el atributo intentos.
	 * 
	 * @return Un entero con su valor
	 */
	public int getIntentos() {
		return intentos;
	}

	/**
	 * Metodo que modifica el valor del atributo intentos.
	 * 
	 * @param i
	 *            Entero con el nuevo valor.
	 */
	public void setIntentos(int i) {
		intentos = i;
	}

	/**
	 * Metodo que devuelve el valor del atributo maximo.
	 * 
	 * @return Valor entero con su valor.
	 */
	public int getMaximo() {
		return maximo;
	}

	/**
	 * Metodo modifica el valor del atributo maximo.
	 * 
	 * @param max
	 *            Entero con el nuevo valor.
	 */
	private void setMaximo(int max) {
		maximo = max;
	}

	/**
	 * M�todo para mostrar el contenido de los atributos de la clase Ahorcado.
	 * 
	 * @return Cadena con el formato de salida [] y el valor de los atributos
	 *         intentos y maximo.
	 */
	public String toString() {
		return "[Seleccionada: " + seleccionada.getTexto() + " Intentos: " + intentos + ", MaxIntentos: " + maximo
				+ "]";
	}

	/**
	 * Metodo que compara los objetos con los del parametro de entrada.
	 * 
	 * @param a
	 *            Objeto de la clase Ahorcado
	 * @return Booleano con la comparacion de todos los atributos.
	 */
	public boolean equals(Ahorcado a) {
		return seleccionada.equals(a.seleccionada) && intentos == a.intentos && maximo == a.maximo
				&& contador == a.contador;
	}

	public void seleccionarPalabra() {

		Random r = new Random();
		int x = r.nextInt(lista.length);
		seleccionada = lista[x];
		letras = new boolean[seleccionada.getTexto().length()];
		for (int i = 0; i < letras.length; i++) {
			letras[i] = false;
		}

	}

	public boolean descubrirLetra(char l) {

		boolean bandera = false;

		for (int i = 0; i < seleccionada.getTexto().length(); i++) {

			if (seleccionada.getTexto().charAt(i) == l) {
				letras[i] = true;
				bandera = true;
			}

		}

		if (!bandera) {
			intentos++;
		}

		return bandera;

	}

	public boolean siGanado() {
		
		int i = 0;
		boolean bandera = true;
		
		while(letras[i] == bandera || i != seleccionada.getTexto().length()) {
			i++;
		}
		
		if(i == letras.length) {
			return true;
		}else {
			return false;
		}

	}

	public boolean verSiFin() {
		return true;
	}

	public String mostrarHorca() {
		return "";
	}

}
