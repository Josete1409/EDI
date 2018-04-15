package es.unex.cum.edi.sesion8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class Main {

	private Collection l;

	public Main() {
		l = new ArrayList();
	}

	public void fill() {
		Random rand = new Random();
		System.out.print("Añadiendo los valores: ");
		for (int i = 0; i < 10; i++) {
			Integer valor = new Integer(rand.nextInt(100));
			System.out.print(valor.toString() + " ");
			l.add(valor);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main m = new Main();
		System.out.println("Llenando la lista");
		m.fill();
		m.showCollection();
		System.out.println();
		System.out.println(m.sum());
		m.odd();
		System.out.println();
		if (m.check() == true) {
			System.out.println("Existe el 10 en la lista");
		} else {
			System.out.println("No esta el 10 en la lista");
		}
		System.out.println("Se repite algun numero " + m.checkMore() + " veces");

	}

	public void showCollection() {
		System.out.println();
		System.out.println("Recorrer");
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Integer x = (Integer) it.next(); // Always upcasting
			System.out.print(x + " ");
		}
	}

	public int sum() {
		System.out.println();
		System.out.println("Suma");
		int suma = 0;
		Iterator it = l.iterator();
		while (it.hasNext()) {
			suma = suma + Integer.parseInt(it.next().toString());
		}
		return suma;
	}

	public void odd() {
		System.out.println();
		System.out.println("Impares");
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Integer x = (Integer) it.next(); // Always upcasting
			if (x % 2 != 0)
				System.out.print(x + " ");
		}
	}

	public boolean check() {

		System.out.println();
		System.out.println("Check");
		int num = 10;
		boolean encontrado = false;
		Iterator it = l.iterator();

		while (it.hasNext()) {
			Integer x = (Integer) it.next();
			if (x == num) {
				encontrado = true;
			}
		}
		return encontrado;
	}

	public int checkMore() {

		System.out.println();
		System.out.println("CheckMore");
		int num = 0;

		Iterator it = l.iterator();

		while (it.hasNext()) {
			Integer x = (Integer) it.next();
			while (it.hasNext()) {
				Integer y = (Integer) it.next();
				if (x == y) {
					num++;
				}

			}
		}

		return num;

	}

	public void fillSet() {
		Random rand = new Random();
		System.out.print("Añadiendo los valores: ");
		for (int i = 0; i < 10; i++) {
			Integer valor = new Integer(rand.nextInt(100));
			System.out.print(valor.toString() + " ");
			((ArrayList) l).set(i, valor);
		}
		System.out.println();
	}

	public void showCollectionGet() {
		for (int i = 0; i < l.size(); i++) {
			Integer x = (Integer) ((ArrayList) l).get(i);
			System.out.print(x + " ");
		}
	}
}
