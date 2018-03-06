package es.unex.cum.edi.practica;

public class CeldaBingo extends Celda {

	private int numero;
	
	public CeldaBingo() {
		super();
		numero = -1;
	}
	
	public CeldaBingo(int fila, int columna) {
		fila = -1;
		columna = -1;
	}
	
	public CeldaBingo(String imageReverso, String imagenFrontal, int estado, int numero) {
		imageReverso = " ";
		imagenFrontal = " ";
		estado = -1;
		numero = -1;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String toString() {
		return super.toString() + " CeldaBingo [numero=" + numero + "]";
	}
	
	public boolean equals(Object o) {
		CeldaBingo cb = (CeldaBingo) o;
		return (super.equals(cb) && numero == cb.numero);
	}
}
