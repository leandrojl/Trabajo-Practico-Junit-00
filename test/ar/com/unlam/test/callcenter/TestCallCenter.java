package ar.com.unlam.test.callcenter;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ar.com.unlam.clases.callcenter.Contacto;
import ar.com.unlam.clases.callcenter.Operador;
import ar.com.unlam.clases.callcenter.Plantilla;

public class TestCallCenter {

	@Test
	public void dadoQueTengoUnContactoEnUnaPlantillaDeContactos() {

		Contacto contacto = new Contacto();
		Plantilla plantilla = new Plantilla();
		
		
		plantilla.agregarContacto(contacto);
		
		Assert.assertTrue(plantilla.getContactos().contains(contacto));
		
	}
	
	@Test
	public void dadoQueTengoUnOperadorYPuedeLlamarAUnContacto() {
		
		Operador operador = new Operador();
		Contacto contacto = new Contacto();
		
		operador.realizarLlamada(contacto);
		
		
		Assert.assertTrue(contacto.getEnLlamada());
	}
	
	/*String nombre;
		String apellido;
		Integer celular;
		String email;
		String direccion;
		Integer codigoPostal;
		String localidad;
		String provincia;
		Boolean esCliente;
		Boolean serLlamado;
		Boolean enLlamada=false;
	 * 
	 * */
	
	@Test
	public void cuandoUnOperadorBuscaEnLaPlantillaDeContactosAlCandidato() {
		
		Operador operador = new Operador();
		Plantilla plantilla = new Plantilla();
		Contacto contacto1 = new Contacto("Leandro","Lopez",1128933232,"sabroso1@gmail.com","Siempre viva",1700,"Castelar","Buenos Aires",false,true);
		Contacto contacto2 = new Contacto("Lelo","Losaldo",1123233232,"sabroso2@gmail.com","Siempre viva1",1600,"Castelar1","Buenos Aires",false,true);
		Contacto contacto3 = new Contacto("Lezi","LopaPO",1123223451,"sabroso3@gmail.com","Siempre viva2",2500,"Castelar2","Buenos Aires",false,false);
		Contacto contacto4 = new Contacto("Lele","Lopez",1123718232,"sabroso4@gmail.com","Siempre viva3",1300,"Castelar3","Buenos Aires",false,true);
	
		
		plantilla.agregarContacto(contacto1);
		plantilla.agregarContacto(contacto2);
		plantilla.agregarContacto(contacto3);
		plantilla.agregarContacto(contacto4);
		
		
		Contacto candidato = operador.buscarAlCandidato(plantilla);
		
		System.out.println("Nombre: "+candidato.getNombre()+"\nApellido: "+candidato.getApellido()+"\nCelular: "+candidato.getCelular());
		
		Assert.assertTrue(candidato.getEsCliente()==false && candidato.getSerLlamado() == true && (candidato.getCodigoPostal() > 1200 && candidato.getCodigoPostal()<1800));
	
	
	}

}
