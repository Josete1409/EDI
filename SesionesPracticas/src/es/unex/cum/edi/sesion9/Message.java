package es.unex.cum.edi.sesion9;

import java.util.Date;

public class Message {

	private Date date;

	
	public Message() {
		date= new Date();
	}
	public Message( Date date) {
		this.date = date;
	}
	

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Message [date=" + date + "]";
	}
	
	

}
