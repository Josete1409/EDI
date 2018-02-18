package es.unex.cum.edi.sesion3;

import es.unex.cum.edi.sesion3.Palabra;

public class Main{

	public static void main(String[] args) {

		Palabra p1 = new Palabra("Casa",4,"Lugar donde se habita");
		Palabra p2 = new Palabra("Balon",5,"Pelota grande, usada en juegos");
	
		System.out.println(p1.getTexto());
		
	}
	
}