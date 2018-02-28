package es.unex.cum.edi.sesion4;

public class Ahorcado {

	private Palabra[] lista;
	private Palabra seleccionada;
	private int intentos;
	private int maximo;
	private int contador;

	public Ahorcado() {

		lista = new Palabra[50];
		seleccionada = new Palabra();
		intentos = 0;
		maximo = 0;
		contador = 0;

	}
	
	public Ahorcado(int tam, int max) {

		lista = new Palabra[tam];
		maximo = max;

	}

	public Palabra[] getLista() {

		return lista;

	}

	public boolean addLista(Palabra p) {

		if (contador < lista.length) {
			
			lista[contador] = p;
			contador++;
			return true;
			
		}else {
			
			return false;
		}

	}
	
	public Palabra getSeleccionada() {
		
		return seleccionada;
		
	}
	
	public void setSeleccionada(Palabra s) {
		
		seleccionada = s;
		
	}
	
	public int getIntentos() {
		
		return intentos;
		
	}

	
	public void setIntentos(int i) {
		
		intentos = i;
		
	}
	
	public int getMaximo() {
		
		return maximo;
		
	}
	
	private void setMaximo(int max) {
		
		maximo = max;
		
	}
	
	public String toString() {
		
		return "[ Intentos: "+intentos+", Maximos intentos: "+maximo+" ]";
		
	}
	
	public boolean equals(Ahorcado a) {
		
		return seleccionada.equals(a.seleccionada) && intentos == a.intentos && maximo == a.maximo && contador == a.contador;
 	
	}
	
}
