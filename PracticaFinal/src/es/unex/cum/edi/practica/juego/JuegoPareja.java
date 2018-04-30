package es.unex.cum.edi.practica.juego;

import java.util.Queue;
import java.util.Scanner;

import es.unex.cum.edi.practica.juego.celda.CeldaPareja;
import es.unex.cum.edi.practica.juego.tablero.Tablero;
import es.unex.cum.edi.practica.juego.tablero.TableroParejas;

/**
 * Clase JuegoPareja. Esta formada por el main, el método jugar(), el método
 * resolver() y el método verSiFin(). Contiene un objeto de la clase
 * TableroParejas.
 * 
 * @author Jose Anotnio Alvarez
 * @version 1
 * 
 */
public class JuegoPareja {

	Tablero t;
	private Queue<CeldaPareja> mov;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JuegoPareja j = new JuegoPareja();
		Scanner sc = new Scanner(System.in);

		String resp = "S";
		while (resp.equals("S")) {

			j.jugar(sc);
			j.verSiFin();

			System.out.println("");
			System.out.println("¿Quieres jugar de nuevo? (S/N)");
			resp = sc.next();
			resp = resp.toUpperCase();

		}

	}

	/**
	 * Método que se encarga de pedir una fila y una columna para descubrir una
	 * celda y pedir seguidamente otra fila y columna para descubrir la segunda
	 * celda. Cambian su estado 1-mostrada y llama al los métodos resolver() y
	 * verSiFin(). Con el objeto t de la clase Tablero, llamaremos a los métodos
	 * abstractos para inicializar las celdas del tablero, mostrar el tablero y
	 * repartir el valor de imagenFrontal en las distintas celdas. Inicializaremos
	 * el tablero según el numero de filas y columnas que decida el usuario, siempre
	 * y cuando su multiplicación sea par.
	 * 
	 * @param sc
	 */
	private void jugar(Scanner sc) {
		// TODO Auto-generated method stub

		int f1, f2, c1, c2, filas, columnas;

		System.out.println("Escribe las dimensiones del tablero (filas,columnas): ");
		System.out.println("NOTA: La multiplicacion de filas por columnas tiene que ser siempre PAR");
		filas = sc.nextInt();
		columnas = sc.nextInt();

		while ((filas * columnas) % 2 != 0) {

			System.out.println("Datos no validos, vuelva a intentarlo.");
			System.out.println("Escribe las dimensiones del tablero (filas,columnas): ");
			System.out.println("NOTA: La multiplicacion de filas por columnas tiene que ser siempre PAR");
			filas = sc.nextInt();
			columnas = sc.nextInt();

		}

		t = new TableroParejas(filas, columnas);

		t.inicializar();
		t.repartir();
		t.mostrar();

		while (verSiFin() == false) {

			System.out.println("");
			System.out.println("");
			System.out.println("Escribe una fila y una columna [(1-" + filas + "),(1-" + columnas + ")]:");
			String f = sc.next();
			String c = sc.next();
			f1 = Integer.parseInt(f);
			c1 = Integer.parseInt(c);
			while ((f1 < 0 || f1 > filas) || (c1 < 0 || c1 > columnas)) {
				System.out.println("Datos no validos, vuelva a intentarlo.");
				f = sc.next();
				f1 = Integer.parseInt(f);
				c = sc.next();
				c1 = Integer.parseInt(c);
			}
			f1 = f1 - 1;
			c1 = c1 - 1;
			t.setEstado(f1, c1, 1);
			String primera = t.tablero[f1][c1].getImagenFrontal();
			t.mostrar();

			System.out.println("");
			System.out.println("");
			System.out.println("Escribe una fila y una columna [(1-" + filas + "),(1-" + columnas + ")]:");
			f = sc.next();
			c = sc.next();
			f2 = Integer.parseInt(f);
			c2 = Integer.parseInt(c);
			while ((f2 < 0 || f2 > filas) || (c2 < 0 || c2 > columnas)) {
				System.out.println("Datos no validos, vuelva a intentarlo.");
				f = sc.next();
				f2 = Integer.parseInt(f);
				c = sc.next();
				c2 = Integer.parseInt(c);
			}
			f2 = f2 - 1;
			c2 = c2 - 1;
			t.setEstado(f2, c2, 1);
			String segunda = t.tablero[f2][c2].getImagenFrontal();
			t.mostrar();

			resolver(primera, segunda, f1, f2, c1, c2, t);

			if (verSiFin() == true) {
				System.out.println("");
				System.out.println("");
				System.out.println("¡¡HAS GANADO!!");
			} else {
				System.out.println("");
				System.out.println("");
				t.mostrar();
			}

		}

	}

	/**
	 * Método que se encarga de comprobar el contenido de imagenFrontal si es igual
	 * o no, y segun sea modifica su estado a 0-no mostrada(distinto) o 2-mostrada y
	 * emparejada(iguales).
	 * 
	 * @param primera
	 *            - Cadena en la que guardamos el contenido de imagenFrontal de la
	 *            primera celda.
	 * @param segunda
	 *            - Cadena en la que guardamos el contenido de imagenFrontal de la
	 *            segunda celda.
	 * @param f1
	 *            - Valor de la fila de la primera celda.
	 * @param f2
	 *            - Valor de la fila de la segunda celda.
	 * @param c1
	 *            - Valor de la columna de la primera celda.
	 * @param c2
	 *            - Valor de la columna de la segunda celda.
	 * @param t
	 *            - Objeto t de la clase Tablero para poder modificar su estado.
	 */
	private void resolver(String primera, String segunda, int f1, int f2, int c1, int c2, Tablero t) {
		// TODO Auto-generated method stub

		if (primera.equals(segunda)) {
			t.setEstado(f1, c1, 2);
			t.setEstado(f2, c2, 2);
		} else {
			t.setEstado(f1, c1, 0);
			t.setEstado(f2, c2, 0);
		}

	}

	/**
	 * Método que comprueba si el estado de todas las celdas del tablero es igual a
	 * 2 (todas emparejadas), si esto es asi devuelve true. De lo contrario retorna
	 * false, y por lo tanto seguiría el juego hasta que se devuelva true.
	 * 
	 * @return - Si ha finalizado el juego o no, dependiendo del estado de todas las
	 *         celdas del tablero.
	 */
	private boolean verSiFin() {
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