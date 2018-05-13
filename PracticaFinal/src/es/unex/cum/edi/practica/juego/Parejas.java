package es.unex.cum.edi.practica.juego;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import es.unex.cum.edi.practica.juego.celda.CeldaPareja;
import es.unex.cum.edi.practica.persona.Invitado;
import es.unex.cum.edi.practica.persona.Jugador;
import es.unex.cum.edi.practica.persona.Persona;


/**
 * Clase Parejas. Esta formada un objeto JuegoParejas y una lista de personas. Esta clase es el main de nuestro proyecto.
 * 
 * @author Jose Anotnio Alvarez
 * @version 1
 * 
 */
public class Parejas {
	private JuegoPareja jp = new JuegoPareja();
	private LinkedList<Persona> personas;
	private Scanner sc = new Scanner(System.in);

	/**
	 * 
	 * @param args - args
	 * @throws IOException - IOException
	 * @throws ClassNotFoundException - ClassNotFoundException
	 */
	public static void main(final String[] args) throws IOException, ClassNotFoundException {
		Parejas p = new Parejas();
		p.menu();
	}

	/**
	 * Constructor que inicializa la lista de personas.
	 */
	public Parejas() {
		personas = new LinkedList<Persona>();
	}

	/**
	 * Metodo que nos muestra el menu para elegir la opcion que queramos y al que llamamos a los diferentes metodos.
	 * @throws IOException - IOException
	 * @throws ClassNotFoundException - ClassNotFoundException
	 */
	public void menu() throws IOException, ClassNotFoundException {
		boolean salir = false;
		int opc;
		Jugador player = null;

		while (!salir) {
			System.out.println("");
			System.out.println("##### MENU #####");
			System.out.println("1.- Cargar lista de personas.");
			System.out.println("2.- Añadir jugador.");
			System.out.println("3.- Jugar.");
			System.out.println("4.- Informacion de jugadas de un jugador.");
			System.out.println("5.- Movimientos de la ultima partida.");
			System.out.println("6.- Guardar lista de personas.");
			System.out.println("7.- Salir");
			System.out.println("");
			System.out.println("Elige una opcion:");
			opc = sc.nextInt();
			System.out.println("");

			switch (opc) {
			case 1:
				System.out.println("");
				System.out.println("Cargando lista de personas, espere por favor.");
				cargar();
				System.out.println("");
				System.out.println("Ya han sido cargadas.");
				break;
			case 2:
				registrarJugador();
				break;
			case 3:
				juego();
				break;
			case 4:
				infJugadas();
				break;
			case 5:
				verMovimientos();
				break;
			case 6:
				System.out.println("");
				System.out.println("Guardando lista de pesondas, espere por favor.");
				salvar();
				System.out.println("");
				System.out.println("Ya han sido guardadas.");
				break;
			case 7:
				System.out.println("Saliendo...");
				salir = true;
				break;
			default:
				System.out.println("Opcion no valida, pruebe de nuevo.");
			}
		}
	}

