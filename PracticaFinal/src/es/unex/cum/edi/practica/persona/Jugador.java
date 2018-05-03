package es.unex.cum.edi.practica.persona;

import java.io.Serializable;
import java.util.ArrayList;

import es.unex.cum.edi.practica.juego.Jugada;

public class Jugador extends Persona implements Serializable {

	protected ArrayList<Jugada>lista;
	
	public Jugador() {
		super();
		lista = new ArrayList<Jugada>();
	}
	
	public ArrayList<Jugada> getArrayList(){
		return lista;
	}
	
	public void addJugada(Jugada j) {
		lista.add(j);
	}

	@Override
	public String toString() {
		return "Jugador [lista=" + lista + "]";
	}
	
	
}
