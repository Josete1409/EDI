package es.unex.cum.edi.sesion2;

import java.util.Random;
import java.util.Scanner;

public class EjercicioArray {

	private int[] v = new int[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EjercicioArray a1 = new EjercicioArray();
		
		a1.aleatorio();
		a1.listar();
		System.out.println();
		a1.inicializar();
		a1.listar();
		System.out.println();
		System.out.println("Suma de los elementos del array: "+a1.suma());
		System.out.println();
		System.out.println("Media de los elementos del array: "+a1.media());
		
	}

	public void aleatorio() {
		
		Random rand = new Random();
		
		for(int i=0; i<v.length; i++) {
			
			v[i] = rand.nextInt();
			
		}
			
	}
	
	public void inicializar() {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Escribe los valores del array: ");
		
		for(int i=0; i<v.length; i++) {
			
			v[i] = in.nextInt();
			
		}
		
	}
	
	public void listar() {
		
		for(int i=0; i<v.length; i++) {
			
			System.out.print(v[i]+" ");
			
		}
		
		System.out.println();
		
	}
	
	public double suma() {
		
		int sum = 0;
		
		for(int i=0; i<v.length; i++) {
			
			sum = v[i]+sum;
			
		}
		
		return sum;
		
	}
	
	public float media() {
		
		float med = 0;
		
		med = ((float)suma())/(v.length);
		
		return med;
		
	}
	
	
}
