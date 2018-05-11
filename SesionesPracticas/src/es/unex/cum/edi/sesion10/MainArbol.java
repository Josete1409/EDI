package es.unex.cum.edi.sesion10;

public class MainArbol {

	public void PreOrden(Arbol A) {
		System.out.println(A.raiz());
		if (A.hijoizq() != null) {
			PreOrden(A.hijoizq());
		}
		if (A.hijoder() != null) {
			PreOrden(A.hijoder());
		}
	}

	public void PostOrden(Arbol A) {
		if (A.hijoizq() != null) {
			PostOrden(A.hijoizq());
		}
		if (A.hijoder() != null) {
			PostOrden(A.hijoder());
		}
		System.out.println(A.raiz());
	}

	public void EnOrden(Arbol A) {
		if (A.hijoizq() != null) {
			EnOrden(A.hijoizq());
		}
		System.out.println(A.raiz());
		if (A.hijoder() != null) {
			EnOrden(A.hijoder());
		}
	}

	public boolean Encontrar(Arbol A, Comparable value) {
		if (A == null || A.vacio()) {
			return false;
		} else if (value.compareTo(A.raiz()) == 0) {
			return true;
		} else {
			return (Encontrar(A.hijoder(), value) || Encontrar(A.hijoizq(), value));
		}
	}

	int sumaPersona(Arbol A) {
		if (A == null)
			return 0;
		if (A.es_hoja()) {
			return ((Persona) (A.raiz())).get_edad();
		} else {
			int raiz = ((Persona) (A.raiz())).get_edad();
			return (raiz + sumaPersona(A.hijoizq()) + sumaPersona(A.hijoder()));
		}
	}
	
	int suma(Arbol A) {
		if (A == null)
			return 0;
		if (A.es_hoja()) {
			return Integer.parseInt(String.valueOf(A.raiz()));
		} else {
			int raiz = Integer.parseInt(String.valueOf(A.raiz()));
			return (raiz + suma(A.hijoizq()) + suma(A.hijoder()));
		}
	}

	public void ejercicios(Arbol a) {
		System.out.println("------------------");
		System.out.println("Ejercicios con el primer árbol");
		System.out.println("La suma es:" + suma(a));
		System.out.println("-----PostOrden------");
		PostOrden(a);
		System.out.println("-----EnOrden------");
		EnOrden(a);
		System.out.println("-----PreOrden------");
		PreOrden(a);
		boolean enc = Encontrar(a, new Integer(7));
		if (enc) {
			System.out.println("El dato se encuentra");
		} else {
			System.out.println("El dato NO se encuentra");
		}

	}

	public Arbol Crear_Con_Subarboles() {
		Arbol a5 = new Arbol(new Integer("16"), null, null);
		Arbol a4 = new Arbol(new Integer("7"), null, null);
		Arbol a3 = new Arbol(new Integer("5"), a5, a4);
		Arbol a2 = new Arbol(new Integer("15"), null, null);
		Arbol a = new Arbol(new Integer("10"), a3, a2);
		return a;
	}

	public Arbol Crear_Insertando() {
		Arbol a = new Arbol();
		try {
			a.insertar(new Integer("10"));
			a.insertar(new Integer("15"));
			a.insertar(new Integer("5"));
			a.insertar(new Integer("2"));
			a.insertar(new Integer("7"));
		} catch (ArbolException ex) {
			System.out.println(ex.getMessage());
		}
		return a;
	}

	public Arbol CrearOrdenado() {
		Arbol a = new Arbol();
		try {
			a.insertarOrden(new Integer("20"));
			a.insertarOrden(new Integer("14"));
			a.insertarOrden(new Integer("30"));
			a.insertarOrden(new Integer("5"));
			a.insertarOrden(new Integer("90"));
			a.insertarOrden(new Integer("45"));
			a.insertarOrden(new Integer("9"));
			a.insertarOrden(new Integer("7"));
		} catch (ArbolException ex) {
			System.out.println(ex.getMessage());
		}
		return a;
	}

	private Arbol crearPersonas() {
		Arbol a = new Arbol();
		try {
			a.insertarOrden(new Alumno("pepe", "pepe", "123", 10, "Infor"));
			a.insertarOrden(new Alumno("ana", "dominguez", "23", 14, "Tele"));
			a.insertarOrden(new Alumno("Antonio", "Lolo", "455", 15, "Doble"));
		} catch (ArbolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	public boolean siOrdenado(Arbol a) {
		if (a == null)
			return false;
		else {
			Arbol iz = a.hijoizq();
			Arbol de = a.hijoder();
			if (iz == null && de == null)
				return true;
			else if (iz != null && de != null) {
				// si valor es menor que cero significa que el hijo izquierdo es mayor que su
				// padre
				// (deberia ser el derecho el mayor)
				int valor = ((Comparable) a.raiz()).compareTo(a.hijoizq().raiz());
				// si el valor2 es mayor que cero entonces el hijo derecho es menor que su
				// padre.
				int valor2 = ((Comparable) a.raiz()).compareTo(a.hijoder().raiz());
				if (valor < 0 || valor2 > 0)
					return false;
				else
					return siOrdenado(a.hijoizq()) && siOrdenado(a.hijoder());
			} else if (iz == null) {
				if (((Comparable) a.raiz()).compareTo(de.raiz()) > 0)
					return false;
				else
					return siOrdenado(de);

			} else {
				if (((Comparable) a.raiz()).compareTo(iz.raiz()) < 0)
					return false;
				else
					return siOrdenado(iz);
			}
		}
	}

	public static void main(String args[]) {
		MainArbol t1 = new MainArbol();
		// Arbol a = t1.Crear_Insertando();
		// Arbol a = t1.CrearOrdenado();
		// Arbol a = t1.Crear_Con_Subarboles();
		// t1.ejercicios(a);
		// if (t1.siOrdenado(a) == true) {
		// System.out.println("Esta ordenado");
		// } else {
		// System.out.println("No esta ordenado");
		// }
		Arbol a2 = t1.crearPersonas();
		//t1.ejercicios(a2);
		System.out.println(t1.sumaPersona(a2));

	}

}
