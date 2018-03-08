package es.unex.cum.edi.practica;

public class Tablero {
	
	protected int numFilas;
	protected int numColumnas;
	protected int estado;
	protected Celda[][] tablero;
	
	public Tablero() {
		numFilas = -1;
		numColumnas= -1;
		tablero = new Celda[49][49];
	}
	
	public Tablero(int numFilas, int numColumnas) {
		this.numFilas = numFilas;
		this.numColumnas = numColumnas;
		tablero = new Celda[numFilas][numColumnas];
	}

	public void inicializar() {
		
	}
	
	public void repartir() {
		
	}
	
	public void mostrar() {
		
	}
	
	public int getEstado(int numFilas, int numColumnas) {
		return tablero[numFilas][numColumnas].getEstado(); 
	}
	
	public void setEstado(int numFilas, int numColumnas, int estado) {
		tablero[numFilas][numColumnas].setEstado(estado);
	}
	
	public Celda[][] getCelda(int numFilas, int numColumnas) {
		return tablero[numFilas][numColumnas].; 
	}
}
