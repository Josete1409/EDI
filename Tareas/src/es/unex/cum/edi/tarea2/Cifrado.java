package es.unex.cum.edi.tarea2;

import java.util.Scanner;

public class Cifrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cifrado princi = new Cifrado();
		Scanner in = new Scanner(System.in);
		String cadena = " ", a = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ", c = "ZYXWVUTSRQPOÑNMLKJIHGFEDCBA";
		char aux;

		cadena = in.nextLine();
		in.close();

		cadena = cadena.toUpperCase(); // Lo convertimos todo en mayusculas

		for (int i = 0; i < cadena.length(); i++) {

			aux = cadena.charAt(i);
			
			if(princi.buscar(aux,a) == false) {
				
				System.out.print(aux);
				
			}

			for (int j = 0; j < a.length(); j++) {
				
				if (cadena.charAt(i) == a.charAt(j)) {

					System.out.print(c.charAt(j));

				}
			}
		}
	}
	
	public boolean buscar(char aux, String a) {
		
		boolean buscar = false;
		
		for (int i = 0; i < a.length(); i++) {
			
			if(aux == a.charAt(i)) {
				
				buscar = true;
				
			}
			
		}
		
		return buscar;
	}

}
