package es.unex.cum.edi.sesion9;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class MemCUM {
	private LinkedList<Usuario> lista;
	private Teclado leer = new Teclado();

	public static void main(final String[] args) throws IOException {
		MemCUM h = new MemCUM();
		h.run();
	}

	public MemCUM() {
		lista = new LinkedList<Usuario>();
	}

	private void run() throws IOException {
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
				registrer();
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
	 *             Usuario u = null; Iterator it = u.
	 * 
	 */
	private void registrer() throws IOException {
		// TODO Auto-generated method stub

		boolean estado = true;
		String id = leer.literalConString("Introduce el id: ");
		String name = leer.literalConString("Introduce el nombre: ");
		String pass = leer.literalConString("Introduce una contraseña: ");

		Iterator it = lista.iterator();
		if (lista.isEmpty()) {
			lista.add(new Usuario(id, pass, name));
			System.out.println("Anadido");
		} else {
			while (it.hasNext()) {
				Usuario u = (Usuario) it.next();
				if (u.getId().equals(id)) {
					System.out.println("Error");
					estado = false;
				}
			}
			if (estado) {
				lista.add(new Usuario(id, pass, name));
				System.out.println("Anadido");
			}
		}
	}

	/*
	 * Se registra un usuario en el sistema. Debe leer el id y el password. Si es
	 * correcto se muestra "Registrado" y se devuelve el usuario y en caso contrario
	 * se devuelve null y se muestra "Error"
	 */
	private Usuario signIn() throws IOException {
		// TODO Auto-generated method stub
		
		boolean estado = false;
		String id = leer.literalConString("Introduce el id: ");
		String pass = leer.literalConString("Introduce una contraseña: ");

		if (lista.isEmpty()) {
			System.out.println("Error");
		}else {	
			Iterator it = lista.iterator();
			while (it.hasNext()) {
				Usuario u = (Usuario) it.next();
				if (u.getId().equals(id) && u.getPassword().equals(pass)) {
					estado = true;
					return u;
				}
			}
			if(estado == true) {
				System.out.println("Registrado");
			}else {
				System.out.println("Error");
			}
		}
		
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
	 * @throws IOException
	 */
	private void addContact(Usuario currentUser) throws IOException {

		boolean estado = false;
		String id = leer.literalConString("Introduce el id del contacto: ");

		Iterator it = lista.iterator();
		if (lista.isEmpty()) {
			System.out.println("Error");
		} else {
			
			while (it.hasNext()) {
				Usuario u = (Usuario) it.next();
				if (u.getId().equals(id)) {
					Contact c = new Contact(id, u.getName());
					currentUser.addContact(c);
					System.out.println("Anadido");
					u.addQueue(u.getContactId(id)); // Añadimos a la cola del usuario buscado la peticion del contacto
					estado = true;
					break;
				}
			}

			if (estado == false) {
				System.out.println("Error");
			}
		}

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

		Iterator it = currentUser.getQueue().iterator();

		if (currentUser.getQueue().isEmpty()) {
			System.out.println("No hay contactos");
		} else {
			while (it.hasNext()) {
				Usuario u = (Usuario) it.next();
				System.out.println("[Contact: "+u.getContactName(currentUser.getName())+"]");
			}
		}
	}

	/**
	 * Muestra el name del contacto que se pide por teclado (id). Si funciona se
	 * muestra el nombre y sino se muestra "Error"
	 * 
	 * @param currentUser
	 * @throws IOException
	 */
	private void getContact(Usuario currentUser) throws IOException {
		// TODO Auto-generated method stub

		String id = leer.literalConString("Introduce el id del contacto: ");

		Iterator it = currentUser.getV().iterator();
		if (currentUser.getV().isEmpty()) {
			System.out.println("Error");
		} else {
			while (it.hasNext()) {
				Contact c = (Contact) it.next();
				if(c.getId().equals(id)) {
					System.out.println(c.getName());
				}
				break;
			}
		}

	}

	/*
	 * Muestra todos los mensajes del contacto (id) leido por teclado para el
	 * usuario actual. Para ello recorre el vector y hace la llamada al mÃ©todo
	 * toString() de mensaje que serÃ¡ en formato Mensaje: <text> <text>].Todos los
	 * mensajes serÃ¡n de tipo textual. Si no tiene mensajes, se muestra "Error"
	 */
	private void showAllMessageContact(Usuario currentUser) throws IOException {
		// TODO Auto-generated method stub

		String id = leer.literalConString("Introduce el id del contacto: ");
		
		Iterator it = currentUser.getV().iterator();
		
		
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

		Iterator it = currentUser.getV().iterator();

		if (currentUser.getV().isEmpty()) {
			System.out.println("No hay contactos");
		} else {
			while (it.hasNext()) {
				Contact c = (Contact) it.next();
				System.out.println("[Contact: " + c.getName() + "]");
			}
		}
	}

	/**
	 * Dado un identificador de contacto, muestra el Ãºltimo mensaje intercambiado
	 * con el usuario actual. * @param currentUser
	 * @throws IOException 
	 */
	private void getLastMessageContact(Usuario currentUser) throws IOException {
		// TODO Auto-generated method stub

		String id = leer.literalConString("Introduce el id del contacto: ");
		
		Iterator it = lista.iterator();
		while(it.hasNext()) {
			Usuario u = (Usuario) it.next();
			if(u.getId().equals(id)) {
				
			}
		}
	}

}
