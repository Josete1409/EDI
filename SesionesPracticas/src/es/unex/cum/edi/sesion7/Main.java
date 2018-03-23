package es.unex.cum.edi.sesion7;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact c = new Contact("Jose");
		c.addMensaje(new Texto(new Date(),"Hi!!!"));
		c.addMensaje(new Texto(new Date(),"Hi22!!!"));
		c.addMensaje(new Texto(new Date(),"Hi333!!!"));
		
		for(int i = 0; i<c.getV().size(); i++) {
			
		}
		
	}

}
