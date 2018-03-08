package es.unex.cum.edi.sesion6;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Teclado t = new Teclado();
		Ahorcado ah = new Ahorcado();
		
		int pos=t.literalConEntero("Dime posicion seleccionada");
		ah.seleccionarPalabra(pos);
		
		
		
	}
	
}
