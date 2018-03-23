package es.unex.cum.edi.sesion7;

import java.util.Date;

public class Mensaje {

	private Date fecha;
	
	public Mensaje() {
		fecha = new Date();
	}
	
	public Mensaje(Date fecha) {
		
		this.fecha = fecha;

	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Mensaje [fecha=" + fecha + "]";
	}
	
	public boolean equals(Object o) {
		Mensaje m = (Mensaje) o;
		return (this.fecha.equals(m.fecha));
	}
	
}
