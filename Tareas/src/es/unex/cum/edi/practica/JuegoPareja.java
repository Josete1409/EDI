package es.unex.cum.edi.practica;

import java.util.Scanner;

public class JuegoPareja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tablero t = new TableroParejas();

		jugar(t);
		verSiFin(t);

	}

	private static void jugar(Tablero t) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int f1, f2, c1, c2;

		t.inicializar();
		t.repartir();
		t.mostrar();

		while (verSiFin(t) == false) {

			System.out.println("");
			System.out.println("");
			System.out.println("Escribe una fila (1-6):");
			String f = sc.next();
			f1 = Integer.parseInt(f) - 1;
			while (f1 < 0 || f1 > 5) {
				System.out.println("Datos no validos vuelva a intentarlo.");
				System.out.println("Escribe una fila (1-6):");
				f = sc.next();
				f1 = Integer.parseInt(f) - 1;
			}
			System.out.println("Escribe una columna (1-6):");
			String c = sc.next();
			c1 = Integer.parseInt(c) - 1;
			while (c1 < 0 || c1 > 5) {
				System.out.println("Datos no validos vuelva a intentarlo.");
				System.out.println("Escribe una columna (1-6):");
				c = sc.next();
				c1 = Integer.parseInt(c) - 1;
			}
			t.setEstado(f1, c1, 1);
			String primera = t.tablero[f1][c1].getImagenFrontal();
			t.mostrar();

			System.out.println("");
			System.out.println("");
			System.out.println("Escribe una fila (1-6):");
			f = sc.next();
			f2 = Integer.parseInt(f) - 1;
			while (f2 < 0 || f2 > 5) {
				System.out.println("Datos no validos vuelva a intentarlo.");
				System.out.println("Escribe una fila (1-6):");
				f = sc.next();
				f2 = Integer.parseInt(f) - 1;
			}
			System.out.println("Escribe una columna (1-6):");
			c = sc.next();
			c2 = Integer.parseInt(c) - 1;
			while (c2 < 0 || c2 > 5) {
				System.out.println("Datos no validos vuelva a intentarlo.");
				System.out.println("Escribe una columna (1-6):");
				c = sc.next();
				c2 = Integer.parseInt(c) - 1;
			}
			t.setEstado(f2, c2, 1);
			String segunda = t.tablero[f2][c2].getImagenFrontal();
			t.mostrar();

			resolver(primera, segunda, f1, f2, c1, c2, t);
			if (verSiFin(t) == true) {
				System.out.println("¡¡HAS GANADO!!");
			}else {
				System.out.println("");
				System.out.println("");
				t.mostrar();
			}

		}

	}

	private static void resolver(String primera, String segunda, int f1, int f2, int c1, int c2, Tablero t) {
		// TODO Auto-generated method stub

		if (primera.equals(segunda)) {
			t.setEstado(f1, c1, 2);
			t.setEstado(f2, c2, 2);
		} else {
			t.setEstado(f1, c1, 0);
			t.setEstado(f2, c2, 0);
		}

	}

	private static boolean verSiFin(Tablero t) {
		// TODO Auto-generated method stub

		int cont = 0;

		for (int i = 0; i < t.numFilas; i++) {
			for (int j = 0; j < t.numColumnas; j++) {

				if (t.getEstado(i, j) == 2) {
					cont++;
				} else {
					return false;
				}

			}
		}

		if (cont == (t.numColumnas * t.numFilas)) {
			return true;
		} else {
			return false;
		}
	}

}
