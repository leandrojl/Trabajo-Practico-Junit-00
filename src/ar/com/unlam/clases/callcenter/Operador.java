package ar.com.unlam.clases.callcenter;

public class Operador {

	public void realizarLlamada() {
		
		
	}

	public void realizarLlamada(Contacto contacto) {
		
		contacto.cambiarEstadoDeLlamado();
		
	}

	public Contacto buscarAlCandidato(Plantilla plantilla) {
		
		Contacto candidato = plantilla.obtenerCandidato();
		
		return candidato;
	}

	public Boolean llamadaExitosa(Contacto candidato) {
		
		if(candidato.getEsCliente()) {
			return true;
		}
		
		return false;
	}

	public void cambiarEstadoDelClienteDeSerLlamado(Contacto candidato, String string) {
		if(string.equals("No ser llamado")) {
			candidato.setSerLlamado(false);
		}else if(string.equals("Ser llamado")){
			candidato.setSerLlamado(true);
		}
		
	}

	public void cambiarEstadoDelClienteDelCandidato(Contacto candidato, String string) {
		if(string.equals("No ser cliente")) {
			candidato.setEsCliente(false);
		}else if(string.equals("Ser cliente")){
			candidato.setEsCliente(true);
		}
		
	}

}
