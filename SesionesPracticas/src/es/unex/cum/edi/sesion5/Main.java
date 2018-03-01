package es.unex.cum.edi.sesion5;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Ahorcado ah = new Ahorcado(5, 6); // Pasamos los dos parametros, el primero es fija el tamaño del array lista y
											// el segundo el numero max de intentos.
		Sustantivo s = new Sustantivo();
		Adjetivo a = new Adjetivo();
		Verbo v = new Verbo();
		Palabra p = new Palabra();
		Teclado t = new Teclado();
		int opc = 0, selec = 0;

		for (int i = 0; i < ah.getLista().length; i++) {

			System.out.println("Añadir palabras del tipo: ");
			System.out.println("1.- Sustantivo");
			System.out.println("2.- Verbo");
			System.out.println("3.- Adjetivo");
			opc = t.literalConEntero("Elige tu opcion: ");
			
			while (opc != 1 && opc != 2 && opc != 3) {
				System.out.println("Valor introducido no valido, vuelva a intentarlo.");
				opc = t.literalConEntero("Elige tu opcion: ");
			}
			
			switch (opc) {
			case 1:

				s.setTexto(t.leerLinea());
				s.setPista(t.leerLinea());
				s.setNumero(t.leerEntero());
				while (s.getNumero() != 1 && s.getNumero() != 2) {
					System.out.println("Valor introducido no valido, vuelva a intentarlo.");
					s.setNumero(t.leerEntero());
				}
				ah.addLista(s);
				System.out.println(s.toString());

				break;
			case 2:

				v.setTexto(t.leerLinea());
				v.setPista(t.leerLinea());
				v.setNumero(t.leerEntero());
				while (v.getNumero() != 1 && v.getNumero() != 2 && v.getNumero() != 3) {
					System.out.println("Valor introducido no valido, vuelva a intentarlo.");
					v.setNumero(t.leerEntero());
				}
				ah.addLista(v);
				System.out.println(v.toString());

				break;
			case 3:

				a.setTexto(t.leerLinea());
				a.setPista(t.leerLinea());
				a.setGenero(t.leerEntero());
				while (a.getGenero() != 1 && a.getGenero() != 2 && a.getGenero() != 3) {
					System.out.println("Valor introducido no valido, vuelva a intentarlo.");
					a.setGenero(t.leerEntero());
				}
				ah.addLista(a);
				System.out.println(a.toString());

				break;
			default:

				break;
			}

		}
		
		for(int i=0; i<ah.getLista().length; i++) {
			  System.out.println(ah.getLista()[i]); 
		}

		selec = t.literalConEntero("Introduce un numero del 1 al 5 para elegir una palabra");
		selec = selec-1;
		
		ah.toString();
		
	}

}
