package ar.com.unlam.clases.callcenter;

import java.util.ArrayList;

public class Plantilla {
	
	ArrayList<Contacto> contactos = new ArrayList<>();
	
	public Plantilla(ArrayList<Contacto> contactos) {
		super();
		this.contactos = contactos;
	}
	
	public Plantilla() {
		
	}

	public void agregarContacto(Contacto contact) {
		
		this.contactos.add(contact);
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	
}
