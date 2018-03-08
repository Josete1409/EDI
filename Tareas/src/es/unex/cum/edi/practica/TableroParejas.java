package es.unex.cum.edi.practica;

public abstract class TableroParejas extends Tablero {

	public TableroParejas() {
		super();
	}

	public TableroParejas(int numFilas, int numColumnas) {
		numFilas = -1;
		numColumnas = -1;
	}

	public void inicializar(Celda[][] tablero, int numFilas, int numColumnas) {

		for (int i = 0; i < numFilas; i++) {

			for (int j = 0; j < numColumnas; j++) {

				

			}
		}

	}

	public void repartir() {

	}

	public void mostrar(Celda[][] tablero, int numFilas, int numColumnas) {

		for (int i = 0; i < numFilas; i++) {

			for (int j = 0; j < numColumnas; j++) {

				System.out.println();

			}
		}

	}

}