	/**
	 * Metodo en el que cargamos los datos del fichero "datos.dat" a lista de personas.
	 * @throws FileNotFoundException - FileNotFoundException
	 * @throws IOException - IOException
	 * @throws ClassNotFoundException - ClassNotFoundException
	 */
	public void cargar() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream archivoObjetosEnt = new ObjectInputStream(new FileInputStream("datos.dat"));
		personas = (LinkedList) archivoObjetosEnt.readObject();
		archivoObjetosEnt.close();
	}

	/**
	 * Metodo en el que registramos un nuevo Jugador y lo añadimos a la lista de personas.
	 */
	public void registrarJugador() {

		boolean estado = true;
		System.out.println("Introduce el id:");
		String id = sc.next();
		System.out.println("Introduce el nombre: ");
		String nombre = sc.next();

		Iterator it = personas.iterator();
		if (personas.isEmpty()) {
			personas.add(new Jugador(id, nombre));
			System.out.println("Anadido");
		} else {
			while (it.hasNext()) {
				Jugador ju = (Jugador) it.next();
				if (ju.getId().equals(id)) {
					System.out.println("Ya existe ese id.");
					estado = false;
				}
			}
			if (estado) {
				personas.add(new Jugador(id, nombre));
				System.out.println("Anadido");
			}
		}

	}

	/**
	 * Metodo en el que nos encargamos de preguntar si va a jugar con un usuario que este ya registrado,
	 * o si no jugara como invitado. Una vez que acabe el juego, si era un jugador, guardamos la jugada en 
	 * la lista de jugadas de ese jugador. 
	 * 
	 * @see Class JuegoPareja
	 * @see Class Jugada
	 */
	public void juego() {

		String resp = "S";
		Persona player = null;
		boolean estado = false;

		System.out.println("¿Quieres jugar como usuario registrado? (S/N)");
		String reg = sc.next();
		reg = reg.toUpperCase();
		while(!reg.equals("S") && !reg.equals("N")) {
			System.out.println("Respuesta no válida, intentalo de nuevo.");
			System.out.println("");
			System.out.println("¿Quieres jugar como usuario registrado? (S/N)");
			reg = sc.next();
			reg = reg.toUpperCase();
		}
		if (reg.equals("S")) {
			System.out.println("Introduce el id:");
			String id = sc.next();

			if (personas.isEmpty()) {
				System.out.println("No hay jugadores guardados, vas a jugar como invitado.");
				System.out.println("");
				player = new Invitado();
			} else {
				Iterator it = personas.iterator();
				while (it.hasNext()) {
					Jugador ju = (Jugador) it.next();
					if (ju.getId().equals(id)) {
						player = getJugadorId(id);
						System.out.println("Vas a jugar con el jugador con nombre: " + player.getNombre());
						System.out.println("");
						estado = true;
					}
				}
			}
		} else {
			if (estado == false) {
				System.out.println("Vas a jugar como invitado.");
				System.out.println("");
				player = new Invitado();
			}
		}

		while (resp.equals("S")) {

			Jugada jg = new Jugada();
			Date fecha = new Date();

			long tInicial = new Date().getTime(); // Se coge el tiempo actual
			jp.jugar(sc);
			jp.verSiFin();
			long tFinal = new Date().getTime(); // Se coge el tiempo final
			long tiempo = tFinal - tInicial;

			jg.setTiempo(tiempo);
			jg.setFecha(fecha);

			if (player.getClass().equals(Invitado.class)) {
				System.out.println("");
				System.out.println("Has tardado en completar el juego " + tiempo);
			} else {
				Jugador j = (Jugador) player;
				j.addJugada(jg);
				System.out.println("");
				System.out.println("Has tardado en completar el juego " + tiempo);
			}

			System.out.println("");
			System.out.println("¿Quieres jugar de nuevo? (S/N)");
			resp = sc.next();
			resp = resp.toUpperCase();

		}
	}

	/**
	 * Metodo en el que muestra las jugadas de un jugador al que localizamos por su id.
	 */
	public void infJugadas() {

		System.out.println("Introduce el id del jugador que quieres consultar sus jugadas: ");
		String id = sc.next();
		boolean estado = false, enc = false;
		Jugador player = null;
		Iterator it = personas.iterator();
		while (it.hasNext()) {
			Jugador ju = (Jugador) it.next();
			if (ju.getId().equals(id)) {
				player = (Jugador) getJugadorId(id);
				estado = true;
			}
		}
		if (estado == true) {
			Iterator ite = player.getArrayList().iterator();
			while (ite.hasNext()) {
				Jugada jj = (Jugada) ite.next();
				System.out.println("Jugadas del jugador " + player.getNombre() + ": Fecha= " + jj.getFecha()
						+ ", Tiempo= " + jj.getTiempo());
				enc = true;
			}

			if(enc == false) {
				System.out.println("El jugador "+player.getNombre()+" no tiene jugadas.");
			}
		} else {
			System.out.println("Ese id no corresponde con ningún jugador");
		}

	}

	/**
	 * Metodo que recorremos la cola de forma destructiva de la clase JuegoPareja en la que mostramos todos 
	 * los ultimos movimientos de la ultima partida jugada.
	 */
	public void verMovimientos() {
		if (jp.getQueue().isEmpty()) {
			System.out.println("No hay movimientos.");
		} else {
			while (!jp.getQueue().isEmpty()) {
				CeldaPareja jP = (CeldaPareja) jp.getQueue().poll();
				System.out.println("Movimiento: Fila=" + (jP.getFila() + 1) + ", Columna=" + (jP.getColumna() + 1));
			}
		}
	}

	/**
	 * Metodo en el que guardamos el contenido de la lista de personas en el archivo "datos.dat"
	 * @throws FileNotFoundException - FileNotFoundException
	 * @throws IOException - IOException
	 */
	public void salvar() throws FileNotFoundException, IOException {
		ObjectOutputStream archivoObjetosSal = new ObjectOutputStream(new FileOutputStream("datos.dat"));
		archivoObjetosSal.writeObject(personas);
		archivoObjetosSal.close();
	}

	/**
	 * Metodo en el que comparamos un id pasado por parametro para buscar si existe en la lista de personas.
	 * En el caso afirmativo, devolvemos el jugador.
	 * @param id - Id de una persona.
	 * @return - el jugador cuyo id es el pasado por parametro.
	 */
	public Persona getJugadorId(String id) {
		Jugador player = null;
		Iterator it = personas.iterator();
		while (it.hasNext()) {
			Jugador jug = (Jugador) it.next();
			if (jug.getId().equals(id))
				player = jug;
		}
		return player;
	}

}
