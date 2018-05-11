package es.unex.cum.edi.sesion10;

public class Arbol {

	private Arbol _izquierda;
	private Arbol _derecha;
	private Object _raiz;

	// public static int LADO_IZDO= 1;
	// public static int LADO_DRCHO= 2;
	public Arbol(Object elemento) {
		this._raiz = elemento;
	}

	public Arbol(Object elemento, Arbol izq, Arbol der) {
		this._raiz = elemento;
		this._izquierda = izq;
		this._derecha = der;
	}

	public Arbol() {
		this._raiz = null;
		this._izquierda = null;
		this._derecha = null;
	}

	public boolean vacio() {
		return (this == null || _raiz == null);
	}

	public boolean es_hoja() {
		return (_izquierda == null && _derecha == null);
	}

	public Object raiz() {
		return _raiz;
	}

	public Arbol hijoizq() {
		return _izquierda;
	}

	public Arbol hijoder() {
		return _derecha;
	}

	public void insertarOrden(Comparable o) throws ArbolException {
		if (vacio()) {
			_raiz = o;
			System.out.println("Insertado " + o);
		} else if (_raiz.equals(o)) {
			throw new ArbolException("Elemento Repetido");
		} else {
			int status = o.compareTo(_raiz);
			if (status < 0) {
				if (_izquierda == null) {
					_izquierda = new Arbol();
				}
				_izquierda.insertarOrden(o);
			} else if (status > 0) {
				if (_derecha == null) {
					_derecha = new Arbol();
				}
				_derecha.insertarOrden(o);
			}
		}
	}

	public void insertar(Object o) throws ArbolException {
		if (vacio()) {
			_raiz = o;
			System.out.println("Insertado " + o);
		} else {
			int lado = (int) (Math.random() * 2);
			if (lado == 1) {
				if (_izquierda == null) {
					_izquierda = new Arbol();
				}
				_izquierda.insertar(o);

			} else {
				if (_derecha == null) {
					_derecha = new Arbol();
				}
				_derecha.insertar(o);
			}
		}
	}
}
