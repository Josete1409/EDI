package es.unex.cum.edi.tarea2;

import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String cad = " ", vocales = "aeiou", vocalesm = "AEIOU";
		int numvocales[] = { 0, 0, 0, 0, 0 }, cont = 0;

		cad = in.nextLine();
		in.close();

		for (int i = 0; i < cad.length(); i++) {

			//Recorremos las vocales para comparar con cada una de las letras

			for (int j = 0; j < vocales.length(); j++) {

				if (cad.charAt(i) == vocales.charAt(j) || cad.charAt(i) == vocalesm.charAt(j)) {

					//Aumentamos el contador para la vocal encontrada y el contador de todas las vocales

					numvocales[j]++;
					cont++;
				}
				
				

			}

		}
		
		if(cont>1) {
			
			System.out.println("Hay "+cont+" vocales");
			
		}else {
			
			System.out.println("Hay "+cont+" vocal");
		}
		
		
		for (int i=0; i<vocales.length(); i++) {

			if(numvocales[i] != 0) {
				
				if(numvocales[i] > 1) {
					
					System.out.println("Hay "+numvocales[i]+" vocales "+vocales.charAt(i));
					
				}else {
					
					System.out.println("Hay "+numvocales[i]+" vocal "+vocales.charAt(i));
					
				}
				
			}

		}

	}

}
