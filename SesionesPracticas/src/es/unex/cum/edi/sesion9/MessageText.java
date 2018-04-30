package es.unex.cum.edi.sesion9;

import java.util.Date;

public class MessageText extends Message{

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public MessageText(String text, Date d) {
		super(d);
		this.text = text;
	}
	
	public MessageText() {
		super();
		this.text = "";
	}
	
	public String toString() {
		return ("Mensaje: "+text);
	}
	
}
