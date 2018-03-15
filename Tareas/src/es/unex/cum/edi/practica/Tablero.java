package es.unex.cum.edi.practica;

public abstract class Tablero {

	protected int numFilas;
	protected int numColumnas;
	protected Celda[][] tablero;

	public Tablero() {
		numFilas = 4;
		numColumnas = 4;
		tablero = new Celda[4][4];
	}

	public Tablero(int numFilas, int numColumnas) {
		this.numFilas = numFilas;
		this.numColumnas = numColumnas;
		tablero = new Celda[numFilas][numColumnas];
	}

	public int getEstado(int numFilas, int numColumnas) {
		return tablero[numFilas][numColumnas].getEstado();
	}

	public void setEstado(int numFilas, int numColumnas, int estado) {
		tablero[numFilas][numColumnas].setEstado(estado);
	}

	public Celda getCelda(int numFilas, int numColumnas) {
		return tablero[numFilas][numColumnas];
	}

	abstract public void inicializar();

	abstract public void repartir();

	abstract public void mostrar();
	
}
