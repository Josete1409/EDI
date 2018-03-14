package es.unex.cum.edi.practica;

public abstract class Celda {

	protected int fila;
	protected int columna;
	protected String imageReverso;
	protected String imagenFrontal;
	protected int estado;
	
	public Celda() {
		fila = 0;
		columna = 0;
		imageReverso = new String();
		imagenFrontal = new String();
		estado = 0;
	}
	
	public Celda(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}
	
	public Celda(String imageReverso, String imagenFrontal, int estado) {
		this.imageReverso = imageReverso;
		this.imagenFrontal = imagenFrontal;
		this.estado = estado;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public String getImageReverso() {
		return imageReverso;
	}

	public void setImageReverso(String imageReverso) {
		this.imageReverso = imageReverso;
	}

	public String getImagenFrontal() {
		return imagenFrontal;
	}

	public void setImagenFrontal(String imagenFrontal) {
		this.imagenFrontal = imagenFrontal;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String toString() {
		return "Celda [fila=" + fila + ", columna=" + columna + ", imageReverso=" + imageReverso + ", imagenFrontal="
				+ imagenFrontal + ", estado=" + estado + "]";
	}
	
	public boolean equals (Object o) {
		Celda c = (Celda) o;
		return (this.fila == c.fila && this.columna == c.columna && this.imageReverso.equals(c.imageReverso) &&
				this.imagenFrontal.equals(c.imagenFrontal) && this.estado == c.estado);
	}
	
}
