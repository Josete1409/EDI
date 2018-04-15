package es.unex.cum.edi.sesion9;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class MemCUM {
	private LinkedList<Usuario> lista;

	public static void main(final String[] args) throws IOException {
		MemCUM h = new MemCUM();
		h.run();
	}

	public MemCUM() {
		lista = new LinkedList<Usuario>();
	}

	private void run() throws IOException {
		Teclado leer = new Teclado();
		int num, op;
		Usuario currentUser = null;
		do {
			String[] menu = { "1.- Registrarse", "2.- Loguearse", "3.- Anade contacto con contacto",
					"4.- Mostrar Peticiones", "5.- Obtener contacto por id",
					"6.- Obtener todos los mensajes de un contacto", "7.- Anadir Mensaje a un contacto",
					"8.- Mostrar Contactos", "9.- Obtener el ultimo mensaje de un contacto", "10.- Salir" };
			op = leer.Menu(menu, 1, 10);
			switch (op) {
			case 1:
				registrer(leer);
				break;
			case 2:
				currentUser = signIn();
				break;
			case 3:
				if (currentUser != null)
					addContact(currentUser);
				break;
			case 4:
				if (currentUser != null)
					showRequestContact(currentUser);
				break;
			case 5:
				if (currentUser != null)
					getContact(currentUser);
				break;
			case 6:
				if (currentUser != null)
					showAllMessageContact(currentUser);
				break;
			case 7:
				if (currentUser != null)
					addMessageContact(currentUser);
				break;
			case 8:
				if (currentUser != null)
					showContacts(currentUser);
				break;
			case 9:
				if (currentUser != null)
					getLastMessageContact(currentUser);
				break;
			case 10:
				System.out.println("Saliendo");
				break;
			}

		} while (op != 10);

	}

	/**
	 * Registra un usuario en la lista de usuario. Se pide id, name y password.
	 * Muestra el mensaje "Anadido" si se aÃ±ade y "Error" si no se ha podido
	 * aÃ±adir
	 * 
	 * @throws IOException
	 * 
	 */
	private void registrer(Teclado leer) throws IOException {
		// TODO Auto-generated method stub

		String id = leer.literalConString("Introduce el id: ");
		String name = leer.literalConString("Introduce el nombre: ");
		String pass = leer.literalConString("Introduce una contraseña: ");

		Iterator it = lista.iterator();
		Usuario usu = (Usuario) it.next();

		// if (!it.hasNext()) {
		if (!it.hasNext() && (!usu.getId().equals(id))) {
			lista.add(new Usuario(id, name, pass));
			System.out.println("Anadido");
		} else {
			System.out.println("Error");
		}

		/*
		 * lista.add(new Usuario(id, name, pass)); System.out.println("Anadido"); } else
		 * {
		 * 
		 * Usuario usu = (Usuario) it.next(); if (usu.getId().equals(id)) {
		 * System.out.println("Error"); } else { lista.add(new Usuario(id, name, pass));
		 * System.out.println("Anadido"); }
		 * 
		 * }
		 */

	}

	/*
	 * Se registra un usuario en el sistema. Debe leer el id y el password. Si es
	 * correcto se muestra "Registrado" y se devuelve el usuario y en caso contrario
	 * se devuelve null y se muestra "Error"
	 */
	private Usuario signIn() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * AÃ±ade un contacto al usuario actual recibido por parametro. Debe pedir el
	 * identificador del Contacto y se debe buscar en el sistema. SI es asÃ­, se
	 * aÃ±ade a la lista del usuario actual y ademÃ¡s el usuario actual se aÃ±ade a
	 * la cola de peticiones del usuario encontrado. Si todo va bien, se muestra
	 * "Anadido" y sino "Error"
	 * 
	 * @param currentUser
	 */
	private void addContact(Usuario currentUser) {

	}

	/**
	 * Muestra el nombre de todos los usuario getName() que se encuentra en la cola
	 * de peticiones en el formato "[Contact: <name>]. Si no hay contactos, se
	 * muestra el mensaje "No hay contactos"
	 * 
	 * @param currentUser
	 */
	private void showRequestContact(Usuario currentUser) {
		// TODO Auto-generated method stub

	}

	/**
	 * Muestra el name del contacto que se pide por teclado (id). Si funciona se
	 * muestra el nombre y sino se muestra "Error"
	 * 
	 * @param currentUser
	 */
	private void getContact(Usuario currentUser) {
		// TODO Auto-generated method stub

	}

	/*
	 * Muestra todos los mensajes del contacto (id) leido por teclado para el
	 * usuario actual. Para ello recorre el vector y hace la llamada al mÃ©todo
	 * toString() de mensaje que serÃ¡ en formato Mensaje: <text> <text>].Todos los
	 * mensajes serÃ¡n de tipo textual. Si no tiene mensajes, se muestra "Error"
	 */
	private void showAllMessageContact(Usuario currentUser) {
		// TODO Auto-generated method stub

	}

	// AÃ±ade un mensaje de tipo texto (text) para el contacto leido (id). Si todo
	// funciona correctamente mostrar el mensaje "Anadido" en caso contrario "Error"
	private void addMessageContact(Usuario currentUser) {
		// TODO Auto-generated method stub

	}

	/**
	 * Muestra todos los contactos [Contact: .getName()] para el usuario actual
	 * 
	 * @param currentUser
	 */
	private void showContacts(Usuario currentUser) {
		// TODO Auto-generated method stub

	}

	/**
	 * Dado un identificador de contacto, muestra el Ãºltimo mensaje intercambiado
	 * con el usuario actual. * @param currentUser
	 */
	private void getLastMessageContact(Usuario currentUser) {
		// TODO Auto-generated method stub

	}

}
