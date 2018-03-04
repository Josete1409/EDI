package es.unex.cum.edi.sesion5;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Ahorcado ah = new Ahorcado(5, 6); // Pasamos los dos parametros, el primero es fija el tamaño del array lista y
											// el segundo el numero max de intentos.
		Teclado t = new Teclado();
		int opc = 0, selec = 0, num = 0, gen = 0, cont = 0;
		String tex, pist;

		for (int i = 0; i < ah.getLista().length; i++) {

			opc = t.leerEntero();

			while (opc != 1 && opc != 2 && opc != 3) {
				System.out.println("Valor introducido no valido, vuelva a intentarlo.");
				opc = t.literalConEntero("Elige tu opcion: ");
			}

			switch (opc) {
			case 1:

				tex = t.leerLinea();
				pist = t.leerLinea();
				num = t.leerEntero();
				while (num != 1 && num != 2) {
					System.out.println("Valor introducido no valido, vuelva a intentarlo.");
					num = t.leerEntero();
				}
				Sustantivo s = new Sustantivo(tex, pist, num);
				ah.addLista(s);
				System.out.println(s.toString());

				break;
			case 2:

				tex = t.leerLinea();
				pist = t.leerLinea();
				num = t.leerEntero();
				while (num != 1 && num != 2 && num != 3) {
					System.out.println("Valor introducido no valido, vuelva a intentarlo.");
					num = t.leerEntero();
				}
				Verbo v = new Verbo(tex, pist, num);
				ah.addLista(v);
				System.out.println(v.toString());

				break;
			case 3:

				tex = t.leerLinea();
				pist = t.leerLinea();
				gen = t.leerEntero();
				while (gen != 1 && gen != 2 && gen != 3) {
					System.out.println("Valor introducido no valido, vuelva a intentarlo.");
					gen = t.leerEntero();
				}
				Adjetivo a = new Adjetivo(tex, pist, gen);
				ah.addLista(a);
				System.out.println(a.toString());

				break;
			default:

				break;
			}

		}

		selec = t.leerEntero();

		ah.setSeleccionada(ah.getLista()[selec]);

		ah.getSeleccionada().toString();

		for (int i = 0; i < ah.getLista().length; i++) {
			ah.getLista()[i].toString();
			cont = cont + ah.getLista()[i].getLongitud();
		}

		System.out.println("Longitud Total: " + cont);

		for (int i = 0; i < ah.getLista().length; i++) {
			ah.getLista()[i].getClass().toString();
		}

		ah.toString();

	}

}
