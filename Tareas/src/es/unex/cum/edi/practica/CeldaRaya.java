package es.unex.cum.edi.practica;

public class CeldaRaya extends Celda {

	protected int color;
	
	public CeldaRaya() {
		super();
		color = -1;
	}
	
	public CeldaRaya(int fila, int columna) {
		fila = -1;
		columna = -1;
	}
	
	public CeldaRaya(String imageReverso, String imagenFrontal, int estado, int color) {
		imageReverso = " ";
		imagenFrontal = " ";
		estado = -1;
		color = -1;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public String toString() {
		return super.toString() + " CeldaRaya [color=" + color + "]";
	}
	
	public boolean equals(Object o) {
		CeldaRaya cr = (CeldaRaya) o;
		return (super.equals(cr) && color == cr.color);
	}
	
}
