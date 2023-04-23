package ar.com.unlam.clases.callcenter;

import java.util.ArrayList;
import java.util.Random;

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

	public Contacto obtenerCandidato() {
		
		ArrayList<Contacto> lista = new ArrayList<Contacto>();
		
		for(Contacto contacto : contactos) {
			if(contacto.getEsCliente()==false && contacto.getSerLlamado() == true && (contacto.getCodigoPostal() > 1200 && contacto.getCodigoPostal()<1800)) {
				
				lista.add(contacto);
				
			}
		}
		
		Contacto elementoAleatorio = seleccionAleatoria(lista);
		
		return elementoAleatorio;
		
	}

	private Contacto seleccionAleatoria(ArrayList<Contacto> lista) {
		
		Random rand = new Random();
        int indiceAleatorio = rand.nextInt(lista.size());
        Contacto elementoAleatorio = lista.get(indiceAleatorio);
        return elementoAleatorio;
	}

	
}
