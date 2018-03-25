package es.unex.cum.edi.practica.juego.tablero;

import java.util.Random;

import es.unex.cum.edi.practica.juego.celda.CeldaPareja;

/**
 * Clase TableroParejas. Hereda de la clase Tablero. En primer lugar se debe llamar a un constructor y a continuacion
 * llamar a los distintos métodos. Los métodos inicializar(), repartir() y mostrar() son abstractos que heredan de la clase
 * Tablero.
 * 
 * @author Jose Anotnio Alvarez
 * @version 1
 * @see Class Tablero
 * 
 */
public class TableroParejas extends Tablero {

	/**
	 * Constructor por Defecto de la clase TableroParejas.
	 */
	public TableroParejas() {
		super();
	}

	/**
	 * Constructor Parametrizado de la clase TableroParejas.
	 * @param numFilas
	 * - Número de filas del tablero.
	 * @param numColumnas
	 * - Número de columnas del tablero.
	 */
	public TableroParejas(int numFilas, int numColumnas) {
		super(numFilas, numColumnas);
	}

	/**
	 * Método abstracto de la clase Tablero en el que inicializa el tablero a las CeldasPareja
	 */
	@Override
	public void inicializar() {
		// TODO Auto-generated method stub

		for (int i = 0; i < numFilas; i++) {
			for (int j = 0; j < numColumnas; j++) {
				tablero[i][j] = new CeldaPareja(i, j);
			}
		}
	}

	/**
	 * Método abstracto de la clase Tablero en el que genera filas y columnas aleatorias y se le asigna un numero que se calcula
	 * con la multiplicacion de filas y columnas entre 2 y ese mismo numero lo introduce en dos celdas diferentes aleatorias.
	 */
	@Override
	public void repartir() {
		// TODO Auto-generated method stub

		Random r = new Random();
		int aleatorio = ((numFilas * numColumnas) / 2);

		while (aleatorio > 0) {

			int cont = 0;

			while (cont < 2) {

				int numeroF = r.nextInt(numFilas);
				int numeroC = r.nextInt(numColumnas);
				CeldaPareja cp = (CeldaPareja) tablero[numeroF][numeroC];

				if (cp.getValor() == -1) {

					cp.setValor(aleatorio);
					cp.setEstado(0);
					cp.setImageReverso(" # ");
					cp.setImagenFrontal(" "+Integer.toString(aleatorio)+" ");

					cont++;
				}
			}

			aleatorio = aleatorio - 1;

		}

	}

	/**
	 * Método abstracto de la clase Tablero en el que se encarga de ver el estado de las celdas para asi mostrar el cada una de ellas en funcion
	 * de su estado.
	 */
	@Override
	public void mostrar() {
		// TODO Auto-generated method stub

		for (int i = 0; i < numFilas; i++) {
			System.out.println();
			for (int j = 0; j < numColumnas; j++) {
			
				CeldaPareja cp = (CeldaPareja) tablero[i][j];
				if(cp.getEstado() == 0) {
					System.out.print(" "+cp.getImageReverso()+" ");
				}else if(cp.getEstado() == 1){
					System.out.print(" "+cp.getImagenFrontal()+" ");
				}else {
					System.out.print(" "+cp.getImagenFrontal()+" ");
				}
			}
		}

	}

}
