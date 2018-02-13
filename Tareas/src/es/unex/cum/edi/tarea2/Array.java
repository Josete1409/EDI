package es.unex.cum.edi.tarea2;

import java.util.Scanner;

public class Array {

	private int[] v = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		
		Scanner in = new Scanner(System.in);
		Array a1 = new Array();
		
		a1.rellenar(in);
		System.out.println("");
		num = in.nextInt();
		in.close();
		System.out.println("Suma:"+a1.suma()+" Media:"+a1.media()+" Primera:"+a1.posicion(num)+" Ocurrencias:"+a1.ocurrencias(num)+" Alto:"+a1.alto());


	}

	public void rellenar(Scanner in) {

		for (int i = 0; i < v.length; i++) {

			v[i] = in.nextInt();

		}

	}

	public int suma() {

		int s = 0;

		for (int i = 0; i < v.length; i++) {

			s = v[i] + s;

		}

		return s;
	}

	public float media() {

		float med = 0;

		med = ((float) suma()) / (v.length);

		return med;

	}
	
	public int posicion(int num) {
		
		int p = -1;
		
		for(int i=0; i<v.length; i++) {
			
			if(v[i] == num) {
				
				p = i;
				
				break;
				
			}
			
		}
		
		return p;
	}

	public int ocurrencias(int num) {
		
		int o = num, cont = 0;
		
		for(int i=0; i<v.length; i++) {
			
			if(o == v[i]) {
				
				cont++;
				
			}
			
		}
		
		return cont;
	}
	
	
	public int alto() {
		
		int max = 0, aux = 0;
		
		for(int i=0; i<v.length; i++) {
			
			aux = v[i];
			
			if(aux>max) {
				
				max = aux;
				
			}
		}	
		
		return max;
	}
}
