package ar.com.unlam.test.callcenter;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ar.com.unlam.clases.callcenter.Contacto;
import ar.com.unlam.clases.callcenter.Plantilla;

public class TestCallCenter {

	@Test
	public void dadoQueTengoUnContactoEnUnaPlantillaDeContactos() {

		Contacto contacto = new Contacto();
		Plantilla plantilla = new Plantilla();
		
		
		plantilla.agregarContacto(contacto);
		
		Assert.assertTrue(plantilla.getContactos().contains(contacto));
		
	}

}
