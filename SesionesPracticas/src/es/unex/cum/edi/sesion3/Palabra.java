package es.unex.cum.edi.sesion3; 

public class Palabra{
	
	private String texto;
	private int longitud;
	private String pista;
	
	public Palabra(){
		
		texto = " ";
		longitud = 0;
		pista = " ";
	
	}
	
	public Palabra(String t, int l, String p){
		
		texto = t;
		longitud = l;
		pista = p;
	
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String t) {
		texto = t;
	}
	
	public int getLongitud(){
		return longitud;
	}
	
	public void setLongitud(int l){
		longitud = l;
	}
	
	public String getPista(){
		return pista;
	}
	
	public void setPista(String p){
		pista = p;
	}
	
	public String toString(){
		
		return "[ Texto: "+texto+" Longitud: "+longitud+" Pista: "+pista+" ]";
		
	}
	
	public boolean equals(Palabra p){
		
		return (texto.equals(p.texto) &&
				longitud == p.longitud &&
				pista.equals(p.pista));
	}
	
}