package es.unex.cum.edi.tarea1;

import java.util.Scanner;

public class Tarea12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		int num=0, suma=0;		
		
		System.out.println("Introduce un número: ");
		num = in.nextInt();
		
		while(num != -1) {
			
			suma += num;
			System.out.println("Introduce un número: ");
			num = in.nextInt();
			
		}
		
		System.out.println("La suma de números es "+suma);
	
		in.close();
		
	}

}
