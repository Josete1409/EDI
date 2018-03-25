package es.unex.cum.edi.practica.juego.tablero;

import es.unex.cum.edi.practica.juego.celda.Celda;

/**
 * Clase Tablero tipo abstracta. Esta formada por el numero de filas, el numero de columnas y un objeto tablaro del tipo celda.
 * En primer lugar se debe llamar a un constructor y a continuacion llamar a los distintos métodos. 
 * Los métodos inicializar(), repartir() y mostrar() son abstractos y se implantan en la clase Tablero Parejas.
 * 
 * @author Jose Anotnio Alvarez
 * @version 1
 * @see Class TableroParejas
 * 
 */
public abstract class Tablero {

	public int numFilas;
	public int numColumnas;
	public Celda[][] tablero;

	/**
	 * Constructor por Defecto de la clase Tablero.
	 */
	public Tablero() {
		numFilas = 4;
		numColumnas = 4;
		tablero = new Celda[4][4];
	}

	/**
	 * Constructor Parametrizado de la clase Tablero.
	 * Inicializamos el tablero segun el numero de filas y de columnas pasadas por parametro.
	 * @param numFilas
	 * - Número de filas del tablero.
	 * @param numColumnas
	 * - Número de columnas del tablero.
	 */ 
	public Tablero(int numFilas, int numColumnas) {
		this.numFilas = numFilas;
		this.numColumnas = numColumnas;
		tablero = new Celda[numFilas][numColumnas];
	}

	/**
	 * Metodo que devuelve el estado de la celda[numFilas][numColumnas] del tablero.
	 * @param numFilas - Numero de la fila.
	 * @param numColumnas - Numero de la columna.
	 * @return Numero entero entre 0-2 depende del estado de la celda.
	 */
	public int getEstado(int numFilas, int numColumnas) {
		return tablero[numFilas][numColumnas].getEstado();
	}

	/**
	 * Metodo que cambia el estado de la celda[numFilas][numColumnas] del tablero.
	 * @param numFilas - Numero de la fila.
	 * @param numColumnas - Numero de la columna.
	 * @param estado - Numero entero entre 0-2 que nos indica el estado de la celda.
	 */
	public void setEstado(int numFilas, int numColumnas, int estado) {
		tablero[numFilas][numColumnas].setEstado(estado);
	}

	/**
	 * Metodo que devuelve la celda[numFilas][numColumnas] del tablero.
	 * @param numFilas - Numero de la fila.
	 * @param numColumnas - Numero de la columna.
	 * @return Un objeto celda del tablero.
	 */
	public Celda getCelda(int numFilas, int numColumnas) {
		return tablero[numFilas][numColumnas];
	}
	
	/**
	 * Metodo abstracto inicializar que se implementa en la clase TableroParejas
	 */
	abstract public void inicializar();

	/**
	 * Metodo abstracto repartir que se implementa en la clase TableroParejas
	 */
	abstract public void repartir();

	/**
	 * Metodo abstracto mostrar que se implementa en la clase TableroParejas
	 */
	abstract public void mostrar();
	
}
