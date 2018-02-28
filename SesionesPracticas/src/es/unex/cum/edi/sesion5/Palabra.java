package es.unex.cum.edi.sesion5;

public class Palabra {
	private String texto;
	private String pista;
	private int longitud;
	
	public Palabra() {
		texto= new String();
		pista = new String();
		longitud=0;
	}

	public Palabra(String texto, String pista) {		
		this.texto = texto;
		this.pista = pista;
		longitud= texto.length();
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
		setLongitud(texto.length());
	}

	public String getPista() {
		return pista;
	}

	public void setPista(String pista) {
		this.pista = pista;
	}

	public int getLongitud() {
		return longitud;
	}

	private void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Palabra [texto=" + texto + ", pista=" + pista + ", longitud="
				+ longitud;
	}

	@Override
	public boolean equals(Object obj) {
		Palabra other = (Palabra) obj;
		return this.texto.equals(other.texto) && this.pista.equals(other.equals(obj));
	}
	
	

	
	
}
