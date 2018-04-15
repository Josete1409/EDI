package es.unex.cum.edi.sesion9;

public class Nodo {
	// Miembros Dato
	protected Object data;
	protected Nodo enlace;

	public Nodo() { // Constructor por defecto
		this.data = null;
		this.enlace = null;
	}

	public Nodo(Object inf, Nodo enlace) { // Constructor parametrizado
		this.data = inf;
		this.enlace = enlace;
	}

	public void setEnlace(Nodo n) { // Enlazar con el siguiente nodo
		this.enlace = n;
	}

	public Nodo getEnlace() { // Devuelve el apuntador al sig. nodo
		return this.enlace;
	}

	public void setData(Object e) { // Carga el nodo con información
		this.data = e;
	}

	public Object getData() { // Devuelve la información
		return this.data;
	}

	public static void main(String[] args) {
		Nodo n3 = new Nodo("Valor3", null);
		Nodo n2 = new Nodo("Valor2", n3);
		Nodo n = new Nodo("Valor1", n2);
		Nodo indice;
		/*
		 * for (indice = n1; indice != null; indice = indice.getEnlace()) {
		 * System.out.print(indice.getData() + ""); }
		 */

		// Se añade por el final
		Nodo n4 = new Nodo("Valor4", null);
		for (indice = n; indice != null; indice = indice.getEnlace()) {
			if (indice.getEnlace() == null) {
				indice.setEnlace(n4);
				break;
			}
		}
		// Se añade por el principio
		n = new Nodo("Valor0", n);
		

		Nodo buscar = new Nodo("Valor8", null);
		if (n.getData().equals(buscar.getData()))
			n = n.getEnlace();
		else {
			// encontrar el predecesor y cambiar su enlace
			Nodo nodoAnterior = n;
			Nodo nodoActual = n.getEnlace();
			while (nodoActual != null)
				if (nodoActual.getData().equals(buscar.getData())) {
					nodoAnterior.setEnlace(nodoActual.getEnlace()); 
					nodoActual=nodoActual.getEnlace();
				} else {
					nodoAnterior = nodoActual;
					nodoActual=nodoActual.getEnlace();
				}
		}

		for (indice = n; indice != null; indice = indice.getEnlace()) {
			System.out.print(indice.getData() + "");
		}

	}
}