package es.unex.cum.edi.sesion9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Usuario {
	private String id;
	private String password;
	private String name;
	private List<Contact> v;
	private Queue<Contact> request;

	public Usuario(String id, String password, String name) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.v = new LinkedList<Contact>();
		this.request = new LinkedList<Contact>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contact> getV() {
		return v;
	}

	///////////////////////////
	///////////////////////////
	///////////////////////////

	public boolean addQueue(Contact c) {
		return request.offer(c);
	}

	public Queue<Contact> getQueue() {
		return request;
	}

	public boolean addContact(Contact c) {
		if (this.getContactId(c.getId()) == null) {
			v.add(c);
			return true;
		} else
			return false;
	}

	public boolean addContact(String id, String name) {
		if (this.getContactId(id) == null) {
			v.add(new Contact(id, name));
			return true;
		} else
			return false;
	}

	public Contact getContactId(String id) {
		Contact c = null;
		Iterator it = v.iterator();
		while (it.hasNext()) {
			Contact y = (Contact) it.next();
			if (y.getId().equals(id))
				c = y;
		}
		return c;
	}

	public Contact getContactName(String name) {
		Contact c = null;
		Iterator it = v.iterator();
		while (it.hasNext()) {
			Contact y = (Contact) it.next();
			if (y.getName().equals(id))
				c = y;
		}
		return c;
	}

	public boolean addMessageToContact(String id, Message m) {
		Contact c = getContactId(id);
		if (c == null)
			return false;
		else
			c.addMessage(m);
		return true;
	}

	public void showRequestContact() {
		// TODO Auto-generated method stub

	}

}
