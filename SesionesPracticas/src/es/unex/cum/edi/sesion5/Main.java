package es.unex.cum.edi.sesion5;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Ahorcado ah = new Ahorcado(5, 6); // Pasamos los dos parametros, el primero es fija el tamaño del array lista y
											// el segundo el numero max de intentos.
		Palabra[] p = new Palabra[50];
		Main m = new Main();
		Teclado t = new Teclado();
		int opc = 0, selec = 0, num = 0, gen = 0, cont = 0;
		String tex = " ", pist = " ";

		m.rellenar(opc, t, p, tex, pist, num, gen, ah);

		selec = t.leerEntero();

		ah.setSeleccionada(ah.getLista()[selec]);
		System.out.println(ah.toString());
		
		m.mostrar(ah, p, cont);

	}

	public void rellenar(int opc, Teclado t, Palabra[] p, String tex, String pist, int num, int gen, Ahorcado ah)
			throws IOException {

		for (int i = 0; i < ah.getLista().length; i++) {

			opc = t.leerEntero();

			while (opc != 1 && opc != 2 && opc != 3) {
				System.out.println("Valor introducido no valido, vuelva a intentarlo.");
				opc = t.literalConEntero("Elige tu opcion: ");
			}

			tex = t.leerLinea();
			pist = t.leerLinea();

			switch (opc) {
			case 1:

				num = t.leerEntero();
				while (num != 1 && num != 2) {
					System.out.println("Valor introducido no valido, vuelva a intentarlo.");
					num = t.leerEntero();
				}
				p[i] = new Sustantivo(tex, pist, num);

				break;
			case 2:

				num = t.leerEntero();
				while (num != 1 && num != 2 && num != 3) {
					System.out.println("Valor introducido no valido, vuelva a intentarlo.");
					num = t.leerEntero();
				}
				p[i] = new Verbo(tex, pist, num);

				break;
			case 3:

				gen = t.leerEntero();
				while (gen != 1 && gen != 2 && gen != 3) {
					System.out.println("Valor introducido no valido, vuelva a intentarlo.");
					gen = t.leerEntero();
				}
				p[i] = new Adjetivo(tex, pist, gen);

				break;
			default:

				break;
			}

			ah.addLista(p[i]);
		}

	}

	public void mostrar(Ahorcado ah, Palabra[] p, int cont) {

		System.out.println(ah.getSeleccionada().toString());

		for (int i = 0; i < ah.getLista().length; i++) {
			System.out.println(ah.getLista()[i].toString());
			cont = cont + ah.getLista()[i].getLongitud();
		}

		System.out.println("Longitud Total: " + cont);

		for (int i = 0; i < ah.getLista().length; i++) {

			if (ah.getLista()[i].getClass().equals(Sustantivo.class)) {
				Sustantivo s = (Sustantivo) p[i];
				System.out.println("Sustantivo[Numero: "+s.getNumero()+"]");
			} else if (ah.getLista()[i].getClass().equals(Verbo.class)) {
				Verbo v = (Verbo) p[i];
				System.out.println("Verbo[Conjugacion: "+v.getNumero()+"]");
			} else {
				Adjetivo a = (Adjetivo) p[i];
				System.out.println("Adjetivo[Genero: "+a.getGenero()+"]");
			}
		}

	}
}
