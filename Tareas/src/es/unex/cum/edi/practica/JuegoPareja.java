package es.unex.cum.edi.practica;

import java.util.Scanner;

public class JuegoPareja {

	Tablero t;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		JuegoPareja j= new JuegoPareja();
	
		j.jugar();
		j.verSiFin();

	}

	private  void jugar() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int f1, f2, c1, c2, filas, columnas;
		
		System.out.println("Escribe las dimensiones del tablero (filas,columnas): ");
		System.out.println("NOTA: La multiplicacion de filas por columnas tiene que ser siempre PAR");
		filas = sc.nextInt() ; columnas = sc.nextInt();
		
		while((filas*columnas)%2 != 0) {
			
			System.out.println("Datos no validos, vuelva a intentarlo.");
			System.out.println("Escribe las dimensiones del tablero (filas,columnas): ");
			System.out.println("NOTA: La multiplicacion de filas por columnas tiene que ser siempre PAR");
			filas = sc.nextInt() ; columnas = sc.nextInt();
			
		}
		
		t = new TableroParejas(filas,columnas);
		

		t.inicializar();
		t.repartir();
		t.mostrar();

		while (verSiFin() == false) {

			System.out.println("");
			System.out.println("");
			System.out.println("Escribe una fila y una columna [(1-"+filas+"),(1-"+columnas+")]:");
			String f = sc.next(); String c = sc.next();
			f1 = Integer.parseInt(f) - 1;
			c1 = Integer.parseInt(c) - 1;
			while ((f1 < 0 || f1 > filas) || (c1 < 0 || c1 > columnas)) {
				System.out.println("Escribe una fila y una columna [(1-"+filas+"),(1-"+columnas+")]:");
				f = sc.next(); c = sc.next();
				f1 = Integer.parseInt(f) - 1;
				c1 = Integer.parseInt(c) - 1;
			}
			t.setEstado(f1, c1, 1);
			String primera = t.tablero[f1][c1].getImagenFrontal();
			t.mostrar();

			System.out.println("");
			System.out.println("");
			System.out.println("Escribe una fila y una columna [(1-"+filas+"),(1-"+columnas+")]:");
			f = sc.next(); c = sc.next();
			f2 = Integer.parseInt(f) - 1;
			c2 = Integer.parseInt(c) - 1;
			while ((f2 < 0 || f2 > filas) || (c2 < 0 || c2 > columnas)) {
				System.out.println("Escribe una fila y una columna [(1-"+filas+"),(1-"+columnas+")]:");
				f = sc.next(); c = sc.next();
				f2 = Integer.parseInt(f) - 1;
				c2 = Integer.parseInt(c) - 1;
			}
			t.setEstado(f2, c2, 1);
			String segunda = t.tablero[f2][c2].getImagenFrontal();
			t.mostrar();

			resolver(primera, segunda, f1, f2, c1, c2, t);
			if (verSiFin() == true) {
				System.out.println("");
				System.out.println("");
				System.out.println("¡¡HAS GANADO!!");
				/*System.out.println("¿Quieres jugar de nuevo? (S/N)");
				String resp = sc.next();
				if(resp == "S") {
					verSiFin(t) = false;
				}*/
			}else {
				System.out.println("");
				System.out.println("");
				t.mostrar();
			}

		}

	}

	private  void resolver(String primera, String segunda, int f1, int f2, int c1, int c2, Tablero t) {
		// TODO Auto-generated method stub

		if (primera.equals(segunda)) {
			t.setEstado(f1, c1, 2);
			t.setEstado(f2, c2, 2);
		} else {
			t.setEstado(f1, c1, 0);
			t.setEstado(f2, c2, 0);
		}

	}

	private  boolean verSiFin() {
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
