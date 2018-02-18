package es.unex.cum.edi.sesion3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		RSociales[] vRS;
		int suma = 0;
		float media = 0;

		int tam = in.nextInt(); // Pedimos el tamaño del vector.

		vRS = new RSociales[tam]; // Creamos el vector RS con el tamaño dado.

		for (int i = 0; i < vRS.length; i++) {
			vRS[i] = new RSociales(in.next(), in.next(), in.nextInt());
		}

		in.close();

		// Mostrar
		for (int i = 0; i < vRS.length; i++) {
			System.out.println(vRS[i].toString());
		}

		// Media
		for (int i = 0; i < vRS.length; i++) {
			suma += vRS[i].getInicio();
		}

		media = (float) suma / vRS.length;

		// Alto

		int max = 0, aux = 0;

		for (int i = 0; i < vRS.length; i++) {

			aux = vRS[i].getInicio();

			if (aux > max) {

				max = aux;

			}
		}
		
		System.out.println("Media: "+media+" Alto: "+max);
	}
}