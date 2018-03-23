package es.unex.cum.edi.sesion7;

import java.util.Date;

public class Multimedia extends Mensaje{
	
	protected String path;
	
	public Multimedia() {
		super();
		this.path = new String();
	}
	
	public Multimedia(Date fecha,String path) {
		super(fecha);
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "Multimedia [path=" + path + "]";
	}

	public boolean equals(Object o) {
		Multimedia ml = (Multimedia) o;
		return (super.equals(ml) && this.path.equals(ml.path));
	}

}
