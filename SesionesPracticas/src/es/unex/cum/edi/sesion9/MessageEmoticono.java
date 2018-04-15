package es.unex.cum.edi.sesion9;

import java.util.Date;

public class MessageEmoticono extends Message{

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public MessageEmoticono(String text, Date d) {
		super(d);
		this.text = text;
	}
	
	public MessageEmoticono() {
		super();
		this.text = "";
	}
	
}
