package es.unex.cum.edi.sesion9;

import java.util.Vector;

public class Contact {

	private String id;
	private String name;
	private Vector<Message> v;
	
	public void addMessage(Message m){
		v.add(m);
	}

	public Contact() {
		id= new String();

		v=new Vector<Message>();
	}
	
	public Contact(String n, String na) {
		id= n;
		name=na;
		v=new Vector<Message>();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String name) {
		this.id = name;
	}

	
	public Vector<Message> getVector() {
		return v;
	}


	@Override
	public String toString() {
		return "Contact [id=" + id + ", vector=" + v.toString() + "]";
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
