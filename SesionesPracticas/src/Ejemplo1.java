import java.io.*;

public class Ejemplo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader Input=new BufferedReader (new InputStreamReader(System.in));
		float nota1, nota2, media;
		
		System.out.println("Introduce el primer valor: ");
		String v1 = Input.readLine();
		nota1 = Float.parseFloat(v1); 
		
		System.out.println("Introduce el segundo valor: ");
		String v2 = Input.readLine();
		nota2 = Float.parseFloat(v2);
		
		media = (nota1+nota2)/2;
		
		System.out.println("El valor medio de los dos valores es: "+media+" por lo tanto: ");
		
		String calificacion;
		
		if (media >= 9){calificacion="Sobresaliente";}
		else if (media >= 8){calificacion="Notable"; }
		else if (media >= 6){calificacion="Bien";}
		else if(media >= 5){calificacion="Aprobado";}
		else{calificacion="Suspenso";}
		
		System.out.println(calificacion);
		
	}

}
