package es.unex.cum.edi.sesion1;
import java.io.*;

public class Hellonombre { // Esta es la declaración de nuestra clase

	public static void main (String[] args) throws IOException {

		InputStreamReader reader=new InputStreamReader(System.in); /* Esta instrucción es un lector de cadena */
		BufferedReader Input=new BufferedReader (reader); /* Lector de memoria */
		
		System.out.println ("Introduce tu nombre: "); /* Despliega el mensaje Introduce tu nombre */
		String name= Input.readLine(); /* recibe la entrada del usuario en la variable name */
		System.out.println ("Hello " + name + "!"); /* despliega en pantalla el mensaje y el valor de la variable name */

	}
	
}