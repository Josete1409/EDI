package es.unex.cum.edi.tarea2;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String cadena = " ";
		int longitud = 0, ini = 0;
		boolean pal = false;
		
		cadena = in.nextLine();
		in.close();
		
		cadena = cadena.toUpperCase();
		longitud = cadena.length()-1;
		ini = 0;
		
		while(ini<longitud && !pal) {
			
			if(cadena.charAt(ini) == cadena.charAt(longitud)) {
				
				ini++;
				longitud--;
				
			} else {
				
				pal = true;
				
			}
			
		}
		
		if(!pal) {
			
			System.out.println("SI es palíndromo");
			
		}else {
			
			System.out.println("NO es palíndromo");
			
		}
		
	}

}
