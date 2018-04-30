package es.unex.cum.edi.practica.juego;

import java.util.Date;

public class Jugada {

	public long tiempo;
	public Date fecha;
	
	public Jugada() {
		tiempo = -1;
		fecha = new Date();
	}
	
	public Jugada(long tiempo, Date fecha) {
		this.tiempo = tiempo;
		this.fecha = fecha;
	}
	
	public long getTiempo() {
		return tiempo;
	}
	
	public void setTiempo(long tiempo) {
		this.tiempo = tiempo;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String toString() {
		return "Jugada [Tiempo: "+this.tiempo+", Fecha: "+this.fecha+"]";
	}
	
	public boolean equals(Object o) {
		Jugada jd = (Jugada) o;
		return (tiempo == jd.tiempo && fecha.equals(jd.fecha));
	}
}
