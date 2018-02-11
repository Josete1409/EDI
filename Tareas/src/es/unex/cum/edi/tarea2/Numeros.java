package es.unex.cum.edi.tarea2;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cad = " ", num = "0123456789";
		int cont = 0;
		
		Scanner in = new Scanner(System.in);
		
		cad = in.nextLine();
		in.close();
		
		for(int i=0; i<cad.length(); i++) {
			
			for(int j=0; j<num.length(); j++) {
				
				if(cad.charAt(i) == num.charAt(j)) {
					
					cont++;
					
				}
				
			}
			
		}
		
		System.out.println("La cadena tiene "+cont+" dígitos");
		
	}

}
