package es.unex.cum.edi.sesion3;

public class RSociales {

	private String nombre;
	private String fundador;
	private int inicio;

	public RSociales() { // Constructor por defecto

		nombre = " ";
		fundador = " ";
		inicio = 0;

	}

	public RSociales(String n, String f, int ini) { // Constructor Parametrizado

		nombre = n;
		fundador = f;
		inicio = ini;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String n) {
		nombre = n;
	}

	public String getFundador() {
		return fundador;
	}

	public void setFundador(String f) {
		fundador = f;
	}

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int ini) {
		inicio = ini;
	}

	public String toString() {
		return "[" + nombre + "," + fundador + "," + inicio + "]";
	}

	public boolean equals(RSociales rs) {
		return (nombre.equals(rs.nombre) && fundador.equals(rs.fundador) && inicio == rs.inicio);
	}

}