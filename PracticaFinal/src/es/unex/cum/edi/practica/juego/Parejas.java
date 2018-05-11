package es.unex.cum.edi.practica.juego;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Scanner;

import es.unex.cum.edi.practica.persona.Persona;

public class Parejas {
	JuegoPareja jp = new JuegoPareja();
	LinkedList<Persona> personas;

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub

		Parejas p = new Parejas();
		Scanner sc = new Scanner(System.in);
		String resp = "S";
		
		
		
		while (resp.equals("S")) {

			p.jp.jugar(sc);
			p.jp.verSiFin();

			System.out.println("");
			System.out.println("¿Quieres jugar de nuevo? (S/N)");
			resp = sc.next();
			resp = resp.toUpperCase();

		}
	}
	

	public void salvar() throws FileNotFoundException, IOException {
		ObjectOutputStream archivoObjetosSal = new ObjectOutputStream(new FileOutputStream("datos.dat"));
		archivoObjetosSal.writeObject(personas);
		archivoObjetosSal.close();
	}

	public void cargar() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream archivoObjetosEnt = new ObjectInputStream(new FileInputStream("datos.dat"));
		personas = (LinkedList) archivoObjetosEnt.readObject();
		archivoObjetosEnt.close();
	}

}
