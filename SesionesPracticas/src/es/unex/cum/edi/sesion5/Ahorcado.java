package es.unex.cum.edi.sesion5;

/**
 * Clase Ahorcado. Esta formada por lista, seleccionada, intentos, maximo y contador. 
 * En primer lugar se debe llamar a un constructor y a continuacion llamar a los distintos métodos.
 * 
 * @author Jose Antonio Alvarez
 * @version 1
 *
 */
public class Ahorcado {

	private Palabra[] lista;
	private Palabra seleccionada;
	private int intentos;
	private int maximo;
	private int contador;

	/**
	 * Constructor por Defecto de la clase Ahorcado.
	 */
	public Ahorcado() {
		lista = new Palabra[50];
		seleccionada = new Palabra();
		intentos = 0;
		maximo = 0;
		contador = 0;
	}
	
	/**
	 * Constructor Parametrizado de la clase Ahorcado.
	 * @param tam - El tamaño del array lista.
	 * @param max - El maximo de intentos.
	 */
	public Ahorcado(int tam, int max) {
		lista = new Palabra[tam];
		maximo = max;
	}

	/**
	 * 
	 * Metodo que devuelve el atributo lista.
	 * @return Contenido del array de palabra.
	 */
	public Palabra[] getLista() {
		return lista;
	}

	/**
	 * Metodo que devuelve true o false dependiendo si la palabra que se pasa por parametro se ha introducido correctamente en el array.
	 * @param p Palabra que queremos añadir a la lista
	 * @return True(La ha añadido correctamente) o False(No se ha añadido)
	 */
	public boolean addLista(Palabra p) {
		if (contador < lista.length) {	
			lista[contador] = p;
			contador++;
			return true;	
		}else {	
			return false;
		}
	}
	
	/**
	 * Metodo que devuelve el atributo seleccionada.
	 * @return 
	 */
	public Palabra getSeleccionada() {	
		return seleccionada;	
	}
	
	/**
	 * 
	 * @param s
	 */
	public void setSeleccionada(Palabra s) {
		seleccionada = s;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getIntentos() {
		return intentos;
	}

	/**
	 * 
	 * @param i
	 */
	public void setIntentos(int i) {	
		intentos = i;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getMaximo() {
		return maximo;
	}
	
	/**
	 * 
	 * @param max
	 */
	private void setMaximo(int max) {
		maximo = max;
	}
	
	/**
	 * 
	 */
	public String toString() {
		return "[ Intentos: "+intentos+", Maximos intentos: "+maximo+" ]";
	}
	
	/**
	 * 
	 * @param a
	 * @return
	 */
	public boolean equals(Ahorcado a) {
		return seleccionada.equals(a.seleccionada) && intentos == a.intentos && maximo == a.maximo && contador == a.contador;
	}
	
}
