package es.unex.cum.edi.tarea1;

import java.util.Scanner;

public class Tarea11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num=0, fc = 1;
		
		Scanner in = new Scanner (System.in);

		System.out.println("Introduzca un número para calcular su factorial: ");
		num = in.nextLong();
		in.close();
		
		if(num == 0) {
			
			fc = 1;
			
			System.out.println(fc);
			
		}else if(num > 0) {
			
			while(num != 0) {
				
				fc = fc*num;
				num--;
				
			}
			
			System.out.println(fc);
			
		}else {
			
			System.out.println("error");
			
		}
		
	}

}
