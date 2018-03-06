package es.unex.cum.edi.practica;

public class CeldaPareja extends Celda {

	private int valor;
	
	
	public CeldaPareja() {
		super();
		valor = -1;
	}
	
	public CeldaPareja(int fila, int columna) {
		fila = -1;
		columna = -1;
	}
	
	public CeldaPareja(String imageReverso, String imagenFrontal, int estado, int valor) {
		imageReverso = " ";
		imagenFrontal = " ";
		estado = -1;
		valor = -1;
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
