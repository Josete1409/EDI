package es.unex.cum.edi.sesion7;

import java.util.Date;

public class Emoticono extends Mensaje{
	
	protected String emo;
	
	public Emoticono() {
		super();
		this.emo = new String();
	}
	
	public Emoticono(Date fecha,String emo) {
		super(fecha);
		this.emo = emo;
	}

	public String getEmo() {
		return emo;
	}

	public void setEmo(String emo) {
		this.emo = emo;
	}

	@Override
	public String toString() {
		return super.toString() + "Emoticono [emo=" + emo + "]";
	}

	public boolean equals(Object o) {
		Emoticono e = (Emoticono) o;
		return (super.equals(e) && this.emo.equals(e.emo));
	}

}
