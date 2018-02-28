package es.unex.cum.edi.sesion4;

import java.io.IOException;

public class MainS4 {

	private Ahorcado a;
	private Teclado t = new Teclado();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		MainS4 m = new MainS4();
		m.inicializar();
		m.rellenar();
		m.listar();
		
	}

	public void inicializar() throws IOException {
		
		int tam = t.literalConEntero("Escribe el tamaño: ");
		int max = t.literalConEntero("Numero máximo de intentos: ");
		a = new Ahorcado(tam, max);
		
	}
	
	public void rellenar() throws IOException {
		
		for(int i=0; i<a.getLista().length; i++) {
			
			String texto = t.literalConString("Escribe una palabra: ");
			String pista = t.literalConString("Escribe una pista para esa palabra: ");
			
			Palabra p = new Palabra();
			a.addLista(p);
			
		}
		
	}
	
	public void listar() {
		
		for(int i=0; i<a.getLista().length; i++) {
			
			System.out.println(a.getLista()[i].toString());
			
		}
		
	}
}
