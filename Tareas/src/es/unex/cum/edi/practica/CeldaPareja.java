package es.unex.cum.edi.practica;

public class CeldaPareja extends Celda {

	protected int valor=-1;
	
	
	public CeldaPareja() {
		super();
		valor = -1;
	}
	
	public CeldaPareja(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}
	
	public CeldaPareja(String imageReverso, String imagenFrontal, int estado, int valor) {
		this.imageReverso = imageReverso;
		this.imagenFrontal = imagenFrontal;
		this.estado = estado;
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String toString() {
		return super.toString() + " CeldaPareja [valor=" + valor + "]";
	}
	
	public boolean equals(Object o) {
		CeldaPareja cp = (CeldaPareja) o;
		return (super.equals(cp) && valor == cp.valor);
	}
	
}
